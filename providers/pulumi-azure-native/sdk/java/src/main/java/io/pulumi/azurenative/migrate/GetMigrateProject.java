// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.inputs.GetMigrateProjectArgs;
import io.pulumi.azurenative.migrate.outputs.GetMigrateProjectResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMigrateProject {
    public static CompletableFuture<GetMigrateProjectResult> invokeAsync(GetMigrateProjectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getMigrateProject", TypeShape.of(GetMigrateProjectResult.class), args == null ? GetMigrateProjectArgs.Empty : args, Utilities.withVersion(options));
    }
}
