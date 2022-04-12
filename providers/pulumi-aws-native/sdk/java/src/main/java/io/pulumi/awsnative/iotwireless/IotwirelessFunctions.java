// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.inputs.GetDestinationArgs;
import io.pulumi.awsnative.iotwireless.inputs.GetDeviceProfileArgs;
import io.pulumi.awsnative.iotwireless.inputs.GetFuotaTaskArgs;
import io.pulumi.awsnative.iotwireless.inputs.GetMulticastGroupArgs;
import io.pulumi.awsnative.iotwireless.inputs.GetServiceProfileArgs;
import io.pulumi.awsnative.iotwireless.inputs.GetTaskDefinitionArgs;
import io.pulumi.awsnative.iotwireless.inputs.GetWirelessDeviceArgs;
import io.pulumi.awsnative.iotwireless.inputs.GetWirelessGatewayArgs;
import io.pulumi.awsnative.iotwireless.outputs.GetDestinationResult;
import io.pulumi.awsnative.iotwireless.outputs.GetDeviceProfileResult;
import io.pulumi.awsnative.iotwireless.outputs.GetFuotaTaskResult;
import io.pulumi.awsnative.iotwireless.outputs.GetMulticastGroupResult;
import io.pulumi.awsnative.iotwireless.outputs.GetServiceProfileResult;
import io.pulumi.awsnative.iotwireless.outputs.GetTaskDefinitionResult;
import io.pulumi.awsnative.iotwireless.outputs.GetWirelessDeviceResult;
import io.pulumi.awsnative.iotwireless.outputs.GetWirelessGatewayResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IotwirelessFunctions {
    /**
     * Destination's resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetDestinationResult> getDestination(GetDestinationArgs args) {
        return getDestination(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDestinationResult> getDestination(GetDestinationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getDestination", TypeShape.of(GetDestinationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Device Profile's resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetDeviceProfileResult> getDeviceProfile(GetDeviceProfileArgs args) {
        return getDeviceProfile(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeviceProfileResult> getDeviceProfile(GetDeviceProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getDeviceProfile", TypeShape.of(GetDeviceProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Create and manage FUOTA tasks.
     * 
     */
    public static CompletableFuture<GetFuotaTaskResult> getFuotaTask(GetFuotaTaskArgs args) {
        return getFuotaTask(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFuotaTaskResult> getFuotaTask(GetFuotaTaskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getFuotaTask", TypeShape.of(GetFuotaTaskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Create and manage Multicast groups.
     * 
     */
    public static CompletableFuture<GetMulticastGroupResult> getMulticastGroup(GetMulticastGroupArgs args) {
        return getMulticastGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMulticastGroupResult> getMulticastGroup(GetMulticastGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getMulticastGroup", TypeShape.of(GetMulticastGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetServiceProfileResult> getServiceProfile(GetServiceProfileArgs args) {
        return getServiceProfile(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceProfileResult> getServiceProfile(GetServiceProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getServiceProfile", TypeShape.of(GetServiceProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Creates a gateway task definition.
     * 
     */
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args) {
        return getTaskDefinition(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getTaskDefinition", TypeShape.of(GetTaskDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Create and manage wireless gateways, including LoRa gateways.
     * 
     */
    public static CompletableFuture<GetWirelessDeviceResult> getWirelessDevice(GetWirelessDeviceArgs args) {
        return getWirelessDevice(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWirelessDeviceResult> getWirelessDevice(GetWirelessDeviceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getWirelessDevice", TypeShape.of(GetWirelessDeviceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Create and manage wireless gateways, including LoRa gateways.
     * 
     */
    public static CompletableFuture<GetWirelessGatewayResult> getWirelessGateway(GetWirelessGatewayArgs args) {
        return getWirelessGateway(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWirelessGatewayResult> getWirelessGateway(GetWirelessGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getWirelessGateway", TypeShape.of(GetWirelessGatewayResult.class), args, Utilities.withVersion(options));
    }
}
