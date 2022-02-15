// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.offazure.inputs.GetSiteArgs;
import io.pulumi.azurenative.offazure.outputs.GetSiteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSite {
    public static CompletableFuture<GetSiteResult> invokeAsync(GetSiteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:offazure:getSite", TypeShape.of(GetSiteResult.class), args == null ? GetSiteArgs.Empty : args, Utilities.withVersion(options));
    }
}