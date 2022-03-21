// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalerAutoscalingPolicyScaleDownControl {
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas;
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    private final @Nullable Integer timeWindowSec;

    @CustomType.Constructor
    private AutoscalerAutoscalingPolicyScaleDownControl(
        @CustomType.Parameter("maxScaledDownReplicas") @Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas,
        @CustomType.Parameter("timeWindowSec") @Nullable Integer timeWindowSec) {
        this.maxScaledDownReplicas = maxScaledDownReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
    */
    public Optional<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas> getMaxScaledDownReplicas() {
        return Optional.ofNullable(this.maxScaledDownReplicas);
    }
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
    */
    public Optional<Integer> getTimeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScaleDownControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas;
        private @Nullable Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScaleDownControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledDownReplicas(@Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas) {
            this.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }
        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }        public AutoscalerAutoscalingPolicyScaleDownControl build() {
            return new AutoscalerAutoscalingPolicyScaleDownControl(maxScaledDownReplicas, timeWindowSec);
        }
    }
}
