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
 * The settings to search a generic LDAP service.
 */
@ApiModel(description = "The settings to search a generic LDAP service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ExternalAccountProviderV120LDAPSearchSettings {
  public static final String SERIALIZED_NAME_BASE_DISTINGUISHED_NAMES = "BaseDistinguishedNames";
  @SerializedName(SERIALIZED_NAME_BASE_DISTINGUISHED_NAMES)
  private List<String> baseDistinguishedNames = null;

  public static final String SERIALIZED_NAME_GROUP_NAME_ATTRIBUTE = "GroupNameAttribute";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME_ATTRIBUTE)
  private String groupNameAttribute;

  public static final String SERIALIZED_NAME_GROUPS_ATTRIBUTE = "GroupsAttribute";
  @SerializedName(SERIALIZED_NAME_GROUPS_ATTRIBUTE)
  private String groupsAttribute;

  public static final String SERIALIZED_NAME_USERNAME_ATTRIBUTE = "UsernameAttribute";
  @SerializedName(SERIALIZED_NAME_USERNAME_ATTRIBUTE)
  private String usernameAttribute;


  public ExternalAccountProviderV120LDAPSearchSettings baseDistinguishedNames(List<String> baseDistinguishedNames) {
    
    this.baseDistinguishedNames = baseDistinguishedNames;
    return this;
  }

  public ExternalAccountProviderV120LDAPSearchSettings addBaseDistinguishedNamesItem(String baseDistinguishedNamesItem) {
    if (this.baseDistinguishedNames == null) {
      this.baseDistinguishedNames = new ArrayList<String>();
    }
    this.baseDistinguishedNames.add(baseDistinguishedNamesItem);
    return this;
  }

   /**
   * The base distinguished names to use to search an external LDAP service.
   * @return baseDistinguishedNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base distinguished names to use to search an external LDAP service.")

  public List<String> getBaseDistinguishedNames() {
    return baseDistinguishedNames;
  }


  public void setBaseDistinguishedNames(List<String> baseDistinguishedNames) {
    this.baseDistinguishedNames = baseDistinguishedNames;
  }


  public ExternalAccountProviderV120LDAPSearchSettings groupNameAttribute(String groupNameAttribute) {
    
    this.groupNameAttribute = groupNameAttribute;
    return this;
  }

   /**
   * The attribute name that contains the LDAP group name entry.
   * @return groupNameAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attribute name that contains the LDAP group name entry.")

  public String getGroupNameAttribute() {
    return groupNameAttribute;
  }


  public void setGroupNameAttribute(String groupNameAttribute) {
    this.groupNameAttribute = groupNameAttribute;
  }


  public ExternalAccountProviderV120LDAPSearchSettings groupsAttribute(String groupsAttribute) {
    
    this.groupsAttribute = groupsAttribute;
    return this;
  }

   /**
   * The attribute name that contains the groups for a user on the LDAP user entry.
   * @return groupsAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attribute name that contains the groups for a user on the LDAP user entry.")

  public String getGroupsAttribute() {
    return groupsAttribute;
  }


  public void setGroupsAttribute(String groupsAttribute) {
    this.groupsAttribute = groupsAttribute;
  }


  public ExternalAccountProviderV120LDAPSearchSettings usernameAttribute(String usernameAttribute) {
    
    this.usernameAttribute = usernameAttribute;
    return this;
  }

   /**
   * The attribute name that contains the LDAP user name entry.
   * @return usernameAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attribute name that contains the LDAP user name entry.")

  public String getUsernameAttribute() {
    return usernameAttribute;
  }


  public void setUsernameAttribute(String usernameAttribute) {
    this.usernameAttribute = usernameAttribute;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAccountProviderV120LDAPSearchSettings externalAccountProviderV120LDAPSearchSettings = (ExternalAccountProviderV120LDAPSearchSettings) o;
    return Objects.equals(this.baseDistinguishedNames, externalAccountProviderV120LDAPSearchSettings.baseDistinguishedNames) &&
        Objects.equals(this.groupNameAttribute, externalAccountProviderV120LDAPSearchSettings.groupNameAttribute) &&
        Objects.equals(this.groupsAttribute, externalAccountProviderV120LDAPSearchSettings.groupsAttribute) &&
        Objects.equals(this.usernameAttribute, externalAccountProviderV120LDAPSearchSettings.usernameAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDistinguishedNames, groupNameAttribute, groupsAttribute, usernameAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAccountProviderV120LDAPSearchSettings {\n");
    sb.append("    baseDistinguishedNames: ").append(toIndentedString(baseDistinguishedNames)).append("\n");
    sb.append("    groupNameAttribute: ").append(toIndentedString(groupNameAttribute)).append("\n");
    sb.append("    groupsAttribute: ").append(toIndentedString(groupsAttribute)).append("\n");
    sb.append("    usernameAttribute: ").append(toIndentedString(usernameAttribute)).append("\n");
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

