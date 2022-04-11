// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.EC2FleetInstanceRequirementsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetPlacementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetFleetLaunchTemplateOverridesRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetFleetLaunchTemplateOverridesRequestArgs Empty = new EC2FleetFleetLaunchTemplateOverridesRequestArgs();

    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    @Import(name="instanceRequirements")
      private final @Nullable Output<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements;

    public Output<EC2FleetInstanceRequirementsRequestArgs> getInstanceRequirements() {
        return this.instanceRequirements == null ? Codegen.empty() : this.instanceRequirements;
    }

    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    @Import(name="maxPrice")
      private final @Nullable Output<String> maxPrice;

    public Output<String> getMaxPrice() {
        return this.maxPrice == null ? Codegen.empty() : this.maxPrice;
    }

    @Import(name="placement")
      private final @Nullable Output<EC2FleetPlacementArgs> placement;

    public Output<EC2FleetPlacementArgs> getPlacement() {
        return this.placement == null ? Codegen.empty() : this.placement;
    }

    @Import(name="priority")
      private final @Nullable Output<Double> priority;

    public Output<Double> getPriority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    @Import(name="weightedCapacity")
      private final @Nullable Output<Double> weightedCapacity;

    public Output<Double> getWeightedCapacity() {
        return this.weightedCapacity == null ? Codegen.empty() : this.weightedCapacity;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequestArgs(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> maxPrice,
        @Nullable Output<EC2FleetPlacementArgs> placement,
        @Nullable Output<Double> priority,
        @Nullable Output<String> subnetId,
        @Nullable Output<Double> weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceRequirements = instanceRequirements;
        this.instanceType = instanceType;
        this.maxPrice = maxPrice;
        this.placement = placement;
        this.priority = priority;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    private EC2FleetFleetLaunchTemplateOverridesRequestArgs() {
        this.availabilityZone = Codegen.empty();
        this.instanceRequirements = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.maxPrice = Codegen.empty();
        this.placement = Codegen.empty();
        this.priority = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.weightedCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetFleetLaunchTemplateOverridesRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> maxPrice;
        private @Nullable Output<EC2FleetPlacementArgs> placement;
        private @Nullable Output<Double> priority;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Double> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetFleetLaunchTemplateOverridesRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceRequirements = defaults.instanceRequirements;
    	      this.instanceType = defaults.instanceType;
    	      this.maxPrice = defaults.maxPrice;
    	      this.placement = defaults.placement;
    	      this.priority = defaults.priority;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder instanceRequirements(@Nullable Output<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements) {
            this.instanceRequirements = instanceRequirements;
            return this;
        }
        public Builder instanceRequirements(@Nullable EC2FleetInstanceRequirementsRequestArgs instanceRequirements) {
            this.instanceRequirements = Codegen.ofNullable(instanceRequirements);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder maxPrice(@Nullable Output<String> maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Builder maxPrice(@Nullable String maxPrice) {
            this.maxPrice = Codegen.ofNullable(maxPrice);
            return this;
        }
        public Builder placement(@Nullable Output<EC2FleetPlacementArgs> placement) {
            this.placement = placement;
            return this;
        }
        public Builder placement(@Nullable EC2FleetPlacementArgs placement) {
            this.placement = Codegen.ofNullable(placement);
            return this;
        }
        public Builder priority(@Nullable Output<Double> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Double priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }
        public Builder weightedCapacity(@Nullable Output<Double> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = Codegen.ofNullable(weightedCapacity);
            return this;
        }        public EC2FleetFleetLaunchTemplateOverridesRequestArgs build() {
            return new EC2FleetFleetLaunchTemplateOverridesRequestArgs(availabilityZone, instanceRequirements, instanceType, maxPrice, placement, priority, subnetId, weightedCapacity);
        }
    }
}
