// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.GoogleCloudDialogflowCxV3beta1InputAudioConfigModelVariant;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instructs the speech recognizer on how to process the audio content.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs Empty = new GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs();

    /**
     * Audio encoding of the audio content to process.
     * 
     */
    @Import(name="audioEncoding", required=true)
      private final Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding> audioEncoding;

    public Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding> getAudioEncoding() {
        return this.audioEncoding;
    }

    /**
     * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or unspecified, Speech doesn't return any word-level information.
     * 
     */
    @Import(name="enableWordInfo")
      private final @Nullable Output<Boolean> enableWordInfo;

    public Output<Boolean> getEnableWordInfo() {
        return this.enableWordInfo == null ? Output.empty() : this.enableWordInfo;
    }

    /**
     * Optional. Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
     * 
     */
    @Import(name="model")
      private final @Nullable Output<String> model;

    public Output<String> getModel() {
        return this.model == null ? Output.empty() : this.model;
    }

    /**
     * Optional. Which variant of the Speech model to use.
     * 
     */
    @Import(name="modelVariant")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigModelVariant> modelVariant;

    public Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigModelVariant> getModelVariant() {
        return this.modelVariant == null ? Output.empty() : this.modelVariant;
    }

    /**
     * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details.
     * 
     */
    @Import(name="phraseHints")
      private final @Nullable Output<List<String>> phraseHints;

    public Output<List<String>> getPhraseHints() {
        return this.phraseHints == null ? Output.empty() : this.phraseHints;
    }

    /**
     * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
     * 
     */
    @Import(name="sampleRateHertz")
      private final @Nullable Output<Integer> sampleRateHertz;

    public Output<Integer> getSampleRateHertz() {
        return this.sampleRateHertz == null ? Output.empty() : this.sampleRateHertz;
    }

    /**
     * Optional. If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a new stream as needed. Note: This setting is relevant only for streaming methods.
     * 
     */
    @Import(name="singleUtterance")
      private final @Nullable Output<Boolean> singleUtterance;

    public Output<Boolean> getSingleUtterance() {
        return this.singleUtterance == null ? Output.empty() : this.singleUtterance;
    }

    public GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs(
        Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding> audioEncoding,
        @Nullable Output<Boolean> enableWordInfo,
        @Nullable Output<String> model,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigModelVariant> modelVariant,
        @Nullable Output<List<String>> phraseHints,
        @Nullable Output<Integer> sampleRateHertz,
        @Nullable Output<Boolean> singleUtterance) {
        this.audioEncoding = Objects.requireNonNull(audioEncoding, "expected parameter 'audioEncoding' to be non-null");
        this.enableWordInfo = enableWordInfo;
        this.model = model;
        this.modelVariant = modelVariant;
        this.phraseHints = phraseHints;
        this.sampleRateHertz = sampleRateHertz;
        this.singleUtterance = singleUtterance;
    }

    private GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs() {
        this.audioEncoding = Output.empty();
        this.enableWordInfo = Output.empty();
        this.model = Output.empty();
        this.modelVariant = Output.empty();
        this.phraseHints = Output.empty();
        this.sampleRateHertz = Output.empty();
        this.singleUtterance = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding> audioEncoding;
        private @Nullable Output<Boolean> enableWordInfo;
        private @Nullable Output<String> model;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigModelVariant> modelVariant;
        private @Nullable Output<List<String>> phraseHints;
        private @Nullable Output<Integer> sampleRateHertz;
        private @Nullable Output<Boolean> singleUtterance;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoding = defaults.audioEncoding;
    	      this.enableWordInfo = defaults.enableWordInfo;
    	      this.model = defaults.model;
    	      this.modelVariant = defaults.modelVariant;
    	      this.phraseHints = defaults.phraseHints;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
    	      this.singleUtterance = defaults.singleUtterance;
        }

        public Builder audioEncoding(Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding> audioEncoding) {
            this.audioEncoding = Objects.requireNonNull(audioEncoding);
            return this;
        }
        public Builder audioEncoding(GoogleCloudDialogflowCxV3beta1InputAudioConfigAudioEncoding audioEncoding) {
            this.audioEncoding = Output.of(Objects.requireNonNull(audioEncoding));
            return this;
        }
        public Builder enableWordInfo(@Nullable Output<Boolean> enableWordInfo) {
            this.enableWordInfo = enableWordInfo;
            return this;
        }
        public Builder enableWordInfo(@Nullable Boolean enableWordInfo) {
            this.enableWordInfo = Output.ofNullable(enableWordInfo);
            return this;
        }
        public Builder model(@Nullable Output<String> model) {
            this.model = model;
            return this;
        }
        public Builder model(@Nullable String model) {
            this.model = Output.ofNullable(model);
            return this;
        }
        public Builder modelVariant(@Nullable Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigModelVariant> modelVariant) {
            this.modelVariant = modelVariant;
            return this;
        }
        public Builder modelVariant(@Nullable GoogleCloudDialogflowCxV3beta1InputAudioConfigModelVariant modelVariant) {
            this.modelVariant = Output.ofNullable(modelVariant);
            return this;
        }
        public Builder phraseHints(@Nullable Output<List<String>> phraseHints) {
            this.phraseHints = phraseHints;
            return this;
        }
        public Builder phraseHints(@Nullable List<String> phraseHints) {
            this.phraseHints = Output.ofNullable(phraseHints);
            return this;
        }
        public Builder phraseHints(String... phraseHints) {
            return phraseHints(List.of(phraseHints));
        }
        public Builder sampleRateHertz(@Nullable Output<Integer> sampleRateHertz) {
            this.sampleRateHertz = sampleRateHertz;
            return this;
        }
        public Builder sampleRateHertz(@Nullable Integer sampleRateHertz) {
            this.sampleRateHertz = Output.ofNullable(sampleRateHertz);
            return this;
        }
        public Builder singleUtterance(@Nullable Output<Boolean> singleUtterance) {
            this.singleUtterance = singleUtterance;
            return this;
        }
        public Builder singleUtterance(@Nullable Boolean singleUtterance) {
            this.singleUtterance = Output.ofNullable(singleUtterance);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs build() {
            return new GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs(audioEncoding, enableWordInfo, model, modelVariant, phraseHints, sampleRateHertz, singleUtterance);
        }
    }
}
