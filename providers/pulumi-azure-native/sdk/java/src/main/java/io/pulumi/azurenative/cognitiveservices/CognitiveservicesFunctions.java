// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cognitiveservices.inputs.GetAccountArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.GetCommitmentPlanArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.GetDeploymentArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.ListAccountKeysArgs;
import io.pulumi.azurenative.cognitiveservices.outputs.GetAccountResult;
import io.pulumi.azurenative.cognitiveservices.outputs.GetCommitmentPlanResult;
import io.pulumi.azurenative.cognitiveservices.outputs.GetDeploymentResult;
import io.pulumi.azurenative.cognitiveservices.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.cognitiveservices.outputs.ListAccountKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CognitiveservicesFunctions {
    /**
     * Cognitive Services Account is an Azure resource representing the provisioned account, its type, location and SKU.
     * API Version: 2017-04-18.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cognitiveservices:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Cognitive Services account commitment plan.
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetCommitmentPlanResult> getCommitmentPlan(GetCommitmentPlanArgs args) {
        return getCommitmentPlan(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCommitmentPlanResult> getCommitmentPlan(GetCommitmentPlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cognitiveservices:getCommitmentPlan", TypeShape.of(GetCommitmentPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Cognitive Services account deployment.
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args) {
        return getDeployment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cognitiveservices:getDeployment", TypeShape.of(GetDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2017-04-18.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cognitiveservices:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The access keys for the cognitive services account.
     * API Version: 2017-04-18.
     * 
     */
    public static CompletableFuture<ListAccountKeysResult> listAccountKeys(ListAccountKeysArgs args) {
        return listAccountKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListAccountKeysResult> listAccountKeys(ListAccountKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cognitiveservices:listAccountKeys", TypeShape.of(ListAccountKeysResult.class), args, Utilities.withVersion(options));
    }
}
