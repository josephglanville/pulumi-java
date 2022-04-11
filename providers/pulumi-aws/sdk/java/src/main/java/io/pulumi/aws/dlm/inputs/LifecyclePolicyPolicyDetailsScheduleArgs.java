// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs;
import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs;
import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyPolicyDetailsScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleArgs Empty = new LifecyclePolicyPolicyDetailsScheduleArgs();

    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    @Import(name="copyTags")
      private final @Nullable Output<Boolean> copyTags;

    public Output<Boolean> getCopyTags() {
        return this.copyTags == null ? Codegen.empty() : this.copyTags;
    }

    /**
     * See the `create_rule` block. Max of 1 per schedule.
     * 
     */
    @Import(name="createRule", required=true)
      private final Output<LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs> createRule;

    public Output<LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs> getCreateRule() {
        return this.createRule;
    }

    /**
     * See the `cross_region_copy_rule` block. Max of 3 per schedule.
     * 
     */
    @Import(name="crossRegionCopyRules")
      private final @Nullable Output<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs>> crossRegionCopyRules;

    public Output<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs>> getCrossRegionCopyRules() {
        return this.crossRegionCopyRules == null ? Codegen.empty() : this.crossRegionCopyRules;
    }

    /**
     * A name for the schedule.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    @Import(name="retainRule", required=true)
      private final Output<LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs> retainRule;

    public Output<LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs> getRetainRule() {
        return this.retainRule;
    }

    /**
     * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
     * 
     */
    @Import(name="tagsToAdd")
      private final @Nullable Output<Map<String,String>> tagsToAdd;

    public Output<Map<String,String>> getTagsToAdd() {
        return this.tagsToAdd == null ? Codegen.empty() : this.tagsToAdd;
    }

    public LifecyclePolicyPolicyDetailsScheduleArgs(
        @Nullable Output<Boolean> copyTags,
        Output<LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs> createRule,
        @Nullable Output<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs>> crossRegionCopyRules,
        Output<String> name,
        Output<LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs> retainRule,
        @Nullable Output<Map<String,String>> tagsToAdd) {
        this.copyTags = copyTags;
        this.createRule = Objects.requireNonNull(createRule, "expected parameter 'createRule' to be non-null");
        this.crossRegionCopyRules = crossRegionCopyRules;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.retainRule = Objects.requireNonNull(retainRule, "expected parameter 'retainRule' to be non-null");
        this.tagsToAdd = tagsToAdd;
    }

    private LifecyclePolicyPolicyDetailsScheduleArgs() {
        this.copyTags = Codegen.empty();
        this.createRule = Codegen.empty();
        this.crossRegionCopyRules = Codegen.empty();
        this.name = Codegen.empty();
        this.retainRule = Codegen.empty();
        this.tagsToAdd = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> copyTags;
        private Output<LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs> createRule;
        private @Nullable Output<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs>> crossRegionCopyRules;
        private Output<String> name;
        private Output<LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs> retainRule;
        private @Nullable Output<Map<String,String>> tagsToAdd;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyTags = defaults.copyTags;
    	      this.createRule = defaults.createRule;
    	      this.crossRegionCopyRules = defaults.crossRegionCopyRules;
    	      this.name = defaults.name;
    	      this.retainRule = defaults.retainRule;
    	      this.tagsToAdd = defaults.tagsToAdd;
        }

        public Builder copyTags(@Nullable Output<Boolean> copyTags) {
            this.copyTags = copyTags;
            return this;
        }
        public Builder copyTags(@Nullable Boolean copyTags) {
            this.copyTags = Codegen.ofNullable(copyTags);
            return this;
        }
        public Builder createRule(Output<LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs> createRule) {
            this.createRule = Objects.requireNonNull(createRule);
            return this;
        }
        public Builder createRule(LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs createRule) {
            this.createRule = Output.of(Objects.requireNonNull(createRule));
            return this;
        }
        public Builder crossRegionCopyRules(@Nullable Output<List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs>> crossRegionCopyRules) {
            this.crossRegionCopyRules = crossRegionCopyRules;
            return this;
        }
        public Builder crossRegionCopyRules(@Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs> crossRegionCopyRules) {
            this.crossRegionCopyRules = Codegen.ofNullable(crossRegionCopyRules);
            return this;
        }
        public Builder crossRegionCopyRules(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs... crossRegionCopyRules) {
            return crossRegionCopyRules(List.of(crossRegionCopyRules));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder retainRule(Output<LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs> retainRule) {
            this.retainRule = Objects.requireNonNull(retainRule);
            return this;
        }
        public Builder retainRule(LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs retainRule) {
            this.retainRule = Output.of(Objects.requireNonNull(retainRule));
            return this;
        }
        public Builder tagsToAdd(@Nullable Output<Map<String,String>> tagsToAdd) {
            this.tagsToAdd = tagsToAdd;
            return this;
        }
        public Builder tagsToAdd(@Nullable Map<String,String> tagsToAdd) {
            this.tagsToAdd = Codegen.ofNullable(tagsToAdd);
            return this;
        }        public LifecyclePolicyPolicyDetailsScheduleArgs build() {
            return new LifecyclePolicyPolicyDetailsScheduleArgs(copyTags, createRule, crossRegionCopyRules, name, retainRule, tagsToAdd);
        }
    }
}
