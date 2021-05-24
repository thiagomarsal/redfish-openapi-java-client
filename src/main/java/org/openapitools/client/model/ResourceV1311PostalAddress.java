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

/**
 * The postal address for a resource.
 */
@ApiModel(description = "The postal address for a resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:33:09.083984300-06:00[America/Denver]")
public class ResourceV1311PostalAddress {
  public static final String SERIALIZED_NAME_ADDITIONAL_CODE = "AdditionalCode";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CODE)
  private String additionalCode;

  public static final String SERIALIZED_NAME_BUILDING = "Building";
  @SerializedName(SERIALIZED_NAME_BUILDING)
  private String building;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COMMUNITY = "Community";
  @SerializedName(SERIALIZED_NAME_COMMUNITY)
  private String community;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DISTRICT = "District";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district;

  public static final String SERIALIZED_NAME_DIVISION = "Division";
  @SerializedName(SERIALIZED_NAME_DIVISION)
  private String division;

  public static final String SERIALIZED_NAME_FLOOR = "Floor";
  @SerializedName(SERIALIZED_NAME_FLOOR)
  private String floor;

  public static final String SERIALIZED_NAME_GP_S_COORDS = "GPSCoords";
  @SerializedName(SERIALIZED_NAME_GP_S_COORDS)
  private String gpSCoords;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER = "HouseNumber";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER)
  private Long houseNumber;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER_SUFFIX = "HouseNumberSuffix";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER_SUFFIX)
  private String houseNumberSuffix;

  public static final String SERIALIZED_NAME_LANDMARK = "Landmark";
  @SerializedName(SERIALIZED_NAME_LANDMARK)
  private String landmark;

  public static final String SERIALIZED_NAME_LEADING_STREET_DIRECTION = "LeadingStreetDirection";
  @SerializedName(SERIALIZED_NAME_LEADING_STREET_DIRECTION)
  private String leadingStreetDirection;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEIGHBORHOOD = "Neighborhood";
  @SerializedName(SERIALIZED_NAME_NEIGHBORHOOD)
  private String neighborhood;

  public static final String SERIALIZED_NAME_PO_BOX = "POBox";
  @SerializedName(SERIALIZED_NAME_PO_BOX)
  private String poBox;

  public static final String SERIALIZED_NAME_PLACE_TYPE = "PlaceType";
  @SerializedName(SERIALIZED_NAME_PLACE_TYPE)
  private String placeType;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "PostalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_ROAD = "Road";
  @SerializedName(SERIALIZED_NAME_ROAD)
  private String road;

  public static final String SERIALIZED_NAME_ROAD_BRANCH = "RoadBranch";
  @SerializedName(SERIALIZED_NAME_ROAD_BRANCH)
  private String roadBranch;

  public static final String SERIALIZED_NAME_ROAD_POST_MODIFIER = "RoadPostModifier";
  @SerializedName(SERIALIZED_NAME_ROAD_POST_MODIFIER)
  private String roadPostModifier;

  public static final String SERIALIZED_NAME_ROAD_PRE_MODIFIER = "RoadPreModifier";
  @SerializedName(SERIALIZED_NAME_ROAD_PRE_MODIFIER)
  private String roadPreModifier;

  public static final String SERIALIZED_NAME_ROAD_SECTION = "RoadSection";
  @SerializedName(SERIALIZED_NAME_ROAD_SECTION)
  private String roadSection;

  public static final String SERIALIZED_NAME_ROAD_SUB_BRANCH = "RoadSubBranch";
  @SerializedName(SERIALIZED_NAME_ROAD_SUB_BRANCH)
  private String roadSubBranch;

  public static final String SERIALIZED_NAME_ROOM = "Room";
  @SerializedName(SERIALIZED_NAME_ROOM)
  private String room;

  public static final String SERIALIZED_NAME_SEAT = "Seat";
  @SerializedName(SERIALIZED_NAME_SEAT)
  private String seat;

  public static final String SERIALIZED_NAME_STREET = "Street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_STREET_SUFFIX = "StreetSuffix";
  @SerializedName(SERIALIZED_NAME_STREET_SUFFIX)
  private String streetSuffix;

  public static final String SERIALIZED_NAME_TERRITORY = "Territory";
  @SerializedName(SERIALIZED_NAME_TERRITORY)
  private String territory;

  public static final String SERIALIZED_NAME_TRAILING_STREET_SUFFIX = "TrailingStreetSuffix";
  @SerializedName(SERIALIZED_NAME_TRAILING_STREET_SUFFIX)
  private String trailingStreetSuffix;

  public static final String SERIALIZED_NAME_UNIT = "Unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public ResourceV1311PostalAddress additionalCode(String additionalCode) {
    
    this.additionalCode = additionalCode;
    return this;
  }

   /**
   * The additional code.
   * @return additionalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The additional code.")

  public String getAdditionalCode() {
    return additionalCode;
  }


  public void setAdditionalCode(String additionalCode) {
    this.additionalCode = additionalCode;
  }


  public ResourceV1311PostalAddress building(String building) {
    
    this.building = building;
    return this;
  }

   /**
   * The name of the building.
   * @return building
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the building.")

  public String getBuilding() {
    return building;
  }


  public void setBuilding(String building) {
    this.building = building;
  }


  public ResourceV1311PostalAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City, township, or shi (JP).
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City, township, or shi (JP).")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ResourceV1311PostalAddress community(String community) {
    
    this.community = community;
    return this;
  }

   /**
   * The postal community name.
   * @return community
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal community name.")

  public String getCommunity() {
    return community;
  }


  public void setCommunity(String community) {
    this.community = community;
  }


  public ResourceV1311PostalAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ResourceV1311PostalAddress district(String district) {
    
    this.district = district;
    return this;
  }

   /**
   * A county, parish, gun (JP), or district (IN).
   * @return district
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A county, parish, gun (JP), or district (IN).")

  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    this.district = district;
  }


  public ResourceV1311PostalAddress division(String division) {
    
    this.division = division;
    return this;
  }

   /**
   * City division, borough, city district, ward, or chou (JP).
   * @return division
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City division, borough, city district, ward, or chou (JP).")

  public String getDivision() {
    return division;
  }


  public void setDivision(String division) {
    this.division = division;
  }


  public ResourceV1311PostalAddress floor(String floor) {
    
    this.floor = floor;
    return this;
  }

   /**
   * The floor.
   * @return floor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The floor.")

  public String getFloor() {
    return floor;
  }


  public void setFloor(String floor) {
    this.floor = floor;
  }


  public ResourceV1311PostalAddress gpSCoords(String gpSCoords) {
    
    this.gpSCoords = gpSCoords;
    return this;
  }

   /**
   * The GPS coordinates of the part.
   * @return gpSCoords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GPS coordinates of the part.")

  public String getGpSCoords() {
    return gpSCoords;
  }


  public void setGpSCoords(String gpSCoords) {
    this.gpSCoords = gpSCoords;
  }


  public ResourceV1311PostalAddress houseNumber(Long houseNumber) {
    
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * The numeric portion of house number.
   * @return houseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric portion of house number.")

  public Long getHouseNumber() {
    return houseNumber;
  }


  public void setHouseNumber(Long houseNumber) {
    this.houseNumber = houseNumber;
  }


  public ResourceV1311PostalAddress houseNumberSuffix(String houseNumberSuffix) {
    
    this.houseNumberSuffix = houseNumberSuffix;
    return this;
  }

   /**
   * The house number suffix.
   * @return houseNumberSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The house number suffix.")

  public String getHouseNumberSuffix() {
    return houseNumberSuffix;
  }


  public void setHouseNumberSuffix(String houseNumberSuffix) {
    this.houseNumberSuffix = houseNumberSuffix;
  }


  public ResourceV1311PostalAddress landmark(String landmark) {
    
    this.landmark = landmark;
    return this;
  }

   /**
   * The landmark.
   * @return landmark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The landmark.")

  public String getLandmark() {
    return landmark;
  }


  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }


  public ResourceV1311PostalAddress leadingStreetDirection(String leadingStreetDirection) {
    
    this.leadingStreetDirection = leadingStreetDirection;
    return this;
  }

   /**
   * A leading street direction.
   * @return leadingStreetDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A leading street direction.")

  public String getLeadingStreetDirection() {
    return leadingStreetDirection;
  }


  public void setLeadingStreetDirection(String leadingStreetDirection) {
    this.leadingStreetDirection = leadingStreetDirection;
  }


  public ResourceV1311PostalAddress location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The room designation or other additional information.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The room designation or other additional information.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ResourceV1311PostalAddress name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ResourceV1311PostalAddress neighborhood(String neighborhood) {
    
    this.neighborhood = neighborhood;
    return this;
  }

   /**
   * Neighborhood or block.
   * @return neighborhood
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Neighborhood or block.")

  public String getNeighborhood() {
    return neighborhood;
  }


  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }


  public ResourceV1311PostalAddress poBox(String poBox) {
    
    this.poBox = poBox;
    return this;
  }

   /**
   * The post office box (PO box).
   * @return poBox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The post office box (PO box).")

  public String getPoBox() {
    return poBox;
  }


  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }


  public ResourceV1311PostalAddress placeType(String placeType) {
    
    this.placeType = placeType;
    return this;
  }

   /**
   * The description of the type of place that is addressed.
   * @return placeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the type of place that is addressed.")

  public String getPlaceType() {
    return placeType;
  }


  public void setPlaceType(String placeType) {
    this.placeType = placeType;
  }


  public ResourceV1311PostalAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code or zip code.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code or zip code.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ResourceV1311PostalAddress road(String road) {
    
    this.road = road;
    return this;
  }

   /**
   * The primary road or street.
   * @return road
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary road or street.")

  public String getRoad() {
    return road;
  }


  public void setRoad(String road) {
    this.road = road;
  }


  public ResourceV1311PostalAddress roadBranch(String roadBranch) {
    
    this.roadBranch = roadBranch;
    return this;
  }

   /**
   * The road branch.
   * @return roadBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The road branch.")

  public String getRoadBranch() {
    return roadBranch;
  }


  public void setRoadBranch(String roadBranch) {
    this.roadBranch = roadBranch;
  }


  public ResourceV1311PostalAddress roadPostModifier(String roadPostModifier) {
    
    this.roadPostModifier = roadPostModifier;
    return this;
  }

   /**
   * The road post-modifier.
   * @return roadPostModifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The road post-modifier.")

  public String getRoadPostModifier() {
    return roadPostModifier;
  }


  public void setRoadPostModifier(String roadPostModifier) {
    this.roadPostModifier = roadPostModifier;
  }


  public ResourceV1311PostalAddress roadPreModifier(String roadPreModifier) {
    
    this.roadPreModifier = roadPreModifier;
    return this;
  }

   /**
   * The road pre-modifier.
   * @return roadPreModifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The road pre-modifier.")

  public String getRoadPreModifier() {
    return roadPreModifier;
  }


  public void setRoadPreModifier(String roadPreModifier) {
    this.roadPreModifier = roadPreModifier;
  }


  public ResourceV1311PostalAddress roadSection(String roadSection) {
    
    this.roadSection = roadSection;
    return this;
  }

   /**
   * The road section.
   * @return roadSection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The road section.")

  public String getRoadSection() {
    return roadSection;
  }


  public void setRoadSection(String roadSection) {
    this.roadSection = roadSection;
  }


  public ResourceV1311PostalAddress roadSubBranch(String roadSubBranch) {
    
    this.roadSubBranch = roadSubBranch;
    return this;
  }

   /**
   * The road sub branch.
   * @return roadSubBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The road sub branch.")

  public String getRoadSubBranch() {
    return roadSubBranch;
  }


  public void setRoadSubBranch(String roadSubBranch) {
    this.roadSubBranch = roadSubBranch;
  }


  public ResourceV1311PostalAddress room(String room) {
    
    this.room = room;
    return this;
  }

   /**
   * The name or number of the room.
   * @return room
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name or number of the room.")

  public String getRoom() {
    return room;
  }


  public void setRoom(String room) {
    this.room = room;
  }


  public ResourceV1311PostalAddress seat(String seat) {
    
    this.seat = seat;
    return this;
  }

   /**
   * The seat, such as the desk, cubicle, or workstation.
   * @return seat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The seat, such as the desk, cubicle, or workstation.")

  public String getSeat() {
    return seat;
  }


  public void setSeat(String seat) {
    this.seat = seat;
  }


  public ResourceV1311PostalAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Street name.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street name.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public ResourceV1311PostalAddress streetSuffix(String streetSuffix) {
    
    this.streetSuffix = streetSuffix;
    return this;
  }

   /**
   * Avenue, Platz, Street, Circle.
   * @return streetSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Avenue, Platz, Street, Circle.")

  public String getStreetSuffix() {
    return streetSuffix;
  }


  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }


  public ResourceV1311PostalAddress territory(String territory) {
    
    this.territory = territory;
    return this;
  }

   /**
   * A top-level subdivision within a country.
   * @return territory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A top-level subdivision within a country.")

  public String getTerritory() {
    return territory;
  }


  public void setTerritory(String territory) {
    this.territory = territory;
  }


  public ResourceV1311PostalAddress trailingStreetSuffix(String trailingStreetSuffix) {
    
    this.trailingStreetSuffix = trailingStreetSuffix;
    return this;
  }

   /**
   * A trailing street suffix.
   * @return trailingStreetSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A trailing street suffix.")

  public String getTrailingStreetSuffix() {
    return trailingStreetSuffix;
  }


  public void setTrailingStreetSuffix(String trailingStreetSuffix) {
    this.trailingStreetSuffix = trailingStreetSuffix;
  }


  public ResourceV1311PostalAddress unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The name or number of the apartment unit or suite.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name or number of the apartment unit or suite.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceV1311PostalAddress resourceV1311PostalAddress = (ResourceV1311PostalAddress) o;
    return Objects.equals(this.additionalCode, resourceV1311PostalAddress.additionalCode) &&
        Objects.equals(this.building, resourceV1311PostalAddress.building) &&
        Objects.equals(this.city, resourceV1311PostalAddress.city) &&
        Objects.equals(this.community, resourceV1311PostalAddress.community) &&
        Objects.equals(this.country, resourceV1311PostalAddress.country) &&
        Objects.equals(this.district, resourceV1311PostalAddress.district) &&
        Objects.equals(this.division, resourceV1311PostalAddress.division) &&
        Objects.equals(this.floor, resourceV1311PostalAddress.floor) &&
        Objects.equals(this.gpSCoords, resourceV1311PostalAddress.gpSCoords) &&
        Objects.equals(this.houseNumber, resourceV1311PostalAddress.houseNumber) &&
        Objects.equals(this.houseNumberSuffix, resourceV1311PostalAddress.houseNumberSuffix) &&
        Objects.equals(this.landmark, resourceV1311PostalAddress.landmark) &&
        Objects.equals(this.leadingStreetDirection, resourceV1311PostalAddress.leadingStreetDirection) &&
        Objects.equals(this.location, resourceV1311PostalAddress.location) &&
        Objects.equals(this.name, resourceV1311PostalAddress.name) &&
        Objects.equals(this.neighborhood, resourceV1311PostalAddress.neighborhood) &&
        Objects.equals(this.poBox, resourceV1311PostalAddress.poBox) &&
        Objects.equals(this.placeType, resourceV1311PostalAddress.placeType) &&
        Objects.equals(this.postalCode, resourceV1311PostalAddress.postalCode) &&
        Objects.equals(this.road, resourceV1311PostalAddress.road) &&
        Objects.equals(this.roadBranch, resourceV1311PostalAddress.roadBranch) &&
        Objects.equals(this.roadPostModifier, resourceV1311PostalAddress.roadPostModifier) &&
        Objects.equals(this.roadPreModifier, resourceV1311PostalAddress.roadPreModifier) &&
        Objects.equals(this.roadSection, resourceV1311PostalAddress.roadSection) &&
        Objects.equals(this.roadSubBranch, resourceV1311PostalAddress.roadSubBranch) &&
        Objects.equals(this.room, resourceV1311PostalAddress.room) &&
        Objects.equals(this.seat, resourceV1311PostalAddress.seat) &&
        Objects.equals(this.street, resourceV1311PostalAddress.street) &&
        Objects.equals(this.streetSuffix, resourceV1311PostalAddress.streetSuffix) &&
        Objects.equals(this.territory, resourceV1311PostalAddress.territory) &&
        Objects.equals(this.trailingStreetSuffix, resourceV1311PostalAddress.trailingStreetSuffix) &&
        Objects.equals(this.unit, resourceV1311PostalAddress.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCode, building, city, community, country, district, division, floor, gpSCoords, houseNumber, houseNumberSuffix, landmark, leadingStreetDirection, location, name, neighborhood, poBox, placeType, postalCode, road, roadBranch, roadPostModifier, roadPreModifier, roadSection, roadSubBranch, room, seat, street, streetSuffix, territory, trailingStreetSuffix, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceV1311PostalAddress {\n");
    sb.append("    additionalCode: ").append(toIndentedString(additionalCode)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    gpSCoords: ").append(toIndentedString(gpSCoords)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    houseNumberSuffix: ").append(toIndentedString(houseNumberSuffix)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    leadingStreetDirection: ").append(toIndentedString(leadingStreetDirection)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    placeType: ").append(toIndentedString(placeType)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    road: ").append(toIndentedString(road)).append("\n");
    sb.append("    roadBranch: ").append(toIndentedString(roadBranch)).append("\n");
    sb.append("    roadPostModifier: ").append(toIndentedString(roadPostModifier)).append("\n");
    sb.append("    roadPreModifier: ").append(toIndentedString(roadPreModifier)).append("\n");
    sb.append("    roadSection: ").append(toIndentedString(roadSection)).append("\n");
    sb.append("    roadSubBranch: ").append(toIndentedString(roadSubBranch)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    trailingStreetSuffix: ").append(toIndentedString(trailingStreetSuffix)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

