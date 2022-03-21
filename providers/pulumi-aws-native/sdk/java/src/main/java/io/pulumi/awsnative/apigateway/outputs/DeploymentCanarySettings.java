// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentCanarySettings {
    /**
     * The percentage (0-100) of traffic diverted to a canary deployment.
     * 
     */
    private final @Nullable Double percentTraffic;
    /**
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values. Duplicates are not allowed.
     * 
     */
    private final @Nullable Object stageVariableOverrides;
    /**
     * Whether the canary deployment uses the stage cache.
     * 
     */
    private final @Nullable Boolean useStageCache;

    @CustomType.Constructor
    private DeploymentCanarySettings(
        @CustomType.Parameter("percentTraffic") @Nullable Double percentTraffic,
        @CustomType.Parameter("stageVariableOverrides") @Nullable Object stageVariableOverrides,
        @CustomType.Parameter("useStageCache") @Nullable Boolean useStageCache) {
        this.percentTraffic = percentTraffic;
        this.stageVariableOverrides = stageVariableOverrides;
        this.useStageCache = useStageCache;
    }

    /**
     * The percentage (0-100) of traffic diverted to a canary deployment.
     * 
    */
    public Optional<Double> getPercentTraffic() {
        return Optional.ofNullable(this.percentTraffic);
    }
    /**
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values. Duplicates are not allowed.
     * 
    */
    public Optional<Object> getStageVariableOverrides() {
        return Optional.ofNullable(this.stageVariableOverrides);
    }
    /**
     * Whether the canary deployment uses the stage cache.
     * 
    */
    public Optional<Boolean> getUseStageCache() {
        return Optional.ofNullable(this.useStageCache);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentCanarySettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double percentTraffic;
        private @Nullable Object stageVariableOverrides;
        private @Nullable Boolean useStageCache;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentCanarySettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentTraffic = defaults.percentTraffic;
    	      this.stageVariableOverrides = defaults.stageVariableOverrides;
    	      this.useStageCache = defaults.useStageCache;
        }

        public Builder percentTraffic(@Nullable Double percentTraffic) {
            this.percentTraffic = percentTraffic;
            return this;
        }
        public Builder stageVariableOverrides(@Nullable Object stageVariableOverrides) {
            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }
        public Builder useStageCache(@Nullable Boolean useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }        public DeploymentCanarySettings build() {
            return new DeploymentCanarySettings(percentTraffic, stageVariableOverrides, useStageCache);
        }
    }
}
