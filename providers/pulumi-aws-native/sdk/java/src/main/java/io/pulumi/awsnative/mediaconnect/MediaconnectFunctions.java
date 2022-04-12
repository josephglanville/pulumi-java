// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mediaconnect.inputs.GetFlowArgs;
import io.pulumi.awsnative.mediaconnect.inputs.GetFlowEntitlementArgs;
import io.pulumi.awsnative.mediaconnect.inputs.GetFlowSourceArgs;
import io.pulumi.awsnative.mediaconnect.inputs.GetFlowVpcInterfaceArgs;
import io.pulumi.awsnative.mediaconnect.outputs.GetFlowEntitlementResult;
import io.pulumi.awsnative.mediaconnect.outputs.GetFlowResult;
import io.pulumi.awsnative.mediaconnect.outputs.GetFlowSourceResult;
import io.pulumi.awsnative.mediaconnect.outputs.GetFlowVpcInterfaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MediaconnectFunctions {
    /**
     * Resource schema for AWS::MediaConnect::Flow
     * 
     */
    public static CompletableFuture<GetFlowResult> getFlow(GetFlowArgs args) {
        return getFlow(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFlowResult> getFlow(GetFlowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediaconnect:getFlow", TypeShape.of(GetFlowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::MediaConnect::FlowEntitlement
     * 
     */
    public static CompletableFuture<GetFlowEntitlementResult> getFlowEntitlement(GetFlowEntitlementArgs args) {
        return getFlowEntitlement(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFlowEntitlementResult> getFlowEntitlement(GetFlowEntitlementArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediaconnect:getFlowEntitlement", TypeShape.of(GetFlowEntitlementResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::MediaConnect::FlowSource
     * 
     */
    public static CompletableFuture<GetFlowSourceResult> getFlowSource(GetFlowSourceArgs args) {
        return getFlowSource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFlowSourceResult> getFlowSource(GetFlowSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediaconnect:getFlowSource", TypeShape.of(GetFlowSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::MediaConnect::FlowVpcInterface
     * 
     */
    public static CompletableFuture<GetFlowVpcInterfaceResult> getFlowVpcInterface(GetFlowVpcInterfaceArgs args) {
        return getFlowVpcInterface(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFlowVpcInterfaceResult> getFlowVpcInterface(GetFlowVpcInterfaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediaconnect:getFlowVpcInterface", TypeShape.of(GetFlowVpcInterfaceResult.class), args, Utilities.withVersion(options));
    }
}
