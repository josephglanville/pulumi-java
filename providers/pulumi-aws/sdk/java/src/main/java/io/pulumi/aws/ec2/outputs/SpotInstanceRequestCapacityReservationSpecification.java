// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotInstanceRequestCapacityReservationSpecification {
    /**
     * Indicates the instance's Capacity Reservation preferences. Can be `"open"` or `"none"`. (Default: `"open"`).
     * 
     */
    private final @Nullable String capacityReservationPreference;
    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    private final @Nullable SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget;

    @CustomType.Constructor
    private SpotInstanceRequestCapacityReservationSpecification(
        @CustomType.Parameter("capacityReservationPreference") @Nullable String capacityReservationPreference,
        @CustomType.Parameter("capacityReservationTarget") @Nullable SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget) {
        this.capacityReservationPreference = capacityReservationPreference;
        this.capacityReservationTarget = capacityReservationTarget;
    }

    /**
     * Indicates the instance's Capacity Reservation preferences. Can be `"open"` or `"none"`. (Default: `"open"`).
     * 
    */
    public Optional<String> getCapacityReservationPreference() {
        return Optional.ofNullable(this.capacityReservationPreference);
    }
    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
    */
    public Optional<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget> getCapacityReservationTarget() {
        return Optional.ofNullable(this.capacityReservationTarget);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestCapacityReservationSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capacityReservationPreference;
        private @Nullable SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestCapacityReservationSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationPreference = defaults.capacityReservationPreference;
    	      this.capacityReservationTarget = defaults.capacityReservationTarget;
        }

        public Builder capacityReservationPreference(@Nullable String capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }
        public Builder capacityReservationTarget(@Nullable SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget) {
            this.capacityReservationTarget = capacityReservationTarget;
            return this;
        }        public SpotInstanceRequestCapacityReservationSpecification build() {
            return new SpotInstanceRequestCapacityReservationSpecification(capacityReservationPreference, capacityReservationTarget);
        }
    }
}
