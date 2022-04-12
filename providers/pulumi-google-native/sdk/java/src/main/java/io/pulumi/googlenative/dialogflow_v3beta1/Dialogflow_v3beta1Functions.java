// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetAgentArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetEntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetEnvironmentArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetExperimentArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetFlowArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetIntentArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetPageArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetSecuritySettingArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetSessionEntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetTestCaseArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetTransitionRouteGroupArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetVersionArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GetWebhookArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetAgentResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetEntityTypeResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetEnvironmentResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetExperimentResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetFlowResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetIntentResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetPageResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetSecuritySettingResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetSessionEntityTypeResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetTestCaseResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetTransitionRouteGroupResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetVersionResult;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GetWebhookResult;
import java.util.concurrent.CompletableFuture;

public final class Dialogflow_v3beta1Functions {
    /**
     * Retrieves the specified agent.
     * 
     */
    public static CompletableFuture<GetAgentResult> getAgent(GetAgentArgs args) {
        return getAgent(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAgentResult> getAgent(GetAgentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getAgent", TypeShape.of(GetAgentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified entity type.
     * 
     */
    public static CompletableFuture<GetEntityTypeResult> getEntityType(GetEntityTypeArgs args) {
        return getEntityType(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEntityTypeResult> getEntityType(GetEntityTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getEntityType", TypeShape.of(GetEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Environment.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Experiment.
     * 
     */
    public static CompletableFuture<GetExperimentResult> getExperiment(GetExperimentArgs args) {
        return getExperiment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetExperimentResult> getExperiment(GetExperimentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getExperiment", TypeShape.of(GetExperimentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified flow.
     * 
     */
    public static CompletableFuture<GetFlowResult> getFlow(GetFlowArgs args) {
        return getFlow(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFlowResult> getFlow(GetFlowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getFlow", TypeShape.of(GetFlowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified intent.
     * 
     */
    public static CompletableFuture<GetIntentResult> getIntent(GetIntentArgs args) {
        return getIntent(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIntentResult> getIntent(GetIntentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getIntent", TypeShape.of(GetIntentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified page.
     * 
     */
    public static CompletableFuture<GetPageResult> getPage(GetPageArgs args) {
        return getPage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPageResult> getPage(GetPageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getPage", TypeShape.of(GetPageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
     * 
     */
    public static CompletableFuture<GetSecuritySettingResult> getSecuritySetting(GetSecuritySettingArgs args) {
        return getSecuritySetting(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecuritySettingResult> getSecuritySetting(GetSecuritySettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getSecuritySetting", TypeShape.of(GetSecuritySettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified session entity type.
     * 
     */
    public static CompletableFuture<GetSessionEntityTypeResult> getSessionEntityType(GetSessionEntityTypeArgs args) {
        return getSessionEntityType(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSessionEntityTypeResult> getSessionEntityType(GetSessionEntityTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getSessionEntityType", TypeShape.of(GetSessionEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a test case.
     * 
     */
    public static CompletableFuture<GetTestCaseResult> getTestCase(GetTestCaseArgs args) {
        return getTestCase(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTestCaseResult> getTestCase(GetTestCaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getTestCase", TypeShape.of(GetTestCaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified TransitionRouteGroup.
     * 
     */
    public static CompletableFuture<GetTransitionRouteGroupResult> getTransitionRouteGroup(GetTransitionRouteGroupArgs args) {
        return getTransitionRouteGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransitionRouteGroupResult> getTransitionRouteGroup(GetTransitionRouteGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getTransitionRouteGroup", TypeShape.of(GetTransitionRouteGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Version.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersion(GetVersionArgs args) {
        return getVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVersionResult> getVersion(GetVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified webhook.
     * 
     */
    public static CompletableFuture<GetWebhookResult> getWebhook(GetWebhookArgs args) {
        return getWebhook(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWebhookResult> getWebhook(GetWebhookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getWebhook", TypeShape.of(GetWebhookResult.class), args, Utilities.withVersion(options));
    }
}
