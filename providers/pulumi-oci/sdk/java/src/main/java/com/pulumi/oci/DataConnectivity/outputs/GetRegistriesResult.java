// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistriesFilter;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistriesRegistrySummaryCollection;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistriesResult {
    /**
     * @return Compartment Identifier
     * 
     */
    private final String compartmentId;
    private final @Nullable List<GetRegistriesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean isDeepLookup;
    private final @Nullable String name;
    /**
     * @return The list of registry_summary_collection.
     * 
     */
    private final List<GetRegistriesRegistrySummaryCollection> registrySummaryCollections;
    /**
     * @return Lifecycle states for registries in Data Connectivity Management Service CREATING - The resource is being created and may not be usable until the entire metadata is defined UPDATING - The resource is being updated and may not be usable until all changes are commited DELETING - The resource is being deleted and might require deep cleanup of children. ACTIVE   - The resource is valid and available for access INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for administrative reasons DELETED  - The resource has been deleted and isn&#39;t available FAILED   - The resource is in a failed state due to validation or other errors
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetRegistriesResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetRegistriesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isDeepLookup") @Nullable Boolean isDeepLookup,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("registrySummaryCollections") List<GetRegistriesRegistrySummaryCollection> registrySummaryCollections,
        @CustomType.Parameter("state") @Nullable String state) {
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.isDeepLookup = isDeepLookup;
        this.name = name;
        this.registrySummaryCollections = registrySummaryCollections;
        this.state = state;
    }

    /**
     * @return Compartment Identifier
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetRegistriesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> isDeepLookup() {
        return Optional.ofNullable(this.isDeepLookup);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The list of registry_summary_collection.
     * 
     */
    public List<GetRegistriesRegistrySummaryCollection> registrySummaryCollections() {
        return this.registrySummaryCollections;
    }
    /**
     * @return Lifecycle states for registries in Data Connectivity Management Service CREATING - The resource is being created and may not be usable until the entire metadata is defined UPDATING - The resource is being updated and may not be usable until all changes are commited DELETING - The resource is being deleted and might require deep cleanup of children. ACTIVE   - The resource is valid and available for access INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for administrative reasons DELETED  - The resource has been deleted and isn&#39;t available FAILED   - The resource is in a failed state due to validation or other errors
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistriesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable List<GetRegistriesFilter> filters;
        private String id;
        private @Nullable Boolean isDeepLookup;
        private @Nullable String name;
        private List<GetRegistriesRegistrySummaryCollection> registrySummaryCollections;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.isDeepLookup = defaults.isDeepLookup;
    	      this.name = defaults.name;
    	      this.registrySummaryCollections = defaults.registrySummaryCollections;
    	      this.state = defaults.state;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetRegistriesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRegistriesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isDeepLookup(@Nullable Boolean isDeepLookup) {
            this.isDeepLookup = isDeepLookup;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder registrySummaryCollections(List<GetRegistriesRegistrySummaryCollection> registrySummaryCollections) {
            this.registrySummaryCollections = Objects.requireNonNull(registrySummaryCollections);
            return this;
        }
        public Builder registrySummaryCollections(GetRegistriesRegistrySummaryCollection... registrySummaryCollections) {
            return registrySummaryCollections(List.of(registrySummaryCollections));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetRegistriesResult build() {
            return new GetRegistriesResult(compartmentId, filters, id, isDeepLookup, name, registrySummaryCollections, state);
        }
    }
}
