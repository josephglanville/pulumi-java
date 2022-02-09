// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.inputs.GetExposureControlFeatureValueArgs;
import io.pulumi.azurenative.datafactory.outputs.GetExposureControlFeatureValueResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExposureControlFeatureValue {
    public static CompletableFuture<GetExposureControlFeatureValueResult> invokeAsync(GetExposureControlFeatureValueArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datafactory:getExposureControlFeatureValue", TypeShape.of(GetExposureControlFeatureValueResult.class), args == null ? GetExposureControlFeatureValueArgs.Empty : args, Utilities.withVersion(options));
    }
}
