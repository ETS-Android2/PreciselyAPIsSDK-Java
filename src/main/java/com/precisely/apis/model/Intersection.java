/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.Road;
import com.precisely.apis.model.Unit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Intersection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class Intersection {
  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Unit distance;

  public static final String SERIALIZED_NAME_DRIVE_TIME = "driveTime";
  @SerializedName(SERIALIZED_NAME_DRIVE_TIME)
  private Unit driveTime;

  public static final String SERIALIZED_NAME_DRIVE_DISTANCE = "driveDistance";
  @SerializedName(SERIALIZED_NAME_DRIVE_DISTANCE)
  private Unit driveDistance;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public static final String SERIALIZED_NAME_ROADS = "roads";
  @SerializedName(SERIALIZED_NAME_ROADS)
  private Set<Road> roads = null;

  public Intersection() { 
  }

  public Intersection distance(Unit distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Unit getDistance() {
    return distance;
  }


  public void setDistance(Unit distance) {
    this.distance = distance;
  }


  public Intersection driveTime(Unit driveTime) {
    
    this.driveTime = driveTime;
    return this;
  }

   /**
   * Get driveTime
   * @return driveTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Unit getDriveTime() {
    return driveTime;
  }


  public void setDriveTime(Unit driveTime) {
    this.driveTime = driveTime;
  }


  public Intersection driveDistance(Unit driveDistance) {
    
    this.driveDistance = driveDistance;
    return this;
  }

   /**
   * Get driveDistance
   * @return driveDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Unit getDriveDistance() {
    return driveDistance;
  }


  public void setDriveDistance(Unit driveDistance) {
    this.driveDistance = driveDistance;
  }


  public Intersection geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  public Intersection roads(Set<Road> roads) {
    
    this.roads = roads;
    return this;
  }

  public Intersection addRoadsItem(Road roadsItem) {
    if (this.roads == null) {
      this.roads = new LinkedHashSet<Road>();
    }
    this.roads.add(roadsItem);
    return this;
  }

   /**
   * Get roads
   * @return roads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Road> getRoads() {
    return roads;
  }


  public void setRoads(Set<Road> roads) {
    this.roads = roads;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intersection intersection = (Intersection) o;
    return Objects.equals(this.distance, intersection.distance) &&
        Objects.equals(this.driveTime, intersection.driveTime) &&
        Objects.equals(this.driveDistance, intersection.driveDistance) &&
        Objects.equals(this.geometry, intersection.geometry) &&
        Objects.equals(this.roads, intersection.roads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, driveTime, driveDistance, geometry, roads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intersection {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    driveTime: ").append(toIndentedString(driveTime)).append("\n");
    sb.append("    driveDistance: ").append(toIndentedString(driveDistance)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    roads: ").append(toIndentedString(roads)).append("\n");
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

