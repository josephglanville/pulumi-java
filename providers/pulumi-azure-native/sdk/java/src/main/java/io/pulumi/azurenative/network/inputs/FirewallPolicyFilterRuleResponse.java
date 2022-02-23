// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationRuleConditionResponse;
import io.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleActionResponse;
import io.pulumi.azurenative.network.inputs.NatRuleConditionResponse;
import io.pulumi.azurenative.network.inputs.NetworkRuleConditionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Firewall Policy Filter Rule.
 * 
 */
public final class FirewallPolicyFilterRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyFilterRuleResponse Empty = new FirewallPolicyFilterRuleResponse();

    /**
     * The action type of a Filter rule.
     * 
     */
    @InputImport(name="action")
      private final @Nullable FirewallPolicyFilterRuleActionResponse action;

    public Optional<FirewallPolicyFilterRuleActionResponse> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * Collection of rule conditions used by a rule.
     * 
     */
    @InputImport(name="ruleConditions")
      private final @Nullable List<Object> ruleConditions;

    public List<Object> getRuleConditions() {
        return this.ruleConditions == null ? List.of() : this.ruleConditions;
    }

    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyFilterRule'.
     * 
     */
    @InputImport(name="ruleType", required=true)
      private final String ruleType;

    public String getRuleType() {
        return this.ruleType;
    }

    public FirewallPolicyFilterRuleResponse(
        @Nullable FirewallPolicyFilterRuleActionResponse action,
        @Nullable String name,
        @Nullable Integer priority,
        @Nullable List<Object> ruleConditions,
        String ruleType) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleConditions = ruleConditions;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private FirewallPolicyFilterRuleResponse() {
        this.action = null;
        this.name = null;
        this.priority = null;
        this.ruleConditions = List.of();
        this.ruleType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyFilterRuleActionResponse action;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable List<Object> ruleConditions;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleConditions = defaults.ruleConditions;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder setAction(@Nullable FirewallPolicyFilterRuleActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setRuleConditions(@Nullable List<Object> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public FirewallPolicyFilterRuleResponse build() {
            return new FirewallPolicyFilterRuleResponse(action, name, priority, ruleConditions, ruleType);
        }
    }
}
