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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The types of locations for a part within an enclosure.
 */
@JsonAdapter(ResourceV168LocationType.Adapter.class)
public enum ResourceV168LocationType {
  
  SLOT("Slot"),
  
  BAY("Bay"),
  
  CONNECTOR("Connector"),
  
  SOCKET("Socket");

  private String value;

  ResourceV168LocationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResourceV168LocationType fromValue(String value) {
    for (ResourceV168LocationType b : ResourceV168LocationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResourceV168LocationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResourceV168LocationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResourceV168LocationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResourceV168LocationType.fromValue(value);
    }
  }
}

