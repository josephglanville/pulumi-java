// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CapacityReservationInstanceViewWithNameResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class CapacityReservationGroupInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final CapacityReservationGroupInstanceViewResponse Empty = new CapacityReservationGroupInstanceViewResponse();

    @InputImport(name="capacityReservations", required=true)
    private final List<CapacityReservationInstanceViewWithNameResponse> capacityReservations;

    public List<CapacityReservationInstanceViewWithNameResponse> getCapacityReservations() {
        return this.capacityReservations;
    }

    public CapacityReservationGroupInstanceViewResponse(List<CapacityReservationInstanceViewWithNameResponse> capacityReservations) {
        this.capacityReservations = Objects.requireNonNull(capacityReservations, "expected parameter 'capacityReservations' to be non-null");
    }

    private CapacityReservationGroupInstanceViewResponse() {
        this.capacityReservations = List.of();
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
