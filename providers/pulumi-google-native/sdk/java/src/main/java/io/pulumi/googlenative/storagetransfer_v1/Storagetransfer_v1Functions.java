// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storagetransfer_v1.inputs.GetAgentPoolArgs;
import io.pulumi.googlenative.storagetransfer_v1.inputs.GetTransferJobArgs;
import io.pulumi.googlenative.storagetransfer_v1.outputs.GetAgentPoolResult;
import io.pulumi.googlenative.storagetransfer_v1.outputs.GetTransferJobResult;
import java.util.concurrent.CompletableFuture;

public final class Storagetransfer_v1Functions {
    /**
     * Gets an agent pool.
     * 
     */
    public static CompletableFuture<GetAgentPoolResult> getAgentPool(GetAgentPoolArgs args) {
        return getAgentPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAgentPoolResult> getAgentPool(GetAgentPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storagetransfer/v1:getAgentPool", TypeShape.of(GetAgentPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a transfer job.
     * 
     */
    public static CompletableFuture<GetTransferJobResult> getTransferJob(GetTransferJobArgs args) {
        return getTransferJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransferJobResult> getTransferJob(GetTransferJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storagetransfer/v1:getTransferJob", TypeShape.of(GetTransferJobResult.class), args, Utilities.withVersion(options));
    }
}