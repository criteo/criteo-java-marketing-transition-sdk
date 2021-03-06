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
import com.criteo.marketing.model.BidMessage;
import com.criteo.marketing.model.CategoryBidMessage;
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
 * CampaignBidMessage
 */

public class CampaignBidMessage {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_CAMPAIGN_BID = "campaignBid";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_BID)
  private BidMessage campaignBid;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoryBidMessage> categories = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_STATUS = "campaignStatus";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_STATUS)
  private Integer campaignStatus;


  public CampaignBidMessage campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCampaignId() {
    return campaignId;
  }



  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignBidMessage campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCampaignName() {
    return campaignName;
  }



  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public CampaignBidMessage campaignBid(BidMessage campaignBid) {
    
    this.campaignBid = campaignBid;
    return this;
  }

   /**
   * Get campaignBid
   * @return campaignBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BidMessage getCampaignBid() {
    return campaignBid;
  }



  public void setCampaignBid(BidMessage campaignBid) {
    this.campaignBid = campaignBid;
  }


  public CampaignBidMessage categories(List<CategoryBidMessage> categories) {
    
    this.categories = categories;
    return this;
  }

  public CampaignBidMessage addCategoriesItem(CategoryBidMessage categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CategoryBidMessage> getCategories() {
    return categories;
  }



  public void setCategories(List<CategoryBidMessage> categories) {
    this.categories = categories;
  }


  public CampaignBidMessage campaignStatus(Integer campaignStatus) {
    
    this.campaignStatus = campaignStatus;
    return this;
  }

   /**
   * Get campaignStatus
   * @return campaignStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCampaignStatus() {
    return campaignStatus;
  }



  public void setCampaignStatus(Integer campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBidMessage campaignBidMessage = (CampaignBidMessage) o;
    return Objects.equals(this.campaignId, campaignBidMessage.campaignId) &&
        Objects.equals(this.campaignName, campaignBidMessage.campaignName) &&
        Objects.equals(this.campaignBid, campaignBidMessage.campaignBid) &&
        Objects.equals(this.categories, campaignBidMessage.categories) &&
        Objects.equals(this.campaignStatus, campaignBidMessage.campaignStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, campaignBid, categories, campaignStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBidMessage {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignBid: ").append(toIndentedString(campaignBid)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
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

