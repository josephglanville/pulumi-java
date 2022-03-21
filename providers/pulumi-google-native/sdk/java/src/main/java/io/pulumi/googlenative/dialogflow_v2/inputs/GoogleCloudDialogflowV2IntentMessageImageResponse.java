// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The image response message.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageImageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageImageResponse Empty = new GoogleCloudDialogflowV2IntentMessageImageResponse();

    /**
     * Optional. A text description of the image to be used for accessibility, e.g., screen readers.
     * 
     */
    @Import(name="accessibilityText", required=true)
      private final String accessibilityText;

    public String getAccessibilityText() {
        return this.accessibilityText;
    }

    /**
     * Optional. The public URI to an image file.
     * 
     */
    @Import(name="imageUri", required=true)
      private final String imageUri;

    public String getImageUri() {
        return this.imageUri;
    }

    public GoogleCloudDialogflowV2IntentMessageImageResponse(
        String accessibilityText,
        String imageUri) {
        this.accessibilityText = Objects.requireNonNull(accessibilityText, "expected parameter 'accessibilityText' to be non-null");
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageImageResponse() {
        this.accessibilityText = null;
        this.imageUri = null;
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
