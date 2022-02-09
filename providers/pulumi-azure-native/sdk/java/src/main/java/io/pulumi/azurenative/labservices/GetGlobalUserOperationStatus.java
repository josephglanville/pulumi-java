// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationStatusArgs;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserOperationStatusResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalUserOperationStatus {
    public static CompletableFuture<GetGlobalUserOperationStatusResult> invokeAsync(GetGlobalUserOperationStatusArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserOperationStatus", TypeShape.of(GetGlobalUserOperationStatusResult.class), args == null ? GetGlobalUserOperationStatusArgs.Empty : args, Utilities.withVersion(options));
    }
}
