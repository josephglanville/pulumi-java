// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupStatefulRuleOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupStatefulRuleOptionsArgs Empty = new RuleGroupRuleGroupStatefulRuleOptionsArgs();

    /**
     * Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    @Import(name="ruleOrder", required=true)
      private final Output<String> ruleOrder;

    public Output<String> getRuleOrder() {
        return this.ruleOrder;
    }

    public RuleGroupRuleGroupStatefulRuleOptionsArgs(Output<String> ruleOrder) {
        this.ruleOrder = Objects.requireNonNull(ruleOrder, "expected parameter 'ruleOrder' to be non-null");
    }

    private RuleGroupRuleGroupStatefulRuleOptionsArgs() {
        this.ruleOrder = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupStatefulRuleOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupStatefulRuleOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder ruleOrder(Output<String> ruleOrder) {
            this.ruleOrder = Objects.requireNonNull(ruleOrder);
            return this;
        }
        public Builder ruleOrder(String ruleOrder) {
            this.ruleOrder = Output.of(Objects.requireNonNull(ruleOrder));
            return this;
        }        public RuleGroupRuleGroupStatefulRuleOptionsArgs build() {
            return new RuleGroupRuleGroupStatefulRuleOptionsArgs(ruleOrder);
        }
    }
}
