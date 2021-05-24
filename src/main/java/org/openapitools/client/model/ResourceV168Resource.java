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
 * The base type for resources and members that can be linked to.
 */
@ApiModel(description = "The base type for resources and members that can be linked to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ResourceV168Resource {
  public static final String SERIALIZED_NAME_AT_ODATA_CONTEXT = "@odata.context";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_CONTEXT)
  private Object atOdataContext = null;

  public static final String SERIALIZED_NAME_AT_ODATA_ETAG = "@odata.etag";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_ETAG)
  private Object atOdataEtag = null;

  public static final String SERIALIZED_NAME_AT_ODATA_ID = "@odata.id";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_ID)
  private Object atOdataId = null;

  public static final String SERIALIZED_NAME_AT_ODATA_TYPE = "@odata.type";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_TYPE)
  private Object atOdataType = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_OEM = "Oem";
  @SerializedName(SERIALIZED_NAME_OEM)
  private Object oem = null;


  public ResourceV168Resource atOdataContext(Object atOdataContext) {
    
    this.atOdataContext = atOdataContext;
    return this;
  }

   /**
   * Get atOdataContext
   * @return atOdataContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAtOdataContext() {
    return atOdataContext;
  }


  public void setAtOdataContext(Object atOdataContext) {
    this.atOdataContext = atOdataContext;
  }


  public ResourceV168Resource atOdataEtag(Object atOdataEtag) {
    
    this.atOdataEtag = atOdataEtag;
    return this;
  }

   /**
   * Get atOdataEtag
   * @return atOdataEtag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAtOdataEtag() {
    return atOdataEtag;
  }


  public void setAtOdataEtag(Object atOdataEtag) {
    this.atOdataEtag = atOdataEtag;
  }


  public ResourceV168Resource atOdataId(Object atOdataId) {
    
    this.atOdataId = atOdataId;
    return this;
  }

   /**
   * Get atOdataId
   * @return atOdataId
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getAtOdataId() {
    return atOdataId;
  }


  public void setAtOdataId(Object atOdataId) {
    this.atOdataId = atOdataId;
  }


  public ResourceV168Resource atOdataType(Object atOdataType) {
    
    this.atOdataType = atOdataType;
    return this;
  }

   /**
   * Get atOdataType
   * @return atOdataType
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getAtOdataType() {
    return atOdataType;
  }


  public void setAtOdataType(Object atOdataType) {
    this.atOdataType = atOdataType;
  }


  public ResourceV168Resource description(Object description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDescription() {
    return description;
  }


  public void setDescription(Object description) {
    this.description = description;
  }


  public ResourceV168Resource id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getId() {
    return id;
  }


  public void setId(Object id) {
    this.id = id;
  }


  public ResourceV168Resource name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getName() {
    return name;
  }


  public void setName(Object name) {
    this.name = name;
  }


  public ResourceV168Resource oem(Object oem) {
    
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
    ResourceV168Resource resourceV168Resource = (ResourceV168Resource) o;
    return Objects.equals(this.atOdataContext, resourceV168Resource.atOdataContext) &&
        Objects.equals(this.atOdataEtag, resourceV168Resource.atOdataEtag) &&
        Objects.equals(this.atOdataId, resourceV168Resource.atOdataId) &&
        Objects.equals(this.atOdataType, resourceV168Resource.atOdataType) &&
        Objects.equals(this.description, resourceV168Resource.description) &&
        Objects.equals(this.id, resourceV168Resource.id) &&
        Objects.equals(this.name, resourceV168Resource.name) &&
        Objects.equals(this.oem, resourceV168Resource.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atOdataContext, atOdataEtag, atOdataId, atOdataType, description, id, name, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceV168Resource {\n");
    sb.append("    atOdataContext: ").append(toIndentedString(atOdataContext)).append("\n");
    sb.append("    atOdataEtag: ").append(toIndentedString(atOdataEtag)).append("\n");
    sb.append("    atOdataId: ").append(toIndentedString(atOdataId)).append("\n");
    sb.append("    atOdataType: ").append(toIndentedString(atOdataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

