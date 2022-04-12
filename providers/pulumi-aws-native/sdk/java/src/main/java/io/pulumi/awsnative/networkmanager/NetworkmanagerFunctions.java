// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.inputs.GetCustomerGatewayAssociationArgs;
import io.pulumi.awsnative.networkmanager.inputs.GetDeviceArgs;
import io.pulumi.awsnative.networkmanager.inputs.GetGlobalNetworkArgs;
import io.pulumi.awsnative.networkmanager.inputs.GetLinkArgs;
import io.pulumi.awsnative.networkmanager.inputs.GetLinkAssociationArgs;
import io.pulumi.awsnative.networkmanager.inputs.GetSiteArgs;
import io.pulumi.awsnative.networkmanager.inputs.GetTransitGatewayRegistrationArgs;
import io.pulumi.awsnative.networkmanager.outputs.GetCustomerGatewayAssociationResult;
import io.pulumi.awsnative.networkmanager.outputs.GetDeviceResult;
import io.pulumi.awsnative.networkmanager.outputs.GetGlobalNetworkResult;
import io.pulumi.awsnative.networkmanager.outputs.GetLinkAssociationResult;
import io.pulumi.awsnative.networkmanager.outputs.GetLinkResult;
import io.pulumi.awsnative.networkmanager.outputs.GetSiteResult;
import io.pulumi.awsnative.networkmanager.outputs.GetTransitGatewayRegistrationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class NetworkmanagerFunctions {
    /**
     * The AWS::NetworkManager::CustomerGatewayAssociation type associates a customer gateway with a device and optionally, with a link.
     * 
     */
    public static CompletableFuture<GetCustomerGatewayAssociationResult> getCustomerGatewayAssociation(GetCustomerGatewayAssociationArgs args) {
        return getCustomerGatewayAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCustomerGatewayAssociationResult> getCustomerGatewayAssociation(GetCustomerGatewayAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getCustomerGatewayAssociation", TypeShape.of(GetCustomerGatewayAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::NetworkManager::Device type describes a device.
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args) {
        return getDevice(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getDevice", TypeShape.of(GetDeviceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::NetworkManager::GlobalNetwork type specifies a global network of the user's account
     * 
     */
    public static CompletableFuture<GetGlobalNetworkResult> getGlobalNetwork(GetGlobalNetworkArgs args) {
        return getGlobalNetwork(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGlobalNetworkResult> getGlobalNetwork(GetGlobalNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getGlobalNetwork", TypeShape.of(GetGlobalNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::NetworkManager::Link type describes a link.
     * 
     */
    public static CompletableFuture<GetLinkResult> getLink(GetLinkArgs args) {
        return getLink(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLinkResult> getLink(GetLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getLink", TypeShape.of(GetLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::NetworkManager::LinkAssociation type associates a link to a device. The device and link must be in the same global network and the same site.
     * 
     */
    public static CompletableFuture<GetLinkAssociationResult> getLinkAssociation(GetLinkAssociationArgs args) {
        return getLinkAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLinkAssociationResult> getLinkAssociation(GetLinkAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getLinkAssociation", TypeShape.of(GetLinkAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::NetworkManager::Site type describes a site.
     * 
     */
    public static CompletableFuture<GetSiteResult> getSite(GetSiteArgs args) {
        return getSite(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSiteResult> getSite(GetSiteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getSite", TypeShape.of(GetSiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::NetworkManager::TransitGatewayRegistration type registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than one global network.
     * 
     */
    public static CompletableFuture<GetTransitGatewayRegistrationResult> getTransitGatewayRegistration(GetTransitGatewayRegistrationArgs args) {
        return getTransitGatewayRegistration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitGatewayRegistrationResult> getTransitGatewayRegistration(GetTransitGatewayRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getTransitGatewayRegistration", TypeShape.of(GetTransitGatewayRegistrationResult.class), args, Utilities.withVersion(options));
    }
}
