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
import com.precisely.apis.model.ValidateMailingAddressInputRowUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ValidateMailingAddressProOutput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-29T16:11:29.305+05:30")
public class ValidateMailingAddressProOutput   {
  @SerializedName("user_fields")
  private List<ValidateMailingAddressInputRowUserFields> userFields = new ArrayList<ValidateMailingAddressInputRowUserFields>();

  @SerializedName("AddressLine1")
  private String addressLine1 = null;

  @SerializedName("AddressLine2")
  private String addressLine2 = null;

  @SerializedName("FirmName")
  private String firmName = null;

  @SerializedName("ChangeScore")
  private String changeScore = null;

  @SerializedName("Locality")
  private String locality = null;

  @SerializedName("Suburb")
  private String suburb = null;

  @SerializedName("AddressType")
  private String addressType = null;

  @SerializedName("Deliverability")
  private String deliverability = null;

  @SerializedName("AddressQuality")
  private String addressQuality = null;

  @SerializedName("CouldNotValidate")
  private String couldNotValidate = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("StateProvince")
  private String stateProvince = null;

  @SerializedName("BlockAddress")
  private String blockAddress = null;

  @SerializedName("AdditionalInputData")
  private String additionalInputData = null;

  @SerializedName("PostalCode.Base")
  private String postalCodeBase = null;

  @SerializedName("PostalCode.AddOn")
  private String postalCodeAddOn = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Status.Code")
  private String statusCode = null;

  @SerializedName("Status.Description")
  private String statusDescription = null;

  public ValidateMailingAddressProOutput userFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
    return this;
  }

   /**
   * These fields are returned, unmodified, in the user_fields section of the response.
   * @return userFields
  **/
  @ApiModelProperty(example = "null", value = "These fields are returned, unmodified, in the user_fields section of the response.")
  public List<ValidateMailingAddressInputRowUserFields> getUserFields() {
    return userFields;
  }

  public void setUserFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
  }

  public ValidateMailingAddressProOutput addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the validated address.
   * @return addressLine1
  **/
  @ApiModelProperty(example = "null", value = "The first line of the validated address.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ValidateMailingAddressProOutput addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the validated address.
   * @return addressLine2
  **/
  @ApiModelProperty(example = "null", value = "The second line of the validated address.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ValidateMailingAddressProOutput firmName(String firmName) {
    this.firmName = firmName;
    return this;
  }

   /**
   * The validated firm or company name.
   * @return firmName
  **/
  @ApiModelProperty(example = "null", value = "The validated firm or company name.")
  public String getFirmName() {
    return firmName;
  }

  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }

  public ValidateMailingAddressProOutput changeScore(String changeScore) {
    this.changeScore = changeScore;
    return this;
  }

   /**
   * A value of 0 and 100 that reflects how much the address has changed to make it valid.
   * @return changeScore
  **/
  @ApiModelProperty(example = "null", value = "A value of 0 and 100 that reflects how much the address has changed to make it valid.")
  public String getChangeScore() {
    return changeScore;
  }

  public void setChangeScore(String changeScore) {
    this.changeScore = changeScore;
  }

  public ValidateMailingAddressProOutput locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Generally a locality is a village in rural areas or it may be a suburb in urban areas.
   * @return locality
  **/
  @ApiModelProperty(example = "null", value = "Generally a locality is a village in rural areas or it may be a suburb in urban areas.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public ValidateMailingAddressProOutput suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * The suburb name.
   * @return suburb
  **/
  @ApiModelProperty(example = "null", value = "The suburb name.")
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public ValidateMailingAddressProOutput addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * A single letter code that indicates the type of address.
   * @return addressType
  **/
  @ApiModelProperty(example = "null", value = "A single letter code that indicates the type of address.")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public ValidateMailingAddressProOutput deliverability(String deliverability) {
    this.deliverability = deliverability;
    return this;
  }

   /**
   * An estimate of confidence that an item mailed or shipped to this address would be successfully delivered.
   * @return deliverability
  **/
  @ApiModelProperty(example = "null", value = "An estimate of confidence that an item mailed or shipped to this address would be successfully delivered.")
  public String getDeliverability() {
    return deliverability;
  }

  public void setDeliverability(String deliverability) {
    this.deliverability = deliverability;
  }

  public ValidateMailingAddressProOutput addressQuality(String addressQuality) {
    this.addressQuality = addressQuality;
    return this;
  }

   /**
   * A two character code indicating overall quality of the resulting address.
   * @return addressQuality
  **/
  @ApiModelProperty(example = "null", value = "A two character code indicating overall quality of the resulting address.")
  public String getAddressQuality() {
    return addressQuality;
  }

  public void setAddressQuality(String addressQuality) {
    this.addressQuality = addressQuality;
  }

  public ValidateMailingAddressProOutput couldNotValidate(String couldNotValidate) {
    this.couldNotValidate = couldNotValidate;
    return this;
  }

   /**
   * Mentions the address component that could not be validated, in case no match is found.
   * @return couldNotValidate
  **/
  @ApiModelProperty(example = "null", value = "Mentions the address component that could not be validated, in case no match is found.")
  public String getCouldNotValidate() {
    return couldNotValidate;
  }

  public void setCouldNotValidate(String couldNotValidate) {
    this.couldNotValidate = couldNotValidate;
  }

  public ValidateMailingAddressProOutput city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The validated city name.
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "The validated city name.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ValidateMailingAddressProOutput postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The validated ZIP Code or postal code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "The validated ZIP Code or postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ValidateMailingAddressProOutput country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country in the format determined by what you selected.
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "The country in the format determined by what you selected.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ValidateMailingAddressProOutput stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The validated state or province abbreviation.
   * @return stateProvince
  **/
  @ApiModelProperty(example = "null", value = "The validated state or province abbreviation.")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public ValidateMailingAddressProOutput blockAddress(String blockAddress) {
    this.blockAddress = blockAddress;
    return this;
  }

   /**
   * The formatted address, as it would appear on a physical mail piece.
   * @return blockAddress
  **/
  @ApiModelProperty(example = "null", value = "The formatted address, as it would appear on a physical mail piece.")
  public String getBlockAddress() {
    return blockAddress;
  }

  public void setBlockAddress(String blockAddress) {
    this.blockAddress = blockAddress;
  }

  public ValidateMailingAddressProOutput additionalInputData(String additionalInputData) {
    this.additionalInputData = additionalInputData;
    return this;
  }

   /**
   * Input data that could not be matched to a particular address component.
   * @return additionalInputData
  **/
  @ApiModelProperty(example = "null", value = "Input data that could not be matched to a particular address component.")
  public String getAdditionalInputData() {
    return additionalInputData;
  }

  public void setAdditionalInputData(String additionalInputData) {
    this.additionalInputData = additionalInputData;
  }

  public ValidateMailingAddressProOutput postalCodeBase(String postalCodeBase) {
    this.postalCodeBase = postalCodeBase;
    return this;
  }

   /**
   * The 5-digit ZIP Code.
   * @return postalCodeBase
  **/
  @ApiModelProperty(example = "null", value = "The 5-digit ZIP Code.")
  public String getPostalCodeBase() {
    return postalCodeBase;
  }

  public void setPostalCodeBase(String postalCodeBase) {
    this.postalCodeBase = postalCodeBase;
  }

  public ValidateMailingAddressProOutput postalCodeAddOn(String postalCodeAddOn) {
    this.postalCodeAddOn = postalCodeAddOn;
    return this;
  }

   /**
   * The 4-digit add-on part of the ZIP Code.
   * @return postalCodeAddOn
  **/
  @ApiModelProperty(example = "null", value = "The 4-digit add-on part of the ZIP Code.")
  public String getPostalCodeAddOn() {
    return postalCodeAddOn;
  }

  public void setPostalCodeAddOn(String postalCodeAddOn) {
    this.postalCodeAddOn = postalCodeAddOn;
  }

  public ValidateMailingAddressProOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Reports the success or failure of the match attempt.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Reports the success or failure of the match attempt.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ValidateMailingAddressProOutput statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Reason for failure, if there is one.
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "Reason for failure, if there is one.")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public ValidateMailingAddressProOutput statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Description of the problem, if there is one.
   * @return statusDescription
  **/
  @ApiModelProperty(example = "null", value = "Description of the problem, if there is one.")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressProOutput validateMailingAddressProOutput = (ValidateMailingAddressProOutput) o;
    return Objects.equals(this.userFields, validateMailingAddressProOutput.userFields) &&
        Objects.equals(this.addressLine1, validateMailingAddressProOutput.addressLine1) &&
        Objects.equals(this.addressLine2, validateMailingAddressProOutput.addressLine2) &&
        Objects.equals(this.firmName, validateMailingAddressProOutput.firmName) &&
        Objects.equals(this.changeScore, validateMailingAddressProOutput.changeScore) &&
        Objects.equals(this.locality, validateMailingAddressProOutput.locality) &&
        Objects.equals(this.suburb, validateMailingAddressProOutput.suburb) &&
        Objects.equals(this.addressType, validateMailingAddressProOutput.addressType) &&
        Objects.equals(this.deliverability, validateMailingAddressProOutput.deliverability) &&
        Objects.equals(this.addressQuality, validateMailingAddressProOutput.addressQuality) &&
        Objects.equals(this.couldNotValidate, validateMailingAddressProOutput.couldNotValidate) &&
        Objects.equals(this.city, validateMailingAddressProOutput.city) &&
        Objects.equals(this.postalCode, validateMailingAddressProOutput.postalCode) &&
        Objects.equals(this.country, validateMailingAddressProOutput.country) &&
        Objects.equals(this.stateProvince, validateMailingAddressProOutput.stateProvince) &&
        Objects.equals(this.blockAddress, validateMailingAddressProOutput.blockAddress) &&
        Objects.equals(this.additionalInputData, validateMailingAddressProOutput.additionalInputData) &&
        Objects.equals(this.postalCodeBase, validateMailingAddressProOutput.postalCodeBase) &&
        Objects.equals(this.postalCodeAddOn, validateMailingAddressProOutput.postalCodeAddOn) &&
        Objects.equals(this.status, validateMailingAddressProOutput.status) &&
        Objects.equals(this.statusCode, validateMailingAddressProOutput.statusCode) &&
        Objects.equals(this.statusDescription, validateMailingAddressProOutput.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, addressLine1, addressLine2, firmName, changeScore, locality, suburb, addressType, deliverability, addressQuality, couldNotValidate, city, postalCode, country, stateProvince, blockAddress, additionalInputData, postalCodeBase, postalCodeAddOn, status, statusCode, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressProOutput {\n");
    
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    changeScore: ").append(toIndentedString(changeScore)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    deliverability: ").append(toIndentedString(deliverability)).append("\n");
    sb.append("    addressQuality: ").append(toIndentedString(addressQuality)).append("\n");
    sb.append("    couldNotValidate: ").append(toIndentedString(couldNotValidate)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    blockAddress: ").append(toIndentedString(blockAddress)).append("\n");
    sb.append("    additionalInputData: ").append(toIndentedString(additionalInputData)).append("\n");
    sb.append("    postalCodeBase: ").append(toIndentedString(postalCodeBase)).append("\n");
    sb.append("    postalCodeAddOn: ").append(toIndentedString(postalCodeAddOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
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

