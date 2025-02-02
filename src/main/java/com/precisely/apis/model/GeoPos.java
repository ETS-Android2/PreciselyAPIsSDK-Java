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
import com.precisely.apis.model.Crs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GeoPos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class GeoPos {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private List<Double> coordinates = null;

  public static final String SERIALIZED_NAME_CRS = "crs";
  @SerializedName(SERIALIZED_NAME_CRS)
  private Crs crs;

  public GeoPos() { 
  }

  public GeoPos type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GeoPos coordinates(List<Double> coordinates) {
    
    this.coordinates = coordinates;
    return this;
  }

  public GeoPos addCoordinatesItem(Double coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<Double>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getCoordinates() {
    return coordinates;
  }


  public void setCoordinates(List<Double> coordinates) {
    this.coordinates = coordinates;
  }


  public GeoPos crs(Crs crs) {
    
    this.crs = crs;
    return this;
  }

   /**
   * Get crs
   * @return crs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Crs getCrs() {
    return crs;
  }


  public void setCrs(Crs crs) {
    this.crs = crs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoPos geoPos = (GeoPos) o;
    return Objects.equals(this.type, geoPos.type) &&
        Objects.equals(this.coordinates, geoPos.coordinates) &&
        Objects.equals(this.crs, geoPos.crs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates, crs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoPos {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    crs: ").append(toIndentedString(crs)).append("\n");
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

