// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.GetOsPolicyAssignmentArgs;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.GetOsPolicyAssignmentResult;
import java.util.concurrent.CompletableFuture;

public final class Osconfig_v1alphaFunctions {
    /**
     * Retrieve an existing OS policy assignment. This method always returns the latest revision. In order to retrieve a previous revision of the assignment, also provide the revision ID in the `name` parameter.
     * 
     */
    public static CompletableFuture<GetOsPolicyAssignmentResult> getOsPolicyAssignment(GetOsPolicyAssignmentArgs args) {
        return getOsPolicyAssignment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOsPolicyAssignmentResult> getOsPolicyAssignment(GetOsPolicyAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:osconfig/v1alpha:getOsPolicyAssignment", TypeShape.of(GetOsPolicyAssignmentResult.class), args, Utilities.withVersion(options));
    }
}
