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
import org.openapitools.client.model.AssemblyV130AssemblyData;

/**
 * The Assembly schema defines an assembly.  Assembly information contains details about a device, such as part number, serial number, manufacturer, and production date.  It also provides access to the original data for the assembly.
 */
@ApiModel(description = "The Assembly schema defines an assembly.  Assembly information contains details about a device, such as part number, serial number, manufacturer, and production date.  It also provides access to the original data for the assembly.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class AssemblyV130Assembly {
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

  public static final String SERIALIZED_NAME_ACTIONS = "Actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private Object actions = null;

  public static final String SERIALIZED_NAME_ASSEMBLIES = "Assemblies";
  @SerializedName(SERIALIZED_NAME_ASSEMBLIES)
  private List<AssemblyV130AssemblyData> assemblies = null;

  public static final String SERIALIZED_NAME_ASSEMBLIES_AT_ODATA_COUNT = "Assemblies@odata.count";
  @SerializedName(SERIALIZED_NAME_ASSEMBLIES_AT_ODATA_COUNT)
  private Object assembliesAtOdataCount = null;

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


  public AssemblyV130Assembly atOdataContext(Object atOdataContext) {
    
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


  public AssemblyV130Assembly atOdataEtag(Object atOdataEtag) {
    
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


  public AssemblyV130Assembly atOdataId(Object atOdataId) {
    
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


  public AssemblyV130Assembly atOdataType(Object atOdataType) {
    
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


  public AssemblyV130Assembly actions(Object actions) {
    
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getActions() {
    return actions;
  }


  public void setActions(Object actions) {
    this.actions = actions;
  }


  public AssemblyV130Assembly assemblies(List<AssemblyV130AssemblyData> assemblies) {
    
    this.assemblies = assemblies;
    return this;
  }

  public AssemblyV130Assembly addAssembliesItem(AssemblyV130AssemblyData assembliesItem) {
    if (this.assemblies == null) {
      this.assemblies = new ArrayList<AssemblyV130AssemblyData>();
    }
    this.assemblies.add(assembliesItem);
    return this;
  }

   /**
   * The assembly records.
   * @return assemblies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The assembly records.")

  public List<AssemblyV130AssemblyData> getAssemblies() {
    return assemblies;
  }


  public void setAssemblies(List<AssemblyV130AssemblyData> assemblies) {
    this.assemblies = assemblies;
  }


  public AssemblyV130Assembly assembliesAtOdataCount(Object assembliesAtOdataCount) {
    
    this.assembliesAtOdataCount = assembliesAtOdataCount;
    return this;
  }

   /**
   * Get assembliesAtOdataCount
   * @return assembliesAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAssembliesAtOdataCount() {
    return assembliesAtOdataCount;
  }


  public void setAssembliesAtOdataCount(Object assembliesAtOdataCount) {
    this.assembliesAtOdataCount = assembliesAtOdataCount;
  }


  public AssemblyV130Assembly description(Object description) {
    
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


  public AssemblyV130Assembly id(Object id) {
    
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


  public AssemblyV130Assembly name(Object name) {
    
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


  public AssemblyV130Assembly oem(Object oem) {
    
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
    AssemblyV130Assembly assemblyV130Assembly = (AssemblyV130Assembly) o;
    return Objects.equals(this.atOdataContext, assemblyV130Assembly.atOdataContext) &&
        Objects.equals(this.atOdataEtag, assemblyV130Assembly.atOdataEtag) &&
        Objects.equals(this.atOdataId, assemblyV130Assembly.atOdataId) &&
        Objects.equals(this.atOdataType, assemblyV130Assembly.atOdataType) &&
        Objects.equals(this.actions, assemblyV130Assembly.actions) &&
        Objects.equals(this.assemblies, assemblyV130Assembly.assemblies) &&
        Objects.equals(this.assembliesAtOdataCount, assemblyV130Assembly.assembliesAtOdataCount) &&
        Objects.equals(this.description, assemblyV130Assembly.description) &&
        Objects.equals(this.id, assemblyV130Assembly.id) &&
        Objects.equals(this.name, assemblyV130Assembly.name) &&
        Objects.equals(this.oem, assemblyV130Assembly.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atOdataContext, atOdataEtag, atOdataId, atOdataType, actions, assemblies, assembliesAtOdataCount, description, id, name, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyV130Assembly {\n");
    sb.append("    atOdataContext: ").append(toIndentedString(atOdataContext)).append("\n");
    sb.append("    atOdataEtag: ").append(toIndentedString(atOdataEtag)).append("\n");
    sb.append("    atOdataId: ").append(toIndentedString(atOdataId)).append("\n");
    sb.append("    atOdataType: ").append(toIndentedString(atOdataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    assemblies: ").append(toIndentedString(assemblies)).append("\n");
    sb.append("    assembliesAtOdataCount: ").append(toIndentedString(assembliesAtOdataCount)).append("\n");
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
