// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.ListWorkspaceKeysArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.ListWorkspaceKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWorkspaceKeys {
    public static CompletableFuture<ListWorkspaceKeysResult> invokeAsync(ListWorkspaceKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:listWorkspaceKeys", TypeShape.of(ListWorkspaceKeysResult.class), args == null ? ListWorkspaceKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
