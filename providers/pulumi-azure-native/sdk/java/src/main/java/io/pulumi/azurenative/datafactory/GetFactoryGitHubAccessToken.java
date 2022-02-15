// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.inputs.GetFactoryGitHubAccessTokenArgs;
import io.pulumi.azurenative.datafactory.outputs.GetFactoryGitHubAccessTokenResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFactoryGitHubAccessToken {
    public static CompletableFuture<GetFactoryGitHubAccessTokenResult> invokeAsync(GetFactoryGitHubAccessTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datafactory:getFactoryGitHubAccessToken", TypeShape.of(GetFactoryGitHubAccessTokenResult.class), args == null ? GetFactoryGitHubAccessTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}