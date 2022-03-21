// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse {
    /**
     * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    private final String parameterId;
    /**
     * The text for this part.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse(
        @CustomType.Parameter("parameterId") String parameterId,
        @CustomType.Parameter("text") String text) {
        this.parameterId = parameterId;
        this.text = text;
    }

    /**
     * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
    */
    public String getParameterId() {
        return this.parameterId;
    }
    /**
     * The text for this part.
     * 
    */
    public String getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterId;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterId = defaults.parameterId;
    	      this.text = defaults.text;
        }

        public Builder parameterId(String parameterId) {
            this.parameterId = Objects.requireNonNull(parameterId);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse build() {
            return new GoogleCloudDialogflowCxV3IntentTrainingPhrasePartResponse(parameterId, text);
        }
    }
}
