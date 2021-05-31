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
 * AddressesPreferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-07T00:19:51.330+05:30")
public class AddressesPreferences   {
  @SerializedName("maxCandidates")
  private String maxCandidates = null;

  @SerializedName("page")
  private String page = null;

  public AddressesPreferences maxCandidates(String maxCandidates) {
    this.maxCandidates = maxCandidates;
    return this;
  }

   /**
   * Get maxCandidates
   * @return maxCandidates
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaxCandidates() {
    return maxCandidates;
  }

  public void setMaxCandidates(String maxCandidates) {
    this.maxCandidates = maxCandidates;
  }

  public AddressesPreferences page(String page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesPreferences addressesPreferences = (AddressesPreferences) o;
    return Objects.equals(this.maxCandidates, addressesPreferences.maxCandidates) &&
        Objects.equals(this.page, addressesPreferences.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCandidates, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesPreferences {\n");
    
    sb.append("    maxCandidates: ").append(toIndentedString(maxCandidates)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

