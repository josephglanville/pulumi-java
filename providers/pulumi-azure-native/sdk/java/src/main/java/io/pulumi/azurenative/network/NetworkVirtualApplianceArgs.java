// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VirtualApplianceSkuPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkVirtualApplianceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkVirtualApplianceArgs Empty = new NetworkVirtualApplianceArgs();

    /**
     * BootStrapConfigurationBlobs storage URLs.
     * 
     */
    @InputImport(name="bootStrapConfigurationBlobs")
      private final @Nullable Input<List<String>> bootStrapConfigurationBlobs;

    public Input<List<String>> getBootStrapConfigurationBlobs() {
        return this.bootStrapConfigurationBlobs == null ? Input.empty() : this.bootStrapConfigurationBlobs;
    }

    /**
     * CloudInitConfiguration string in plain text.
     * 
     */
    @InputImport(name="cloudInitConfiguration")
      private final @Nullable Input<String> cloudInitConfiguration;

    public Input<String> getCloudInitConfiguration() {
        return this.cloudInitConfiguration == null ? Input.empty() : this.cloudInitConfiguration;
    }

    /**
     * CloudInitConfigurationBlob storage URLs.
     * 
     */
    @InputImport(name="cloudInitConfigurationBlobs")
      private final @Nullable Input<List<String>> cloudInitConfigurationBlobs;

    public Input<List<String>> getCloudInitConfigurationBlobs() {
        return this.cloudInitConfigurationBlobs == null ? Input.empty() : this.cloudInitConfigurationBlobs;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The service principal that has read access to cloud-init and config blob.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of Network Virtual Appliance.
     * 
     */
    @InputImport(name="networkVirtualApplianceName")
      private final @Nullable Input<String> networkVirtualApplianceName;

    public Input<String> getNetworkVirtualApplianceName() {
        return this.networkVirtualApplianceName == null ? Input.empty() : this.networkVirtualApplianceName;
    }

    /**
     * Network Virtual Appliance SKU.
     * 
     */
    @InputImport(name="nvaSku")
      private final @Nullable Input<VirtualApplianceSkuPropertiesArgs> nvaSku;

    public Input<VirtualApplianceSkuPropertiesArgs> getNvaSku() {
        return this.nvaSku == null ? Input.empty() : this.nvaSku;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * VirtualAppliance ASN.
     * 
     */
    @InputImport(name="virtualApplianceAsn")
      private final @Nullable Input<Double> virtualApplianceAsn;

    public Input<Double> getVirtualApplianceAsn() {
        return this.virtualApplianceAsn == null ? Input.empty() : this.virtualApplianceAsn;
    }

    /**
     * The Virtual Hub where Network Virtual Appliance is being deployed.
     * 
     */
    @InputImport(name="virtualHub")
      private final @Nullable Input<SubResourceArgs> virtualHub;

    public Input<SubResourceArgs> getVirtualHub() {
        return this.virtualHub == null ? Input.empty() : this.virtualHub;
    }

    public NetworkVirtualApplianceArgs(
        @Nullable Input<List<String>> bootStrapConfigurationBlobs,
        @Nullable Input<String> cloudInitConfiguration,
        @Nullable Input<List<String>> cloudInitConfigurationBlobs,
        @Nullable Input<String> id,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<String> networkVirtualApplianceName,
        @Nullable Input<VirtualApplianceSkuPropertiesArgs> nvaSku,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Double> virtualApplianceAsn,
        @Nullable Input<SubResourceArgs> virtualHub) {
        this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
        this.cloudInitConfiguration = cloudInitConfiguration;
        this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.networkVirtualApplianceName = networkVirtualApplianceName;
        this.nvaSku = nvaSku;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualApplianceAsn = virtualApplianceAsn;
        this.virtualHub = virtualHub;
    }

    private NetworkVirtualApplianceArgs() {
        this.bootStrapConfigurationBlobs = Input.empty();
        this.cloudInitConfiguration = Input.empty();
        this.cloudInitConfigurationBlobs = Input.empty();
        this.id = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.networkVirtualApplianceName = Input.empty();
        this.nvaSku = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.virtualApplianceAsn = Input.empty();
        this.virtualHub = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkVirtualApplianceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> bootStrapConfigurationBlobs;
        private @Nullable Input<String> cloudInitConfiguration;
        private @Nullable Input<List<String>> cloudInitConfigurationBlobs;
        private @Nullable Input<String> id;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<String> networkVirtualApplianceName;
        private @Nullable Input<VirtualApplianceSkuPropertiesArgs> nvaSku;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Double> virtualApplianceAsn;
        private @Nullable Input<SubResourceArgs> virtualHub;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkVirtualApplianceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootStrapConfigurationBlobs = defaults.bootStrapConfigurationBlobs;
    	      this.cloudInitConfiguration = defaults.cloudInitConfiguration;
    	      this.cloudInitConfigurationBlobs = defaults.cloudInitConfigurationBlobs;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.networkVirtualApplianceName = defaults.networkVirtualApplianceName;
    	      this.nvaSku = defaults.nvaSku;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualApplianceAsn = defaults.virtualApplianceAsn;
    	      this.virtualHub = defaults.virtualHub;
        }

        public Builder setBootStrapConfigurationBlobs(@Nullable Input<List<String>> bootStrapConfigurationBlobs) {
            this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
            return this;
        }

        public Builder setBootStrapConfigurationBlobs(@Nullable List<String> bootStrapConfigurationBlobs) {
            this.bootStrapConfigurationBlobs = Input.ofNullable(bootStrapConfigurationBlobs);
            return this;
        }

        public Builder setCloudInitConfiguration(@Nullable Input<String> cloudInitConfiguration) {
            this.cloudInitConfiguration = cloudInitConfiguration;
            return this;
        }

        public Builder setCloudInitConfiguration(@Nullable String cloudInitConfiguration) {
            this.cloudInitConfiguration = Input.ofNullable(cloudInitConfiguration);
            return this;
        }

        public Builder setCloudInitConfigurationBlobs(@Nullable Input<List<String>> cloudInitConfigurationBlobs) {
            this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
            return this;
        }

        public Builder setCloudInitConfigurationBlobs(@Nullable List<String> cloudInitConfigurationBlobs) {
            this.cloudInitConfigurationBlobs = Input.ofNullable(cloudInitConfigurationBlobs);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNetworkVirtualApplianceName(@Nullable Input<String> networkVirtualApplianceName) {
            this.networkVirtualApplianceName = networkVirtualApplianceName;
            return this;
        }

        public Builder setNetworkVirtualApplianceName(@Nullable String networkVirtualApplianceName) {
            this.networkVirtualApplianceName = Input.ofNullable(networkVirtualApplianceName);
            return this;
        }

        public Builder setNvaSku(@Nullable Input<VirtualApplianceSkuPropertiesArgs> nvaSku) {
            this.nvaSku = nvaSku;
            return this;
        }

        public Builder setNvaSku(@Nullable VirtualApplianceSkuPropertiesArgs nvaSku) {
            this.nvaSku = Input.ofNullable(nvaSku);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVirtualApplianceAsn(@Nullable Input<Double> virtualApplianceAsn) {
            this.virtualApplianceAsn = virtualApplianceAsn;
            return this;
        }

        public Builder setVirtualApplianceAsn(@Nullable Double virtualApplianceAsn) {
            this.virtualApplianceAsn = Input.ofNullable(virtualApplianceAsn);
            return this;
        }

        public Builder setVirtualHub(@Nullable Input<SubResourceArgs> virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }

        public Builder setVirtualHub(@Nullable SubResourceArgs virtualHub) {
            this.virtualHub = Input.ofNullable(virtualHub);
            return this;
        }
        public NetworkVirtualApplianceArgs build() {
            return new NetworkVirtualApplianceArgs(bootStrapConfigurationBlobs, cloudInitConfiguration, cloudInitConfigurationBlobs, id, identity, location, networkVirtualApplianceName, nvaSku, resourceGroupName, tags, virtualApplianceAsn, virtualHub);
        }
    }
}
