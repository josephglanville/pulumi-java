// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.AutoscalingPolicyMode;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyCpuUtilizationArgs;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyCustomMetricUtilizationArgs;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyLoadBalancingUtilizationArgs;
import io.pulumi.googlenative.compute_v1.inputs.AutoscalingPolicyScaleInControlArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Autoscaler policy.
 * 
 */
public final class AutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyArgs Empty = new AutoscalingPolicyArgs();

    /**
     * The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
     * 
     */
    @Import(name="coolDownPeriodSec")
      private final @Nullable Output<Integer> coolDownPeriodSec;

    public Output<Integer> getCoolDownPeriodSec() {
        return this.coolDownPeriodSec == null ? Output.empty() : this.coolDownPeriodSec;
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
     * 
     */
    @Import(name="cpuUtilization")
      private final @Nullable Output<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization;

    public Output<AutoscalingPolicyCpuUtilizationArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Output.empty() : this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * 
     */
    @Import(name="customMetricUtilizations")
      private final @Nullable Output<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations;

    public Output<List<AutoscalingPolicyCustomMetricUtilizationArgs>> getCustomMetricUtilizations() {
        return this.customMetricUtilizations == null ? Output.empty() : this.customMetricUtilizations;
    }

    /**
     * Configuration parameters of autoscaling based on load balancer.
     * 
     */
    @Import(name="loadBalancingUtilization")
      private final @Nullable Output<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;

    public Output<AutoscalingPolicyLoadBalancingUtilizationArgs> getLoadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Output.empty() : this.loadBalancingUtilization;
    }

    /**
     * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
     * 
     */
    @Import(name="maxNumReplicas")
      private final @Nullable Output<Integer> maxNumReplicas;

    public Output<Integer> getMaxNumReplicas() {
        return this.maxNumReplicas == null ? Output.empty() : this.maxNumReplicas;
    }

    /**
     * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
     * 
     */
    @Import(name="minNumReplicas")
      private final @Nullable Output<Integer> minNumReplicas;

    public Output<Integer> getMinNumReplicas() {
        return this.minNumReplicas == null ? Output.empty() : this.minNumReplicas;
    }

    /**
     * Defines operating mode for this policy.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<AutoscalingPolicyMode> mode;

    public Output<AutoscalingPolicyMode> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    @Import(name="scaleInControl")
      private final @Nullable Output<AutoscalingPolicyScaleInControlArgs> scaleInControl;

    public Output<AutoscalingPolicyScaleInControlArgs> getScaleInControl() {
        return this.scaleInControl == null ? Output.empty() : this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
     * 
     */
    @Import(name="scalingSchedules")
      private final @Nullable Output<Map<String,String>> scalingSchedules;

    public Output<Map<String,String>> getScalingSchedules() {
        return this.scalingSchedules == null ? Output.empty() : this.scalingSchedules;
    }

    public AutoscalingPolicyArgs(
        @Nullable Output<Integer> coolDownPeriodSec,
        @Nullable Output<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization,
        @Nullable Output<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations,
        @Nullable Output<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization,
        @Nullable Output<Integer> maxNumReplicas,
        @Nullable Output<Integer> minNumReplicas,
        @Nullable Output<AutoscalingPolicyMode> mode,
        @Nullable Output<AutoscalingPolicyScaleInControlArgs> scaleInControl,
        @Nullable Output<Map<String,String>> scalingSchedules) {
        this.coolDownPeriodSec = coolDownPeriodSec;
        this.cpuUtilization = cpuUtilization;
        this.customMetricUtilizations = customMetricUtilizations;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxNumReplicas = maxNumReplicas;
        this.minNumReplicas = minNumReplicas;
        this.mode = mode;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    private AutoscalingPolicyArgs() {
        this.coolDownPeriodSec = Output.empty();
        this.cpuUtilization = Output.empty();
        this.customMetricUtilizations = Output.empty();
        this.loadBalancingUtilization = Output.empty();
        this.maxNumReplicas = Output.empty();
        this.minNumReplicas = Output.empty();
        this.mode = Output.empty();
        this.scaleInControl = Output.empty();
        this.scalingSchedules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> coolDownPeriodSec;
        private @Nullable Output<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization;
        private @Nullable Output<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations;
        private @Nullable Output<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;
        private @Nullable Output<Integer> maxNumReplicas;
        private @Nullable Output<Integer> minNumReplicas;
        private @Nullable Output<AutoscalingPolicyMode> mode;
        private @Nullable Output<AutoscalingPolicyScaleInControlArgs> scaleInControl;
        private @Nullable Output<Map<String,String>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriodSec = defaults.coolDownPeriodSec;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.customMetricUtilizations = defaults.customMetricUtilizations;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxNumReplicas = defaults.maxNumReplicas;
    	      this.minNumReplicas = defaults.minNumReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder coolDownPeriodSec(@Nullable Output<Integer> coolDownPeriodSec) {
            this.coolDownPeriodSec = coolDownPeriodSec;
            return this;
        }
        public Builder coolDownPeriodSec(@Nullable Integer coolDownPeriodSec) {
            this.coolDownPeriodSec = Output.ofNullable(coolDownPeriodSec);
            return this;
        }
        public Builder cpuUtilization(@Nullable Output<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }
        public Builder cpuUtilization(@Nullable AutoscalingPolicyCpuUtilizationArgs cpuUtilization) {
            this.cpuUtilization = Output.ofNullable(cpuUtilization);
            return this;
        }
        public Builder customMetricUtilizations(@Nullable Output<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations) {
            this.customMetricUtilizations = customMetricUtilizations;
            return this;
        }
        public Builder customMetricUtilizations(@Nullable List<AutoscalingPolicyCustomMetricUtilizationArgs> customMetricUtilizations) {
            this.customMetricUtilizations = Output.ofNullable(customMetricUtilizations);
            return this;
        }
        public Builder customMetricUtilizations(AutoscalingPolicyCustomMetricUtilizationArgs... customMetricUtilizations) {
            return customMetricUtilizations(List.of(customMetricUtilizations));
        }
        public Builder loadBalancingUtilization(@Nullable Output<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }
        public Builder loadBalancingUtilization(@Nullable AutoscalingPolicyLoadBalancingUtilizationArgs loadBalancingUtilization) {
            this.loadBalancingUtilization = Output.ofNullable(loadBalancingUtilization);
            return this;
        }
        public Builder maxNumReplicas(@Nullable Output<Integer> maxNumReplicas) {
            this.maxNumReplicas = maxNumReplicas;
            return this;
        }
        public Builder maxNumReplicas(@Nullable Integer maxNumReplicas) {
            this.maxNumReplicas = Output.ofNullable(maxNumReplicas);
            return this;
        }
        public Builder minNumReplicas(@Nullable Output<Integer> minNumReplicas) {
            this.minNumReplicas = minNumReplicas;
            return this;
        }
        public Builder minNumReplicas(@Nullable Integer minNumReplicas) {
            this.minNumReplicas = Output.ofNullable(minNumReplicas);
            return this;
        }
        public Builder mode(@Nullable Output<AutoscalingPolicyMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable AutoscalingPolicyMode mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder scaleInControl(@Nullable Output<AutoscalingPolicyScaleInControlArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }
        public Builder scaleInControl(@Nullable AutoscalingPolicyScaleInControlArgs scaleInControl) {
            this.scaleInControl = Output.ofNullable(scaleInControl);
            return this;
        }
        public Builder scalingSchedules(@Nullable Output<Map<String,String>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }
        public Builder scalingSchedules(@Nullable Map<String,String> scalingSchedules) {
            this.scalingSchedules = Output.ofNullable(scalingSchedules);
            return this;
        }        public AutoscalingPolicyArgs build() {
            return new AutoscalingPolicyArgs(coolDownPeriodSec, cpuUtilization, customMetricUtilizations, loadBalancingUtilization, maxNumReplicas, minNumReplicas, mode, scaleInControl, scalingSchedules);
        }
    }
}
