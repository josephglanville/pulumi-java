// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration parameters of autoscaling based on load balancing.
 * 
 */
public final class AutoscalingPolicyLoadBalancingUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyLoadBalancingUtilizationArgs Empty = new AutoscalingPolicyLoadBalancingUtilizationArgs();

    /**
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="utilizationTarget")
      private final @Nullable Output<Double> utilizationTarget;

    public Output<Double> getUtilizationTarget() {
        return this.utilizationTarget == null ? Codegen.empty() : this.utilizationTarget;
    }

    public AutoscalingPolicyLoadBalancingUtilizationArgs(@Nullable Output<Double> utilizationTarget) {
        this.utilizationTarget = utilizationTarget;
    }

    private AutoscalingPolicyLoadBalancingUtilizationArgs() {
        this.utilizationTarget = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> utilizationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utilizationTarget = defaults.utilizationTarget;
        }

        public Builder utilizationTarget(@Nullable Output<Double> utilizationTarget) {
            this.utilizationTarget = utilizationTarget;
            return this;
        }
        public Builder utilizationTarget(@Nullable Double utilizationTarget) {
            this.utilizationTarget = Codegen.ofNullable(utilizationTarget);
            return this;
        }        public AutoscalingPolicyLoadBalancingUtilizationArgs build() {
            return new AutoscalingPolicyLoadBalancingUtilizationArgs(utilizationTarget);
        }
    }
}
