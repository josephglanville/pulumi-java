// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.memcache_v1.inputs.GetInstanceArgs;
import io.pulumi.googlenative.memcache_v1.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class Memcache_v1Functions {
    /**
     * Gets details of a single Instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:memcache/v1:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
}
