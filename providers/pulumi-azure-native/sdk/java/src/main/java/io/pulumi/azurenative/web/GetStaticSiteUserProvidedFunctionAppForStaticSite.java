// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetStaticSiteUserProvidedFunctionAppForStaticSiteArgs;
import io.pulumi.azurenative.web.outputs.GetStaticSiteUserProvidedFunctionAppForStaticSiteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStaticSiteUserProvidedFunctionAppForStaticSite {
    public static CompletableFuture<GetStaticSiteUserProvidedFunctionAppForStaticSiteResult> invokeAsync(GetStaticSiteUserProvidedFunctionAppForStaticSiteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getStaticSiteUserProvidedFunctionAppForStaticSite", TypeShape.of(GetStaticSiteUserProvidedFunctionAppForStaticSiteResult.class), args == null ? GetStaticSiteUserProvidedFunctionAppForStaticSiteArgs.Empty : args, Utilities.withVersion(options));
    }
}
