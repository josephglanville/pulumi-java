// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLocalNetworkGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalNetworkGatewayArgs Empty = new GetLocalNetworkGatewayArgs();

    @InputImport(name="localNetworkGatewayName", required=true)
    private final String localNetworkGatewayName;

    public String getLocalNetworkGatewayName() {
        return this.localNetworkGatewayName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLocalNetworkGatewayArgs(
        String localNetworkGatewayName,
        String resourceGroupName) {
        this.localNetworkGatewayName = Objects.requireNonNull(localNetworkGatewayName, "expected parameter 'localNetworkGatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLocalNetworkGatewayArgs() {
        this.localNetworkGatewayName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String localNetworkGatewayName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalNetworkGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localNetworkGatewayName = defaults.localNetworkGatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setLocalNetworkGatewayName(String localNetworkGatewayName) {
            this.localNetworkGatewayName = Objects.requireNonNull(localNetworkGatewayName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetLocalNetworkGatewayArgs build() {
            return new GetLocalNetworkGatewayArgs(localNetworkGatewayName, resourceGroupName);
        }
    }
}
