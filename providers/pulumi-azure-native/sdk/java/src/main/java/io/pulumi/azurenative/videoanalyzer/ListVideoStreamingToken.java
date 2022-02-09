// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.inputs.ListVideoStreamingTokenArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.ListVideoStreamingTokenResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListVideoStreamingToken {
    public static CompletableFuture<ListVideoStreamingTokenResult> invokeAsync(ListVideoStreamingTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:listVideoStreamingToken", TypeShape.of(ListVideoStreamingTokenResult.class), args == null ? ListVideoStreamingTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
