// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1beta1.inputs.GetMembershipArgs;
import io.pulumi.googlenative.gkehub_v1beta1.inputs.GetMembershipIamPolicyArgs;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.GetMembershipIamPolicyResult;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.GetMembershipResult;
import java.util.concurrent.CompletableFuture;

public final class Gkehub_v1beta1Functions {
    /**
     * Gets the details of a Membership.
     * 
     */
    public static CompletableFuture<GetMembershipResult> getMembership(GetMembershipArgs args) {
        return getMembership(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMembershipResult> getMembership(GetMembershipArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1beta1:getMembership", TypeShape.of(GetMembershipResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMembershipIamPolicyResult> getMembershipIamPolicy(GetMembershipIamPolicyArgs args) {
        return getMembershipIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMembershipIamPolicyResult> getMembershipIamPolicy(GetMembershipIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1beta1:getMembershipIamPolicy", TypeShape.of(GetMembershipIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
