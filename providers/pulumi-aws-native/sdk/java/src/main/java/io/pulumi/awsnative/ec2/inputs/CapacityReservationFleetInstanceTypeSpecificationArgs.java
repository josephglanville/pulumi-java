// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityReservationFleetInstanceTypeSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityReservationFleetInstanceTypeSpecificationArgs Empty = new CapacityReservationFleetInstanceTypeSpecificationArgs();

    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    @Import(name="availabilityZoneId")
      private final @Nullable Output<String> availabilityZoneId;

    public Output<String> getAvailabilityZoneId() {
        return this.availabilityZoneId == null ? Codegen.empty() : this.availabilityZoneId;
    }

    @Import(name="ebsOptimized")
      private final @Nullable Output<Boolean> ebsOptimized;

    public Output<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Codegen.empty() : this.ebsOptimized;
    }

    @Import(name="instancePlatform")
      private final @Nullable Output<String> instancePlatform;

    public Output<String> getInstancePlatform() {
        return this.instancePlatform == null ? Codegen.empty() : this.instancePlatform;
    }

    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    @Import(name="weight")
      private final @Nullable Output<Double> weight;

    public Output<Double> getWeight() {
        return this.weight == null ? Codegen.empty() : this.weight;
    }

    public CapacityReservationFleetInstanceTypeSpecificationArgs(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> availabilityZoneId,
        @Nullable Output<Boolean> ebsOptimized,
        @Nullable Output<String> instancePlatform,
        @Nullable Output<String> instanceType,
        @Nullable Output<Integer> priority,
        @Nullable Output<Double> weight) {
        this.availabilityZone = availabilityZone;
        this.availabilityZoneId = availabilityZoneId;
        this.ebsOptimized = ebsOptimized;
        this.instancePlatform = instancePlatform;
        this.instanceType = instanceType;
        this.priority = priority;
        this.weight = weight;
    }

    private CapacityReservationFleetInstanceTypeSpecificationArgs() {
        this.availabilityZone = Codegen.empty();
        this.availabilityZoneId = Codegen.empty();
        this.ebsOptimized = Codegen.empty();
        this.instancePlatform = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.priority = Codegen.empty();
        this.weight = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationFleetInstanceTypeSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> availabilityZoneId;
        private @Nullable Output<Boolean> ebsOptimized;
        private @Nullable Output<String> instancePlatform;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<Double> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationFleetInstanceTypeSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.instancePlatform = defaults.instancePlatform;
    	      this.instanceType = defaults.instanceType;
    	      this.priority = defaults.priority;
    	      this.weight = defaults.weight;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder availabilityZoneId(@Nullable Output<String> availabilityZoneId) {
            this.availabilityZoneId = availabilityZoneId;
            return this;
        }
        public Builder availabilityZoneId(@Nullable String availabilityZoneId) {
            this.availabilityZoneId = Codegen.ofNullable(availabilityZoneId);
            return this;
        }
        public Builder ebsOptimized(@Nullable Output<Boolean> ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }
        public Builder ebsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = Codegen.ofNullable(ebsOptimized);
            return this;
        }
        public Builder instancePlatform(@Nullable Output<String> instancePlatform) {
            this.instancePlatform = instancePlatform;
            return this;
        }
        public Builder instancePlatform(@Nullable String instancePlatform) {
            this.instancePlatform = Codegen.ofNullable(instancePlatform);
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
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder weight(@Nullable Output<Double> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Double weight) {
            this.weight = Codegen.ofNullable(weight);
            return this;
        }        public CapacityReservationFleetInstanceTypeSpecificationArgs build() {
            return new CapacityReservationFleetInstanceTypeSpecificationArgs(availabilityZone, availabilityZoneId, ebsOptimized, instancePlatform, instanceType, priority, weight);
        }
    }
}
