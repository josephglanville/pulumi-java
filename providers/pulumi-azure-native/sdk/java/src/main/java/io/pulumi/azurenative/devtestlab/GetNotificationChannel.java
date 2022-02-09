// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetNotificationChannelArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetNotificationChannelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNotificationChannel {
    public static CompletableFuture<GetNotificationChannelResult> invokeAsync(GetNotificationChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getNotificationChannel", TypeShape.of(GetNotificationChannelResult.class), args == null ? GetNotificationChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}
