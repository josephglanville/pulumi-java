// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databox.inputs.GetJobArgs;
import io.pulumi.azurenative.databox.outputs.GetJobResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJob {
    public static CompletableFuture<GetJobResult> invokeAsync(GetJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databox:getJob", TypeShape.of(GetJobResult.class), args == null ? GetJobArgs.Empty : args, Utilities.withVersion(options));
    }
}
