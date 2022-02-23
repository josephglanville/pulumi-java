// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVpnGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpnGatewayArgs Empty = new GetVpnGatewayArgs();

    /**
     * The name of the gateway.
     * 
     */
    @InputImport(name="gatewayName", required=true)
      private final String gatewayName;

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * The resource group name of the VpnGateway.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetVpnGatewayArgs(
        String gatewayName,
        String resourceGroupName) {
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetVpnGatewayArgs() {
        this.gatewayName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayName = defaults.gatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setGatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetVpnGatewayArgs build() {
            return new GetVpnGatewayArgs(gatewayName, resourceGroupName);
        }
    }
}
