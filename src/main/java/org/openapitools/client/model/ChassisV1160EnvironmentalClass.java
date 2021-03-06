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
 * Gets or Sets Chassis_v1_16_0_EnvironmentalClass
 */
@JsonAdapter(ChassisV1160EnvironmentalClass.Adapter.class)
public enum ChassisV1160EnvironmentalClass {
  
  A1("A1"),
  
  A2("A2"),
  
  A3("A3"),
  
  A4("A4");

  private String value;

  ChassisV1160EnvironmentalClass(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChassisV1160EnvironmentalClass fromValue(String value) {
    for (ChassisV1160EnvironmentalClass b : ChassisV1160EnvironmentalClass.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChassisV1160EnvironmentalClass> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChassisV1160EnvironmentalClass enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChassisV1160EnvironmentalClass read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChassisV1160EnvironmentalClass.fromValue(value);
    }
  }
}

