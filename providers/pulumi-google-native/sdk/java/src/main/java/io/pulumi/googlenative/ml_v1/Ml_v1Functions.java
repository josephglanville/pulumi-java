// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.inputs.GetJobArgs;
import io.pulumi.googlenative.ml_v1.inputs.GetJobIamPolicyArgs;
import io.pulumi.googlenative.ml_v1.inputs.GetModelArgs;
import io.pulumi.googlenative.ml_v1.inputs.GetModelIamPolicyArgs;
import io.pulumi.googlenative.ml_v1.inputs.GetStudyArgs;
import io.pulumi.googlenative.ml_v1.inputs.GetTrialArgs;
import io.pulumi.googlenative.ml_v1.inputs.GetVersionArgs;
import io.pulumi.googlenative.ml_v1.outputs.GetJobIamPolicyResult;
import io.pulumi.googlenative.ml_v1.outputs.GetJobResult;
import io.pulumi.googlenative.ml_v1.outputs.GetModelIamPolicyResult;
import io.pulumi.googlenative.ml_v1.outputs.GetModelResult;
import io.pulumi.googlenative.ml_v1.outputs.GetStudyResult;
import io.pulumi.googlenative.ml_v1.outputs.GetTrialResult;
import io.pulumi.googlenative.ml_v1.outputs.GetVersionResult;
import java.util.concurrent.CompletableFuture;

public final class Ml_v1Functions {
    /**
     * Describes a job.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetJobIamPolicyResult> getJobIamPolicy(GetJobIamPolicyArgs args) {
        return getJobIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobIamPolicyResult> getJobIamPolicy(GetJobIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getJobIamPolicy", TypeShape.of(GetJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed).
     * 
     */
    public static CompletableFuture<GetModelResult> getModel(GetModelArgs args) {
        return getModel(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetModelResult> getModel(GetModelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getModel", TypeShape.of(GetModelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetModelIamPolicyResult> getModelIamPolicy(GetModelIamPolicyArgs args) {
        return getModelIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetModelIamPolicyResult> getModelIamPolicy(GetModelIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getModelIamPolicy", TypeShape.of(GetModelIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a study.
     * 
     */
    public static CompletableFuture<GetStudyResult> getStudy(GetStudyArgs args) {
        return getStudy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStudyResult> getStudy(GetStudyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getStudy", TypeShape.of(GetStudyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a trial.
     * 
     */
    public static CompletableFuture<GetTrialResult> getTrial(GetTrialArgs args) {
        return getTrial(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTrialResult> getTrial(GetTrialArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getTrial", TypeShape.of(GetTrialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersion(GetVersionArgs args) {
        return getVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVersionResult> getVersion(GetVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
}