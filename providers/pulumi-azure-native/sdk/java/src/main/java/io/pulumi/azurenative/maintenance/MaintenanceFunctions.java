// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maintenance.inputs.GetConfigurationAssignmentArgs;
import io.pulumi.azurenative.maintenance.inputs.GetConfigurationAssignmentParentArgs;
import io.pulumi.azurenative.maintenance.inputs.GetMaintenanceConfigurationArgs;
import io.pulumi.azurenative.maintenance.outputs.GetConfigurationAssignmentParentResult;
import io.pulumi.azurenative.maintenance.outputs.GetConfigurationAssignmentResult;
import io.pulumi.azurenative.maintenance.outputs.GetMaintenanceConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MaintenanceFunctions {
    /**
     * Configuration Assignment
     * API Version: 2021-04-01-preview.
     * 
     */
    public static CompletableFuture<GetConfigurationAssignmentResult> getConfigurationAssignment(GetConfigurationAssignmentArgs args) {
        return getConfigurationAssignment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConfigurationAssignmentResult> getConfigurationAssignment(GetConfigurationAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maintenance:getConfigurationAssignment", TypeShape.of(GetConfigurationAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Configuration Assignment
     * API Version: 2021-04-01-preview.
     * 
     */
    public static CompletableFuture<GetConfigurationAssignmentParentResult> getConfigurationAssignmentParent(GetConfigurationAssignmentParentArgs args) {
        return getConfigurationAssignmentParent(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConfigurationAssignmentParentResult> getConfigurationAssignmentParent(GetConfigurationAssignmentParentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maintenance:getConfigurationAssignmentParent", TypeShape.of(GetConfigurationAssignmentParentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Maintenance configuration record type
     * API Version: 2020-04-01.
     * 
     */
    public static CompletableFuture<GetMaintenanceConfigurationResult> getMaintenanceConfiguration(GetMaintenanceConfigurationArgs args) {
        return getMaintenanceConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMaintenanceConfigurationResult> getMaintenanceConfiguration(GetMaintenanceConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maintenance:getMaintenanceConfiguration", TypeShape.of(GetMaintenanceConfigurationResult.class), args, Utilities.withVersion(options));
    }
}