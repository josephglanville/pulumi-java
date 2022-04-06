// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleHeaderGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs();

    /**
     * Action to take with packets in a traffic flow when the flow matches the stateful rule criteria. For all actions, AWS Network Firewall performs the specified action and discontinues stateful inspection of the traffic flow. Valid values: `ALERT`, `DROP` or `PASS`.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * A configuration block containing the stateful 5-tuple inspection criteria for the rule, used to inspect traffic flows. See Header below for details.
     * 
     */
    @Import(name="header", required=true)
      private final Output<RuleGroupRuleGroupRulesSourceStatefulRuleHeaderGetArgs> header;

    public Output<RuleGroupRuleGroupRulesSourceStatefulRuleHeaderGetArgs> getHeader() {
        return this.header;
    }

    /**
     * Set of configuration blocks containing additional settings for a stateful rule. See Rule Option below for details.
     * 
     */
    @Import(name="ruleOptions", required=true)
      private final Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs>> ruleOptions;

    public Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs>> getRuleOptions() {
        return this.ruleOptions;
    }

    public RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs(
        Output<String> action,
        Output<RuleGroupRuleGroupRulesSourceStatefulRuleHeaderGetArgs> header,
        Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs>> ruleOptions) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.ruleOptions = Objects.requireNonNull(ruleOptions, "expected parameter 'ruleOptions' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs() {
        this.action = Output.empty();
        this.header = Output.empty();
        this.ruleOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private Output<RuleGroupRuleGroupRulesSourceStatefulRuleHeaderGetArgs> header;
        private Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs>> ruleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.header = defaults.header;
    	      this.ruleOptions = defaults.ruleOptions;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder header(Output<RuleGroupRuleGroupRulesSourceStatefulRuleHeaderGetArgs> header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }
        public Builder header(RuleGroupRuleGroupRulesSourceStatefulRuleHeaderGetArgs header) {
            this.header = Output.of(Objects.requireNonNull(header));
            return this;
        }
        public Builder ruleOptions(Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs>> ruleOptions) {
            this.ruleOptions = Objects.requireNonNull(ruleOptions);
            return this;
        }
        public Builder ruleOptions(List<RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs> ruleOptions) {
            this.ruleOptions = Output.of(Objects.requireNonNull(ruleOptions));
            return this;
        }
        public Builder ruleOptions(RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionGetArgs... ruleOptions) {
            return ruleOptions(List.of(ruleOptions));
        }        public RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs(action, header, ruleOptions);
        }
    }
}