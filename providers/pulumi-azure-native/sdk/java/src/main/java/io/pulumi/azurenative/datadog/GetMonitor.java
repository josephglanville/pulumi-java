// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datadog.inputs.GetMonitorArgs;
import io.pulumi.azurenative.datadog.outputs.GetMonitorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMonitor {
    public static CompletableFuture<GetMonitorResult> invokeAsync(GetMonitorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datadog:getMonitor", TypeShape.of(GetMonitorResult.class), args == null ? GetMonitorArgs.Empty : args, Utilities.withVersion(options));
    }
}
