// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.GetBigDataPoolArgs;
import io.pulumi.azurenative.synapse.outputs.GetBigDataPoolResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBigDataPool {
    public static CompletableFuture<GetBigDataPoolResult> invokeAsync(GetBigDataPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:getBigDataPool", TypeShape.of(GetBigDataPoolResult.class), args == null ? GetBigDataPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
