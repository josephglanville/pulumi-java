// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.inputs.GetHubArgs;
import io.pulumi.azurenative.customerinsights.outputs.GetHubResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHub {
    public static CompletableFuture<GetHubResult> invokeAsync(GetHubArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getHub", TypeShape.of(GetHubResult.class), args == null ? GetHubArgs.Empty : args, Utilities.withVersion(options));
    }
}
