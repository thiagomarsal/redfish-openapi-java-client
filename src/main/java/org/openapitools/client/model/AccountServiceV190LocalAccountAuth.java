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
 * Gets or Sets AccountService_v1_9_0_LocalAccountAuth
 */
@JsonAdapter(AccountServiceV190LocalAccountAuth.Adapter.class)
public enum AccountServiceV190LocalAccountAuth {
  
  ENABLED("Enabled"),
  
  DISABLED("Disabled"),
  
  FALLBACK("Fallback"),
  
  LOCALFIRST("LocalFirst");

  private String value;

  AccountServiceV190LocalAccountAuth(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountServiceV190LocalAccountAuth fromValue(String value) {
    for (AccountServiceV190LocalAccountAuth b : AccountServiceV190LocalAccountAuth.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AccountServiceV190LocalAccountAuth> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountServiceV190LocalAccountAuth enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountServiceV190LocalAccountAuth read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountServiceV190LocalAccountAuth.fromValue(value);
    }
  }
}

