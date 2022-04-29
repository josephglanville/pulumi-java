// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetComputeCapacityReservationsComputeCapacityReservation;
import com.pulumi.oci.Core.outputs.GetComputeCapacityReservationsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetComputeCapacityReservationsResult {
    /**
     * @return The availability domain of the compute capacity reservation.  Example: `Uocm:PHX-AD-1`
     * 
     */
    private final @Nullable String availabilityDomain;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the compute capacity reservation.
     * 
     */
    private final String compartmentId;
    /**
     * @return The list of compute_capacity_reservations.
     * 
     */
    private final List<GetComputeCapacityReservationsComputeCapacityReservation> computeCapacityReservations;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetComputeCapacityReservationsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current state of the compute capacity reservation.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetComputeCapacityReservationsResult(
        @CustomType.Parameter("availabilityDomain") @Nullable String availabilityDomain,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("computeCapacityReservations") List<GetComputeCapacityReservationsComputeCapacityReservation> computeCapacityReservations,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetComputeCapacityReservationsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("state") @Nullable String state) {
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.computeCapacityReservations = computeCapacityReservations;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.state = state;
    }

    /**
     * @return The availability domain of the compute capacity reservation.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Optional<String> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the compute capacity reservation.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The list of compute_capacity_reservations.
     * 
     */
    public List<GetComputeCapacityReservationsComputeCapacityReservation> computeCapacityReservations() {
        return this.computeCapacityReservations;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetComputeCapacityReservationsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The current state of the compute capacity reservation.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputeCapacityReservationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityDomain;
        private String compartmentId;
        private List<GetComputeCapacityReservationsComputeCapacityReservation> computeCapacityReservations;
        private @Nullable String displayName;
        private @Nullable List<GetComputeCapacityReservationsFilter> filters;
        private String id;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComputeCapacityReservationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.compartmentId = defaults.compartmentId;
    	      this.computeCapacityReservations = defaults.computeCapacityReservations;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
        }

        public Builder availabilityDomain(@Nullable String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder computeCapacityReservations(List<GetComputeCapacityReservationsComputeCapacityReservation> computeCapacityReservations) {
            this.computeCapacityReservations = Objects.requireNonNull(computeCapacityReservations);
            return this;
        }
        public Builder computeCapacityReservations(GetComputeCapacityReservationsComputeCapacityReservation... computeCapacityReservations) {
            return computeCapacityReservations(List.of(computeCapacityReservations));
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetComputeCapacityReservationsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetComputeCapacityReservationsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetComputeCapacityReservationsResult build() {
            return new GetComputeCapacityReservationsResult(availabilityDomain, compartmentId, computeCapacityReservations, displayName, filters, id, state);
        }
    }
}
