// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.inputs.GetPrefixArgs;
import io.pulumi.azurenative.peering.outputs.GetPrefixResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrefix {
    public static CompletableFuture<GetPrefixResult> invokeAsync(GetPrefixArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:peering:getPrefix", TypeShape.of(GetPrefixResult.class), args == null ? GetPrefixArgs.Empty : args, Utilities.withVersion(options));
    }
}