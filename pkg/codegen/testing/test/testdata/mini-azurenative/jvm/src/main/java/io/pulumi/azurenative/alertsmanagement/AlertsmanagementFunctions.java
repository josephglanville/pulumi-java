// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.alertsmanagement.inputs.GetActionRuleByNameArgs;
import io.pulumi.azurenative.alertsmanagement.outputs.GetActionRuleByNameResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AlertsmanagementFunctions {
    /**
     * Action rule object containing target scope, conditions and suppression logic
     * API Version: 2019-05-05-preview.
     * 
     */
    public static CompletableFuture<GetActionRuleByNameResult> getActionRuleByName(GetActionRuleByNameArgs args) {
        return getActionRuleByName(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetActionRuleByNameResult> getActionRuleByName(GetActionRuleByNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:alertsmanagement:getActionRuleByName", TypeShape.of(GetActionRuleByNameResult.class), args, Utilities.withVersion(options));
    }
}
