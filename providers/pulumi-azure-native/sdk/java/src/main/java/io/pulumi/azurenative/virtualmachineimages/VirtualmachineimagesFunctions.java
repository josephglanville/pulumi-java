// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.virtualmachineimages.inputs.GetVirtualMachineImageTemplateArgs;
import io.pulumi.azurenative.virtualmachineimages.outputs.GetVirtualMachineImageTemplateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class VirtualmachineimagesFunctions {
    /**
     * Image template is an ARM resource managed by Microsoft.VirtualMachineImages provider
     * API Version: 2020-02-14.
     * 
     */
    public static CompletableFuture<GetVirtualMachineImageTemplateResult> getVirtualMachineImageTemplate(GetVirtualMachineImageTemplateArgs args) {
        return getVirtualMachineImageTemplate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualMachineImageTemplateResult> getVirtualMachineImageTemplate(GetVirtualMachineImageTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:virtualmachineimages:getVirtualMachineImageTemplate", TypeShape.of(GetVirtualMachineImageTemplateResult.class), args, Utilities.withVersion(options));
    }
}
