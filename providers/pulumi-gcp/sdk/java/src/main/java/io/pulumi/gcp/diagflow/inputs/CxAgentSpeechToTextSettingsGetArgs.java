// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxAgentSpeechToTextSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxAgentSpeechToTextSettingsGetArgs Empty = new CxAgentSpeechToTextSettingsGetArgs();

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    @InputImport(name="enableSpeechAdaptation")
      private final @Nullable Input<Boolean> enableSpeechAdaptation;

    public Input<Boolean> getEnableSpeechAdaptation() {
        return this.enableSpeechAdaptation == null ? Input.empty() : this.enableSpeechAdaptation;
    }

    public CxAgentSpeechToTextSettingsGetArgs(@Nullable Input<Boolean> enableSpeechAdaptation) {
        this.enableSpeechAdaptation = enableSpeechAdaptation;
    }

    private CxAgentSpeechToTextSettingsGetArgs() {
        this.enableSpeechAdaptation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxAgentSpeechToTextSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableSpeechAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(CxAgentSpeechToTextSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSpeechAdaptation = defaults.enableSpeechAdaptation;
        }

        public Builder setEnableSpeechAdaptation(@Nullable Input<Boolean> enableSpeechAdaptation) {
            this.enableSpeechAdaptation = enableSpeechAdaptation;
            return this;
        }

        public Builder setEnableSpeechAdaptation(@Nullable Boolean enableSpeechAdaptation) {
            this.enableSpeechAdaptation = Input.ofNullable(enableSpeechAdaptation);
            return this;
        }
        public CxAgentSpeechToTextSettingsGetArgs build() {
            return new CxAgentSpeechToTextSettingsGetArgs(enableSpeechAdaptation);
        }
    }
}
