// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.keyvault.inputs.GetKeyArgs;
import io.pulumi.azurenative.keyvault.inputs.GetMHSMPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.keyvault.inputs.GetManagedHsmArgs;
import io.pulumi.azurenative.keyvault.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.keyvault.inputs.GetSecretArgs;
import io.pulumi.azurenative.keyvault.inputs.GetVaultArgs;
import io.pulumi.azurenative.keyvault.outputs.GetKeyResult;
import io.pulumi.azurenative.keyvault.outputs.GetMHSMPrivateEndpointConnectionResult;
import io.pulumi.azurenative.keyvault.outputs.GetManagedHsmResult;
import io.pulumi.azurenative.keyvault.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.keyvault.outputs.GetSecretResult;
import io.pulumi.azurenative.keyvault.outputs.GetVaultResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KeyvaultFunctions {
    /**
     * The key resource.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetMHSMPrivateEndpointConnectionResult> getMHSMPrivateEndpointConnection(GetMHSMPrivateEndpointConnectionArgs args) {
        return getMHSMPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMHSMPrivateEndpointConnectionResult> getMHSMPrivateEndpointConnection(GetMHSMPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getMHSMPrivateEndpointConnection", TypeShape.of(GetMHSMPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedHsmResult> getManagedHsm(GetManagedHsmArgs args) {
        return getManagedHsm(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetManagedHsmResult> getManagedHsm(GetManagedHsmArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getManagedHsm", TypeShape.of(GetManagedHsmResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetVaultResult> getVault(GetVaultArgs args) {
        return getVault(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVaultResult> getVault(GetVaultArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getVault", TypeShape.of(GetVaultResult.class), args, Utilities.withVersion(options));
    }
}
