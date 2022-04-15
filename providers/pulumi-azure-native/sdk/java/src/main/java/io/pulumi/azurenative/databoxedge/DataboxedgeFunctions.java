// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetAddonArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetArcAddonArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetBandwidthScheduleArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetCloudEdgeManagementRoleArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetContainerArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetDeviceArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetDeviceExtendedInformationArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetFileEventTriggerArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetIoTAddonArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetIoTRoleArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetKubernetesRoleArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetMECRoleArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetMonitoringConfigArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetOrderArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetPeriodicTimerEventTriggerArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetRoleArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetShareArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetStorageAccountArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetStorageAccountCredentialArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetTriggerArgs;
import io.pulumi.azurenative.databoxedge.inputs.GetUserArgs;
import io.pulumi.azurenative.databoxedge.inputs.ListOrderDCAccessCodeArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetAddonResult;
import io.pulumi.azurenative.databoxedge.outputs.GetArcAddonResult;
import io.pulumi.azurenative.databoxedge.outputs.GetBandwidthScheduleResult;
import io.pulumi.azurenative.databoxedge.outputs.GetCloudEdgeManagementRoleResult;
import io.pulumi.azurenative.databoxedge.outputs.GetContainerResult;
import io.pulumi.azurenative.databoxedge.outputs.GetDeviceExtendedInformationResult;
import io.pulumi.azurenative.databoxedge.outputs.GetDeviceResult;
import io.pulumi.azurenative.databoxedge.outputs.GetFileEventTriggerResult;
import io.pulumi.azurenative.databoxedge.outputs.GetIoTAddonResult;
import io.pulumi.azurenative.databoxedge.outputs.GetIoTRoleResult;
import io.pulumi.azurenative.databoxedge.outputs.GetKubernetesRoleResult;
import io.pulumi.azurenative.databoxedge.outputs.GetMECRoleResult;
import io.pulumi.azurenative.databoxedge.outputs.GetMonitoringConfigResult;
import io.pulumi.azurenative.databoxedge.outputs.GetOrderResult;
import io.pulumi.azurenative.databoxedge.outputs.GetPeriodicTimerEventTriggerResult;
import io.pulumi.azurenative.databoxedge.outputs.GetRoleResult;
import io.pulumi.azurenative.databoxedge.outputs.GetShareResult;
import io.pulumi.azurenative.databoxedge.outputs.GetStorageAccountCredentialResult;
import io.pulumi.azurenative.databoxedge.outputs.GetStorageAccountResult;
import io.pulumi.azurenative.databoxedge.outputs.GetTriggerResult;
import io.pulumi.azurenative.databoxedge.outputs.GetUserResult;
import io.pulumi.azurenative.databoxedge.outputs.ListOrderDCAccessCodeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DataboxedgeFunctions {
    /**
     * Role Addon
     * API Version: 2020-12-01.
     * 
     * @Deprecated
     * Please use one of the variants: ArcAddon, IoTAddon.
     * 
     */
    @Deprecated /* Please use one of the variants: ArcAddon, IoTAddon. */
    public static CompletableFuture<GetAddonResult> getAddon(GetAddonArgs args) {
        return getAddon(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAddonResult> getAddon(GetAddonArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getAddon", TypeShape.of(GetAddonResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Arc Addon.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetArcAddonResult> getArcAddon(GetArcAddonArgs args) {
        return getArcAddon(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetArcAddonResult> getArcAddon(GetArcAddonArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getArcAddon", TypeShape.of(GetArcAddonResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The bandwidth schedule details.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetBandwidthScheduleResult> getBandwidthSchedule(GetBandwidthScheduleArgs args) {
        return getBandwidthSchedule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBandwidthScheduleResult> getBandwidthSchedule(GetBandwidthScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getBandwidthSchedule", TypeShape.of(GetBandwidthScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * CloudEdgeManagementRole role.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetCloudEdgeManagementRoleResult> getCloudEdgeManagementRole(GetCloudEdgeManagementRoleArgs args) {
        return getCloudEdgeManagementRole(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCloudEdgeManagementRoleResult> getCloudEdgeManagementRole(GetCloudEdgeManagementRoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getCloudEdgeManagementRole", TypeShape.of(GetCloudEdgeManagementRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a container on the  Data Box Edge/Gateway device.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetContainerResult> getContainer(GetContainerArgs args) {
        return getContainer(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetContainerResult> getContainer(GetContainerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getContainer", TypeShape.of(GetContainerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Data Box Edge/Gateway device.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args) {
        return getDevice(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getDevice", TypeShape.of(GetDeviceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The extended Info of the Data Box Edge/Gateway device.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDeviceExtendedInformationResult> getDeviceExtendedInformation(GetDeviceExtendedInformationArgs args) {
        return getDeviceExtendedInformation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeviceExtendedInformationResult> getDeviceExtendedInformation(GetDeviceExtendedInformationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getDeviceExtendedInformation", TypeShape.of(GetDeviceExtendedInformationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Trigger details.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetFileEventTriggerResult> getFileEventTrigger(GetFileEventTriggerArgs args) {
        return getFileEventTrigger(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFileEventTriggerResult> getFileEventTrigger(GetFileEventTriggerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getFileEventTrigger", TypeShape.of(GetFileEventTriggerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * IoT Addon.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetIoTAddonResult> getIoTAddon(GetIoTAddonArgs args) {
        return getIoTAddon(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIoTAddonResult> getIoTAddon(GetIoTAddonArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getIoTAddon", TypeShape.of(GetIoTAddonResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Compute role.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetIoTRoleResult> getIoTRole(GetIoTRoleArgs args) {
        return getIoTRole(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIoTRoleResult> getIoTRole(GetIoTRoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getIoTRole", TypeShape.of(GetIoTRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Kubernetes role.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetKubernetesRoleResult> getKubernetesRole(GetKubernetesRoleArgs args) {
        return getKubernetesRole(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKubernetesRoleResult> getKubernetesRole(GetKubernetesRoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getKubernetesRole", TypeShape.of(GetKubernetesRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * MEC role.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetMECRoleResult> getMECRole(GetMECRoleArgs args) {
        return getMECRole(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMECRoleResult> getMECRole(GetMECRoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getMECRole", TypeShape.of(GetMECRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The metric setting details for the role
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetMonitoringConfigResult> getMonitoringConfig(GetMonitoringConfigArgs args) {
        return getMonitoringConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMonitoringConfigResult> getMonitoringConfig(GetMonitoringConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getMonitoringConfig", TypeShape.of(GetMonitoringConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The order details.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetOrderResult> getOrder(GetOrderArgs args) {
        return getOrder(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrderResult> getOrder(GetOrderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getOrder", TypeShape.of(GetOrderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Trigger details.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetPeriodicTimerEventTriggerResult> getPeriodicTimerEventTrigger(GetPeriodicTimerEventTriggerArgs args) {
        return getPeriodicTimerEventTrigger(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPeriodicTimerEventTriggerResult> getPeriodicTimerEventTrigger(GetPeriodicTimerEventTriggerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getPeriodicTimerEventTrigger", TypeShape.of(GetPeriodicTimerEventTriggerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Compute role.
     * API Version: 2020-12-01.
     * 
     * @Deprecated
     * Please use one of the variants: CloudEdgeManagementRole, IoTRole, KubernetesRole, MECRole.
     * 
     */
    @Deprecated /* Please use one of the variants: CloudEdgeManagementRole, IoTRole, KubernetesRole, MECRole. */
    public static CompletableFuture<GetRoleResult> getRole(GetRoleArgs args) {
        return getRole(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRoleResult> getRole(GetRoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getRole", TypeShape.of(GetRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a share on the  Data Box Edge/Gateway device.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetShareResult> getShare(GetShareArgs args) {
        return getShare(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetShareResult> getShare(GetShareArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getShare", TypeShape.of(GetShareResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a Storage Account on the  Data Box Edge/Gateway device.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetStorageAccountResult> getStorageAccount(GetStorageAccountArgs args) {
        return getStorageAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStorageAccountResult> getStorageAccount(GetStorageAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getStorageAccount", TypeShape.of(GetStorageAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The storage account credential.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetStorageAccountCredentialResult> getStorageAccountCredential(GetStorageAccountCredentialArgs args) {
        return getStorageAccountCredential(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStorageAccountCredentialResult> getStorageAccountCredential(GetStorageAccountCredentialArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getStorageAccountCredential", TypeShape.of(GetStorageAccountCredentialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Trigger details.
     * API Version: 2020-12-01.
     * 
     * @Deprecated
     * Please use one of the variants: FileEventTrigger, PeriodicTimerEventTrigger.
     * 
     */
    @Deprecated /* Please use one of the variants: FileEventTrigger, PeriodicTimerEventTrigger. */
    public static CompletableFuture<GetTriggerResult> getTrigger(GetTriggerArgs args) {
        return getTrigger(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTriggerResult> getTrigger(GetTriggerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getTrigger", TypeShape.of(GetTriggerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a user who has access to one or more shares on the Data Box Edge/Gateway device.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * DC Access code in the case of Self Managed Shipping.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<ListOrderDCAccessCodeResult> listOrderDCAccessCode(ListOrderDCAccessCodeArgs args) {
        return listOrderDCAccessCode(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListOrderDCAccessCodeResult> listOrderDCAccessCode(ListOrderDCAccessCodeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:listOrderDCAccessCode", TypeShape.of(ListOrderDCAccessCodeResult.class), args, Utilities.withVersion(options));
    }
}