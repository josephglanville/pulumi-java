// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetApiOperationArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetApiOperationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApiOperation {
    public static CompletableFuture<GetApiOperationResult> invokeAsync(GetApiOperationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getApiOperation", TypeShape.of(GetApiOperationResult.class), args == null ? GetApiOperationArgs.Empty : args, Utilities.withVersion(options));
    }
}
