// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.inputs.GetConnectorArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetConnectorMappingArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetHubArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetImageUploadUrlForDataArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetImageUploadUrlForEntityTypeArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetKpiArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetLinkArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetPredictionArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetPredictionModelStatusArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetPredictionTrainingResultsArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetProfileArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetRelationshipArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetRelationshipLinkArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetRoleAssignmentArgs;
import io.pulumi.azurenative.customerinsights.inputs.GetViewArgs;
import io.pulumi.azurenative.customerinsights.outputs.GetConnectorMappingResult;
import io.pulumi.azurenative.customerinsights.outputs.GetConnectorResult;
import io.pulumi.azurenative.customerinsights.outputs.GetHubResult;
import io.pulumi.azurenative.customerinsights.outputs.GetImageUploadUrlForDataResult;
import io.pulumi.azurenative.customerinsights.outputs.GetImageUploadUrlForEntityTypeResult;
import io.pulumi.azurenative.customerinsights.outputs.GetKpiResult;
import io.pulumi.azurenative.customerinsights.outputs.GetLinkResult;
import io.pulumi.azurenative.customerinsights.outputs.GetPredictionModelStatusResult;
import io.pulumi.azurenative.customerinsights.outputs.GetPredictionResult;
import io.pulumi.azurenative.customerinsights.outputs.GetPredictionTrainingResultsResult;
import io.pulumi.azurenative.customerinsights.outputs.GetProfileResult;
import io.pulumi.azurenative.customerinsights.outputs.GetRelationshipLinkResult;
import io.pulumi.azurenative.customerinsights.outputs.GetRelationshipResult;
import io.pulumi.azurenative.customerinsights.outputs.GetRoleAssignmentResult;
import io.pulumi.azurenative.customerinsights.outputs.GetViewResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CustomerinsightsFunctions {
    /**
     * The connector resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetConnectorResult> getConnector(GetConnectorArgs args) {
        return getConnector(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectorResult> getConnector(GetConnectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getConnector", TypeShape.of(GetConnectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The connector mapping resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetConnectorMappingResult> getConnectorMapping(GetConnectorMappingArgs args) {
        return getConnectorMapping(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectorMappingResult> getConnectorMapping(GetConnectorMappingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getConnectorMapping", TypeShape.of(GetConnectorMappingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Hub resource.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetHubResult> getHub(GetHubArgs args) {
        return getHub(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetHubResult> getHub(GetHubArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getHub", TypeShape.of(GetHubResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The image definition.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetImageUploadUrlForDataResult> getImageUploadUrlForData(GetImageUploadUrlForDataArgs args) {
        return getImageUploadUrlForData(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageUploadUrlForDataResult> getImageUploadUrlForData(GetImageUploadUrlForDataArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getImageUploadUrlForData", TypeShape.of(GetImageUploadUrlForDataResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The image definition.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetImageUploadUrlForEntityTypeResult> getImageUploadUrlForEntityType(GetImageUploadUrlForEntityTypeArgs args) {
        return getImageUploadUrlForEntityType(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageUploadUrlForEntityTypeResult> getImageUploadUrlForEntityType(GetImageUploadUrlForEntityTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getImageUploadUrlForEntityType", TypeShape.of(GetImageUploadUrlForEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The KPI resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetKpiResult> getKpi(GetKpiArgs args) {
        return getKpi(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKpiResult> getKpi(GetKpiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getKpi", TypeShape.of(GetKpiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The link resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetLinkResult> getLink(GetLinkArgs args) {
        return getLink(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLinkResult> getLink(GetLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getLink", TypeShape.of(GetLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The prediction resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetPredictionResult> getPrediction(GetPredictionArgs args) {
        return getPrediction(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPredictionResult> getPrediction(GetPredictionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getPrediction", TypeShape.of(GetPredictionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The prediction model status.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetPredictionModelStatusResult> getPredictionModelStatus(GetPredictionModelStatusArgs args) {
        return getPredictionModelStatus(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPredictionModelStatusResult> getPredictionModelStatus(GetPredictionModelStatusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getPredictionModelStatus", TypeShape.of(GetPredictionModelStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The training results of the prediction.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetPredictionTrainingResultsResult> getPredictionTrainingResults(GetPredictionTrainingResultsArgs args) {
        return getPredictionTrainingResults(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPredictionTrainingResultsResult> getPredictionTrainingResults(GetPredictionTrainingResultsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getPredictionTrainingResults", TypeShape.of(GetPredictionTrainingResultsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The profile resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetProfileResult> getProfile(GetProfileArgs args) {
        return getProfile(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProfileResult> getProfile(GetProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getProfile", TypeShape.of(GetProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The relationship resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetRelationshipResult> getRelationship(GetRelationshipArgs args) {
        return getRelationship(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRelationshipResult> getRelationship(GetRelationshipArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getRelationship", TypeShape.of(GetRelationshipResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The relationship link resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetRelationshipLinkResult> getRelationshipLink(GetRelationshipLinkArgs args) {
        return getRelationshipLink(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRelationshipLinkResult> getRelationshipLink(GetRelationshipLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getRelationshipLink", TypeShape.of(GetRelationshipLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Role Assignment resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetRoleAssignmentResult> getRoleAssignment(GetRoleAssignmentArgs args) {
        return getRoleAssignment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRoleAssignmentResult> getRoleAssignment(GetRoleAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getRoleAssignment", TypeShape.of(GetRoleAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The view resource format.
     * API Version: 2017-04-26.
     * 
     */
    public static CompletableFuture<GetViewResult> getView(GetViewArgs args) {
        return getView(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetViewResult> getView(GetViewArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getView", TypeShape.of(GetViewResult.class), args, Utilities.withVersion(options));
    }
}
