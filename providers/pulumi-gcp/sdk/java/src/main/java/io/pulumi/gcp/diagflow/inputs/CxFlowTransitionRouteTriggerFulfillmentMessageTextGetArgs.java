// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs Empty = new CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs();

    /**
     * - 
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    @Import(name="allowPlaybackInterruption")
      private final @Nullable Output<Boolean> allowPlaybackInterruption;

    public Output<Boolean> getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption == null ? Output.empty() : this.allowPlaybackInterruption;
    }

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="texts")
      private final @Nullable Output<List<String>> texts;

    public Output<List<String>> getTexts() {
        return this.texts == null ? Output.empty() : this.texts;
    }

    public CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs(
        @Nullable Output<Boolean> allowPlaybackInterruption,
        @Nullable Output<List<String>> texts) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.texts = texts;
    }

    private CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs() {
        this.allowPlaybackInterruption = Output.empty();
        this.texts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowPlaybackInterruption;
        private @Nullable Output<List<String>> texts;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.texts = defaults.texts;
        }

        public Builder allowPlaybackInterruption(@Nullable Output<Boolean> allowPlaybackInterruption) {
            this.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }
        public Builder allowPlaybackInterruption(@Nullable Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Output.ofNullable(allowPlaybackInterruption);
            return this;
        }
        public Builder texts(@Nullable Output<List<String>> texts) {
            this.texts = texts;
            return this;
        }
        public Builder texts(@Nullable List<String> texts) {
            this.texts = Output.ofNullable(texts);
            return this;
        }
        public Builder texts(String... texts) {
            return texts(List.of(texts));
        }        public CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs build() {
            return new CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs(allowPlaybackInterruption, texts);
        }
    }
}
