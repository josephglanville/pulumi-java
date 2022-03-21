// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocationResponse {
    /**
     * The connection endpoint for the specific region. Example: https://&lt;accountName&gt;-&lt;locationName&gt;.documents.azure.com:443/
     * 
     */
    private final String documentEndpoint;
    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    private final @Nullable Integer failoverPriority;
    /**
     * The unique identifier of the region within the database account. Example: &lt;accountName&gt;-&lt;locationName&gt;.
     * 
     */
    private final String id;
    /**
     * Flag to indicate whether or not this region is an AvailabilityZone region
     * 
     */
    private final @Nullable Boolean isZoneRedundant;
    /**
     * The name of the region.
     * 
     */
    private final @Nullable String locationName;
    /**
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB account deletion failed.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private LocationResponse(
        @CustomType.Parameter("documentEndpoint") String documentEndpoint,
        @CustomType.Parameter("failoverPriority") @Nullable Integer failoverPriority,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isZoneRedundant") @Nullable Boolean isZoneRedundant,
        @CustomType.Parameter("locationName") @Nullable String locationName,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.documentEndpoint = documentEndpoint;
        this.failoverPriority = failoverPriority;
        this.id = id;
        this.isZoneRedundant = isZoneRedundant;
        this.locationName = locationName;
        this.provisioningState = provisioningState;
    }

    /**
     * The connection endpoint for the specific region. Example: https://&lt;accountName&gt;-&lt;locationName&gt;.documents.azure.com:443/
     * 
    */
    public String getDocumentEndpoint() {
        return this.documentEndpoint;
    }
    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
    */
    public Optional<Integer> getFailoverPriority() {
        return Optional.ofNullable(this.failoverPriority);
    }
    /**
     * The unique identifier of the region within the database account. Example: &lt;accountName&gt;-&lt;locationName&gt;.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Flag to indicate whether or not this region is an AvailabilityZone region
     * 
    */
    public Optional<Boolean> getIsZoneRedundant() {
        return Optional.ofNullable(this.isZoneRedundant);
    }
    /**
     * The name of the region.
     * 
    */
    public Optional<String> getLocationName() {
        return Optional.ofNullable(this.locationName);
    }
    /**
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB account deletion failed.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentEndpoint;
        private @Nullable Integer failoverPriority;
        private String id;
        private @Nullable Boolean isZoneRedundant;
        private @Nullable String locationName;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentEndpoint = defaults.documentEndpoint;
    	      this.failoverPriority = defaults.failoverPriority;
    	      this.id = defaults.id;
    	      this.isZoneRedundant = defaults.isZoneRedundant;
    	      this.locationName = defaults.locationName;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder documentEndpoint(String documentEndpoint) {
            this.documentEndpoint = Objects.requireNonNull(documentEndpoint);
            return this;
        }
        public Builder failoverPriority(@Nullable Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isZoneRedundant(@Nullable Boolean isZoneRedundant) {
            this.isZoneRedundant = isZoneRedundant;
            return this;
        }
        public Builder locationName(@Nullable String locationName) {
            this.locationName = locationName;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public LocationResponse build() {
            return new LocationResponse(documentEndpoint, failoverPriority, id, isZoneRedundant, locationName, provisioningState);
        }
    }
}
