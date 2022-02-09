// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notificationhubs.inputs.GetNamespaceAuthorizationRuleArgs;
import io.pulumi.azurenative.notificationhubs.outputs.GetNamespaceAuthorizationRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNamespaceAuthorizationRule {
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> invokeAsync(GetNamespaceAuthorizationRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notificationhubs:getNamespaceAuthorizationRule", TypeShape.of(GetNamespaceAuthorizationRuleResult.class), args == null ? GetNamespaceAuthorizationRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
