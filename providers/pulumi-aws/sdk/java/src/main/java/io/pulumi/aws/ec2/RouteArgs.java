// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * Identifier of a carrier gateway. This attribute can only be used when the VPC contains a subnet which is associated with a Wavelength Zone.
     * 
     */
    @Import(name="carrierGatewayId")
      private final @Nullable Output<String> carrierGatewayId;

    public Output<String> getCarrierGatewayId() {
        return this.carrierGatewayId == null ? Codegen.empty() : this.carrierGatewayId;
    }

    /**
     * The destination CIDR block.
     * 
     */
    @Import(name="destinationCidrBlock")
      private final @Nullable Output<String> destinationCidrBlock;

    public Output<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock == null ? Codegen.empty() : this.destinationCidrBlock;
    }

    /**
     * The destination IPv6 CIDR block.
     * 
     */
    @Import(name="destinationIpv6CidrBlock")
      private final @Nullable Output<String> destinationIpv6CidrBlock;

    public Output<String> getDestinationIpv6CidrBlock() {
        return this.destinationIpv6CidrBlock == null ? Codegen.empty() : this.destinationIpv6CidrBlock;
    }

    /**
     * The ID of a managed prefix list destination.
     * 
     */
    @Import(name="destinationPrefixListId")
      private final @Nullable Output<String> destinationPrefixListId;

    public Output<String> getDestinationPrefixListId() {
        return this.destinationPrefixListId == null ? Codegen.empty() : this.destinationPrefixListId;
    }

    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     * 
     */
    @Import(name="egressOnlyGatewayId")
      private final @Nullable Output<String> egressOnlyGatewayId;

    public Output<String> getEgressOnlyGatewayId() {
        return this.egressOnlyGatewayId == null ? Codegen.empty() : this.egressOnlyGatewayId;
    }

    /**
     * Identifier of a VPC internet gateway or a virtual private gateway.
     * 
     */
    @Import(name="gatewayId")
      private final @Nullable Output<String> gatewayId;

    public Output<String> getGatewayId() {
        return this.gatewayId == null ? Codegen.empty() : this.gatewayId;
    }

    /**
     * Identifier of an EC2 instance.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * Identifier of a Outpost local gateway.
     * 
     */
    @Import(name="localGatewayId")
      private final @Nullable Output<String> localGatewayId;

    public Output<String> getLocalGatewayId() {
        return this.localGatewayId == null ? Codegen.empty() : this.localGatewayId;
    }

    /**
     * Identifier of a VPC NAT gateway.
     * 
     */
    @Import(name="natGatewayId")
      private final @Nullable Output<String> natGatewayId;

    public Output<String> getNatGatewayId() {
        return this.natGatewayId == null ? Codegen.empty() : this.natGatewayId;
    }

    /**
     * Identifier of an EC2 network interface.
     * 
     */
    @Import(name="networkInterfaceId")
      private final @Nullable Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Codegen.empty() : this.networkInterfaceId;
    }

    /**
     * The ID of the routing table.
     * 
     */
    @Import(name="routeTableId", required=true)
      private final Output<String> routeTableId;

    public Output<String> getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * Identifier of an EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId")
      private final @Nullable Output<String> transitGatewayId;

    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Codegen.empty() : this.transitGatewayId;
    }

    /**
     * Identifier of a VPC Endpoint.
     * 
     */
    @Import(name="vpcEndpointId")
      private final @Nullable Output<String> vpcEndpointId;

    public Output<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Codegen.empty() : this.vpcEndpointId;
    }

    /**
     * Identifier of a VPC peering connection.
     * 
     */
    @Import(name="vpcPeeringConnectionId")
      private final @Nullable Output<String> vpcPeeringConnectionId;

    public Output<String> getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId == null ? Codegen.empty() : this.vpcPeeringConnectionId;
    }

    public RouteArgs(
        @Nullable Output<String> carrierGatewayId,
        @Nullable Output<String> destinationCidrBlock,
        @Nullable Output<String> destinationIpv6CidrBlock,
        @Nullable Output<String> destinationPrefixListId,
        @Nullable Output<String> egressOnlyGatewayId,
        @Nullable Output<String> gatewayId,
        @Nullable Output<String> instanceId,
        @Nullable Output<String> localGatewayId,
        @Nullable Output<String> natGatewayId,
        @Nullable Output<String> networkInterfaceId,
        Output<String> routeTableId,
        @Nullable Output<String> transitGatewayId,
        @Nullable Output<String> vpcEndpointId,
        @Nullable Output<String> vpcPeeringConnectionId) {
        this.carrierGatewayId = carrierGatewayId;
        this.destinationCidrBlock = destinationCidrBlock;
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
        this.destinationPrefixListId = destinationPrefixListId;
        this.egressOnlyGatewayId = egressOnlyGatewayId;
        this.gatewayId = gatewayId;
        this.instanceId = instanceId;
        this.localGatewayId = localGatewayId;
        this.natGatewayId = natGatewayId;
        this.networkInterfaceId = networkInterfaceId;
        this.routeTableId = Objects.requireNonNull(routeTableId, "expected parameter 'routeTableId' to be non-null");
        this.transitGatewayId = transitGatewayId;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    private RouteArgs() {
        this.carrierGatewayId = Codegen.empty();
        this.destinationCidrBlock = Codegen.empty();
        this.destinationIpv6CidrBlock = Codegen.empty();
        this.destinationPrefixListId = Codegen.empty();
        this.egressOnlyGatewayId = Codegen.empty();
        this.gatewayId = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.localGatewayId = Codegen.empty();
        this.natGatewayId = Codegen.empty();
        this.networkInterfaceId = Codegen.empty();
        this.routeTableId = Codegen.empty();
        this.transitGatewayId = Codegen.empty();
        this.vpcEndpointId = Codegen.empty();
        this.vpcPeeringConnectionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> carrierGatewayId;
        private @Nullable Output<String> destinationCidrBlock;
        private @Nullable Output<String> destinationIpv6CidrBlock;
        private @Nullable Output<String> destinationPrefixListId;
        private @Nullable Output<String> egressOnlyGatewayId;
        private @Nullable Output<String> gatewayId;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> localGatewayId;
        private @Nullable Output<String> natGatewayId;
        private @Nullable Output<String> networkInterfaceId;
        private Output<String> routeTableId;
        private @Nullable Output<String> transitGatewayId;
        private @Nullable Output<String> vpcEndpointId;
        private @Nullable Output<String> vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierGatewayId = defaults.carrierGatewayId;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.destinationIpv6CidrBlock = defaults.destinationIpv6CidrBlock;
    	      this.destinationPrefixListId = defaults.destinationPrefixListId;
    	      this.egressOnlyGatewayId = defaults.egressOnlyGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.instanceId = defaults.instanceId;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder carrierGatewayId(@Nullable Output<String> carrierGatewayId) {
            this.carrierGatewayId = carrierGatewayId;
            return this;
        }
        public Builder carrierGatewayId(@Nullable String carrierGatewayId) {
            this.carrierGatewayId = Codegen.ofNullable(carrierGatewayId);
            return this;
        }
        public Builder destinationCidrBlock(@Nullable Output<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public Builder destinationCidrBlock(@Nullable String destinationCidrBlock) {
            this.destinationCidrBlock = Codegen.ofNullable(destinationCidrBlock);
            return this;
        }
        public Builder destinationIpv6CidrBlock(@Nullable Output<String> destinationIpv6CidrBlock) {
            this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
            return this;
        }
        public Builder destinationIpv6CidrBlock(@Nullable String destinationIpv6CidrBlock) {
            this.destinationIpv6CidrBlock = Codegen.ofNullable(destinationIpv6CidrBlock);
            return this;
        }
        public Builder destinationPrefixListId(@Nullable Output<String> destinationPrefixListId) {
            this.destinationPrefixListId = destinationPrefixListId;
            return this;
        }
        public Builder destinationPrefixListId(@Nullable String destinationPrefixListId) {
            this.destinationPrefixListId = Codegen.ofNullable(destinationPrefixListId);
            return this;
        }
        public Builder egressOnlyGatewayId(@Nullable Output<String> egressOnlyGatewayId) {
            this.egressOnlyGatewayId = egressOnlyGatewayId;
            return this;
        }
        public Builder egressOnlyGatewayId(@Nullable String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = Codegen.ofNullable(egressOnlyGatewayId);
            return this;
        }
        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = Codegen.ofNullable(gatewayId);
            return this;
        }
        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Codegen.ofNullable(instanceId);
            return this;
        }
        public Builder localGatewayId(@Nullable Output<String> localGatewayId) {
            this.localGatewayId = localGatewayId;
            return this;
        }
        public Builder localGatewayId(@Nullable String localGatewayId) {
            this.localGatewayId = Codegen.ofNullable(localGatewayId);
            return this;
        }
        public Builder natGatewayId(@Nullable Output<String> natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public Builder natGatewayId(@Nullable String natGatewayId) {
            this.natGatewayId = Codegen.ofNullable(natGatewayId);
            return this;
        }
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Codegen.ofNullable(networkInterfaceId);
            return this;
        }
        public Builder routeTableId(Output<String> routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Output.of(Objects.requireNonNull(routeTableId));
            return this;
        }
        public Builder transitGatewayId(@Nullable Output<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Codegen.ofNullable(transitGatewayId);
            return this;
        }
        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Codegen.ofNullable(vpcEndpointId);
            return this;
        }
        public Builder vpcPeeringConnectionId(@Nullable Output<String> vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }
        public Builder vpcPeeringConnectionId(@Nullable String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Codegen.ofNullable(vpcPeeringConnectionId);
            return this;
        }        public RouteArgs build() {
            return new RouteArgs(carrierGatewayId, destinationCidrBlock, destinationIpv6CidrBlock, destinationPrefixListId, egressOnlyGatewayId, gatewayId, instanceId, localGatewayId, natGatewayId, networkInterfaceId, routeTableId, transitGatewayId, vpcEndpointId, vpcPeeringConnectionId);
        }
    }
}
