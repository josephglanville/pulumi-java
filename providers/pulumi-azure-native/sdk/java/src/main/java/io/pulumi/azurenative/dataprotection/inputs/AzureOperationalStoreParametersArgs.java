// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.enums.DataStoreTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for Operational-Tier DataStore
 * 
 */
public final class AzureOperationalStoreParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureOperationalStoreParametersArgs Empty = new AzureOperationalStoreParametersArgs();

    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    @InputImport(name="dataStoreType", required=true)
      private final Input<Either<String,DataStoreTypes>> dataStoreType;

    public Input<Either<String,DataStoreTypes>> getDataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AzureOperationalStoreParameters'.
     * 
     */
    @InputImport(name="objectType", required=true)
      private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the Snapshot Resource Group Uri.
     * 
     */
    @InputImport(name="resourceGroupId")
      private final @Nullable Input<String> resourceGroupId;

    public Input<String> getResourceGroupId() {
        return this.resourceGroupId == null ? Input.empty() : this.resourceGroupId;
    }

    public AzureOperationalStoreParametersArgs(
        Input<Either<String,DataStoreTypes>> dataStoreType,
        Input<String> objectType,
        @Nullable Input<String> resourceGroupId) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType, "expected parameter 'dataStoreType' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.resourceGroupId = resourceGroupId;
    }

    private AzureOperationalStoreParametersArgs() {
        this.dataStoreType = Input.empty();
        this.objectType = Input.empty();
        this.resourceGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureOperationalStoreParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,DataStoreTypes>> dataStoreType;
        private Input<String> objectType;
        private @Nullable Input<String> resourceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureOperationalStoreParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        public Builder setDataStoreType(Input<Either<String,DataStoreTypes>> dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }

        public Builder setDataStoreType(Either<String,DataStoreTypes> dataStoreType) {
            this.dataStoreType = Input.of(Objects.requireNonNull(dataStoreType));
            return this;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public Builder setResourceGroupId(@Nullable Input<String> resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public Builder setResourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = Input.ofNullable(resourceGroupId);
            return this;
        }
        public AzureOperationalStoreParametersArgs build() {
            return new AzureOperationalStoreParametersArgs(dataStoreType, objectType, resourceGroupId);
        }
    }
}
