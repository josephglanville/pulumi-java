// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs;
import io.pulumi.aws.autoscaling.inputs.GetGroupArgs;
import io.pulumi.aws.autoscaling.outputs.GetAmiIdsResult;
import io.pulumi.aws.autoscaling.outputs.GetGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AutoscalingFunctions {
    /**
     * The Autoscaling Groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAmiIdsResult> getAmiIds() {
        return getAmiIds(GetAmiIdsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args) {
        return getAmiIds(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:autoscaling/getAmiIds:getAmiIds", TypeShape.of(GetAmiIdsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information on an existing autoscaling group.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:autoscaling/getGroup:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
}
