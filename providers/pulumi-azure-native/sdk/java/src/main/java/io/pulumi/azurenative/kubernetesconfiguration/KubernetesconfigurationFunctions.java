// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.GetExtensionArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.GetFluxConfigurationArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.GetSourceControlConfigurationArgs;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.GetExtensionResult;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.GetFluxConfigurationResult;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.GetSourceControlConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KubernetesconfigurationFunctions {
    /**
     * The Extension Instance object.
     * API Version: 2020-07-01-preview.
     * 
     */
    public static CompletableFuture<GetExtensionResult> getExtension(GetExtensionArgs args) {
        return getExtension(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetExtensionResult> getExtension(GetExtensionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kubernetesconfiguration:getExtension", TypeShape.of(GetExtensionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Flux Configuration object returned in Get & Put response.
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetFluxConfigurationResult> getFluxConfiguration(GetFluxConfigurationArgs args) {
        return getFluxConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFluxConfigurationResult> getFluxConfiguration(GetFluxConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kubernetesconfiguration:getFluxConfiguration", TypeShape.of(GetFluxConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The SourceControl Configuration object returned in Get & Put response.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetSourceControlConfigurationResult> getSourceControlConfiguration(GetSourceControlConfigurationArgs args) {
        return getSourceControlConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSourceControlConfigurationResult> getSourceControlConfiguration(GetSourceControlConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kubernetesconfiguration:getSourceControlConfiguration", TypeShape.of(GetSourceControlConfigurationResult.class), args, Utilities.withVersion(options));
    }
}