// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.elastic.inputs.ListDeploymentInfoArgs;
import io.pulumi.azurenative.elastic.outputs.ListDeploymentInfoResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDeploymentInfo {
    public static CompletableFuture<ListDeploymentInfoResult> invokeAsync(ListDeploymentInfoArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:elastic:listDeploymentInfo", TypeShape.of(ListDeploymentInfoResult.class), args == null ? ListDeploymentInfoArgs.Empty : args, Utilities.withVersion(options));
    }
}
