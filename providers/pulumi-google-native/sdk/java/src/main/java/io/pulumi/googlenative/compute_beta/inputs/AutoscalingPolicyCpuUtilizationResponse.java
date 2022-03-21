// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * CPU utilization policy.
 * 
 */
public final class AutoscalingPolicyCpuUtilizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyCpuUtilizationResponse Empty = new AutoscalingPolicyCpuUtilizationResponse();

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    @Import(name="predictiveMethod", required=true)
      private final String predictiveMethod;

    public String getPredictiveMethod() {
        return this.predictiveMethod;
    }

    /**
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * 
     */
    @Import(name="utilizationTarget", required=true)
      private final Double utilizationTarget;

    public Double getUtilizationTarget() {
        return this.utilizationTarget;
    }

    public AutoscalingPolicyCpuUtilizationResponse(
        String predictiveMethod,
        Double utilizationTarget) {
        this.predictiveMethod = Objects.requireNonNull(predictiveMethod, "expected parameter 'predictiveMethod' to be non-null");
        this.utilizationTarget = Objects.requireNonNull(utilizationTarget, "expected parameter 'utilizationTarget' to be non-null");
    }

    private AutoscalingPolicyCpuUtilizationResponse() {
        this.predictiveMethod = null;
        this.utilizationTarget = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyCpuUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String predictiveMethod;
        private Double utilizationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyCpuUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predictiveMethod = defaults.predictiveMethod;
    	      this.utilizationTarget = defaults.utilizationTarget;
        }

        public Builder predictiveMethod(String predictiveMethod) {
            this.predictiveMethod = Objects.requireNonNull(predictiveMethod);
            return this;
        }
        public Builder utilizationTarget(Double utilizationTarget) {
            this.utilizationTarget = Objects.requireNonNull(utilizationTarget);
            return this;
        }        public AutoscalingPolicyCpuUtilizationResponse build() {
            return new AutoscalingPolicyCpuUtilizationResponse(predictiveMethod, utilizationTarget);
        }
    }
}
