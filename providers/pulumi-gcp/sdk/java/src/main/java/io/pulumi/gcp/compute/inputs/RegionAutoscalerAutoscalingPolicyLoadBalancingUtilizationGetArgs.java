// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs Empty = new RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs();

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target", required=true)
      private final Output<Double> target;

    public Output<Double> getTarget() {
        return this.target;
    }

    public RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs(Output<Double> target) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs() {
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Double> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder target(Output<Double> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(Double target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs build() {
            return new RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs(target);
        }
    }
}
