// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.inputs.GetAFDOriginArgs;
import io.pulumi.azurenative.cdn.outputs.GetAFDOriginResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAFDOrigin {
    public static CompletableFuture<GetAFDOriginResult> invokeAsync(GetAFDOriginArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getAFDOrigin", TypeShape.of(GetAFDOriginResult.class), args == null ? GetAFDOriginArgs.Empty : args, Utilities.withVersion(options));
    }
}