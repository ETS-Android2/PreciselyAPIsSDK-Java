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
import com.precisely.apis.model.Boundaries;
import com.precisely.apis.model.SegmentationThemes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Segmentation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class Segmentation {
  public static final String SERIALIZED_NAME_BOUNDARIES = "boundaries";
  @SerializedName(SERIALIZED_NAME_BOUNDARIES)
  private Boundaries boundaries;

  public static final String SERIALIZED_NAME_THEMES = "themes";
  @SerializedName(SERIALIZED_NAME_THEMES)
  private SegmentationThemes themes;

  public Segmentation() { 
  }

  public Segmentation boundaries(Boundaries boundaries) {
    
    this.boundaries = boundaries;
    return this;
  }

   /**
   * Get boundaries
   * @return boundaries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boundaries getBoundaries() {
    return boundaries;
  }


  public void setBoundaries(Boundaries boundaries) {
    this.boundaries = boundaries;
  }


  public Segmentation themes(SegmentationThemes themes) {
    
    this.themes = themes;
    return this;
  }

   /**
   * Get themes
   * @return themes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SegmentationThemes getThemes() {
    return themes;
  }


  public void setThemes(SegmentationThemes themes) {
    this.themes = themes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segmentation segmentation = (Segmentation) o;
    return Objects.equals(this.boundaries, segmentation.boundaries) &&
        Objects.equals(this.themes, segmentation.themes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaries, themes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segmentation {\n");
    sb.append("    boundaries: ").append(toIndentedString(boundaries)).append("\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
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

