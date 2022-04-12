// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datapipelines_v1.inputs.GetPipelineArgs;
import io.pulumi.googlenative.datapipelines_v1.outputs.GetPipelineResult;
import java.util.concurrent.CompletableFuture;

public final class Datapipelines_v1Functions {
    /**
     * Looks up a single pipeline. Returns a "NOT_FOUND" error if no such pipeline exists. Returns a "FORBIDDEN" error if the caller doesn't have permission to access it.
     * 
     */
    public static CompletableFuture<GetPipelineResult> getPipeline(GetPipelineArgs args) {
        return getPipeline(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPipelineResult> getPipeline(GetPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datapipelines/v1:getPipeline", TypeShape.of(GetPipelineResult.class), args, Utilities.withVersion(options));
    }
}
