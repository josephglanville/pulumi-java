// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.enums.CapacityProviderAutoScalingGroupProviderManagedTerminationProtection;
import io.pulumi.awsnative.ecs.outputs.CapacityProviderManagedScaling;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapacityProviderAutoScalingGroupProvider {
    private final String autoScalingGroupArn;
    private final @Nullable CapacityProviderManagedScaling managedScaling;
    private final @Nullable CapacityProviderAutoScalingGroupProviderManagedTerminationProtection managedTerminationProtection;

    @CustomType.Constructor
    private CapacityProviderAutoScalingGroupProvider(
        @CustomType.Parameter("autoScalingGroupArn") String autoScalingGroupArn,
        @CustomType.Parameter("managedScaling") @Nullable CapacityProviderManagedScaling managedScaling,
        @CustomType.Parameter("managedTerminationProtection") @Nullable CapacityProviderAutoScalingGroupProviderManagedTerminationProtection managedTerminationProtection) {
        this.autoScalingGroupArn = autoScalingGroupArn;
        this.managedScaling = managedScaling;
        this.managedTerminationProtection = managedTerminationProtection;
    }

    public String getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }
    public Optional<CapacityProviderManagedScaling> getManagedScaling() {
        return Optional.ofNullable(this.managedScaling);
    }
    public Optional<CapacityProviderAutoScalingGroupProviderManagedTerminationProtection> getManagedTerminationProtection() {
        return Optional.ofNullable(this.managedTerminationProtection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoScalingGroupArn;
        private @Nullable CapacityProviderManagedScaling managedScaling;
        private @Nullable CapacityProviderAutoScalingGroupProviderManagedTerminationProtection managedTerminationProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupArn = defaults.autoScalingGroupArn;
    	      this.managedScaling = defaults.managedScaling;
    	      this.managedTerminationProtection = defaults.managedTerminationProtection;
        }

        public Builder autoScalingGroupArn(String autoScalingGroupArn) {
            this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn);
            return this;
        }
        public Builder managedScaling(@Nullable CapacityProviderManagedScaling managedScaling) {
            this.managedScaling = managedScaling;
            return this;
        }
        public Builder managedTerminationProtection(@Nullable CapacityProviderAutoScalingGroupProviderManagedTerminationProtection managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }        public CapacityProviderAutoScalingGroupProvider build() {
            return new CapacityProviderAutoScalingGroupProvider(autoScalingGroupArn, managedScaling, managedTerminationProtection);
        }
    }
}
