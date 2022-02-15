// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabaseInstance {
    public static CompletableFuture<GetDatabaseInstanceResult> invokeAsync(GetDatabaseInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getDatabaseInstance:getDatabaseInstance", TypeShape.of(GetDatabaseInstanceResult.class), args == null ? GetDatabaseInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}