// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetArtifactSourceArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetCustomImageArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetDiskArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetEnvironmentArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetFormulaArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetGlobalScheduleArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetLabArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetNotificationChannelArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetPolicyArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetScheduleArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetSecretArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetServiceFabricArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetServiceFabricScheduleArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetServiceRunnerArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetUserArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetVirtualMachineArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetVirtualMachineRdpFileContentsArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetVirtualMachineScheduleArgs;
import io.pulumi.azurenative.devtestlab.inputs.GetVirtualNetworkArgs;
import io.pulumi.azurenative.devtestlab.inputs.ListLabVhdsArgs;
import io.pulumi.azurenative.devtestlab.inputs.ListScheduleApplicableArgs;
import io.pulumi.azurenative.devtestlab.inputs.ListServiceFabricApplicableSchedulesArgs;
import io.pulumi.azurenative.devtestlab.inputs.ListVirtualMachineApplicableSchedulesArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetArtifactSourceResult;
import io.pulumi.azurenative.devtestlab.outputs.GetCustomImageResult;
import io.pulumi.azurenative.devtestlab.outputs.GetDiskResult;
import io.pulumi.azurenative.devtestlab.outputs.GetEnvironmentResult;
import io.pulumi.azurenative.devtestlab.outputs.GetFormulaResult;
import io.pulumi.azurenative.devtestlab.outputs.GetGlobalScheduleResult;
import io.pulumi.azurenative.devtestlab.outputs.GetLabResult;
import io.pulumi.azurenative.devtestlab.outputs.GetNotificationChannelResult;
import io.pulumi.azurenative.devtestlab.outputs.GetPolicyResult;
import io.pulumi.azurenative.devtestlab.outputs.GetScheduleResult;
import io.pulumi.azurenative.devtestlab.outputs.GetSecretResult;
import io.pulumi.azurenative.devtestlab.outputs.GetServiceFabricResult;
import io.pulumi.azurenative.devtestlab.outputs.GetServiceFabricScheduleResult;
import io.pulumi.azurenative.devtestlab.outputs.GetServiceRunnerResult;
import io.pulumi.azurenative.devtestlab.outputs.GetUserResult;
import io.pulumi.azurenative.devtestlab.outputs.GetVirtualMachineRdpFileContentsResult;
import io.pulumi.azurenative.devtestlab.outputs.GetVirtualMachineResult;
import io.pulumi.azurenative.devtestlab.outputs.GetVirtualMachineScheduleResult;
import io.pulumi.azurenative.devtestlab.outputs.GetVirtualNetworkResult;
import io.pulumi.azurenative.devtestlab.outputs.ListLabVhdsResult;
import io.pulumi.azurenative.devtestlab.outputs.ListScheduleApplicableResult;
import io.pulumi.azurenative.devtestlab.outputs.ListServiceFabricApplicableSchedulesResult;
import io.pulumi.azurenative.devtestlab.outputs.ListVirtualMachineApplicableSchedulesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DevtestlabFunctions {
    /**
     * Properties of an artifact source.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetArtifactSourceResult> getArtifactSource(GetArtifactSourceArgs args) {
        return getArtifactSource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetArtifactSourceResult> getArtifactSource(GetArtifactSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getArtifactSource", TypeShape.of(GetArtifactSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A custom image.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetCustomImageResult> getCustomImage(GetCustomImageArgs args) {
        return getCustomImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCustomImageResult> getCustomImage(GetCustomImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getCustomImage", TypeShape.of(GetCustomImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Disk.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetDiskResult> getDisk(GetDiskArgs args) {
        return getDisk(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDiskResult> getDisk(GetDiskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getDisk", TypeShape.of(GetDiskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An environment, which is essentially an ARM template deployment.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A formula for creating a VM, specifying an image base and other parameters
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetFormulaResult> getFormula(GetFormulaArgs args) {
        return getFormula(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFormulaResult> getFormula(GetFormulaArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getFormula", TypeShape.of(GetFormulaResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A schedule.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetGlobalScheduleResult> getGlobalSchedule(GetGlobalScheduleArgs args) {
        return getGlobalSchedule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGlobalScheduleResult> getGlobalSchedule(GetGlobalScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getGlobalSchedule", TypeShape.of(GetGlobalScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A lab.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetLabResult> getLab(GetLabArgs args) {
        return getLab(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLabResult> getLab(GetLabArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getLab", TypeShape.of(GetLabResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A notification.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args) {
        return getNotificationChannel(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getNotificationChannel", TypeShape.of(GetNotificationChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Policy.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicy(GetPolicyArgs args) {
        return getPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPolicyResult> getPolicy(GetPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getPolicy", TypeShape.of(GetPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A schedule.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetScheduleResult> getSchedule(GetScheduleArgs args) {
        return getSchedule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetScheduleResult> getSchedule(GetScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getSchedule", TypeShape.of(GetScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A secret.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Service Fabric.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetServiceFabricResult> getServiceFabric(GetServiceFabricArgs args) {
        return getServiceFabric(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceFabricResult> getServiceFabric(GetServiceFabricArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getServiceFabric", TypeShape.of(GetServiceFabricResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A schedule.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetServiceFabricScheduleResult> getServiceFabricSchedule(GetServiceFabricScheduleArgs args) {
        return getServiceFabricSchedule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceFabricScheduleResult> getServiceFabricSchedule(GetServiceFabricScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getServiceFabricSchedule", TypeShape.of(GetServiceFabricScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A container for a managed identity to execute DevTest lab services.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetServiceRunnerResult> getServiceRunner(GetServiceRunnerArgs args) {
        return getServiceRunner(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceRunnerResult> getServiceRunner(GetServiceRunnerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getServiceRunner", TypeShape.of(GetServiceRunnerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Profile of a lab user.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A virtual machine.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args) {
        return getVirtualMachine(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getVirtualMachine", TypeShape.of(GetVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a .rdp file
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetVirtualMachineRdpFileContentsResult> getVirtualMachineRdpFileContents(GetVirtualMachineRdpFileContentsArgs args) {
        return getVirtualMachineRdpFileContents(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualMachineRdpFileContentsResult> getVirtualMachineRdpFileContents(GetVirtualMachineRdpFileContentsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getVirtualMachineRdpFileContents", TypeShape.of(GetVirtualMachineRdpFileContentsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A schedule.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScheduleResult> getVirtualMachineSchedule(GetVirtualMachineScheduleArgs args) {
        return getVirtualMachineSchedule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualMachineScheduleResult> getVirtualMachineSchedule(GetVirtualMachineScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getVirtualMachineSchedule", TypeShape.of(GetVirtualMachineScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A virtual network.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<GetVirtualNetworkResult> getVirtualNetwork(GetVirtualNetworkArgs args) {
        return getVirtualNetwork(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualNetworkResult> getVirtualNetwork(GetVirtualNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getVirtualNetwork", TypeShape.of(GetVirtualNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of a list operation.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<ListLabVhdsResult> listLabVhds(ListLabVhdsArgs args) {
        return listLabVhds(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListLabVhdsResult> listLabVhds(ListLabVhdsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:listLabVhds", TypeShape.of(ListLabVhdsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of a list operation.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<ListScheduleApplicableResult> listScheduleApplicable(ListScheduleApplicableArgs args) {
        return listScheduleApplicable(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListScheduleApplicableResult> listScheduleApplicable(ListScheduleApplicableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:listScheduleApplicable", TypeShape.of(ListScheduleApplicableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Schedules applicable to a virtual machine. The schedules may have been defined on a VM or on lab level.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<ListServiceFabricApplicableSchedulesResult> listServiceFabricApplicableSchedules(ListServiceFabricApplicableSchedulesArgs args) {
        return listServiceFabricApplicableSchedules(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListServiceFabricApplicableSchedulesResult> listServiceFabricApplicableSchedules(ListServiceFabricApplicableSchedulesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:listServiceFabricApplicableSchedules", TypeShape.of(ListServiceFabricApplicableSchedulesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Schedules applicable to a virtual machine. The schedules may have been defined on a VM or on lab level.
     * API Version: 2018-09-15.
     * 
     */
    public static CompletableFuture<ListVirtualMachineApplicableSchedulesResult> listVirtualMachineApplicableSchedules(ListVirtualMachineApplicableSchedulesArgs args) {
        return listVirtualMachineApplicableSchedules(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListVirtualMachineApplicableSchedulesResult> listVirtualMachineApplicableSchedules(ListVirtualMachineApplicableSchedulesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:listVirtualMachineApplicableSchedules", TypeShape.of(ListVirtualMachineApplicableSchedulesResult.class), args, Utilities.withVersion(options));
    }
}
