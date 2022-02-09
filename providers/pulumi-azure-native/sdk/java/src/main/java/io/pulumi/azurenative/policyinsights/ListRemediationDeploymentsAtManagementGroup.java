// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.inputs.ListRemediationDeploymentsAtManagementGroupArgs;
import io.pulumi.azurenative.policyinsights.outputs.ListRemediationDeploymentsAtManagementGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListRemediationDeploymentsAtManagementGroup {
    public static CompletableFuture<ListRemediationDeploymentsAtManagementGroupResult> invokeAsync(ListRemediationDeploymentsAtManagementGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:policyinsights:listRemediationDeploymentsAtManagementGroup", TypeShape.of(ListRemediationDeploymentsAtManagementGroupResult.class), args == null ? ListRemediationDeploymentsAtManagementGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
