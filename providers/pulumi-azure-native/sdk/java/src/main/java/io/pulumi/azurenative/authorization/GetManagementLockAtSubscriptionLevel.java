// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.inputs.GetManagementLockAtSubscriptionLevelArgs;
import io.pulumi.azurenative.authorization.outputs.GetManagementLockAtSubscriptionLevelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagementLockAtSubscriptionLevel {
    public static CompletableFuture<GetManagementLockAtSubscriptionLevelResult> invokeAsync(GetManagementLockAtSubscriptionLevelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getManagementLockAtSubscriptionLevel", TypeShape.of(GetManagementLockAtSubscriptionLevelResult.class), args == null ? GetManagementLockAtSubscriptionLevelArgs.Empty : args, Utilities.withVersion(options));
    }
}
