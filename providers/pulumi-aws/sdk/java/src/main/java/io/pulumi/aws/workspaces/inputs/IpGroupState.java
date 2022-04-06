// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.aws.workspaces.inputs.IpGroupRuleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpGroupState extends io.pulumi.resources.ResourceArgs {

    public static final IpGroupState Empty = new IpGroupState();

    /**
     * The description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the IP group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<IpGroupRuleGetArgs>> rules;

    public Output<List<IpGroupRuleGetArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * A map of tags assigned to the WorkSpaces directory. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public IpGroupState(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<IpGroupRuleGetArgs>> rules,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.description = description;
        this.name = name;
        this.rules = rules;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private IpGroupState() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.rules = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<IpGroupRuleGetArgs>> rules;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(IpGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder rules(@Nullable Output<List<IpGroupRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<IpGroupRuleGetArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(IpGroupRuleGetArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public IpGroupState build() {
            return new IpGroupState(description, name, rules, tags, tagsAll);
        }
    }
}