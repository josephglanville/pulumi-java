// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iam.inputs.GetSAMLProviderArgs;
import io.pulumi.awsnative.iam.outputs.GetSAMLProviderResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSAMLProvider {
    public static CompletableFuture<GetSAMLProviderResult> invokeAsync(GetSAMLProviderArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iam:getSAMLProvider", TypeShape.of(GetSAMLProviderResult.class), args == null ? GetSAMLProviderArgs.Empty : args, Utilities.withVersion(options));
    }
}