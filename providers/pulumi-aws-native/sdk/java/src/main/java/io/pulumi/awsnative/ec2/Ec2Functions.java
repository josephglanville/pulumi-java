// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetCapacityReservationFleetArgs;
import io.pulumi.awsnative.ec2.inputs.GetCarrierGatewayArgs;
import io.pulumi.awsnative.ec2.inputs.GetDHCPOptionsArgs;
import io.pulumi.awsnative.ec2.inputs.GetEC2FleetArgs;
import io.pulumi.awsnative.ec2.inputs.GetEgressOnlyInternetGatewayArgs;
import io.pulumi.awsnative.ec2.inputs.GetEnclaveCertificateIamRoleAssociationArgs;
import io.pulumi.awsnative.ec2.inputs.GetFlowLogArgs;
import io.pulumi.awsnative.ec2.inputs.GetGatewayRouteTableAssociationArgs;
import io.pulumi.awsnative.ec2.inputs.GetHostArgs;
import io.pulumi.awsnative.ec2.inputs.GetIPAMAllocationArgs;
import io.pulumi.awsnative.ec2.inputs.GetIPAMArgs;
import io.pulumi.awsnative.ec2.inputs.GetIPAMPoolArgs;
import io.pulumi.awsnative.ec2.inputs.GetIPAMScopeArgs;
import io.pulumi.awsnative.ec2.inputs.GetInternetGatewayArgs;
import io.pulumi.awsnative.ec2.inputs.GetLocalGatewayRouteArgs;
import io.pulumi.awsnative.ec2.inputs.GetLocalGatewayRouteTableVPCAssociationArgs;
import io.pulumi.awsnative.ec2.inputs.GetNetworkAclArgs;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInsightsAccessScopeAnalysisArgs;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInsightsAccessScopeArgs;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInsightsAnalysisArgs;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInsightsPathArgs;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInterfaceArgs;
import io.pulumi.awsnative.ec2.inputs.GetPrefixListArgs;
import io.pulumi.awsnative.ec2.inputs.GetRouteTableArgs;
import io.pulumi.awsnative.ec2.inputs.GetSpotFleetArgs;
import io.pulumi.awsnative.ec2.inputs.GetSubnetArgs;
import io.pulumi.awsnative.ec2.inputs.GetSubnetNetworkAclAssociationArgs;
import io.pulumi.awsnative.ec2.inputs.GetSubnetRouteTableAssociationArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayConnectArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayMulticastDomainArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayMulticastDomainAssociationArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayMulticastGroupMemberArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayMulticastGroupSourceArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayPeeringAttachmentArgs;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayVpcAttachmentArgs;
import io.pulumi.awsnative.ec2.inputs.GetVPCArgs;
import io.pulumi.awsnative.ec2.inputs.GetVPCDHCPOptionsAssociationArgs;
import io.pulumi.awsnative.ec2.outputs.GetCapacityReservationFleetResult;
import io.pulumi.awsnative.ec2.outputs.GetCarrierGatewayResult;
import io.pulumi.awsnative.ec2.outputs.GetDHCPOptionsResult;
import io.pulumi.awsnative.ec2.outputs.GetEC2FleetResult;
import io.pulumi.awsnative.ec2.outputs.GetEgressOnlyInternetGatewayResult;
import io.pulumi.awsnative.ec2.outputs.GetEnclaveCertificateIamRoleAssociationResult;
import io.pulumi.awsnative.ec2.outputs.GetFlowLogResult;
import io.pulumi.awsnative.ec2.outputs.GetGatewayRouteTableAssociationResult;
import io.pulumi.awsnative.ec2.outputs.GetHostResult;
import io.pulumi.awsnative.ec2.outputs.GetIPAMAllocationResult;
import io.pulumi.awsnative.ec2.outputs.GetIPAMPoolResult;
import io.pulumi.awsnative.ec2.outputs.GetIPAMResult;
import io.pulumi.awsnative.ec2.outputs.GetIPAMScopeResult;
import io.pulumi.awsnative.ec2.outputs.GetInternetGatewayResult;
import io.pulumi.awsnative.ec2.outputs.GetLocalGatewayRouteResult;
import io.pulumi.awsnative.ec2.outputs.GetLocalGatewayRouteTableVPCAssociationResult;
import io.pulumi.awsnative.ec2.outputs.GetNetworkAclResult;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInsightsAccessScopeAnalysisResult;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInsightsAccessScopeResult;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInsightsAnalysisResult;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInsightsPathResult;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInterfaceResult;
import io.pulumi.awsnative.ec2.outputs.GetPrefixListResult;
import io.pulumi.awsnative.ec2.outputs.GetRouteTableResult;
import io.pulumi.awsnative.ec2.outputs.GetSpotFleetResult;
import io.pulumi.awsnative.ec2.outputs.GetSubnetNetworkAclAssociationResult;
import io.pulumi.awsnative.ec2.outputs.GetSubnetResult;
import io.pulumi.awsnative.ec2.outputs.GetSubnetRouteTableAssociationResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayConnectResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayMulticastDomainAssociationResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayMulticastDomainResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayMulticastGroupMemberResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayMulticastGroupSourceResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayPeeringAttachmentResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayResult;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayVpcAttachmentResult;
import io.pulumi.awsnative.ec2.outputs.GetVPCDHCPOptionsAssociationResult;
import io.pulumi.awsnative.ec2.outputs.GetVPCResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Ec2Functions {
    /**
     * Resource Type definition for AWS::EC2::CapacityReservationFleet
     * 
     */
    public static CompletableFuture<GetCapacityReservationFleetResult> getCapacityReservationFleet(GetCapacityReservationFleetArgs args) {
        return getCapacityReservationFleet(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCapacityReservationFleetResult> getCapacityReservationFleet(GetCapacityReservationFleetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getCapacityReservationFleet", TypeShape.of(GetCapacityReservationFleetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetCarrierGatewayResult> getCarrierGateway(GetCarrierGatewayArgs args) {
        return getCarrierGateway(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCarrierGatewayResult> getCarrierGateway(GetCarrierGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getCarrierGateway", TypeShape.of(GetCarrierGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::DHCPOptions
     * 
     */
    public static CompletableFuture<GetDHCPOptionsResult> getDHCPOptions(GetDHCPOptionsArgs args) {
        return getDHCPOptions(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDHCPOptionsResult> getDHCPOptions(GetDHCPOptionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getDHCPOptions", TypeShape.of(GetDHCPOptionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::EC2Fleet
     * 
     */
    public static CompletableFuture<GetEC2FleetResult> getEC2Fleet(GetEC2FleetArgs args) {
        return getEC2Fleet(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEC2FleetResult> getEC2Fleet(GetEC2FleetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getEC2Fleet", TypeShape.of(GetEC2FleetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::EgressOnlyInternetGateway
     * 
     */
    public static CompletableFuture<GetEgressOnlyInternetGatewayResult> getEgressOnlyInternetGateway(GetEgressOnlyInternetGatewayArgs args) {
        return getEgressOnlyInternetGateway(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEgressOnlyInternetGatewayResult> getEgressOnlyInternetGateway(GetEgressOnlyInternetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getEgressOnlyInternetGateway", TypeShape.of(GetEgressOnlyInternetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Associates an AWS Identity and Access Management (IAM) role with an AWS Certificate Manager (ACM) certificate. This association is based on Amazon Resource Names and it enables the certificate to be used by the ACM for Nitro Enclaves application inside an enclave.
     * 
     */
    public static CompletableFuture<GetEnclaveCertificateIamRoleAssociationResult> getEnclaveCertificateIamRoleAssociation(GetEnclaveCertificateIamRoleAssociationArgs args) {
        return getEnclaveCertificateIamRoleAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnclaveCertificateIamRoleAssociationResult> getEnclaveCertificateIamRoleAssociation(GetEnclaveCertificateIamRoleAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getEnclaveCertificateIamRoleAssociation", TypeShape.of(GetEnclaveCertificateIamRoleAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies a VPC flow log, which enables you to capture IP traffic for a specific network interface, subnet, or VPC.
     * 
     */
    public static CompletableFuture<GetFlowLogResult> getFlowLog(GetFlowLogArgs args) {
        return getFlowLog(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFlowLogResult> getFlowLog(GetFlowLogArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getFlowLog", TypeShape.of(GetFlowLogResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Associates a gateway with a route table. The gateway and route table must be in the same VPC. This association causes the incoming traffic to the gateway to be routed according to the routes in the route table.
     * 
     */
    public static CompletableFuture<GetGatewayRouteTableAssociationResult> getGatewayRouteTableAssociation(GetGatewayRouteTableAssociationArgs args) {
        return getGatewayRouteTableAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGatewayRouteTableAssociationResult> getGatewayRouteTableAssociation(GetGatewayRouteTableAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getGatewayRouteTableAssociation", TypeShape.of(GetGatewayRouteTableAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::Host
     * 
     */
    public static CompletableFuture<GetHostResult> getHost(GetHostArgs args) {
        return getHost(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetHostResult> getHost(GetHostArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getHost", TypeShape.of(GetHostResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema of AWS::EC2::IPAM Type
     * 
     */
    public static CompletableFuture<GetIPAMResult> getIPAM(GetIPAMArgs args) {
        return getIPAM(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIPAMResult> getIPAM(GetIPAMArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getIPAM", TypeShape.of(GetIPAMResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema of AWS::EC2::IPAMAllocation Type
     * 
     */
    public static CompletableFuture<GetIPAMAllocationResult> getIPAMAllocation(GetIPAMAllocationArgs args) {
        return getIPAMAllocation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIPAMAllocationResult> getIPAMAllocation(GetIPAMAllocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getIPAMAllocation", TypeShape.of(GetIPAMAllocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema of AWS::EC2::IPAMPool Type
     * 
     */
    public static CompletableFuture<GetIPAMPoolResult> getIPAMPool(GetIPAMPoolArgs args) {
        return getIPAMPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIPAMPoolResult> getIPAMPool(GetIPAMPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getIPAMPool", TypeShape.of(GetIPAMPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema of AWS::EC2::IPAMScope Type
     * 
     */
    public static CompletableFuture<GetIPAMScopeResult> getIPAMScope(GetIPAMScopeArgs args) {
        return getIPAMScope(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIPAMScopeResult> getIPAMScope(GetIPAMScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getIPAMScope", TypeShape.of(GetIPAMScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::InternetGateway
     * 
     */
    public static CompletableFuture<GetInternetGatewayResult> getInternetGateway(GetInternetGatewayArgs args) {
        return getInternetGateway(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInternetGatewayResult> getInternetGateway(GetInternetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getInternetGateway", TypeShape.of(GetInternetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a route for a local gateway route table.
     * 
     */
    public static CompletableFuture<GetLocalGatewayRouteResult> getLocalGatewayRoute(GetLocalGatewayRouteArgs args) {
        return getLocalGatewayRoute(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLocalGatewayRouteResult> getLocalGatewayRoute(GetLocalGatewayRouteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getLocalGatewayRoute", TypeShape.of(GetLocalGatewayRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes an association between a local gateway route table and a VPC.
     * 
     */
    public static CompletableFuture<GetLocalGatewayRouteTableVPCAssociationResult> getLocalGatewayRouteTableVPCAssociation(GetLocalGatewayRouteTableVPCAssociationArgs args) {
        return getLocalGatewayRouteTableVPCAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLocalGatewayRouteTableVPCAssociationResult> getLocalGatewayRouteTableVPCAssociation(GetLocalGatewayRouteTableVPCAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getLocalGatewayRouteTableVPCAssociation", TypeShape.of(GetLocalGatewayRouteTableVPCAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::NetworkAcl
     * 
     */
    public static CompletableFuture<GetNetworkAclResult> getNetworkAcl(GetNetworkAclArgs args) {
        return getNetworkAcl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkAclResult> getNetworkAcl(GetNetworkAclArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkAcl", TypeShape.of(GetNetworkAclResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::EC2::NetworkInsightsAccessScope
     * 
     */
    public static CompletableFuture<GetNetworkInsightsAccessScopeResult> getNetworkInsightsAccessScope(GetNetworkInsightsAccessScopeArgs args) {
        return getNetworkInsightsAccessScope(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkInsightsAccessScopeResult> getNetworkInsightsAccessScope(GetNetworkInsightsAccessScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInsightsAccessScope", TypeShape.of(GetNetworkInsightsAccessScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::EC2::NetworkInsightsAccessScopeAnalysis
     * 
     */
    public static CompletableFuture<GetNetworkInsightsAccessScopeAnalysisResult> getNetworkInsightsAccessScopeAnalysis(GetNetworkInsightsAccessScopeAnalysisArgs args) {
        return getNetworkInsightsAccessScopeAnalysis(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkInsightsAccessScopeAnalysisResult> getNetworkInsightsAccessScopeAnalysis(GetNetworkInsightsAccessScopeAnalysisArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInsightsAccessScopeAnalysis", TypeShape.of(GetNetworkInsightsAccessScopeAnalysisResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::EC2::NetworkInsightsAnalysis
     * 
     */
    public static CompletableFuture<GetNetworkInsightsAnalysisResult> getNetworkInsightsAnalysis(GetNetworkInsightsAnalysisArgs args) {
        return getNetworkInsightsAnalysis(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkInsightsAnalysisResult> getNetworkInsightsAnalysis(GetNetworkInsightsAnalysisArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInsightsAnalysis", TypeShape.of(GetNetworkInsightsAnalysisResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::EC2::NetworkInsightsPath
     * 
     */
    public static CompletableFuture<GetNetworkInsightsPathResult> getNetworkInsightsPath(GetNetworkInsightsPathArgs args) {
        return getNetworkInsightsPath(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkInsightsPathResult> getNetworkInsightsPath(GetNetworkInsightsPathArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInsightsPath", TypeShape.of(GetNetworkInsightsPathResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::EC2::NetworkInterface resource creates network interface
     * 
     */
    public static CompletableFuture<GetNetworkInterfaceResult> getNetworkInterface(GetNetworkInterfaceArgs args) {
        return getNetworkInterface(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkInterfaceResult> getNetworkInterface(GetNetworkInterfaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInterface", TypeShape.of(GetNetworkInterfaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema of AWS::EC2::PrefixList Type
     * 
     */
    public static CompletableFuture<GetPrefixListResult> getPrefixList(GetPrefixListArgs args) {
        return getPrefixList(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrefixListResult> getPrefixList(GetPrefixListArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getPrefixList", TypeShape.of(GetPrefixListResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::RouteTable
     * 
     */
    public static CompletableFuture<GetRouteTableResult> getRouteTable(GetRouteTableArgs args) {
        return getRouteTable(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRouteTableResult> getRouteTable(GetRouteTableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getRouteTable", TypeShape.of(GetRouteTableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::SpotFleet
     * 
     */
    public static CompletableFuture<GetSpotFleetResult> getSpotFleet(GetSpotFleetArgs args) {
        return getSpotFleet(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSpotFleetResult> getSpotFleet(GetSpotFleetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getSpotFleet", TypeShape.of(GetSpotFleetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::Subnet
     * 
     */
    public static CompletableFuture<GetSubnetResult> getSubnet(GetSubnetArgs args) {
        return getSubnet(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSubnetResult> getSubnet(GetSubnetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getSubnet", TypeShape.of(GetSubnetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::SubnetNetworkAclAssociation
     * 
     */
    public static CompletableFuture<GetSubnetNetworkAclAssociationResult> getSubnetNetworkAclAssociation(GetSubnetNetworkAclAssociationArgs args) {
        return getSubnetNetworkAclAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSubnetNetworkAclAssociationResult> getSubnetNetworkAclAssociation(GetSubnetNetworkAclAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getSubnetNetworkAclAssociation", TypeShape.of(GetSubnetNetworkAclAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::SubnetRouteTableAssociation
     * 
     */
    public static CompletableFuture<GetSubnetRouteTableAssociationResult> getSubnetRouteTableAssociation(GetSubnetRouteTableAssociationArgs args) {
        return getSubnetRouteTableAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSubnetRouteTableAssociationResult> getSubnetRouteTableAssociation(GetSubnetRouteTableAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getSubnetRouteTableAssociation", TypeShape.of(GetSubnetRouteTableAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::TransitGateway
     * 
     */
    public static CompletableFuture<GetTransitGatewayResult> getTransitGateway(GetTransitGatewayArgs args) {
        return getTransitGateway(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayResult> getTransitGateway(GetTransitGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGateway", TypeShape.of(GetTransitGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::EC2::TransitGatewayConnect type
     * 
     */
    public static CompletableFuture<GetTransitGatewayConnectResult> getTransitGatewayConnect(GetTransitGatewayConnectArgs args) {
        return getTransitGatewayConnect(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayConnectResult> getTransitGatewayConnect(GetTransitGatewayConnectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayConnect", TypeShape.of(GetTransitGatewayConnectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::EC2::TransitGatewayMulticastDomain type
     * 
     */
    public static CompletableFuture<GetTransitGatewayMulticastDomainResult> getTransitGatewayMulticastDomain(GetTransitGatewayMulticastDomainArgs args) {
        return getTransitGatewayMulticastDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayMulticastDomainResult> getTransitGatewayMulticastDomain(GetTransitGatewayMulticastDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayMulticastDomain", TypeShape.of(GetTransitGatewayMulticastDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::EC2::TransitGatewayMulticastDomainAssociation type
     * 
     */
    public static CompletableFuture<GetTransitGatewayMulticastDomainAssociationResult> getTransitGatewayMulticastDomainAssociation(GetTransitGatewayMulticastDomainAssociationArgs args) {
        return getTransitGatewayMulticastDomainAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayMulticastDomainAssociationResult> getTransitGatewayMulticastDomainAssociation(GetTransitGatewayMulticastDomainAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayMulticastDomainAssociation", TypeShape.of(GetTransitGatewayMulticastDomainAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::EC2::TransitGatewayMulticastGroupMember registers and deregisters members and sources (network interfaces) with the transit gateway multicast group
     * 
     */
    public static CompletableFuture<GetTransitGatewayMulticastGroupMemberResult> getTransitGatewayMulticastGroupMember(GetTransitGatewayMulticastGroupMemberArgs args) {
        return getTransitGatewayMulticastGroupMember(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayMulticastGroupMemberResult> getTransitGatewayMulticastGroupMember(GetTransitGatewayMulticastGroupMemberArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayMulticastGroupMember", TypeShape.of(GetTransitGatewayMulticastGroupMemberResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::EC2::TransitGatewayMulticastGroupSource registers and deregisters members and sources (network interfaces) with the transit gateway multicast group
     * 
     */
    public static CompletableFuture<GetTransitGatewayMulticastGroupSourceResult> getTransitGatewayMulticastGroupSource(GetTransitGatewayMulticastGroupSourceArgs args) {
        return getTransitGatewayMulticastGroupSource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayMulticastGroupSourceResult> getTransitGatewayMulticastGroupSource(GetTransitGatewayMulticastGroupSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayMulticastGroupSource", TypeShape.of(GetTransitGatewayMulticastGroupSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::EC2::TransitGatewayPeeringAttachment type
     * 
     */
    public static CompletableFuture<GetTransitGatewayPeeringAttachmentResult> getTransitGatewayPeeringAttachment(GetTransitGatewayPeeringAttachmentArgs args) {
        return getTransitGatewayPeeringAttachment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayPeeringAttachmentResult> getTransitGatewayPeeringAttachment(GetTransitGatewayPeeringAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayPeeringAttachment", TypeShape.of(GetTransitGatewayPeeringAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::TransitGatewayVpcAttachment
     * 
     */
    public static CompletableFuture<GetTransitGatewayVpcAttachmentResult> getTransitGatewayVpcAttachment(GetTransitGatewayVpcAttachmentArgs args) {
        return getTransitGatewayVpcAttachment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayVpcAttachmentResult> getTransitGatewayVpcAttachment(GetTransitGatewayVpcAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayVpcAttachment", TypeShape.of(GetTransitGatewayVpcAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::EC2::VPC
     * 
     */
    public static CompletableFuture<GetVPCResult> getVPC(GetVPCArgs args) {
        return getVPC(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVPCResult> getVPC(GetVPCArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getVPC", TypeShape.of(GetVPCResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Associates a set of DHCP options with a VPC, or associates no DHCP options with the VPC.
     * 
     */
    public static CompletableFuture<GetVPCDHCPOptionsAssociationResult> getVPCDHCPOptionsAssociation(GetVPCDHCPOptionsAssociationArgs args) {
        return getVPCDHCPOptionsAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVPCDHCPOptionsAssociationResult> getVPCDHCPOptionsAssociation(GetVPCDHCPOptionsAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getVPCDHCPOptionsAssociation", TypeShape.of(GetVPCDHCPOptionsAssociationResult.class), args, Utilities.withVersion(options));
    }
}