// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.devices.inputs.IotDpsPropertiesDescriptionArgs;
import io.pulumi.azurenative.devices.inputs.IotDpsSkuInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotDpsResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotDpsResourceArgs Empty = new IotDpsResourceArgs();

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Service specific properties for a provisioning service
     * 
     */
    @Import(name="properties", required=true)
      private final Output<IotDpsPropertiesDescriptionArgs> properties;

    public Output<IotDpsPropertiesDescriptionArgs> getProperties() {
        return this.properties;
    }

    /**
     * Name of provisioning service to create or update.
     * 
     */
    @Import(name="provisioningServiceName")
      private final @Nullable Output<String> provisioningServiceName;

    public Output<String> getProvisioningServiceName() {
        return this.provisioningServiceName == null ? Output.empty() : this.provisioningServiceName;
    }

    /**
     * Resource group identifier.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sku info for a provisioning Service.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<IotDpsSkuInfoArgs> sku;

    public Output<IotDpsSkuInfoArgs> getSku() {
        return this.sku;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public IotDpsResourceArgs(
        @Nullable Output<String> location,
        Output<IotDpsPropertiesDescriptionArgs> properties,
        @Nullable Output<String> provisioningServiceName,
        Output<String> resourceGroupName,
        Output<IotDpsSkuInfoArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.provisioningServiceName = provisioningServiceName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private IotDpsResourceArgs() {
        this.location = Output.empty();
        this.properties = Output.empty();
        this.provisioningServiceName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotDpsResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<IotDpsPropertiesDescriptionArgs> properties;
        private @Nullable Output<String> provisioningServiceName;
        private Output<String> resourceGroupName;
        private Output<IotDpsSkuInfoArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IotDpsResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.provisioningServiceName = defaults.provisioningServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder properties(Output<IotDpsPropertiesDescriptionArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(IotDpsPropertiesDescriptionArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder provisioningServiceName(@Nullable Output<String> provisioningServiceName) {
            this.provisioningServiceName = provisioningServiceName;
            return this;
        }
        public Builder provisioningServiceName(@Nullable String provisioningServiceName) {
            this.provisioningServiceName = Output.ofNullable(provisioningServiceName);
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
        public Builder sku(Output<IotDpsSkuInfoArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(IotDpsSkuInfoArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public IotDpsResourceArgs build() {
            return new IotDpsResourceArgs(location, properties, provisioningServiceName, resourceGroupName, sku, tags);
        }
    }
}
