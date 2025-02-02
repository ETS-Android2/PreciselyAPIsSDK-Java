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
import com.precisely.apis.model.EarthquakeRiskResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EarthquakeRiskResponseList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class EarthquakeRiskResponseList {
  public static final String SERIALIZED_NAME_EARTHQUAKE_RISK = "earthquakeRisk";
  @SerializedName(SERIALIZED_NAME_EARTHQUAKE_RISK)
  private List<EarthquakeRiskResponse> earthquakeRisk = null;

  public EarthquakeRiskResponseList() { 
  }

  public EarthquakeRiskResponseList earthquakeRisk(List<EarthquakeRiskResponse> earthquakeRisk) {
    
    this.earthquakeRisk = earthquakeRisk;
    return this;
  }

  public EarthquakeRiskResponseList addEarthquakeRiskItem(EarthquakeRiskResponse earthquakeRiskItem) {
    if (this.earthquakeRisk == null) {
      this.earthquakeRisk = new ArrayList<EarthquakeRiskResponse>();
    }
    this.earthquakeRisk.add(earthquakeRiskItem);
    return this;
  }

   /**
   * Get earthquakeRisk
   * @return earthquakeRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EarthquakeRiskResponse> getEarthquakeRisk() {
    return earthquakeRisk;
  }


  public void setEarthquakeRisk(List<EarthquakeRiskResponse> earthquakeRisk) {
    this.earthquakeRisk = earthquakeRisk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarthquakeRiskResponseList earthquakeRiskResponseList = (EarthquakeRiskResponseList) o;
    return Objects.equals(this.earthquakeRisk, earthquakeRiskResponseList.earthquakeRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earthquakeRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarthquakeRiskResponseList {\n");
    sb.append("    earthquakeRisk: ").append(toIndentedString(earthquakeRisk)).append("\n");
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

