// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.inputs.GetReadOnlyFollowingDatabaseArgs;
import io.pulumi.azurenative.kusto.outputs.GetReadOnlyFollowingDatabaseResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReadOnlyFollowingDatabase {
    public static CompletableFuture<GetReadOnlyFollowingDatabaseResult> invokeAsync(GetReadOnlyFollowingDatabaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getReadOnlyFollowingDatabase", TypeShape.of(GetReadOnlyFollowingDatabaseResult.class), args == null ? GetReadOnlyFollowingDatabaseArgs.Empty : args, Utilities.withVersion(options));
    }
}
