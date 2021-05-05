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
import com.criteo.marketing.model.AudienceError;
import com.criteo.marketing.model.AudienceWarning;
import com.criteo.marketing.model.BasicAudienceDefinition;
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
 * Response of an audience deletion
 */
@ApiModel(description = "Response of an audience deletion")

public class DeleteAudienceResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private BasicAudienceDefinition data;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AudienceError> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AudienceWarning> warnings = new ArrayList<>();


  public DeleteAudienceResponse data(BasicAudienceDefinition data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public BasicAudienceDefinition getData() {
    return data;
  }



  public void setData(BasicAudienceDefinition data) {
    this.data = data;
  }


  public DeleteAudienceResponse errors(List<AudienceError> errors) {
    
    this.errors = errors;
    return this;
  }

  public DeleteAudienceResponse addErrorsItem(AudienceError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")

  public List<AudienceError> getErrors() {
    return errors;
  }



  public void setErrors(List<AudienceError> errors) {
    this.errors = errors;
  }


  public DeleteAudienceResponse warnings(List<AudienceWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public DeleteAudienceResponse addWarningsItem(AudienceWarning warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "")

  public List<AudienceWarning> getWarnings() {
    return warnings;
  }



  public void setWarnings(List<AudienceWarning> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAudienceResponse deleteAudienceResponse = (DeleteAudienceResponse) o;
    return Objects.equals(this.data, deleteAudienceResponse.data) &&
        Objects.equals(this.errors, deleteAudienceResponse.errors) &&
        Objects.equals(this.warnings, deleteAudienceResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAudienceResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

