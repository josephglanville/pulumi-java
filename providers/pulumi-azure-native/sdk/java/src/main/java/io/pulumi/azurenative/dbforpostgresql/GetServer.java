// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbforpostgresql.inputs.GetServerArgs;
import io.pulumi.azurenative.dbforpostgresql.outputs.GetServerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServer {
    public static CompletableFuture<GetServerResult> invokeAsync(GetServerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getServer", TypeShape.of(GetServerResult.class), args == null ? GetServerArgs.Empty : args, Utilities.withVersion(options));
    }
}
