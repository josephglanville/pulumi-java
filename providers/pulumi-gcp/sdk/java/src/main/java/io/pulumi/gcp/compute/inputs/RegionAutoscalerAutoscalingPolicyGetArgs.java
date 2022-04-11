// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyCpuUtilizationGetArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyMetricGetArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlGetArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlGetArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionAutoscalerAutoscalingPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerAutoscalingPolicyGetArgs Empty = new RegionAutoscalerAutoscalingPolicyGetArgs();

    /**
     * The number of seconds that the autoscaler should wait before it
     * starts collecting information from a new instance. This prevents
     * the autoscaler from collecting information when the instance is
     * initializing, during which the collected usage would not be
     * reliable. The default time autoscaler waits is 60 seconds.
     * Virtual machine initialization times might vary because of
     * numerous factors. We recommend that you test how long an
     * instance may take to initialize. To do this, create an instance
     * and time the startup process.
     * 
     */
    @Import(name="cooldownPeriod")
      private final @Nullable Output<Integer> cooldownPeriod;

    public Output<Integer> getCooldownPeriod() {
        return this.cooldownPeriod == null ? Codegen.empty() : this.cooldownPeriod;
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    @Import(name="cpuUtilization")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization;

    public Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationGetArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Codegen.empty() : this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    @Import(name="loadBalancingUtilization")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization;

    public Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs> getLoadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Codegen.empty() : this.loadBalancingUtilization;
    }

    /**
     * The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    @Import(name="maxReplicas", required=true)
      private final Output<Integer> maxReplicas;

    public Output<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricGetArgs>> metrics;

    public Output<List<RegionAutoscalerAutoscalingPolicyMetricGetArgs>> getMetrics() {
        return this.metrics == null ? Codegen.empty() : this.metrics;
    }

    /**
     * The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    @Import(name="minReplicas", required=true)
      private final Output<Integer> minReplicas;

    public Output<Integer> getMinReplicas() {
        return this.minReplicas;
    }

    /**
     * Defines operating mode for this policy.
     * Default value is `ON`.
     * Possible values are `OFF`, `ONLY_UP`, and `ON`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleDownControl")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl;

    public Output<RegionAutoscalerAutoscalingPolicyScaleDownControlGetArgs> getScaleDownControl() {
        return this.scaleDownControl == null ? Codegen.empty() : this.scaleDownControl;
    }

    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleInControl")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlGetArgs> scaleInControl;

    public Output<RegionAutoscalerAutoscalingPolicyScaleInControlGetArgs> getScaleInControl() {
        return this.scaleInControl == null ? Codegen.empty() : this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    @Import(name="scalingSchedules")
      private final @Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules;

    public Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs>> getScalingSchedules() {
        return this.scalingSchedules == null ? Codegen.empty() : this.scalingSchedules;
    }

    public RegionAutoscalerAutoscalingPolicyGetArgs(
        @Nullable Output<Integer> cooldownPeriod,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization,
        Output<Integer> maxReplicas,
        @Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricGetArgs>> metrics,
        Output<Integer> minReplicas,
        @Nullable Output<String> mode,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlGetArgs> scaleInControl,
        @Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules) {
        this.cooldownPeriod = cooldownPeriod;
        this.cpuUtilization = cpuUtilization;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.metrics = metrics;
        this.minReplicas = Objects.requireNonNull(minReplicas, "expected parameter 'minReplicas' to be non-null");
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    private RegionAutoscalerAutoscalingPolicyGetArgs() {
        this.cooldownPeriod = Codegen.empty();
        this.cpuUtilization = Codegen.empty();
        this.loadBalancingUtilization = Codegen.empty();
        this.maxReplicas = Codegen.empty();
        this.metrics = Codegen.empty();
        this.minReplicas = Codegen.empty();
        this.mode = Codegen.empty();
        this.scaleDownControl = Codegen.empty();
        this.scaleInControl = Codegen.empty();
        this.scalingSchedules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerAutoscalingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cooldownPeriod;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization;
        private Output<Integer> maxReplicas;
        private @Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricGetArgs>> metrics;
        private Output<Integer> minReplicas;
        private @Nullable Output<String> mode;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlGetArgs> scaleInControl;
        private @Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerAutoscalingPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder cooldownPeriod(@Nullable Output<Integer> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }
        public Builder cooldownPeriod(@Nullable Integer cooldownPeriod) {
            this.cooldownPeriod = Codegen.ofNullable(cooldownPeriod);
            return this;
        }
        public Builder cpuUtilization(@Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }
        public Builder cpuUtilization(@Nullable RegionAutoscalerAutoscalingPolicyCpuUtilizationGetArgs cpuUtilization) {
            this.cpuUtilization = Codegen.ofNullable(cpuUtilization);
            return this;
        }
        public Builder loadBalancingUtilization(@Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }
        public Builder loadBalancingUtilization(@Nullable RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationGetArgs loadBalancingUtilization) {
            this.loadBalancingUtilization = Codegen.ofNullable(loadBalancingUtilization);
            return this;
        }
        public Builder maxReplicas(Output<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Output.of(Objects.requireNonNull(maxReplicas));
            return this;
        }
        public Builder metrics(@Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricGetArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<RegionAutoscalerAutoscalingPolicyMetricGetArgs> metrics) {
            this.metrics = Codegen.ofNullable(metrics);
            return this;
        }
        public Builder metrics(RegionAutoscalerAutoscalingPolicyMetricGetArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder minReplicas(Output<Integer> minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }
        public Builder minReplicas(Integer minReplicas) {
            this.minReplicas = Output.of(Objects.requireNonNull(minReplicas));
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder scaleDownControl(@Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }
        public Builder scaleDownControl(@Nullable RegionAutoscalerAutoscalingPolicyScaleDownControlGetArgs scaleDownControl) {
            this.scaleDownControl = Codegen.ofNullable(scaleDownControl);
            return this;
        }
        public Builder scaleInControl(@Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlGetArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }
        public Builder scaleInControl(@Nullable RegionAutoscalerAutoscalingPolicyScaleInControlGetArgs scaleInControl) {
            this.scaleInControl = Codegen.ofNullable(scaleInControl);
            return this;
        }
        public Builder scalingSchedules(@Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }
        public Builder scalingSchedules(@Nullable List<RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs> scalingSchedules) {
            this.scalingSchedules = Codegen.ofNullable(scalingSchedules);
            return this;
        }
        public Builder scalingSchedules(RegionAutoscalerAutoscalingPolicyScalingScheduleGetArgs... scalingSchedules) {
            return scalingSchedules(List.of(scalingSchedules));
        }        public RegionAutoscalerAutoscalingPolicyGetArgs build() {
            return new RegionAutoscalerAutoscalingPolicyGetArgs(cooldownPeriod, cpuUtilization, loadBalancingUtilization, maxReplicas, metrics, minReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
