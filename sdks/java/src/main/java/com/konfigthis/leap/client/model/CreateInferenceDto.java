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
 * CreateInferenceDto
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateInferenceDto {
  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private String prompt = "A photo of an astronaut riding a horse";

  public static final String SERIALIZED_NAME_NEGATIVE_PROMPT = "negativePrompt";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_PROMPT)
  private String negativePrompt = "asymmetric, watermarks";

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private Double steps = new Double("50");

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Double width = new Double("1024");

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Double height = new Double("1024");

  public static final String SERIALIZED_NAME_NUMBER_OF_IMAGES = "numberOfImages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_IMAGES)
  private Double numberOfImages = new Double("1");

  public static final String SERIALIZED_NAME_PROMPT_STRENGTH = "promptStrength";
  @SerializedName(SERIALIZED_NAME_PROMPT_STRENGTH)
  private Double promptStrength = new Double("7");

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Double seed = new Double("4523184");

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhookUrl";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public CreateInferenceDto() {
  }

  public CreateInferenceDto prompt(String prompt) {

    
    
    
    
    this.prompt = prompt;
    return this;
  }

   /**
   * A text description of the image you what you want to generate.
   * @return prompt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "A photo of an astronaut riding a horse", required = true, value = "A text description of the image you what you want to generate.")

  public String getPrompt() {
    return prompt;
  }


  public void setPrompt(String prompt) {

    
    
    
    this.prompt = prompt;
  }


  public CreateInferenceDto negativePrompt(String negativePrompt) {

    
    
    
    
    this.negativePrompt = negativePrompt;
    return this;
  }

   /**
   * A text description of what the image should try to avoid generating.
   * @return negativePrompt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "asymmetric, bad hands, bad hair", value = "A text description of what the image should try to avoid generating.")

  public String getNegativePrompt() {
    return negativePrompt;
  }


  public void setNegativePrompt(String negativePrompt) {

    
    
    
    this.negativePrompt = negativePrompt;
  }


  public CreateInferenceDto steps(Double steps) {

    
    
    
    
    this.steps = steps;
    return this;
  }

  public CreateInferenceDto steps(Integer steps) {

    
    
    
    
    this.steps = steps.doubleValue();
    return this;
  }

   /**
   * How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed.
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "How many steps the AI will take to generate the image. Lower is faster but less detailed, higher is slower more detailed.")

  public Double getSteps() {
    return steps;
  }


  public void setSteps(Double steps) {

    
    
    
    this.steps = steps;
  }


  public CreateInferenceDto width(Double width) {

    
    
    
    
    this.width = width;
    return this;
  }

  public CreateInferenceDto width(Integer width) {

    
    
    
    
    this.width = width.doubleValue();
    return this;
  }

   /**
   * The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1024", value = "The width of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.")

  public Double getWidth() {
    return width;
  }


  public void setWidth(Double width) {

    
    
    
    this.width = width;
  }


  public CreateInferenceDto height(Double height) {

    
    
    
    
    this.height = height;
    return this;
  }

  public CreateInferenceDto height(Integer height) {

    
    
    
    
    this.height = height.doubleValue();
    return this;
  }

   /**
   * The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1024", value = "The height of the image to use for the inference. Must be a multiple of 8. For best results use 1024x1024 for SDXL, and 512x512 for other models.")

  public Double getHeight() {
    return height;
  }


  public void setHeight(Double height) {

    
    
    
    this.height = height;
  }


  public CreateInferenceDto numberOfImages(Double numberOfImages) {

    
    
    
    
    this.numberOfImages = numberOfImages;
    return this;
  }

  public CreateInferenceDto numberOfImages(Integer numberOfImages) {

    
    
    
    
    this.numberOfImages = numberOfImages.doubleValue();
    return this;
  }

   /**
   * The number of images to generate, up to 4.
   * @return numberOfImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of images to generate, up to 4.")

  public Double getNumberOfImages() {
    return numberOfImages;
  }


  public void setNumberOfImages(Double numberOfImages) {

    
    
    
    this.numberOfImages = numberOfImages;
  }


  public CreateInferenceDto promptStrength(Double promptStrength) {

    
    
    
    
    this.promptStrength = promptStrength;
    return this;
  }

  public CreateInferenceDto promptStrength(Integer promptStrength) {

    
    
    
    
    this.promptStrength = promptStrength.doubleValue();
    return this;
  }

   /**
   * The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30.
   * @return promptStrength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The higher the prompt strength, the closer the generated image will be to the prompt. Must be between 0 and 30.")

  public Double getPromptStrength() {
    return promptStrength;
  }


  public void setPromptStrength(Double promptStrength) {

    
    
    
    this.promptStrength = promptStrength;
  }


  public CreateInferenceDto seed(Double seed) {

    
    
    
    
    this.seed = seed;
    return this;
  }

  public CreateInferenceDto seed(Integer seed) {

    
    
    
    
    this.seed = seed.doubleValue();
    return this;
  }

   /**
   * A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number.
   * @return seed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4523184", value = "A random number to use as a seed when generating the image. This is helpful if you want to generate the same image multiple times. If you want to generate different images, keep this empty or provide a random number.")

  public Double getSeed() {
    return seed;
  }


  public void setSeed(Double seed) {

    
    
    
    this.seed = seed;
  }


  public CreateInferenceDto webhookUrl(String webhookUrl) {

    
    
    
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * An optional webhook URL that will be called with a POST request when the image generation request completes.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional webhook URL that will be called with a POST request when the image generation request completes.")

  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {

    
    
    
    this.webhookUrl = webhookUrl;
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
   * @return the CreateInferenceDto instance itself
   */
  public CreateInferenceDto putAdditionalProperty(String key, Object value) {
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
    CreateInferenceDto createInferenceDto = (CreateInferenceDto) o;
    return Objects.equals(this.prompt, createInferenceDto.prompt) &&
        Objects.equals(this.negativePrompt, createInferenceDto.negativePrompt) &&
        Objects.equals(this.steps, createInferenceDto.steps) &&
        Objects.equals(this.width, createInferenceDto.width) &&
        Objects.equals(this.height, createInferenceDto.height) &&
        Objects.equals(this.numberOfImages, createInferenceDto.numberOfImages) &&
        Objects.equals(this.promptStrength, createInferenceDto.promptStrength) &&
        Objects.equals(this.seed, createInferenceDto.seed) &&
        Objects.equals(this.webhookUrl, createInferenceDto.webhookUrl)&&
        Objects.equals(this.additionalProperties, createInferenceDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, negativePrompt, steps, width, height, numberOfImages, promptStrength, seed, webhookUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInferenceDto {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    negativePrompt: ").append(toIndentedString(negativePrompt)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    numberOfImages: ").append(toIndentedString(numberOfImages)).append("\n");
    sb.append("    promptStrength: ").append(toIndentedString(promptStrength)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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
    openapiFields.add("negativePrompt");
    openapiFields.add("steps");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("numberOfImages");
    openapiFields.add("promptStrength");
    openapiFields.add("seed");
    openapiFields.add("webhookUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("prompt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateInferenceDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateInferenceDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateInferenceDto is not found in the empty JSON string", CreateInferenceDto.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateInferenceDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if ((jsonObj.get("negativePrompt") != null && !jsonObj.get("negativePrompt").isJsonNull()) && !jsonObj.get("negativePrompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `negativePrompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("negativePrompt").toString()));
      }
      if ((jsonObj.get("webhookUrl") != null && !jsonObj.get("webhookUrl").isJsonNull()) && !jsonObj.get("webhookUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateInferenceDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateInferenceDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateInferenceDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateInferenceDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateInferenceDto>() {
           @Override
           public void write(JsonWriter out, CreateInferenceDto value) throws IOException {
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
           public CreateInferenceDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateInferenceDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateInferenceDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateInferenceDto
  * @throws IOException if the JSON string is invalid with respect to CreateInferenceDto
  */
  public static CreateInferenceDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateInferenceDto.class);
  }

 /**
  * Convert an instance of CreateInferenceDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

