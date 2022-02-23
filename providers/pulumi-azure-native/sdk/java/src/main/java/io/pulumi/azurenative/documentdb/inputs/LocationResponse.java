// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A region in which the Azure Cosmos DB database account is deployed.
 * 
 */
public final class LocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocationResponse Empty = new LocationResponse();

    /**
     * The connection endpoint for the specific region. Example: https://&lt;accountName&gt;-&lt;locationName&gt;.documents.azure.com:443/
     * 
     */
    @InputImport(name="documentEndpoint", required=true)
      private final String documentEndpoint;

    public String getDocumentEndpoint() {
        return this.documentEndpoint;
    }

    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    @InputImport(name="failoverPriority")
      private final @Nullable Integer failoverPriority;

    public Optional<Integer> getFailoverPriority() {
        return this.failoverPriority == null ? Optional.empty() : Optional.ofNullable(this.failoverPriority);
    }

    /**
     * The unique identifier of the region within the database account. Example: &lt;accountName&gt;-&lt;locationName&gt;.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Flag to indicate whether or not this region is an AvailabilityZone region
     * 
     */
    @InputImport(name="isZoneRedundant")
      private final @Nullable Boolean isZoneRedundant;

    public Optional<Boolean> getIsZoneRedundant() {
        return this.isZoneRedundant == null ? Optional.empty() : Optional.ofNullable(this.isZoneRedundant);
    }

    /**
     * The name of the region.
     * 
     */
    @InputImport(name="locationName")
      private final @Nullable String locationName;

    public Optional<String> getLocationName() {
        return this.locationName == null ? Optional.empty() : Optional.ofNullable(this.locationName);
    }

    /**
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB account deletion failed.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public LocationResponse(
        String documentEndpoint,
        @Nullable Integer failoverPriority,
        String id,
        @Nullable Boolean isZoneRedundant,
        @Nullable String locationName,
        String provisioningState) {
        this.documentEndpoint = Objects.requireNonNull(documentEndpoint, "expected parameter 'documentEndpoint' to be non-null");
        this.failoverPriority = failoverPriority;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isZoneRedundant = isZoneRedundant;
        this.locationName = locationName;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private LocationResponse() {
        this.documentEndpoint = null;
        this.failoverPriority = null;
        this.id = null;
        this.isZoneRedundant = null;
        this.locationName = null;
        this.provisioningState = null;
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

        public Builder setDocumentEndpoint(String documentEndpoint) {
            this.documentEndpoint = Objects.requireNonNull(documentEndpoint);
            return this;
        }

        public Builder setFailoverPriority(@Nullable Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsZoneRedundant(@Nullable Boolean isZoneRedundant) {
            this.isZoneRedundant = isZoneRedundant;
            return this;
        }

        public Builder setLocationName(@Nullable String locationName) {
            this.locationName = locationName;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public LocationResponse build() {
            return new LocationResponse(documentEndpoint, failoverPriority, id, isZoneRedundant, locationName, provisioningState);
        }
    }
}
