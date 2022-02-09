// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetGuestDiagnosticsSettingsAssociationArgs;
import io.pulumi.azurenative.insights.outputs.GetGuestDiagnosticsSettingsAssociationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGuestDiagnosticsSettingsAssociation {
    public static CompletableFuture<GetGuestDiagnosticsSettingsAssociationResult> invokeAsync(GetGuestDiagnosticsSettingsAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getGuestDiagnosticsSettingsAssociation", TypeShape.of(GetGuestDiagnosticsSettingsAssociationResult.class), args == null ? GetGuestDiagnosticsSettingsAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
