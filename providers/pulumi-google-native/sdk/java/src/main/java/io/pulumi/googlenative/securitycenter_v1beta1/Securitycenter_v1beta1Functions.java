// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.securitycenter_v1beta1.inputs.GetOrganizationSourceIamPolicyArgs;
import io.pulumi.googlenative.securitycenter_v1beta1.inputs.GetSourceArgs;
import io.pulumi.googlenative.securitycenter_v1beta1.outputs.GetOrganizationSourceIamPolicyResult;
import io.pulumi.googlenative.securitycenter_v1beta1.outputs.GetSourceResult;
import java.util.concurrent.CompletableFuture;

public final class Securitycenter_v1beta1Functions {
    /**
     * Gets the access control policy on the specified Source.
     * 
     */
    public static CompletableFuture<GetOrganizationSourceIamPolicyResult> getOrganizationSourceIamPolicy(GetOrganizationSourceIamPolicyArgs args) {
        return getOrganizationSourceIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationSourceIamPolicyResult> getOrganizationSourceIamPolicy(GetOrganizationSourceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1beta1:getOrganizationSourceIamPolicy", TypeShape.of(GetOrganizationSourceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a source.
     * 
     */
    public static CompletableFuture<GetSourceResult> getSource(GetSourceArgs args) {
        return getSource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSourceResult> getSource(GetSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1beta1:getSource", TypeShape.of(GetSourceResult.class), args, Utilities.withVersion(options));
    }
}