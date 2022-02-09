// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.management.inputs.GetManagementGroupArgs;
import io.pulumi.azurenative.management.outputs.GetManagementGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagementGroup {
    public static CompletableFuture<GetManagementGroupResult> invokeAsync(GetManagementGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:management:getManagementGroup", TypeShape.of(GetManagementGroupResult.class), args == null ? GetManagementGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
