// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetIPv6FirewallRuleArgs;
import io.pulumi.azurenative.sql.outputs.GetIPv6FirewallRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIPv6FirewallRule {
    public static CompletableFuture<GetIPv6FirewallRuleResult> invokeAsync(GetIPv6FirewallRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getIPv6FirewallRule", TypeShape.of(GetIPv6FirewallRuleResult.class), args == null ? GetIPv6FirewallRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
