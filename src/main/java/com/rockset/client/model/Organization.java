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
 * An organization in Rockset is a container for users and collections.
 */
@ApiModel(description = "An organization in Rockset is a container for users and collections.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-27T22:21:17.757Z")
public class Organization {
  @SerializedName("name")
  private String name = null;

  @SerializedName("inputRateLimitMbs")
  private Long inputRateLimitMbs = null;

  @SerializedName("sizeLimitGb")
  private Long sizeLimitGb = null;

  public Organization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the organization
   * @return name
  **/
  @ApiModelProperty(example = "rockset", required = true, value = "name of the organization")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization inputRateLimitMbs(Long inputRateLimitMbs) {
    this.inputRateLimitMbs = inputRateLimitMbs;
    return this;
  }

   /**
   * Get inputRateLimitMbs
   * @return inputRateLimitMbs
  **/
  @ApiModelProperty(value = "")
  public Long getInputRateLimitMbs() {
    return inputRateLimitMbs;
  }

  public void setInputRateLimitMbs(Long inputRateLimitMbs) {
    this.inputRateLimitMbs = inputRateLimitMbs;
  }

  public Organization sizeLimitGb(Long sizeLimitGb) {
    this.sizeLimitGb = sizeLimitGb;
    return this;
  }

   /**
   * Get sizeLimitGb
   * @return sizeLimitGb
  **/
  @ApiModelProperty(value = "")
  public Long getSizeLimitGb() {
    return sizeLimitGb;
  }

  public void setSizeLimitGb(Long sizeLimitGb) {
    this.sizeLimitGb = sizeLimitGb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.name, organization.name) &&
        Objects.equals(this.inputRateLimitMbs, organization.inputRateLimitMbs) &&
        Objects.equals(this.sizeLimitGb, organization.sizeLimitGb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inputRateLimitMbs, sizeLimitGb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inputRateLimitMbs: ").append(toIndentedString(inputRateLimitMbs)).append("\n");
    sb.append("    sizeLimitGb: ").append(toIndentedString(sizeLimitGb)).append("\n");
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
