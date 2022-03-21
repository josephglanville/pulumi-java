// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.WebAclDefaultActionGetArgs;
import io.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationGetArgs;
import io.pulumi.aws.wafregional.inputs.WebAclRuleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclState extends io.pulumi.resources.ResourceArgs {

    public static final WebAclState Empty = new WebAclState();

    /**
     * Amazon Resource Name (ARN) of the WAF Regional WebACL.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
     * 
     */
    @Import(name="defaultAction")
      private final @Nullable Output<WebAclDefaultActionGetArgs> defaultAction;

    public Output<WebAclDefaultActionGetArgs> getDefaultAction() {
        return this.defaultAction == null ? Output.empty() : this.defaultAction;
    }

    /**
     * Configuration block to enable WAF logging. Detailed below.
     * 
     */
    @Import(name="loggingConfiguration")
      private final @Nullable Output<WebAclLoggingConfigurationGetArgs> loggingConfiguration;

    public Output<WebAclLoggingConfigurationGetArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Output.empty() : this.loggingConfiguration;
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    @Import(name="metricName")
      private final @Nullable Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName == null ? Output.empty() : this.metricName;
    }

    /**
     * The name or description of the web ACL.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Set of configuration blocks containing rules for the web ACL. Detailed below.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<WebAclRuleGetArgs>> rules;

    public Output<List<WebAclRuleGetArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
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

    public WebAclState(
        @Nullable Output<String> arn,
        @Nullable Output<WebAclDefaultActionGetArgs> defaultAction,
        @Nullable Output<WebAclLoggingConfigurationGetArgs> loggingConfiguration,
        @Nullable Output<String> metricName,
        @Nullable Output<String> name,
        @Nullable Output<List<WebAclRuleGetArgs>> rules,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.defaultAction = defaultAction;
        this.loggingConfiguration = loggingConfiguration;
        this.metricName = metricName;
        this.name = name;
        this.rules = rules;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private WebAclState() {
        this.arn = Output.empty();
        this.defaultAction = Output.empty();
        this.loggingConfiguration = Output.empty();
        this.metricName = Output.empty();
        this.name = Output.empty();
        this.rules = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<WebAclDefaultActionGetArgs> defaultAction;
        private @Nullable Output<WebAclLoggingConfigurationGetArgs> loggingConfiguration;
        private @Nullable Output<String> metricName;
        private @Nullable Output<String> name;
        private @Nullable Output<List<WebAclRuleGetArgs>> rules;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultAction = defaults.defaultAction;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder defaultAction(@Nullable Output<WebAclDefaultActionGetArgs> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public Builder defaultAction(@Nullable WebAclDefaultActionGetArgs defaultAction) {
            this.defaultAction = Output.ofNullable(defaultAction);
            return this;
        }
        public Builder loggingConfiguration(@Nullable Output<WebAclLoggingConfigurationGetArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder loggingConfiguration(@Nullable WebAclLoggingConfigurationGetArgs loggingConfiguration) {
            this.loggingConfiguration = Output.ofNullable(loggingConfiguration);
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
        public Builder rules(@Nullable Output<List<WebAclRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<WebAclRuleGetArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(WebAclRuleGetArgs... rules) {
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
        }        public WebAclState build() {
            return new WebAclState(arn, defaultAction, loggingConfiguration, metricName, name, rules, tags, tagsAll);
        }
    }
}
