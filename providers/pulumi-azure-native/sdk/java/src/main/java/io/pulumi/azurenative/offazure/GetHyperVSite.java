// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.offazure.inputs.GetHyperVSiteArgs;
import io.pulumi.azurenative.offazure.outputs.GetHyperVSiteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHyperVSite {
    public static CompletableFuture<GetHyperVSiteResult> invokeAsync(GetHyperVSiteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:offazure:getHyperVSite", TypeShape.of(GetHyperVSiteResult.class), args == null ? GetHyperVSiteArgs.Empty : args, Utilities.withVersion(options));
    }
}
