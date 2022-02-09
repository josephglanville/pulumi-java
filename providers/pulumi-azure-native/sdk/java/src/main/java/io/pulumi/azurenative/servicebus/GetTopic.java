// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.inputs.GetTopicArgs;
import io.pulumi.azurenative.servicebus.outputs.GetTopicResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTopic {
    public static CompletableFuture<GetTopicResult> invokeAsync(GetTopicArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getTopic", TypeShape.of(GetTopicResult.class), args == null ? GetTopicArgs.Empty : args, Utilities.withVersion(options));
    }
}
