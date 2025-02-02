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
import com.precisely.apis.model.BufferRelation;
import com.precisely.apis.model.DistanceToBorder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BoundaryBuffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class BoundaryBuffer {
  public static final String SERIALIZED_NAME_BUFFER_RELATION = "bufferRelation";
  @SerializedName(SERIALIZED_NAME_BUFFER_RELATION)
  private BufferRelation bufferRelation;

  public static final String SERIALIZED_NAME_DISTANCE_TO_BORDER = "distanceToBorder";
  @SerializedName(SERIALIZED_NAME_DISTANCE_TO_BORDER)
  private DistanceToBorder distanceToBorder;

  public BoundaryBuffer() { 
  }

  public BoundaryBuffer bufferRelation(BufferRelation bufferRelation) {
    
    this.bufferRelation = bufferRelation;
    return this;
  }

   /**
   * Get bufferRelation
   * @return bufferRelation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BufferRelation getBufferRelation() {
    return bufferRelation;
  }


  public void setBufferRelation(BufferRelation bufferRelation) {
    this.bufferRelation = bufferRelation;
  }


  public BoundaryBuffer distanceToBorder(DistanceToBorder distanceToBorder) {
    
    this.distanceToBorder = distanceToBorder;
    return this;
  }

   /**
   * Get distanceToBorder
   * @return distanceToBorder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DistanceToBorder getDistanceToBorder() {
    return distanceToBorder;
  }


  public void setDistanceToBorder(DistanceToBorder distanceToBorder) {
    this.distanceToBorder = distanceToBorder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoundaryBuffer boundaryBuffer = (BoundaryBuffer) o;
    return Objects.equals(this.bufferRelation, boundaryBuffer.bufferRelation) &&
        Objects.equals(this.distanceToBorder, boundaryBuffer.distanceToBorder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufferRelation, distanceToBorder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoundaryBuffer {\n");
    sb.append("    bufferRelation: ").append(toIndentedString(bufferRelation)).append("\n");
    sb.append("    distanceToBorder: ").append(toIndentedString(distanceToBorder)).append("\n");
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

