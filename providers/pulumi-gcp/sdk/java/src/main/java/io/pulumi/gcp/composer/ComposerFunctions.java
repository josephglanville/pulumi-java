// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.composer.inputs.GetEnvironmentArgs;
import io.pulumi.gcp.composer.inputs.GetImageVersionsArgs;
import io.pulumi.gcp.composer.outputs.GetEnvironmentResult;
import io.pulumi.gcp.composer.outputs.GetImageVersionsResult;
import java.util.concurrent.CompletableFuture;

public final class ComposerFunctions {
    /**
     * Provides access to Cloud Composer environment configuration in a region for a given project.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:composer/getEnvironment:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to available Cloud Composer versions in a region for a given project.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetImageVersionsResult> getImageVersions() {
        return getImageVersions(GetImageVersionsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageVersionsResult> getImageVersions(GetImageVersionsArgs args) {
        return getImageVersions(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageVersionsResult> getImageVersions(GetImageVersionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:composer/getImageVersions:getImageVersions", TypeShape.of(GetImageVersionsResult.class), args, Utilities.withVersion(options));
    }
}