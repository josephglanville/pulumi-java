// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetHybridRunbookWorkerGroupArgs;
import io.pulumi.azurenative.automation.outputs.GetHybridRunbookWorkerGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHybridRunbookWorkerGroup {
    public static CompletableFuture<GetHybridRunbookWorkerGroupResult> invokeAsync(GetHybridRunbookWorkerGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getHybridRunbookWorkerGroup", TypeShape.of(GetHybridRunbookWorkerGroupResult.class), args == null ? GetHybridRunbookWorkerGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
