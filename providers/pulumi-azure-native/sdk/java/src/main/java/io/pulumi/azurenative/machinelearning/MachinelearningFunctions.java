// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearning.inputs.GetCommitmentPlanArgs;
import io.pulumi.azurenative.machinelearning.inputs.GetWebServiceArgs;
import io.pulumi.azurenative.machinelearning.inputs.GetWorkspaceArgs;
import io.pulumi.azurenative.machinelearning.inputs.ListWorkspaceKeysArgs;
import io.pulumi.azurenative.machinelearning.outputs.GetCommitmentPlanResult;
import io.pulumi.azurenative.machinelearning.outputs.GetWebServiceResult;
import io.pulumi.azurenative.machinelearning.outputs.GetWorkspaceResult;
import io.pulumi.azurenative.machinelearning.outputs.ListWorkspaceKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MachinelearningFunctions {
    /**
     * An Azure ML commitment plan resource.
     * API Version: 2016-05-01-preview.
     * 
     */
    public static CompletableFuture<GetCommitmentPlanResult> getCommitmentPlan(GetCommitmentPlanArgs args) {
        return getCommitmentPlan(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCommitmentPlanResult> getCommitmentPlan(GetCommitmentPlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:getCommitmentPlan", TypeShape.of(GetCommitmentPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Instance of an Azure ML web service resource.
     * API Version: 2017-01-01.
     * 
     */
    public static CompletableFuture<GetWebServiceResult> getWebService(GetWebServiceArgs args) {
        return getWebService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWebServiceResult> getWebService(GetWebServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:getWebService", TypeShape.of(GetWebServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a machine learning workspace.
     * API Version: 2016-04-01.
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Workspace authorization keys for a workspace.
     * API Version: 2016-04-01.
     * 
     */
    public static CompletableFuture<ListWorkspaceKeysResult> listWorkspaceKeys(ListWorkspaceKeysArgs args) {
        return listWorkspaceKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListWorkspaceKeysResult> listWorkspaceKeys(ListWorkspaceKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:listWorkspaceKeys", TypeShape.of(ListWorkspaceKeysResult.class), args, Utilities.withVersion(options));
    }
}