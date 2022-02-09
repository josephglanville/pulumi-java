// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetScriptExecutionArgs;
import io.pulumi.azurenative.avs.outputs.GetScriptExecutionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScriptExecution {
    public static CompletableFuture<GetScriptExecutionResult> invokeAsync(GetScriptExecutionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getScriptExecution", TypeShape.of(GetScriptExecutionResult.class), args == null ? GetScriptExecutionArgs.Empty : args, Utilities.withVersion(options));
    }
}
