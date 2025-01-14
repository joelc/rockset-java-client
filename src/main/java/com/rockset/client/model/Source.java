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
import com.rockset.client.model.FormatParams;
import com.rockset.client.model.SourceAzureBlobStorage;
import com.rockset.client.model.SourceAzureEventHubs;
import com.rockset.client.model.SourceAzureServiceBus;
import com.rockset.client.model.SourceDynamoDb;
import com.rockset.client.model.SourceFileUpload;
import com.rockset.client.model.SourceGcs;
import com.rockset.client.model.SourceKafka;
import com.rockset.client.model.SourceKinesis;
import com.rockset.client.model.SourceMongoDb;
import com.rockset.client.model.SourceS3;
import com.rockset.client.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about the data source for the given collection. Only one of the following fields are allowed to be defined. Only collections can act as data sources for views. 
 */

@ApiModel(description = "Details about the data source for the given collection. Only one of the following fields are allowed to be defined. Only collections can act as data sources for views. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-16T12:14:16.934-04:00")
public class Source {
  @SerializedName("integration_name")
  private String integrationName = null;

  @SerializedName("s3")
  private SourceS3 s3 = null;

  @SerializedName("kinesis")
  private SourceKinesis kinesis = null;

  @SerializedName("gcs")
  private SourceGcs gcs = null;

  @SerializedName("azure_blob_storage")
  private SourceAzureBlobStorage azureBlobStorage = null;

  @SerializedName("azure_service_bus")
  private SourceAzureServiceBus azureServiceBus = null;

  @SerializedName("azure_event_hubs")
  private SourceAzureEventHubs azureEventHubs = null;

  @SerializedName("dynamodb")
  private SourceDynamoDb dynamodb = null;

  @SerializedName("file_upload")
  private SourceFileUpload fileUpload = null;

  @SerializedName("kafka")
  private SourceKafka kafka = null;

  @SerializedName("mongodb")
  private SourceMongoDb mongodb = null;

  @SerializedName("status")
  private Status status = null;

  @SerializedName("format_params")
  private FormatParams formatParams = null;

  public Source integrationName(String integrationName) {
    this.integrationName = integrationName;
    return this;
  }

   /**
   * name of integration to use
   * @return integrationName
  **/

@JsonProperty("integration_name")
@ApiModelProperty(example = "aws-integration", required = true, value = "name of integration to use")
  public String getIntegrationName() {
    return integrationName;
  }

  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
  }

  public Source s3(SourceS3 s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * configuration for ingestion from S3
   * @return s3
  **/

@JsonProperty("s3")
@ApiModelProperty(value = "configuration for ingestion from S3")
  public SourceS3 getS3() {
    return s3;
  }

  public void setS3(SourceS3 s3) {
    this.s3 = s3;
  }

  public Source kinesis(SourceKinesis kinesis) {
    this.kinesis = kinesis;
    return this;
  }

   /**
   * configuration for ingestion from kinesis stream
   * @return kinesis
  **/

@JsonProperty("kinesis")
@ApiModelProperty(value = "configuration for ingestion from kinesis stream")
  public SourceKinesis getKinesis() {
    return kinesis;
  }

  public void setKinesis(SourceKinesis kinesis) {
    this.kinesis = kinesis;
  }

  public Source gcs(SourceGcs gcs) {
    this.gcs = gcs;
    return this;
  }

   /**
   * configuration for ingestion from GCS
   * @return gcs
  **/

@JsonProperty("gcs")
@ApiModelProperty(value = "configuration for ingestion from GCS")
  public SourceGcs getGcs() {
    return gcs;
  }

  public void setGcs(SourceGcs gcs) {
    this.gcs = gcs;
  }

  public Source azureBlobStorage(SourceAzureBlobStorage azureBlobStorage) {
    this.azureBlobStorage = azureBlobStorage;
    return this;
  }

   /**
   * Get azureBlobStorage
   * @return azureBlobStorage
  **/

@JsonProperty("azure_blob_storage")
@ApiModelProperty(value = "")
  public SourceAzureBlobStorage getAzureBlobStorage() {
    return azureBlobStorage;
  }

  public void setAzureBlobStorage(SourceAzureBlobStorage azureBlobStorage) {
    this.azureBlobStorage = azureBlobStorage;
  }

  public Source azureServiceBus(SourceAzureServiceBus azureServiceBus) {
    this.azureServiceBus = azureServiceBus;
    return this;
  }

   /**
   * Get azureServiceBus
   * @return azureServiceBus
  **/

@JsonProperty("azure_service_bus")
@ApiModelProperty(value = "")
  public SourceAzureServiceBus getAzureServiceBus() {
    return azureServiceBus;
  }

  public void setAzureServiceBus(SourceAzureServiceBus azureServiceBus) {
    this.azureServiceBus = azureServiceBus;
  }

  public Source azureEventHubs(SourceAzureEventHubs azureEventHubs) {
    this.azureEventHubs = azureEventHubs;
    return this;
  }

   /**
   * Get azureEventHubs
   * @return azureEventHubs
  **/

@JsonProperty("azure_event_hubs")
@ApiModelProperty(value = "")
  public SourceAzureEventHubs getAzureEventHubs() {
    return azureEventHubs;
  }

  public void setAzureEventHubs(SourceAzureEventHubs azureEventHubs) {
    this.azureEventHubs = azureEventHubs;
  }

  public Source dynamodb(SourceDynamoDb dynamodb) {
    this.dynamodb = dynamodb;
    return this;
  }

   /**
   * configuration for ingestion from  a dynamodb table
   * @return dynamodb
  **/

@JsonProperty("dynamodb")
@ApiModelProperty(value = "configuration for ingestion from  a dynamodb table")
  public SourceDynamoDb getDynamodb() {
    return dynamodb;
  }

  public void setDynamodb(SourceDynamoDb dynamodb) {
    this.dynamodb = dynamodb;
  }

  public Source fileUpload(SourceFileUpload fileUpload) {
    this.fileUpload = fileUpload;
    return this;
  }

   /**
   * file upload details
   * @return fileUpload
  **/

@JsonProperty("file_upload")
@ApiModelProperty(value = "file upload details")
  public SourceFileUpload getFileUpload() {
    return fileUpload;
  }

  public void setFileUpload(SourceFileUpload fileUpload) {
    this.fileUpload = fileUpload;
  }

  public Source kafka(SourceKafka kafka) {
    this.kafka = kafka;
    return this;
  }

   /**
   * kafka collection identifier
   * @return kafka
  **/

@JsonProperty("kafka")
@ApiModelProperty(value = "kafka collection identifier")
  public SourceKafka getKafka() {
    return kafka;
  }

  public void setKafka(SourceKafka kafka) {
    this.kafka = kafka;
  }

  public Source mongodb(SourceMongoDb mongodb) {
    this.mongodb = mongodb;
    return this;
  }

   /**
   * MongoDB collection details
   * @return mongodb
  **/

@JsonProperty("mongodb")
@ApiModelProperty(value = "MongoDB collection details")
  public SourceMongoDb getMongodb() {
    return mongodb;
  }

  public void setMongodb(SourceMongoDb mongodb) {
    this.mongodb = mongodb;
  }

   /**
   * the ingest status of this source
   * @return status
  **/

@JsonProperty("status")
@ApiModelProperty(value = "the ingest status of this source")
  public Status getStatus() {
    return status;
  }

  public Source formatParams(FormatParams formatParams) {
    this.formatParams = formatParams;
    return this;
  }

   /**
   * format parameters for data from this source
   * @return formatParams
  **/

@JsonProperty("format_params")
@ApiModelProperty(value = "format parameters for data from this source")
  public FormatParams getFormatParams() {
    return formatParams;
  }

  public void setFormatParams(FormatParams formatParams) {
    this.formatParams = formatParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.integrationName, source.integrationName) &&
        Objects.equals(this.s3, source.s3) &&
        Objects.equals(this.kinesis, source.kinesis) &&
        Objects.equals(this.gcs, source.gcs) &&
        Objects.equals(this.azureBlobStorage, source.azureBlobStorage) &&
        Objects.equals(this.azureServiceBus, source.azureServiceBus) &&
        Objects.equals(this.azureEventHubs, source.azureEventHubs) &&
        Objects.equals(this.dynamodb, source.dynamodb) &&
        Objects.equals(this.fileUpload, source.fileUpload) &&
        Objects.equals(this.kafka, source.kafka) &&
        Objects.equals(this.mongodb, source.mongodb) &&
        Objects.equals(this.status, source.status) &&
        Objects.equals(this.formatParams, source.formatParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationName, s3, kinesis, gcs, azureBlobStorage, azureServiceBus, azureEventHubs, dynamodb, fileUpload, kafka, mongodb, status, formatParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    kinesis: ").append(toIndentedString(kinesis)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    azureBlobStorage: ").append(toIndentedString(azureBlobStorage)).append("\n");
    sb.append("    azureServiceBus: ").append(toIndentedString(azureServiceBus)).append("\n");
    sb.append("    azureEventHubs: ").append(toIndentedString(azureEventHubs)).append("\n");
    sb.append("    dynamodb: ").append(toIndentedString(dynamodb)).append("\n");
    sb.append("    fileUpload: ").append(toIndentedString(fileUpload)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    mongodb: ").append(toIndentedString(mongodb)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    formatParams: ").append(toIndentedString(formatParams)).append("\n");
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

