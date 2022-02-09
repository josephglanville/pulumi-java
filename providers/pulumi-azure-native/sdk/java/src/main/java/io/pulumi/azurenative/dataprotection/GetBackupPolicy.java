// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dataprotection.inputs.GetBackupPolicyArgs;
import io.pulumi.azurenative.dataprotection.outputs.GetBackupPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackupPolicy {
    public static CompletableFuture<GetBackupPolicyResult> invokeAsync(GetBackupPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dataprotection:getBackupPolicy", TypeShape.of(GetBackupPolicyResult.class), args == null ? GetBackupPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
