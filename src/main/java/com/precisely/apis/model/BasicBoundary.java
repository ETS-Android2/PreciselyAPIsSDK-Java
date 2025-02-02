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
import com.precisely.apis.model.BoundaryPoint;
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.ZonesAddress;
import com.precisely.apis.model.ZonesBoundaryGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BasicBoundary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class BasicBoundary {
  public static final String SERIALIZED_NAME_CENTER = "center";
  @SerializedName(SERIALIZED_NAME_CENTER)
  private BoundaryPoint center;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Distance distance;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private ZonesBoundaryGeometry geometry;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private ZonesAddress matchedAddress;

  public BasicBoundary() { 
  }

  public BasicBoundary center(BoundaryPoint center) {
    
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BoundaryPoint getCenter() {
    return center;
  }


  public void setCenter(BoundaryPoint center) {
    this.center = center;
  }


  public BasicBoundary distance(Distance distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Distance getDistance() {
    return distance;
  }


  public void setDistance(Distance distance) {
    this.distance = distance;
  }


  public BasicBoundary geometry(ZonesBoundaryGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZonesBoundaryGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(ZonesBoundaryGeometry geometry) {
    this.geometry = geometry;
  }


  public BasicBoundary matchedAddress(ZonesAddress matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZonesAddress getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(ZonesAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicBoundary basicBoundary = (BasicBoundary) o;
    return Objects.equals(this.center, basicBoundary.center) &&
        Objects.equals(this.distance, basicBoundary.distance) &&
        Objects.equals(this.geometry, basicBoundary.geometry) &&
        Objects.equals(this.matchedAddress, basicBoundary.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(center, distance, geometry, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicBoundary {\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

