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
import com.criteo.marketing.model.NillableDecimal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set bidding patch model
 */
@ApiModel(description = "ad set bidding patch model")

public class PatchAdSetBidding {
  public static final String SERIALIZED_NAME_BID_AMOUNT = "bidAmount";
  @SerializedName(SERIALIZED_NAME_BID_AMOUNT)
  private NillableDecimal bidAmount;


  public PatchAdSetBidding bidAmount(NillableDecimal bidAmount) {
    
    this.bidAmount = bidAmount;
    return this;
  }

   /**
   * Get bidAmount
   * @return bidAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NillableDecimal getBidAmount() {
    return bidAmount;
  }



  public void setBidAmount(NillableDecimal bidAmount) {
    this.bidAmount = bidAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchAdSetBidding patchAdSetBidding = (PatchAdSetBidding) o;
    return Objects.equals(this.bidAmount, patchAdSetBidding.bidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchAdSetBidding {\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
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

