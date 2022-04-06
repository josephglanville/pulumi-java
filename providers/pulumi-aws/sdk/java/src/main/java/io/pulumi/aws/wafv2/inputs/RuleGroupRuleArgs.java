// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleRuleLabelArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleVisibilityConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleArgs Empty = new RuleGroupRuleArgs();

    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * 
     */
    @Import(name="action", required=true)
      private final Output<RuleGroupRuleActionArgs> action;

    public Output<RuleGroupRuleActionArgs> getAction() {
        return this.action;
    }

    /**
     * A friendly name of the rule.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    @Import(name="ruleLabels")
      private final @Nullable Output<List<RuleGroupRuleRuleLabelArgs>> ruleLabels;

    public Output<List<RuleGroupRuleRuleLabelArgs>> getRuleLabels() {
        return this.ruleLabels == null ? Output.empty() : this.ruleLabels;
    }

    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    @Import(name="statement", required=true)
      private final Output<RuleGroupRuleStatementArgs> statement;

    public Output<RuleGroupRuleStatementArgs> getStatement() {
        return this.statement;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
      private final Output<RuleGroupRuleVisibilityConfigArgs> visibilityConfig;

    public Output<RuleGroupRuleVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public RuleGroupRuleArgs(
        Output<RuleGroupRuleActionArgs> action,
        Output<String> name,
        Output<Integer> priority,
        @Nullable Output<List<RuleGroupRuleRuleLabelArgs>> ruleLabels,
        Output<RuleGroupRuleStatementArgs> statement,
        Output<RuleGroupRuleVisibilityConfigArgs> visibilityConfig) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private RuleGroupRuleArgs() {
        this.action = Output.empty();
        this.name = Output.empty();
        this.priority = Output.empty();
        this.ruleLabels = Output.empty();
        this.statement = Output.empty();
        this.visibilityConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupRuleActionArgs> action;
        private Output<String> name;
        private Output<Integer> priority;
        private @Nullable Output<List<RuleGroupRuleRuleLabelArgs>> ruleLabels;
        private Output<RuleGroupRuleStatementArgs> statement;
        private Output<RuleGroupRuleVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(Output<RuleGroupRuleActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RuleGroupRuleActionArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder ruleLabels(@Nullable Output<List<RuleGroupRuleRuleLabelArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(@Nullable List<RuleGroupRuleRuleLabelArgs> ruleLabels) {
            this.ruleLabels = Output.ofNullable(ruleLabels);
            return this;
        }
        public Builder ruleLabels(RuleGroupRuleRuleLabelArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(Output<RuleGroupRuleStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder statement(RuleGroupRuleStatementArgs statement) {
            this.statement = Output.of(Objects.requireNonNull(statement));
            return this;
        }
        public Builder visibilityConfig(Output<RuleGroupRuleVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public Builder visibilityConfig(RuleGroupRuleVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Output.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }        public RuleGroupRuleArgs build() {
            return new RuleGroupRuleArgs(action, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}