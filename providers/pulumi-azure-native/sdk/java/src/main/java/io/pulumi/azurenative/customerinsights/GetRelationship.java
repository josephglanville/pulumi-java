// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.inputs.GetRelationshipArgs;
import io.pulumi.azurenative.customerinsights.outputs.GetRelationshipResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRelationship {
    public static CompletableFuture<GetRelationshipResult> invokeAsync(GetRelationshipArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getRelationship", TypeShape.of(GetRelationshipResult.class), args == null ? GetRelationshipArgs.Empty : args, Utilities.withVersion(options));
    }
}
