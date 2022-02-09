// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.inputs.ListVideoContentTokenArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.ListVideoContentTokenResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListVideoContentToken {
    public static CompletableFuture<ListVideoContentTokenResult> invokeAsync(ListVideoContentTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:listVideoContentToken", TypeShape.of(ListVideoContentTokenResult.class), args == null ? ListVideoContentTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
