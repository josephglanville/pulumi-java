// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.GetHubArgs;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.GetHubIamPolicyArgs;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.GetPolicyBasedRouteIamPolicyArgs;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.GetSpokeArgs;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.GetSpokeIamPolicyArgs;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.GetHubIamPolicyResult;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.GetHubResult;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.GetPolicyBasedRouteIamPolicyResult;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.GetSpokeIamPolicyResult;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.GetSpokeResult;
import java.util.concurrent.CompletableFuture;

public final class Networkconnectivity_v1Functions {
    /**
     * Gets details about the specified hub.
     * 
     */
    public static CompletableFuture<GetHubResult> getHub(GetHubArgs args) {
        return getHub(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetHubResult> getHub(GetHubArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1:getHub", TypeShape.of(GetHubResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetHubIamPolicyResult> getHubIamPolicy(GetHubIamPolicyArgs args) {
        return getHubIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetHubIamPolicyResult> getHubIamPolicy(GetHubIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1:getHubIamPolicy", TypeShape.of(GetHubIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetPolicyBasedRouteIamPolicyResult> getPolicyBasedRouteIamPolicy(GetPolicyBasedRouteIamPolicyArgs args) {
        return getPolicyBasedRouteIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPolicyBasedRouteIamPolicyResult> getPolicyBasedRouteIamPolicy(GetPolicyBasedRouteIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1:getPolicyBasedRouteIamPolicy", TypeShape.of(GetPolicyBasedRouteIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details about the specified spoke.
     * 
     */
    public static CompletableFuture<GetSpokeResult> getSpoke(GetSpokeArgs args) {
        return getSpoke(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSpokeResult> getSpoke(GetSpokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1:getSpoke", TypeShape.of(GetSpokeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSpokeIamPolicyResult> getSpokeIamPolicy(GetSpokeIamPolicyArgs args) {
        return getSpokeIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSpokeIamPolicyResult> getSpokeIamPolicy(GetSpokeIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1:getSpokeIamPolicy", TypeShape.of(GetSpokeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
