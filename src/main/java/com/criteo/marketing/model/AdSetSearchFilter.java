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
import java.util.ArrayList;
import java.util.List;

/**
 * filter on ad set ids
 */
@ApiModel(description = "filter on ad set ids")

public class AdSetSearchFilter {
  public static final String SERIALIZED_NAME_AD_SET_IDS = "adSetIds";
  @SerializedName(SERIALIZED_NAME_AD_SET_IDS)
  private List<String> adSetIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<String> campaignIds = null;


  public AdSetSearchFilter adSetIds(List<String> adSetIds) {
    
    this.adSetIds = adSetIds;
    return this;
  }

  public AdSetSearchFilter addAdSetIdsItem(String adSetIdsItem) {
    if (this.adSetIds == null) {
      this.adSetIds = new ArrayList<>();
    }
    this.adSetIds.add(adSetIdsItem);
    return this;
  }

   /**
   * Get adSetIds
   * @return adSetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAdSetIds() {
    return adSetIds;
  }



  public void setAdSetIds(List<String> adSetIds) {
    this.adSetIds = adSetIds;
  }


  public AdSetSearchFilter advertiserIds(List<String> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AdSetSearchFilter addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * Get advertiserIds
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }



  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AdSetSearchFilter campaignIds(List<String> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public AdSetSearchFilter addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCampaignIds() {
    return campaignIds;
  }



  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdSetSearchFilter adSetSearchFilter = (AdSetSearchFilter) o;
    return Objects.equals(this.adSetIds, adSetSearchFilter.adSetIds) &&
        Objects.equals(this.advertiserIds, adSetSearchFilter.advertiserIds) &&
        Objects.equals(this.campaignIds, adSetSearchFilter.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSetIds, advertiserIds, campaignIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdSetSearchFilter {\n");
    sb.append("    adSetIds: ").append(toIndentedString(adSetIds)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

