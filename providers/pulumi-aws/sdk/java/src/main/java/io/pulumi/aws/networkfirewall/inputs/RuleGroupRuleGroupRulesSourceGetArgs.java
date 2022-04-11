// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceGetArgs Empty = new RuleGroupRuleGroupRulesSourceGetArgs();

    /**
     * A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
     */
    @Import(name="rulesSourceList")
      private final @Nullable Output<RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs> rulesSourceList;

    public Output<RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs> getRulesSourceList() {
        return this.rulesSourceList == null ? Codegen.empty() : this.rulesSourceList;
    }

    /**
     * The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
     */
    @Import(name="rulesString")
      private final @Nullable Output<String> rulesString;

    public Output<String> getRulesString() {
        return this.rulesString == null ? Codegen.empty() : this.rulesString;
    }

    /**
     * Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
     */
    @Import(name="statefulRules")
      private final @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs>> statefulRules;

    public Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs>> getStatefulRules() {
        return this.statefulRules == null ? Codegen.empty() : this.statefulRules;
    }

    /**
     * A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
     */
    @Import(name="statelessRulesAndCustomActions")
      private final @Nullable Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs> statelessRulesAndCustomActions;

    public Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs> getStatelessRulesAndCustomActions() {
        return this.statelessRulesAndCustomActions == null ? Codegen.empty() : this.statelessRulesAndCustomActions;
    }

    public RuleGroupRuleGroupRulesSourceGetArgs(
        @Nullable Output<RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs> rulesSourceList,
        @Nullable Output<String> rulesString,
        @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs>> statefulRules,
        @Nullable Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs> statelessRulesAndCustomActions) {
        this.rulesSourceList = rulesSourceList;
        this.rulesString = rulesString;
        this.statefulRules = statefulRules;
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    private RuleGroupRuleGroupRulesSourceGetArgs() {
        this.rulesSourceList = Codegen.empty();
        this.rulesString = Codegen.empty();
        this.statefulRules = Codegen.empty();
        this.statelessRulesAndCustomActions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs> rulesSourceList;
        private @Nullable Output<String> rulesString;
        private @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs>> statefulRules;
        private @Nullable Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs> statelessRulesAndCustomActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesSourceList = defaults.rulesSourceList;
    	      this.rulesString = defaults.rulesString;
    	      this.statefulRules = defaults.statefulRules;
    	      this.statelessRulesAndCustomActions = defaults.statelessRulesAndCustomActions;
        }

        public Builder rulesSourceList(@Nullable Output<RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs> rulesSourceList) {
            this.rulesSourceList = rulesSourceList;
            return this;
        }
        public Builder rulesSourceList(@Nullable RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs rulesSourceList) {
            this.rulesSourceList = Codegen.ofNullable(rulesSourceList);
            return this;
        }
        public Builder rulesString(@Nullable Output<String> rulesString) {
            this.rulesString = rulesString;
            return this;
        }
        public Builder rulesString(@Nullable String rulesString) {
            this.rulesString = Codegen.ofNullable(rulesString);
            return this;
        }
        public Builder statefulRules(@Nullable Output<List<RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs>> statefulRules) {
            this.statefulRules = statefulRules;
            return this;
        }
        public Builder statefulRules(@Nullable List<RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs> statefulRules) {
            this.statefulRules = Codegen.ofNullable(statefulRules);
            return this;
        }
        public Builder statefulRules(RuleGroupRuleGroupRulesSourceStatefulRuleGetArgs... statefulRules) {
            return statefulRules(List.of(statefulRules));
        }
        public Builder statelessRulesAndCustomActions(@Nullable Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs> statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return this;
        }
        public Builder statelessRulesAndCustomActions(@Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = Codegen.ofNullable(statelessRulesAndCustomActions);
            return this;
        }        public RuleGroupRuleGroupRulesSourceGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceGetArgs(rulesSourceList, rulesString, statefulRules, statelessRulesAndCustomActions);
        }
    }
}
