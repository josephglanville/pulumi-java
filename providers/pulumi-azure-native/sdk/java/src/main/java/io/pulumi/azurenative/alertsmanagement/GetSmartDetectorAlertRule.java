// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.alertsmanagement.inputs.GetSmartDetectorAlertRuleArgs;
import io.pulumi.azurenative.alertsmanagement.outputs.GetSmartDetectorAlertRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSmartDetectorAlertRule {
    public static CompletableFuture<GetSmartDetectorAlertRuleResult> invokeAsync(GetSmartDetectorAlertRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:alertsmanagement:getSmartDetectorAlertRule", TypeShape.of(GetSmartDetectorAlertRuleResult.class), args == null ? GetSmartDetectorAlertRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
