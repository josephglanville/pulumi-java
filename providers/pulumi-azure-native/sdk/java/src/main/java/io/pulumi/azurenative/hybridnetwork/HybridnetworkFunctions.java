// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.inputs.GetDeviceArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.GetNetworkFunctionArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.GetVendorArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.GetVendorSkuPreviewArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.GetVendorSkusArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.ListDeviceRegistrationKeyArgs;
import io.pulumi.azurenative.hybridnetwork.outputs.GetDeviceResult;
import io.pulumi.azurenative.hybridnetwork.outputs.GetNetworkFunctionResult;
import io.pulumi.azurenative.hybridnetwork.outputs.GetVendorResult;
import io.pulumi.azurenative.hybridnetwork.outputs.GetVendorSkuPreviewResult;
import io.pulumi.azurenative.hybridnetwork.outputs.GetVendorSkusResult;
import io.pulumi.azurenative.hybridnetwork.outputs.ListDeviceRegistrationKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class HybridnetworkFunctions {
    /**
     * Device resource.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args) {
        return getDevice(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeviceResult> getDevice(GetDeviceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:getDevice", TypeShape.of(GetDeviceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Network function resource response.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNetworkFunctionResult> getNetworkFunction(GetNetworkFunctionArgs args) {
        return getNetworkFunction(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkFunctionResult> getNetworkFunction(GetNetworkFunctionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:getNetworkFunction", TypeShape.of(GetNetworkFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Vendor resource.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetVendorResult> getVendor(GetVendorArgs args) {
        return getVendor(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVendorResult> getVendor(GetVendorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:getVendor", TypeShape.of(GetVendorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Customer subscription which can use a sku.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetVendorSkuPreviewResult> getVendorSkuPreview(GetVendorSkuPreviewArgs args) {
        return getVendorSkuPreview(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVendorSkuPreviewResult> getVendorSkuPreview(GetVendorSkuPreviewArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:getVendorSkuPreview", TypeShape.of(GetVendorSkuPreviewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Sku sub resource.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetVendorSkusResult> getVendorSkus(GetVendorSkusArgs args) {
        return getVendorSkus(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVendorSkusResult> getVendorSkus(GetVendorSkusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:getVendorSkus", TypeShape.of(GetVendorSkusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The device registration key.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<ListDeviceRegistrationKeyResult> listDeviceRegistrationKey(ListDeviceRegistrationKeyArgs args) {
        return listDeviceRegistrationKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListDeviceRegistrationKeyResult> listDeviceRegistrationKey(ListDeviceRegistrationKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:listDeviceRegistrationKey", TypeShape.of(ListDeviceRegistrationKeyResult.class), args, Utilities.withVersion(options));
    }
}