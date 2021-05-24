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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Resource_State
 */
@JsonAdapter(ResourceState.Adapter.class)
public enum ResourceState {
  
  ENABLED("Enabled"),
  
  DISABLED("Disabled"),
  
  STANDBYOFFLINE("StandbyOffline"),
  
  STANDBYSPARE("StandbySpare"),
  
  INTEST("InTest"),
  
  STARTING("Starting"),
  
  ABSENT("Absent"),
  
  UNAVAILABLEOFFLINE("UnavailableOffline"),
  
  DEFERRING("Deferring"),
  
  QUIESCED("Quiesced"),
  
  UPDATING("Updating"),
  
  QUALIFIED("Qualified");

  private String value;

  ResourceState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResourceState fromValue(String value) {
    for (ResourceState b : ResourceState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResourceState> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResourceState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResourceState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResourceState.fromValue(value);
    }
  }
}

