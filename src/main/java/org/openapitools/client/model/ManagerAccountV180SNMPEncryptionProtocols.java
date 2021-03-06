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
 * Gets or Sets ManagerAccount_v1_8_0_SNMPEncryptionProtocols
 */
@JsonAdapter(ManagerAccountV180SNMPEncryptionProtocols.Adapter.class)
public enum ManagerAccountV180SNMPEncryptionProtocols {
  
  NONE("None"),
  
  CBC_DES("CBC_DES"),
  
  CFB128_AES128("CFB128_AES128");

  private String value;

  ManagerAccountV180SNMPEncryptionProtocols(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ManagerAccountV180SNMPEncryptionProtocols fromValue(String value) {
    for (ManagerAccountV180SNMPEncryptionProtocols b : ManagerAccountV180SNMPEncryptionProtocols.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ManagerAccountV180SNMPEncryptionProtocols> {
    @Override
    public void write(final JsonWriter jsonWriter, final ManagerAccountV180SNMPEncryptionProtocols enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ManagerAccountV180SNMPEncryptionProtocols read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ManagerAccountV180SNMPEncryptionProtocols.fromValue(value);
    }
  }
}

