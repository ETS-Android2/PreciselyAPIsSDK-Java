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
import com.precisely.apis.model.IndexVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CrimeIndexTheme
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class CrimeIndexTheme {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_BOUNDARY_REF = "boundaryRef";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_REF)
  private String boundaryRef;

  public static final String SERIALIZED_NAME_INDEX_VARIABLE = "indexVariable";
  @SerializedName(SERIALIZED_NAME_INDEX_VARIABLE)
  private List<IndexVariable> indexVariable = null;

  public CrimeIndexTheme() { 
  }

  public CrimeIndexTheme source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public CrimeIndexTheme boundaryRef(String boundaryRef) {
    
    this.boundaryRef = boundaryRef;
    return this;
  }

   /**
   * Get boundaryRef
   * @return boundaryRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBoundaryRef() {
    return boundaryRef;
  }


  public void setBoundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
  }


  public CrimeIndexTheme indexVariable(List<IndexVariable> indexVariable) {
    
    this.indexVariable = indexVariable;
    return this;
  }

  public CrimeIndexTheme addIndexVariableItem(IndexVariable indexVariableItem) {
    if (this.indexVariable == null) {
      this.indexVariable = new ArrayList<IndexVariable>();
    }
    this.indexVariable.add(indexVariableItem);
    return this;
  }

   /**
   * Get indexVariable
   * @return indexVariable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IndexVariable> getIndexVariable() {
    return indexVariable;
  }


  public void setIndexVariable(List<IndexVariable> indexVariable) {
    this.indexVariable = indexVariable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeIndexTheme crimeIndexTheme = (CrimeIndexTheme) o;
    return Objects.equals(this.source, crimeIndexTheme.source) &&
        Objects.equals(this.boundaryRef, crimeIndexTheme.boundaryRef) &&
        Objects.equals(this.indexVariable, crimeIndexTheme.indexVariable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, boundaryRef, indexVariable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeIndexTheme {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    boundaryRef: ").append(toIndentedString(boundaryRef)).append("\n");
    sb.append("    indexVariable: ").append(toIndentedString(indexVariable)).append("\n");
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

