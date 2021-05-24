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
 * Gets or Sets ExternalAccountProvider_v1_2_0_TACACSplusPasswordExchangeProtocol
 */
@JsonAdapter(ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol.Adapter.class)
public enum ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol {
  
  ASCII("ASCII"),
  
  PAP("PAP"),
  
  CHAP("CHAP"),
  
  MSCHAPV1("MSCHAPv1"),
  
  MSCHAPV2("MSCHAPv2");

  private String value;

  ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol fromValue(String value) {
    for (ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol b : ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExternalAccountProviderV120TACACSplusPasswordExchangeProtocol.fromValue(value);
    }
  }
}
