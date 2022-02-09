// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kubernetes.inputs.GetConnectedClusterArgs;
import io.pulumi.azurenative.kubernetes.outputs.GetConnectedClusterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectedCluster {
    public static CompletableFuture<GetConnectedClusterResult> invokeAsync(GetConnectedClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kubernetes:getConnectedCluster", TypeShape.of(GetConnectedClusterResult.class), args == null ? GetConnectedClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
