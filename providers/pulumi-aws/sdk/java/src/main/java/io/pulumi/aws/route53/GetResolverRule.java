// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.inputs.GetResolverRuleArgs;
import io.pulumi.aws.route53.outputs.GetResolverRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResolverRule {
    private GetResolverRule() {}
    /**
         * `aws.route53.ResolverRule` provides details about a specific Route53 Resolver rule.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getResolverRule.
     * 
     *
         * A collection of values returned by getResolverRule.
     * 
     */
    public static CompletableFuture<GetResolverRuleResult> invokeAsync(@Nullable GetResolverRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:route53/getResolverRule:getResolverRule", TypeShape.of(GetResolverRuleResult.class), args == null ? GetResolverRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}