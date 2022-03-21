// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs Empty = new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs();

    /**
     * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. Default is `false`.
     * 
     */
    @Import(name="allowNonRestoredState")
      private final @Nullable Output<Boolean> allowNonRestoredState;

    public Output<Boolean> getAllowNonRestoredState() {
        return this.allowNonRestoredState == null ? Output.empty() : this.allowNonRestoredState;
    }

    public ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs(@Nullable Output<Boolean> allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
    }

    private ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs() {
        this.allowNonRestoredState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowNonRestoredState;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNonRestoredState = defaults.allowNonRestoredState;
        }

        public Builder allowNonRestoredState(@Nullable Output<Boolean> allowNonRestoredState) {
            this.allowNonRestoredState = allowNonRestoredState;
            return this;
        }
        public Builder allowNonRestoredState(@Nullable Boolean allowNonRestoredState) {
            this.allowNonRestoredState = Output.ofNullable(allowNonRestoredState);
            return this;
        }        public ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs build() {
            return new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs(allowNonRestoredState);
        }
    }
}
