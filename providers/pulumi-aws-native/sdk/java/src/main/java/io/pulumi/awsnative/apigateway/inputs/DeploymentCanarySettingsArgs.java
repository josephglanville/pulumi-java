// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentCanarySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentCanarySettingsArgs Empty = new DeploymentCanarySettingsArgs();

    /**
     * The percentage (0-100) of traffic diverted to a canary deployment.
     * 
     */
    @Import(name="percentTraffic")
      private final @Nullable Output<Double> percentTraffic;

    public Output<Double> getPercentTraffic() {
        return this.percentTraffic == null ? Output.empty() : this.percentTraffic;
    }

    /**
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values. Duplicates are not allowed.
     * 
     */
    @Import(name="stageVariableOverrides")
      private final @Nullable Output<Object> stageVariableOverrides;

    public Output<Object> getStageVariableOverrides() {
        return this.stageVariableOverrides == null ? Output.empty() : this.stageVariableOverrides;
    }

    /**
     * Whether the canary deployment uses the stage cache.
     * 
     */
    @Import(name="useStageCache")
      private final @Nullable Output<Boolean> useStageCache;

    public Output<Boolean> getUseStageCache() {
        return this.useStageCache == null ? Output.empty() : this.useStageCache;
    }

    public DeploymentCanarySettingsArgs(
        @Nullable Output<Double> percentTraffic,
        @Nullable Output<Object> stageVariableOverrides,
        @Nullable Output<Boolean> useStageCache) {
        this.percentTraffic = percentTraffic;
        this.stageVariableOverrides = stageVariableOverrides;
        this.useStageCache = useStageCache;
    }

    private DeploymentCanarySettingsArgs() {
        this.percentTraffic = Output.empty();
        this.stageVariableOverrides = Output.empty();
        this.useStageCache = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentCanarySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> percentTraffic;
        private @Nullable Output<Object> stageVariableOverrides;
        private @Nullable Output<Boolean> useStageCache;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentCanarySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentTraffic = defaults.percentTraffic;
    	      this.stageVariableOverrides = defaults.stageVariableOverrides;
    	      this.useStageCache = defaults.useStageCache;
        }

        public Builder percentTraffic(@Nullable Output<Double> percentTraffic) {
            this.percentTraffic = percentTraffic;
            return this;
        }
        public Builder percentTraffic(@Nullable Double percentTraffic) {
            this.percentTraffic = Output.ofNullable(percentTraffic);
            return this;
        }
        public Builder stageVariableOverrides(@Nullable Output<Object> stageVariableOverrides) {
            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }
        public Builder stageVariableOverrides(@Nullable Object stageVariableOverrides) {
            this.stageVariableOverrides = Output.ofNullable(stageVariableOverrides);
            return this;
        }
        public Builder useStageCache(@Nullable Output<Boolean> useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }
        public Builder useStageCache(@Nullable Boolean useStageCache) {
            this.useStageCache = Output.ofNullable(useStageCache);
            return this;
        }        public DeploymentCanarySettingsArgs build() {
            return new DeploymentCanarySettingsArgs(percentTraffic, stageVariableOverrides, useStageCache);
        }
    }
}
