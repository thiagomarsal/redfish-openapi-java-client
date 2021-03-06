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
 * The information about the use of $expand in the service.
 */
@ApiModel(description = "The information about the use of $expand in the service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ServiceRootV1100Expand {
  public static final String SERIALIZED_NAME_EXPAND_ALL = "ExpandAll";
  @SerializedName(SERIALIZED_NAME_EXPAND_ALL)
  private Boolean expandAll;

  public static final String SERIALIZED_NAME_LEVELS = "Levels";
  @SerializedName(SERIALIZED_NAME_LEVELS)
  private Boolean levels;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Boolean links;

  public static final String SERIALIZED_NAME_MAX_LEVELS = "MaxLevels";
  @SerializedName(SERIALIZED_NAME_MAX_LEVELS)
  private Long maxLevels;

  public static final String SERIALIZED_NAME_NO_LINKS = "NoLinks";
  @SerializedName(SERIALIZED_NAME_NO_LINKS)
  private Boolean noLinks;


   /**
   * An indication of whether the service supports the asterisk (&#x60;*&#x60;) option of the $expand query parameter.
   * @return expandAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether the service supports the asterisk (`*`) option of the $expand query parameter.")

  public Boolean getExpandAll() {
    return expandAll;
  }




   /**
   * An indication of whether the service supports the $levels option of the $expand query parameter.
   * @return levels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether the service supports the $levels option of the $expand query parameter.")

  public Boolean getLevels() {
    return levels;
  }




   /**
   * An indication of whether this service supports the tilde (&#x60;~&#x60;) option of the $expand query parameter.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether this service supports the tilde (`~`) option of the $expand query parameter.")

  public Boolean getLinks() {
    return links;
  }




   /**
   * The maximum $levels option value in the $expand query parameter.
   * minimum: 1
   * maximum: 6
   * @return maxLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum $levels option value in the $expand query parameter.")

  public Long getMaxLevels() {
    return maxLevels;
  }




   /**
   * An indication of whether the service supports the period (&#x60;.&#x60;) option of the $expand query parameter.
   * @return noLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether the service supports the period (`.`) option of the $expand query parameter.")

  public Boolean getNoLinks() {
    return noLinks;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRootV1100Expand serviceRootV1100Expand = (ServiceRootV1100Expand) o;
    return Objects.equals(this.expandAll, serviceRootV1100Expand.expandAll) &&
        Objects.equals(this.levels, serviceRootV1100Expand.levels) &&
        Objects.equals(this.links, serviceRootV1100Expand.links) &&
        Objects.equals(this.maxLevels, serviceRootV1100Expand.maxLevels) &&
        Objects.equals(this.noLinks, serviceRootV1100Expand.noLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandAll, levels, links, maxLevels, noLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRootV1100Expand {\n");
    sb.append("    expandAll: ").append(toIndentedString(expandAll)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    maxLevels: ").append(toIndentedString(maxLevels)).append("\n");
    sb.append("    noLinks: ").append(toIndentedString(noLinks)).append("\n");
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

