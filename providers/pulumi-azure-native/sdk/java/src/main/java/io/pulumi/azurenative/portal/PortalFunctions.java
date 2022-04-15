// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.portal.inputs.GetConsoleArgs;
import io.pulumi.azurenative.portal.inputs.GetConsoleWithLocationArgs;
import io.pulumi.azurenative.portal.inputs.GetDashboardArgs;
import io.pulumi.azurenative.portal.inputs.GetTenantConfigurationArgs;
import io.pulumi.azurenative.portal.inputs.GetUserSettingsArgs;
import io.pulumi.azurenative.portal.inputs.GetUserSettingsWithLocationArgs;
import io.pulumi.azurenative.portal.inputs.ListListTenantConfigurationViolationArgs;
import io.pulumi.azurenative.portal.outputs.GetConsoleResult;
import io.pulumi.azurenative.portal.outputs.GetConsoleWithLocationResult;
import io.pulumi.azurenative.portal.outputs.GetDashboardResult;
import io.pulumi.azurenative.portal.outputs.GetTenantConfigurationResult;
import io.pulumi.azurenative.portal.outputs.GetUserSettingsResult;
import io.pulumi.azurenative.portal.outputs.GetUserSettingsWithLocationResult;
import io.pulumi.azurenative.portal.outputs.ListListTenantConfigurationViolationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class PortalFunctions {
    /**
     * Cloud shell console
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetConsoleResult> getConsole(GetConsoleArgs args) {
        return getConsole(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConsoleResult> getConsole(GetConsoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getConsole", TypeShape.of(GetConsoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Cloud shell console
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetConsoleWithLocationResult> getConsoleWithLocation(GetConsoleWithLocationArgs args) {
        return getConsoleWithLocation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConsoleWithLocationResult> getConsoleWithLocation(GetConsoleWithLocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getConsoleWithLocation", TypeShape.of(GetConsoleWithLocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The shared dashboard resource definition.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<GetDashboardResult> getDashboard(GetDashboardArgs args) {
        return getDashboard(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDashboardResult> getDashboard(GetDashboardArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getDashboard", TypeShape.of(GetDashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Tenant configuration.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<GetTenantConfigurationResult> getTenantConfiguration(GetTenantConfigurationArgs args) {
        return getTenantConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTenantConfigurationResult> getTenantConfiguration(GetTenantConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getTenantConfiguration", TypeShape.of(GetTenantConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response to get user settings
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetUserSettingsResult> getUserSettings(GetUserSettingsArgs args) {
        return getUserSettings(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserSettingsResult> getUserSettings(GetUserSettingsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getUserSettings", TypeShape.of(GetUserSettingsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response to get user settings
     * API Version: 2018-10-01.
     * 
     */
    public static CompletableFuture<GetUserSettingsWithLocationResult> getUserSettingsWithLocation(GetUserSettingsWithLocationArgs args) {
        return getUserSettingsWithLocation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserSettingsWithLocationResult> getUserSettingsWithLocation(GetUserSettingsWithLocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getUserSettingsWithLocation", TypeShape.of(GetUserSettingsWithLocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * List of list of items that violate tenant's configuration.
     * API Version: 2020-09-01-preview.
     * 
     */
    public static CompletableFuture<ListListTenantConfigurationViolationResult> listListTenantConfigurationViolation() {
        return listListTenantConfigurationViolation(ListListTenantConfigurationViolationArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListListTenantConfigurationViolationResult> listListTenantConfigurationViolation(ListListTenantConfigurationViolationArgs args) {
        return listListTenantConfigurationViolation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListListTenantConfigurationViolationResult> listListTenantConfigurationViolation(ListListTenantConfigurationViolationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:listListTenantConfigurationViolation", TypeShape.of(ListListTenantConfigurationViolationResult.class), args, Utilities.withVersion(options));
    }
}