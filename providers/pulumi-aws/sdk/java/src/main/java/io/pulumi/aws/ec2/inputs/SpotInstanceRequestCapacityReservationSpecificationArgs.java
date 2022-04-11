// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotInstanceRequestCapacityReservationSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestCapacityReservationSpecificationArgs Empty = new SpotInstanceRequestCapacityReservationSpecificationArgs();

    /**
     * Indicates the instance's Capacity Reservation preferences. Can be `"open"` or `"none"`. (Default: `"open"`).
     * 
     */
    @Import(name="capacityReservationPreference")
      private final @Nullable Output<String> capacityReservationPreference;

    public Output<String> getCapacityReservationPreference() {
        return this.capacityReservationPreference == null ? Codegen.empty() : this.capacityReservationPreference;
    }

    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    @Import(name="capacityReservationTarget")
      private final @Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget;

    public Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs> getCapacityReservationTarget() {
        return this.capacityReservationTarget == null ? Codegen.empty() : this.capacityReservationTarget;
    }

    public SpotInstanceRequestCapacityReservationSpecificationArgs(
        @Nullable Output<String> capacityReservationPreference,
        @Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget) {
        this.capacityReservationPreference = capacityReservationPreference;
        this.capacityReservationTarget = capacityReservationTarget;
    }

    private SpotInstanceRequestCapacityReservationSpecificationArgs() {
        this.capacityReservationPreference = Codegen.empty();
        this.capacityReservationTarget = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestCapacityReservationSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> capacityReservationPreference;
        private @Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestCapacityReservationSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationPreference = defaults.capacityReservationPreference;
    	      this.capacityReservationTarget = defaults.capacityReservationTarget;
        }

        public Builder capacityReservationPreference(@Nullable Output<String> capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }
        public Builder capacityReservationPreference(@Nullable String capacityReservationPreference) {
            this.capacityReservationPreference = Codegen.ofNullable(capacityReservationPreference);
            return this;
        }
        public Builder capacityReservationTarget(@Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget) {
            this.capacityReservationTarget = capacityReservationTarget;
            return this;
        }
        public Builder capacityReservationTarget(@Nullable SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs capacityReservationTarget) {
            this.capacityReservationTarget = Codegen.ofNullable(capacityReservationTarget);
            return this;
        }        public SpotInstanceRequestCapacityReservationSpecificationArgs build() {
            return new SpotInstanceRequestCapacityReservationSpecificationArgs(capacityReservationPreference, capacityReservationTarget);
        }
    }
}
