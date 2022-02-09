// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.relay.inputs.ListWCFRelayKeysArgs;
import io.pulumi.azurenative.relay.outputs.ListWCFRelayKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWCFRelayKeys {
    public static CompletableFuture<ListWCFRelayKeysResult> invokeAsync(ListWCFRelayKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:relay:listWCFRelayKeys", TypeShape.of(ListWCFRelayKeysResult.class), args == null ? ListWCFRelayKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
