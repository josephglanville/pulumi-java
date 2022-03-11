// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupTypeEnum;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupArgs Empty = new RuleGroupArgs();

    @InputImport(name="capacity", required=true)
      private final Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity;
    }

    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @InputImport(name="ruleGroup")
      private final @Nullable Output<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup;

    public Output<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> getRuleGroup() {
        return this.ruleGroup == null ? Output.empty() : this.ruleGroup;
    }

    @InputImport(name="ruleGroupName")
      private final @Nullable Output<String> ruleGroupName;

    public Output<String> getRuleGroupName() {
        return this.ruleGroupName == null ? Output.empty() : this.ruleGroupName;
    }

    @InputImport(name="tags")
      private final @Nullable Output<List<RuleGroupTagArgs>> tags;

    public Output<List<RuleGroupTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @InputImport(name="type", required=true)
      private final Output<RuleGroupTypeEnum> type;

    public Output<RuleGroupTypeEnum> getType() {
        return this.type;
    }

    public RuleGroupArgs(
        Output<Integer> capacity,
        @Nullable Output<String> description,
        @Nullable Output<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup,
        @Nullable Output<String> ruleGroupName,
        @Nullable Output<List<RuleGroupTagArgs>> tags,
        Output<RuleGroupTypeEnum> type) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.description = description;
        this.ruleGroup = ruleGroup;
        this.ruleGroupName = ruleGroupName;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuleGroupArgs() {
        this.capacity = Output.empty();
        this.description = Output.empty();
        this.ruleGroup = Output.empty();
        this.ruleGroupName = Output.empty();
        this.tags = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> capacity;
        private @Nullable Output<String> description;
        private @Nullable Output<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup;
        private @Nullable Output<String> ruleGroupName;
        private @Nullable Output<List<RuleGroupTagArgs>> tags;
        private Output<RuleGroupTypeEnum> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.description = defaults.description;
    	      this.ruleGroup = defaults.ruleGroup;
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder capacity(Output<Integer> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder capacity(Integer capacity) {
            this.capacity = Output.of(Objects.requireNonNull(capacity));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder ruleGroup(@Nullable Output<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup) {
            this.ruleGroup = ruleGroup;
            return this;
        }

        public Builder ruleGroup(@Nullable io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs ruleGroup) {
            this.ruleGroup = Output.ofNullable(ruleGroup);
            return this;
        }

        public Builder ruleGroupName(@Nullable Output<String> ruleGroupName) {
            this.ruleGroupName = ruleGroupName;
            return this;
        }

        public Builder ruleGroupName(@Nullable String ruleGroupName) {
            this.ruleGroupName = Output.ofNullable(ruleGroupName);
            return this;
        }

        public Builder tags(@Nullable Output<List<RuleGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<RuleGroupTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder type(Output<RuleGroupTypeEnum> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(RuleGroupTypeEnum type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public RuleGroupArgs build() {
            return new RuleGroupArgs(capacity, description, ruleGroup, ruleGroupName, tags, type);
        }
    }
}
