/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.8.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * PoiBoundaryPreferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-17T18:45:55.748+05:30")
public class PoiBoundaryPreferences   {
  @SerializedName("categoryCode")
  private String categoryCode = null;

  @SerializedName("sicCode")
  private String sicCode = null;

  @SerializedName("naicsCode")
  private String naicsCode = null;

  public PoiBoundaryPreferences categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public PoiBoundaryPreferences sicCode(String sicCode) {
    this.sicCode = sicCode;
    return this;
  }

   /**
   * Get sicCode
   * @return sicCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSicCode() {
    return sicCode;
  }

  public void setSicCode(String sicCode) {
    this.sicCode = sicCode;
  }

  public PoiBoundaryPreferences naicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
    return this;
  }

   /**
   * Get naicsCode
   * @return naicsCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNaicsCode() {
    return naicsCode;
  }

  public void setNaicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiBoundaryPreferences poiBoundaryPreferences = (PoiBoundaryPreferences) o;
    return Objects.equals(this.categoryCode, poiBoundaryPreferences.categoryCode) &&
        Objects.equals(this.sicCode, poiBoundaryPreferences.sicCode) &&
        Objects.equals(this.naicsCode, poiBoundaryPreferences.naicsCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, sicCode, naicsCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiBoundaryPreferences {\n");
    
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    sicCode: ").append(toIndentedString(sicCode)).append("\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
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

