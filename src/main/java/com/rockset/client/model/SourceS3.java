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

/**
 * SourceS3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-11T18:52:18.700Z")
public class SourceS3 {
  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("bucket")
  private String bucket = null;

  public SourceS3 prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix that selects keys to ingest.
   * @return prefix
  **/
  @ApiModelProperty(example = "prefix/to/keys", value = "Prefix that selects keys to ingest.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public SourceS3 pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Pattern that selects keys to ingest.
   * @return pattern
  **/
  @ApiModelProperty(example = "prefix/to/_**_/keys/_*.format", value = "Pattern that selects keys to ingest.")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public SourceS3 bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * address of S3 bucket containing data
   * @return bucket
  **/
  @ApiModelProperty(example = "s3://customer-account-info", required = true, value = "address of S3 bucket containing data")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceS3 sourceS3 = (SourceS3) o;
    return Objects.equals(this.prefix, sourceS3.prefix) &&
        Objects.equals(this.pattern, sourceS3.pattern) &&
        Objects.equals(this.bucket, sourceS3.bucket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, pattern, bucket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceS3 {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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

