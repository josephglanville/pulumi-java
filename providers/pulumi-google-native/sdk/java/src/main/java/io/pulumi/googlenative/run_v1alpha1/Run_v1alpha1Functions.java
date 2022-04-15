// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.run_v1alpha1.inputs.GetJobArgs;
import io.pulumi.googlenative.run_v1alpha1.outputs.GetJobResult;
import java.util.concurrent.CompletableFuture;

public final class Run_v1alpha1Functions {
    /**
     * Get information about a job.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:run/v1alpha1:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
}