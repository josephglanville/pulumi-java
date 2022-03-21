// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.awsnative.dynamodb.outputs.GlobalTableTargetTrackingScalingPolicyConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalTableCapacityAutoScalingSettings {
    private final Integer maxCapacity;
    private final Integer minCapacity;
    private final @Nullable Integer seedCapacity;
    private final GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;

    @CustomType.Constructor
    private GlobalTableCapacityAutoScalingSettings(
        @CustomType.Parameter("maxCapacity") Integer maxCapacity,
        @CustomType.Parameter("minCapacity") Integer minCapacity,
        @CustomType.Parameter("seedCapacity") @Nullable Integer seedCapacity,
        @CustomType.Parameter("targetTrackingScalingPolicyConfiguration") GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.seedCapacity = seedCapacity;
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
    }

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }
    public Integer getMinCapacity() {
        return this.minCapacity;
    }
    public Optional<Integer> getSeedCapacity() {
        return Optional.ofNullable(this.seedCapacity);
    }
    public GlobalTableTargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfiguration() {
        return this.targetTrackingScalingPolicyConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableCapacityAutoScalingSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxCapacity;
        private Integer minCapacity;
        private @Nullable Integer seedCapacity;
        private GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableCapacityAutoScalingSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.seedCapacity = defaults.seedCapacity;
    	      this.targetTrackingScalingPolicyConfiguration = defaults.targetTrackingScalingPolicyConfiguration;
        }

        public Builder maxCapacity(Integer maxCapacity) {
            this.maxCapacity = Objects.requireNonNull(maxCapacity);
            return this;
        }
        public Builder minCapacity(Integer minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }
        public Builder seedCapacity(@Nullable Integer seedCapacity) {
            this.seedCapacity = seedCapacity;
            return this;
        }
        public Builder targetTrackingScalingPolicyConfiguration(GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
            this.targetTrackingScalingPolicyConfiguration = Objects.requireNonNull(targetTrackingScalingPolicyConfiguration);
            return this;
        }        public GlobalTableCapacityAutoScalingSettings build() {
            return new GlobalTableCapacityAutoScalingSettings(maxCapacity, minCapacity, seedCapacity, targetTrackingScalingPolicyConfiguration);
        }
    }
}
