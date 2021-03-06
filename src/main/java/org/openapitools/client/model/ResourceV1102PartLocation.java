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
 * The part location for a resource within an enclosure.
 */
@ApiModel(description = "The part location for a resource within an enclosure.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ResourceV1102PartLocation {
  public static final String SERIALIZED_NAME_LOCATION_ORDINAL_VALUE = "LocationOrdinalValue";
  @SerializedName(SERIALIZED_NAME_LOCATION_ORDINAL_VALUE)
  private Long locationOrdinalValue;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "LocationType";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private Object locationType = null;

  public static final String SERIALIZED_NAME_ORIENTATION = "Orientation";
  @SerializedName(SERIALIZED_NAME_ORIENTATION)
  private Object orientation = null;

  public static final String SERIALIZED_NAME_REFERENCE = "Reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private Object reference = null;

  public static final String SERIALIZED_NAME_SERVICE_LABEL = "ServiceLabel";
  @SerializedName(SERIALIZED_NAME_SERVICE_LABEL)
  private String serviceLabel;


   /**
   * The number that represents the location of the part.  For example, if LocationType is &#x60;Slot&#x60; and this unit is in slot 2, the LocationOrdinalValue is &#x60;2&#x60;.
   * @return locationOrdinalValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number that represents the location of the part.  For example, if LocationType is `Slot` and this unit is in slot 2, the LocationOrdinalValue is `2`.")

  public Long getLocationOrdinalValue() {
    return locationOrdinalValue;
  }




  public ResourceV1102PartLocation locationType(Object locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLocationType() {
    return locationType;
  }


  public void setLocationType(Object locationType) {
    this.locationType = locationType;
  }


  public ResourceV1102PartLocation orientation(Object orientation) {
    
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getOrientation() {
    return orientation;
  }


  public void setOrientation(Object orientation) {
    this.orientation = orientation;
  }


  public ResourceV1102PartLocation reference(Object reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getReference() {
    return reference;
  }


  public void setReference(Object reference) {
    this.reference = reference;
  }


   /**
   * The label of the part location, such as a silk-screened name or a printed label.
   * @return serviceLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label of the part location, such as a silk-screened name or a printed label.")

  public String getServiceLabel() {
    return serviceLabel;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceV1102PartLocation resourceV1102PartLocation = (ResourceV1102PartLocation) o;
    return Objects.equals(this.locationOrdinalValue, resourceV1102PartLocation.locationOrdinalValue) &&
        Objects.equals(this.locationType, resourceV1102PartLocation.locationType) &&
        Objects.equals(this.orientation, resourceV1102PartLocation.orientation) &&
        Objects.equals(this.reference, resourceV1102PartLocation.reference) &&
        Objects.equals(this.serviceLabel, resourceV1102PartLocation.serviceLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationOrdinalValue, locationType, orientation, reference, serviceLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceV1102PartLocation {\n");
    sb.append("    locationOrdinalValue: ").append(toIndentedString(locationOrdinalValue)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    serviceLabel: ").append(toIndentedString(serviceLabel)).append("\n");
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

