/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.5.1
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
 * GeoLocationCountry
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-07T00:19:51.330+05:30")
public class GeoLocationCountry   {
  @SerializedName("code")
  private String code = null;

  @SerializedName("confidence")
  private String confidence = null;

  @SerializedName("value")
  private String value = null;

  public GeoLocationCountry code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GeoLocationCountry confidence(String confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfidence() {
    return confidence;
  }

  public void setConfidence(String confidence) {
    this.confidence = confidence;
  }

  public GeoLocationCountry value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocationCountry geoLocationCountry = (GeoLocationCountry) o;
    return Objects.equals(this.code, geoLocationCountry.code) &&
        Objects.equals(this.confidence, geoLocationCountry.confidence) &&
        Objects.equals(this.value, geoLocationCountry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, confidence, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocationCountry {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

