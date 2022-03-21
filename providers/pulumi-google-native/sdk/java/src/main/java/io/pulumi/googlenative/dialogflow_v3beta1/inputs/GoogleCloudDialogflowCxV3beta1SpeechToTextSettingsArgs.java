// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings related to speech recognition.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs Empty = new GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs();

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    @Import(name="enableSpeechAdaptation")
      private final @Nullable Output<Boolean> enableSpeechAdaptation;

    public Output<Boolean> getEnableSpeechAdaptation() {
        return this.enableSpeechAdaptation == null ? Output.empty() : this.enableSpeechAdaptation;
    }

    public GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs(@Nullable Output<Boolean> enableSpeechAdaptation) {
        this.enableSpeechAdaptation = enableSpeechAdaptation;
    }

    private GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs() {
        this.enableSpeechAdaptation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableSpeechAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSpeechAdaptation = defaults.enableSpeechAdaptation;
        }

        public Builder enableSpeechAdaptation(@Nullable Output<Boolean> enableSpeechAdaptation) {
            this.enableSpeechAdaptation = enableSpeechAdaptation;
            return this;
        }
        public Builder enableSpeechAdaptation(@Nullable Boolean enableSpeechAdaptation) {
            this.enableSpeechAdaptation = Output.ofNullable(enableSpeechAdaptation);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs(enableSpeechAdaptation);
        }
    }
}
