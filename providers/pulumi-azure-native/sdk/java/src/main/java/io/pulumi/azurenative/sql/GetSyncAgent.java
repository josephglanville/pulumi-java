// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetSyncAgentArgs;
import io.pulumi.azurenative.sql.outputs.GetSyncAgentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSyncAgent {
    public static CompletableFuture<GetSyncAgentResult> invokeAsync(GetSyncAgentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getSyncAgent", TypeShape.of(GetSyncAgentResult.class), args == null ? GetSyncAgentArgs.Empty : args, Utilities.withVersion(options));
    }
}
