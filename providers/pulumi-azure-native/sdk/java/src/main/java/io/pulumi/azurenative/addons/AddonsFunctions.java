// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.addons;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.addons.inputs.GetSupportPlanTypeArgs;
import io.pulumi.azurenative.addons.outputs.GetSupportPlanTypeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AddonsFunctions {
    /**
     * The status of the Canonical support plan.
     * API Version: 2018-03-01.
     * 
     */
    public static CompletableFuture<GetSupportPlanTypeResult> getSupportPlanType(GetSupportPlanTypeArgs args) {
        return getSupportPlanType(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSupportPlanTypeResult> getSupportPlanType(GetSupportPlanTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:addons:getSupportPlanType", TypeShape.of(GetSupportPlanTypeResult.class), args, Utilities.withVersion(options));
    }
}
