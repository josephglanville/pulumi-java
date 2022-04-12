// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GetChannelPartnerLinkArgs;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GetCustomerArgs;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GetEntitlementArgs;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GetChannelPartnerLinkResult;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GetCustomerResult;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GetEntitlementResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudchannel_v1Functions {
    /**
     * Returns the requested ChannelPartnerLink resource. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: ChannelPartnerLink resource not found because of an invalid channel partner link name. Return value: The ChannelPartnerLink resource.
     * 
     */
    public static CompletableFuture<GetChannelPartnerLinkResult> getChannelPartnerLink(GetChannelPartnerLinkArgs args) {
        return getChannelPartnerLink(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetChannelPartnerLinkResult> getChannelPartnerLink(GetChannelPartnerLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudchannel/v1:getChannelPartnerLink", TypeShape.of(GetChannelPartnerLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the requested Customer resource. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer resource doesn't exist. Usually the result of an invalid name parameter. Return value: The Customer resource.
     * 
     */
    public static CompletableFuture<GetCustomerResult> getCustomer(GetCustomerArgs args) {
        return getCustomer(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCustomerResult> getCustomer(GetCustomerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudchannel/v1:getCustomer", TypeShape.of(GetCustomerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the requested Entitlement resource. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer entitlement was not found. Return value: The requested Entitlement resource.
     * 
     */
    public static CompletableFuture<GetEntitlementResult> getEntitlement(GetEntitlementArgs args) {
        return getEntitlement(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEntitlementResult> getEntitlement(GetEntitlementArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudchannel/v1:getEntitlement", TypeShape.of(GetEntitlementResult.class), args, Utilities.withVersion(options));
    }
}
