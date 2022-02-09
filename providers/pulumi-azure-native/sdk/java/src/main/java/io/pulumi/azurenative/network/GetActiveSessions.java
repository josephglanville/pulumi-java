// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetActiveSessionsArgs;
import io.pulumi.azurenative.network.outputs.GetActiveSessionsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetActiveSessions {
    public static CompletableFuture<GetActiveSessionsResult> invokeAsync(GetActiveSessionsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getActiveSessions", TypeShape.of(GetActiveSessionsResult.class), args == null ? GetActiveSessionsArgs.Empty : args, Utilities.withVersion(options));
    }
}
