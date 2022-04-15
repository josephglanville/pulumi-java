// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.container_v1beta1.inputs.GetClusterArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.GetNodePoolArgs;
import io.pulumi.googlenative.container_v1beta1.outputs.GetClusterResult;
import io.pulumi.googlenative.container_v1beta1.outputs.GetNodePoolResult;
import java.util.concurrent.CompletableFuture;

public final class Container_v1beta1Functions {
    /**
     * Gets the details for a specific cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:container/v1beta1:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the requested node pool.
     * 
     */
    public static CompletableFuture<GetNodePoolResult> getNodePool(GetNodePoolArgs args) {
        return getNodePool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNodePoolResult> getNodePool(GetNodePoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:container/v1beta1:getNodePool", TypeShape.of(GetNodePoolResult.class), args, Utilities.withVersion(options));
    }
}