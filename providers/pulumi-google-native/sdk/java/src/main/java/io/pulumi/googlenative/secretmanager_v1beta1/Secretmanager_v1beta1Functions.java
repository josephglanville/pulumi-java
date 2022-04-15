// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.secretmanager_v1beta1.inputs.GetSecretArgs;
import io.pulumi.googlenative.secretmanager_v1beta1.inputs.GetSecretIamPolicyArgs;
import io.pulumi.googlenative.secretmanager_v1beta1.outputs.GetSecretIamPolicyResult;
import io.pulumi.googlenative.secretmanager_v1beta1.outputs.GetSecretResult;
import java.util.concurrent.CompletableFuture;

public final class Secretmanager_v1beta1Functions {
    /**
     * Gets metadata for a given Secret.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:secretmanager/v1beta1:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a secret. Returns empty policy if the secret exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSecretIamPolicyResult> getSecretIamPolicy(GetSecretIamPolicyArgs args) {
        return getSecretIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretIamPolicyResult> getSecretIamPolicy(GetSecretIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:secretmanager/v1beta1:getSecretIamPolicy", TypeShape.of(GetSecretIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}