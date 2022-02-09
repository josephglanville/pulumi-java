// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakestore.inputs.GetFirewallRuleArgs;
import io.pulumi.azurenative.datalakestore.outputs.GetFirewallRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFirewallRule {
    public static CompletableFuture<GetFirewallRuleResult> invokeAsync(GetFirewallRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakestore:getFirewallRule", TypeShape.of(GetFirewallRuleResult.class), args == null ? GetFirewallRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
