// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.saas.inputs.ListSaasSubscriptionLevelAccessTokenArgs;
import io.pulumi.azurenative.saas.outputs.ListSaasSubscriptionLevelAccessTokenResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListSaasSubscriptionLevelAccessToken {
    public static CompletableFuture<ListSaasSubscriptionLevelAccessTokenResult> invokeAsync(ListSaasSubscriptionLevelAccessTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:saas:listSaasSubscriptionLevelAccessToken", TypeShape.of(ListSaasSubscriptionLevelAccessTokenResult.class), args == null ? ListSaasSubscriptionLevelAccessTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
