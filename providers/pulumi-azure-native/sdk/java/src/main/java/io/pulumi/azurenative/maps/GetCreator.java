// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maps.inputs.GetCreatorArgs;
import io.pulumi.azurenative.maps.outputs.GetCreatorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCreator {
    public static CompletableFuture<GetCreatorResult> invokeAsync(GetCreatorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:getCreator", TypeShape.of(GetCreatorResult.class), args == null ? GetCreatorArgs.Empty : args, Utilities.withVersion(options));
    }
}
