// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CapacityReservationInstanceViewWithNameResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CapacityReservationGroupInstanceViewResponse {
    private final List<CapacityReservationInstanceViewWithNameResponse> capacityReservations;

    @OutputCustomType.Constructor({"capacityReservations"})
    private CapacityReservationGroupInstanceViewResponse(List<CapacityReservationInstanceViewWithNameResponse> capacityReservations) {
        this.capacityReservations = Objects.requireNonNull(capacityReservations);
    }

    public List<CapacityReservationInstanceViewWithNameResponse> getCapacityReservations() {
        return this.capacityReservations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationGroupInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CapacityReservationInstanceViewWithNameResponse> capacityReservations;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationGroupInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservations = defaults.capacityReservations;
        }

        public Builder setCapacityReservations(List<CapacityReservationInstanceViewWithNameResponse> capacityReservations) {
            this.capacityReservations = Objects.requireNonNull(capacityReservations);
            return this;
        }

        public CapacityReservationGroupInstanceViewResponse build() {
            return new CapacityReservationGroupInstanceViewResponse(capacityReservations);
        }
    }
}
