// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datamigration.inputs.GetTaskArgs;
import io.pulumi.azurenative.datamigration.outputs.GetTaskResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTask {
    public static CompletableFuture<GetTaskResult> invokeAsync(GetTaskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getTask", TypeShape.of(GetTaskResult.class), args == null ? GetTaskArgs.Empty : args, Utilities.withVersion(options));
    }
}
