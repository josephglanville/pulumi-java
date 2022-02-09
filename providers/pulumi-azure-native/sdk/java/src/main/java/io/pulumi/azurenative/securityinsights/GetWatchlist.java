// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetWatchlistArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetWatchlistResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWatchlist {
    public static CompletableFuture<GetWatchlistResult> invokeAsync(GetWatchlistArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getWatchlist", TypeShape.of(GetWatchlistResult.class), args == null ? GetWatchlistArgs.Empty : args, Utilities.withVersion(options));
    }
}
