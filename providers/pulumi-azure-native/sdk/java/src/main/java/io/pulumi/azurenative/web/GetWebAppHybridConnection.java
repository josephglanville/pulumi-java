// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppHybridConnectionArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppHybridConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppHybridConnection {
    public static CompletableFuture<GetWebAppHybridConnectionResult> invokeAsync(GetWebAppHybridConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppHybridConnection", TypeShape.of(GetWebAppHybridConnectionResult.class), args == null ? GetWebAppHybridConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
