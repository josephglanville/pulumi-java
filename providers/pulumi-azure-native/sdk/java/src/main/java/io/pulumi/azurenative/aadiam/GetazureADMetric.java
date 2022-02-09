// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.aadiam.inputs.GetazureADMetricArgs;
import io.pulumi.azurenative.aadiam.outputs.GetazureADMetricResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetazureADMetric {
    public static CompletableFuture<GetazureADMetricResult> invokeAsync(GetazureADMetricArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:aadiam:getazureADMetric", TypeShape.of(GetazureADMetricResult.class), args == null ? GetazureADMetricArgs.Empty : args, Utilities.withVersion(options));
    }
}
