// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerGatewayAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayAssociationArgs Empty = new CustomerGatewayAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    @Import(name="customerGatewayArn", required=true)
      private final Output<String> customerGatewayArn;

    public Output<String> getCustomerGatewayArn() {
        return this.customerGatewayArn;
    }

    /**
     * The ID of the device
     * 
     */
    @Import(name="deviceId", required=true)
      private final Output<String> deviceId;

    public Output<String> getDeviceId() {
        return this.deviceId;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
      private final Output<String> globalNetworkId;

    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link
     * 
     */
    @Import(name="linkId")
      private final @Nullable Output<String> linkId;

    public Output<String> getLinkId() {
        return this.linkId == null ? Output.empty() : this.linkId;
    }

    public CustomerGatewayAssociationArgs(
        Output<String> customerGatewayArn,
        Output<String> deviceId,
        Output<String> globalNetworkId,
        @Nullable Output<String> linkId) {
        this.customerGatewayArn = Objects.requireNonNull(customerGatewayArn, "expected parameter 'customerGatewayArn' to be non-null");
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.linkId = linkId;
    }

    private CustomerGatewayAssociationArgs() {
        this.customerGatewayArn = Output.empty();
        this.deviceId = Output.empty();
        this.globalNetworkId = Output.empty();
        this.linkId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerGatewayAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> customerGatewayArn;
        private Output<String> deviceId;
        private Output<String> globalNetworkId;
        private @Nullable Output<String> linkId;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerGatewayAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerGatewayArn = defaults.customerGatewayArn;
    	      this.deviceId = defaults.deviceId;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.linkId = defaults.linkId;
        }

        public Builder customerGatewayArn(Output<String> customerGatewayArn) {
            this.customerGatewayArn = Objects.requireNonNull(customerGatewayArn);
            return this;
        }
        public Builder customerGatewayArn(String customerGatewayArn) {
            this.customerGatewayArn = Output.of(Objects.requireNonNull(customerGatewayArn));
            return this;
        }
        public Builder deviceId(Output<String> deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        public Builder deviceId(String deviceId) {
            this.deviceId = Output.of(Objects.requireNonNull(deviceId));
            return this;
        }
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Output.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }
        public Builder linkId(@Nullable Output<String> linkId) {
            this.linkId = linkId;
            return this;
        }
        public Builder linkId(@Nullable String linkId) {
            this.linkId = Output.ofNullable(linkId);
            return this;
        }        public CustomerGatewayAssociationArgs build() {
            return new CustomerGatewayAssociationArgs(customerGatewayArn, deviceId, globalNetworkId, linkId);
        }
    }
}
