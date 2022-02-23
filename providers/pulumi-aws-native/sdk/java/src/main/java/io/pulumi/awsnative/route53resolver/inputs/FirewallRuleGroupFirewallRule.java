// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.inputs;

import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleAction;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleBlockOverrideDnsType;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleBlockResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Firewall Rule associating the Rule Group to a Domain List
 * 
 */
public final class FirewallRuleGroupFirewallRule extends io.pulumi.resources.InvokeArgs {

    public static final FirewallRuleGroupFirewallRule Empty = new FirewallRuleGroupFirewallRule();

    /**
     * Rule Action
     * 
     */
    @InputImport(name="action", required=true)
      private final FirewallRuleGroupFirewallRuleAction action;

    public FirewallRuleGroupFirewallRuleAction getAction() {
        return this.action;
    }

    /**
     * BlockOverrideDnsType
     * 
     */
    @InputImport(name="blockOverrideDnsType")
      private final @Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType;

    public Optional<FirewallRuleGroupFirewallRuleBlockOverrideDnsType> getBlockOverrideDnsType() {
        return this.blockOverrideDnsType == null ? Optional.empty() : Optional.ofNullable(this.blockOverrideDnsType);
    }

    /**
     * BlockOverrideDomain
     * 
     */
    @InputImport(name="blockOverrideDomain")
      private final @Nullable String blockOverrideDomain;

    public Optional<String> getBlockOverrideDomain() {
        return this.blockOverrideDomain == null ? Optional.empty() : Optional.ofNullable(this.blockOverrideDomain);
    }

    /**
     * BlockOverrideTtl
     * 
     */
    @InputImport(name="blockOverrideTtl")
      private final @Nullable Integer blockOverrideTtl;

    public Optional<Integer> getBlockOverrideTtl() {
        return this.blockOverrideTtl == null ? Optional.empty() : Optional.ofNullable(this.blockOverrideTtl);
    }

    /**
     * BlockResponse
     * 
     */
    @InputImport(name="blockResponse")
      private final @Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse;

    public Optional<FirewallRuleGroupFirewallRuleBlockResponse> getBlockResponse() {
        return this.blockResponse == null ? Optional.empty() : Optional.ofNullable(this.blockResponse);
    }

    /**
     * ResourceId
     * 
     */
    @InputImport(name="firewallDomainListId", required=true)
      private final String firewallDomainListId;

    public String getFirewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * Rule Priority
     * 
     */
    @InputImport(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    public FirewallRuleGroupFirewallRule(
        FirewallRuleGroupFirewallRuleAction action,
        @Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType,
        @Nullable String blockOverrideDomain,
        @Nullable Integer blockOverrideTtl,
        @Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse,
        String firewallDomainListId,
        Integer priority) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.blockOverrideDnsType = blockOverrideDnsType;
        this.blockOverrideDomain = blockOverrideDomain;
        this.blockOverrideTtl = blockOverrideTtl;
        this.blockResponse = blockResponse;
        this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId, "expected parameter 'firewallDomainListId' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private FirewallRuleGroupFirewallRule() {
        this.action = null;
        this.blockOverrideDnsType = null;
        this.blockOverrideDomain = null;
        this.blockOverrideTtl = null;
        this.blockResponse = null;
        this.firewallDomainListId = null;
        this.priority = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleGroupFirewallRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleGroupFirewallRuleAction action;
        private @Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType;
        private @Nullable String blockOverrideDomain;
        private @Nullable Integer blockOverrideTtl;
        private @Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse;
        private String firewallDomainListId;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleGroupFirewallRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.blockOverrideDnsType = defaults.blockOverrideDnsType;
    	      this.blockOverrideDomain = defaults.blockOverrideDomain;
    	      this.blockOverrideTtl = defaults.blockOverrideTtl;
    	      this.blockResponse = defaults.blockResponse;
    	      this.firewallDomainListId = defaults.firewallDomainListId;
    	      this.priority = defaults.priority;
        }

        public Builder setAction(FirewallRuleGroupFirewallRuleAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setBlockOverrideDnsType(@Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType) {
            this.blockOverrideDnsType = blockOverrideDnsType;
            return this;
        }

        public Builder setBlockOverrideDomain(@Nullable String blockOverrideDomain) {
            this.blockOverrideDomain = blockOverrideDomain;
            return this;
        }

        public Builder setBlockOverrideTtl(@Nullable Integer blockOverrideTtl) {
            this.blockOverrideTtl = blockOverrideTtl;
            return this;
        }

        public Builder setBlockResponse(@Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse) {
            this.blockResponse = blockResponse;
            return this;
        }

        public Builder setFirewallDomainListId(String firewallDomainListId) {
            this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public FirewallRuleGroupFirewallRule build() {
            return new FirewallRuleGroupFirewallRule(action, blockOverrideDnsType, blockOverrideDomain, blockOverrideTtl, blockResponse, firewallDomainListId, priority);
        }
    }
}
