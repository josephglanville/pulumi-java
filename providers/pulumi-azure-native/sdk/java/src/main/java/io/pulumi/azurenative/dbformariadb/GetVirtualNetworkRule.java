// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformariadb.inputs.GetVirtualNetworkRuleArgs;
import io.pulumi.azurenative.dbformariadb.outputs.GetVirtualNetworkRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualNetworkRule {
    public static CompletableFuture<GetVirtualNetworkRuleResult> invokeAsync(GetVirtualNetworkRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbformariadb:getVirtualNetworkRule", TypeShape.of(GetVirtualNetworkRuleResult.class), args == null ? GetVirtualNetworkRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
