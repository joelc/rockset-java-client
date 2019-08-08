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
import com.rockset.client.model.AwsAccessKey;
import com.rockset.client.model.AwsRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * S3Integration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-17T23:04:08.108Z")
public class S3Integration {
  @SerializedName("aws_role")
  private AwsRole awsRole = null;

  @SerializedName("aws_access_key")
  private AwsAccessKey awsAccessKey = null;

  public S3Integration awsRole(AwsRole awsRole) {
    this.awsRole = awsRole;
    return this;
  }

   /**
   * details of an AWS cross-account role integration
   * @return awsRole
  **/

@JsonProperty("aws_role")
@ApiModelProperty(value = "details of an AWS cross-account role integration")
  public AwsRole getAwsRole() {
    return awsRole;
  }

  public void setAwsRole(AwsRole awsRole) {
    this.awsRole = awsRole;
  }

  public S3Integration awsAccessKey(AwsAccessKey awsAccessKey) {
    this.awsAccessKey = awsAccessKey;
    return this;
  }

   /**
   * credentials for an AWS access key integration
   * @return awsAccessKey
  **/

@JsonProperty("aws_access_key")
@ApiModelProperty(value = "credentials for an AWS access key integration")
  public AwsAccessKey getAwsAccessKey() {
    return awsAccessKey;
  }

  public void setAwsAccessKey(AwsAccessKey awsAccessKey) {
    this.awsAccessKey = awsAccessKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Integration s3Integration = (S3Integration) o;
    return Objects.equals(this.awsRole, s3Integration.awsRole) &&
        Objects.equals(this.awsAccessKey, s3Integration.awsAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsRole, awsAccessKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Integration {\n");
    
    sb.append("    awsRole: ").append(toIndentedString(awsRole)).append("\n");
    sb.append("    awsAccessKey: ").append(toIndentedString(awsAccessKey)).append("\n");
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
