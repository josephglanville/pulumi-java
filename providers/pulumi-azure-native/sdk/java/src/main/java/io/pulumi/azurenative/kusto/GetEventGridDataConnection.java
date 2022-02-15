// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.inputs.GetEventGridDataConnectionArgs;
import io.pulumi.azurenative.kusto.outputs.GetEventGridDataConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEventGridDataConnection {
    public static CompletableFuture<GetEventGridDataConnectionResult> invokeAsync(GetEventGridDataConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getEventGridDataConnection", TypeShape.of(GetEventGridDataConnectionResult.class), args == null ? GetEventGridDataConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}