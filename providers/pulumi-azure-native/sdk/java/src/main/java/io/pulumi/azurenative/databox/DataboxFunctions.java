// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databox.inputs.GetJobArgs;
import io.pulumi.azurenative.databox.inputs.ListJobCredentialsArgs;
import io.pulumi.azurenative.databox.outputs.GetJobResult;
import io.pulumi.azurenative.databox.outputs.ListJobCredentialsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DataboxFunctions {
    /**
     * Job Resource.
     * API Version: 2020-11-01.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databox:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * List of unencrypted credentials for accessing device.
     * API Version: 2020-11-01.
     * 
     */
    public static CompletableFuture<ListJobCredentialsResult> listJobCredentials(ListJobCredentialsArgs args) {
        return listJobCredentials(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListJobCredentialsResult> listJobCredentials(ListJobCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databox:listJobCredentials", TypeShape.of(ListJobCredentialsResult.class), args, Utilities.withVersion(options));
    }
}