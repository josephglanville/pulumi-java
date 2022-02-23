// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExpressRouteConnectionArgs Empty = new GetExpressRouteConnectionArgs();

    /**
     * The name of the ExpressRoute connection.
     * 
     */
    @InputImport(name="connectionName", required=true)
      private final String connectionName;

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * The name of the ExpressRoute gateway.
     * 
     */
    @InputImport(name="expressRouteGatewayName", required=true)
      private final String expressRouteGatewayName;

    public String getExpressRouteGatewayName() {
        return this.expressRouteGatewayName;
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

    public GetExpressRouteConnectionArgs(
        String connectionName,
        String expressRouteGatewayName,
        String resourceGroupName) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.expressRouteGatewayName = Objects.requireNonNull(expressRouteGatewayName, "expected parameter 'expressRouteGatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExpressRouteConnectionArgs() {
        this.connectionName = null;
        this.expressRouteGatewayName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionName;
        private String expressRouteGatewayName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressRouteConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.expressRouteGatewayName = defaults.expressRouteGatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setConnectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }

        public Builder setExpressRouteGatewayName(String expressRouteGatewayName) {
            this.expressRouteGatewayName = Objects.requireNonNull(expressRouteGatewayName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetExpressRouteConnectionArgs build() {
            return new GetExpressRouteConnectionArgs(connectionName, expressRouteGatewayName, resourceGroupName);
        }
    }
}
