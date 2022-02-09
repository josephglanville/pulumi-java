// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.inputs.GetReadWriteDatabaseArgs;
import io.pulumi.azurenative.kusto.outputs.GetReadWriteDatabaseResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReadWriteDatabase {
    public static CompletableFuture<GetReadWriteDatabaseResult> invokeAsync(GetReadWriteDatabaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getReadWriteDatabase", TypeShape.of(GetReadWriteDatabaseResult.class), args == null ? GetReadWriteDatabaseArgs.Empty : args, Utilities.withVersion(options));
    }
}
