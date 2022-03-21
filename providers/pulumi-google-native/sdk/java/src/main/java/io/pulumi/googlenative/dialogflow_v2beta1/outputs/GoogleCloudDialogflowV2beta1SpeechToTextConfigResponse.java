// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse {
    /**
     * The speech model used in speech to text. `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as `USE_ENHANCED`. It can be overridden in AnalyzeContentRequest and StreamingAnalyzeContentRequest request. If enhanced model variant is specified and an enhanced version of the specified model for the language does not exist, then it would emit an error.
     * 
     */
    private final String speechModelVariant;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse(@CustomType.Parameter("speechModelVariant") String speechModelVariant) {
        this.speechModelVariant = speechModelVariant;
    }

    /**
     * The speech model used in speech to text. `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as `USE_ENHANCED`. It can be overridden in AnalyzeContentRequest and StreamingAnalyzeContentRequest request. If enhanced model variant is specified and an enhanced version of the specified model for the language does not exist, then it would emit an error.
     * 
    */
    public String getSpeechModelVariant() {
        return this.speechModelVariant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String speechModelVariant;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.speechModelVariant = defaults.speechModelVariant;
        }

        public Builder speechModelVariant(String speechModelVariant) {
            this.speechModelVariant = Objects.requireNonNull(speechModelVariant);
            return this;
        }        public GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse(speechModelVariant);
        }
    }
}
