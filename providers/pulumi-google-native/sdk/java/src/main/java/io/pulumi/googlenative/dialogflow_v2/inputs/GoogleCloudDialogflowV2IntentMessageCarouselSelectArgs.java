// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs;
import java.util.List;
import java.util.Objects;


/**
 * The card for presenting a carousel of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs Empty = new GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs();

    /**
     * Carousel items.
     * 
     */
    @Import(name="items", required=true)
      private final Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> items;

    public Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> getItems() {
        return this.items;
    }

    public GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs(Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs() {
        this.items = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public Builder items(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs... items) {
            return items(List.of(items));
        }        public GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs(items);
        }
    }
}
