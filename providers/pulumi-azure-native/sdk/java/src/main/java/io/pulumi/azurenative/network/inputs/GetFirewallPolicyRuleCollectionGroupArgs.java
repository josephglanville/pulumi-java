// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyRuleCollectionGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyRuleCollectionGroupArgs Empty = new GetFirewallPolicyRuleCollectionGroupArgs();

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
      private final String firewallPolicyName;

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the FirewallPolicyRuleCollectionGroup.
     * 
     */
    @Import(name="ruleCollectionGroupName", required=true)
      private final String ruleCollectionGroupName;

    public String getRuleCollectionGroupName() {
        return this.ruleCollectionGroupName;
    }

    public GetFirewallPolicyRuleCollectionGroupArgs(
        String firewallPolicyName,
        String resourceGroupName,
        String ruleCollectionGroupName) {
        this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionGroupName = Objects.requireNonNull(ruleCollectionGroupName, "expected parameter 'ruleCollectionGroupName' to be non-null");
    }

    private GetFirewallPolicyRuleCollectionGroupArgs() {
        this.firewallPolicyName = null;
        this.resourceGroupName = null;
        this.ruleCollectionGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyRuleCollectionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallPolicyName;
        private String resourceGroupName;
        private String ruleCollectionGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyRuleCollectionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionGroupName = defaults.ruleCollectionGroupName;
        }

        public Builder firewallPolicyName(String firewallPolicyName) {
            this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder ruleCollectionGroupName(String ruleCollectionGroupName) {
            this.ruleCollectionGroupName = Objects.requireNonNull(ruleCollectionGroupName);
            return this;
        }        public GetFirewallPolicyRuleCollectionGroupArgs build() {
            return new GetFirewallPolicyRuleCollectionGroupArgs(firewallPolicyName, resourceGroupName, ruleCollectionGroupName);
        }
    }
}
