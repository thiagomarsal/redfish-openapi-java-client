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
import org.threeten.bp.OffsetDateTime;

/**
 * The Task schema contains information about a task that the Redfish Task Service schedules or executes.  Tasks represent operations that take more time than a client typically wants to wait.
 */
@ApiModel(description = "The Task schema contains information about a task that the Redfish Task Service schedules or executes.  Tasks represent operations that take more time than a client typically wants to wait.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class TaskV151Task {
  public static final String SERIALIZED_NAME_AT_ODATA_CONTEXT = "@odata.context";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_CONTEXT)
  private Object atOdataContext = null;

  public static final String SERIALIZED_NAME_AT_ODATA_ETAG = "@odata.etag";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_ETAG)
  private Object atOdataEtag = null;

  public static final String SERIALIZED_NAME_AT_ODATA_ID = "@odata.id";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_ID)
  private Object atOdataId = null;

  public static final String SERIALIZED_NAME_AT_ODATA_TYPE = "@odata.type";
  @SerializedName(SERIALIZED_NAME_AT_ODATA_TYPE)
  private Object atOdataType = null;

  public static final String SERIALIZED_NAME_ACTIONS = "Actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private Object actions = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_END_TIME = "EndTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_HIDE_PAYLOAD = "HidePayload";
  @SerializedName(SERIALIZED_NAME_HIDE_PAYLOAD)
  private Boolean hidePayload;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_MESSAGES = "Messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Object> messages = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_OEM = "Oem";
  @SerializedName(SERIALIZED_NAME_OEM)
  private Object oem = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "Payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private Object payload = null;

  public static final String SERIALIZED_NAME_PERCENT_COMPLETE = "PercentComplete";
  @SerializedName(SERIALIZED_NAME_PERCENT_COMPLETE)
  private Long percentComplete;

  public static final String SERIALIZED_NAME_START_TIME = "StartTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SUB_TASKS = "SubTasks";
  @SerializedName(SERIALIZED_NAME_SUB_TASKS)
  private Object subTasks = null;

  public static final String SERIALIZED_NAME_TASK_MONITOR = "TaskMonitor";
  @SerializedName(SERIALIZED_NAME_TASK_MONITOR)
  private String taskMonitor;

  public static final String SERIALIZED_NAME_TASK_STATE = "TaskState";
  @SerializedName(SERIALIZED_NAME_TASK_STATE)
  private Object taskState = null;

  public static final String SERIALIZED_NAME_TASK_STATUS = "TaskStatus";
  @SerializedName(SERIALIZED_NAME_TASK_STATUS)
  private Object taskStatus = null;


  public TaskV151Task atOdataContext(Object atOdataContext) {
    
    this.atOdataContext = atOdataContext;
    return this;
  }

   /**
   * Get atOdataContext
   * @return atOdataContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAtOdataContext() {
    return atOdataContext;
  }


  public void setAtOdataContext(Object atOdataContext) {
    this.atOdataContext = atOdataContext;
  }


  public TaskV151Task atOdataEtag(Object atOdataEtag) {
    
    this.atOdataEtag = atOdataEtag;
    return this;
  }

   /**
   * Get atOdataEtag
   * @return atOdataEtag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAtOdataEtag() {
    return atOdataEtag;
  }


  public void setAtOdataEtag(Object atOdataEtag) {
    this.atOdataEtag = atOdataEtag;
  }


  public TaskV151Task atOdataId(Object atOdataId) {
    
    this.atOdataId = atOdataId;
    return this;
  }

   /**
   * Get atOdataId
   * @return atOdataId
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getAtOdataId() {
    return atOdataId;
  }


  public void setAtOdataId(Object atOdataId) {
    this.atOdataId = atOdataId;
  }


  public TaskV151Task atOdataType(Object atOdataType) {
    
    this.atOdataType = atOdataType;
    return this;
  }

   /**
   * Get atOdataType
   * @return atOdataType
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getAtOdataType() {
    return atOdataType;
  }


  public void setAtOdataType(Object atOdataType) {
    this.atOdataType = atOdataType;
  }


  public TaskV151Task actions(Object actions) {
    
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getActions() {
    return actions;
  }


  public void setActions(Object actions) {
    this.actions = actions;
  }


  public TaskV151Task description(Object description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDescription() {
    return description;
  }


  public void setDescription(Object description) {
    this.description = description;
  }


   /**
   * The date and time when the task was completed.  This property will only appear when the task is complete.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the task was completed.  This property will only appear when the task is complete.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }




   /**
   * An indication of whether the contents of the payload are hidden from view after the task has been created.  If &#x60;true&#x60;, responses do not return the payload.  If &#x60;false&#x60;, responses return the payload.  If this property is not present when the task is created, the default is &#x60;false&#x60;.
   * @return hidePayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether the contents of the payload are hidden from view after the task has been created.  If `true`, responses do not return the payload.  If `false`, responses return the payload.  If this property is not present when the task is created, the default is `false`.")

  public Boolean getHidePayload() {
    return hidePayload;
  }




  public TaskV151Task id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getId() {
    return id;
  }


  public void setId(Object id) {
    this.id = id;
  }


  public TaskV151Task messages(List<Object> messages) {
    
    this.messages = messages;
    return this;
  }

  public TaskV151Task addMessagesItem(Object messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Object>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * An array of messages associated with the task.
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of messages associated with the task.")

  public List<Object> getMessages() {
    return messages;
  }


  public void setMessages(List<Object> messages) {
    this.messages = messages;
  }


  public TaskV151Task name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getName() {
    return name;
  }


  public void setName(Object name) {
    this.name = name;
  }


  public TaskV151Task oem(Object oem) {
    
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


  public TaskV151Task payload(Object payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPayload() {
    return payload;
  }


  public void setPayload(Object payload) {
    this.payload = payload;
  }


   /**
   * The completion percentage of this task.
   * @return percentComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The completion percentage of this task.")

  public Long getPercentComplete() {
    return percentComplete;
  }




   /**
   * The date and time when the task was started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the task was started.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }




  public TaskV151Task subTasks(Object subTasks) {
    
    this.subTasks = subTasks;
    return this;
  }

   /**
   * Get subTasks
   * @return subTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubTasks() {
    return subTasks;
  }


  public void setSubTasks(Object subTasks) {
    this.subTasks = subTasks;
  }


   /**
   * The URI of the Task Monitor for this task.
   * @return taskMonitor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI of the Task Monitor for this task.")

  public String getTaskMonitor() {
    return taskMonitor;
  }




  public TaskV151Task taskState(Object taskState) {
    
    this.taskState = taskState;
    return this;
  }

   /**
   * Get taskState
   * @return taskState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTaskState() {
    return taskState;
  }


  public void setTaskState(Object taskState) {
    this.taskState = taskState;
  }


  public TaskV151Task taskStatus(Object taskStatus) {
    
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTaskStatus() {
    return taskStatus;
  }


  public void setTaskStatus(Object taskStatus) {
    this.taskStatus = taskStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskV151Task taskV151Task = (TaskV151Task) o;
    return Objects.equals(this.atOdataContext, taskV151Task.atOdataContext) &&
        Objects.equals(this.atOdataEtag, taskV151Task.atOdataEtag) &&
        Objects.equals(this.atOdataId, taskV151Task.atOdataId) &&
        Objects.equals(this.atOdataType, taskV151Task.atOdataType) &&
        Objects.equals(this.actions, taskV151Task.actions) &&
        Objects.equals(this.description, taskV151Task.description) &&
        Objects.equals(this.endTime, taskV151Task.endTime) &&
        Objects.equals(this.hidePayload, taskV151Task.hidePayload) &&
        Objects.equals(this.id, taskV151Task.id) &&
        Objects.equals(this.messages, taskV151Task.messages) &&
        Objects.equals(this.name, taskV151Task.name) &&
        Objects.equals(this.oem, taskV151Task.oem) &&
        Objects.equals(this.payload, taskV151Task.payload) &&
        Objects.equals(this.percentComplete, taskV151Task.percentComplete) &&
        Objects.equals(this.startTime, taskV151Task.startTime) &&
        Objects.equals(this.subTasks, taskV151Task.subTasks) &&
        Objects.equals(this.taskMonitor, taskV151Task.taskMonitor) &&
        Objects.equals(this.taskState, taskV151Task.taskState) &&
        Objects.equals(this.taskStatus, taskV151Task.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atOdataContext, atOdataEtag, atOdataId, atOdataType, actions, description, endTime, hidePayload, id, messages, name, oem, payload, percentComplete, startTime, subTasks, taskMonitor, taskState, taskStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskV151Task {\n");
    sb.append("    atOdataContext: ").append(toIndentedString(atOdataContext)).append("\n");
    sb.append("    atOdataEtag: ").append(toIndentedString(atOdataEtag)).append("\n");
    sb.append("    atOdataId: ").append(toIndentedString(atOdataId)).append("\n");
    sb.append("    atOdataType: ").append(toIndentedString(atOdataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    hidePayload: ").append(toIndentedString(hidePayload)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
    sb.append("    taskMonitor: ").append(toIndentedString(taskMonitor)).append("\n");
    sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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

