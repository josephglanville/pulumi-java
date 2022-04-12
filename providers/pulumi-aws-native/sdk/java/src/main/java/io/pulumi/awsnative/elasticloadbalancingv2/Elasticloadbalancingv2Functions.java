// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.GetListenerArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.GetListenerRuleArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.GetListenerResult;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.GetListenerRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Elasticloadbalancingv2Functions {
    /**
     * Resource Type definition for AWS::ElasticLoadBalancingV2::Listener
     * 
     */
    public static CompletableFuture<GetListenerResult> getListener(GetListenerArgs args) {
        return getListener(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetListenerResult> getListener(GetListenerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:elasticloadbalancingv2:getListener", TypeShape.of(GetListenerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::ElasticLoadBalancingV2::ListenerRule
     * 
     */
    public static CompletableFuture<GetListenerRuleResult> getListenerRule(GetListenerRuleArgs args) {
        return getListenerRule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetListenerRuleResult> getListenerRule(GetListenerRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:elasticloadbalancingv2:getListenerRule", TypeShape.of(GetListenerRuleResult.class), args, Utilities.withVersion(options));
    }
}
