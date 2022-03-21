// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageImageResponse {
    /**
     * Optional. A text description of the image to be used for accessibility, e.g., screen readers.
     * 
     */
    private final String accessibilityText;
    /**
     * Optional. The public URI to an image file.
     * 
     */
    private final String imageUri;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageImageResponse(
        @CustomType.Parameter("accessibilityText") String accessibilityText,
        @CustomType.Parameter("imageUri") String imageUri) {
        this.accessibilityText = accessibilityText;
        this.imageUri = imageUri;
    }

    /**
     * Optional. A text description of the image to be used for accessibility, e.g., screen readers.
     * 
    */
    public String getAccessibilityText() {
        return this.accessibilityText;
    }
    /**
     * Optional. The public URI to an image file.
     * 
    */
    public String getImageUri() {
        return this.imageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessibilityText;
        private String imageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessibilityText = defaults.accessibilityText;
    	      this.imageUri = defaults.imageUri;
        }

        public Builder accessibilityText(String accessibilityText) {
            this.accessibilityText = Objects.requireNonNull(accessibilityText);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageImageResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageImageResponse(accessibilityText, imageUri);
        }
    }
}
