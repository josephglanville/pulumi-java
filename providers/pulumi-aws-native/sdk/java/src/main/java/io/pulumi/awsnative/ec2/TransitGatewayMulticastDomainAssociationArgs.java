// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TransitGatewayMulticastDomainAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayMulticastDomainAssociationArgs Empty = new TransitGatewayMulticastDomainAssociationArgs();

    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * 
     */
    @InputImport(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @InputImport(name="transitGatewayAttachmentId", required=true)
      private final Output<String> transitGatewayAttachmentId;

    public Output<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @InputImport(name="transitGatewayMulticastDomainId", required=true)
      private final Output<String> transitGatewayMulticastDomainId;

    public Output<String> getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public TransitGatewayMulticastDomainAssociationArgs(
        Output<String> subnetId,
        Output<String> transitGatewayAttachmentId,
        Output<String> transitGatewayMulticastDomainId) {
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
        this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
    }

    private TransitGatewayMulticastDomainAssociationArgs() {
        this.subnetId = Output.empty();
        this.transitGatewayAttachmentId = Output.empty();
        this.transitGatewayMulticastDomainId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayMulticastDomainAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> subnetId;
        private Output<String> transitGatewayAttachmentId;
        private Output<String> transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayMulticastDomainAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }

        public Builder transitGatewayAttachmentId(Output<String> transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId);
            return this;
        }

        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Output.of(Objects.requireNonNull(transitGatewayAttachmentId));
            return this;
        }

        public Builder transitGatewayMulticastDomainId(Output<String> transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId);
            return this;
        }

        public Builder transitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Output.of(Objects.requireNonNull(transitGatewayMulticastDomainId));
            return this;
        }
        public TransitGatewayMulticastDomainAssociationArgs build() {
            return new TransitGatewayMulticastDomainAssociationArgs(subnetId, transitGatewayAttachmentId, transitGatewayMulticastDomainId);
        }
    }
}
