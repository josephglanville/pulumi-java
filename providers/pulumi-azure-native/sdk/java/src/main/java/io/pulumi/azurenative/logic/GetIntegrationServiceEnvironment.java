// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.GetIntegrationServiceEnvironmentArgs;
import io.pulumi.azurenative.logic.outputs.GetIntegrationServiceEnvironmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationServiceEnvironment {
    public static CompletableFuture<GetIntegrationServiceEnvironmentResult> invokeAsync(GetIntegrationServiceEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:getIntegrationServiceEnvironment", TypeShape.of(GetIntegrationServiceEnvironmentResult.class), args == null ? GetIntegrationServiceEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
