// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logz.inputs.ListSubAccountVMHostsArgs;
import io.pulumi.azurenative.logz.outputs.ListSubAccountVMHostsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListSubAccountVMHosts {
    public static CompletableFuture<ListSubAccountVMHostsResult> invokeAsync(ListSubAccountVMHostsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logz:listSubAccountVMHosts", TypeShape.of(ListSubAccountVMHostsResult.class), args == null ? ListSubAccountVMHostsArgs.Empty : args, Utilities.withVersion(options));
    }
}
