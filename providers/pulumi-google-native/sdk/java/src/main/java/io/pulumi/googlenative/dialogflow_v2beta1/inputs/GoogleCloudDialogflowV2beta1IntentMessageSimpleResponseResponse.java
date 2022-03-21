// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The simple response message containing speech or text.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse();

    /**
     * Optional. The text to display.
     * 
     */
    @Import(name="displayText", required=true)
      private final String displayText;

    public String getDisplayText() {
        return this.displayText;
    }

    /**
     * One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
     * 
     */
    @Import(name="ssml", required=true)
      private final String ssml;

    public String getSsml() {
        return this.ssml;
    }

    /**
     * One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
     * 
     */
    @Import(name="textToSpeech", required=true)
      private final String textToSpeech;

    public String getTextToSpeech() {
        return this.textToSpeech;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse(
        String displayText,
        String ssml,
        String textToSpeech) {
        this.displayText = Objects.requireNonNull(displayText, "expected parameter 'displayText' to be non-null");
        this.ssml = Objects.requireNonNull(ssml, "expected parameter 'ssml' to be non-null");
        this.textToSpeech = Objects.requireNonNull(textToSpeech, "expected parameter 'textToSpeech' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse() {
        this.displayText = null;
        this.ssml = null;
        this.textToSpeech = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayText;
        private String ssml;
        private String textToSpeech;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayText = defaults.displayText;
    	      this.ssml = defaults.ssml;
    	      this.textToSpeech = defaults.textToSpeech;
        }

        public Builder displayText(String displayText) {
            this.displayText = Objects.requireNonNull(displayText);
            return this;
        }
        public Builder ssml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }
        public Builder textToSpeech(String textToSpeech) {
            this.textToSpeech = Objects.requireNonNull(textToSpeech);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse(displayText, ssml, textToSpeech);
        }
    }
}
