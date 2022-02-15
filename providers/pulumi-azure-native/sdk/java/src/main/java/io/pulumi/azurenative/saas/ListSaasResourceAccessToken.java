// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.saas.inputs.ListSaasResourceAccessTokenArgs;
import io.pulumi.azurenative.saas.outputs.ListSaasResourceAccessTokenResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListSaasResourceAccessToken {
    public static CompletableFuture<ListSaasResourceAccessTokenResult> invokeAsync(ListSaasResourceAccessTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:saas:listSaasResourceAccessToken", TypeShape.of(ListSaasResourceAccessTokenResult.class), args == null ? ListSaasResourceAccessTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}