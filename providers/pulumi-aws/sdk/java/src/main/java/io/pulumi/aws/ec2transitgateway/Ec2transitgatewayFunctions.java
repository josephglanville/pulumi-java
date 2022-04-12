// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.inputs.GetDirectConnectGatewayAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.inputs.GetRouteTableArgs;
import io.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayArgs;
import io.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.outputs.GetDirectConnectGatewayAttachmentResult;
import io.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentResult;
import io.pulumi.aws.ec2transitgateway.outputs.GetRouteTableResult;
import io.pulumi.aws.ec2transitgateway.outputs.GetTransitGatewayResult;
import io.pulumi.aws.ec2transitgateway.outputs.GetVpcAttachmentResult;
import io.pulumi.aws.ec2transitgateway.outputs.GetVpnAttachmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Ec2transitgatewayFunctions {
    /**
     * Get information on an EC2 Transit Gateway's attachment to a Direct Connect Gateway.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDirectConnectGatewayAttachmentResult> getDirectConnectGatewayAttachment() {
        return getDirectConnectGatewayAttachment(GetDirectConnectGatewayAttachmentArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDirectConnectGatewayAttachmentResult> getDirectConnectGatewayAttachment(GetDirectConnectGatewayAttachmentArgs args) {
        return getDirectConnectGatewayAttachment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDirectConnectGatewayAttachmentResult> getDirectConnectGatewayAttachment(GetDirectConnectGatewayAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getDirectConnectGatewayAttachment:getDirectConnectGatewayAttachment", TypeShape.of(GetDirectConnectGatewayAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on an EC2 Transit Gateway Peering Attachment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPeeringAttachmentResult> getPeeringAttachment() {
        return getPeeringAttachment(GetPeeringAttachmentArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPeeringAttachmentResult> getPeeringAttachment(GetPeeringAttachmentArgs args) {
        return getPeeringAttachment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPeeringAttachmentResult> getPeeringAttachment(GetPeeringAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getPeeringAttachment:getPeeringAttachment", TypeShape.of(GetPeeringAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on an EC2 Transit Gateway Route Table.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRouteTableResult> getRouteTable() {
        return getRouteTable(GetRouteTableArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRouteTableResult> getRouteTable(GetRouteTableArgs args) {
        return getRouteTable(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRouteTableResult> getRouteTable(GetRouteTableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getRouteTable:getRouteTable", TypeShape.of(GetRouteTableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on an EC2 Transit Gateway.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTransitGatewayResult> getTransitGateway() {
        return getTransitGateway(GetTransitGatewayArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayResult> getTransitGateway(GetTransitGatewayArgs args) {
        return getTransitGateway(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayResult> getTransitGateway(GetTransitGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getTransitGateway:getTransitGateway", TypeShape.of(GetTransitGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on an EC2 Transit Gateway VPC Attachment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVpcAttachmentResult> getVpcAttachment() {
        return getVpcAttachment(GetVpcAttachmentArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVpcAttachmentResult> getVpcAttachment(GetVpcAttachmentArgs args) {
        return getVpcAttachment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVpcAttachmentResult> getVpcAttachment(GetVpcAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getVpcAttachment:getVpcAttachment", TypeShape.of(GetVpcAttachmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on an EC2 Transit Gateway VPN Attachment.
     * 
     * > EC2 Transit Gateway VPN Attachments are implicitly created by VPN Connections referencing an EC2 Transit Gateway so there is no managed resource. For ease, the `aws.ec2.VpnConnection` resource includes a `transit_gateway_attachment_id` attribute which can replace some usage of this data source. For tagging the attachment, see the `aws.ec2.Tag` resource.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVpnAttachmentResult> getVpnAttachment() {
        return getVpnAttachment(GetVpnAttachmentArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVpnAttachmentResult> getVpnAttachment(GetVpnAttachmentArgs args) {
        return getVpnAttachment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVpnAttachmentResult> getVpnAttachment(GetVpnAttachmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getVpnAttachment:getVpnAttachment", TypeShape.of(GetVpnAttachmentResult.class), args, Utilities.withVersion(options));
    }
}
