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
 * The settings required to parse a generic LDAP service.
 */
@ApiModel(description = "The settings required to parse a generic LDAP service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ExternalAccountProviderV120LDAPService {
  public static final String SERIALIZED_NAME_OEM = "Oem";
  @SerializedName(SERIALIZED_NAME_OEM)
  private Object oem = null;

  public static final String SERIALIZED_NAME_SEARCH_SETTINGS = "SearchSettings";
  @SerializedName(SERIALIZED_NAME_SEARCH_SETTINGS)
  private Object searchSettings = null;


  public ExternalAccountProviderV120LDAPService oem(Object oem) {
    
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


  public ExternalAccountProviderV120LDAPService searchSettings(Object searchSettings) {
    
    this.searchSettings = searchSettings;
    return this;
  }

   /**
   * Get searchSettings
   * @return searchSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSearchSettings() {
    return searchSettings;
  }


  public void setSearchSettings(Object searchSettings) {
    this.searchSettings = searchSettings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAccountProviderV120LDAPService externalAccountProviderV120LDAPService = (ExternalAccountProviderV120LDAPService) o;
    return Objects.equals(this.oem, externalAccountProviderV120LDAPService.oem) &&
        Objects.equals(this.searchSettings, externalAccountProviderV120LDAPService.searchSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oem, searchSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAccountProviderV120LDAPService {\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    searchSettings: ").append(toIndentedString(searchSettings)).append("\n");
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

