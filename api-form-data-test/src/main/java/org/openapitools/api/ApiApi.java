/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateInferenceDto;
import org.openapitools.model.CreateMusicgenInferenceDto;
import org.openapitools.model.InferenceEntity;
import org.openapitools.model.ListModelsV2Response;
import org.openapitools.model.ModelV2Entity;
import org.openapitools.model.MusicgenInferenceEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T22:41:42.165-07:00[America/Los_Angeles]")
@Validated
@Tag(name = "api", description = "the api API")
@RequestMapping("${openapi.leap.base-path:}")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/images/models/{modelId}/inferences : Generate an Image
     * Generate an image by providing a text description. Generations usually take bettween 4-20 seconds per image. Total generation time depends on the number of &#x60;steps&#x60; and &#x60;noOfImages&#x60; you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Single Image Job](https://reference.tryleap.ai/reference/inferencescontroller_findone-1) endpoint.
     *
     * @param modelId The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models (required)
     * @param createInferenceDto  (required)
     * @return Successfully submitted image generation job. (status code 200)
     */
    @Operation(
        operationId = "inferencesControllerCreate",
        summary = "Generate an Image",
        tags = { "Generate Images" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully submitted image generation job.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InferenceEntity.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/images/models/{modelId}/inferences",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InferenceEntity> inferencesControllerCreate(
        @Parameter(name = "modelId", description = "The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models", required = true) @PathVariable("modelId") String modelId,
        @Parameter(name = "CreateInferenceDto", description = "", required = true) @Valid @RequestBody CreateInferenceDto createInferenceDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"images\" : [ { \"createdAt\" : \"createdAt\", \"id\" : \"id\", \"uri\" : \"uri\" }, { \"createdAt\" : \"createdAt\", \"id\" : \"id\", \"uri\" : \"uri\" } ], \"seed\" : 0.8008281904610115, \"modelId\" : [ \"modelId\", \"modelId\" ], \"upscalingOption\" : \"x1\", \"steps\" : 2.3021358869347655, \"promptStrength\" : 5.962133916683182, \"negativePrompt\" : \"negativePrompt\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfImages\" : 5.637376656633329, \"width\" : 6.027456183070403, \"id\" : \"id\", \"state\" : \"failed\", \"prompt\" : \"prompt\", \"height\" : 1.4658129805029452 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/images/models/{modelId}/inferences : List All Image Jobs
     * Fetch a list of inference jobs for a specific model.
     *
     * @param modelId The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models. (required)
     * @param onlyFinished If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned. (optional)
     * @param page The page to request. (optional)
     * @param pageSize The number of items to return per page. (optional)
     * @return Successfully retrieved list of image generation jobs. (status code 200)
     */
    @Operation(
        operationId = "inferencesControllerFindAll",
        summary = "List All Image Jobs",
        tags = { "Generate Images" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved list of image generation jobs.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InferenceEntity.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/images/models/{modelId}/inferences",
        produces = { "application/json" }
    )
    default ResponseEntity<List<InferenceEntity>> inferencesControllerFindAll(
        @Parameter(name = "modelId", description = "The ID of the model to generate images. This can be a custom model or a public model. Visit: https://docs.tryleap.ai/public-models to view the list of public models.", required = true) @PathVariable("modelId") String modelId,
        @Parameter(name = "onlyFinished", description = "If set to true, only finished inferences will be returned. If set to false or not set, all inference jobs will be returned.") @Valid @RequestParam(value = "onlyFinished", required = false) Boolean onlyFinished,
        @Parameter(name = "page", description = "The page to request.") @Valid @RequestParam(value = "page", required = false) BigDecimal page,
        @Parameter(name = "pageSize", description = "The number of items to return per page.") @Valid @RequestParam(value = "pageSize", required = false) BigDecimal pageSize
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"images\" : [ { \"createdAt\" : \"createdAt\", \"id\" : \"id\", \"uri\" : \"uri\" }, { \"createdAt\" : \"createdAt\", \"id\" : \"id\", \"uri\" : \"uri\" } ], \"seed\" : 0.8008281904610115, \"modelId\" : [ \"modelId\", \"modelId\" ], \"upscalingOption\" : \"x1\", \"steps\" : 2.3021358869347655, \"promptStrength\" : 5.962133916683182, \"negativePrompt\" : \"negativePrompt\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfImages\" : 5.637376656633329, \"width\" : 6.027456183070403, \"id\" : \"id\", \"state\" : \"failed\", \"prompt\" : \"prompt\", \"height\" : 1.4658129805029452 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/images/models/{modelId}/inferences/{inferenceId} : Get Single Image Job
     * Retrieve a single image generation job, including the urls for the images generated.
     *
     * @param modelId The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models (required)
     * @param inferenceId The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. (required)
     * @return Successfully retrieved image generation job. (status code 200)
     */
    @Operation(
        operationId = "inferencesControllerFindOne",
        summary = "Get Single Image Job",
        tags = { "Generate Images" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved image generation job.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InferenceEntity.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/images/models/{modelId}/inferences/{inferenceId}",
        produces = { "application/json" }
    )
    default ResponseEntity<InferenceEntity> inferencesControllerFindOne(
        @Parameter(name = "modelId", description = "The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models", required = true) @PathVariable("modelId") String modelId,
        @Parameter(name = "inferenceId", description = "The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.", required = true) @PathVariable("inferenceId") String inferenceId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"images\" : [ { \"createdAt\" : \"createdAt\", \"id\" : \"id\", \"uri\" : \"uri\" }, { \"createdAt\" : \"createdAt\", \"id\" : \"id\", \"uri\" : \"uri\" } ], \"seed\" : 0.8008281904610115, \"modelId\" : [ \"modelId\", \"modelId\" ], \"upscalingOption\" : \"x1\", \"steps\" : 2.3021358869347655, \"promptStrength\" : 5.962133916683182, \"negativePrompt\" : \"negativePrompt\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfImages\" : 5.637376656633329, \"width\" : 6.027456183070403, \"id\" : \"id\", \"state\" : \"failed\", \"prompt\" : \"prompt\", \"height\" : 1.4658129805029452 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1/images/models/{modelId}/inferences/{inferenceId} : Delete Image Job
     * Delete the image job and all related images.
     *
     * @param modelId The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models (required)
     * @param inferenceId The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job. (required)
     * @return Successfully deleted image generation job. (status code 200)
     */
    @Operation(
        operationId = "inferencesControllerRemove",
        summary = "Delete Image Job",
        tags = { "Generate Images" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully deleted image generation job.")
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/images/models/{modelId}/inferences/{inferenceId}"
    )
    default ResponseEntity<Void> inferencesControllerRemove(
        @Parameter(name = "modelId", description = "The ID of the model to use to generate images. This can be a custom model, or a public model. To view the list of public models, visit: https://docs.tryleap.ai/public-models", required = true) @PathVariable("modelId") String modelId,
        @Parameter(name = "inferenceId", description = "The ID of the image generation job to retrieve. This is the same ID that is returned when you submit a new image generation job.", required = true) @PathVariable("inferenceId") String inferenceId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/music : Generate Music
     * Generate music by providing a text description. Generations usually take bettween 1-3 minutes. Total generation time depends on the &#x60;duration&#x60; you select. This endpoint will submit the generation job and return immediately. To retrieve the results you must provide a webhook URL or query/poll the [Get a Music Generation Job](https://reference.tryleap.ai/reference/musiccontroller_findoneaudio) endpoint.
     *
     * @param createMusicgenInferenceDto  (required)
     * @return Successfully submitted music generation job. (status code 200)
     */
    @Operation(
        operationId = "musicControllerCreateAudio",
        summary = "Generate Music",
        tags = { "Generate Music" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully submitted music generation job.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MusicgenInferenceEntity.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/music",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<MusicgenInferenceEntity> musicControllerCreateAudio(
        @Parameter(name = "CreateMusicgenInferenceDto", description = "", required = true) @Valid @RequestBody CreateMusicgenInferenceDto createMusicgenInferenceDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"media_uri\" : \"media_uri\", \"id\" : \"id\", \"state\" : \"failed\", \"prompt\" : \"prompt\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/music : List Music Generation Jobs
     * List all music generation jobs for a workspace.
     *
     * @return Successfully retrieved music generation jobs. (status code 200)
     */
    @Operation(
        operationId = "musicControllerFindAllAudio",
        summary = "List Music Generation Jobs",
        tags = { "Generate Music" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved music generation jobs.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MusicgenInferenceEntity.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/music",
        produces = { "application/json" }
    )
    default ResponseEntity<List<MusicgenInferenceEntity>> musicControllerFindAllAudio(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"media_uri\" : \"media_uri\", \"id\" : \"id\", \"state\" : \"failed\", \"prompt\" : \"prompt\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/music/{inferenceId} : Get a Music Generation Job
     * Get a specific music generation job.
     *
     * @param inferenceId The ID of the music generation job to retrieve. This is the same ID returned when you submit a job. (required)
     * @return Successfully retrieved music generation job. (status code 200)
     */
    @Operation(
        operationId = "musicControllerFindOneAudio",
        summary = "Get a Music Generation Job",
        tags = { "Generate Music" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved music generation job.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MusicgenInferenceEntity.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/music/{inferenceId}",
        produces = { "application/json" }
    )
    default ResponseEntity<MusicgenInferenceEntity> musicControllerFindOneAudio(
        @Parameter(name = "inferenceId", description = "The ID of the music generation job to retrieve. This is the same ID returned when you submit a job.", required = true) @PathVariable("inferenceId") String inferenceId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"media_uri\" : \"media_uri\", \"id\" : \"id\", \"state\" : \"failed\", \"prompt\" : \"prompt\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v2/images/models/{modelId} : Delete a Model
     * This endpoint will delete a model. This is not reversible.
     *
     * @param modelId The ID of the model to delete. (required)
     * @return Successfully deleted the model (status code 200)
     */
    @Operation(
        operationId = "trainImageModelsDeleteModel",
        summary = "Delete a Model",
        tags = { "Train Image Models" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully deleted the model", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ModelV2Entity.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v2/images/models/{modelId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ModelV2Entity> trainImageModelsDeleteModel(
        @Parameter(name = "modelId", description = "The ID of the model to delete.", required = true) @PathVariable("modelId") String modelId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"subjectKeyword\" : \"subjectKeyword\", \"createdAt\" : \"createdAt\", \"name\" : \"name\", \"id\" : \"id\", \"subjectType\" : \"subjectType\", \"imageSamples\" : [ \"imageSamples\", \"imageSamples\" ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v2/images/models/{modelId} : Get a Single Model
     * This endpoint will return a single model.
     *
     * @param modelId The ID of the model to retrieve. (required)
     * @return Successfully retrieved the model. (status code 200)
     *         or Model does not exist (status code 404)
     */
    @Operation(
        operationId = "trainImageModelsGetModel",
        summary = "Get a Single Model",
        tags = { "Train Image Models" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the model.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ModelV2Entity.class))
            }),
            @ApiResponse(responseCode = "404", description = "Model does not exist")
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v2/images/models/{modelId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ModelV2Entity> trainImageModelsGetModel(
        @Parameter(name = "modelId", description = "The ID of the model to retrieve.", required = true) @PathVariable("modelId") String modelId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"subjectKeyword\" : \"subjectKeyword\", \"createdAt\" : \"createdAt\", \"name\" : \"name\", \"id\" : \"id\", \"subjectType\" : \"subjectType\", \"imageSamples\" : [ \"imageSamples\", \"imageSamples\" ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v2/images/models : List All Models
     * This endpoint will return a list of all models for the workspace.
     *
     * @return Successfully retrieved models. (status code 200)
     */
    @Operation(
        operationId = "trainImageModelsListAllModels",
        summary = "List All Models",
        tags = { "Train Image Models" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved models.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListModelsV2Response.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v2/images/models",
        produces = { "application/json" }
    )
    default ResponseEntity<ListModelsV2Response> trainImageModelsListAllModels(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"models\" : [ { \"subjectKeyword\" : \"subjectKeyword\", \"createdAt\" : \"createdAt\", \"name\" : \"name\", \"id\" : \"id\", \"subjectType\" : \"subjectType\", \"imageSamples\" : [ \"imageSamples\", \"imageSamples\" ], \"status\" : \"status\" }, { \"subjectKeyword\" : \"subjectKeyword\", \"createdAt\" : \"createdAt\", \"name\" : \"name\", \"id\" : \"id\", \"subjectType\" : \"subjectType\", \"imageSamples\" : [ \"imageSamples\", \"imageSamples\" ], \"status\" : \"status\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v2/images/models/new : Train Model
     * Upload a few image samples, and train a new model. Training usually takes 20-40 minutes. To be notified when the model completes training you must provide a &#x60;webhookUrl&#x60; in the training request, or check for completion by calling [Get a Single Model](https://reference.tryleap.ai/reference/get-model-1). After training completes, you can use the model to generate images with [Generate Images](https://reference.tryleap.ai/reference/inferencescontroller_create-1).
     *
     * @param name Provide a name so you can more easily identify the model. (optional)
     * @param subjectKeyword This is the keyword you will use during image generation to trigger your custom subject. For example \\\&quot;a photo of @me\\\&quot;. (optional)
     * @param subjectType The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\&quot;person\\\&quot;. (optional, default to person)
     * @param webhookUrl An optional webhook URL that will be called with a POST request when the model completes training or fails. (optional)
     * @param imageSampleUrls An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both. (optional)
     * @param imageSampleFiles An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both. (optional)
     * @return Successfully submitted training job. (status code 200)
     */
    @Operation(
        operationId = "trainImageModelsTrainModel",
        summary = "Train Model",
        tags = { "Train Image Models" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully submitted training job.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ModelV2Entity.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v2/images/models/new",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<ModelV2Entity> trainImageModelsTrainModel(
        @Parameter(name = "name", description = "Provide a name so you can more easily identify the model.") @Valid @RequestParam(value = "name", required = false) String name,
        @Parameter(name = "subjectKeyword", description = "This is the keyword you will use during image generation to trigger your custom subject. For example \\\"a photo of @me\\\".") @Valid @RequestParam(value = "subjectKeyword", required = false) String subjectKeyword,
        @Parameter(name = "subjectType", description = "The subject type - a short description, usually a noun, that describes what the underlying model is learning. For example: person, man, woman, cat, dog, icon, style. Defaults to \\\"person\\\".") @Valid @RequestParam(value = "subjectType", required = false) String subjectType,
        @Parameter(name = "webhookUrl", description = "An optional webhook URL that will be called with a POST request when the model completes training or fails.") @Valid @RequestParam(value = "webhookUrl", required = false) String webhookUrl,
        @Parameter(name = "imageSampleUrls", description = "An array of strings containing the URLs of the images to upload. Either this or imageSampleFiles is required, but not both.") @Valid @RequestParam(value = "imageSampleUrls", required = false) List<String> imageSampleUrls,
        @Parameter(name = "imageSampleFiles", description = "An array of files containing the images to upload. Either this or imageSampleUrls is required, but not both.") @RequestPart(value = "imageSampleFiles", required = false) List<MultipartFile> imageSampleFiles
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    // parse request and print out all fields
                    String exampleString = "{ \"subjectKeyword\" : \"subjectKeyword\", \"createdAt\" : \"createdAt\", \"name\" : \"name\", \"id\" : \"id\", \"subjectType\" : \"subjectType\", \"imageSamples\" : [ \"imageSamples\", \"imageSamples\" ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
