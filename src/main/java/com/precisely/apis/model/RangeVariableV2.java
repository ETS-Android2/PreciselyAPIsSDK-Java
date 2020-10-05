/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.FieldV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * RangeVariableV2
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T17:44:57.969+05:30")
public class RangeVariableV2   {
  @SerializedName("count")
  private String count = null;

  @SerializedName("order")
  private String order = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("alias")
  private String alias = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("baseVariable")
  private String baseVariable = null;

  @SerializedName("year")
  private String year = null;

  @SerializedName("field")
  private List<FieldV2> field = new ArrayList<FieldV2>();

  public RangeVariableV2 count(String count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public RangeVariableV2 order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public RangeVariableV2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RangeVariableV2 alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public RangeVariableV2 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RangeVariableV2 baseVariable(String baseVariable) {
    this.baseVariable = baseVariable;
    return this;
  }

   /**
   * Get baseVariable
   * @return baseVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBaseVariable() {
    return baseVariable;
  }

  public void setBaseVariable(String baseVariable) {
    this.baseVariable = baseVariable;
  }

  public RangeVariableV2 year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public RangeVariableV2 field(List<FieldV2> field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<FieldV2> getField() {
    return field;
  }

  public void setField(List<FieldV2> field) {
    this.field = field;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeVariableV2 rangeVariableV2 = (RangeVariableV2) o;
    return Objects.equals(this.count, rangeVariableV2.count) &&
        Objects.equals(this.order, rangeVariableV2.order) &&
        Objects.equals(this.name, rangeVariableV2.name) &&
        Objects.equals(this.alias, rangeVariableV2.alias) &&
        Objects.equals(this.description, rangeVariableV2.description) &&
        Objects.equals(this.baseVariable, rangeVariableV2.baseVariable) &&
        Objects.equals(this.year, rangeVariableV2.year) &&
        Objects.equals(this.field, rangeVariableV2.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, order, name, alias, description, baseVariable, year, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeVariableV2 {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    baseVariable: ").append(toIndentedString(baseVariable)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

