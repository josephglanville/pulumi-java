// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.inputs.GetIotHubResourceEventHubConsumerGroupArgs;
import io.pulumi.azurenative.devices.outputs.GetIotHubResourceEventHubConsumerGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIotHubResourceEventHubConsumerGroup {
    public static CompletableFuture<GetIotHubResourceEventHubConsumerGroupResult> invokeAsync(GetIotHubResourceEventHubConsumerGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotHubResourceEventHubConsumerGroup", TypeShape.of(GetIotHubResourceEventHubConsumerGroupResult.class), args == null ? GetIotHubResourceEventHubConsumerGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
