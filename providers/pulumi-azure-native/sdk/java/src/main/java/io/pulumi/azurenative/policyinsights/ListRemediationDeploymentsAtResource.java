// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.inputs.ListRemediationDeploymentsAtResourceArgs;
import io.pulumi.azurenative.policyinsights.outputs.ListRemediationDeploymentsAtResourceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListRemediationDeploymentsAtResource {
    public static CompletableFuture<ListRemediationDeploymentsAtResourceResult> invokeAsync(ListRemediationDeploymentsAtResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:policyinsights:listRemediationDeploymentsAtResource", TypeShape.of(ListRemediationDeploymentsAtResourceResult.class), args == null ? ListRemediationDeploymentsAtResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
