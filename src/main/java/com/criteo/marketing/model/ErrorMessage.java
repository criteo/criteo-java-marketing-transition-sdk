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
import java.util.UUID;

/**
 * This is the message defining an error
 */
@ApiModel(description = "This is the message defining an error")

public class ErrorMessage {
  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private UUID traceId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;


   /**
   * Get traceId
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTraceId() {
    return traceId;
  }




   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }




   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }




   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstance() {
    return instance;
  }




   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }




   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDetail() {
    return detail;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMessage errorMessage = (ErrorMessage) o;
    return Objects.equals(this.traceId, errorMessage.traceId) &&
        Objects.equals(this.type, errorMessage.type) &&
        Objects.equals(this.code, errorMessage.code) &&
        Objects.equals(this.instance, errorMessage.instance) &&
        Objects.equals(this.title, errorMessage.title) &&
        Objects.equals(this.detail, errorMessage.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceId, type, code, instance, title, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessage {\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

