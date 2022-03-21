// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyCpuUtilizationGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyMetricGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleDownControlGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleInControlGetArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScalingScheduleGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyGetArgs Empty = new AutoscalarAutoscalingPolicyGetArgs();

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
        return this.cooldownPeriod == null ? Output.empty() : this.cooldownPeriod;
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    @Import(name="cpuUtilization")
      private final @Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization;

    public Output<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Output.empty() : this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    @Import(name="loadBalancingUtilization")
      private final @Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization;

    public Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> getLoadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Output.empty() : this.loadBalancingUtilization;
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
      private final @Nullable Output<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics;

    public Output<List<AutoscalarAutoscalingPolicyMetricGetArgs>> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
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
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleDownControl")
      private final @Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl;

    public Output<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> getScaleDownControl() {
        return this.scaleDownControl == null ? Output.empty() : this.scaleDownControl;
    }

    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleInControl")
      private final @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl;

    public Output<AutoscalarAutoscalingPolicyScaleInControlGetArgs> getScaleInControl() {
        return this.scaleInControl == null ? Output.empty() : this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    @Import(name="scalingSchedules")
      private final @Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules;

    public Output<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> getScalingSchedules() {
        return this.scalingSchedules == null ? Output.empty() : this.scalingSchedules;
    }

    public AutoscalarAutoscalingPolicyGetArgs(
        @Nullable Output<Integer> cooldownPeriod,
        @Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization,
        @Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization,
        Output<Integer> maxReplicas,
        @Nullable Output<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics,
        Output<Integer> minReplicas,
        @Nullable Output<String> mode,
        @Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl,
        @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl,
        @Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules) {
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

    private AutoscalarAutoscalingPolicyGetArgs() {
        this.cooldownPeriod = Output.empty();
        this.cpuUtilization = Output.empty();
        this.loadBalancingUtilization = Output.empty();
        this.maxReplicas = Output.empty();
        this.metrics = Output.empty();
        this.minReplicas = Output.empty();
        this.mode = Output.empty();
        this.scaleDownControl = Output.empty();
        this.scaleInControl = Output.empty();
        this.scalingSchedules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cooldownPeriod;
        private @Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization;
        private @Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization;
        private Output<Integer> maxReplicas;
        private @Nullable Output<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics;
        private Output<Integer> minReplicas;
        private @Nullable Output<String> mode;
        private @Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl;
        private @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl;
        private @Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyGetArgs defaults) {
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
            this.cooldownPeriod = Output.ofNullable(cooldownPeriod);
            return this;
        }
        public Builder cpuUtilization(@Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationGetArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }
        public Builder cpuUtilization(@Nullable AutoscalarAutoscalingPolicyCpuUtilizationGetArgs cpuUtilization) {
            this.cpuUtilization = Output.ofNullable(cpuUtilization);
            return this;
        }
        public Builder loadBalancingUtilization(@Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }
        public Builder loadBalancingUtilization(@Nullable AutoscalarAutoscalingPolicyLoadBalancingUtilizationGetArgs loadBalancingUtilization) {
            this.loadBalancingUtilization = Output.ofNullable(loadBalancingUtilization);
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
        public Builder metrics(@Nullable Output<List<AutoscalarAutoscalingPolicyMetricGetArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<AutoscalarAutoscalingPolicyMetricGetArgs> metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }
        public Builder metrics(AutoscalarAutoscalingPolicyMetricGetArgs... metrics) {
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
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder scaleDownControl(@Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlGetArgs> scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }
        public Builder scaleDownControl(@Nullable AutoscalarAutoscalingPolicyScaleDownControlGetArgs scaleDownControl) {
            this.scaleDownControl = Output.ofNullable(scaleDownControl);
            return this;
        }
        public Builder scaleInControl(@Nullable Output<AutoscalarAutoscalingPolicyScaleInControlGetArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }
        public Builder scaleInControl(@Nullable AutoscalarAutoscalingPolicyScaleInControlGetArgs scaleInControl) {
            this.scaleInControl = Output.ofNullable(scaleInControl);
            return this;
        }
        public Builder scalingSchedules(@Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }
        public Builder scalingSchedules(@Nullable List<AutoscalarAutoscalingPolicyScalingScheduleGetArgs> scalingSchedules) {
            this.scalingSchedules = Output.ofNullable(scalingSchedules);
            return this;
        }
        public Builder scalingSchedules(AutoscalarAutoscalingPolicyScalingScheduleGetArgs... scalingSchedules) {
            return scalingSchedules(List.of(scalingSchedules));
        }        public AutoscalarAutoscalingPolicyGetArgs build() {
            return new AutoscalarAutoscalingPolicyGetArgs(cooldownPeriod, cpuUtilization, loadBalancingUtilization, maxReplicas, metrics, minReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
