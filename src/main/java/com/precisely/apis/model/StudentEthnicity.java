/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.0
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
 * StudentEthnicity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-29T16:11:29.305+05:30")
public class StudentEthnicity   {
  @SerializedName("indianAlaskaNative")
  private String indianAlaskaNative = null;

  @SerializedName("asian")
  private String asian = null;

  @SerializedName("hispanic")
  private String hispanic = null;

  @SerializedName("black")
  private String black = null;

  @SerializedName("white")
  private String white = null;

  @SerializedName("hawaiianPacificlslander")
  private String hawaiianPacificlslander = null;

  @SerializedName("twoOrMoreRaces")
  private String twoOrMoreRaces = null;

  public StudentEthnicity indianAlaskaNative(String indianAlaskaNative) {
    this.indianAlaskaNative = indianAlaskaNative;
    return this;
  }

   /**
   * Get indianAlaskaNative
   * @return indianAlaskaNative
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIndianAlaskaNative() {
    return indianAlaskaNative;
  }

  public void setIndianAlaskaNative(String indianAlaskaNative) {
    this.indianAlaskaNative = indianAlaskaNative;
  }

  public StudentEthnicity asian(String asian) {
    this.asian = asian;
    return this;
  }

   /**
   * Get asian
   * @return asian
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAsian() {
    return asian;
  }

  public void setAsian(String asian) {
    this.asian = asian;
  }

  public StudentEthnicity hispanic(String hispanic) {
    this.hispanic = hispanic;
    return this;
  }

   /**
   * Get hispanic
   * @return hispanic
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHispanic() {
    return hispanic;
  }

  public void setHispanic(String hispanic) {
    this.hispanic = hispanic;
  }

  public StudentEthnicity black(String black) {
    this.black = black;
    return this;
  }

   /**
   * Get black
   * @return black
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBlack() {
    return black;
  }

  public void setBlack(String black) {
    this.black = black;
  }

  public StudentEthnicity white(String white) {
    this.white = white;
    return this;
  }

   /**
   * Get white
   * @return white
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWhite() {
    return white;
  }

  public void setWhite(String white) {
    this.white = white;
  }

  public StudentEthnicity hawaiianPacificlslander(String hawaiianPacificlslander) {
    this.hawaiianPacificlslander = hawaiianPacificlslander;
    return this;
  }

   /**
   * Get hawaiianPacificlslander
   * @return hawaiianPacificlslander
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHawaiianPacificlslander() {
    return hawaiianPacificlslander;
  }

  public void setHawaiianPacificlslander(String hawaiianPacificlslander) {
    this.hawaiianPacificlslander = hawaiianPacificlslander;
  }

  public StudentEthnicity twoOrMoreRaces(String twoOrMoreRaces) {
    this.twoOrMoreRaces = twoOrMoreRaces;
    return this;
  }

   /**
   * Get twoOrMoreRaces
   * @return twoOrMoreRaces
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTwoOrMoreRaces() {
    return twoOrMoreRaces;
  }

  public void setTwoOrMoreRaces(String twoOrMoreRaces) {
    this.twoOrMoreRaces = twoOrMoreRaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentEthnicity studentEthnicity = (StudentEthnicity) o;
    return Objects.equals(this.indianAlaskaNative, studentEthnicity.indianAlaskaNative) &&
        Objects.equals(this.asian, studentEthnicity.asian) &&
        Objects.equals(this.hispanic, studentEthnicity.hispanic) &&
        Objects.equals(this.black, studentEthnicity.black) &&
        Objects.equals(this.white, studentEthnicity.white) &&
        Objects.equals(this.hawaiianPacificlslander, studentEthnicity.hawaiianPacificlslander) &&
        Objects.equals(this.twoOrMoreRaces, studentEthnicity.twoOrMoreRaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indianAlaskaNative, asian, hispanic, black, white, hawaiianPacificlslander, twoOrMoreRaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentEthnicity {\n");
    
    sb.append("    indianAlaskaNative: ").append(toIndentedString(indianAlaskaNative)).append("\n");
    sb.append("    asian: ").append(toIndentedString(asian)).append("\n");
    sb.append("    hispanic: ").append(toIndentedString(hispanic)).append("\n");
    sb.append("    black: ").append(toIndentedString(black)).append("\n");
    sb.append("    white: ").append(toIndentedString(white)).append("\n");
    sb.append("    hawaiianPacificlslander: ").append(toIndentedString(hawaiianPacificlslander)).append("\n");
    sb.append("    twoOrMoreRaces: ").append(toIndentedString(twoOrMoreRaces)).append("\n");
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

