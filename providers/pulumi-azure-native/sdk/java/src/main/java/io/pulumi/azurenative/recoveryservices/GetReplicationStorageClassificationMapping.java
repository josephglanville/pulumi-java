// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.inputs.GetReplicationStorageClassificationMappingArgs;
import io.pulumi.azurenative.recoveryservices.outputs.GetReplicationStorageClassificationMappingResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplicationStorageClassificationMapping {
    public static CompletableFuture<GetReplicationStorageClassificationMappingResult> invokeAsync(GetReplicationStorageClassificationMappingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:recoveryservices:getReplicationStorageClassificationMapping", TypeShape.of(GetReplicationStorageClassificationMappingResult.class), args == null ? GetReplicationStorageClassificationMappingArgs.Empty : args, Utilities.withVersion(options));
    }
}
