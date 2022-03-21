// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupRuleVariablesArgs;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupRulesSourceArgs;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatefulRuleOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupArgs Empty = new RuleGroupArgs();

    @Import(name="ruleVariables")
      private final @Nullable Output<RuleGroupRuleVariablesArgs> ruleVariables;

    public Output<RuleGroupRuleVariablesArgs> getRuleVariables() {
        return this.ruleVariables == null ? Output.empty() : this.ruleVariables;
    }

    @Import(name="rulesSource", required=true)
      private final Output<RuleGroupRulesSourceArgs> rulesSource;

    public Output<RuleGroupRulesSourceArgs> getRulesSource() {
        return this.rulesSource;
    }

    @Import(name="statefulRuleOptions")
      private final @Nullable Output<RuleGroupStatefulRuleOptionsArgs> statefulRuleOptions;

    public Output<RuleGroupStatefulRuleOptionsArgs> getStatefulRuleOptions() {
        return this.statefulRuleOptions == null ? Output.empty() : this.statefulRuleOptions;
    }

    public RuleGroupArgs(
        @Nullable Output<RuleGroupRuleVariablesArgs> ruleVariables,
        Output<RuleGroupRulesSourceArgs> rulesSource,
        @Nullable Output<RuleGroupStatefulRuleOptionsArgs> statefulRuleOptions) {
        this.ruleVariables = ruleVariables;
        this.rulesSource = Objects.requireNonNull(rulesSource, "expected parameter 'rulesSource' to be non-null");
        this.statefulRuleOptions = statefulRuleOptions;
    }

    private RuleGroupArgs() {
        this.ruleVariables = Output.empty();
        this.rulesSource = Output.empty();
        this.statefulRuleOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleVariablesArgs> ruleVariables;
        private Output<RuleGroupRulesSourceArgs> rulesSource;
        private @Nullable Output<RuleGroupStatefulRuleOptionsArgs> statefulRuleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleVariables = defaults.ruleVariables;
    	      this.rulesSource = defaults.rulesSource;
    	      this.statefulRuleOptions = defaults.statefulRuleOptions;
        }

        public Builder ruleVariables(@Nullable Output<RuleGroupRuleVariablesArgs> ruleVariables) {
            this.ruleVariables = ruleVariables;
            return this;
        }
        public Builder ruleVariables(@Nullable RuleGroupRuleVariablesArgs ruleVariables) {
            this.ruleVariables = Output.ofNullable(ruleVariables);
            return this;
        }
        public Builder rulesSource(Output<RuleGroupRulesSourceArgs> rulesSource) {
            this.rulesSource = Objects.requireNonNull(rulesSource);
            return this;
        }
        public Builder rulesSource(RuleGroupRulesSourceArgs rulesSource) {
            this.rulesSource = Output.of(Objects.requireNonNull(rulesSource));
            return this;
        }
        public Builder statefulRuleOptions(@Nullable Output<RuleGroupStatefulRuleOptionsArgs> statefulRuleOptions) {
            this.statefulRuleOptions = statefulRuleOptions;
            return this;
        }
        public Builder statefulRuleOptions(@Nullable RuleGroupStatefulRuleOptionsArgs statefulRuleOptions) {
            this.statefulRuleOptions = Output.ofNullable(statefulRuleOptions);
            return this;
        }        public RuleGroupArgs build() {
            return new RuleGroupArgs(ruleVariables, rulesSource, statefulRuleOptions);
        }
    }
}
