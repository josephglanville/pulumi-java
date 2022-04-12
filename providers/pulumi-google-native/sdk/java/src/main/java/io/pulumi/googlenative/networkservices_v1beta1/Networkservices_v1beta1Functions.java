// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.GetEndpointPolicyArgs;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.GetEndpointPolicyIamPolicyArgs;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.GetServiceBindingArgs;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.GetServiceBindingIamPolicyArgs;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.GetEndpointPolicyIamPolicyResult;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.GetEndpointPolicyResult;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.GetServiceBindingIamPolicyResult;
import io.pulumi.googlenative.networkservices_v1beta1.outputs.GetServiceBindingResult;
import java.util.concurrent.CompletableFuture;

public final class Networkservices_v1beta1Functions {
    /**
     * Gets details of a single EndpointPolicy.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyResult> getEndpointPolicy(GetEndpointPolicyArgs args) {
        return getEndpointPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEndpointPolicyResult> getEndpointPolicy(GetEndpointPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getEndpointPolicy", TypeShape.of(GetEndpointPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyIamPolicyResult> getEndpointPolicyIamPolicy(GetEndpointPolicyIamPolicyArgs args) {
        return getEndpointPolicyIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEndpointPolicyIamPolicyResult> getEndpointPolicyIamPolicy(GetEndpointPolicyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getEndpointPolicyIamPolicy", TypeShape.of(GetEndpointPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ServiceBinding.
     * 
     */
    public static CompletableFuture<GetServiceBindingResult> getServiceBinding(GetServiceBindingArgs args) {
        return getServiceBinding(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceBindingResult> getServiceBinding(GetServiceBindingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getServiceBinding", TypeShape.of(GetServiceBindingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceBindingIamPolicyResult> getServiceBindingIamPolicy(GetServiceBindingIamPolicyArgs args) {
        return getServiceBindingIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceBindingIamPolicyResult> getServiceBindingIamPolicy(GetServiceBindingIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getServiceBindingIamPolicy", TypeShape.of(GetServiceBindingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
