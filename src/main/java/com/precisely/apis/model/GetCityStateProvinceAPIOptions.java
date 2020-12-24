/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.0.0
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
 * GetCityStateProvinceAPIOptions
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-22T15:11:18.794+05:30")
public class GetCityStateProvinceAPIOptions   {
  @SerializedName("OutputVanityCity")
  private String outputVanityCity = "N";

  @SerializedName("PerformCanadianProcessing")
  private String performCanadianProcessing = "Y";

  @SerializedName("MaximumResults")
  private String maximumResults = "10";

  @SerializedName("PerformUSProcessing")
  private String performUSProcessing = "Y";

  public GetCityStateProvinceAPIOptions outputVanityCity(String outputVanityCity) {
    this.outputVanityCity = outputVanityCity;
    return this;
  }

   /**
   * Output VanityCity.
   * @return outputVanityCity
  **/
  @ApiModelProperty(example = "null", value = "Output VanityCity.")
  public String getOutputVanityCity() {
    return outputVanityCity;
  }

  public void setOutputVanityCity(String outputVanityCity) {
    this.outputVanityCity = outputVanityCity;
  }

  public GetCityStateProvinceAPIOptions performCanadianProcessing(String performCanadianProcessing) {
    this.performCanadianProcessing = performCanadianProcessing;
    return this;
  }

   /**
   * PerformCanadianProcessing.
   * @return performCanadianProcessing
  **/
  @ApiModelProperty(example = "null", value = "PerformCanadianProcessing.")
  public String getPerformCanadianProcessing() {
    return performCanadianProcessing;
  }

  public void setPerformCanadianProcessing(String performCanadianProcessing) {
    this.performCanadianProcessing = performCanadianProcessing;
  }

  public GetCityStateProvinceAPIOptions maximumResults(String maximumResults) {
    this.maximumResults = maximumResults;
    return this;
  }

   /**
   * MaximumResults.
   * @return maximumResults
  **/
  @ApiModelProperty(example = "null", value = "MaximumResults.")
  public String getMaximumResults() {
    return maximumResults;
  }

  public void setMaximumResults(String maximumResults) {
    this.maximumResults = maximumResults;
  }

  public GetCityStateProvinceAPIOptions performUSProcessing(String performUSProcessing) {
    this.performUSProcessing = performUSProcessing;
    return this;
  }

   /**
   * PerformUSProcessing.
   * @return performUSProcessing
  **/
  @ApiModelProperty(example = "null", value = "PerformUSProcessing.")
  public String getPerformUSProcessing() {
    return performUSProcessing;
  }

  public void setPerformUSProcessing(String performUSProcessing) {
    this.performUSProcessing = performUSProcessing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCityStateProvinceAPIOptions getCityStateProvinceAPIOptions = (GetCityStateProvinceAPIOptions) o;
    return Objects.equals(this.outputVanityCity, getCityStateProvinceAPIOptions.outputVanityCity) &&
        Objects.equals(this.performCanadianProcessing, getCityStateProvinceAPIOptions.performCanadianProcessing) &&
        Objects.equals(this.maximumResults, getCityStateProvinceAPIOptions.maximumResults) &&
        Objects.equals(this.performUSProcessing, getCityStateProvinceAPIOptions.performUSProcessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputVanityCity, performCanadianProcessing, maximumResults, performUSProcessing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCityStateProvinceAPIOptions {\n");
    
    sb.append("    outputVanityCity: ").append(toIndentedString(outputVanityCity)).append("\n");
    sb.append("    performCanadianProcessing: ").append(toIndentedString(performCanadianProcessing)).append("\n");
    sb.append("    maximumResults: ").append(toIndentedString(maximumResults)).append("\n");
    sb.append("    performUSProcessing: ").append(toIndentedString(performUSProcessing)).append("\n");
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

