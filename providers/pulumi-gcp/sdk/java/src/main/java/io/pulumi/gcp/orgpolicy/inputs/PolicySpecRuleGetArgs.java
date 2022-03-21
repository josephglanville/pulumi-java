// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleConditionGetArgs;
import io.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleValuesGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySpecRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySpecRuleGetArgs Empty = new PolicySpecRuleGetArgs();

    /**
     * Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="allowAll")
      private final @Nullable Output<String> allowAll;

    public Output<String> getAllowAll() {
        return this.allowAll == null ? Output.empty() : this.allowAll;
    }

    /**
     * A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr' must include from 1 to 10 subexpressions, joined by the "||" or "&&" operators. Each subexpression must be of the form "resource.matchTag('/tag_key_short_name, 'tag_value_short_name')". or "resource.matchTagId('tagKeys/key_id', 'tagValues/value_id')". where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: "resource.matchTag('123456789/environment, 'prod')". or "resource.matchTagId('tagKeys/123', 'tagValues/456')".
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<PolicySpecRuleConditionGetArgs> condition;

    public Output<PolicySpecRuleConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="denyAll")
      private final @Nullable Output<String> denyAll;

    public Output<String> getDenyAll() {
        return this.denyAll == null ? Output.empty() : this.denyAll;
    }

    /**
     * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
     * 
     */
    @Import(name="enforce")
      private final @Nullable Output<String> enforce;

    public Output<String> getEnforce() {
        return this.enforce == null ? Output.empty() : this.enforce;
    }

    /**
     * List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<PolicySpecRuleValuesGetArgs> values;

    public Output<PolicySpecRuleValuesGetArgs> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public PolicySpecRuleGetArgs(
        @Nullable Output<String> allowAll,
        @Nullable Output<PolicySpecRuleConditionGetArgs> condition,
        @Nullable Output<String> denyAll,
        @Nullable Output<String> enforce,
        @Nullable Output<PolicySpecRuleValuesGetArgs> values) {
        this.allowAll = allowAll;
        this.condition = condition;
        this.denyAll = denyAll;
        this.enforce = enforce;
        this.values = values;
    }

    private PolicySpecRuleGetArgs() {
        this.allowAll = Output.empty();
        this.condition = Output.empty();
        this.denyAll = Output.empty();
        this.enforce = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpecRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allowAll;
        private @Nullable Output<PolicySpecRuleConditionGetArgs> condition;
        private @Nullable Output<String> denyAll;
        private @Nullable Output<String> enforce;
        private @Nullable Output<PolicySpecRuleValuesGetArgs> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpecRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAll = defaults.allowAll;
    	      this.condition = defaults.condition;
    	      this.denyAll = defaults.denyAll;
    	      this.enforce = defaults.enforce;
    	      this.values = defaults.values;
        }

        public Builder allowAll(@Nullable Output<String> allowAll) {
            this.allowAll = allowAll;
            return this;
        }
        public Builder allowAll(@Nullable String allowAll) {
            this.allowAll = Output.ofNullable(allowAll);
            return this;
        }
        public Builder condition(@Nullable Output<PolicySpecRuleConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable PolicySpecRuleConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder denyAll(@Nullable Output<String> denyAll) {
            this.denyAll = denyAll;
            return this;
        }
        public Builder denyAll(@Nullable String denyAll) {
            this.denyAll = Output.ofNullable(denyAll);
            return this;
        }
        public Builder enforce(@Nullable Output<String> enforce) {
            this.enforce = enforce;
            return this;
        }
        public Builder enforce(@Nullable String enforce) {
            this.enforce = Output.ofNullable(enforce);
            return this;
        }
        public Builder values(@Nullable Output<PolicySpecRuleValuesGetArgs> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable PolicySpecRuleValuesGetArgs values) {
            this.values = Output.ofNullable(values);
            return this;
        }        public PolicySpecRuleGetArgs build() {
            return new PolicySpecRuleGetArgs(allowAll, condition, denyAll, enforce, values);
        }
    }
}
