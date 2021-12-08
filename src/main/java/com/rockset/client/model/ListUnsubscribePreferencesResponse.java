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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ListUnsubscribePreferencesResponse */
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.JavaClientCodegen",
    date = "2021-12-09T15:56:21.038-08:00")
public class ListUnsubscribePreferencesResponse {
  @SerializedName("data")
  private List<UnsubscribePreference> data = null;

  public ListUnsubscribePreferencesResponse data(List<UnsubscribePreference> data) {
    this.data = data;
    return this;
  }

  public ListUnsubscribePreferencesResponse addDataItem(UnsubscribePreference dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<UnsubscribePreference>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of notification preferences
   *
   * @return data
   */
  @JsonProperty("data")
  @ApiModelProperty(value = "List of notification preferences")
  public List<UnsubscribePreference> getData() {
    return data;
  }

  public void setData(List<UnsubscribePreference> data) {
    this.data = data;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnsubscribePreferencesResponse listUnsubscribePreferencesResponse =
        (ListUnsubscribePreferencesResponse) o;
    return Objects.equals(this.data, listUnsubscribePreferencesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnsubscribePreferencesResponse {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}