// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.delegatednetwork.inputs.GetControllerDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.inputs.GetDelegatedSubnetServiceDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.inputs.GetOrchestratorInstanceServiceDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.outputs.GetControllerDetailsResult;
import io.pulumi.azurenative.delegatednetwork.outputs.GetDelegatedSubnetServiceDetailsResult;
import io.pulumi.azurenative.delegatednetwork.outputs.GetOrchestratorInstanceServiceDetailsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DelegatednetworkFunctions {
    /**
     * Represents an instance of a DNC controller.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetControllerDetailsResult> getControllerDetails(GetControllerDetailsArgs args) {
        return getControllerDetails(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetControllerDetailsResult> getControllerDetails(GetControllerDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getControllerDetails", TypeShape.of(GetControllerDetailsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an instance of a orchestrator.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetDelegatedSubnetServiceDetailsResult> getDelegatedSubnetServiceDetails(GetDelegatedSubnetServiceDetailsArgs args) {
        return getDelegatedSubnetServiceDetails(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDelegatedSubnetServiceDetailsResult> getDelegatedSubnetServiceDetails(GetDelegatedSubnetServiceDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getDelegatedSubnetServiceDetails", TypeShape.of(GetDelegatedSubnetServiceDetailsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an instance of a orchestrator.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetOrchestratorInstanceServiceDetailsResult> getOrchestratorInstanceServiceDetails(GetOrchestratorInstanceServiceDetailsArgs args) {
        return getOrchestratorInstanceServiceDetails(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrchestratorInstanceServiceDetailsResult> getOrchestratorInstanceServiceDetails(GetOrchestratorInstanceServiceDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getOrchestratorInstanceServiceDetails", TypeShape.of(GetOrchestratorInstanceServiceDetailsResult.class), args, Utilities.withVersion(options));
    }
}
