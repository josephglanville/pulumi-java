// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.GetQueueArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.GetQueueIamPolicyArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.GetTaskArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.outputs.GetQueueIamPolicyResult;
import io.pulumi.googlenative.cloudtasks_v2beta3.outputs.GetQueueResult;
import io.pulumi.googlenative.cloudtasks_v2beta3.outputs.GetTaskResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudtasks_v2beta3Functions {
    /**
     * Gets a queue.
     * 
     */
    public static CompletableFuture<GetQueueResult> getQueue(GetQueueArgs args) {
        return getQueue(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetQueueResult> getQueue(GetQueueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2beta3:getQueue", TypeShape.of(GetQueueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a Queue. Returns an empty policy if the resource exists and does not have a policy set. Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission on the specified resource parent: * `cloudtasks.queues.getIamPolicy`
     * 
     */
    public static CompletableFuture<GetQueueIamPolicyResult> getQueueIamPolicy(GetQueueIamPolicyArgs args) {
        return getQueueIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetQueueIamPolicyResult> getQueueIamPolicy(GetQueueIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2beta3:getQueueIamPolicy", TypeShape.of(GetQueueIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a task.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTask(GetTaskArgs args) {
        return getTask(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTaskResult> getTask(GetTaskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2beta3:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
}
