// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetSyncMemberArgs;
import io.pulumi.azurenative.sql.outputs.GetSyncMemberResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSyncMember {
    public static CompletableFuture<GetSyncMemberResult> invokeAsync(GetSyncMemberArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getSyncMember", TypeShape.of(GetSyncMemberResult.class), args == null ? GetSyncMemberArgs.Empty : args, Utilities.withVersion(options));
    }
}
