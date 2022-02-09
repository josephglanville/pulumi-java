// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetDataContainerArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetDataContainerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataContainer {
    public static CompletableFuture<GetDataContainerResult> invokeAsync(GetDataContainerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getDataContainer", TypeShape.of(GetDataContainerResult.class), args == null ? GetDataContainerArgs.Empty : args, Utilities.withVersion(options));
    }
}
