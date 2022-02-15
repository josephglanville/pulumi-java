// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.inputs.GetClientArgs;
import io.pulumi.gcp.iap.outputs.GetClientResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetClient {
    public static CompletableFuture<GetClientResult> invokeAsync(GetClientArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:iap/getClient:getClient", TypeShape.of(GetClientResult.class), args == null ? GetClientArgs.Empty : args, Utilities.withVersion(options));
    }
}