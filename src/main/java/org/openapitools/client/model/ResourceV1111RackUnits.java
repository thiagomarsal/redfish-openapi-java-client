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
 * The type of rack unit in use.
 */
@JsonAdapter(ResourceV1111RackUnits.Adapter.class)
public enum ResourceV1111RackUnits {
  
  OPENU("OpenU"),
  
  EIA_310("EIA_310");

  private String value;

  ResourceV1111RackUnits(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResourceV1111RackUnits fromValue(String value) {
    for (ResourceV1111RackUnits b : ResourceV1111RackUnits.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResourceV1111RackUnits> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResourceV1111RackUnits enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResourceV1111RackUnits read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResourceV1111RackUnits.fromValue(value);
    }
  }
}
