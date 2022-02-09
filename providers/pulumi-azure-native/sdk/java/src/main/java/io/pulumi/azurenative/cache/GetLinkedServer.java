// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cache.inputs.GetLinkedServerArgs;
import io.pulumi.azurenative.cache.outputs.GetLinkedServerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLinkedServer {
    public static CompletableFuture<GetLinkedServerResult> invokeAsync(GetLinkedServerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cache:getLinkedServer", TypeShape.of(GetLinkedServerResult.class), args == null ? GetLinkedServerArgs.Empty : args, Utilities.withVersion(options));
    }
}
