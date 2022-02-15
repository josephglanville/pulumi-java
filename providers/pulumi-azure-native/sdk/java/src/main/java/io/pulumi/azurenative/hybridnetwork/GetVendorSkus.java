// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.inputs.GetVendorSkusArgs;
import io.pulumi.azurenative.hybridnetwork.outputs.GetVendorSkusResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVendorSkus {
    public static CompletableFuture<GetVendorSkusResult> invokeAsync(GetVendorSkusArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:getVendorSkus", TypeShape.of(GetVendorSkusResult.class), args == null ? GetVendorSkusArgs.Empty : args, Utilities.withVersion(options));
    }
}