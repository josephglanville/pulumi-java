// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelineIamPolicyArgs;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetDeliveryPipelineIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDeliveryPipelineIamPolicy {
    public static CompletableFuture<GetDeliveryPipelineIamPolicyResult> invokeAsync(GetDeliveryPipelineIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getDeliveryPipelineIamPolicy", TypeShape.of(GetDeliveryPipelineIamPolicyResult.class), args == null ? GetDeliveryPipelineIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}