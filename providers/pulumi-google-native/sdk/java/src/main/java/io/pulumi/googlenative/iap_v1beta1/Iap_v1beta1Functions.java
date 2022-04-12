// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iap_v1beta1.inputs.GetV1beta1IamPolicyArgs;
import io.pulumi.googlenative.iap_v1beta1.outputs.GetV1beta1IamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class Iap_v1beta1Functions {
    /**
     * Gets the access control policy for an Identity-Aware Proxy protected resource. More information about managing access via IAP can be found at: https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
     * 
     */
    public static CompletableFuture<GetV1beta1IamPolicyResult> getV1beta1IamPolicy(GetV1beta1IamPolicyArgs args) {
        return getV1beta1IamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetV1beta1IamPolicyResult> getV1beta1IamPolicy(GetV1beta1IamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iap/v1beta1:getV1beta1IamPolicy", TypeShape.of(GetV1beta1IamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
