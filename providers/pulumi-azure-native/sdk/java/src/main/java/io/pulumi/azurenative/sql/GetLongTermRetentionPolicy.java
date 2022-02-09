// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetLongTermRetentionPolicyArgs;
import io.pulumi.azurenative.sql.outputs.GetLongTermRetentionPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLongTermRetentionPolicy {
    public static CompletableFuture<GetLongTermRetentionPolicyResult> invokeAsync(GetLongTermRetentionPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getLongTermRetentionPolicy", TypeShape.of(GetLongTermRetentionPolicyResult.class), args == null ? GetLongTermRetentionPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
