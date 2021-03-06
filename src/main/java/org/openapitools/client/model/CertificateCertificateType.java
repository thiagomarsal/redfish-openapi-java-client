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
 * Gets or Sets Certificate_CertificateType
 */
@JsonAdapter(CertificateCertificateType.Adapter.class)
public enum CertificateCertificateType {
  
  PEM("PEM"),
  
  PKCS7("PKCS7");

  private String value;

  CertificateCertificateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CertificateCertificateType fromValue(String value) {
    for (CertificateCertificateType b : CertificateCertificateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CertificateCertificateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CertificateCertificateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CertificateCertificateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CertificateCertificateType.fromValue(value);
    }
  }
}

