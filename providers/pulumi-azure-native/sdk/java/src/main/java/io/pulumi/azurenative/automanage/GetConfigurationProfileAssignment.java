// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automanage.inputs.GetConfigurationProfileAssignmentArgs;
import io.pulumi.azurenative.automanage.outputs.GetConfigurationProfileAssignmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConfigurationProfileAssignment {
    public static CompletableFuture<GetConfigurationProfileAssignmentResult> invokeAsync(GetConfigurationProfileAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automanage:getConfigurationProfileAssignment", TypeShape.of(GetConfigurationProfileAssignmentResult.class), args == null ? GetConfigurationProfileAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
