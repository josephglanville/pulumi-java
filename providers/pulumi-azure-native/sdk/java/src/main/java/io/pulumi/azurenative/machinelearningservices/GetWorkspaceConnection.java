// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetWorkspaceConnectionArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetWorkspaceConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkspaceConnection {
    public static CompletableFuture<GetWorkspaceConnectionResult> invokeAsync(GetWorkspaceConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getWorkspaceConnection", TypeShape.of(GetWorkspaceConnectionResult.class), args == null ? GetWorkspaceConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}