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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ZonesSic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class ZonesSic {
  public static final String SERIALIZED_NAME_BUSINESS_LINE = "businessLine";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LINE)
  private String businessLine;

  public static final String SERIALIZED_NAME_SIC_CODE = "sicCode";
  @SerializedName(SERIALIZED_NAME_SIC_CODE)
  private String sicCode;

  public static final String SERIALIZED_NAME_SIC_CODE_DESCRIPTION = "sicCodeDescription";
  @SerializedName(SERIALIZED_NAME_SIC_CODE_DESCRIPTION)
  private String sicCodeDescription;

  public static final String SERIALIZED_NAME_PRIMARY_SIC_CODE = "primarySicCode";
  @SerializedName(SERIALIZED_NAME_PRIMARY_SIC_CODE)
  private String primarySicCode;

  public ZonesSic() { 
  }

  public ZonesSic businessLine(String businessLine) {
    
    this.businessLine = businessLine;
    return this;
  }

   /**
   * Get businessLine
   * @return businessLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusinessLine() {
    return businessLine;
  }


  public void setBusinessLine(String businessLine) {
    this.businessLine = businessLine;
  }


  public ZonesSic sicCode(String sicCode) {
    
    this.sicCode = sicCode;
    return this;
  }

   /**
   * Get sicCode
   * @return sicCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSicCode() {
    return sicCode;
  }


  public void setSicCode(String sicCode) {
    this.sicCode = sicCode;
  }


  public ZonesSic sicCodeDescription(String sicCodeDescription) {
    
    this.sicCodeDescription = sicCodeDescription;
    return this;
  }

   /**
   * Get sicCodeDescription
   * @return sicCodeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSicCodeDescription() {
    return sicCodeDescription;
  }


  public void setSicCodeDescription(String sicCodeDescription) {
    this.sicCodeDescription = sicCodeDescription;
  }


  public ZonesSic primarySicCode(String primarySicCode) {
    
    this.primarySicCode = primarySicCode;
    return this;
  }

   /**
   * Get primarySicCode
   * @return primarySicCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimarySicCode() {
    return primarySicCode;
  }


  public void setPrimarySicCode(String primarySicCode) {
    this.primarySicCode = primarySicCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesSic zonesSic = (ZonesSic) o;
    return Objects.equals(this.businessLine, zonesSic.businessLine) &&
        Objects.equals(this.sicCode, zonesSic.sicCode) &&
        Objects.equals(this.sicCodeDescription, zonesSic.sicCodeDescription) &&
        Objects.equals(this.primarySicCode, zonesSic.primarySicCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLine, sicCode, sicCodeDescription, primarySicCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonesSic {\n");
    sb.append("    businessLine: ").append(toIndentedString(businessLine)).append("\n");
    sb.append("    sicCode: ").append(toIndentedString(sicCode)).append("\n");
    sb.append("    sicCodeDescription: ").append(toIndentedString(sicCodeDescription)).append("\n");
    sb.append("    primarySicCode: ").append(toIndentedString(primarySicCode)).append("\n");
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

