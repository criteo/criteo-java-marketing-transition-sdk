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
import com.criteo.marketing.model.CategoryUpdatesPerCatalogError;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CategoryUpdatesPerCatalogErrorMessageWithDetails
 */

public class CategoryUpdatesPerCatalogErrorMessageWithDetails {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private CategoryUpdatesPerCatalogError details;


  public CategoryUpdatesPerCatalogErrorMessageWithDetails message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }



  public void setMessage(String message) {
    this.message = message;
  }


  public CategoryUpdatesPerCatalogErrorMessageWithDetails details(CategoryUpdatesPerCatalogError details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CategoryUpdatesPerCatalogError getDetails() {
    return details;
  }



  public void setDetails(CategoryUpdatesPerCatalogError details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryUpdatesPerCatalogErrorMessageWithDetails categoryUpdatesPerCatalogErrorMessageWithDetails = (CategoryUpdatesPerCatalogErrorMessageWithDetails) o;
    return Objects.equals(this.message, categoryUpdatesPerCatalogErrorMessageWithDetails.message) &&
        Objects.equals(this.details, categoryUpdatesPerCatalogErrorMessageWithDetails.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdatesPerCatalogErrorMessageWithDetails {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

