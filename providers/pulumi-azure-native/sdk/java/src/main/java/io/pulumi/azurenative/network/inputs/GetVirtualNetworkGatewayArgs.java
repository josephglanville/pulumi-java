// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkGatewayArgs Empty = new GetVirtualNetworkGatewayArgs();

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
     * The name of the virtual network gateway.
     * 
     */
    @InputImport(name="virtualNetworkGatewayName", required=true)
      private final String virtualNetworkGatewayName;

    public String getVirtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    public GetVirtualNetworkGatewayArgs(
        String resourceGroupName,
        String virtualNetworkGatewayName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkGatewayName = Objects.requireNonNull(virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
    }

    private GetVirtualNetworkGatewayArgs() {
        this.resourceGroupName = null;
        this.virtualNetworkGatewayName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String virtualNetworkGatewayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkGatewayName = defaults.virtualNetworkGatewayName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVirtualNetworkGatewayName(String virtualNetworkGatewayName) {
            this.virtualNetworkGatewayName = Objects.requireNonNull(virtualNetworkGatewayName);
            return this;
        }
        public GetVirtualNetworkGatewayArgs build() {
            return new GetVirtualNetworkGatewayArgs(resourceGroupName, virtualNetworkGatewayName);
        }
    }
}
