// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkfirewall.inputs.GetFirewallArgs;
import io.pulumi.awsnative.networkfirewall.inputs.GetFirewallPolicyArgs;
import io.pulumi.awsnative.networkfirewall.inputs.GetLoggingConfigurationArgs;
import io.pulumi.awsnative.networkfirewall.inputs.GetRuleGroupArgs;
import io.pulumi.awsnative.networkfirewall.outputs.GetFirewallPolicyResult;
import io.pulumi.awsnative.networkfirewall.outputs.GetFirewallResult;
import io.pulumi.awsnative.networkfirewall.outputs.GetLoggingConfigurationResult;
import io.pulumi.awsnative.networkfirewall.outputs.GetRuleGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class NetworkfirewallFunctions {
    /**
     * Resource type definition for AWS::NetworkFirewall::Firewall
     * 
     */
    public static CompletableFuture<GetFirewallResult> getFirewall(GetFirewallArgs args) {
        return getFirewall(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFirewallResult> getFirewall(GetFirewallArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkfirewall:getFirewall", TypeShape.of(GetFirewallResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource type definition for AWS::NetworkFirewall::FirewallPolicy
     * 
     */
    public static CompletableFuture<GetFirewallPolicyResult> getFirewallPolicy(GetFirewallPolicyArgs args) {
        return getFirewallPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFirewallPolicyResult> getFirewallPolicy(GetFirewallPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkfirewall:getFirewallPolicy", TypeShape.of(GetFirewallPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource type definition for AWS::NetworkFirewall::LoggingConfiguration
     * 
     */
    public static CompletableFuture<GetLoggingConfigurationResult> getLoggingConfiguration(GetLoggingConfigurationArgs args) {
        return getLoggingConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLoggingConfigurationResult> getLoggingConfiguration(GetLoggingConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkfirewall:getLoggingConfiguration", TypeShape.of(GetLoggingConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource type definition for AWS::NetworkFirewall::RuleGroup
     * 
     */
    public static CompletableFuture<GetRuleGroupResult> getRuleGroup(GetRuleGroupArgs args) {
        return getRuleGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRuleGroupResult> getRuleGroup(GetRuleGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkfirewall:getRuleGroup", TypeShape.of(GetRuleGroupResult.class), args, Utilities.withVersion(options));
    }
}
