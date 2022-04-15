// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetAgentPoolArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetBuildLogLinkArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetConnectedRegistryArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetExportPipelineArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetImportPipelineArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetPipelineRunArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetRegistryArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetRegistryBuildSourceUploadUrlArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetRegistryCredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetReplicationArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetScopeMapArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetTaskArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetTaskRunArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetTokenArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetWebhookArgs;
import io.pulumi.azurenative.containerregistry.inputs.GetWebhookCallbackConfigArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListAgentPoolQueueStatusArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListBuildStepBuildArgumentsArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListBuildTaskSourceRepositoryPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListRegistryBuildSourceUploadUrlArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListRegistryCredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListRunLogSasUrlArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListTaskDetailsArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListTaskRunDetailsArgs;
import io.pulumi.azurenative.containerregistry.inputs.ListWebhookEventsArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetAgentPoolResult;
import io.pulumi.azurenative.containerregistry.outputs.GetBuildLogLinkResult;
import io.pulumi.azurenative.containerregistry.outputs.GetConnectedRegistryResult;
import io.pulumi.azurenative.containerregistry.outputs.GetExportPipelineResult;
import io.pulumi.azurenative.containerregistry.outputs.GetImportPipelineResult;
import io.pulumi.azurenative.containerregistry.outputs.GetPipelineRunResult;
import io.pulumi.azurenative.containerregistry.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.containerregistry.outputs.GetRegistryBuildSourceUploadUrlResult;
import io.pulumi.azurenative.containerregistry.outputs.GetRegistryCredentialsResult;
import io.pulumi.azurenative.containerregistry.outputs.GetRegistryResult;
import io.pulumi.azurenative.containerregistry.outputs.GetReplicationResult;
import io.pulumi.azurenative.containerregistry.outputs.GetScopeMapResult;
import io.pulumi.azurenative.containerregistry.outputs.GetTaskResult;
import io.pulumi.azurenative.containerregistry.outputs.GetTaskRunResult;
import io.pulumi.azurenative.containerregistry.outputs.GetTokenResult;
import io.pulumi.azurenative.containerregistry.outputs.GetWebhookCallbackConfigResult;
import io.pulumi.azurenative.containerregistry.outputs.GetWebhookResult;
import io.pulumi.azurenative.containerregistry.outputs.ListAgentPoolQueueStatusResult;
import io.pulumi.azurenative.containerregistry.outputs.ListBuildStepBuildArgumentsResult;
import io.pulumi.azurenative.containerregistry.outputs.ListBuildTaskSourceRepositoryPropertiesResult;
import io.pulumi.azurenative.containerregistry.outputs.ListRegistryBuildSourceUploadUrlResult;
import io.pulumi.azurenative.containerregistry.outputs.ListRegistryCredentialsResult;
import io.pulumi.azurenative.containerregistry.outputs.ListRunLogSasUrlResult;
import io.pulumi.azurenative.containerregistry.outputs.ListTaskDetailsResult;
import io.pulumi.azurenative.containerregistry.outputs.ListTaskRunDetailsResult;
import io.pulumi.azurenative.containerregistry.outputs.ListWebhookEventsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ContainerregistryFunctions {
    /**
     * The agentpool that has the ARM resource and properties.
     * The agentpool will have all information to create an agent pool.
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetAgentPoolResult> getAgentPool(GetAgentPoolArgs args) {
        return getAgentPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAgentPoolResult> getAgentPool(GetAgentPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getAgentPool", TypeShape.of(GetAgentPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The result of get log link operation.
     * API Version: 2018-02-01-preview.
     * 
     */
    public static CompletableFuture<GetBuildLogLinkResult> getBuildLogLink(GetBuildLogLinkArgs args) {
        return getBuildLogLink(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBuildLogLinkResult> getBuildLogLink(GetBuildLogLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getBuildLogLink", TypeShape.of(GetBuildLogLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a connected registry for a container registry.
     * API Version: 2020-11-01-preview.
     * 
     */
    public static CompletableFuture<GetConnectedRegistryResult> getConnectedRegistry(GetConnectedRegistryArgs args) {
        return getConnectedRegistry(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectedRegistryResult> getConnectedRegistry(GetConnectedRegistryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getConnectedRegistry", TypeShape.of(GetConnectedRegistryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents an export pipeline for a container registry.
     * API Version: 2020-11-01-preview.
     * 
     */
    public static CompletableFuture<GetExportPipelineResult> getExportPipeline(GetExportPipelineArgs args) {
        return getExportPipeline(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetExportPipelineResult> getExportPipeline(GetExportPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getExportPipeline", TypeShape.of(GetExportPipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents an import pipeline for a container registry.
     * API Version: 2020-11-01-preview.
     * 
     */
    public static CompletableFuture<GetImportPipelineResult> getImportPipeline(GetImportPipelineArgs args) {
        return getImportPipeline(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImportPipelineResult> getImportPipeline(GetImportPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getImportPipeline", TypeShape.of(GetImportPipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a pipeline run for a container registry.
     * API Version: 2020-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPipelineRunResult> getPipelineRun(GetPipelineRunArgs args) {
        return getPipelineRun(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPipelineRunResult> getPipelineRun(GetPipelineRunArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getPipelineRun", TypeShape.of(GetPipelineRunResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a private endpoint connection for a container registry.
     * API Version: 2020-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a container registry.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<GetRegistryResult> getRegistry(GetRegistryArgs args) {
        return getRegistry(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistryResult> getRegistry(GetRegistryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getRegistry", TypeShape.of(GetRegistryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The properties of a response to source upload request.
     * API Version: 2018-02-01-preview.
     * 
     */
    public static CompletableFuture<GetRegistryBuildSourceUploadUrlResult> getRegistryBuildSourceUploadUrl(GetRegistryBuildSourceUploadUrlArgs args) {
        return getRegistryBuildSourceUploadUrl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistryBuildSourceUploadUrlResult> getRegistryBuildSourceUploadUrl(GetRegistryBuildSourceUploadUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getRegistryBuildSourceUploadUrl", TypeShape.of(GetRegistryBuildSourceUploadUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The result of a request to get the administrator login credentials for a container registry.
     * API Version: 2016-06-27-preview.
     * 
     */
    public static CompletableFuture<GetRegistryCredentialsResult> getRegistryCredentials(GetRegistryCredentialsArgs args) {
        return getRegistryCredentials(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistryCredentialsResult> getRegistryCredentials(GetRegistryCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getRegistryCredentials", TypeShape.of(GetRegistryCredentialsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a replication for a container registry.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<GetReplicationResult> getReplication(GetReplicationArgs args) {
        return getReplication(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetReplicationResult> getReplication(GetReplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getReplication", TypeShape.of(GetReplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a scope map for a container registry.
     * API Version: 2020-11-01-preview.
     * 
     */
    public static CompletableFuture<GetScopeMapResult> getScopeMap(GetScopeMapArgs args) {
        return getScopeMap(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetScopeMapResult> getScopeMap(GetScopeMapArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getScopeMap", TypeShape.of(GetScopeMapResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The task that has the ARM resource and task properties.
     * The task will have all information to schedule a run against it.
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTask(GetTaskArgs args) {
        return getTask(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTaskResult> getTask(GetTaskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The task run that has the ARM resource and properties.
     * The task run will have the information of request and result of a run.
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetTaskRunResult> getTaskRun(GetTaskRunArgs args) {
        return getTaskRun(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTaskRunResult> getTaskRun(GetTaskRunArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getTaskRun", TypeShape.of(GetTaskRunResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a token for a container registry.
     * API Version: 2020-11-01-preview.
     * 
     */
    public static CompletableFuture<GetTokenResult> getToken(GetTokenArgs args) {
        return getToken(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTokenResult> getToken(GetTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getToken", TypeShape.of(GetTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An object that represents a webhook for a container registry.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<GetWebhookResult> getWebhook(GetWebhookArgs args) {
        return getWebhook(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWebhookResult> getWebhook(GetWebhookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getWebhook", TypeShape.of(GetWebhookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The configuration of service URI and custom headers for the webhook.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<GetWebhookCallbackConfigResult> getWebhookCallbackConfig(GetWebhookCallbackConfigArgs args) {
        return getWebhookCallbackConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWebhookCallbackConfigResult> getWebhookCallbackConfig(GetWebhookCallbackConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getWebhookCallbackConfig", TypeShape.of(GetWebhookCallbackConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The QueueStatus of Agent Pool
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<ListAgentPoolQueueStatusResult> listAgentPoolQueueStatus(ListAgentPoolQueueStatusArgs args) {
        return listAgentPoolQueueStatus(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListAgentPoolQueueStatusResult> listAgentPoolQueueStatus(ListAgentPoolQueueStatusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listAgentPoolQueueStatus", TypeShape.of(ListAgentPoolQueueStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of build arguments for a build step.
     * API Version: 2018-02-01-preview.
     * 
     */
    public static CompletableFuture<ListBuildStepBuildArgumentsResult> listBuildStepBuildArguments(ListBuildStepBuildArgumentsArgs args) {
        return listBuildStepBuildArguments(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListBuildStepBuildArgumentsResult> listBuildStepBuildArguments(ListBuildStepBuildArgumentsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listBuildStepBuildArguments", TypeShape.of(ListBuildStepBuildArgumentsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The properties of the source code repository.
     * API Version: 2018-02-01-preview.
     * 
     */
    public static CompletableFuture<ListBuildTaskSourceRepositoryPropertiesResult> listBuildTaskSourceRepositoryProperties(ListBuildTaskSourceRepositoryPropertiesArgs args) {
        return listBuildTaskSourceRepositoryProperties(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListBuildTaskSourceRepositoryPropertiesResult> listBuildTaskSourceRepositoryProperties(ListBuildTaskSourceRepositoryPropertiesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listBuildTaskSourceRepositoryProperties", TypeShape.of(ListBuildTaskSourceRepositoryPropertiesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The properties of a response to source upload request.
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<ListRegistryBuildSourceUploadUrlResult> listRegistryBuildSourceUploadUrl(ListRegistryBuildSourceUploadUrlArgs args) {
        return listRegistryBuildSourceUploadUrl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListRegistryBuildSourceUploadUrlResult> listRegistryBuildSourceUploadUrl(ListRegistryBuildSourceUploadUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listRegistryBuildSourceUploadUrl", TypeShape.of(ListRegistryBuildSourceUploadUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response from the ListCredentials operation.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<ListRegistryCredentialsResult> listRegistryCredentials(ListRegistryCredentialsArgs args) {
        return listRegistryCredentials(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListRegistryCredentialsResult> listRegistryCredentials(ListRegistryCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listRegistryCredentials", TypeShape.of(ListRegistryCredentialsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The result of get log link operation.
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<ListRunLogSasUrlResult> listRunLogSasUrl(ListRunLogSasUrlArgs args) {
        return listRunLogSasUrl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListRunLogSasUrlResult> listRunLogSasUrl(ListRunLogSasUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listRunLogSasUrl", TypeShape.of(ListRunLogSasUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The task that has the ARM resource and task properties.
     * The task will have all information to schedule a run against it.
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<ListTaskDetailsResult> listTaskDetails(ListTaskDetailsArgs args) {
        return listTaskDetails(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListTaskDetailsResult> listTaskDetails(ListTaskDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listTaskDetails", TypeShape.of(ListTaskDetailsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The task run that has the ARM resource and properties.
     * The task run will have the information of request and result of a run.
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<ListTaskRunDetailsResult> listTaskRunDetails(ListTaskRunDetailsArgs args) {
        return listTaskRunDetails(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListTaskRunDetailsResult> listTaskRunDetails(ListTaskRunDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listTaskRunDetails", TypeShape.of(ListTaskRunDetailsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The result of a request to list events for a webhook.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<ListWebhookEventsResult> listWebhookEvents(ListWebhookEventsArgs args) {
        return listWebhookEvents(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListWebhookEventsResult> listWebhookEvents(ListWebhookEventsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listWebhookEvents", TypeShape.of(ListWebhookEventsResult.class), args, Utilities.withVersion(options));
    }
}