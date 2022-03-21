// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An item in the carousel.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs Empty = new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs();

    /**
     * Optional. The body text of the card.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Optional. The image to display.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image;

    public Output<GoogleCloudDialogflowV2IntentMessageImageArgs> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * Additional info about the option item.
     * 
     */
    @Import(name="info", required=true)
      private final Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info;

    public Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> getInfo() {
        return this.info;
    }

    /**
     * Title of the carousel item.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs(
        @Nullable Output<String> description,
        @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image,
        Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info,
        Output<String> title) {
        this.description = description;
        this.image = image;
        this.info = Objects.requireNonNull(info, "expected parameter 'info' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs() {
        this.description = Output.empty();
        this.image = Output.empty();
        this.info = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image;
        private Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable GoogleCloudDialogflowV2IntentMessageImageArgs image) {
            this.image = Output.ofNullable(image);
            return this;
        }
        public Builder info(Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }
        public Builder info(GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs info) {
            this.info = Output.of(Objects.requireNonNull(info));
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs(description, image, info, title);
        }
    }
}
