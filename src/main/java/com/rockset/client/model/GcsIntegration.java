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
import com.rockset.client.model.GcpServiceAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GcsIntegration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-16T12:14:16.934-04:00")
public class GcsIntegration {
  @SerializedName("gcp_service_account")
  private GcpServiceAccount gcpServiceAccount = null;

  public GcsIntegration gcpServiceAccount(GcpServiceAccount gcpServiceAccount) {
    this.gcpServiceAccount = gcpServiceAccount;
    return this;
  }

   /**
   * credentials for an AWS key integration
   * @return gcpServiceAccount
  **/

@JsonProperty("gcp_service_account")
@ApiModelProperty(value = "credentials for an AWS key integration")
  public GcpServiceAccount getGcpServiceAccount() {
    return gcpServiceAccount;
  }

  public void setGcpServiceAccount(GcpServiceAccount gcpServiceAccount) {
    this.gcpServiceAccount = gcpServiceAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcsIntegration gcsIntegration = (GcsIntegration) o;
    return Objects.equals(this.gcpServiceAccount, gcsIntegration.gcpServiceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpServiceAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcsIntegration {\n");
    
    sb.append("    gcpServiceAccount: ").append(toIndentedString(gcpServiceAccount)).append("\n");
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

