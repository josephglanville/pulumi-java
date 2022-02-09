// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetCustomIPPrefixArgs;
import io.pulumi.azurenative.network.outputs.GetCustomIPPrefixResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomIPPrefix {
    public static CompletableFuture<GetCustomIPPrefixResult> invokeAsync(GetCustomIPPrefixArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getCustomIPPrefix", TypeShape.of(GetCustomIPPrefixResult.class), args == null ? GetCustomIPPrefixArgs.Empty : args, Utilities.withVersion(options));
    }
}
