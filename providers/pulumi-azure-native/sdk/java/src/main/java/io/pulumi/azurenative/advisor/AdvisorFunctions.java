// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.advisor;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.advisor.inputs.GetSuppressionArgs;
import io.pulumi.azurenative.advisor.outputs.GetSuppressionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AdvisorFunctions {
    /**
     * The details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with the rule.
     * API Version: 2020-01-01.
     * 
     */
    public static CompletableFuture<GetSuppressionResult> getSuppression(GetSuppressionArgs args) {
        return getSuppression(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSuppressionResult> getSuppression(GetSuppressionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:advisor:getSuppression", TypeShape.of(GetSuppressionResult.class), args, Utilities.withVersion(options));
    }
}
