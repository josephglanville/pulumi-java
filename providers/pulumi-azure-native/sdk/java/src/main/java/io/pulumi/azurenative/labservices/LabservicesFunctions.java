// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.inputs.GetEnvironmentArgs;
import io.pulumi.azurenative.labservices.inputs.GetEnvironmentSettingArgs;
import io.pulumi.azurenative.labservices.inputs.GetGalleryImageArgs;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserEnvironmentArgs;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationBatchStatusArgs;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationStatusArgs;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserPersonalPreferencesArgs;
import io.pulumi.azurenative.labservices.inputs.GetLabAccountArgs;
import io.pulumi.azurenative.labservices.inputs.GetLabAccountRegionalAvailabilityArgs;
import io.pulumi.azurenative.labservices.inputs.GetLabArgs;
import io.pulumi.azurenative.labservices.inputs.GetLabPlanArgs;
import io.pulumi.azurenative.labservices.inputs.GetScheduleArgs;
import io.pulumi.azurenative.labservices.inputs.GetUserArgs;
import io.pulumi.azurenative.labservices.inputs.ListGlobalUserEnvironmentsArgs;
import io.pulumi.azurenative.labservices.inputs.ListGlobalUserLabsArgs;
import io.pulumi.azurenative.labservices.outputs.GetEnvironmentResult;
import io.pulumi.azurenative.labservices.outputs.GetEnvironmentSettingResult;
import io.pulumi.azurenative.labservices.outputs.GetGalleryImageResult;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserEnvironmentResult;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserOperationBatchStatusResult;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserOperationStatusResult;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserPersonalPreferencesResult;
import io.pulumi.azurenative.labservices.outputs.GetLabAccountRegionalAvailabilityResult;
import io.pulumi.azurenative.labservices.outputs.GetLabAccountResult;
import io.pulumi.azurenative.labservices.outputs.GetLabPlanResult;
import io.pulumi.azurenative.labservices.outputs.GetLabResult;
import io.pulumi.azurenative.labservices.outputs.GetScheduleResult;
import io.pulumi.azurenative.labservices.outputs.GetUserResult;
import io.pulumi.azurenative.labservices.outputs.ListGlobalUserEnvironmentsResult;
import io.pulumi.azurenative.labservices.outputs.ListGlobalUserLabsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LabservicesFunctions {
    /**
     * Represents an environment instance
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents settings of an environment, from which environment instances would be created
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetEnvironmentSettingResult> getEnvironmentSetting(GetEnvironmentSettingArgs args) {
        return getEnvironmentSetting(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnvironmentSettingResult> getEnvironmentSetting(GetEnvironmentSettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getEnvironmentSetting", TypeShape.of(GetEnvironmentSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an image from the Azure Marketplace
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGalleryImageResult> getGalleryImage(GetGalleryImageArgs args) {
        return getGalleryImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGalleryImageResult> getGalleryImage(GetGalleryImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGalleryImage", TypeShape.of(GetGalleryImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the environments details
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserEnvironmentResult> getGlobalUserEnvironment(GetGlobalUserEnvironmentArgs args) {
        return getGlobalUserEnvironment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGlobalUserEnvironmentResult> getGlobalUserEnvironment(GetGlobalUserEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserEnvironment", TypeShape.of(GetGlobalUserEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserOperationBatchStatusResult> getGlobalUserOperationBatchStatus(GetGlobalUserOperationBatchStatusArgs args) {
        return getGlobalUserOperationBatchStatus(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGlobalUserOperationBatchStatusResult> getGlobalUserOperationBatchStatus(GetGlobalUserOperationBatchStatusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserOperationBatchStatus", TypeShape.of(GetGlobalUserOperationBatchStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserOperationStatusResult> getGlobalUserOperationStatus(GetGlobalUserOperationStatusArgs args) {
        return getGlobalUserOperationStatus(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGlobalUserOperationStatusResult> getGlobalUserOperationStatus(GetGlobalUserOperationStatusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserOperationStatus", TypeShape.of(GetGlobalUserOperationStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the PersonalPreferences for the user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserPersonalPreferencesResult> getGlobalUserPersonalPreferences(GetGlobalUserPersonalPreferencesArgs args) {
        return getGlobalUserPersonalPreferences(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGlobalUserPersonalPreferencesResult> getGlobalUserPersonalPreferences(GetGlobalUserPersonalPreferencesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserPersonalPreferences", TypeShape.of(GetGlobalUserPersonalPreferencesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a lab.
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabResult> getLab(GetLabArgs args) {
        return getLab(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLabResult> getLab(GetLabArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLab", TypeShape.of(GetLabResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a lab account.
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabAccountResult> getLabAccount(GetLabAccountArgs args) {
        return getLabAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLabAccountResult> getLabAccount(GetLabAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLabAccount", TypeShape.of(GetLabAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response model from the GetRegionalAvailability action
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabAccountRegionalAvailabilityResult> getLabAccountRegionalAvailability(GetLabAccountRegionalAvailabilityArgs args) {
        return getLabAccountRegionalAvailability(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLabAccountRegionalAvailabilityResult> getLabAccountRegionalAvailability(GetLabAccountRegionalAvailabilityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLabAccountRegionalAvailability", TypeShape.of(GetLabAccountRegionalAvailabilityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lab Plans act as a permission container for creating labs via labs.azure.com. Additionally, they can provide a set of default configurations that will apply at the time of creating a lab, but these defaults can still be overwritten.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static CompletableFuture<GetLabPlanResult> getLabPlan(GetLabPlanArgs args) {
        return getLabPlan(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLabPlanResult> getLabPlan(GetLabPlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLabPlan", TypeShape.of(GetLabPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Schedule for automatically turning virtual machines in a lab on and off at specified times.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static CompletableFuture<GetScheduleResult> getSchedule(GetScheduleArgs args) {
        return getSchedule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetScheduleResult> getSchedule(GetScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getSchedule", TypeShape.of(GetScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The User registered to a lab
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the list of environments owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<ListGlobalUserEnvironmentsResult> listGlobalUserEnvironments(ListGlobalUserEnvironmentsArgs args) {
        return listGlobalUserEnvironments(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListGlobalUserEnvironmentsResult> listGlobalUserEnvironments(ListGlobalUserEnvironmentsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:listGlobalUserEnvironments", TypeShape.of(ListGlobalUserEnvironmentsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lists the labs owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<ListGlobalUserLabsResult> listGlobalUserLabs(ListGlobalUserLabsArgs args) {
        return listGlobalUserLabs(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListGlobalUserLabsResult> listGlobalUserLabs(ListGlobalUserLabsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:listGlobalUserLabs", TypeShape.of(ListGlobalUserLabsResult.class), args, Utilities.withVersion(options));
    }
}
