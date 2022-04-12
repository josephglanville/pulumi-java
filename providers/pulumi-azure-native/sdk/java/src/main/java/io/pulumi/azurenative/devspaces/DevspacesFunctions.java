// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devspaces.inputs.GetControllerArgs;
import io.pulumi.azurenative.devspaces.inputs.ListControllerConnectionDetailsArgs;
import io.pulumi.azurenative.devspaces.outputs.GetControllerResult;
import io.pulumi.azurenative.devspaces.outputs.ListControllerConnectionDetailsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DevspacesFunctions {
    /**
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetControllerResult> getController(GetControllerArgs args) {
        return getController(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetControllerResult> getController(GetControllerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devspaces:getController", TypeShape.of(GetControllerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<ListControllerConnectionDetailsResult> listControllerConnectionDetails(ListControllerConnectionDetailsArgs args) {
        return listControllerConnectionDetails(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListControllerConnectionDetailsResult> listControllerConnectionDetails(ListControllerConnectionDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devspaces:listControllerConnectionDetails", TypeShape.of(ListControllerConnectionDetailsResult.class), args, Utilities.withVersion(options));
    }
}
