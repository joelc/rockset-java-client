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
import com.rockset.client.model.InputField;
import com.rockset.client.model.OutputField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldMappingV2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-16T12:14:16.934-04:00")
public class FieldMappingV2 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("is_drop_all_fields")
  private Boolean isDropAllFields = null;

  @SerializedName("input_fields")
  private List<InputField> inputFields = null;

  @SerializedName("output_field")
  private OutputField outputField = null;

  public FieldMappingV2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user specified string that is a name for this mapping
   * @return name
  **/

@JsonProperty("name")
@ApiModelProperty(example = "myTestMapping", value = "A user specified string that is a name for this mapping")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldMappingV2 isDropAllFields(Boolean isDropAllFields) {
    this.isDropAllFields = isDropAllFields;
    return this;
  }

   /**
   * A boolean that determines whether to drop all fields in this document. If set, input and output fields should not be set
   * @return isDropAllFields
  **/

@JsonProperty("is_drop_all_fields")
@ApiModelProperty(example = "true", value = "A boolean that determines whether to drop all fields in this document. If set, input and output fields should not be set")
  public Boolean isIsDropAllFields() {
    return isDropAllFields;
  }

  public void setIsDropAllFields(Boolean isDropAllFields) {
    this.isDropAllFields = isDropAllFields;
  }

  public FieldMappingV2 inputFields(List<InputField> inputFields) {
    this.inputFields = inputFields;
    return this;
  }

  public FieldMappingV2 addInputFieldsItem(InputField inputFieldsItem) {
    if (this.inputFields == null) {
      this.inputFields = new ArrayList<InputField>();
    }
    this.inputFields.add(inputFieldsItem);
    return this;
  }

   /**
   * A List of InputField for this mapping
   * @return inputFields
  **/

@JsonProperty("input_fields")
@ApiModelProperty(value = "A List of InputField for this mapping")
  public List<InputField> getInputFields() {
    return inputFields;
  }

  public void setInputFields(List<InputField> inputFields) {
    this.inputFields = inputFields;
  }

  public FieldMappingV2 outputField(OutputField outputField) {
    this.outputField = outputField;
    return this;
  }

   /**
   * An OutputField for this mapping
   * @return outputField
  **/

@JsonProperty("output_field")
@ApiModelProperty(value = "An OutputField for this mapping")
  public OutputField getOutputField() {
    return outputField;
  }

  public void setOutputField(OutputField outputField) {
    this.outputField = outputField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMappingV2 fieldMappingV2 = (FieldMappingV2) o;
    return Objects.equals(this.name, fieldMappingV2.name) &&
        Objects.equals(this.isDropAllFields, fieldMappingV2.isDropAllFields) &&
        Objects.equals(this.inputFields, fieldMappingV2.inputFields) &&
        Objects.equals(this.outputField, fieldMappingV2.outputField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isDropAllFields, inputFields, outputField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMappingV2 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDropAllFields: ").append(toIndentedString(isDropAllFields)).append("\n");
    sb.append("    inputFields: ").append(toIndentedString(inputFields)).append("\n");
    sb.append("    outputField: ").append(toIndentedString(outputField)).append("\n");
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

