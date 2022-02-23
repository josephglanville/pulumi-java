// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayRouteTableAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGatewayRouteTableAssociationArgs Empty = new GetGatewayRouteTableAssociationArgs();

    /**
     * The ID of the gateway.
     * 
     */
    @InputImport(name="gatewayId", required=true)
      private final String gatewayId;

    public String getGatewayId() {
        return this.gatewayId;
    }

    public GetGatewayRouteTableAssociationArgs(String gatewayId) {
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
    }

    private GetGatewayRouteTableAssociationArgs() {
        this.gatewayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteTableAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayRouteTableAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        public GetGatewayRouteTableAssociationArgs build() {
            return new GetGatewayRouteTableAssociationArgs(gatewayId);
        }
    }
}
