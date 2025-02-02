/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.AddressesDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AddressesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class AddressesResponse {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private String page;

  public static final String SERIALIZED_NAME_CANDIDATES = "candidates";
  @SerializedName(SERIALIZED_NAME_CANDIDATES)
  private String candidates;

  public static final String SERIALIZED_NAME_ADDRESS_LIST = "addressList";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LIST)
  private List<AddressesDTO> addressList = null;

  public AddressesResponse() { 
  }

  public AddressesResponse page(String page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPage() {
    return page;
  }


  public void setPage(String page) {
    this.page = page;
  }


  public AddressesResponse candidates(String candidates) {
    
    this.candidates = candidates;
    return this;
  }

   /**
   * Get candidates
   * @return candidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCandidates() {
    return candidates;
  }


  public void setCandidates(String candidates) {
    this.candidates = candidates;
  }


  public AddressesResponse addressList(List<AddressesDTO> addressList) {
    
    this.addressList = addressList;
    return this;
  }

  public AddressesResponse addAddressListItem(AddressesDTO addressListItem) {
    if (this.addressList == null) {
      this.addressList = new ArrayList<AddressesDTO>();
    }
    this.addressList.add(addressListItem);
    return this;
  }

   /**
   * Get addressList
   * @return addressList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AddressesDTO> getAddressList() {
    return addressList;
  }


  public void setAddressList(List<AddressesDTO> addressList) {
    this.addressList = addressList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesResponse addressesResponse = (AddressesResponse) o;
    return Objects.equals(this.page, addressesResponse.page) &&
        Objects.equals(this.candidates, addressesResponse.candidates) &&
        Objects.equals(this.addressList, addressesResponse.addressList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, candidates, addressList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesResponse {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
    sb.append("    addressList: ").append(toIndentedString(addressList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

