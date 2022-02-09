// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logz.inputs.GetMetricsSourceTagRuleArgs;
import io.pulumi.azurenative.logz.outputs.GetMetricsSourceTagRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMetricsSourceTagRule {
    public static CompletableFuture<GetMetricsSourceTagRuleResult> invokeAsync(GetMetricsSourceTagRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logz:getMetricsSourceTagRule", TypeShape.of(GetMetricsSourceTagRuleResult.class), args == null ? GetMetricsSourceTagRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
