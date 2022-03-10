// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget {
    /**
     * The ID of the Capacity Reservation in which to run the instance.
     * 
     */
    private final @Nullable String capacityReservationId;

    @OutputCustomType.Constructor
    private SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget(@OutputCustomType.Parameter("capacityReservationId") @Nullable String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * The ID of the Capacity Reservation in which to run the instance.
     * 
    */
    public Optional<String> getCapacityReservationId() {
        return Optional.ofNullable(this.capacityReservationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capacityReservationId;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationId = defaults.capacityReservationId;
        }

        public Builder setCapacityReservationId(@Nullable String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget build() {
            return new SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget(capacityReservationId);
        }
    }
}
