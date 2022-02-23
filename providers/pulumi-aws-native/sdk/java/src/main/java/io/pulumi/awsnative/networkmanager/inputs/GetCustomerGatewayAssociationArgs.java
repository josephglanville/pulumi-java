// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCustomerGatewayAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCustomerGatewayAssociationArgs Empty = new GetCustomerGatewayAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    @InputImport(name="customerGatewayArn", required=true)
      private final String customerGatewayArn;

    public String getCustomerGatewayArn() {
        return this.customerGatewayArn;
    }

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
      private final String globalNetworkId;

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    public GetCustomerGatewayAssociationArgs(
        String customerGatewayArn,
        String globalNetworkId) {
        this.customerGatewayArn = Objects.requireNonNull(customerGatewayArn, "expected parameter 'customerGatewayArn' to be non-null");
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
    }

    private GetCustomerGatewayAssociationArgs() {
        this.customerGatewayArn = null;
        this.globalNetworkId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerGatewayAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customerGatewayArn;
        private String globalNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerGatewayAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerGatewayArn = defaults.customerGatewayArn;
    	      this.globalNetworkId = defaults.globalNetworkId;
        }

        public Builder setCustomerGatewayArn(String customerGatewayArn) {
            this.customerGatewayArn = Objects.requireNonNull(customerGatewayArn);
            return this;
        }

        public Builder setGlobalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        public GetCustomerGatewayAssociationArgs build() {
            return new GetCustomerGatewayAssociationArgs(customerGatewayArn, globalNetworkId);
        }
    }
}
