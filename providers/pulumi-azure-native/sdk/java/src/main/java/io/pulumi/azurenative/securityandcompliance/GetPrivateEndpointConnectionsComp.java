// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsCompArgs;
import io.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsCompResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnectionsComp {
    public static CompletableFuture<GetPrivateEndpointConnectionsCompResult> invokeAsync(GetPrivateEndpointConnectionsCompArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsComp", TypeShape.of(GetPrivateEndpointConnectionsCompResult.class), args == null ? GetPrivateEndpointConnectionsCompArgs.Empty : args, Utilities.withVersion(options));
    }
}
