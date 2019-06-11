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
 * SourceKinesis
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-11T18:52:18.700Z")
public class SourceKinesis {
  @SerializedName("stream_name")
  private String streamName = null;

  @SerializedName("aws_region")
  private String awsRegion = null;

  public SourceKinesis streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

   /**
   * name of kinesis stream
   * @return streamName
  **/
  @ApiModelProperty(example = "click_stream", required = true, value = "name of kinesis stream")
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  public SourceKinesis awsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

   /**
   * AWS region name of Kinesis stream, by default us-west-2 is used
   * @return awsRegion
  **/
  @ApiModelProperty(example = "us-east-2", value = "AWS region name of Kinesis stream, by default us-west-2 is used")
  public String getAwsRegion() {
    return awsRegion;
  }

  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceKinesis sourceKinesis = (SourceKinesis) o;
    return Objects.equals(this.streamName, sourceKinesis.streamName) &&
        Objects.equals(this.awsRegion, sourceKinesis.awsRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamName, awsRegion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceKinesis {\n");
    
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
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

