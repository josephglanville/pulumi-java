// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetPublicDelegatedPrefixArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetPublicDelegatedPrefixResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPublicDelegatedPrefix {
    public static CompletableFuture<GetPublicDelegatedPrefixResult> invokeAsync(GetPublicDelegatedPrefixArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getPublicDelegatedPrefix", TypeShape.of(GetPublicDelegatedPrefixResult.class), args == null ? GetPublicDelegatedPrefixArgs.Empty : args, Utilities.withVersion(options));
    }
}