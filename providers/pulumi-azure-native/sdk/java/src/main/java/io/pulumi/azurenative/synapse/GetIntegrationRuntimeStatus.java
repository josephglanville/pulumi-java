// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.GetIntegrationRuntimeStatusArgs;
import io.pulumi.azurenative.synapse.outputs.GetIntegrationRuntimeStatusResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationRuntimeStatus {
    public static CompletableFuture<GetIntegrationRuntimeStatusResult> invokeAsync(GetIntegrationRuntimeStatusArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:getIntegrationRuntimeStatus", TypeShape.of(GetIntegrationRuntimeStatusResult.class), args == null ? GetIntegrationRuntimeStatusArgs.Empty : args, Utilities.withVersion(options));
    }
}
