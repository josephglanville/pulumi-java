// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Define behaviors on logging.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs Empty = new GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs();

    /**
     * If true, DF Interaction logging is currently enabled.
     * 
     */
    @Import(name="enableInteractionLogging")
      private final @Nullable Output<Boolean> enableInteractionLogging;

    public Output<Boolean> getEnableInteractionLogging() {
        return this.enableInteractionLogging == null ? Output.empty() : this.enableInteractionLogging;
    }

    /**
     * If true, StackDriver logging is currently enabled.
     * 
     */
    @Import(name="enableStackdriverLogging")
      private final @Nullable Output<Boolean> enableStackdriverLogging;

    public Output<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Output.empty() : this.enableStackdriverLogging;
    }

    public GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs(
        @Nullable Output<Boolean> enableInteractionLogging,
        @Nullable Output<Boolean> enableStackdriverLogging) {
        this.enableInteractionLogging = enableInteractionLogging;
        this.enableStackdriverLogging = enableStackdriverLogging;
    }

    private GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs() {
        this.enableInteractionLogging = Output.empty();
        this.enableStackdriverLogging = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableInteractionLogging;
        private @Nullable Output<Boolean> enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInteractionLogging = defaults.enableInteractionLogging;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder enableInteractionLogging(@Nullable Output<Boolean> enableInteractionLogging) {
            this.enableInteractionLogging = enableInteractionLogging;
            return this;
        }
        public Builder enableInteractionLogging(@Nullable Boolean enableInteractionLogging) {
            this.enableInteractionLogging = Output.ofNullable(enableInteractionLogging);
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Output.ofNullable(enableStackdriverLogging);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs(enableInteractionLogging, enableStackdriverLogging);
        }
    }
}
