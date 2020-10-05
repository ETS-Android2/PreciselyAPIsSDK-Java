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
import com.precisely.apis.model.InputParameter;
import com.precisely.apis.model.OutputParameter;
import com.precisely.apis.model.SupportLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Operation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T17:44:57.969+05:30")
public class Operation   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("requiredInputs")
  private List<InputParameter> requiredInputs = new ArrayList<InputParameter>();

  @SerializedName("optionalInputs")
  private List<InputParameter> optionalInputs = new ArrayList<InputParameter>();

  @SerializedName("outputs")
  private List<OutputParameter> outputs = new ArrayList<OutputParameter>();

  @SerializedName("supportLevels")
  private List<SupportLevel> supportLevels = new ArrayList<SupportLevel>();

  public Operation name(String name) {
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

  public Operation requiredInputs(List<InputParameter> requiredInputs) {
    this.requiredInputs = requiredInputs;
    return this;
  }

   /**
   * Get requiredInputs
   * @return requiredInputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InputParameter> getRequiredInputs() {
    return requiredInputs;
  }

  public void setRequiredInputs(List<InputParameter> requiredInputs) {
    this.requiredInputs = requiredInputs;
  }

  public Operation optionalInputs(List<InputParameter> optionalInputs) {
    this.optionalInputs = optionalInputs;
    return this;
  }

   /**
   * Get optionalInputs
   * @return optionalInputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InputParameter> getOptionalInputs() {
    return optionalInputs;
  }

  public void setOptionalInputs(List<InputParameter> optionalInputs) {
    this.optionalInputs = optionalInputs;
  }

  public Operation outputs(List<OutputParameter> outputs) {
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OutputParameter> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<OutputParameter> outputs) {
    this.outputs = outputs;
  }

  public Operation supportLevels(List<SupportLevel> supportLevels) {
    this.supportLevels = supportLevels;
    return this;
  }

   /**
   * Get supportLevels
   * @return supportLevels
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SupportLevel> getSupportLevels() {
    return supportLevels;
  }

  public void setSupportLevels(List<SupportLevel> supportLevels) {
    this.supportLevels = supportLevels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.name, operation.name) &&
        Objects.equals(this.requiredInputs, operation.requiredInputs) &&
        Objects.equals(this.optionalInputs, operation.optionalInputs) &&
        Objects.equals(this.outputs, operation.outputs) &&
        Objects.equals(this.supportLevels, operation.supportLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, requiredInputs, optionalInputs, outputs, supportLevels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requiredInputs: ").append(toIndentedString(requiredInputs)).append("\n");
    sb.append("    optionalInputs: ").append(toIndentedString(optionalInputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    supportLevels: ").append(toIndentedString(supportLevels)).append("\n");
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

