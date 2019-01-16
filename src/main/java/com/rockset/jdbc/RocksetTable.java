package com.rockset.jdbc;

import static java.util.Objects.requireNonNull;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.rockset.client.model.QueryResponse;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RocksetTable {

  private String tableName;
  private QueryResponse response;
  private RocksetResultSet describe;
  private ResultSetMetaData describeMeta;
  final ObjectMapper mapper;

  // column index to retriece type information in describe results
  final int fieldNameIndex = 1;
  final int fieldTypeIndex = 2;

  public RocksetTable(String tableNamePattern, QueryResponse response) throws SQLException {
    this.tableName = requireNonNull(tableNamePattern, "tableName is null");
    this.response = requireNonNull(response, "tableName is null");
    this.mapper = new ObjectMapper();
    dump(response);

    // convert the response into a ResultSet with four columns
    ArrayList<Column> incol = new ArrayList<Column>();
    incol.add(new Column("field", Column.ColumnTypes.ARRAY));
    incol.add(new Column("type", Column.ColumnTypes.STRING));
    incol.add(new Column("occurrences", Column.ColumnTypes.NUMBER));
    incol.add(new Column("total", Column.ColumnTypes.NUMBER));
    this.describe = new RocksetResultSet(incol, response.getResults());
    this.describeMeta = this.describe.getMetaData();
  }

  //
  // Returns the columns for this table and their associated types
  // SELECT TABLE_CAT, TABLE_SCHEM, TABLE_NAME, COLUMN_NAME, DATA_TYPE,
  // TYPE_NAME, COLUMN_SIZE, BUFFER_LENGTH, DECIMAL_DIGITS, NUM_PREC_RADIX,
  // NULLABLE, REMARKS, COLUMN_DEF, SQL_DATA_TYPE, SQL_DATETIME_SUB,
  // CHAR_OCTET_LENGTH, ORDINAL_POSITION, IS_NULLABLE,
  // SCOPE_CATALOG, SCOPE_SCHEMA, SCOPE_TABLE,
  // SOURCE_DATA_TYPE, IS_AUTOINCREMENT, IS_GENERATEDCOLUMN
  //
  public ResultSet getColumns() throws Exception {
    Column col1 = new Column("TABLE_CAT", Column.ColumnTypes.STRING);
    Column col2 = new Column("TABLE_SCHEM", Column.ColumnTypes.STRING);
    Column col3 = new Column("TABLE_NAME", Column.ColumnTypes.STRING);
    Column col4 = new Column("COLUMN_NAME", Column.ColumnTypes.STRING);
    Column col5 = new Column("DATA_TYPE", Column.ColumnTypes.STRING);
    Column col6 = new Column("TYPE_NAME", Column.ColumnTypes.STRING);
    Column col7 = new Column("COLUMN_SIZE", Column.ColumnTypes.NUMBER);
    Column col8 = new Column("BUFFER_LENGTH", Column.ColumnTypes.STRING);
    Column col9 = new Column("DECIMAL_DIGITS", Column.ColumnTypes.NUMBER);
    Column col10 = new Column("NUM_PREC_RADIX", Column.ColumnTypes.NUMBER);
    Column col11 = new Column("NULLABLE", Column.ColumnTypes.STRING);
    Column col12 = new Column("REMARKS", Column.ColumnTypes.STRING);
    Column col13 = new Column("COLUMN_DEF", Column.ColumnTypes.STRING);
    Column col14 = new Column("SQL_DATA_TYPE", Column.ColumnTypes.NUMBER);
    Column col15 = new Column("SQL_DATETIME_SUB", Column.ColumnTypes.NUMBER);
    Column col16 = new Column("CHAR_OCTET_LENGTH", Column.ColumnTypes.NUMBER);
    Column col17 = new Column("ORDINAL_POSITION", Column.ColumnTypes.NUMBER);
    Column col18 = new Column("IS_NULLABLE", Column.ColumnTypes.STRING);
    Column col19 = new Column("SCOPE_CATALOG", Column.ColumnTypes.STRING);
    Column col20 = new Column("SCOPE_SCHEMA", Column.ColumnTypes.STRING);
    Column col21 = new Column("SCOPE_TABLE", Column.ColumnTypes.STRING);
    Column col22 = new Column("SOURCE_DATA_TYPE", Column.ColumnTypes.NUMBER);
    Column col23 = new Column("IS_AUTOINCREMENT", Column.ColumnTypes.STRING);
    Column col24 = new Column("IS_GENERATEDCOLUMN", Column.ColumnTypes.STRING);

    ArrayList<Column> columns = new ArrayList<Column>();
    columns.add(col1);
    columns.add(col2);
    columns.add(col3);
    columns.add(col4);
    columns.add(col5);
    columns.add(col6);
    columns.add(col7);
    columns.add(col8);
    columns.add(col9);
    columns.add(col10);
    columns.add(col11);
    columns.add(col12);
    columns.add(col13);
    columns.add(col14);
    columns.add(col15);
    columns.add(col16);
    columns.add(col17);
    columns.add(col18);
    columns.add(col19);
    columns.add(col20);
    columns.add(col21);
    columns.add(col22);
    columns.add(col23);
    columns.add(col24);

    // A cache of all array names found so far
    Map<String, RocksetArray> arrayAndObjectFields = new HashMap<String, RocksetArray>();

    // each row refers to a single column
    List<Object> data = new ArrayList<Object>();

    while (describe.next()) {
      // The "field" tag has to be an array.
      RocksetArray arr = (RocksetArray)describe.getObject("field");

      JsonNode[] nodes = (JsonNode[])arr.getArray(1, 1);
      String fieldName = nodes[0].asText();

      // If this is not a top-level field for an array, then ignore it
      if (arr.size() > 1 && arrayAndObjectFields.containsKey(fieldName)) {
        continue;
      }

      // Is any of the field a wildcard, which means that it is an array
      // then skip it.
      boolean foundWildcard = false;
      for (int i = 1; i < nodes.length; i++) {
        JsonNode n = nodes[i];
        if (n.asText().equals("*")) {
          foundWildcard = true;
          break;
        }
        fieldName = String.format("%s.%s", fieldName, n.asText());
        System.err.println("X1 " + fieldName);
      }
      if (foundWildcard) {
        continue;
      }

      // At this point, it is either a simple field or a nested field
      // with no arrays. Or it is the top-level array name.

      // Read the rockset type from the response. It can be one of
      // "int", "string", object", "array"
      String rockType = ((JsonNode)describe.getObject("type")).asText();
      int sqlType = java.sql.Types.OTHER;
      String sqlTypeName = "";

      // map rockset types as defined in 
      // https://github.com/rockset/rs/blob/master/cpp/compiler/util/types.cc#L11
      if (rockType.equals("array")) {
        arrayAndObjectFields.put(fieldName, arr);
        sqlType = java.sql.Types.ARRAY;
        sqlTypeName = "array";
      } else if (rockType.equals("int")) {
        sqlType = java.sql.Types.BIGINT;
        sqlTypeName = "bigint";
      } else if (rockType.equals("string")) {
        sqlType = java.sql.Types.VARCHAR;
        sqlTypeName = "varchar";
      } else if (rockType.equals("object")) {
        arrayAndObjectFields.put(fieldName, arr);
        sqlType = java.sql.Types.JAVA_OBJECT;
        sqlTypeName = "object";
      } else if (rockType.equals("float")) {
        sqlType = java.sql.Types.DOUBLE;
        sqlTypeName = "double";
      } else if (rockType.equals("bool")) {
        sqlType = java.sql.Types.BOOLEAN;
        sqlTypeName = "boolean";
      } else if (rockType.equals("bytes")) {
        sqlType = java.sql.Types.BINARY;
        sqlTypeName = "binary";
      } else if (rockType.equals("date")) {
        sqlType = Types.DATE;
        sqlTypeName = "date";
      } else if (rockType.equals("datetime")) {
        // No sql type DATETIME
        sqlType = Types.DATE;
        sqlTypeName = "datetime";
      } else if (rockType.equals("time")) {
        sqlType = Types.TIME;
        sqlTypeName = "time";
      } else if (rockType.equals("timestamp")) {
        sqlType = Types.TIMESTAMP;
        sqlTypeName = "timestamp";
      } else {
        throw new Exception("Unknown rockset type " + rockType);
      }

      String str = "{\"TABLE_CAT\": \"" + RocksetConnection.DEFAULT_CATALOG + "\""
                    + ", \"TABLE_SCHEM\": \"" + RocksetConnection.DEFAULT_SCHEMA + "\""
                    + ", \"TABLE_NAME\": \"" + tableName  + "\"";
      str += ", \"COLUMN_NAME\": \"" + fieldName  + "\"";
      str += ", \"DATA_TYPE\": \"" + sqlType  + "\"";
      str += ", \"TYPE_NAME\": \"" + sqlTypeName  + "\"";
      str += " }";
      JsonNode docRootNode = mapper.readTree(str);
      data.add(docRootNode);
    }
    return new RocksetResultSet(columns, data);
  }

  private void dump(QueryResponse resp) {
    try {
      List<Object> results = resp.getResults();
      int i = 0;
      for (Object onerow: results) {
        System.err.println(String.format("[%d] %s", i, mapper.writeValueAsString(onerow)));
        i++;
      }
    } catch (Exception e) {
      System.err.println("Error in dump " + e.getMessage());
    }
  }
}