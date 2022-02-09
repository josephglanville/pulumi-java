// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformariadb.inputs.GetDatabaseArgs;
import io.pulumi.azurenative.dbformariadb.outputs.GetDatabaseResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabase {
    public static CompletableFuture<GetDatabaseResult> invokeAsync(GetDatabaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbformariadb:getDatabase", TypeShape.of(GetDatabaseResult.class), args == null ? GetDatabaseArgs.Empty : args, Utilities.withVersion(options));
    }
}
