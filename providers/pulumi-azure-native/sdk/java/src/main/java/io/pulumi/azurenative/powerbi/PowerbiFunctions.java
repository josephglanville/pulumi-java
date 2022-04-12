// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.powerbi.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.powerbi.inputs.GetWorkspaceCollectionArgs;
import io.pulumi.azurenative.powerbi.inputs.ListWorkspaceCollectionAccessKeysArgs;
import io.pulumi.azurenative.powerbi.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.powerbi.outputs.GetWorkspaceCollectionResult;
import io.pulumi.azurenative.powerbi.outputs.ListWorkspaceCollectionAccessKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class PowerbiFunctions {
    /**
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:powerbi:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2016-01-29.
     * 
     */
    public static CompletableFuture<GetWorkspaceCollectionResult> getWorkspaceCollection(GetWorkspaceCollectionArgs args) {
        return getWorkspaceCollection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceCollectionResult> getWorkspaceCollection(GetWorkspaceCollectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:powerbi:getWorkspaceCollection", TypeShape.of(GetWorkspaceCollectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2016-01-29.
     * 
     */
    public static CompletableFuture<ListWorkspaceCollectionAccessKeysResult> listWorkspaceCollectionAccessKeys(ListWorkspaceCollectionAccessKeysArgs args) {
        return listWorkspaceCollectionAccessKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListWorkspaceCollectionAccessKeysResult> listWorkspaceCollectionAccessKeys(ListWorkspaceCollectionAccessKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:powerbi:listWorkspaceCollectionAccessKeys", TypeShape.of(ListWorkspaceCollectionAccessKeysResult.class), args, Utilities.withVersion(options));
    }
}
