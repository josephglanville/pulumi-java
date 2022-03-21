// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters for Operational-Tier DataStore
 * 
 */
public final class AzureOperationalStoreParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureOperationalStoreParametersResponse Empty = new AzureOperationalStoreParametersResponse();

    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    @Import(name="dataStoreType", required=true)
      private final String dataStoreType;

    public String getDataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AzureOperationalStoreParameters'.
     * 
     */
    @Import(name="objectType", required=true)
      private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the Snapshot Resource Group Uri.
     * 
     */
    @Import(name="resourceGroupId")
      private final @Nullable String resourceGroupId;

    public Optional<String> getResourceGroupId() {
        return this.resourceGroupId == null ? Optional.empty() : Optional.ofNullable(this.resourceGroupId);
    }

    public AzureOperationalStoreParametersResponse(
        String dataStoreType,
        String objectType,
        @Nullable String resourceGroupId) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType, "expected parameter 'dataStoreType' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.resourceGroupId = resourceGroupId;
    }

    private AzureOperationalStoreParametersResponse() {
        this.dataStoreType = null;
        this.objectType = null;
        this.resourceGroupId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureOperationalStoreParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataStoreType;
        private String objectType;
        private @Nullable String resourceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureOperationalStoreParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        public Builder dataStoreType(String dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }        public AzureOperationalStoreParametersResponse build() {
            return new AzureOperationalStoreParametersResponse(dataStoreType, objectType, resourceGroupId);
        }
    }
}
