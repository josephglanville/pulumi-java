// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.inputs.GetAFDOriginGroupArgs;
import io.pulumi.azurenative.cdn.outputs.GetAFDOriginGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAFDOriginGroup {
    public static CompletableFuture<GetAFDOriginGroupResult> invokeAsync(GetAFDOriginGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getAFDOriginGroup", TypeShape.of(GetAFDOriginGroupResult.class), args == null ? GetAFDOriginGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
