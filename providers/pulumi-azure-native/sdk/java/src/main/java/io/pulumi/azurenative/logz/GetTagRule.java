// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logz.inputs.GetTagRuleArgs;
import io.pulumi.azurenative.logz.outputs.GetTagRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTagRule {
    public static CompletableFuture<GetTagRuleResult> invokeAsync(GetTagRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logz:getTagRule", TypeShape.of(GetTagRuleResult.class), args == null ? GetTagRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
