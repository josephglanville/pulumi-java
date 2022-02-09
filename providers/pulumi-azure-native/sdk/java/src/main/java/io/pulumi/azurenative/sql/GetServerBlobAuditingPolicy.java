// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetServerBlobAuditingPolicyArgs;
import io.pulumi.azurenative.sql.outputs.GetServerBlobAuditingPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerBlobAuditingPolicy {
    public static CompletableFuture<GetServerBlobAuditingPolicyResult> invokeAsync(GetServerBlobAuditingPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getServerBlobAuditingPolicy", TypeShape.of(GetServerBlobAuditingPolicyResult.class), args == null ? GetServerBlobAuditingPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
