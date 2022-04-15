// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.deviceupdate.inputs.GetAccountArgs;
import io.pulumi.azurenative.deviceupdate.inputs.GetInstanceArgs;
import io.pulumi.azurenative.deviceupdate.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.deviceupdate.inputs.GetPrivateEndpointConnectionProxyArgs;
import io.pulumi.azurenative.deviceupdate.outputs.GetAccountResult;
import io.pulumi.azurenative.deviceupdate.outputs.GetInstanceResult;
import io.pulumi.azurenative.deviceupdate.outputs.GetPrivateEndpointConnectionProxyResult;
import io.pulumi.azurenative.deviceupdate.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DeviceupdateFunctions {
    /**
     * Device Update account details.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:deviceupdate:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Device Update instance details.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:deviceupdate:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:deviceupdate:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private endpoint connection proxy details.
     * API Version: 2020-03-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionProxyResult> getPrivateEndpointConnectionProxy(GetPrivateEndpointConnectionProxyArgs args) {
        return getPrivateEndpointConnectionProxy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionProxyResult> getPrivateEndpointConnectionProxy(GetPrivateEndpointConnectionProxyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:deviceupdate:getPrivateEndpointConnectionProxy", TypeShape.of(GetPrivateEndpointConnectionProxyResult.class), args, Utilities.withVersion(options));
    }
}