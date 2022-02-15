// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.CapacityProviderManagedScalingStatus;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderManagedScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderManagedScalingArgs Empty = new CapacityProviderManagedScalingArgs();

    @InputImport(name="instanceWarmupPeriod")
    private final @Nullable Input<Integer> instanceWarmupPeriod;

    public Input<Integer> getInstanceWarmupPeriod() {
        return this.instanceWarmupPeriod == null ? Input.empty() : this.instanceWarmupPeriod;
    }

    @InputImport(name="maximumScalingStepSize")
    private final @Nullable Input<Integer> maximumScalingStepSize;

    public Input<Integer> getMaximumScalingStepSize() {
        return this.maximumScalingStepSize == null ? Input.empty() : this.maximumScalingStepSize;
    }

    @InputImport(name="minimumScalingStepSize")
    private final @Nullable Input<Integer> minimumScalingStepSize;

    public Input<Integer> getMinimumScalingStepSize() {
        return this.minimumScalingStepSize == null ? Input.empty() : this.minimumScalingStepSize;
    }

    @InputImport(name="status")
    private final @Nullable Input<CapacityProviderManagedScalingStatus> status;

    public Input<CapacityProviderManagedScalingStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="targetCapacity")
    private final @Nullable Input<Integer> targetCapacity;

    public Input<Integer> getTargetCapacity() {
        return this.targetCapacity == null ? Input.empty() : this.targetCapacity;
    }

    public CapacityProviderManagedScalingArgs(
        @Nullable Input<Integer> instanceWarmupPeriod,
        @Nullable Input<Integer> maximumScalingStepSize,
        @Nullable Input<Integer> minimumScalingStepSize,
        @Nullable Input<CapacityProviderManagedScalingStatus> status,
        @Nullable Input<Integer> targetCapacity) {
        this.instanceWarmupPeriod = instanceWarmupPeriod;
        this.maximumScalingStepSize = maximumScalingStepSize;
        this.minimumScalingStepSize = minimumScalingStepSize;
        this.status = status;
        this.targetCapacity = targetCapacity;
    }

    private CapacityProviderManagedScalingArgs() {
        this.instanceWarmupPeriod = Input.empty();
        this.maximumScalingStepSize = Input.empty();
        this.minimumScalingStepSize = Input.empty();
        this.status = Input.empty();
        this.targetCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderManagedScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> instanceWarmupPeriod;
        private @Nullable Input<Integer> maximumScalingStepSize;
        private @Nullable Input<Integer> minimumScalingStepSize;
        private @Nullable Input<CapacityProviderManagedScalingStatus> status;
        private @Nullable Input<Integer> targetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderManagedScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceWarmupPeriod = defaults.instanceWarmupPeriod;
    	      this.maximumScalingStepSize = defaults.maximumScalingStepSize;
    	      this.minimumScalingStepSize = defaults.minimumScalingStepSize;
    	      this.status = defaults.status;
    	      this.targetCapacity = defaults.targetCapacity;
        }

        public Builder setInstanceWarmupPeriod(@Nullable Input<Integer> instanceWarmupPeriod) {
            this.instanceWarmupPeriod = instanceWarmupPeriod;
            return this;
        }

        public Builder setInstanceWarmupPeriod(@Nullable Integer instanceWarmupPeriod) {
            this.instanceWarmupPeriod = Input.ofNullable(instanceWarmupPeriod);
            return this;
        }

        public Builder setMaximumScalingStepSize(@Nullable Input<Integer> maximumScalingStepSize) {
            this.maximumScalingStepSize = maximumScalingStepSize;
            return this;
        }

        public Builder setMaximumScalingStepSize(@Nullable Integer maximumScalingStepSize) {
            this.maximumScalingStepSize = Input.ofNullable(maximumScalingStepSize);
            return this;
        }

        public Builder setMinimumScalingStepSize(@Nullable Input<Integer> minimumScalingStepSize) {
            this.minimumScalingStepSize = minimumScalingStepSize;
            return this;
        }

        public Builder setMinimumScalingStepSize(@Nullable Integer minimumScalingStepSize) {
            this.minimumScalingStepSize = Input.ofNullable(minimumScalingStepSize);
            return this;
        }

        public Builder setStatus(@Nullable Input<CapacityProviderManagedScalingStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable CapacityProviderManagedScalingStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTargetCapacity(@Nullable Input<Integer> targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        public Builder setTargetCapacity(@Nullable Integer targetCapacity) {
            this.targetCapacity = Input.ofNullable(targetCapacity);
            return this;
        }

        public CapacityProviderManagedScalingArgs build() {
            return new CapacityProviderManagedScalingArgs(instanceWarmupPeriod, maximumScalingStepSize, minimumScalingStepSize, status, targetCapacity);
        }
    }
}