/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockset.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.rockset.client.model.OperatorStats;
import com.rockset.client.model.RpcSinkStats;
import com.rockset.client.model.RpcSourceStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-15T10:38:36.284-04:00")
public class QueryStats {
  @SerializedName("elapsed_time_ms")
  private Long elapsedTimeMs = null;

  @SerializedName("rows_scanned")
  private Long rowsScanned = null;

  @SerializedName("rows_returned")
  private Long rowsReturned = null;

  @SerializedName("operators")
  private List<OperatorStats> operators = null;

  @SerializedName("exchange_sources")
  private List<RpcSourceStats> exchangeSources = null;

  @SerializedName("exchange_sinks")
  private List<RpcSinkStats> exchangeSinks = null;

  @SerializedName("execution_graph")
  private String executionGraph = null;

  @SerializedName("execution_plan")
  private String executionPlan = null;

  @SerializedName("operator_metadata")
  private String operatorMetadata = null;

  @SerializedName("query_text")
  private String queryText = null;

  public QueryStats elapsedTimeMs(Long elapsedTimeMs) {
    this.elapsedTimeMs = elapsedTimeMs;
    return this;
  }

   /**
   * query time in milliseconds
   * @return elapsedTimeMs
  **/

@JsonProperty("elapsed_time_ms")
@ApiModelProperty(example = "126", value = "query time in milliseconds")
  public Long getElapsedTimeMs() {
    return elapsedTimeMs;
  }

  public void setElapsedTimeMs(Long elapsedTimeMs) {
    this.elapsedTimeMs = elapsedTimeMs;
  }

  public QueryStats rowsScanned(Long rowsScanned) {
    this.rowsScanned = rowsScanned;
    return this;
  }

   /**
   * rows scanned as part of query execution
   * @return rowsScanned
  **/

@JsonProperty("rows_scanned")
@ApiModelProperty(example = "25000", value = "rows scanned as part of query execution")
  public Long getRowsScanned() {
    return rowsScanned;
  }

  public void setRowsScanned(Long rowsScanned) {
    this.rowsScanned = rowsScanned;
  }

  public QueryStats rowsReturned(Long rowsReturned) {
    this.rowsReturned = rowsReturned;
    return this;
  }

   /**
   * number of rows returned from the query
   * @return rowsReturned
  **/

@JsonProperty("rows_returned")
@ApiModelProperty(example = "100", value = "number of rows returned from the query")
  public Long getRowsReturned() {
    return rowsReturned;
  }

  public void setRowsReturned(Long rowsReturned) {
    this.rowsReturned = rowsReturned;
  }

  public QueryStats operators(List<OperatorStats> operators) {
    this.operators = operators;
    return this;
  }

  public QueryStats addOperatorsItem(OperatorStats operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<OperatorStats>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * Statistics for each operator from query execution
   * @return operators
  **/

@JsonProperty("operators")
@ApiModelProperty(value = "Statistics for each operator from query execution")
  public List<OperatorStats> getOperators() {
    return operators;
  }

  public void setOperators(List<OperatorStats> operators) {
    this.operators = operators;
  }

  public QueryStats exchangeSources(List<RpcSourceStats> exchangeSources) {
    this.exchangeSources = exchangeSources;
    return this;
  }

  public QueryStats addExchangeSourcesItem(RpcSourceStats exchangeSourcesItem) {
    if (this.exchangeSources == null) {
      this.exchangeSources = new ArrayList<RpcSourceStats>();
    }
    this.exchangeSources.add(exchangeSourcesItem);
    return this;
  }

   /**
   * Statistics for each exchange source from query execution
   * @return exchangeSources
  **/

@JsonProperty("exchange_sources")
@ApiModelProperty(value = "Statistics for each exchange source from query execution")
  public List<RpcSourceStats> getExchangeSources() {
    return exchangeSources;
  }

  public void setExchangeSources(List<RpcSourceStats> exchangeSources) {
    this.exchangeSources = exchangeSources;
  }

  public QueryStats exchangeSinks(List<RpcSinkStats> exchangeSinks) {
    this.exchangeSinks = exchangeSinks;
    return this;
  }

  public QueryStats addExchangeSinksItem(RpcSinkStats exchangeSinksItem) {
    if (this.exchangeSinks == null) {
      this.exchangeSinks = new ArrayList<RpcSinkStats>();
    }
    this.exchangeSinks.add(exchangeSinksItem);
    return this;
  }

   /**
   * Statistics for each exchange sink from query execution
   * @return exchangeSinks
  **/

@JsonProperty("exchange_sinks")
@ApiModelProperty(value = "Statistics for each exchange sink from query execution")
  public List<RpcSinkStats> getExchangeSinks() {
    return exchangeSinks;
  }

  public void setExchangeSinks(List<RpcSinkStats> exchangeSinks) {
    this.exchangeSinks = exchangeSinks;
  }

  public QueryStats executionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
    return this;
  }

   /**
   * DOT graph representing the execution steps of this query
   * @return executionGraph
  **/

@JsonProperty("execution_graph")
@ApiModelProperty(value = "DOT graph representing the execution steps of this query")
  public String getExecutionGraph() {
    return executionGraph;
  }

  public void setExecutionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
  }

  public QueryStats executionPlan(String executionPlan) {
    this.executionPlan = executionPlan;
    return this;
  }

   /**
   * Execution plan (output of EXPLAIN) of this query
   * @return executionPlan
  **/

@JsonProperty("execution_plan")
@ApiModelProperty(value = "Execution plan (output of EXPLAIN) of this query")
  public String getExecutionPlan() {
    return executionPlan;
  }

  public void setExecutionPlan(String executionPlan) {
    this.executionPlan = executionPlan;
  }

  public QueryStats operatorMetadata(String operatorMetadata) {
    this.operatorMetadata = operatorMetadata;
    return this;
  }

   /**
   * Information about each physical operator, like what fields it is fetching
   * @return operatorMetadata
  **/

@JsonProperty("operator_metadata")
@ApiModelProperty(value = "Information about each physical operator, like what fields it is fetching")
  public String getOperatorMetadata() {
    return operatorMetadata;
  }

  public void setOperatorMetadata(String operatorMetadata) {
    this.operatorMetadata = operatorMetadata;
  }

  public QueryStats queryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

   /**
   * SQL text of Query that was executed
   * @return queryText
  **/

@JsonProperty("query_text")
@ApiModelProperty(value = "SQL text of Query that was executed")
  public String getQueryText() {
    return queryText;
  }

  public void setQueryText(String queryText) {
    this.queryText = queryText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStats queryStats = (QueryStats) o;
    return Objects.equals(this.elapsedTimeMs, queryStats.elapsedTimeMs) &&
        Objects.equals(this.rowsScanned, queryStats.rowsScanned) &&
        Objects.equals(this.rowsReturned, queryStats.rowsReturned) &&
        Objects.equals(this.operators, queryStats.operators) &&
        Objects.equals(this.exchangeSources, queryStats.exchangeSources) &&
        Objects.equals(this.exchangeSinks, queryStats.exchangeSinks) &&
        Objects.equals(this.executionGraph, queryStats.executionGraph) &&
        Objects.equals(this.executionPlan, queryStats.executionPlan) &&
        Objects.equals(this.operatorMetadata, queryStats.operatorMetadata) &&
        Objects.equals(this.queryText, queryStats.queryText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsedTimeMs, rowsScanned, rowsReturned, operators, exchangeSources, exchangeSinks, executionGraph, executionPlan, operatorMetadata, queryText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryStats {\n");
    
    sb.append("    elapsedTimeMs: ").append(toIndentedString(elapsedTimeMs)).append("\n");
    sb.append("    rowsScanned: ").append(toIndentedString(rowsScanned)).append("\n");
    sb.append("    rowsReturned: ").append(toIndentedString(rowsReturned)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    exchangeSources: ").append(toIndentedString(exchangeSources)).append("\n");
    sb.append("    exchangeSinks: ").append(toIndentedString(exchangeSinks)).append("\n");
    sb.append("    executionGraph: ").append(toIndentedString(executionGraph)).append("\n");
    sb.append("    executionPlan: ").append(toIndentedString(executionPlan)).append("\n");
    sb.append("    operatorMetadata: ").append(toIndentedString(operatorMetadata)).append("\n");
    sb.append("    queryText: ").append(toIndentedString(queryText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
