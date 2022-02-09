// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.inputs.GetAssessmentArgs;
import io.pulumi.azurenative.migrate.outputs.GetAssessmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAssessment {
    public static CompletableFuture<GetAssessmentResult> invokeAsync(GetAssessmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getAssessment", TypeShape.of(GetAssessmentResult.class), args == null ? GetAssessmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
