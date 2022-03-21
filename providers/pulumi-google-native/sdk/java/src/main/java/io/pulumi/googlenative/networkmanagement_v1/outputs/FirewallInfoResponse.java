// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FirewallInfoResponse {
    /**
     * Possible values: ALLOW, DENY
     * 
     */
    private final String action;
    /**
     * Possible values: INGRESS, EGRESS
     * 
     */
    private final String direction;
    /**
     * The display name of the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
     * 
     */
    private final String displayName;
    /**
     * The firewall rule's type.
     * 
     */
    private final String firewallRuleType;
    /**
     * The URI of the VPC network that the firewall rule is associated with. This field is not applicable to hierarchical firewall policy rules.
     * 
     */
    private final String networkUri;
    /**
     * The hierarchical firewall policy that this rule is associated with. This field is not applicable to VPC firewall rules.
     * 
     */
    private final String policy;
    /**
     * The priority of the firewall rule.
     * 
     */
    private final Integer priority;
    /**
     * The target service accounts specified by the firewall rule.
     * 
     */
    private final List<String> targetServiceAccounts;
    /**
     * The target tags defined by the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
     * 
     */
    private final List<String> targetTags;
    /**
     * The URI of the VPC firewall rule. This field is not applicable to implied firewall rules or hierarchical firewall policy rules.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private FirewallInfoResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("firewallRuleType") String firewallRuleType,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("policy") String policy,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("targetServiceAccounts") List<String> targetServiceAccounts,
        @CustomType.Parameter("targetTags") List<String> targetTags,
        @CustomType.Parameter("uri") String uri) {
        this.action = action;
        this.direction = direction;
        this.displayName = displayName;
        this.firewallRuleType = firewallRuleType;
        this.networkUri = networkUri;
        this.policy = policy;
        this.priority = priority;
        this.targetServiceAccounts = targetServiceAccounts;
        this.targetTags = targetTags;
        this.uri = uri;
    }

    /**
     * Possible values: ALLOW, DENY
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * Possible values: INGRESS, EGRESS
     * 
    */
    public String getDirection() {
        return this.direction;
    }
    /**
     * The display name of the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The firewall rule's type.
     * 
    */
    public String getFirewallRuleType() {
        return this.firewallRuleType;
    }
    /**
     * The URI of the VPC network that the firewall rule is associated with. This field is not applicable to hierarchical firewall policy rules.
     * 
    */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * The hierarchical firewall policy that this rule is associated with. This field is not applicable to VPC firewall rules.
     * 
    */
    public String getPolicy() {
        return this.policy;
    }
    /**
     * The priority of the firewall rule.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The target service accounts specified by the firewall rule.
     * 
    */
    public List<String> getTargetServiceAccounts() {
        return this.targetServiceAccounts;
    }
    /**
     * The target tags defined by the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
     * 
    */
    public List<String> getTargetTags() {
        return this.targetTags;
    }
    /**
     * The URI of the VPC firewall rule. This field is not applicable to implied firewall rules or hierarchical firewall policy rules.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String direction;
        private String displayName;
        private String firewallRuleType;
        private String networkUri;
        private String policy;
        private Integer priority;
        private List<String> targetServiceAccounts;
        private List<String> targetTags;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.firewallRuleType = defaults.firewallRuleType;
    	      this.networkUri = defaults.networkUri;
    	      this.policy = defaults.policy;
    	      this.priority = defaults.priority;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
    	      this.uri = defaults.uri;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder firewallRuleType(String firewallRuleType) {
            this.firewallRuleType = Objects.requireNonNull(firewallRuleType);
            return this;
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }
        public Builder targetTags(List<String> targetTags) {
            this.targetTags = Objects.requireNonNull(targetTags);
            return this;
        }
        public Builder targetTags(String... targetTags) {
            return targetTags(List.of(targetTags));
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public FirewallInfoResponse build() {
            return new FirewallInfoResponse(action, direction, displayName, firewallRuleType, networkUri, policy, priority, targetServiceAccounts, targetTags, uri);
        }
    }
}
