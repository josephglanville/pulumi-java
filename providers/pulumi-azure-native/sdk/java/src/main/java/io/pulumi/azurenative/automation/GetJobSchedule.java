// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetJobScheduleArgs;
import io.pulumi.azurenative.automation.outputs.GetJobScheduleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJobSchedule {
    public static CompletableFuture<GetJobScheduleResult> invokeAsync(GetJobScheduleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getJobSchedule", TypeShape.of(GetJobScheduleResult.class), args == null ? GetJobScheduleArgs.Empty : args, Utilities.withVersion(options));
    }
}
