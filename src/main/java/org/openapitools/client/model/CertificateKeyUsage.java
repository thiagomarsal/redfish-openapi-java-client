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
 * The usages of a key contained within a certificate.
 */
@JsonAdapter(CertificateKeyUsage.Adapter.class)
public enum CertificateKeyUsage {
  
  DIGITALSIGNATURE("DigitalSignature"),
  
  NONREPUDIATION("NonRepudiation"),
  
  KEYENCIPHERMENT("KeyEncipherment"),
  
  DATAENCIPHERMENT("DataEncipherment"),
  
  KEYAGREEMENT("KeyAgreement"),
  
  KEYCERTSIGN("KeyCertSign"),
  
  CRLSIGNING("CRLSigning"),
  
  ENCIPHERONLY("EncipherOnly"),
  
  DECIPHERONLY("DecipherOnly"),
  
  SERVERAUTHENTICATION("ServerAuthentication"),
  
  CLIENTAUTHENTICATION("ClientAuthentication"),
  
  CODESIGNING("CodeSigning"),
  
  EMAILPROTECTION("EmailProtection"),
  
  TIMESTAMPING("Timestamping"),
  
  OCSPSIGNING("OCSPSigning");

  private String value;

  CertificateKeyUsage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CertificateKeyUsage fromValue(String value) {
    for (CertificateKeyUsage b : CertificateKeyUsage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CertificateKeyUsage> {
    @Override
    public void write(final JsonWriter jsonWriter, final CertificateKeyUsage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CertificateKeyUsage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CertificateKeyUsage.fromValue(value);
    }
  }
}
