// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.inputs.ListDisasterRecoveryConfigKeysArgs;
import io.pulumi.azurenative.eventhub.outputs.ListDisasterRecoveryConfigKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDisasterRecoveryConfigKeys {
    public static CompletableFuture<ListDisasterRecoveryConfigKeysResult> invokeAsync(ListDisasterRecoveryConfigKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:listDisasterRecoveryConfigKeys", TypeShape.of(ListDisasterRecoveryConfigKeysResult.class), args == null ? ListDisasterRecoveryConfigKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
