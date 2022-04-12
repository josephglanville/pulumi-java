// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hardwaresecuritymodules.inputs.GetDedicatedHsmArgs;
import io.pulumi.azurenative.hardwaresecuritymodules.outputs.GetDedicatedHsmResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class HardwaresecuritymodulesFunctions {
    /**
     * Resource information with extended details.
     * API Version: 2018-10-31-preview.
     * 
     */
    public static CompletableFuture<GetDedicatedHsmResult> getDedicatedHsm(GetDedicatedHsmArgs args) {
        return getDedicatedHsm(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDedicatedHsmResult> getDedicatedHsm(GetDedicatedHsmArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hardwaresecuritymodules:getDedicatedHsm", TypeShape.of(GetDedicatedHsmResult.class), args, Utilities.withVersion(options));
    }
}
