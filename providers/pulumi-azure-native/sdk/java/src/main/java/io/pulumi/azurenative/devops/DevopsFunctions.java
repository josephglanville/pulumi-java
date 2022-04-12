// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devops.inputs.GetPipelineArgs;
import io.pulumi.azurenative.devops.outputs.GetPipelineResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DevopsFunctions {
    /**
     * Pipeline used to configure Continuous Integration (CI) & Continuous Delivery (CD) for Azure resources.
     * API Version: 2020-07-13-preview.
     * 
     */
    public static CompletableFuture<GetPipelineResult> getPipeline(GetPipelineArgs args) {
        return getPipeline(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPipelineResult> getPipeline(GetPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devops:getPipeline", TypeShape.of(GetPipelineResult.class), args, Utilities.withVersion(options));
    }
}
