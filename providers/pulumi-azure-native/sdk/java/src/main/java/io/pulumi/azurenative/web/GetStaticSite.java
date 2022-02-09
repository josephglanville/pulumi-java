// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetStaticSiteArgs;
import io.pulumi.azurenative.web.outputs.GetStaticSiteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStaticSite {
    public static CompletableFuture<GetStaticSiteResult> invokeAsync(GetStaticSiteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getStaticSite", TypeShape.of(GetStaticSiteResult.class), args == null ? GetStaticSiteArgs.Empty : args, Utilities.withVersion(options));
    }
}
