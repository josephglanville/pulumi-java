// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.powerbidedicated.inputs.GetAutoScaleVCoreArgs;
import io.pulumi.azurenative.powerbidedicated.outputs.GetAutoScaleVCoreResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAutoScaleVCore {
    public static CompletableFuture<GetAutoScaleVCoreResult> invokeAsync(GetAutoScaleVCoreArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:powerbidedicated:getAutoScaleVCore", TypeShape.of(GetAutoScaleVCoreResult.class), args == null ? GetAutoScaleVCoreArgs.Empty : args, Utilities.withVersion(options));
    }
}
