// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.GetConnectivityTestArgs;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.GetConnectivityTestIamPolicyArgs;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.GetConnectivityTestIamPolicyResult;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.GetConnectivityTestResult;
import java.util.concurrent.CompletableFuture;

public final class Networkmanagement_v1beta1Functions {
    /**
     * Gets the details of a specific Connectivity Test.
     * 
     */
    public static CompletableFuture<GetConnectivityTestResult> getConnectivityTest(GetConnectivityTestArgs args) {
        return getConnectivityTest(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectivityTestResult> getConnectivityTest(GetConnectivityTestArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkmanagement/v1beta1:getConnectivityTest", TypeShape.of(GetConnectivityTestResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectivityTestIamPolicyResult> getConnectivityTestIamPolicy(GetConnectivityTestIamPolicyArgs args) {
        return getConnectivityTestIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectivityTestIamPolicyResult> getConnectivityTestIamPolicy(GetConnectivityTestIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkmanagement/v1beta1:getConnectivityTestIamPolicy", TypeShape.of(GetConnectivityTestIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}