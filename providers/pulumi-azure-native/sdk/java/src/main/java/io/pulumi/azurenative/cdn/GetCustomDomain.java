// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.inputs.GetCustomDomainArgs;
import io.pulumi.azurenative.cdn.outputs.GetCustomDomainResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomDomain {
    public static CompletableFuture<GetCustomDomainResult> invokeAsync(GetCustomDomainArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getCustomDomain", TypeShape.of(GetCustomDomainResult.class), args == null ? GetCustomDomainArgs.Empty : args, Utilities.withVersion(options));
    }
}
