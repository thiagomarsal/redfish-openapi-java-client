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
 * The placement within the addressed location.
 */
@ApiModel(description = "The placement within the addressed location.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ResourceV1410Placement {
  public static final String SERIALIZED_NAME_RACK = "Rack";
  @SerializedName(SERIALIZED_NAME_RACK)
  private String rack;

  public static final String SERIALIZED_NAME_RACK_OFFSET = "RackOffset";
  @SerializedName(SERIALIZED_NAME_RACK_OFFSET)
  private Long rackOffset;

  public static final String SERIALIZED_NAME_RACK_OFFSET_UNITS = "RackOffsetUnits";
  @SerializedName(SERIALIZED_NAME_RACK_OFFSET_UNITS)
  private Object rackOffsetUnits = null;

  public static final String SERIALIZED_NAME_ROW = "Row";
  @SerializedName(SERIALIZED_NAME_ROW)
  private String row;


  public ResourceV1410Placement rack(String rack) {
    
    this.rack = rack;
    return this;
  }

   /**
   * The name of a rack location within a row.
   * @return rack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a rack location within a row.")

  public String getRack() {
    return rack;
  }


  public void setRack(String rack) {
    this.rack = rack;
  }


  public ResourceV1410Placement rackOffset(Long rackOffset) {
    
    this.rackOffset = rackOffset;
    return this;
  }

   /**
   * The vertical location of the item, in terms of RackOffsetUnits.
   * @return rackOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The vertical location of the item, in terms of RackOffsetUnits.")

  public Long getRackOffset() {
    return rackOffset;
  }


  public void setRackOffset(Long rackOffset) {
    this.rackOffset = rackOffset;
  }


  public ResourceV1410Placement rackOffsetUnits(Object rackOffsetUnits) {
    
    this.rackOffsetUnits = rackOffsetUnits;
    return this;
  }

   /**
   * Get rackOffsetUnits
   * @return rackOffsetUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRackOffsetUnits() {
    return rackOffsetUnits;
  }


  public void setRackOffsetUnits(Object rackOffsetUnits) {
    this.rackOffsetUnits = rackOffsetUnits;
  }


  public ResourceV1410Placement row(String row) {
    
    this.row = row;
    return this;
  }

   /**
   * The name of the row.
   * @return row
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the row.")

  public String getRow() {
    return row;
  }


  public void setRow(String row) {
    this.row = row;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceV1410Placement resourceV1410Placement = (ResourceV1410Placement) o;
    return Objects.equals(this.rack, resourceV1410Placement.rack) &&
        Objects.equals(this.rackOffset, resourceV1410Placement.rackOffset) &&
        Objects.equals(this.rackOffsetUnits, resourceV1410Placement.rackOffsetUnits) &&
        Objects.equals(this.row, resourceV1410Placement.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rack, rackOffset, rackOffsetUnits, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceV1410Placement {\n");
    sb.append("    rack: ").append(toIndentedString(rack)).append("\n");
    sb.append("    rackOffset: ").append(toIndentedString(rackOffset)).append("\n");
    sb.append("    rackOffsetUnits: ").append(toIndentedString(rackOffsetUnits)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

