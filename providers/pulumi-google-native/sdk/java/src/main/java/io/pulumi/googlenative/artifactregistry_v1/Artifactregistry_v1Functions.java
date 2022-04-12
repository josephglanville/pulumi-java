// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.artifactregistry_v1.inputs.GetRepositoryArgs;
import io.pulumi.googlenative.artifactregistry_v1.inputs.GetRepositoryIamPolicyArgs;
import io.pulumi.googlenative.artifactregistry_v1.inputs.GetTagArgs;
import io.pulumi.googlenative.artifactregistry_v1.outputs.GetRepositoryIamPolicyResult;
import io.pulumi.googlenative.artifactregistry_v1.outputs.GetRepositoryResult;
import io.pulumi.googlenative.artifactregistry_v1.outputs.GetTagResult;
import java.util.concurrent.CompletableFuture;

public final class Artifactregistry_v1Functions {
    /**
     * Gets a repository.
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepository(GetRepositoryArgs args) {
        return getRepository(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRepositoryResult> getRepository(GetRepositoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy for a given resource.
     * 
     */
    public static CompletableFuture<GetRepositoryIamPolicyResult> getRepositoryIamPolicy(GetRepositoryIamPolicyArgs args) {
        return getRepositoryIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRepositoryIamPolicyResult> getRepositoryIamPolicy(GetRepositoryIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1:getRepositoryIamPolicy", TypeShape.of(GetRepositoryIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a tag.
     * 
     */
    public static CompletableFuture<GetTagResult> getTag(GetTagArgs args) {
        return getTag(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTagResult> getTag(GetTagArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1:getTag", TypeShape.of(GetTagResult.class), args, Utilities.withVersion(options));
    }
}
