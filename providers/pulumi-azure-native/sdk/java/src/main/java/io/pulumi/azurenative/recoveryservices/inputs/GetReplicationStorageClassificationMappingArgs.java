// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationStorageClassificationMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicationStorageClassificationMappingArgs Empty = new GetReplicationStorageClassificationMappingArgs();

    @InputImport(name="fabricName", required=true)
    private final String fabricName;

    public String getFabricName() {
        return this.fabricName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    @InputImport(name="storageClassificationMappingName", required=true)
    private final String storageClassificationMappingName;

    public String getStorageClassificationMappingName() {
        return this.storageClassificationMappingName;
    }

    @InputImport(name="storageClassificationName", required=true)
    private final String storageClassificationName;

    public String getStorageClassificationName() {
        return this.storageClassificationName;
    }

    public GetReplicationStorageClassificationMappingArgs(
        String fabricName,
        String resourceGroupName,
        String resourceName,
        String storageClassificationMappingName,
        String storageClassificationName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.storageClassificationMappingName = Objects.requireNonNull(storageClassificationMappingName, "expected parameter 'storageClassificationMappingName' to be non-null");
        this.storageClassificationName = Objects.requireNonNull(storageClassificationName, "expected parameter 'storageClassificationName' to be non-null");
    }

    private GetReplicationStorageClassificationMappingArgs() {
        this.fabricName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
        this.storageClassificationMappingName = null;
        this.storageClassificationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationStorageClassificationMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricName;
        private String resourceGroupName;
        private String resourceName;
        private String storageClassificationMappingName;
        private String storageClassificationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationStorageClassificationMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.storageClassificationMappingName = defaults.storageClassificationMappingName;
    	      this.storageClassificationName = defaults.storageClassificationName;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setStorageClassificationMappingName(String storageClassificationMappingName) {
            this.storageClassificationMappingName = Objects.requireNonNull(storageClassificationMappingName);
            return this;
        }

        public Builder setStorageClassificationName(String storageClassificationName) {
            this.storageClassificationName = Objects.requireNonNull(storageClassificationName);
            return this;
        }

        public GetReplicationStorageClassificationMappingArgs build() {
            return new GetReplicationStorageClassificationMappingArgs(fabricName, resourceGroupName, resourceName, storageClassificationMappingName, storageClassificationName);
        }
    }
}
