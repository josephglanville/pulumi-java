// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse {
    private final String displayText;
    private final String ssml;
    private final String textToSpeech;

    @OutputCustomType.Constructor({"displayText","ssml","textToSpeech"})
    private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse(
        String displayText,
        String ssml,
        String textToSpeech) {
        this.displayText = Objects.requireNonNull(displayText);
        this.ssml = Objects.requireNonNull(ssml);
        this.textToSpeech = Objects.requireNonNull(textToSpeech);
    }

    public String getDisplayText() {
        return this.displayText;
    }
    public String getSsml() {
        return this.ssml;
    }
    public String getTextToSpeech() {
        return this.textToSpeech;
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

        public Builder setDisplayText(String displayText) {
            this.displayText = Objects.requireNonNull(displayText);
            return this;
        }

        public Builder setSsml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }

        public Builder setTextToSpeech(String textToSpeech) {
            this.textToSpeech = Objects.requireNonNull(textToSpeech);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse(displayText, ssml, textToSpeech);
        }
    }
}