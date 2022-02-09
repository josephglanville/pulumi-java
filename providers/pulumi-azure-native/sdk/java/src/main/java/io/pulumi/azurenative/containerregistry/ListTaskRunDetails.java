// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.ListTaskRunDetailsArgs;
import io.pulumi.azurenative.containerregistry.outputs.ListTaskRunDetailsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListTaskRunDetails {
    public static CompletableFuture<ListTaskRunDetailsResult> invokeAsync(ListTaskRunDetailsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listTaskRunDetails", TypeShape.of(ListTaskRunDetailsResult.class), args == null ? ListTaskRunDetailsArgs.Empty : args, Utilities.withVersion(options));
    }
}
