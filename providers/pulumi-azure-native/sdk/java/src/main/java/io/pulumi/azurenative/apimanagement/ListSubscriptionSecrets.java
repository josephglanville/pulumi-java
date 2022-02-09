// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.ListSubscriptionSecretsArgs;
import io.pulumi.azurenative.apimanagement.outputs.ListSubscriptionSecretsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListSubscriptionSecrets {
    public static CompletableFuture<ListSubscriptionSecretsResult> invokeAsync(ListSubscriptionSecretsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:listSubscriptionSecrets", TypeShape.of(ListSubscriptionSecretsResult.class), args == null ? ListSubscriptionSecretsArgs.Empty : args, Utilities.withVersion(options));
    }
}
