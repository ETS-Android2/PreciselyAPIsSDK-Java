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
import com.precisely.apis.model.EventsCount;
import com.precisely.apis.model.Grid;
import com.precisely.apis.model.MatchedAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * EarthquakeRiskResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T17:44:57.969+05:30")
public class EarthquakeRiskResponse   {
  @SerializedName("riskLevel")
  private String riskLevel = null;

  @SerializedName("eventsCount")
  private EventsCount eventsCount = null;

  @SerializedName("grid")
  private Grid grid = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public EarthquakeRiskResponse riskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }

  public EarthquakeRiskResponse eventsCount(EventsCount eventsCount) {
    this.eventsCount = eventsCount;
    return this;
  }

   /**
   * Get eventsCount
   * @return eventsCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public EventsCount getEventsCount() {
    return eventsCount;
  }

  public void setEventsCount(EventsCount eventsCount) {
    this.eventsCount = eventsCount;
  }

  public EarthquakeRiskResponse grid(Grid grid) {
    this.grid = grid;
    return this;
  }

   /**
   * Get grid
   * @return grid
  **/
  @ApiModelProperty(example = "null", value = "")
  public Grid getGrid() {
    return grid;
  }

  public void setGrid(Grid grid) {
    this.grid = grid;
  }

  public EarthquakeRiskResponse matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarthquakeRiskResponse earthquakeRiskResponse = (EarthquakeRiskResponse) o;
    return Objects.equals(this.riskLevel, earthquakeRiskResponse.riskLevel) &&
        Objects.equals(this.eventsCount, earthquakeRiskResponse.eventsCount) &&
        Objects.equals(this.grid, earthquakeRiskResponse.grid) &&
        Objects.equals(this.matchedAddress, earthquakeRiskResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskLevel, eventsCount, grid, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarthquakeRiskResponse {\n");
    
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

