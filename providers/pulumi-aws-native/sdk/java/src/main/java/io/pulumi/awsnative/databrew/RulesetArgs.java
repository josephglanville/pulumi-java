// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.databrew.inputs.RulesetRuleArgs;
import io.pulumi.awsnative.databrew.inputs.RulesetTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RulesetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesetArgs Empty = new RulesetArgs();

    /**
     * Description of the Ruleset
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the Ruleset
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * List of the data quality rules in the ruleset
     * 
     */
    @InputImport(name="rules", required=true)
      private final Input<List<RulesetRuleArgs>> rules;

    public Input<List<RulesetRuleArgs>> getRules() {
        return this.rules;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<RulesetTagArgs>> tags;

    public Input<List<RulesetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Arn of the target resource (dataset) to apply the ruleset to
     * 
     */
    @InputImport(name="targetArn", required=true)
      private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public RulesetArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<List<RulesetRuleArgs>> rules,
        @Nullable Input<List<RulesetTagArgs>> tags,
        Input<String> targetArn) {
        this.description = description;
        this.name = name;
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
        this.tags = tags;
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private RulesetArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.rules = Input.empty();
        this.tags = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<List<RulesetRuleArgs>> rules;
        private @Nullable Input<List<RulesetTagArgs>> tags;
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRules(Input<List<RulesetRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<RulesetRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }

        public Builder setTags(@Nullable Input<List<RulesetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<RulesetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }
        public RulesetArgs build() {
            return new RulesetArgs(description, name, rules, tags, targetArn);
        }
    }
}
