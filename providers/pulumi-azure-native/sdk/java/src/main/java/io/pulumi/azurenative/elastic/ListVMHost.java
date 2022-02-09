// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.elastic.inputs.ListVMHostArgs;
import io.pulumi.azurenative.elastic.outputs.ListVMHostResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListVMHost {
    public static CompletableFuture<ListVMHostResult> invokeAsync(ListVMHostArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:elastic:listVMHost", TypeShape.of(ListVMHostResult.class), args == null ? ListVMHostArgs.Empty : args, Utilities.withVersion(options));
    }
}
