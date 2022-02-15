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
 * CrimeRiskPreferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-17T18:45:55.748+05:30")
public class CrimeRiskPreferences   {
  @SerializedName("includeGeometry")
  private String includeGeometry = null;

  @SerializedName("type")
  private String type = null;

  public CrimeRiskPreferences includeGeometry(String includeGeometry) {
    this.includeGeometry = includeGeometry;
    return this;
  }

   /**
   * Get includeGeometry
   * @return includeGeometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIncludeGeometry() {
    return includeGeometry;
  }

  public void setIncludeGeometry(String includeGeometry) {
    this.includeGeometry = includeGeometry;
  }

  public CrimeRiskPreferences type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeRiskPreferences crimeRiskPreferences = (CrimeRiskPreferences) o;
    return Objects.equals(this.includeGeometry, crimeRiskPreferences.includeGeometry) &&
        Objects.equals(this.type, crimeRiskPreferences.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeGeometry, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeRiskPreferences {\n");
    
    sb.append("    includeGeometry: ").append(toIndentedString(includeGeometry)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

