// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse {
    /**
     * List of media objects.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects;
    /**
     * Optional. What type of media is the content (ie "audio").
     * 
     */
    private final String mediaType;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse(
        @CustomType.Parameter("mediaObjects") List<GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects,
        @CustomType.Parameter("mediaType") String mediaType) {
        this.mediaObjects = mediaObjects;
        this.mediaType = mediaType;
    }

    /**
     * List of media objects.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse> getMediaObjects() {
        return this.mediaObjects;
    }
    /**
     * Optional. What type of media is the content (ie "audio").
     * 
    */
    public String getMediaType() {
        return this.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects;
        private String mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mediaObjects = defaults.mediaObjects;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder mediaObjects(List<GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects) {
            this.mediaObjects = Objects.requireNonNull(mediaObjects);
            return this;
        }
        public Builder mediaObjects(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse... mediaObjects) {
            return mediaObjects(List.of(mediaObjects));
        }
        public Builder mediaType(String mediaType) {
            this.mediaType = Objects.requireNonNull(mediaType);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse(mediaObjects, mediaType);
        }
    }
}
