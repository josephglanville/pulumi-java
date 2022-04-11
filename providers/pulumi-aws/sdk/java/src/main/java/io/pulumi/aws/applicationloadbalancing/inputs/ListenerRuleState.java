// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionGetArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleState extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleState Empty = new ListenerRuleState();

    /**
     * An Action block. Action blocks are documented below.
     * 
     */
    @Import(name="actions")
      private final @Nullable Output<List<ListenerRuleActionGetArgs>> actions;

    public Output<List<ListenerRuleActionGetArgs>> getActions() {
        return this.actions == null ? Codegen.empty() : this.actions;
    }

    /**
     * The Amazon Resource Name (ARN) of the target group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<ListenerRuleConditionGetArgs>> conditions;

    public Output<List<ListenerRuleConditionGetArgs>> getConditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * The ARN of the listener to which to attach the rule.
     * 
     */
    @Import(name="listenerArn")
      private final @Nullable Output<String> listenerArn;

    public Output<String> getListenerArn() {
        return this.listenerArn == null ? Codegen.empty() : this.listenerArn;
    }

    /**
     * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ListenerRuleState(
        @Nullable Output<List<ListenerRuleActionGetArgs>> actions,
        @Nullable Output<String> arn,
        @Nullable Output<List<ListenerRuleConditionGetArgs>> conditions,
        @Nullable Output<String> listenerArn,
        @Nullable Output<Integer> priority,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.actions = actions;
        this.arn = arn;
        this.conditions = conditions;
        this.listenerArn = listenerArn;
        this.priority = priority;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ListenerRuleState() {
        this.actions = Codegen.empty();
        this.arn = Codegen.empty();
        this.conditions = Codegen.empty();
        this.listenerArn = Codegen.empty();
        this.priority = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ListenerRuleActionGetArgs>> actions;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<ListenerRuleConditionGetArgs>> conditions;
        private @Nullable Output<String> listenerArn;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.arn = defaults.arn;
    	      this.conditions = defaults.conditions;
    	      this.listenerArn = defaults.listenerArn;
    	      this.priority = defaults.priority;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder actions(@Nullable Output<List<ListenerRuleActionGetArgs>> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(@Nullable List<ListenerRuleActionGetArgs> actions) {
            this.actions = Codegen.ofNullable(actions);
            return this;
        }
        public Builder actions(ListenerRuleActionGetArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder conditions(@Nullable Output<List<ListenerRuleConditionGetArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<ListenerRuleConditionGetArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(ListenerRuleConditionGetArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder listenerArn(@Nullable Output<String> listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }
        public Builder listenerArn(@Nullable String listenerArn) {
            this.listenerArn = Codegen.ofNullable(listenerArn);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ListenerRuleState build() {
            return new ListenerRuleState(actions, arn, conditions, listenerArn, priority, tags, tagsAll);
        }
    }
}
