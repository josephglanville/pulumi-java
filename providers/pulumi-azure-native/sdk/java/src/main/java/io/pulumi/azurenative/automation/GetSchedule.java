// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetScheduleArgs;
import io.pulumi.azurenative.automation.outputs.GetScheduleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSchedule {
    public static CompletableFuture<GetScheduleResult> invokeAsync(GetScheduleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getSchedule", TypeShape.of(GetScheduleResult.class), args == null ? GetScheduleArgs.Empty : args, Utilities.withVersion(options));
    }
}
