// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.GetIntegrationAccountCertificateArgs;
import io.pulumi.azurenative.logic.outputs.GetIntegrationAccountCertificateResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationAccountCertificate {
    public static CompletableFuture<GetIntegrationAccountCertificateResult> invokeAsync(GetIntegrationAccountCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:getIntegrationAccountCertificate", TypeShape.of(GetIntegrationAccountCertificateResult.class), args == null ? GetIntegrationAccountCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
