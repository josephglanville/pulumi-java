// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.GetSecurityContactArgs;
import io.pulumi.azurenative.security.outputs.GetSecurityContactResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecurityContact {
    public static CompletableFuture<GetSecurityContactResult> invokeAsync(GetSecurityContactArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:getSecurityContact", TypeShape.of(GetSecurityContactResult.class), args == null ? GetSecurityContactArgs.Empty : args, Utilities.withVersion(options));
    }
}
