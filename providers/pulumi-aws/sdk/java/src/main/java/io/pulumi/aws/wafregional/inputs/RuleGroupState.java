// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupState extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupState Empty = new RuleGroupState();

    /**
     * A list of activated rules, see below
     * 
     */
    @Import(name="activatedRules")
      private final @Nullable Output<List<RuleGroupActivatedRuleGetArgs>> activatedRules;

    public Output<List<RuleGroupActivatedRuleGetArgs>> getActivatedRules() {
        return this.activatedRules == null ? Output.empty() : this.activatedRules;
    }

    /**
     * The ARN of the WAF Regional Rule Group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A friendly name for the metrics from the rule group
     * 
     */
    @Import(name="metricName")
      private final @Nullable Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName == null ? Output.empty() : this.metricName;
    }

    /**
     * A friendly name of the rule group
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public RuleGroupState(
        @Nullable Output<List<RuleGroupActivatedRuleGetArgs>> activatedRules,
        @Nullable Output<String> arn,
        @Nullable Output<String> metricName,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.activatedRules = activatedRules;
        this.arn = arn;
        this.metricName = metricName;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private RuleGroupState() {
        this.activatedRules = Output.empty();
        this.arn = Output.empty();
        this.metricName = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RuleGroupActivatedRuleGetArgs>> activatedRules;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> metricName;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedRules = defaults.activatedRules;
    	      this.arn = defaults.arn;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder activatedRules(@Nullable Output<List<RuleGroupActivatedRuleGetArgs>> activatedRules) {
            this.activatedRules = activatedRules;
            return this;
        }
        public Builder activatedRules(@Nullable List<RuleGroupActivatedRuleGetArgs> activatedRules) {
            this.activatedRules = Output.ofNullable(activatedRules);
            return this;
        }
        public Builder activatedRules(RuleGroupActivatedRuleGetArgs... activatedRules) {
            return activatedRules(List.of(activatedRules));
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder metricName(@Nullable Output<String> metricName) {
            this.metricName = metricName;
            return this;
        }
        public Builder metricName(@Nullable String metricName) {
            this.metricName = Output.ofNullable(metricName);
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
        }        public RuleGroupState build() {
            return new RuleGroupState(activatedRules, arn, metricName, name, tags, tagsAll);
        }
    }
}
