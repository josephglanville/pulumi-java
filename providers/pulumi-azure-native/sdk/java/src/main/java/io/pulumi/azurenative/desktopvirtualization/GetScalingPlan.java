// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.inputs.GetScalingPlanArgs;
import io.pulumi.azurenative.desktopvirtualization.outputs.GetScalingPlanResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScalingPlan {
    public static CompletableFuture<GetScalingPlanResult> invokeAsync(GetScalingPlanArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:desktopvirtualization:getScalingPlan", TypeShape.of(GetScalingPlanResult.class), args == null ? GetScalingPlanArgs.Empty : args, Utilities.withVersion(options));
    }
}
