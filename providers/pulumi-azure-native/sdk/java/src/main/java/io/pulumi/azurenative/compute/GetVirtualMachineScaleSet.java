// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.inputs.GetVirtualMachineScaleSetArgs;
import io.pulumi.azurenative.compute.outputs.GetVirtualMachineScaleSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualMachineScaleSet {
    public static CompletableFuture<GetVirtualMachineScaleSetResult> invokeAsync(GetVirtualMachineScaleSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineScaleSet", TypeShape.of(GetVirtualMachineScaleSetResult.class), args == null ? GetVirtualMachineScaleSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
