// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetInstancesFilter;
import com.pulumi.oci.Core.outputs.GetInstancesInstance;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    /**
     * @return The availability domain the instance is running in.  Example: `Uocm:PHX-AD-1`
     * 
     */
    private final @Nullable String availabilityDomain;
    /**
     * @return The OCID of the compute capacity reservation this instance is launched under. When this field contains an empty string or is null, the instance is not currently in a capacity reservation. For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     * 
     */
    private final @Nullable String capacityReservationId;
    /**
     * @return The OCID of the compartment that contains the instance.
     * 
     */
    private final String compartmentId;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetInstancesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The list of instances.
     * 
     */
    private final List<GetInstancesInstance> instances;
    /**
     * @return The current state of the instance.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetInstancesResult(
        @CustomType.Parameter("availabilityDomain") @Nullable String availabilityDomain,
        @CustomType.Parameter("capacityReservationId") @Nullable String capacityReservationId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetInstancesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instances") List<GetInstancesInstance> instances,
        @CustomType.Parameter("state") @Nullable String state) {
        this.availabilityDomain = availabilityDomain;
        this.capacityReservationId = capacityReservationId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.instances = instances;
        this.state = state;
    }

    /**
     * @return The availability domain the instance is running in.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Optional<String> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }
    /**
     * @return The OCID of the compute capacity reservation this instance is launched under. When this field contains an empty string or is null, the instance is not currently in a capacity reservation. For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     * 
     */
    public Optional<String> capacityReservationId() {
        return Optional.ofNullable(this.capacityReservationId);
    }
    /**
     * @return The OCID of the compartment that contains the instance.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetInstancesFilter> filters() {
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
     * @return The list of instances.
     * 
     */
    public List<GetInstancesInstance> instances() {
        return this.instances;
    }
    /**
     * @return The current state of the instance.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityDomain;
        private @Nullable String capacityReservationId;
        private String compartmentId;
        private @Nullable String displayName;
        private @Nullable List<GetInstancesFilter> filters;
        private String id;
        private List<GetInstancesInstance> instances;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.capacityReservationId = defaults.capacityReservationId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.state = defaults.state;
        }

        public Builder availabilityDomain(@Nullable String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }
        public Builder capacityReservationId(@Nullable String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetInstancesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInstancesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instances(List<GetInstancesInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GetInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetInstancesResult build() {
            return new GetInstancesResult(availabilityDomain, capacityReservationId, compartmentId, displayName, filters, id, instances, state);
        }
    }
}
