// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.GetAccessPolicyArgs;
import io.pulumi.googlenative.accesscontextmanager_v1beta.outputs.GetAccessPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPolicy {
    public static CompletableFuture<GetAccessPolicyResult> invokeAsync(GetAccessPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:accesscontextmanager/v1beta:getAccessPolicy", TypeShape.of(GetAccessPolicyResult.class), args == null ? GetAccessPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}