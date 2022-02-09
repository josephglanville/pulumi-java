// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.addons;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.addons.inputs.GetSupportPlanTypeArgs;
import io.pulumi.azurenative.addons.outputs.GetSupportPlanTypeResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSupportPlanType {
    public static CompletableFuture<GetSupportPlanTypeResult> invokeAsync(GetSupportPlanTypeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:addons:getSupportPlanType", TypeShape.of(GetSupportPlanTypeResult.class), args == null ? GetSupportPlanTypeArgs.Empty : args, Utilities.withVersion(options));
    }
}
