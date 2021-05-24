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
import java.util.ArrayList;
import java.util.List;

/**
 * The message that the Redfish service returns.
 */
@ApiModel(description = "The message that the Redfish service returns.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class MessageV1010Message {
  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_ARGS = "MessageArgs";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ARGS)
  private List<String> messageArgs = null;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "MessageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_OEM = "Oem";
  @SerializedName(SERIALIZED_NAME_OEM)
  private Object oem = null;

  public static final String SERIALIZED_NAME_RELATED_PROPERTIES = "RelatedProperties";
  @SerializedName(SERIALIZED_NAME_RELATED_PROPERTIES)
  private List<String> relatedProperties = null;

  public static final String SERIALIZED_NAME_RESOLUTION = "Resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private String resolution;

  public static final String SERIALIZED_NAME_SEVERITY = "Severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;


   /**
   * The human-readable message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The human-readable message.")

  public String getMessage() {
    return message;
  }




   /**
   * An array of message arguments that are substituted for the arguments in the message when looked up in the message registry.
   * @return messageArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of message arguments that are substituted for the arguments in the message when looked up in the message registry.")

  public List<String> getMessageArgs() {
    return messageArgs;
  }




   /**
   * The identifier for the message.
   * @return messageId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the message.")

  public String getMessageId() {
    return messageId;
  }




  public MessageV1010Message oem(Object oem) {
    
    this.oem = oem;
    return this;
  }

   /**
   * Get oem
   * @return oem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getOem() {
    return oem;
  }


  public void setOem(Object oem) {
    this.oem = oem;
  }


   /**
   * A set of properties described by the message.
   * @return relatedProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of properties described by the message.")

  public List<String> getRelatedProperties() {
    return relatedProperties;
  }




   /**
   * Used to provide suggestions on how to resolve the situation that caused the message.
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to provide suggestions on how to resolve the situation that caused the message.")

  public String getResolution() {
    return resolution;
  }




   /**
   * The severity of the message.
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The severity of the message.")

  public String getSeverity() {
    return severity;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageV1010Message messageV1010Message = (MessageV1010Message) o;
    return Objects.equals(this.message, messageV1010Message.message) &&
        Objects.equals(this.messageArgs, messageV1010Message.messageArgs) &&
        Objects.equals(this.messageId, messageV1010Message.messageId) &&
        Objects.equals(this.oem, messageV1010Message.oem) &&
        Objects.equals(this.relatedProperties, messageV1010Message.relatedProperties) &&
        Objects.equals(this.resolution, messageV1010Message.resolution) &&
        Objects.equals(this.severity, messageV1010Message.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageArgs, messageId, oem, relatedProperties, resolution, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageV1010Message {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageArgs: ").append(toIndentedString(messageArgs)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    relatedProperties: ").append(toIndentedString(relatedProperties)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

