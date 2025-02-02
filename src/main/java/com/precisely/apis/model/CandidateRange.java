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
import com.precisely.apis.model.CandidateRangeUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CandidateRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class CandidateRange {
  public static final String SERIALIZED_NAME_PLACE_NAME = "placeName";
  @SerializedName(SERIALIZED_NAME_PLACE_NAME)
  private String placeName;

  public static final String SERIALIZED_NAME_LOW_HOUSE = "lowHouse";
  @SerializedName(SERIALIZED_NAME_LOW_HOUSE)
  private String lowHouse;

  public static final String SERIALIZED_NAME_HIGH_HOUSE = "highHouse";
  @SerializedName(SERIALIZED_NAME_HIGH_HOUSE)
  private String highHouse;

  /**
   * Gets or Sets side
   */
  @JsonAdapter(SideEnum.Adapter.class)
  public enum SideEnum {
    UNKNOWN("UNKNOWN"),
    
    LEFT("LEFT"),
    
    RIGHT("RIGHT"),
    
    BOTH("BOTH");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SideEnum fromValue(String value) {
      for (SideEnum b : SideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private SideEnum side;

  /**
   * Gets or Sets oddEvenIndicator
   */
  @JsonAdapter(OddEvenIndicatorEnum.Adapter.class)
  public enum OddEvenIndicatorEnum {
    UNKNOWN("UNKNOWN"),
    
    BOTH("BOTH"),
    
    ODD("ODD"),
    
    EVEN("EVEN"),
    
    IRREGULAR("IRREGULAR");

    private String value;

    OddEvenIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OddEvenIndicatorEnum fromValue(String value) {
      for (OddEvenIndicatorEnum b : OddEvenIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OddEvenIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OddEvenIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OddEvenIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OddEvenIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ODD_EVEN_INDICATOR = "oddEvenIndicator";
  @SerializedName(SERIALIZED_NAME_ODD_EVEN_INDICATOR)
  private OddEvenIndicatorEnum oddEvenIndicator;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private List<CandidateRangeUnit> units = null;

  public static final String SERIALIZED_NAME_CUSTOM_VALUES = "customValues";
  @SerializedName(SERIALIZED_NAME_CUSTOM_VALUES)
  private Map<String, Object> customValues = null;

  public CandidateRange() { 
  }

  public CandidateRange placeName(String placeName) {
    
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceName() {
    return placeName;
  }


  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }


  public CandidateRange lowHouse(String lowHouse) {
    
    this.lowHouse = lowHouse;
    return this;
  }

   /**
   * Get lowHouse
   * @return lowHouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLowHouse() {
    return lowHouse;
  }


  public void setLowHouse(String lowHouse) {
    this.lowHouse = lowHouse;
  }


  public CandidateRange highHouse(String highHouse) {
    
    this.highHouse = highHouse;
    return this;
  }

   /**
   * Get highHouse
   * @return highHouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHighHouse() {
    return highHouse;
  }


  public void setHighHouse(String highHouse) {
    this.highHouse = highHouse;
  }


  public CandidateRange side(SideEnum side) {
    
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SideEnum getSide() {
    return side;
  }


  public void setSide(SideEnum side) {
    this.side = side;
  }


  public CandidateRange oddEvenIndicator(OddEvenIndicatorEnum oddEvenIndicator) {
    
    this.oddEvenIndicator = oddEvenIndicator;
    return this;
  }

   /**
   * Get oddEvenIndicator
   * @return oddEvenIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OddEvenIndicatorEnum getOddEvenIndicator() {
    return oddEvenIndicator;
  }


  public void setOddEvenIndicator(OddEvenIndicatorEnum oddEvenIndicator) {
    this.oddEvenIndicator = oddEvenIndicator;
  }


  public CandidateRange units(List<CandidateRangeUnit> units) {
    
    this.units = units;
    return this;
  }

  public CandidateRange addUnitsItem(CandidateRangeUnit unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<CandidateRangeUnit>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CandidateRangeUnit> getUnits() {
    return units;
  }


  public void setUnits(List<CandidateRangeUnit> units) {
    this.units = units;
  }


  public CandidateRange customValues(Map<String, Object> customValues) {
    
    this.customValues = customValues;
    return this;
  }

  public CandidateRange putCustomValuesItem(String key, Object customValuesItem) {
    if (this.customValues == null) {
      this.customValues = new HashMap<String, Object>();
    }
    this.customValues.put(key, customValuesItem);
    return this;
  }

   /**
   * Get customValues
   * @return customValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCustomValues() {
    return customValues;
  }


  public void setCustomValues(Map<String, Object> customValues) {
    this.customValues = customValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateRange candidateRange = (CandidateRange) o;
    return Objects.equals(this.placeName, candidateRange.placeName) &&
        Objects.equals(this.lowHouse, candidateRange.lowHouse) &&
        Objects.equals(this.highHouse, candidateRange.highHouse) &&
        Objects.equals(this.side, candidateRange.side) &&
        Objects.equals(this.oddEvenIndicator, candidateRange.oddEvenIndicator) &&
        Objects.equals(this.units, candidateRange.units) &&
        Objects.equals(this.customValues, candidateRange.customValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeName, lowHouse, highHouse, side, oddEvenIndicator, units, customValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateRange {\n");
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    lowHouse: ").append(toIndentedString(lowHouse)).append("\n");
    sb.append("    highHouse: ").append(toIndentedString(highHouse)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    oddEvenIndicator: ").append(toIndentedString(oddEvenIndicator)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    customValues: ").append(toIndentedString(customValues)).append("\n");
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

