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
 * the name of the entity type
 */
@ApiModel(description = "the name of the entity type")

public class ContactlistAmendmentAttributes {
  /**
   * Operation to add or remove users
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    ADD("add"),
    
    REMOVE("remove");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  /**
   * What type of identifiers are used
   */
  @JsonAdapter(IdentifierTypeEnum.Adapter.class)
  public enum IdentifierTypeEnum {
    EMAIL("email"),
    
    MADID("madid"),
    
    IDENTITYLINK("identityLink"),
    
    GUM("gum");

    private String value;

    IdentifierTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentifierTypeEnum fromValue(String value) {
      for (IdentifierTypeEnum b : IdentifierTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdentifierTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdentifierTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdentifierTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdentifierTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IDENTIFIER_TYPE = "identifierType";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_TYPE)
  private IdentifierTypeEnum identifierType;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<String> identifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_GUM_CALLER_ID = "gumCallerId";
  @SerializedName(SERIALIZED_NAME_GUM_CALLER_ID)
  private Integer gumCallerId;

  public static final String SERIALIZED_NAME_INTERNAL_IDENTIFIERS = "internalIdentifiers";
  @SerializedName(SERIALIZED_NAME_INTERNAL_IDENTIFIERS)
  private Boolean internalIdentifiers;


  public ContactlistAmendmentAttributes operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Operation to add or remove users
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "Operation to add or remove users")

  public OperationEnum getOperation() {
    return operation;
  }



  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public ContactlistAmendmentAttributes identifierType(IdentifierTypeEnum identifierType) {
    
    this.identifierType = identifierType;
    return this;
  }

   /**
   * What type of identifiers are used
   * @return identifierType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What type of identifiers are used")

  public IdentifierTypeEnum getIdentifierType() {
    return identifierType;
  }



  public void setIdentifierType(IdentifierTypeEnum identifierType) {
    this.identifierType = identifierType;
  }


  public ContactlistAmendmentAttributes identifiers(List<String> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public ContactlistAmendmentAttributes addIdentifiersItem(String identifiersItem) {
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * The users tos add or remove, each in the schema specified
   * @return identifiers
  **/
  @ApiModelProperty(required = true, value = "The users tos add or remove, each in the schema specified")

  public List<String> getIdentifiers() {
    return identifiers;
  }



  public void setIdentifiers(List<String> identifiers) {
    this.identifiers = identifiers;
  }


  public ContactlistAmendmentAttributes gumCallerId(Integer gumCallerId) {
    
    this.gumCallerId = gumCallerId;
    return this;
  }

   /**
   * The Gum caller id of the advertiser patching identifiers of type Gum
   * @return gumCallerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Gum caller id of the advertiser patching identifiers of type Gum")

  public Integer getGumCallerId() {
    return gumCallerId;
  }



  public void setGumCallerId(Integer gumCallerId) {
    this.gumCallerId = gumCallerId;
  }


  public ContactlistAmendmentAttributes internalIdentifiers(Boolean internalIdentifiers) {
    
    this.internalIdentifiers = internalIdentifiers;
    return this;
  }

   /**
   * The flag to indicate if identifiers are external or internal
   * @return internalIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flag to indicate if identifiers are external or internal")

  public Boolean getInternalIdentifiers() {
    return internalIdentifiers;
  }



  public void setInternalIdentifiers(Boolean internalIdentifiers) {
    this.internalIdentifiers = internalIdentifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactlistAmendmentAttributes contactlistAmendmentAttributes = (ContactlistAmendmentAttributes) o;
    return Objects.equals(this.operation, contactlistAmendmentAttributes.operation) &&
        Objects.equals(this.identifierType, contactlistAmendmentAttributes.identifierType) &&
        Objects.equals(this.identifiers, contactlistAmendmentAttributes.identifiers) &&
        Objects.equals(this.gumCallerId, contactlistAmendmentAttributes.gumCallerId) &&
        Objects.equals(this.internalIdentifiers, contactlistAmendmentAttributes.internalIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, identifierType, identifiers, gumCallerId, internalIdentifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactlistAmendmentAttributes {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    gumCallerId: ").append(toIndentedString(gumCallerId)).append("\n");
    sb.append("    internalIdentifiers: ").append(toIndentedString(internalIdentifiers)).append("\n");
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

