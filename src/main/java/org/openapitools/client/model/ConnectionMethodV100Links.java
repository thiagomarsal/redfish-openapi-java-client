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
import java.util.ArrayList;
import java.util.List;

/**
 * The links to other resources that are related to this resource.
 */
@ApiModel(description = "The links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ConnectionMethodV100Links {
  public static final String SERIALIZED_NAME_AGGREGATION_SOURCES = "AggregationSources";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_SOURCES)
  private List<Object> aggregationSources = null;

  public static final String SERIALIZED_NAME_AGGREGATION_SOURCES_AT_ODATA_COUNT = "AggregationSources@odata.count";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_SOURCES_AT_ODATA_COUNT)
  private Object aggregationSourcesAtOdataCount = null;

  public static final String SERIALIZED_NAME_OEM = "Oem";
  @SerializedName(SERIALIZED_NAME_OEM)
  private Object oem = null;


   /**
   * An array of links to the access points using this connection method.
   * @return aggregationSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the access points using this connection method.")

  public List<Object> getAggregationSources() {
    return aggregationSources;
  }




  public ConnectionMethodV100Links aggregationSourcesAtOdataCount(Object aggregationSourcesAtOdataCount) {
    
    this.aggregationSourcesAtOdataCount = aggregationSourcesAtOdataCount;
    return this;
  }

   /**
   * Get aggregationSourcesAtOdataCount
   * @return aggregationSourcesAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAggregationSourcesAtOdataCount() {
    return aggregationSourcesAtOdataCount;
  }


  public void setAggregationSourcesAtOdataCount(Object aggregationSourcesAtOdataCount) {
    this.aggregationSourcesAtOdataCount = aggregationSourcesAtOdataCount;
  }


  public ConnectionMethodV100Links oem(Object oem) {
    
    this.oem = oem;
    return this;
  }

   /**
   * Get oem
   * @return oem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getOem() {
    return oem;
  }


  public void setOem(Object oem) {
    this.oem = oem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionMethodV100Links connectionMethodV100Links = (ConnectionMethodV100Links) o;
    return Objects.equals(this.aggregationSources, connectionMethodV100Links.aggregationSources) &&
        Objects.equals(this.aggregationSourcesAtOdataCount, connectionMethodV100Links.aggregationSourcesAtOdataCount) &&
        Objects.equals(this.oem, connectionMethodV100Links.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationSources, aggregationSourcesAtOdataCount, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionMethodV100Links {\n");
    sb.append("    aggregationSources: ").append(toIndentedString(aggregationSources)).append("\n");
    sb.append("    aggregationSourcesAtOdataCount: ").append(toIndentedString(aggregationSourcesAtOdataCount)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
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

