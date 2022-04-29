// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Identity.outputs.GetAvailabilityDomainsAvailabilityDomain;
import com.pulumi.oci.Identity.outputs.GetAvailabilityDomainsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAvailabilityDomainsResult {
    /**
     * @return The list of availability_domains.
     * 
     */
    private final List<GetAvailabilityDomainsAvailabilityDomain> availabilityDomains;
    /**
     * @return The OCID of the tenancy.
     * 
     */
    private final String compartmentId;
    private final @Nullable List<GetAvailabilityDomainsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetAvailabilityDomainsResult(
        @CustomType.Parameter("availabilityDomains") List<GetAvailabilityDomainsAvailabilityDomain> availabilityDomains,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetAvailabilityDomainsFilter> filters,
        @CustomType.Parameter("id") String id) {
        this.availabilityDomains = availabilityDomains;
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
    }

    /**
     * @return The list of availability_domains.
     * 
     */
    public List<GetAvailabilityDomainsAvailabilityDomain> availabilityDomains() {
        return this.availabilityDomains;
    }
    /**
     * @return The OCID of the tenancy.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetAvailabilityDomainsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityDomainsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAvailabilityDomainsAvailabilityDomain> availabilityDomains;
        private String compartmentId;
        private @Nullable List<GetAvailabilityDomainsFilter> filters;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityDomainsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomains = defaults.availabilityDomains;
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
        }

        public Builder availabilityDomains(List<GetAvailabilityDomainsAvailabilityDomain> availabilityDomains) {
            this.availabilityDomains = Objects.requireNonNull(availabilityDomains);
            return this;
        }
        public Builder availabilityDomains(GetAvailabilityDomainsAvailabilityDomain... availabilityDomains) {
            return availabilityDomains(List.of(availabilityDomains));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetAvailabilityDomainsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAvailabilityDomainsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetAvailabilityDomainsResult build() {
            return new GetAvailabilityDomainsResult(availabilityDomains, compartmentId, filters, id);
        }
    }
}
