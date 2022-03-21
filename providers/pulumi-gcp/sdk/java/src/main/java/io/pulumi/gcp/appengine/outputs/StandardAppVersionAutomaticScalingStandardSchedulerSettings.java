// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StandardAppVersionAutomaticScalingStandardSchedulerSettings {
    /**
     * Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
     * 
     */
    private final @Nullable Integer maxInstances;
    /**
     * Minimum number of instances to run for this version. Set to zero to disable minInstances configuration.
     * 
     */
    private final @Nullable Integer minInstances;
    /**
     * Target CPU utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
     */
    private final @Nullable Double targetCpuUtilization;
    /**
     * Target throughput utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
     */
    private final @Nullable Double targetThroughputUtilization;

    @CustomType.Constructor
    private StandardAppVersionAutomaticScalingStandardSchedulerSettings(
        @CustomType.Parameter("maxInstances") @Nullable Integer maxInstances,
        @CustomType.Parameter("minInstances") @Nullable Integer minInstances,
        @CustomType.Parameter("targetCpuUtilization") @Nullable Double targetCpuUtilization,
        @CustomType.Parameter("targetThroughputUtilization") @Nullable Double targetThroughputUtilization) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.targetCpuUtilization = targetCpuUtilization;
        this.targetThroughputUtilization = targetThroughputUtilization;
    }

    /**
     * Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
     * 
    */
    public Optional<Integer> getMaxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }
    /**
     * Minimum number of instances to run for this version. Set to zero to disable minInstances configuration.
     * 
    */
    public Optional<Integer> getMinInstances() {
        return Optional.ofNullable(this.minInstances);
    }
    /**
     * Target CPU utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
    */
    public Optional<Double> getTargetCpuUtilization() {
        return Optional.ofNullable(this.targetCpuUtilization);
    }
    /**
     * Target throughput utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
    */
    public Optional<Double> getTargetThroughputUtilization() {
        return Optional.ofNullable(this.targetThroughputUtilization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionAutomaticScalingStandardSchedulerSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private @Nullable Double targetCpuUtilization;
        private @Nullable Double targetThroughputUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionAutomaticScalingStandardSchedulerSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.targetCpuUtilization = defaults.targetCpuUtilization;
    	      this.targetThroughputUtilization = defaults.targetThroughputUtilization;
        }

        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder targetCpuUtilization(@Nullable Double targetCpuUtilization) {
            this.targetCpuUtilization = targetCpuUtilization;
            return this;
        }
        public Builder targetThroughputUtilization(@Nullable Double targetThroughputUtilization) {
            this.targetThroughputUtilization = targetThroughputUtilization;
            return this;
        }        public StandardAppVersionAutomaticScalingStandardSchedulerSettings build() {
            return new StandardAppVersionAutomaticScalingStandardSchedulerSettings(maxInstances, minInstances, targetCpuUtilization, targetThroughputUtilization);
        }
    }
}
