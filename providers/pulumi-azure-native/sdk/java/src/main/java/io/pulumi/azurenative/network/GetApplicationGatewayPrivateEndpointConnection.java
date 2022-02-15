// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetApplicationGatewayPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.network.outputs.GetApplicationGatewayPrivateEndpointConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplicationGatewayPrivateEndpointConnection {
    public static CompletableFuture<GetApplicationGatewayPrivateEndpointConnectionResult> invokeAsync(GetApplicationGatewayPrivateEndpointConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getApplicationGatewayPrivateEndpointConnection", TypeShape.of(GetApplicationGatewayPrivateEndpointConnectionResult.class), args == null ? GetApplicationGatewayPrivateEndpointConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}