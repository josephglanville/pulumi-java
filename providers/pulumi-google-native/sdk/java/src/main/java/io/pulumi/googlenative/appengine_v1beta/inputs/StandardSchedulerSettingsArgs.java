// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scheduler settings for standard environment.
 * 
 */
public final class StandardSchedulerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardSchedulerSettingsArgs Empty = new StandardSchedulerSettingsArgs();

    /**
     * Maximum number of instances to run for this version. Set to zero to disable max_instances configuration.
     * 
     */
    @Import(name="maxInstances")
      private final @Nullable Output<Integer> maxInstances;

    public Output<Integer> getMaxInstances() {
        return this.maxInstances == null ? Output.empty() : this.maxInstances;
    }

    /**
     * Minimum number of instances to run for this version. Set to zero to disable min_instances configuration.
     * 
     */
    @Import(name="minInstances")
      private final @Nullable Output<Integer> minInstances;

    public Output<Integer> getMinInstances() {
        return this.minInstances == null ? Output.empty() : this.minInstances;
    }

    /**
     * Target CPU utilization ratio to maintain when scaling.
     * 
     */
    @Import(name="targetCpuUtilization")
      private final @Nullable Output<Double> targetCpuUtilization;

    public Output<Double> getTargetCpuUtilization() {
        return this.targetCpuUtilization == null ? Output.empty() : this.targetCpuUtilization;
    }

    /**
     * Target throughput utilization ratio to maintain when scaling
     * 
     */
    @Import(name="targetThroughputUtilization")
      private final @Nullable Output<Double> targetThroughputUtilization;

    public Output<Double> getTargetThroughputUtilization() {
        return this.targetThroughputUtilization == null ? Output.empty() : this.targetThroughputUtilization;
    }

    public StandardSchedulerSettingsArgs(
        @Nullable Output<Integer> maxInstances,
        @Nullable Output<Integer> minInstances,
        @Nullable Output<Double> targetCpuUtilization,
        @Nullable Output<Double> targetThroughputUtilization) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.targetCpuUtilization = targetCpuUtilization;
        this.targetThroughputUtilization = targetThroughputUtilization;
    }

    private StandardSchedulerSettingsArgs() {
        this.maxInstances = Output.empty();
        this.minInstances = Output.empty();
        this.targetCpuUtilization = Output.empty();
        this.targetThroughputUtilization = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSchedulerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxInstances;
        private @Nullable Output<Integer> minInstances;
        private @Nullable Output<Double> targetCpuUtilization;
        private @Nullable Output<Double> targetThroughputUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSchedulerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.targetCpuUtilization = defaults.targetCpuUtilization;
    	      this.targetThroughputUtilization = defaults.targetThroughputUtilization;
        }

        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Output.ofNullable(maxInstances);
            return this;
        }
        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = Output.ofNullable(minInstances);
            return this;
        }
        public Builder targetCpuUtilization(@Nullable Output<Double> targetCpuUtilization) {
            this.targetCpuUtilization = targetCpuUtilization;
            return this;
        }
        public Builder targetCpuUtilization(@Nullable Double targetCpuUtilization) {
            this.targetCpuUtilization = Output.ofNullable(targetCpuUtilization);
            return this;
        }
        public Builder targetThroughputUtilization(@Nullable Output<Double> targetThroughputUtilization) {
            this.targetThroughputUtilization = targetThroughputUtilization;
            return this;
        }
        public Builder targetThroughputUtilization(@Nullable Double targetThroughputUtilization) {
            this.targetThroughputUtilization = Output.ofNullable(targetThroughputUtilization);
            return this;
        }        public StandardSchedulerSettingsArgs build() {
            return new StandardSchedulerSettingsArgs(maxInstances, minInstances, targetCpuUtilization, targetThroughputUtilization);
        }
    }
}
