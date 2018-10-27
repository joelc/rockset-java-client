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
import com.rockset.client.model.FieldMaskMask;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FieldMask
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-27T22:21:17.757Z")
public class FieldMask {
  @SerializedName("input_path")
  private List<String> inputPath = new ArrayList<String>();

  @SerializedName("mask")
  private FieldMaskMask mask = null;

  public FieldMask inputPath(List<String> inputPath) {
    this.inputPath = inputPath;
    return this;
  }

  public FieldMask addInputPathItem(String inputPathItem) {
    this.inputPath.add(inputPathItem);
    return this;
  }

   /**
   * Get inputPath
   * @return inputPath
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getInputPath() {
    return inputPath;
  }

  public void setInputPath(List<String> inputPath) {
    this.inputPath = inputPath;
  }

  public FieldMask mask(FieldMaskMask mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @ApiModelProperty(value = "")
  public FieldMaskMask getMask() {
    return mask;
  }

  public void setMask(FieldMaskMask mask) {
    this.mask = mask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMask fieldMask = (FieldMask) o;
    return Objects.equals(this.inputPath, fieldMask.inputPath) &&
        Objects.equals(this.mask, fieldMask.mask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputPath, mask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMask {\n");
    
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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
