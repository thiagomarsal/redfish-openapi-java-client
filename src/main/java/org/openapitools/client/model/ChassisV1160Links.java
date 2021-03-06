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
 * The links to other resources that are related to this resource.
 */
@ApiModel(description = "The links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ChassisV1160Links {
  public static final String SERIALIZED_NAME_COMPUTER_SYSTEMS = "ComputerSystems";
  @SerializedName(SERIALIZED_NAME_COMPUTER_SYSTEMS)
  private List<Object> computerSystems = null;

  public static final String SERIALIZED_NAME_COMPUTER_SYSTEMS_AT_ODATA_COUNT = "ComputerSystems@odata.count";
  @SerializedName(SERIALIZED_NAME_COMPUTER_SYSTEMS_AT_ODATA_COUNT)
  private Object computerSystemsAtOdataCount = null;

  public static final String SERIALIZED_NAME_CONTAINED_BY = "ContainedBy";
  @SerializedName(SERIALIZED_NAME_CONTAINED_BY)
  private Object containedBy = null;

  public static final String SERIALIZED_NAME_CONTAINS = "Contains";
  @SerializedName(SERIALIZED_NAME_CONTAINS)
  private List<Object> contains = null;

  public static final String SERIALIZED_NAME_CONTAINS_AT_ODATA_COUNT = "Contains@odata.count";
  @SerializedName(SERIALIZED_NAME_CONTAINS_AT_ODATA_COUNT)
  private Object containsAtOdataCount = null;

  public static final String SERIALIZED_NAME_COOLED_BY = "CooledBy";
  @SerializedName(SERIALIZED_NAME_COOLED_BY)
  private List<Object> cooledBy = null;

  public static final String SERIALIZED_NAME_COOLED_BY_AT_ODATA_COUNT = "CooledBy@odata.count";
  @SerializedName(SERIALIZED_NAME_COOLED_BY_AT_ODATA_COUNT)
  private Object cooledByAtOdataCount = null;

  public static final String SERIALIZED_NAME_DRIVES = "Drives";
  @SerializedName(SERIALIZED_NAME_DRIVES)
  private List<Object> drives = null;

  public static final String SERIALIZED_NAME_DRIVES_AT_ODATA_COUNT = "Drives@odata.count";
  @SerializedName(SERIALIZED_NAME_DRIVES_AT_ODATA_COUNT)
  private Object drivesAtOdataCount = null;

  public static final String SERIALIZED_NAME_FACILITY = "Facility";
  @SerializedName(SERIALIZED_NAME_FACILITY)
  private Object facility = null;

  public static final String SERIALIZED_NAME_MANAGED_BY = "ManagedBy";
  @SerializedName(SERIALIZED_NAME_MANAGED_BY)
  private List<Object> managedBy = null;

  public static final String SERIALIZED_NAME_MANAGED_BY_AT_ODATA_COUNT = "ManagedBy@odata.count";
  @SerializedName(SERIALIZED_NAME_MANAGED_BY_AT_ODATA_COUNT)
  private Object managedByAtOdataCount = null;

  public static final String SERIALIZED_NAME_MANAGERS_IN_CHASSIS = "ManagersInChassis";
  @SerializedName(SERIALIZED_NAME_MANAGERS_IN_CHASSIS)
  private List<Object> managersInChassis = null;

  public static final String SERIALIZED_NAME_MANAGERS_IN_CHASSIS_AT_ODATA_COUNT = "ManagersInChassis@odata.count";
  @SerializedName(SERIALIZED_NAME_MANAGERS_IN_CHASSIS_AT_ODATA_COUNT)
  private Object managersInChassisAtOdataCount = null;

  public static final String SERIALIZED_NAME_OEM = "Oem";
  @SerializedName(SERIALIZED_NAME_OEM)
  private Object oem = null;

  public static final String SERIALIZED_NAME_PC_IE_DEVICES = "PCIeDevices";
  @SerializedName(SERIALIZED_NAME_PC_IE_DEVICES)
  private List<Object> pcIeDevices = null;

  public static final String SERIALIZED_NAME_PC_IE_DEVICES_AT_ODATA_COUNT = "PCIeDevices@odata.count";
  @SerializedName(SERIALIZED_NAME_PC_IE_DEVICES_AT_ODATA_COUNT)
  private Object pcIeDevicesAtOdataCount = null;

  public static final String SERIALIZED_NAME_POWERED_BY = "PoweredBy";
  @SerializedName(SERIALIZED_NAME_POWERED_BY)
  private List<Object> poweredBy = null;

  public static final String SERIALIZED_NAME_POWERED_BY_AT_ODATA_COUNT = "PoweredBy@odata.count";
  @SerializedName(SERIALIZED_NAME_POWERED_BY_AT_ODATA_COUNT)
  private Object poweredByAtOdataCount = null;

  public static final String SERIALIZED_NAME_PROCESSORS = "Processors";
  @SerializedName(SERIALIZED_NAME_PROCESSORS)
  private List<Object> processors = null;

  public static final String SERIALIZED_NAME_PROCESSORS_AT_ODATA_COUNT = "Processors@odata.count";
  @SerializedName(SERIALIZED_NAME_PROCESSORS_AT_ODATA_COUNT)
  private Object processorsAtOdataCount = null;

  public static final String SERIALIZED_NAME_RESOURCE_BLOCKS = "ResourceBlocks";
  @SerializedName(SERIALIZED_NAME_RESOURCE_BLOCKS)
  private List<Object> resourceBlocks = null;

  public static final String SERIALIZED_NAME_RESOURCE_BLOCKS_AT_ODATA_COUNT = "ResourceBlocks@odata.count";
  @SerializedName(SERIALIZED_NAME_RESOURCE_BLOCKS_AT_ODATA_COUNT)
  private Object resourceBlocksAtOdataCount = null;

  public static final String SERIALIZED_NAME_STORAGE = "Storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private List<Object> storage = null;

  public static final String SERIALIZED_NAME_STORAGE_AT_ODATA_COUNT = "Storage@odata.count";
  @SerializedName(SERIALIZED_NAME_STORAGE_AT_ODATA_COUNT)
  private Object storageAtOdataCount = null;

  public static final String SERIALIZED_NAME_SWITCHES = "Switches";
  @SerializedName(SERIALIZED_NAME_SWITCHES)
  private List<Object> switches = null;

  public static final String SERIALIZED_NAME_SWITCHES_AT_ODATA_COUNT = "Switches@odata.count";
  @SerializedName(SERIALIZED_NAME_SWITCHES_AT_ODATA_COUNT)
  private Object switchesAtOdataCount = null;


   /**
   * An array of links to the computer systems that this chassis directly and wholly contains.
   * @return computerSystems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the computer systems that this chassis directly and wholly contains.")

  public List<Object> getComputerSystems() {
    return computerSystems;
  }




  public ChassisV1160Links computerSystemsAtOdataCount(Object computerSystemsAtOdataCount) {
    
    this.computerSystemsAtOdataCount = computerSystemsAtOdataCount;
    return this;
  }

   /**
   * Get computerSystemsAtOdataCount
   * @return computerSystemsAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getComputerSystemsAtOdataCount() {
    return computerSystemsAtOdataCount;
  }


  public void setComputerSystemsAtOdataCount(Object computerSystemsAtOdataCount) {
    this.computerSystemsAtOdataCount = computerSystemsAtOdataCount;
  }


  public ChassisV1160Links containedBy(Object containedBy) {
    
    this.containedBy = containedBy;
    return this;
  }

   /**
   * Get containedBy
   * @return containedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getContainedBy() {
    return containedBy;
  }


  public void setContainedBy(Object containedBy) {
    this.containedBy = containedBy;
  }


  public ChassisV1160Links contains(List<Object> contains) {
    
    this.contains = contains;
    return this;
  }

  public ChassisV1160Links addContainsItem(Object containsItem) {
    if (this.contains == null) {
      this.contains = new ArrayList<Object>();
    }
    this.contains.add(containsItem);
    return this;
  }

   /**
   * An array of links to any other chassis that this chassis has in it.
   * @return contains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to any other chassis that this chassis has in it.")

  public List<Object> getContains() {
    return contains;
  }


  public void setContains(List<Object> contains) {
    this.contains = contains;
  }


  public ChassisV1160Links containsAtOdataCount(Object containsAtOdataCount) {
    
    this.containsAtOdataCount = containsAtOdataCount;
    return this;
  }

   /**
   * Get containsAtOdataCount
   * @return containsAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getContainsAtOdataCount() {
    return containsAtOdataCount;
  }


  public void setContainsAtOdataCount(Object containsAtOdataCount) {
    this.containsAtOdataCount = containsAtOdataCount;
  }


   /**
   * An array of links to resources or objects that cool this chassis.  Normally, the link is for either a chassis or a specific set of fans.
   * @return cooledBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to resources or objects that cool this chassis.  Normally, the link is for either a chassis or a specific set of fans.")

  public List<Object> getCooledBy() {
    return cooledBy;
  }




  public ChassisV1160Links cooledByAtOdataCount(Object cooledByAtOdataCount) {
    
    this.cooledByAtOdataCount = cooledByAtOdataCount;
    return this;
  }

   /**
   * Get cooledByAtOdataCount
   * @return cooledByAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCooledByAtOdataCount() {
    return cooledByAtOdataCount;
  }


  public void setCooledByAtOdataCount(Object cooledByAtOdataCount) {
    this.cooledByAtOdataCount = cooledByAtOdataCount;
  }


   /**
   * An array of links to the drives located in this chassis.
   * @return drives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the drives located in this chassis.")

  public List<Object> getDrives() {
    return drives;
  }




  public ChassisV1160Links drivesAtOdataCount(Object drivesAtOdataCount) {
    
    this.drivesAtOdataCount = drivesAtOdataCount;
    return this;
  }

   /**
   * Get drivesAtOdataCount
   * @return drivesAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDrivesAtOdataCount() {
    return drivesAtOdataCount;
  }


  public void setDrivesAtOdataCount(Object drivesAtOdataCount) {
    this.drivesAtOdataCount = drivesAtOdataCount;
  }


  public ChassisV1160Links facility(Object facility) {
    
    this.facility = facility;
    return this;
  }

   /**
   * Get facility
   * @return facility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFacility() {
    return facility;
  }


  public void setFacility(Object facility) {
    this.facility = facility;
  }


   /**
   * An array of links to the managers responsible for managing this chassis.
   * @return managedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the managers responsible for managing this chassis.")

  public List<Object> getManagedBy() {
    return managedBy;
  }




  public ChassisV1160Links managedByAtOdataCount(Object managedByAtOdataCount) {
    
    this.managedByAtOdataCount = managedByAtOdataCount;
    return this;
  }

   /**
   * Get managedByAtOdataCount
   * @return managedByAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getManagedByAtOdataCount() {
    return managedByAtOdataCount;
  }


  public void setManagedByAtOdataCount(Object managedByAtOdataCount) {
    this.managedByAtOdataCount = managedByAtOdataCount;
  }


   /**
   * An array of links to the managers located in this chassis.
   * @return managersInChassis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the managers located in this chassis.")

  public List<Object> getManagersInChassis() {
    return managersInChassis;
  }




  public ChassisV1160Links managersInChassisAtOdataCount(Object managersInChassisAtOdataCount) {
    
    this.managersInChassisAtOdataCount = managersInChassisAtOdataCount;
    return this;
  }

   /**
   * Get managersInChassisAtOdataCount
   * @return managersInChassisAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getManagersInChassisAtOdataCount() {
    return managersInChassisAtOdataCount;
  }


  public void setManagersInChassisAtOdataCount(Object managersInChassisAtOdataCount) {
    this.managersInChassisAtOdataCount = managersInChassisAtOdataCount;
  }


  public ChassisV1160Links oem(Object oem) {
    
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
   * An array of links to the PCIe devices located in this chassis.
   * @return pcIeDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the PCIe devices located in this chassis.")

  public List<Object> getPcIeDevices() {
    return pcIeDevices;
  }




  public ChassisV1160Links pcIeDevicesAtOdataCount(Object pcIeDevicesAtOdataCount) {
    
    this.pcIeDevicesAtOdataCount = pcIeDevicesAtOdataCount;
    return this;
  }

   /**
   * Get pcIeDevicesAtOdataCount
   * @return pcIeDevicesAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPcIeDevicesAtOdataCount() {
    return pcIeDevicesAtOdataCount;
  }


  public void setPcIeDevicesAtOdataCount(Object pcIeDevicesAtOdataCount) {
    this.pcIeDevicesAtOdataCount = pcIeDevicesAtOdataCount;
  }


   /**
   * An array of links to resources or objects that power this chassis.  Normally, the link is for either a chassis or a specific set of power supplies.
   * @return poweredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to resources or objects that power this chassis.  Normally, the link is for either a chassis or a specific set of power supplies.")

  public List<Object> getPoweredBy() {
    return poweredBy;
  }




  public ChassisV1160Links poweredByAtOdataCount(Object poweredByAtOdataCount) {
    
    this.poweredByAtOdataCount = poweredByAtOdataCount;
    return this;
  }

   /**
   * Get poweredByAtOdataCount
   * @return poweredByAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPoweredByAtOdataCount() {
    return poweredByAtOdataCount;
  }


  public void setPoweredByAtOdataCount(Object poweredByAtOdataCount) {
    this.poweredByAtOdataCount = poweredByAtOdataCount;
  }


   /**
   * An array of links to the processors located in this chassis.
   * @return processors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the processors located in this chassis.")

  public List<Object> getProcessors() {
    return processors;
  }




  public ChassisV1160Links processorsAtOdataCount(Object processorsAtOdataCount) {
    
    this.processorsAtOdataCount = processorsAtOdataCount;
    return this;
  }

   /**
   * Get processorsAtOdataCount
   * @return processorsAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getProcessorsAtOdataCount() {
    return processorsAtOdataCount;
  }


  public void setProcessorsAtOdataCount(Object processorsAtOdataCount) {
    this.processorsAtOdataCount = processorsAtOdataCount;
  }


   /**
   * An array of links to the resource blocks located in this chassis.
   * @return resourceBlocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the resource blocks located in this chassis.")

  public List<Object> getResourceBlocks() {
    return resourceBlocks;
  }




  public ChassisV1160Links resourceBlocksAtOdataCount(Object resourceBlocksAtOdataCount) {
    
    this.resourceBlocksAtOdataCount = resourceBlocksAtOdataCount;
    return this;
  }

   /**
   * Get resourceBlocksAtOdataCount
   * @return resourceBlocksAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getResourceBlocksAtOdataCount() {
    return resourceBlocksAtOdataCount;
  }


  public void setResourceBlocksAtOdataCount(Object resourceBlocksAtOdataCount) {
    this.resourceBlocksAtOdataCount = resourceBlocksAtOdataCount;
  }


   /**
   * An array of links to the storage subsystems connected to or inside this chassis.
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the storage subsystems connected to or inside this chassis.")

  public List<Object> getStorage() {
    return storage;
  }




  public ChassisV1160Links storageAtOdataCount(Object storageAtOdataCount) {
    
    this.storageAtOdataCount = storageAtOdataCount;
    return this;
  }

   /**
   * Get storageAtOdataCount
   * @return storageAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStorageAtOdataCount() {
    return storageAtOdataCount;
  }


  public void setStorageAtOdataCount(Object storageAtOdataCount) {
    this.storageAtOdataCount = storageAtOdataCount;
  }


   /**
   * An array of links to the switches located in this chassis.
   * @return switches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of links to the switches located in this chassis.")

  public List<Object> getSwitches() {
    return switches;
  }




  public ChassisV1160Links switchesAtOdataCount(Object switchesAtOdataCount) {
    
    this.switchesAtOdataCount = switchesAtOdataCount;
    return this;
  }

   /**
   * Get switchesAtOdataCount
   * @return switchesAtOdataCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSwitchesAtOdataCount() {
    return switchesAtOdataCount;
  }


  public void setSwitchesAtOdataCount(Object switchesAtOdataCount) {
    this.switchesAtOdataCount = switchesAtOdataCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChassisV1160Links chassisV1160Links = (ChassisV1160Links) o;
    return Objects.equals(this.computerSystems, chassisV1160Links.computerSystems) &&
        Objects.equals(this.computerSystemsAtOdataCount, chassisV1160Links.computerSystemsAtOdataCount) &&
        Objects.equals(this.containedBy, chassisV1160Links.containedBy) &&
        Objects.equals(this.contains, chassisV1160Links.contains) &&
        Objects.equals(this.containsAtOdataCount, chassisV1160Links.containsAtOdataCount) &&
        Objects.equals(this.cooledBy, chassisV1160Links.cooledBy) &&
        Objects.equals(this.cooledByAtOdataCount, chassisV1160Links.cooledByAtOdataCount) &&
        Objects.equals(this.drives, chassisV1160Links.drives) &&
        Objects.equals(this.drivesAtOdataCount, chassisV1160Links.drivesAtOdataCount) &&
        Objects.equals(this.facility, chassisV1160Links.facility) &&
        Objects.equals(this.managedBy, chassisV1160Links.managedBy) &&
        Objects.equals(this.managedByAtOdataCount, chassisV1160Links.managedByAtOdataCount) &&
        Objects.equals(this.managersInChassis, chassisV1160Links.managersInChassis) &&
        Objects.equals(this.managersInChassisAtOdataCount, chassisV1160Links.managersInChassisAtOdataCount) &&
        Objects.equals(this.oem, chassisV1160Links.oem) &&
        Objects.equals(this.pcIeDevices, chassisV1160Links.pcIeDevices) &&
        Objects.equals(this.pcIeDevicesAtOdataCount, chassisV1160Links.pcIeDevicesAtOdataCount) &&
        Objects.equals(this.poweredBy, chassisV1160Links.poweredBy) &&
        Objects.equals(this.poweredByAtOdataCount, chassisV1160Links.poweredByAtOdataCount) &&
        Objects.equals(this.processors, chassisV1160Links.processors) &&
        Objects.equals(this.processorsAtOdataCount, chassisV1160Links.processorsAtOdataCount) &&
        Objects.equals(this.resourceBlocks, chassisV1160Links.resourceBlocks) &&
        Objects.equals(this.resourceBlocksAtOdataCount, chassisV1160Links.resourceBlocksAtOdataCount) &&
        Objects.equals(this.storage, chassisV1160Links.storage) &&
        Objects.equals(this.storageAtOdataCount, chassisV1160Links.storageAtOdataCount) &&
        Objects.equals(this.switches, chassisV1160Links.switches) &&
        Objects.equals(this.switchesAtOdataCount, chassisV1160Links.switchesAtOdataCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computerSystems, computerSystemsAtOdataCount, containedBy, contains, containsAtOdataCount, cooledBy, cooledByAtOdataCount, drives, drivesAtOdataCount, facility, managedBy, managedByAtOdataCount, managersInChassis, managersInChassisAtOdataCount, oem, pcIeDevices, pcIeDevicesAtOdataCount, poweredBy, poweredByAtOdataCount, processors, processorsAtOdataCount, resourceBlocks, resourceBlocksAtOdataCount, storage, storageAtOdataCount, switches, switchesAtOdataCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChassisV1160Links {\n");
    sb.append("    computerSystems: ").append(toIndentedString(computerSystems)).append("\n");
    sb.append("    computerSystemsAtOdataCount: ").append(toIndentedString(computerSystemsAtOdataCount)).append("\n");
    sb.append("    containedBy: ").append(toIndentedString(containedBy)).append("\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    containsAtOdataCount: ").append(toIndentedString(containsAtOdataCount)).append("\n");
    sb.append("    cooledBy: ").append(toIndentedString(cooledBy)).append("\n");
    sb.append("    cooledByAtOdataCount: ").append(toIndentedString(cooledByAtOdataCount)).append("\n");
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    drivesAtOdataCount: ").append(toIndentedString(drivesAtOdataCount)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    managedByAtOdataCount: ").append(toIndentedString(managedByAtOdataCount)).append("\n");
    sb.append("    managersInChassis: ").append(toIndentedString(managersInChassis)).append("\n");
    sb.append("    managersInChassisAtOdataCount: ").append(toIndentedString(managersInChassisAtOdataCount)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    pcIeDevices: ").append(toIndentedString(pcIeDevices)).append("\n");
    sb.append("    pcIeDevicesAtOdataCount: ").append(toIndentedString(pcIeDevicesAtOdataCount)).append("\n");
    sb.append("    poweredBy: ").append(toIndentedString(poweredBy)).append("\n");
    sb.append("    poweredByAtOdataCount: ").append(toIndentedString(poweredByAtOdataCount)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    processorsAtOdataCount: ").append(toIndentedString(processorsAtOdataCount)).append("\n");
    sb.append("    resourceBlocks: ").append(toIndentedString(resourceBlocks)).append("\n");
    sb.append("    resourceBlocksAtOdataCount: ").append(toIndentedString(resourceBlocksAtOdataCount)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    storageAtOdataCount: ").append(toIndentedString(storageAtOdataCount)).append("\n");
    sb.append("    switches: ").append(toIndentedString(switches)).append("\n");
    sb.append("    switchesAtOdataCount: ").append(toIndentedString(switchesAtOdataCount)).append("\n");
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

