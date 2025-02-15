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
import com.rockset.client.model.PaginationInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryPaginationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-16T12:14:16.934-04:00")
public class QueryPaginationResponse {
  @SerializedName("results")
  private List<Object> results = null;

  @SerializedName("results_total_doc_count")
  private Long resultsTotalDocCount = null;

  @SerializedName("pagination")
  private PaginationInfo pagination = null;

  public QueryPaginationResponse results(List<Object> results) {
    this.results = results;
    return this;
  }

  public QueryPaginationResponse addResultsItem(Object resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Object>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * List of documents returned by the query
   * @return results
  **/

@JsonProperty("results")
@ApiModelProperty(value = "List of documents returned by the query")
  public List<Object> getResults() {
    return results;
  }

  public void setResults(List<Object> results) {
    this.results = results;
  }

  public QueryPaginationResponse resultsTotalDocCount(Long resultsTotalDocCount) {
    this.resultsTotalDocCount = resultsTotalDocCount;
    return this;
  }

   /**
   * Total documents returned by the query
   * @return resultsTotalDocCount
  **/

@JsonProperty("results_total_doc_count")
@ApiModelProperty(value = "Total documents returned by the query")
  public Long getResultsTotalDocCount() {
    return resultsTotalDocCount;
  }

  public void setResultsTotalDocCount(Long resultsTotalDocCount) {
    this.resultsTotalDocCount = resultsTotalDocCount;
  }

  public QueryPaginationResponse pagination(PaginationInfo pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Pagination metadata
   * @return pagination
  **/

@JsonProperty("pagination")
@ApiModelProperty(value = "Pagination metadata")
  public PaginationInfo getPagination() {
    return pagination;
  }

  public void setPagination(PaginationInfo pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryPaginationResponse queryPaginationResponse = (QueryPaginationResponse) o;
    return Objects.equals(this.results, queryPaginationResponse.results) &&
        Objects.equals(this.resultsTotalDocCount, queryPaginationResponse.resultsTotalDocCount) &&
        Objects.equals(this.pagination, queryPaginationResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, resultsTotalDocCount, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryPaginationResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    resultsTotalDocCount: ").append(toIndentedString(resultsTotalDocCount)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

