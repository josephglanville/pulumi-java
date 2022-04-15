// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.inputs.GetAzureCliScriptArgs;
import io.pulumi.azurenative.resources.inputs.GetAzurePowerShellScriptArgs;
import io.pulumi.azurenative.resources.inputs.GetDeploymentArgs;
import io.pulumi.azurenative.resources.inputs.GetDeploymentAtManagementGroupScopeArgs;
import io.pulumi.azurenative.resources.inputs.GetDeploymentAtScopeArgs;
import io.pulumi.azurenative.resources.inputs.GetDeploymentAtSubscriptionScopeArgs;
import io.pulumi.azurenative.resources.inputs.GetDeploymentAtTenantScopeArgs;
import io.pulumi.azurenative.resources.inputs.GetDeploymentScriptArgs;
import io.pulumi.azurenative.resources.inputs.GetResourceArgs;
import io.pulumi.azurenative.resources.inputs.GetResourceGroupArgs;
import io.pulumi.azurenative.resources.inputs.GetTagAtScopeArgs;
import io.pulumi.azurenative.resources.inputs.GetTemplateSpecArgs;
import io.pulumi.azurenative.resources.inputs.GetTemplateSpecVersionArgs;
import io.pulumi.azurenative.resources.outputs.GetAzureCliScriptResult;
import io.pulumi.azurenative.resources.outputs.GetAzurePowerShellScriptResult;
import io.pulumi.azurenative.resources.outputs.GetDeploymentAtManagementGroupScopeResult;
import io.pulumi.azurenative.resources.outputs.GetDeploymentAtScopeResult;
import io.pulumi.azurenative.resources.outputs.GetDeploymentAtSubscriptionScopeResult;
import io.pulumi.azurenative.resources.outputs.GetDeploymentAtTenantScopeResult;
import io.pulumi.azurenative.resources.outputs.GetDeploymentResult;
import io.pulumi.azurenative.resources.outputs.GetDeploymentScriptResult;
import io.pulumi.azurenative.resources.outputs.GetResourceGroupResult;
import io.pulumi.azurenative.resources.outputs.GetResourceResult;
import io.pulumi.azurenative.resources.outputs.GetTagAtScopeResult;
import io.pulumi.azurenative.resources.outputs.GetTemplateSpecResult;
import io.pulumi.azurenative.resources.outputs.GetTemplateSpecVersionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ResourcesFunctions {
    /**
     * Object model for the Azure CLI script.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAzureCliScriptResult> getAzureCliScript(GetAzureCliScriptArgs args) {
        return getAzureCliScript(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAzureCliScriptResult> getAzureCliScript(GetAzureCliScriptArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getAzureCliScript", TypeShape.of(GetAzureCliScriptResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Object model for the Azure PowerShell script.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAzurePowerShellScriptResult> getAzurePowerShellScript(GetAzurePowerShellScriptArgs args) {
        return getAzurePowerShellScript(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAzurePowerShellScriptResult> getAzurePowerShellScript(GetAzurePowerShellScriptArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getAzurePowerShellScript", TypeShape.of(GetAzurePowerShellScriptResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Deployment information.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args) {
        return getDeployment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeployment", TypeShape.of(GetDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Deployment information.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetDeploymentAtManagementGroupScopeResult> getDeploymentAtManagementGroupScope(GetDeploymentAtManagementGroupScopeArgs args) {
        return getDeploymentAtManagementGroupScope(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeploymentAtManagementGroupScopeResult> getDeploymentAtManagementGroupScope(GetDeploymentAtManagementGroupScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeploymentAtManagementGroupScope", TypeShape.of(GetDeploymentAtManagementGroupScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Deployment information.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetDeploymentAtScopeResult> getDeploymentAtScope(GetDeploymentAtScopeArgs args) {
        return getDeploymentAtScope(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeploymentAtScopeResult> getDeploymentAtScope(GetDeploymentAtScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeploymentAtScope", TypeShape.of(GetDeploymentAtScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Deployment information.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetDeploymentAtSubscriptionScopeResult> getDeploymentAtSubscriptionScope(GetDeploymentAtSubscriptionScopeArgs args) {
        return getDeploymentAtSubscriptionScope(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeploymentAtSubscriptionScopeResult> getDeploymentAtSubscriptionScope(GetDeploymentAtSubscriptionScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeploymentAtSubscriptionScope", TypeShape.of(GetDeploymentAtSubscriptionScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Deployment information.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetDeploymentAtTenantScopeResult> getDeploymentAtTenantScope(GetDeploymentAtTenantScopeArgs args) {
        return getDeploymentAtTenantScope(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeploymentAtTenantScopeResult> getDeploymentAtTenantScope(GetDeploymentAtTenantScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeploymentAtTenantScope", TypeShape.of(GetDeploymentAtTenantScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Deployment script object.
     * API Version: 2020-10-01.
     * 
     * @Deprecated
     * Please use one of the variants: AzureCliScript, AzurePowerShellScript.
     * 
     */
    @Deprecated /* Please use one of the variants: AzureCliScript, AzurePowerShellScript. */
    public static CompletableFuture<GetDeploymentScriptResult> getDeploymentScript(GetDeploymentScriptArgs args) {
        return getDeploymentScript(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDeploymentScriptResult> getDeploymentScript(GetDeploymentScriptArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeploymentScript", TypeShape.of(GetDeploymentScriptResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<GetResourceResult> getResource(GetResourceArgs args) {
        return getResource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResourceResult> getResource(GetResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getResource", TypeShape.of(GetResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource group information.
     * API Version: 2019-05-01.
     * 
     */
    public static CompletableFuture<GetResourceGroupResult> getResourceGroup(GetResourceGroupArgs args) {
        return getResourceGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResourceGroupResult> getResourceGroup(GetResourceGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getResourceGroup", TypeShape.of(GetResourceGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Wrapper resource for tags API requests and responses.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetTagAtScopeResult> getTagAtScope(GetTagAtScopeArgs args) {
        return getTagAtScope(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTagAtScopeResult> getTagAtScope(GetTagAtScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getTagAtScope", TypeShape.of(GetTagAtScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Template Spec object.
     * API Version: 2021-05-01.
     * 
     */
    public static CompletableFuture<GetTemplateSpecResult> getTemplateSpec(GetTemplateSpecArgs args) {
        return getTemplateSpec(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTemplateSpecResult> getTemplateSpec(GetTemplateSpecArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getTemplateSpec", TypeShape.of(GetTemplateSpecResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Template Spec Version object.
     * API Version: 2021-05-01.
     * 
     */
    public static CompletableFuture<GetTemplateSpecVersionResult> getTemplateSpecVersion(GetTemplateSpecVersionArgs args) {
        return getTemplateSpecVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTemplateSpecVersionResult> getTemplateSpecVersion(GetTemplateSpecVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getTemplateSpecVersion", TypeShape.of(GetTemplateSpecVersionResult.class), args, Utilities.withVersion(options));
    }
}