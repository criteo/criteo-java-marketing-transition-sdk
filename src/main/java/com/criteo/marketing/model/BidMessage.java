/*
 * Criteo API Transition Swagger
 * This is used to help Criteo clients transition from MAPI to Criteo API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.marketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BidMessage
 */

public class BidMessage {
  public static final String SERIALIZED_NAME_BID_VALUE = "bidValue";
  @SerializedName(SERIALIZED_NAME_BID_VALUE)
  private Double bidValue;

  public static final String SERIALIZED_NAME_BID_CURRENCY = "bidCurrency";
  @SerializedName(SERIALIZED_NAME_BID_CURRENCY)
  private String bidCurrency;

  /**
   * Gets or Sets bidType
   */
  @JsonAdapter(BidTypeEnum.Adapter.class)
  public enum BidTypeEnum {
    UNKNOWN("Unknown"),
    
    CPC("CPC"),
    
    COS("COS"),
    
    CPO("CPO");

    private String value;

    BidTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BidTypeEnum fromValue(String value) {
      for (BidTypeEnum b : BidTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BidTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BidTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BidTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BidTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BID_TYPE = "bidType";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private BidTypeEnum bidType;

  public static final String SERIALIZED_NAME_BID_IS_PENDING = "bidIsPending";
  @SerializedName(SERIALIZED_NAME_BID_IS_PENDING)
  private Boolean bidIsPending;


  public BidMessage bidValue(Double bidValue) {
    
    this.bidValue = bidValue;
    return this;
  }

   /**
   * Get bidValue
   * @return bidValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBidValue() {
    return bidValue;
  }



  public void setBidValue(Double bidValue) {
    this.bidValue = bidValue;
  }


  public BidMessage bidCurrency(String bidCurrency) {
    
    this.bidCurrency = bidCurrency;
    return this;
  }

   /**
   * Get bidCurrency
   * @return bidCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBidCurrency() {
    return bidCurrency;
  }



  public void setBidCurrency(String bidCurrency) {
    this.bidCurrency = bidCurrency;
  }


  public BidMessage bidType(BidTypeEnum bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BidTypeEnum getBidType() {
    return bidType;
  }



  public void setBidType(BidTypeEnum bidType) {
    this.bidType = bidType;
  }


  public BidMessage bidIsPending(Boolean bidIsPending) {
    
    this.bidIsPending = bidIsPending;
    return this;
  }

   /**
   * Get bidIsPending
   * @return bidIsPending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBidIsPending() {
    return bidIsPending;
  }



  public void setBidIsPending(Boolean bidIsPending) {
    this.bidIsPending = bidIsPending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidMessage bidMessage = (BidMessage) o;
    return Objects.equals(this.bidValue, bidMessage.bidValue) &&
        Objects.equals(this.bidCurrency, bidMessage.bidCurrency) &&
        Objects.equals(this.bidType, bidMessage.bidType) &&
        Objects.equals(this.bidIsPending, bidMessage.bidIsPending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidValue, bidCurrency, bidType, bidIsPending);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidMessage {\n");
    sb.append("    bidValue: ").append(toIndentedString(bidValue)).append("\n");
    sb.append("    bidCurrency: ").append(toIndentedString(bidCurrency)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    bidIsPending: ").append(toIndentedString(bidIsPending)).append("\n");
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

