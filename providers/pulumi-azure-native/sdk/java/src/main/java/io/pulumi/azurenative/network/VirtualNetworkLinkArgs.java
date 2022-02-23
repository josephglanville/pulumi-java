// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkLinkArgs Empty = new VirtualNetworkLinkArgs();

    /**
     * The Azure Region where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @InputImport(name="privateZoneName", required=true)
      private final Input<String> privateZoneName;

    public Input<String> getPrivateZoneName() {
        return this.privateZoneName;
    }

    /**
     * Is auto-registration of virtual machine records in the virtual network in the Private DNS zone enabled?
     * 
     */
    @InputImport(name="registrationEnabled")
      private final @Nullable Input<Boolean> registrationEnabled;

    public Input<Boolean> getRegistrationEnabled() {
        return this.registrationEnabled == null ? Input.empty() : this.registrationEnabled;
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
     * The reference of the virtual network.
     * 
     */
    @InputImport(name="virtualNetwork")
      private final @Nullable Input<SubResourceArgs> virtualNetwork;

    public Input<SubResourceArgs> getVirtualNetwork() {
        return this.virtualNetwork == null ? Input.empty() : this.virtualNetwork;
    }

    /**
     * The name of the virtual network link.
     * 
     */
    @InputImport(name="virtualNetworkLinkName")
      private final @Nullable Input<String> virtualNetworkLinkName;

    public Input<String> getVirtualNetworkLinkName() {
        return this.virtualNetworkLinkName == null ? Input.empty() : this.virtualNetworkLinkName;
    }

    public VirtualNetworkLinkArgs(
        @Nullable Input<String> location,
        Input<String> privateZoneName,
        @Nullable Input<Boolean> registrationEnabled,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<SubResourceArgs> virtualNetwork,
        @Nullable Input<String> virtualNetworkLinkName) {
        this.location = location;
        this.privateZoneName = Objects.requireNonNull(privateZoneName, "expected parameter 'privateZoneName' to be non-null");
        this.registrationEnabled = registrationEnabled;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualNetwork = virtualNetwork;
        this.virtualNetworkLinkName = virtualNetworkLinkName;
    }

    private VirtualNetworkLinkArgs() {
        this.location = Input.empty();
        this.privateZoneName = Input.empty();
        this.registrationEnabled = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.virtualNetwork = Input.empty();
        this.virtualNetworkLinkName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> privateZoneName;
        private @Nullable Input<Boolean> registrationEnabled;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<SubResourceArgs> virtualNetwork;
        private @Nullable Input<String> virtualNetworkLinkName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.privateZoneName = defaults.privateZoneName;
    	      this.registrationEnabled = defaults.registrationEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualNetwork = defaults.virtualNetwork;
    	      this.virtualNetworkLinkName = defaults.virtualNetworkLinkName;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPrivateZoneName(Input<String> privateZoneName) {
            this.privateZoneName = Objects.requireNonNull(privateZoneName);
            return this;
        }

        public Builder setPrivateZoneName(String privateZoneName) {
            this.privateZoneName = Input.of(Objects.requireNonNull(privateZoneName));
            return this;
        }

        public Builder setRegistrationEnabled(@Nullable Input<Boolean> registrationEnabled) {
            this.registrationEnabled = registrationEnabled;
            return this;
        }

        public Builder setRegistrationEnabled(@Nullable Boolean registrationEnabled) {
            this.registrationEnabled = Input.ofNullable(registrationEnabled);
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

        public Builder setVirtualNetwork(@Nullable Input<SubResourceArgs> virtualNetwork) {
            this.virtualNetwork = virtualNetwork;
            return this;
        }

        public Builder setVirtualNetwork(@Nullable SubResourceArgs virtualNetwork) {
            this.virtualNetwork = Input.ofNullable(virtualNetwork);
            return this;
        }

        public Builder setVirtualNetworkLinkName(@Nullable Input<String> virtualNetworkLinkName) {
            this.virtualNetworkLinkName = virtualNetworkLinkName;
            return this;
        }

        public Builder setVirtualNetworkLinkName(@Nullable String virtualNetworkLinkName) {
            this.virtualNetworkLinkName = Input.ofNullable(virtualNetworkLinkName);
            return this;
        }
        public VirtualNetworkLinkArgs build() {
            return new VirtualNetworkLinkArgs(location, privateZoneName, registrationEnabled, resourceGroupName, tags, virtualNetwork, virtualNetworkLinkName);
        }
    }
}
