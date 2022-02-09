// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.delegatednetwork.inputs.GetOrchestratorInstanceServiceDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.outputs.GetOrchestratorInstanceServiceDetailsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrchestratorInstanceServiceDetails {
    public static CompletableFuture<GetOrchestratorInstanceServiceDetailsResult> invokeAsync(GetOrchestratorInstanceServiceDetailsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getOrchestratorInstanceServiceDetails", TypeShape.of(GetOrchestratorInstanceServiceDetailsResult.class), args == null ? GetOrchestratorInstanceServiceDetailsArgs.Empty : args, Utilities.withVersion(options));
    }
}
