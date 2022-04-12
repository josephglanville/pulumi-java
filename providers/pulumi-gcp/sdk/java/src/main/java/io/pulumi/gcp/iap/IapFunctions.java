// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.inputs.GetClientArgs;
import io.pulumi.gcp.iap.outputs.GetClientResult;
import java.util.concurrent.CompletableFuture;

public final class IapFunctions {
    /**
     * Get info about a Google Cloud IAP Client.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetClientResult> getClient(GetClientArgs args) {
        return getClient(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClientResult> getClient(GetClientArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:iap/getClient:getClient", TypeShape.of(GetClientResult.class), args, Utilities.withVersion(options));
    }
}
