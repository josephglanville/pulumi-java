// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse {
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `parameter_id` field is set.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts;
    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    private final Integer repeatCount;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse(
        @CustomType.Parameter("parts") List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts,
        @CustomType.Parameter("repeatCount") Integer repeatCount) {
        this.parts = parts;
        this.repeatCount = repeatCount;
    }

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `parameter_id` field is set.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> getParts() {
        return this.parts;
    }
    /**
     * Indicates how many times this example was added to the intent.
     * 
    */
    public Integer getRepeatCount() {
        return this.repeatCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts;
        private Integer repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder parts(List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }
        public Builder parts(GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse... parts) {
            return parts(List.of(parts));
        }
        public Builder repeatCount(Integer repeatCount) {
            this.repeatCount = Objects.requireNonNull(repeatCount);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse build() {
            return new GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse(parts, repeatCount);
        }
    }
}
