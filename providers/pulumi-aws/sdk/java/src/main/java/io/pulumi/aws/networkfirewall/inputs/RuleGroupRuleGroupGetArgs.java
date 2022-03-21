// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupStatefulRuleOptionsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupGetArgs Empty = new RuleGroupRuleGroupGetArgs();

    /**
     * A configuration block that defines additional settings available to use in the rules defined in the rule group. Can only be specified for **stateful** rule groups. See Rule Variables below for details.
     * 
     */
    @Import(name="ruleVariables")
      private final @Nullable Output<RuleGroupRuleGroupRuleVariablesGetArgs> ruleVariables;

    public Output<RuleGroupRuleGroupRuleVariablesGetArgs> getRuleVariables() {
        return this.ruleVariables == null ? Output.empty() : this.ruleVariables;
    }

    /**
     * A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
     * 
     */
    @Import(name="rulesSource", required=true)
      private final Output<RuleGroupRuleGroupRulesSourceGetArgs> rulesSource;

    public Output<RuleGroupRuleGroupRulesSourceGetArgs> getRulesSource() {
        return this.rulesSource;
    }

    /**
     * A configuration block that defines stateful rule options for the rule group. See Stateful Rule Options below for details.
     * 
     */
    @Import(name="statefulRuleOptions")
      private final @Nullable Output<RuleGroupRuleGroupStatefulRuleOptionsGetArgs> statefulRuleOptions;

    public Output<RuleGroupRuleGroupStatefulRuleOptionsGetArgs> getStatefulRuleOptions() {
        return this.statefulRuleOptions == null ? Output.empty() : this.statefulRuleOptions;
    }

    public RuleGroupRuleGroupGetArgs(
        @Nullable Output<RuleGroupRuleGroupRuleVariablesGetArgs> ruleVariables,
        Output<RuleGroupRuleGroupRulesSourceGetArgs> rulesSource,
        @Nullable Output<RuleGroupRuleGroupStatefulRuleOptionsGetArgs> statefulRuleOptions) {
        this.ruleVariables = ruleVariables;
        this.rulesSource = Objects.requireNonNull(rulesSource, "expected parameter 'rulesSource' to be non-null");
        this.statefulRuleOptions = statefulRuleOptions;
    }

    private RuleGroupRuleGroupGetArgs() {
        this.ruleVariables = Output.empty();
        this.rulesSource = Output.empty();
        this.statefulRuleOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleGroupRuleVariablesGetArgs> ruleVariables;
        private Output<RuleGroupRuleGroupRulesSourceGetArgs> rulesSource;
        private @Nullable Output<RuleGroupRuleGroupStatefulRuleOptionsGetArgs> statefulRuleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleVariables = defaults.ruleVariables;
    	      this.rulesSource = defaults.rulesSource;
    	      this.statefulRuleOptions = defaults.statefulRuleOptions;
        }

        public Builder ruleVariables(@Nullable Output<RuleGroupRuleGroupRuleVariablesGetArgs> ruleVariables) {
            this.ruleVariables = ruleVariables;
            return this;
        }
        public Builder ruleVariables(@Nullable RuleGroupRuleGroupRuleVariablesGetArgs ruleVariables) {
            this.ruleVariables = Output.ofNullable(ruleVariables);
            return this;
        }
        public Builder rulesSource(Output<RuleGroupRuleGroupRulesSourceGetArgs> rulesSource) {
            this.rulesSource = Objects.requireNonNull(rulesSource);
            return this;
        }
        public Builder rulesSource(RuleGroupRuleGroupRulesSourceGetArgs rulesSource) {
            this.rulesSource = Output.of(Objects.requireNonNull(rulesSource));
            return this;
        }
        public Builder statefulRuleOptions(@Nullable Output<RuleGroupRuleGroupStatefulRuleOptionsGetArgs> statefulRuleOptions) {
            this.statefulRuleOptions = statefulRuleOptions;
            return this;
        }
        public Builder statefulRuleOptions(@Nullable RuleGroupRuleGroupStatefulRuleOptionsGetArgs statefulRuleOptions) {
            this.statefulRuleOptions = Output.ofNullable(statefulRuleOptions);
            return this;
        }        public RuleGroupRuleGroupGetArgs build() {
            return new RuleGroupRuleGroupGetArgs(ruleVariables, rulesSource, statefulRuleOptions);
        }
    }
}
