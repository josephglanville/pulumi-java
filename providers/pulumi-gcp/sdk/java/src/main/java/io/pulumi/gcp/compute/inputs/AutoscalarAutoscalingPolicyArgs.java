// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyCpuUtilizationArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyMetricArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleDownControlArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleInControlArgs;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScalingScheduleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyArgs Empty = new AutoscalarAutoscalingPolicyArgs();

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
    @InputImport(name="cooldownPeriod")
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
    @InputImport(name="cpuUtilization")
      private final @Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationArgs> cpuUtilization;

    public Output<AutoscalarAutoscalingPolicyCpuUtilizationArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Output.empty() : this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    @InputImport(name="loadBalancingUtilization")
      private final @Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;

    public Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs> getLoadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Output.empty() : this.loadBalancingUtilization;
    }

    /**
     * The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    @InputImport(name="maxReplicas", required=true)
      private final Output<Integer> maxReplicas;

    public Output<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metrics")
      private final @Nullable Output<List<AutoscalarAutoscalingPolicyMetricArgs>> metrics;

    public Output<List<AutoscalarAutoscalingPolicyMetricArgs>> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    @InputImport(name="minReplicas", required=true)
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
    @InputImport(name="mode")
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
    @InputImport(name="scaleDownControl")
      private final @Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlArgs> scaleDownControl;

    public Output<AutoscalarAutoscalingPolicyScaleDownControlArgs> getScaleDownControl() {
        return this.scaleDownControl == null ? Output.empty() : this.scaleDownControl;
    }

    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @InputImport(name="scaleInControl")
      private final @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlArgs> scaleInControl;

    public Output<AutoscalarAutoscalingPolicyScaleInControlArgs> getScaleInControl() {
        return this.scaleInControl == null ? Output.empty() : this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scalingSchedules")
      private final @Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleArgs>> scalingSchedules;

    public Output<List<AutoscalarAutoscalingPolicyScalingScheduleArgs>> getScalingSchedules() {
        return this.scalingSchedules == null ? Output.empty() : this.scalingSchedules;
    }

    public AutoscalarAutoscalingPolicyArgs(
        @Nullable Output<Integer> cooldownPeriod,
        @Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationArgs> cpuUtilization,
        @Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization,
        Output<Integer> maxReplicas,
        @Nullable Output<List<AutoscalarAutoscalingPolicyMetricArgs>> metrics,
        Output<Integer> minReplicas,
        @Nullable Output<String> mode,
        @Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlArgs> scaleDownControl,
        @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlArgs> scaleInControl,
        @Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleArgs>> scalingSchedules) {
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

    private AutoscalarAutoscalingPolicyArgs() {
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

    public static Builder builder(AutoscalarAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cooldownPeriod;
        private @Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationArgs> cpuUtilization;
        private @Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;
        private Output<Integer> maxReplicas;
        private @Nullable Output<List<AutoscalarAutoscalingPolicyMetricArgs>> metrics;
        private Output<Integer> minReplicas;
        private @Nullable Output<String> mode;
        private @Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlArgs> scaleDownControl;
        private @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlArgs> scaleInControl;
        private @Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleArgs>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyArgs defaults) {
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

        public Builder cpuUtilization(@Nullable Output<AutoscalarAutoscalingPolicyCpuUtilizationArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder cpuUtilization(@Nullable AutoscalarAutoscalingPolicyCpuUtilizationArgs cpuUtilization) {
            this.cpuUtilization = Output.ofNullable(cpuUtilization);
            return this;
        }

        public Builder loadBalancingUtilization(@Nullable Output<AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }

        public Builder loadBalancingUtilization(@Nullable AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs loadBalancingUtilization) {
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

        public Builder metrics(@Nullable Output<List<AutoscalarAutoscalingPolicyMetricArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder metrics(@Nullable List<AutoscalarAutoscalingPolicyMetricArgs> metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
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

        public Builder scaleDownControl(@Nullable Output<AutoscalarAutoscalingPolicyScaleDownControlArgs> scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }

        public Builder scaleDownControl(@Nullable AutoscalarAutoscalingPolicyScaleDownControlArgs scaleDownControl) {
            this.scaleDownControl = Output.ofNullable(scaleDownControl);
            return this;
        }

        public Builder scaleInControl(@Nullable Output<AutoscalarAutoscalingPolicyScaleInControlArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }

        public Builder scaleInControl(@Nullable AutoscalarAutoscalingPolicyScaleInControlArgs scaleInControl) {
            this.scaleInControl = Output.ofNullable(scaleInControl);
            return this;
        }

        public Builder scalingSchedules(@Nullable Output<List<AutoscalarAutoscalingPolicyScalingScheduleArgs>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }

        public Builder scalingSchedules(@Nullable List<AutoscalarAutoscalingPolicyScalingScheduleArgs> scalingSchedules) {
            this.scalingSchedules = Output.ofNullable(scalingSchedules);
            return this;
        }
        public AutoscalarAutoscalingPolicyArgs build() {
            return new AutoscalarAutoscalingPolicyArgs(cooldownPeriod, cpuUtilization, loadBalancingUtilization, maxReplicas, metrics, minReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
