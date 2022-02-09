// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.testbase.inputs.GetTestResultDownloadURLArgs;
import io.pulumi.azurenative.testbase.outputs.GetTestResultDownloadURLResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTestResultDownloadURL {
    public static CompletableFuture<GetTestResultDownloadURLResult> invokeAsync(GetTestResultDownloadURLArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestResultDownloadURL", TypeShape.of(GetTestResultDownloadURLResult.class), args == null ? GetTestResultDownloadURLArgs.Empty : args, Utilities.withVersion(options));
    }
}
