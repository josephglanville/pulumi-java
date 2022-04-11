// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.StorageAccountArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageArgs Empty = new StorageArgs();

    /**
     * Properties of the storage resource payload.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<StorageAccountArgs> properties;

    public Output<StorageAccountArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * The name of the storage resource.
     * 
     */
    @Import(name="storageName")
      private final @Nullable Output<String> storageName;

    public Output<String> getStorageName() {
        return this.storageName == null ? Codegen.empty() : this.storageName;
    }

    public StorageArgs(
        @Nullable Output<StorageAccountArgs> properties,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<String> storageName) {
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.storageName = storageName;
    }

    private StorageArgs() {
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.storageName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StorageAccountArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<String> storageName;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.storageName = defaults.storageName;
        }

        public Builder properties(@Nullable Output<StorageAccountArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable StorageAccountArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder storageName(@Nullable Output<String> storageName) {
            this.storageName = storageName;
            return this;
        }
        public Builder storageName(@Nullable String storageName) {
            this.storageName = Codegen.ofNullable(storageName);
            return this;
        }        public StorageArgs build() {
            return new StorageArgs(properties, resourceGroupName, serviceName, storageName);
        }
    }
}
