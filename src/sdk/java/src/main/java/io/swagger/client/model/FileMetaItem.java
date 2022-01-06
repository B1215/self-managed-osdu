/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A meta data item, which allows the association of named properties or property values to a Unit/Measurement/CRS/Azimuth/Time context.
 */
@ApiModel(description = "A meta data item, which allows the association of named properties or property values to a Unit/Measurement/CRS/Azimuth/Time context.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:54:24.273Z")
public class FileMetaItem {
  /**
   * The kind of reference, unit, measurement, CRS or azimuth reference.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    CRS("CRS"),
    
    UNIT("Unit"),
    
    MEASUREMENT("Measurement"),
    
    AZIMUTHREFERENCE("AzimuthReference"),
    
    DATETIME("DateTime");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("kind")
  private KindEnum kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("persistableReference")
  private String persistableReference = null;

  @SerializedName("propertyNames")
  private List<String> propertyNames = null;

  @SerializedName("propertyValues")
  private List<String> propertyValues = null;

  @SerializedName("uncertainty")
  private BigDecimal uncertainty = null;

  public FileMetaItem kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind of reference, unit, measurement, CRS or azimuth reference.
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "The kind of reference, unit, measurement, CRS or azimuth reference.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public FileMetaItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the CRS or the symbol/name of the unit
   * @return name
  **/
  @ApiModelProperty(example = "[\"NAD27 * OGP-Usa Conus / North Dakota South [32021,15851]\",\"ft\"]", value = "The name of the CRS or the symbol/name of the unit")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileMetaItem persistableReference(String persistableReference) {
    this.persistableReference = persistableReference;
    return this;
  }

   /**
   * The persistable reference string uniquely identifying the CRS or Unit
   * @return persistableReference
  **/
  @ApiModelProperty(example = "{\"scaleOffset\":{\"scale\":0.3048006096012192,\"offset\":0.0},\"symbol\":\"ftUS\",\"baseMeasurement\":{\"ancestry\":\"Length\",\"type\":\"UM\"},\"type\":\"USO\"}", required = true, value = "The persistable reference string uniquely identifying the CRS or Unit")
  public String getPersistableReference() {
    return persistableReference;
  }

  public void setPersistableReference(String persistableReference) {
    this.persistableReference = persistableReference;
  }

  public FileMetaItem propertyNames(List<String> propertyNames) {
    this.propertyNames = propertyNames;
    return this;
  }

  public FileMetaItem addPropertyNamesItem(String propertyNamesItem) {
    if (this.propertyNames == null) {
      this.propertyNames = new ArrayList<String>();
    }
    this.propertyNames.add(propertyNamesItem);
    return this;
  }

   /**
   * The list of property names, to which this meta data item provides Unit/CRS context to. Data structures, which come in a single frame of reference, can register the property name, others require a full path like \&quot;data.structureA.propertyB\&quot; to define a unique context.
   * @return propertyNames
  **/
  @ApiModelProperty(example = "[\"elevationFromMsl\",\"\\\"totalDepthMdDriller\",\"wellHeadProjected\"]", value = "The list of property names, to which this meta data item provides Unit/CRS context to. Data structures, which come in a single frame of reference, can register the property name, others require a full path like \"data.structureA.propertyB\" to define a unique context.")
  public List<String> getPropertyNames() {
    return propertyNames;
  }

  public void setPropertyNames(List<String> propertyNames) {
    this.propertyNames = propertyNames;
  }

  public FileMetaItem propertyValues(List<String> propertyValues) {
    this.propertyValues = propertyValues;
    return this;
  }

  public FileMetaItem addPropertyValuesItem(String propertyValuesItem) {
    if (this.propertyValues == null) {
      this.propertyValues = new ArrayList<String>();
    }
    this.propertyValues.add(propertyValuesItem);
    return this;
  }

   /**
   * The list of property values, to which this meta data item provides Unit/CRS context to. Typically a unit symbol is a value to a data structure; this symbol is then registered in this propertyValues array and the persistableReference provides the absolute reference.
   * @return propertyValues
  **/
  @ApiModelProperty(example = "[\"F\",\"ftUS\",\"deg\"]", value = "The list of property values, to which this meta data item provides Unit/CRS context to. Typically a unit symbol is a value to a data structure; this symbol is then registered in this propertyValues array and the persistableReference provides the absolute reference.")
  public List<String> getPropertyValues() {
    return propertyValues;
  }

  public void setPropertyValues(List<String> propertyValues) {
    this.propertyValues = propertyValues;
  }

  public FileMetaItem uncertainty(BigDecimal uncertainty) {
    this.uncertainty = uncertainty;
    return this;
  }

   /**
   * The uncertainty of the values measured given the unit or CRS unit.
   * @return uncertainty
  **/
  @ApiModelProperty(value = "The uncertainty of the values measured given the unit or CRS unit.")
  public BigDecimal getUncertainty() {
    return uncertainty;
  }

  public void setUncertainty(BigDecimal uncertainty) {
    this.uncertainty = uncertainty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMetaItem fileMetaItem = (FileMetaItem) o;
    return Objects.equals(this.kind, fileMetaItem.kind) &&
        Objects.equals(this.name, fileMetaItem.name) &&
        Objects.equals(this.persistableReference, fileMetaItem.persistableReference) &&
        Objects.equals(this.propertyNames, fileMetaItem.propertyNames) &&
        Objects.equals(this.propertyValues, fileMetaItem.propertyValues) &&
        Objects.equals(this.uncertainty, fileMetaItem.uncertainty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, name, persistableReference, propertyNames, propertyValues, uncertainty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMetaItem {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    persistableReference: ").append(toIndentedString(persistableReference)).append("\n");
    sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
    sb.append("    propertyValues: ").append(toIndentedString(propertyValues)).append("\n");
    sb.append("    uncertainty: ").append(toIndentedString(uncertainty)).append("\n");
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

