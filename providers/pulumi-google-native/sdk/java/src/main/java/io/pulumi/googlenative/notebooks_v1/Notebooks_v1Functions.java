// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.notebooks_v1.inputs.GetEnvironmentArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.GetExecutionArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.GetInstanceArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.GetInstanceIamPolicyArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.GetRuntimeArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.GetRuntimeIamPolicyArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.GetScheduleArgs;
import io.pulumi.googlenative.notebooks_v1.outputs.GetEnvironmentResult;
import io.pulumi.googlenative.notebooks_v1.outputs.GetExecutionResult;
import io.pulumi.googlenative.notebooks_v1.outputs.GetInstanceIamPolicyResult;
import io.pulumi.googlenative.notebooks_v1.outputs.GetInstanceResult;
import io.pulumi.googlenative.notebooks_v1.outputs.GetRuntimeIamPolicyResult;
import io.pulumi.googlenative.notebooks_v1.outputs.GetRuntimeResult;
import io.pulumi.googlenative.notebooks_v1.outputs.GetScheduleResult;
import java.util.concurrent.CompletableFuture;

public final class Notebooks_v1Functions {
    /**
     * Gets details of a single Environment.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of executions
     * 
     */
    public static CompletableFuture<GetExecutionResult> getExecution(GetExecutionArgs args) {
        return getExecution(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetExecutionResult> getExecution(GetExecutionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getExecution", TypeShape.of(GetExecutionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceIamPolicyResult> getInstanceIamPolicy(GetInstanceIamPolicyArgs args) {
        return getInstanceIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceIamPolicyResult> getInstanceIamPolicy(GetInstanceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getInstanceIamPolicy", TypeShape.of(GetInstanceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Runtime. The location must be a regional endpoint rather than zonal.
     * 
     */
    public static CompletableFuture<GetRuntimeResult> getRuntime(GetRuntimeArgs args) {
        return getRuntime(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRuntimeResult> getRuntime(GetRuntimeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getRuntime", TypeShape.of(GetRuntimeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRuntimeIamPolicyResult> getRuntimeIamPolicy(GetRuntimeIamPolicyArgs args) {
        return getRuntimeIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRuntimeIamPolicyResult> getRuntimeIamPolicy(GetRuntimeIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getRuntimeIamPolicy", TypeShape.of(GetRuntimeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of schedule
     * 
     */
    public static CompletableFuture<GetScheduleResult> getSchedule(GetScheduleArgs args) {
        return getSchedule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetScheduleResult> getSchedule(GetScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:notebooks/v1:getSchedule", TypeShape.of(GetScheduleResult.class), args, Utilities.withVersion(options));
    }
}