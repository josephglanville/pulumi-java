// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.botservice.inputs.GetBotConnectionArgs;
import io.pulumi.azurenative.botservice.outputs.GetBotConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBotConnection {
    public static CompletableFuture<GetBotConnectionResult> invokeAsync(GetBotConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:botservice:getBotConnection", TypeShape.of(GetBotConnectionResult.class), args == null ? GetBotConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
