/*
 * Redfish
 * This contains the definition of a Redfish service.
 *
 * The version of the OpenAPI document: 2021.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
 * This action is used to reset a collection of resources.  For example, this could be an aggregate or a list of computer systems.
 */
@ApiModel(description = "This action is used to reset a collection of resources.  For example, this could be an aggregate or a list of computer systems.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class AggregateV101ResetRequestBody {
  public static final String SERIALIZED_NAME_BATCH_SIZE = "BatchSize";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private Long batchSize;

  public static final String SERIALIZED_NAME_DELAY_BETWEEN_BATCHES_IN_SECONDS = "DelayBetweenBatchesInSeconds";
  @SerializedName(SERIALIZED_NAME_DELAY_BETWEEN_BATCHES_IN_SECONDS)
  private Long delayBetweenBatchesInSeconds;

  public static final String SERIALIZED_NAME_RESET_TYPE = "ResetType";
  @SerializedName(SERIALIZED_NAME_RESET_TYPE)
  private Object resetType = null;


  public AggregateV101ResetRequestBody batchSize(Long batchSize) {
    
    this.batchSize = batchSize;
    return this;
  }

   /**
   * The number of elements in each batch being reset.
   * minimum: 0
   * @return batchSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of elements in each batch being reset.")

  public Long getBatchSize() {
    return batchSize;
  }


  public void setBatchSize(Long batchSize) {
    this.batchSize = batchSize;
  }


  public AggregateV101ResetRequestBody delayBetweenBatchesInSeconds(Long delayBetweenBatchesInSeconds) {
    
    this.delayBetweenBatchesInSeconds = delayBetweenBatchesInSeconds;
    return this;
  }

   /**
   * The delay of the batches of elements being reset in seconds.
   * minimum: 0
   * @return delayBetweenBatchesInSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The delay of the batches of elements being reset in seconds.")

  public Long getDelayBetweenBatchesInSeconds() {
    return delayBetweenBatchesInSeconds;
  }


  public void setDelayBetweenBatchesInSeconds(Long delayBetweenBatchesInSeconds) {
    this.delayBetweenBatchesInSeconds = delayBetweenBatchesInSeconds;
  }


  public AggregateV101ResetRequestBody resetType(Object resetType) {
    
    this.resetType = resetType;
    return this;
  }

   /**
   * Get resetType
   * @return resetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getResetType() {
    return resetType;
  }


  public void setResetType(Object resetType) {
    this.resetType = resetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateV101ResetRequestBody aggregateV101ResetRequestBody = (AggregateV101ResetRequestBody) o;
    return Objects.equals(this.batchSize, aggregateV101ResetRequestBody.batchSize) &&
        Objects.equals(this.delayBetweenBatchesInSeconds, aggregateV101ResetRequestBody.delayBetweenBatchesInSeconds) &&
        Objects.equals(this.resetType, aggregateV101ResetRequestBody.resetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, delayBetweenBatchesInSeconds, resetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateV101ResetRequestBody {\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    delayBetweenBatchesInSeconds: ").append(toIndentedString(delayBetweenBatchesInSeconds)).append("\n");
    sb.append("    resetType: ").append(toIndentedString(resetType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
