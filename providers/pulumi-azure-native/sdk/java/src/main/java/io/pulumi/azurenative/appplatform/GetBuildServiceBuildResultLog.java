// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetBuildServiceBuildResultLogArgs;
import io.pulumi.azurenative.appplatform.outputs.GetBuildServiceBuildResultLogResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBuildServiceBuildResultLog {
    public static CompletableFuture<GetBuildServiceBuildResultLogResult> invokeAsync(GetBuildServiceBuildResultLogArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getBuildServiceBuildResultLog", TypeShape.of(GetBuildServiceBuildResultLogResult.class), args == null ? GetBuildServiceBuildResultLogArgs.Empty : args, Utilities.withVersion(options));
    }
}
