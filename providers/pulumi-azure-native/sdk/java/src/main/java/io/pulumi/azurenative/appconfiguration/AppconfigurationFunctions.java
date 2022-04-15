// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appconfiguration.inputs.GetConfigurationStoreArgs;
import io.pulumi.azurenative.appconfiguration.inputs.GetKeyValueArgs;
import io.pulumi.azurenative.appconfiguration.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.appconfiguration.inputs.ListConfigurationStoreKeyValueArgs;
import io.pulumi.azurenative.appconfiguration.inputs.ListConfigurationStoreKeysArgs;
import io.pulumi.azurenative.appconfiguration.outputs.GetConfigurationStoreResult;
import io.pulumi.azurenative.appconfiguration.outputs.GetKeyValueResult;
import io.pulumi.azurenative.appconfiguration.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.appconfiguration.outputs.ListConfigurationStoreKeyValueResult;
import io.pulumi.azurenative.appconfiguration.outputs.ListConfigurationStoreKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppconfigurationFunctions {
    /**
     * The configuration store along with all resource properties. The Configuration Store will have all information to begin utilizing it.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetConfigurationStoreResult> getConfigurationStore(GetConfigurationStoreArgs args) {
        return getConfigurationStore(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConfigurationStoreResult> getConfigurationStore(GetConfigurationStoreArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appconfiguration:getConfigurationStore", TypeShape.of(GetConfigurationStoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The key-value resource along with all resource properties.
     * API Version: 2020-07-01-preview.
     * 
     */
    public static CompletableFuture<GetKeyValueResult> getKeyValue(GetKeyValueArgs args) {
        return getKeyValue(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyValueResult> getKeyValue(GetKeyValueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appconfiguration:getKeyValue", TypeShape.of(GetKeyValueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appconfiguration:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The result of a request to retrieve a key-value from the specified configuration store.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListConfigurationStoreKeyValueResult> listConfigurationStoreKeyValue(ListConfigurationStoreKeyValueArgs args) {
        return listConfigurationStoreKeyValue(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListConfigurationStoreKeyValueResult> listConfigurationStoreKeyValue(ListConfigurationStoreKeyValueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appconfiguration:listConfigurationStoreKeyValue", TypeShape.of(ListConfigurationStoreKeyValueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The result of a request to list API keys.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListConfigurationStoreKeysResult> listConfigurationStoreKeys(ListConfigurationStoreKeysArgs args) {
        return listConfigurationStoreKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListConfigurationStoreKeysResult> listConfigurationStoreKeys(ListConfigurationStoreKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appconfiguration:listConfigurationStoreKeys", TypeShape.of(ListConfigurationStoreKeysResult.class), args, Utilities.withVersion(options));
    }
}