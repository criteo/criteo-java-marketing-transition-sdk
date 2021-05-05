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
 * Class with elementary info about advertiser
 */
@ApiModel(description = "Class with elementary info about advertiser")

public class PortfolioMessage {
  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiserName";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName;


  public PortfolioMessage advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * Get advertiserName
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdvertiserName() {
    return advertiserName;
  }



  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioMessage portfolioMessage = (PortfolioMessage) o;
    return Objects.equals(this.advertiserName, portfolioMessage.advertiserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioMessage {\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
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

