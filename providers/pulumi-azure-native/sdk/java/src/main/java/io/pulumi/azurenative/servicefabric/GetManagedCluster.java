// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.inputs.GetManagedClusterArgs;
import io.pulumi.azurenative.servicefabric.outputs.GetManagedClusterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagedCluster {
    public static CompletableFuture<GetManagedClusterResult> invokeAsync(GetManagedClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getManagedCluster", TypeShape.of(GetManagedClusterResult.class), args == null ? GetManagedClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}