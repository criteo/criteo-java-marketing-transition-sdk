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
import com.criteo.marketing.model.CategoryUpdateInput;
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
 * CategoryUpdatesPerCatalog
 */

public class CategoryUpdatesPerCatalog {
  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoryUpdateInput> categories = null;


  public CategoryUpdatesPerCatalog catalogId(Integer catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCatalogId() {
    return catalogId;
  }



  public void setCatalogId(Integer catalogId) {
    this.catalogId = catalogId;
  }


  public CategoryUpdatesPerCatalog categories(List<CategoryUpdateInput> categories) {
    
    this.categories = categories;
    return this;
  }

  public CategoryUpdatesPerCatalog addCategoriesItem(CategoryUpdateInput categoriesItem) {
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

  public List<CategoryUpdateInput> getCategories() {
    return categories;
  }



  public void setCategories(List<CategoryUpdateInput> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryUpdatesPerCatalog categoryUpdatesPerCatalog = (CategoryUpdatesPerCatalog) o;
    return Objects.equals(this.catalogId, categoryUpdatesPerCatalog.catalogId) &&
        Objects.equals(this.categories, categoryUpdatesPerCatalog.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdatesPerCatalog {\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

