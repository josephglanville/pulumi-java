// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databricks.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.databricks.inputs.GetWorkspaceArgs;
import io.pulumi.azurenative.databricks.inputs.GetvNetPeeringArgs;
import io.pulumi.azurenative.databricks.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.databricks.outputs.GetWorkspaceResult;
import io.pulumi.azurenative.databricks.outputs.GetvNetPeeringResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatabricksFunctions {
    /**
     * The private endpoint connection of a workspace
     * API Version: 2021-04-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databricks:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about workspace.
     * API Version: 2018-04-01.
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databricks:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Peerings in a VirtualNetwork resource
     * API Version: 2018-04-01.
     * 
     */
    public static CompletableFuture<GetvNetPeeringResult> getvNetPeering(GetvNetPeeringArgs args) {
        return getvNetPeering(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetvNetPeeringResult> getvNetPeering(GetvNetPeeringArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databricks:getvNetPeering", TypeShape.of(GetvNetPeeringResult.class), args, Utilities.withVersion(options));
    }
}
