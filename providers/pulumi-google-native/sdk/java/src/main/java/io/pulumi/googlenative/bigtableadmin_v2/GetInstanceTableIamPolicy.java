// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigtableadmin_v2.inputs.GetInstanceTableIamPolicyArgs;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.GetInstanceTableIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstanceTableIamPolicy {
    public static CompletableFuture<GetInstanceTableIamPolicyResult> invokeAsync(GetInstanceTableIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getInstanceTableIamPolicy", TypeShape.of(GetInstanceTableIamPolicyResult.class), args == null ? GetInstanceTableIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}