// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.inputs.GetQueryArgs;
import io.pulumi.azurenative.operationalinsights.outputs.GetQueryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetQuery {
    public static CompletableFuture<GetQueryResult> invokeAsync(GetQueryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:operationalinsights:getQuery", TypeShape.of(GetQueryResult.class), args == null ? GetQueryArgs.Empty : args, Utilities.withVersion(options));
    }
}
