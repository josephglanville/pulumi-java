// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The image response message.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageImageArgs Empty = new GoogleCloudDialogflowV2IntentMessageImageArgs();

    /**
     * Optional. A text description of the image to be used for accessibility, e.g., screen readers.
     * 
     */
    @InputImport(name="accessibilityText")
      private final @Nullable Output<String> accessibilityText;

    public Output<String> getAccessibilityText() {
        return this.accessibilityText == null ? Output.empty() : this.accessibilityText;
    }

    /**
     * Optional. The public URI to an image file.
     * 
     */
    @InputImport(name="imageUri")
      private final @Nullable Output<String> imageUri;

    public Output<String> getImageUri() {
        return this.imageUri == null ? Output.empty() : this.imageUri;
    }

    public GoogleCloudDialogflowV2IntentMessageImageArgs(
        @Nullable Output<String> accessibilityText,
        @Nullable Output<String> imageUri) {
        this.accessibilityText = accessibilityText;
        this.imageUri = imageUri;
    }

    private GoogleCloudDialogflowV2IntentMessageImageArgs() {
        this.accessibilityText = Output.empty();
        this.imageUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessibilityText;
        private @Nullable Output<String> imageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessibilityText = defaults.accessibilityText;
    	      this.imageUri = defaults.imageUri;
        }

        public Builder accessibilityText(@Nullable Output<String> accessibilityText) {
            this.accessibilityText = accessibilityText;
            return this;
        }

        public Builder accessibilityText(@Nullable String accessibilityText) {
            this.accessibilityText = Output.ofNullable(accessibilityText);
            return this;
        }

        public Builder imageUri(@Nullable Output<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = Output.ofNullable(imageUri);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageImageArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageImageArgs(accessibilityText, imageUri);
        }
    }
}
