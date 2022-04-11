// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;


/**
 * Settings for a target-based scaling policy applied to Auto Scaling group.
 * 
 */
public final class GameServerGroupTargetTrackingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerGroupTargetTrackingConfigurationArgs Empty = new GameServerGroupTargetTrackingConfigurationArgs();

    @Import(name="targetValue", required=true)
      private final Output<Double> targetValue;

    public Output<Double> getTargetValue() {
        return this.targetValue;
    }

    public GameServerGroupTargetTrackingConfigurationArgs(Output<Double> targetValue) {
        this.targetValue = Objects.requireNonNull(targetValue, "expected parameter 'targetValue' to be non-null");
    }

    private GameServerGroupTargetTrackingConfigurationArgs() {
        this.targetValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupTargetTrackingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Double> targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupTargetTrackingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetValue = defaults.targetValue;
        }

        public Builder targetValue(Output<Double> targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public Builder targetValue(Double targetValue) {
            this.targetValue = Output.of(Objects.requireNonNull(targetValue));
            return this;
        }        public GameServerGroupTargetTrackingConfigurationArgs build() {
            return new GameServerGroupTargetTrackingConfigurationArgs(targetValue);
        }
    }
}
