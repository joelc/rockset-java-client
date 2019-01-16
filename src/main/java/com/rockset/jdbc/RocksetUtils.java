package com.rockset.jdbc;

import java.sql.Types;

class RocksetUtils {

  //
  // convert a JSonNodeType to Sql Type
  //
  static int jsonToSqlType(Column.ColumnTypes type) {
    int stype = java.sql.Types.OTHER;

    switch (type) {
      case ARRAY: 
        stype = java.sql.Types.ARRAY;
        break;
      case BINARY: 
        stype = java.sql.Types.BINARY;
        break;
      case BOOLEAN: 
        stype = java.sql.Types.BOOLEAN;
        break;
      case MISSING: 
      case NULL:
        stype = java.sql.Types.NULL;
        break;
      case NUMBER: 
        stype = java.sql.Types.BIGINT;
        break;
      case OBJECT: 
      case POJO: 
        stype = java.sql.Types.JAVA_OBJECT;
        break;
      case STRING: 
        stype = java.sql.Types.VARCHAR;
        break;
      case TIMESTAMP:
        stype = Types.TIMESTAMP;
        break;
      case DATETIME:
        stype = Types.DATE;
        break;
      case TIME:
        stype = Types.TIME;
        break;
      case DATE:
        stype = Types.DATE;
        break;
      default:
        break;
    }
    return stype;
  }

  static String jsonToSqlTypeName(Column.ColumnTypes type) {
    String stype = "other";
    switch (type) {
      case ARRAY: 
        stype = "array";
        break;
      case BINARY: 
        stype = "binary";
        break;
      case BOOLEAN: 
        stype = "boolean";
        break;
      case MISSING: 
      case NULL:
        stype = "null";
        break;
      case NUMBER: 
        stype = "bigint";
        break;
      case OBJECT: 
      case POJO: 
        stype = "object";
        break;
      case STRING: 
        stype = "varchar";
        break;
      case DATE:
        stype = "date";
        break;
      case TIME:
        stype = "time";
        break;
      case DATETIME:
        stype = "datetime";
        break;
      case TIMESTAMP:
        stype = "timestamp";
        break;
      default:
        break;
    }
    return stype;
  }
}
