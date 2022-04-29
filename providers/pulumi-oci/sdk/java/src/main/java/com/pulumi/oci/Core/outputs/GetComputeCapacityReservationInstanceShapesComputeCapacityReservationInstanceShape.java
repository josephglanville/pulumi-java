// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetComputeCapacityReservationInstanceShapesComputeCapacityReservationInstanceShape {
    /**
     * @return The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    private final String availabilityDomain;
    /**
     * @return The name of the available shape used to launch instances in a compute capacity reservation.
     * 
     */
    private final String instanceShape;

    @CustomType.Constructor
    private GetComputeCapacityReservationInstanceShapesComputeCapacityReservationInstanceShape(
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("instanceShape") String instanceShape) {
        this.availabilityDomain = availabilityDomain;
        this.instanceShape = instanceShape;
    }

    /**
     * @return The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return The name of the available shape used to launch instances in a compute capacity reservation.
     * 
     */
    public String instanceShape() {
        return this.instanceShape;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputeCapacityReservationInstanceShapesComputeCapacityReservationInstanceShape defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityDomain;
        private String instanceShape;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComputeCapacityReservationInstanceShapesComputeCapacityReservationInstanceShape defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.instanceShape = defaults.instanceShape;
        }

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder instanceShape(String instanceShape) {
            this.instanceShape = Objects.requireNonNull(instanceShape);
            return this;
        }        public GetComputeCapacityReservationInstanceShapesComputeCapacityReservationInstanceShape build() {
            return new GetComputeCapacityReservationInstanceShapesComputeCapacityReservationInstanceShape(availabilityDomain, instanceShape);
        }
    }
}
