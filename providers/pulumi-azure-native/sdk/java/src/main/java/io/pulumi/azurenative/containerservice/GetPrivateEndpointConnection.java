// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.containerservice.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnection {
    public static CompletableFuture<GetPrivateEndpointConnectionResult> invokeAsync(GetPrivateEndpointConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerservice:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args == null ? GetPrivateEndpointConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
