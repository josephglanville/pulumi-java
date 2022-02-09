// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.agfoodplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.agfoodplatform.inputs.GetExtensionArgs;
import io.pulumi.azurenative.agfoodplatform.outputs.GetExtensionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExtension {
    public static CompletableFuture<GetExtensionResult> invokeAsync(GetExtensionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:agfoodplatform:getExtension", TypeShape.of(GetExtensionResult.class), args == null ? GetExtensionArgs.Empty : args, Utilities.withVersion(options));
    }
}
