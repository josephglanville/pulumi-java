// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.aws.waf.outputs.RuleGroupActivatedRuleAction;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupActivatedRule {
    /**
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
     * 
     */
    private final RuleGroupActivatedRuleAction action;
    /**
     * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    private final Integer priority;
    /**
     * The ID of a `waf_rule`
     * 
     */
    private final String ruleId;
    /**
     * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private RuleGroupActivatedRule(
        @CustomType.Parameter("action") RuleGroupActivatedRuleAction action,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("ruleId") String ruleId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.action = action;
        this.priority = priority;
        this.ruleId = ruleId;
        this.type = type;
    }

    /**
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
     * 
    */
    public RuleGroupActivatedRuleAction getAction() {
        return this.action;
    }
    /**
     * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The ID of a `waf_rule`
     * 
    */
    public String getRuleId() {
        return this.ruleId;
    }
    /**
     * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupActivatedRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupActivatedRuleAction action;
        private Integer priority;
        private String ruleId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupActivatedRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.priority = defaults.priority;
    	      this.ruleId = defaults.ruleId;
    	      this.type = defaults.type;
        }

        public Builder action(RuleGroupActivatedRuleAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public RuleGroupActivatedRule build() {
            return new RuleGroupActivatedRule(action, priority, ruleId, type);
        }
    }
}
