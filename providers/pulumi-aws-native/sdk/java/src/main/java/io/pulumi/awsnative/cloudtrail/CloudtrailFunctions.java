// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudtrail.inputs.GetTrailArgs;
import io.pulumi.awsnative.cloudtrail.outputs.GetTrailResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CloudtrailFunctions {
    /**
     * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five trails can exist in a region, irrespective of the region in which they were created.
     * 
     */
    public static CompletableFuture<GetTrailResult> getTrail(GetTrailArgs args) {
        return getTrail(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTrailResult> getTrail(GetTrailArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudtrail:getTrail", TypeShape.of(GetTrailResult.class), args, Utilities.withVersion(options));
    }
}
