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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GcpServiceAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-16T12:14:16.934-04:00")
public class GcpServiceAccount {
  @SerializedName("service_account_key_file_json")
  private String serviceAccountKeyFileJson = null;

  public GcpServiceAccount serviceAccountKeyFileJson(String serviceAccountKeyFileJson) {
    this.serviceAccountKeyFileJson = serviceAccountKeyFileJson;
    return this;
  }

   /**
   * Contents of JSON Service Account key file
   * @return serviceAccountKeyFileJson
  **/

@JsonProperty("service_account_key_file_json")
@ApiModelProperty(required = true, value = "Contents of JSON Service Account key file")
  public String getServiceAccountKeyFileJson() {
    return serviceAccountKeyFileJson;
  }

  public void setServiceAccountKeyFileJson(String serviceAccountKeyFileJson) {
    this.serviceAccountKeyFileJson = serviceAccountKeyFileJson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcpServiceAccount gcpServiceAccount = (GcpServiceAccount) o;
    return Objects.equals(this.serviceAccountKeyFileJson, gcpServiceAccount.serviceAccountKeyFileJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountKeyFileJson);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcpServiceAccount {\n");
    
    sb.append("    serviceAccountKeyFileJson: ").append(toIndentedString(serviceAccountKeyFileJson)).append("\n");
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

