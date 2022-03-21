// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The simple response message containing speech or text.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs();

    /**
     * Optional. The text to display.
     * 
     */
    @Import(name="displayText")
      private final @Nullable Output<String> displayText;

    public Output<String> getDisplayText() {
        return this.displayText == null ? Output.empty() : this.displayText;
    }

    /**
     * One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
     * 
     */
    @Import(name="ssml")
      private final @Nullable Output<String> ssml;

    public Output<String> getSsml() {
        return this.ssml == null ? Output.empty() : this.ssml;
    }

    /**
     * One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
     * 
     */
    @Import(name="textToSpeech")
      private final @Nullable Output<String> textToSpeech;

    public Output<String> getTextToSpeech() {
        return this.textToSpeech == null ? Output.empty() : this.textToSpeech;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs(
        @Nullable Output<String> displayText,
        @Nullable Output<String> ssml,
        @Nullable Output<String> textToSpeech) {
        this.displayText = displayText;
        this.ssml = ssml;
        this.textToSpeech = textToSpeech;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs() {
        this.displayText = Output.empty();
        this.ssml = Output.empty();
        this.textToSpeech = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayText;
        private @Nullable Output<String> ssml;
        private @Nullable Output<String> textToSpeech;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayText = defaults.displayText;
    	      this.ssml = defaults.ssml;
    	      this.textToSpeech = defaults.textToSpeech;
        }

        public Builder displayText(@Nullable Output<String> displayText) {
            this.displayText = displayText;
            return this;
        }
        public Builder displayText(@Nullable String displayText) {
            this.displayText = Output.ofNullable(displayText);
            return this;
        }
        public Builder ssml(@Nullable Output<String> ssml) {
            this.ssml = ssml;
            return this;
        }
        public Builder ssml(@Nullable String ssml) {
            this.ssml = Output.ofNullable(ssml);
            return this;
        }
        public Builder textToSpeech(@Nullable Output<String> textToSpeech) {
            this.textToSpeech = textToSpeech;
            return this;
        }
        public Builder textToSpeech(@Nullable String textToSpeech) {
            this.textToSpeech = Output.ofNullable(textToSpeech);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs(displayText, ssml, textToSpeech);
        }
    }
}
