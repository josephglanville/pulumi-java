// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroupstaggingapi;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesArgs;
import io.pulumi.aws.resourcegroupstaggingapi.outputs.GetResourcesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ResourcegroupstaggingapiFunctions {
    /**
     * Provides details about resource tagging.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetResourcesResult> getResources() {
        return getResources(GetResourcesArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResourcesResult> getResources(GetResourcesArgs args) {
        return getResources(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResourcesResult> getResources(GetResourcesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:resourcegroupstaggingapi/getResources:getResources", TypeShape.of(GetResourcesResult.class), args, Utilities.withVersion(options));
    }
}
