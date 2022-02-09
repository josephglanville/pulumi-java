// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.marketplace.inputs.GetPrivateStoreOfferArgs;
import io.pulumi.azurenative.marketplace.outputs.GetPrivateStoreOfferResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateStoreOffer {
    public static CompletableFuture<GetPrivateStoreOfferResult> invokeAsync(GetPrivateStoreOfferArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:marketplace:getPrivateStoreOffer", TypeShape.of(GetPrivateStoreOfferResult.class), args == null ? GetPrivateStoreOfferArgs.Empty : args, Utilities.withVersion(options));
    }
}
