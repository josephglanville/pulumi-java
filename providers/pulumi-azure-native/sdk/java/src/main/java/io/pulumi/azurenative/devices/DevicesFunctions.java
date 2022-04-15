// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.inputs.GetCertificateArgs;
import io.pulumi.azurenative.devices.inputs.GetDpsCertificateArgs;
import io.pulumi.azurenative.devices.inputs.GetIotDpsResourceArgs;
import io.pulumi.azurenative.devices.inputs.GetIotDpsResourcePrivateEndpointConnectionArgs;
import io.pulumi.azurenative.devices.inputs.GetIotHubResourceArgs;
import io.pulumi.azurenative.devices.inputs.GetIotHubResourceEventHubConsumerGroupArgs;
import io.pulumi.azurenative.devices.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.devices.inputs.ListIotDpsResourceKeysArgs;
import io.pulumi.azurenative.devices.inputs.ListIotDpsResourceKeysForKeyNameArgs;
import io.pulumi.azurenative.devices.inputs.ListIotHubResourceKeysArgs;
import io.pulumi.azurenative.devices.inputs.ListIotHubResourceKeysForKeyNameArgs;
import io.pulumi.azurenative.devices.outputs.GetCertificateResult;
import io.pulumi.azurenative.devices.outputs.GetDpsCertificateResult;
import io.pulumi.azurenative.devices.outputs.GetIotDpsResourcePrivateEndpointConnectionResult;
import io.pulumi.azurenative.devices.outputs.GetIotDpsResourceResult;
import io.pulumi.azurenative.devices.outputs.GetIotHubResourceEventHubConsumerGroupResult;
import io.pulumi.azurenative.devices.outputs.GetIotHubResourceResult;
import io.pulumi.azurenative.devices.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.devices.outputs.ListIotDpsResourceKeysForKeyNameResult;
import io.pulumi.azurenative.devices.outputs.ListIotDpsResourceKeysResult;
import io.pulumi.azurenative.devices.outputs.ListIotHubResourceKeysForKeyNameResult;
import io.pulumi.azurenative.devices.outputs.ListIotHubResourceKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DevicesFunctions {
    /**
     * The X509 Certificate.
     * API Version: 2020-08-31.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The X509 Certificate.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetDpsCertificateResult> getDpsCertificate(GetDpsCertificateArgs args) {
        return getDpsCertificate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDpsCertificateResult> getDpsCertificate(GetDpsCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getDpsCertificate", TypeShape.of(GetDpsCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the provisioning service.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetIotDpsResourceResult> getIotDpsResource(GetIotDpsResourceArgs args) {
        return getIotDpsResource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIotDpsResourceResult> getIotDpsResource(GetIotDpsResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotDpsResource", TypeShape.of(GetIotDpsResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The private endpoint connection of a provisioning service
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetIotDpsResourcePrivateEndpointConnectionResult> getIotDpsResourcePrivateEndpointConnection(GetIotDpsResourcePrivateEndpointConnectionArgs args) {
        return getIotDpsResourcePrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIotDpsResourcePrivateEndpointConnectionResult> getIotDpsResourcePrivateEndpointConnection(GetIotDpsResourcePrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotDpsResourcePrivateEndpointConnection", TypeShape.of(GetIotDpsResourcePrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the IoT hub.
     * API Version: 2020-08-31.
     * 
     */
    public static CompletableFuture<GetIotHubResourceResult> getIotHubResource(GetIotHubResourceArgs args) {
        return getIotHubResource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIotHubResourceResult> getIotHubResource(GetIotHubResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotHubResource", TypeShape.of(GetIotHubResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The properties of the EventHubConsumerGroupInfo object.
     * API Version: 2020-08-31.
     * 
     */
    public static CompletableFuture<GetIotHubResourceEventHubConsumerGroupResult> getIotHubResourceEventHubConsumerGroup(GetIotHubResourceEventHubConsumerGroupArgs args) {
        return getIotHubResourceEventHubConsumerGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIotHubResourceEventHubConsumerGroupResult> getIotHubResourceEventHubConsumerGroup(GetIotHubResourceEventHubConsumerGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getIotHubResourceEventHubConsumerGroup", TypeShape.of(GetIotHubResourceEventHubConsumerGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The private endpoint connection of an IotHub
     * API Version: 2020-08-31.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * List of shared access keys.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<ListIotDpsResourceKeysResult> listIotDpsResourceKeys(ListIotDpsResourceKeysArgs args) {
        return listIotDpsResourceKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListIotDpsResourceKeysResult> listIotDpsResourceKeys(ListIotDpsResourceKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:listIotDpsResourceKeys", TypeShape.of(ListIotDpsResourceKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of the shared access key.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<ListIotDpsResourceKeysForKeyNameResult> listIotDpsResourceKeysForKeyName(ListIotDpsResourceKeysForKeyNameArgs args) {
        return listIotDpsResourceKeysForKeyName(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListIotDpsResourceKeysForKeyNameResult> listIotDpsResourceKeysForKeyName(ListIotDpsResourceKeysForKeyNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:listIotDpsResourceKeysForKeyName", TypeShape.of(ListIotDpsResourceKeysForKeyNameResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of shared access policies with a next link.
     * API Version: 2020-08-31.
     * 
     */
    public static CompletableFuture<ListIotHubResourceKeysResult> listIotHubResourceKeys(ListIotHubResourceKeysArgs args) {
        return listIotHubResourceKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListIotHubResourceKeysResult> listIotHubResourceKeys(ListIotHubResourceKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:listIotHubResourceKeys", TypeShape.of(ListIotHubResourceKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The properties of an IoT hub shared access policy.
     * API Version: 2020-08-31.
     * 
     */
    public static CompletableFuture<ListIotHubResourceKeysForKeyNameResult> listIotHubResourceKeysForKeyName(ListIotHubResourceKeysForKeyNameArgs args) {
        return listIotHubResourceKeysForKeyName(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListIotHubResourceKeysForKeyNameResult> listIotHubResourceKeysForKeyName(ListIotHubResourceKeysForKeyNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:listIotHubResourceKeysForKeyName", TypeShape.of(ListIotHubResourceKeysForKeyNameResult.class), args, Utilities.withVersion(options));
    }
}