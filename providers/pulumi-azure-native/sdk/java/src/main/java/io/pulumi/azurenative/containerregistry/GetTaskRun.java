// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetTaskRunArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetTaskRunResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTaskRun {
    public static CompletableFuture<GetTaskRunResult> invokeAsync(GetTaskRunArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getTaskRun", TypeShape.of(GetTaskRunResult.class), args == null ? GetTaskRunArgs.Empty : args, Utilities.withVersion(options));
    }
}
