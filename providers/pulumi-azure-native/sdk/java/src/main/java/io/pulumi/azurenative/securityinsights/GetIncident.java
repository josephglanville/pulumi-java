// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetIncidentArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetIncidentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIncident {
    public static CompletableFuture<GetIncidentResult> invokeAsync(GetIncidentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getIncident", TypeShape.of(GetIncidentResult.class), args == null ? GetIncidentArgs.Empty : args, Utilities.withVersion(options));
    }
}
