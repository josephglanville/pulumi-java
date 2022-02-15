// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagecache.inputs.GetCacheArgs;
import io.pulumi.azurenative.storagecache.outputs.GetCacheResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCache {
    public static CompletableFuture<GetCacheResult> invokeAsync(GetCacheArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storagecache:getCache", TypeShape.of(GetCacheResult.class), args == null ? GetCacheArgs.Empty : args, Utilities.withVersion(options));
    }
}