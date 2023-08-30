/*
 * Leap
 * The Official Leap API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.leap.client.model;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.leap.client.JSON;

/**
 * CreateMusicgenInferenceDto
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateMusicgenInferenceDto {
  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private String prompt = "An electronic music soundtrack with a trumpet solo";

  /**
   * Select a mode, each option generates different results. Melody is best for melody, music is best for full songs
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    MELODY("melody"),
    
    MUSIC("music");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode = ModeEnum.MELODY;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = 28d;

  public CreateMusicgenInferenceDto() {
  }

  public CreateMusicgenInferenceDto prompt(String prompt) {

    
    
    
    
    this.prompt = prompt;
    return this;
  }

   /**
   * A description of the music you want to generate.
   * @return prompt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "An electronic music soundtrack with a trumpet solo", required = true, value = "A description of the music you want to generate.")

  public String getPrompt() {
    return prompt;
  }


  public void setPrompt(String prompt) {

    
    
    
    this.prompt = prompt;
  }


  public CreateMusicgenInferenceDto mode(ModeEnum mode) {

    
    
    
    
    this.mode = mode;
    return this;
  }

   /**
   * Select a mode, each option generates different results. Melody is best for melody, music is best for full songs
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Select a mode, each option generates different results. Melody is best for melody, music is best for full songs")

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {

    
    
    
    this.mode = mode;
  }


  public CreateMusicgenInferenceDto duration(Double duration) {

    
    
    
    
    this.duration = duration;
    return this;
  }

  public CreateMusicgenInferenceDto duration(Integer duration) {

    
    
    
    
    this.duration = duration.doubleValue();
    return this;
  }

   /**
   * Duration of the generated audio in seconds. Max 30 seconds.
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Duration of the generated audio in seconds. Max 30 seconds.")

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {

    
    
    
    this.duration = duration;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateMusicgenInferenceDto instance itself
   */
  public CreateMusicgenInferenceDto putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMusicgenInferenceDto createMusicgenInferenceDto = (CreateMusicgenInferenceDto) o;
    return Objects.equals(this.prompt, createMusicgenInferenceDto.prompt) &&
        Objects.equals(this.mode, createMusicgenInferenceDto.mode) &&
        Objects.equals(this.duration, createMusicgenInferenceDto.duration)&&
        Objects.equals(this.additionalProperties, createMusicgenInferenceDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, mode, duration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMusicgenInferenceDto {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("prompt");
    openapiFields.add("mode");
    openapiFields.add("duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("prompt");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("duration");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateMusicgenInferenceDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateMusicgenInferenceDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMusicgenInferenceDto is not found in the empty JSON string", CreateMusicgenInferenceDto.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateMusicgenInferenceDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if (!jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMusicgenInferenceDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMusicgenInferenceDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMusicgenInferenceDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMusicgenInferenceDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMusicgenInferenceDto>() {
           @Override
           public void write(JsonWriter out, CreateMusicgenInferenceDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMusicgenInferenceDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateMusicgenInferenceDto instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateMusicgenInferenceDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMusicgenInferenceDto
  * @throws IOException if the JSON string is invalid with respect to CreateMusicgenInferenceDto
  */
  public static CreateMusicgenInferenceDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMusicgenInferenceDto.class);
  }

 /**
  * Convert an instance of CreateMusicgenInferenceDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

