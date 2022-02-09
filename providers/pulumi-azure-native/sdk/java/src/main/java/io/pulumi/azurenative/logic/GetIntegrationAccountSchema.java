// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.GetIntegrationAccountSchemaArgs;
import io.pulumi.azurenative.logic.outputs.GetIntegrationAccountSchemaResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationAccountSchema {
    public static CompletableFuture<GetIntegrationAccountSchemaResult> invokeAsync(GetIntegrationAccountSchemaArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:getIntegrationAccountSchema", TypeShape.of(GetIntegrationAccountSchemaResult.class), args == null ? GetIntegrationAccountSchemaArgs.Empty : args, Utilities.withVersion(options));
    }
}
