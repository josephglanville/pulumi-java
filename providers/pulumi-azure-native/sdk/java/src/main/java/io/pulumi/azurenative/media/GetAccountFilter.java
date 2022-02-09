// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.GetAccountFilterArgs;
import io.pulumi.azurenative.media.outputs.GetAccountFilterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccountFilter {
    public static CompletableFuture<GetAccountFilterResult> invokeAsync(GetAccountFilterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getAccountFilter", TypeShape.of(GetAccountFilterResult.class), args == null ? GetAccountFilterArgs.Empty : args, Utilities.withVersion(options));
    }
}
