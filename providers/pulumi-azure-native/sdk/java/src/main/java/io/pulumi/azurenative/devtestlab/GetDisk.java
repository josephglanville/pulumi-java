// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetDiskArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetDiskResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDisk {
    public static CompletableFuture<GetDiskResult> invokeAsync(GetDiskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getDisk", TypeShape.of(GetDiskResult.class), args == null ? GetDiskArgs.Empty : args, Utilities.withVersion(options));
    }
}
