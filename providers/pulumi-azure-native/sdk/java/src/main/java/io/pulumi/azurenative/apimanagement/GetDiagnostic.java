// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetDiagnosticArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetDiagnosticResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDiagnostic {
    public static CompletableFuture<GetDiagnosticResult> invokeAsync(GetDiagnosticArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getDiagnostic", TypeShape.of(GetDiagnosticResult.class), args == null ? GetDiagnosticArgs.Empty : args, Utilities.withVersion(options));
    }
}
