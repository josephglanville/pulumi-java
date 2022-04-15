// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoindexer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoindexer.inputs.GetAccountArgs;
import io.pulumi.azurenative.videoindexer.outputs.GetAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class VideoindexerFunctions {
    /**
     * An Azure Video Analyzer for Media account.
     * API Version: 2021-10-18-preview.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoindexer:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
}