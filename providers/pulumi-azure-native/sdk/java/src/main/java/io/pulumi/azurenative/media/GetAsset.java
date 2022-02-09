// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.GetAssetArgs;
import io.pulumi.azurenative.media.outputs.GetAssetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAsset {
    public static CompletableFuture<GetAssetResult> invokeAsync(GetAssetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getAsset", TypeShape.of(GetAssetResult.class), args == null ? GetAssetArgs.Empty : args, Utilities.withVersion(options));
    }
}
