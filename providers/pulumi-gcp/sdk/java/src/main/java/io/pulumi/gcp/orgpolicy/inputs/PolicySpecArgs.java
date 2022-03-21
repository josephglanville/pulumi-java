// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySpecArgs Empty = new PolicySpecArgs();

    /**
     * - 
     * An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
     * 
     */
    @Import(name="inheritFromParent")
      private final @Nullable Output<Boolean> inheritFromParent;

    public Output<Boolean> getInheritFromParent() {
        return this.inheritFromParent == null ? Output.empty() : this.inheritFromParent;
    }

    /**
     * Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
     * 
     */
    @Import(name="reset")
      private final @Nullable Output<Boolean> reset;

    public Output<Boolean> getReset() {
        return this.reset == null ? Output.empty() : this.reset;
    }

    /**
     * Up to 10 PolicyRules are allowed. In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<PolicySpecRuleArgs>> rules;

    public Output<List<PolicySpecRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * - 
     * Output only. The time stamp this was previously updated. This represents the last time a call to `CreatePolicy` or `UpdatePolicy` was made for that `Policy`.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    public PolicySpecArgs(
        @Nullable Output<String> etag,
        @Nullable Output<Boolean> inheritFromParent,
        @Nullable Output<Boolean> reset,
        @Nullable Output<List<PolicySpecRuleArgs>> rules,
        @Nullable Output<String> updateTime) {
        this.etag = etag;
        this.inheritFromParent = inheritFromParent;
        this.reset = reset;
        this.rules = rules;
        this.updateTime = updateTime;
    }

    private PolicySpecArgs() {
        this.etag = Output.empty();
        this.inheritFromParent = Output.empty();
        this.reset = Output.empty();
        this.rules = Output.empty();
        this.updateTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<Boolean> inheritFromParent;
        private @Nullable Output<Boolean> reset;
        private @Nullable Output<List<PolicySpecRuleArgs>> rules;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.reset = defaults.reset;
    	      this.rules = defaults.rules;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder inheritFromParent(@Nullable Output<Boolean> inheritFromParent) {
            this.inheritFromParent = inheritFromParent;
            return this;
        }
        public Builder inheritFromParent(@Nullable Boolean inheritFromParent) {
            this.inheritFromParent = Output.ofNullable(inheritFromParent);
            return this;
        }
        public Builder reset(@Nullable Output<Boolean> reset) {
            this.reset = reset;
            return this;
        }
        public Builder reset(@Nullable Boolean reset) {
            this.reset = Output.ofNullable(reset);
            return this;
        }
        public Builder rules(@Nullable Output<List<PolicySpecRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<PolicySpecRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(PolicySpecRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }        public PolicySpecArgs build() {
            return new PolicySpecArgs(etag, inheritFromParent, reset, rules, updateTime);
        }
    }
}
