// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkLinkArgs Empty = new GetVirtualNetworkLinkArgs();

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @InputImport(name="privateZoneName", required=true)
      private final String privateZoneName;

    public String getPrivateZoneName() {
        return this.privateZoneName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual network link.
     * 
     */
    @InputImport(name="virtualNetworkLinkName", required=true)
      private final String virtualNetworkLinkName;

    public String getVirtualNetworkLinkName() {
        return this.virtualNetworkLinkName;
    }

    public GetVirtualNetworkLinkArgs(
        String privateZoneName,
        String resourceGroupName,
        String virtualNetworkLinkName) {
        this.privateZoneName = Objects.requireNonNull(privateZoneName, "expected parameter 'privateZoneName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkLinkName = Objects.requireNonNull(virtualNetworkLinkName, "expected parameter 'virtualNetworkLinkName' to be non-null");
    }

    private GetVirtualNetworkLinkArgs() {
        this.privateZoneName = null;
        this.resourceGroupName = null;
        this.virtualNetworkLinkName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateZoneName;
        private String resourceGroupName;
        private String virtualNetworkLinkName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateZoneName = defaults.privateZoneName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkLinkName = defaults.virtualNetworkLinkName;
        }

        public Builder setPrivateZoneName(String privateZoneName) {
            this.privateZoneName = Objects.requireNonNull(privateZoneName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVirtualNetworkLinkName(String virtualNetworkLinkName) {
            this.virtualNetworkLinkName = Objects.requireNonNull(virtualNetworkLinkName);
            return this;
        }
        public GetVirtualNetworkLinkArgs build() {
            return new GetVirtualNetworkLinkArgs(privateZoneName, resourceGroupName, virtualNetworkLinkName);
        }
    }
}
