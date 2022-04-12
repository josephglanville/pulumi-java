// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelineArgs;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelineIamPolicyArgs;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetReleaseArgs;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetRolloutArgs;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetTargetArgs;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetTargetIamPolicyArgs;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetDeliveryPipelineIamPolicyResult;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetDeliveryPipelineResult;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetReleaseResult;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetRolloutResult;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetTargetIamPolicyResult;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetTargetResult;
import java.util.concurrent.CompletableFuture;

public final class Clouddeploy_v1Functions {
    /**
     * Gets details of a single DeliveryPipeline.
     * 
     */
    public static CompletableFuture<GetDeliveryPipelineResult> getDeliveryPipeline(GetDeliveryPipelineArgs args) {
        return getDeliveryPipeline(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeliveryPipelineResult> getDeliveryPipeline(GetDeliveryPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getDeliveryPipeline", TypeShape.of(GetDeliveryPipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDeliveryPipelineIamPolicyResult> getDeliveryPipelineIamPolicy(GetDeliveryPipelineIamPolicyArgs args) {
        return getDeliveryPipelineIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeliveryPipelineIamPolicyResult> getDeliveryPipelineIamPolicy(GetDeliveryPipelineIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getDeliveryPipelineIamPolicy", TypeShape.of(GetDeliveryPipelineIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Release.
     * 
     */
    public static CompletableFuture<GetReleaseResult> getRelease(GetReleaseArgs args) {
        return getRelease(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetReleaseResult> getRelease(GetReleaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getRelease", TypeShape.of(GetReleaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Rollout.
     * 
     */
    public static CompletableFuture<GetRolloutResult> getRollout(GetRolloutArgs args) {
        return getRollout(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRolloutResult> getRollout(GetRolloutArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getRollout", TypeShape.of(GetRolloutResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Target.
     * 
     */
    public static CompletableFuture<GetTargetResult> getTarget(GetTargetArgs args) {
        return getTarget(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTargetResult> getTarget(GetTargetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getTarget", TypeShape.of(GetTargetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTargetIamPolicyResult> getTargetIamPolicy(GetTargetIamPolicyArgs args) {
        return getTargetIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTargetIamPolicyResult> getTargetIamPolicy(GetTargetIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getTargetIamPolicy", TypeShape.of(GetTargetIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
