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
 * The links to other resources that are related to this resource.
 */
@ApiModel(description = "The links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ManagerAccountV180Links {
  public static final String SERIALIZED_NAME_OEM = "Oem";
  @SerializedName(SERIALIZED_NAME_OEM)
  private Object oem = null;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private Object role = null;


  public ManagerAccountV180Links oem(Object oem) {
    
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


  public ManagerAccountV180Links role(Object role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRole() {
    return role;
  }


  public void setRole(Object role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerAccountV180Links managerAccountV180Links = (ManagerAccountV180Links) o;
    return Objects.equals(this.oem, managerAccountV180Links.oem) &&
        Objects.equals(this.role, managerAccountV180Links.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oem, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerAccountV180Links {\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

