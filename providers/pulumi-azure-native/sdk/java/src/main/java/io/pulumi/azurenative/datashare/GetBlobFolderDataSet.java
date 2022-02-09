// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetBlobFolderDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.GetBlobFolderDataSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBlobFolderDataSet {
    public static CompletableFuture<GetBlobFolderDataSetResult> invokeAsync(GetBlobFolderDataSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getBlobFolderDataSet", TypeShape.of(GetBlobFolderDataSetResult.class), args == null ? GetBlobFolderDataSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
