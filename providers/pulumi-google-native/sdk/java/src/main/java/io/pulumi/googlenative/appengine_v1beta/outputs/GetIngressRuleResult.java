// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIngressRuleResult {
    /**
     * The action to take on matched requests.
     * 
     */
    private final String action;
    /**
     * An optional string description of this rule. This field has a maximum length of 400 characters.
     * 
     */
    private final String description;
    /**
     * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
     * 
     */
    private final Integer priority;
    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
     * 
     */
    private final String sourceRange;

    @CustomType.Constructor
    private GetIngressRuleResult(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("sourceRange") String sourceRange) {
        this.action = action;
        this.description = description;
        this.priority = priority;
        this.sourceRange = sourceRange;
    }

    /**
     * The action to take on matched requests.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * An optional string description of this rule. This field has a maximum length of 400 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
     * 
    */
    public String getSourceRange() {
        return this.sourceRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIngressRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String description;
        private Integer priority;
        private String sourceRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIngressRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.priority = defaults.priority;
    	      this.sourceRange = defaults.sourceRange;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder sourceRange(String sourceRange) {
            this.sourceRange = Objects.requireNonNull(sourceRange);
            return this;
        }        public GetIngressRuleResult build() {
            return new GetIngressRuleResult(action, description, priority, sourceRange);
        }
    }
}
