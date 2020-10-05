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
import com.precisely.apis.model.BufferRelation;
import com.precisely.apis.model.DistanceToBorder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * BoundaryBuffer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T17:44:57.969+05:30")
public class BoundaryBuffer   {
  @SerializedName("bufferRelation")
  private BufferRelation bufferRelation = null;

  @SerializedName("distanceToBorder")
  private DistanceToBorder distanceToBorder = null;

  public BoundaryBuffer bufferRelation(BufferRelation bufferRelation) {
    this.bufferRelation = bufferRelation;
    return this;
  }

   /**
   * Get bufferRelation
   * @return bufferRelation
  **/
  @ApiModelProperty(example = "null", value = "")
  public BufferRelation getBufferRelation() {
    return bufferRelation;
  }

  public void setBufferRelation(BufferRelation bufferRelation) {
    this.bufferRelation = bufferRelation;
  }

  public BoundaryBuffer distanceToBorder(DistanceToBorder distanceToBorder) {
    this.distanceToBorder = distanceToBorder;
    return this;
  }

   /**
   * Get distanceToBorder
   * @return distanceToBorder
  **/
  @ApiModelProperty(example = "null", value = "")
  public DistanceToBorder getDistanceToBorder() {
    return distanceToBorder;
  }

  public void setDistanceToBorder(DistanceToBorder distanceToBorder) {
    this.distanceToBorder = distanceToBorder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoundaryBuffer boundaryBuffer = (BoundaryBuffer) o;
    return Objects.equals(this.bufferRelation, boundaryBuffer.bufferRelation) &&
        Objects.equals(this.distanceToBorder, boundaryBuffer.distanceToBorder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufferRelation, distanceToBorder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoundaryBuffer {\n");
    
    sb.append("    bufferRelation: ").append(toIndentedString(bufferRelation)).append("\n");
    sb.append("    distanceToBorder: ").append(toIndentedString(distanceToBorder)).append("\n");
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

