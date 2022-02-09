// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurearcdata.inputs.GetPostgresInstanceArgs;
import io.pulumi.azurenative.azurearcdata.outputs.GetPostgresInstanceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPostgresInstance {
    public static CompletableFuture<GetPostgresInstanceResult> invokeAsync(GetPostgresInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurearcdata:getPostgresInstance", TypeShape.of(GetPostgresInstanceResult.class), args == null ? GetPostgresInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
