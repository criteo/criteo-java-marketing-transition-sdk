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
import com.criteo.marketing.model.AudienceNameDescription;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Common definition of an audience
 */
@ApiModel(description = "Common definition of an audience")

public class BasicAudienceDefinition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private AudienceNameDescription attributes;


  public BasicAudienceDefinition id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the id of the entity type
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the id of the entity type")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public BasicAudienceDefinition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * the name of the entity type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "the name of the entity type")

  public String getType() {
    return type;
  }



  public void setType(String type) {
    this.type = type;
  }


  public BasicAudienceDefinition attributes(AudienceNameDescription attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AudienceNameDescription getAttributes() {
    return attributes;
  }



  public void setAttributes(AudienceNameDescription attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicAudienceDefinition basicAudienceDefinition = (BasicAudienceDefinition) o;
    return Objects.equals(this.id, basicAudienceDefinition.id) &&
        Objects.equals(this.type, basicAudienceDefinition.type) &&
        Objects.equals(this.attributes, basicAudienceDefinition.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicAudienceDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

