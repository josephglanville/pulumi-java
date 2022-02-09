// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.ListBatchEndpointKeysArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.ListBatchEndpointKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListBatchEndpointKeys {
    public static CompletableFuture<ListBatchEndpointKeysResult> invokeAsync(ListBatchEndpointKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:listBatchEndpointKeys", TypeShape.of(ListBatchEndpointKeysResult.class), args == null ? ListBatchEndpointKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
