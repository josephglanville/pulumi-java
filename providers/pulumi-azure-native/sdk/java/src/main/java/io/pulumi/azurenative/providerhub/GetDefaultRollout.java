// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.providerhub.inputs.GetDefaultRolloutArgs;
import io.pulumi.azurenative.providerhub.outputs.GetDefaultRolloutResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDefaultRollout {
    public static CompletableFuture<GetDefaultRolloutResult> invokeAsync(GetDefaultRolloutArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getDefaultRollout", TypeShape.of(GetDefaultRolloutResult.class), args == null ? GetDefaultRolloutArgs.Empty : args, Utilities.withVersion(options));
    }
}
