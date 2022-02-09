// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.ListRegistryBuildSourceUploadUrlArgs;
import io.pulumi.azurenative.containerregistry.outputs.ListRegistryBuildSourceUploadUrlResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListRegistryBuildSourceUploadUrl {
    public static CompletableFuture<ListRegistryBuildSourceUploadUrlResult> invokeAsync(ListRegistryBuildSourceUploadUrlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listRegistryBuildSourceUploadUrl", TypeShape.of(ListRegistryBuildSourceUploadUrlResult.class), args == null ? ListRegistryBuildSourceUploadUrlArgs.Empty : args, Utilities.withVersion(options));
    }
}
