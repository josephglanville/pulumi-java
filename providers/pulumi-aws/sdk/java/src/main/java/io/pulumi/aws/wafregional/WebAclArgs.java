// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.wafregional.inputs.WebAclDefaultActionArgs;
import io.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationArgs;
import io.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclArgs Empty = new WebAclArgs();

    /**
     * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
     * 
     */
    @Import(name="defaultAction", required=true)
      private final Output<WebAclDefaultActionArgs> defaultAction;

    public Output<WebAclDefaultActionArgs> getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * Configuration block to enable WAF logging. Detailed below.
     * 
     */
    @Import(name="loggingConfiguration")
      private final @Nullable Output<WebAclLoggingConfigurationArgs> loggingConfiguration;

    public Output<WebAclLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Output.empty() : this.loggingConfiguration;
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
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
      private final @Nullable Output<List<WebAclRuleArgs>> rules;

    public Output<List<WebAclRuleArgs>> getRules() {
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

    public WebAclArgs(
        Output<WebAclDefaultActionArgs> defaultAction,
        @Nullable Output<WebAclLoggingConfigurationArgs> loggingConfiguration,
        Output<String> metricName,
        @Nullable Output<String> name,
        @Nullable Output<List<WebAclRuleArgs>> rules,
        @Nullable Output<Map<String,String>> tags) {
        this.defaultAction = Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.loggingConfiguration = loggingConfiguration;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.name = name;
        this.rules = rules;
        this.tags = tags;
    }

    private WebAclArgs() {
        this.defaultAction = Output.empty();
        this.loggingConfiguration = Output.empty();
        this.metricName = Output.empty();
        this.name = Output.empty();
        this.rules = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<WebAclDefaultActionArgs> defaultAction;
        private @Nullable Output<WebAclLoggingConfigurationArgs> loggingConfiguration;
        private Output<String> metricName;
        private @Nullable Output<String> name;
        private @Nullable Output<List<WebAclRuleArgs>> rules;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder defaultAction(Output<WebAclDefaultActionArgs> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder defaultAction(WebAclDefaultActionArgs defaultAction) {
            this.defaultAction = Output.of(Objects.requireNonNull(defaultAction));
            return this;
        }
        public Builder loggingConfiguration(@Nullable Output<WebAclLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder loggingConfiguration(@Nullable WebAclLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Output.ofNullable(loggingConfiguration);
            return this;
        }
        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
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
        public Builder rules(@Nullable Output<List<WebAclRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<WebAclRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(WebAclRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public WebAclArgs build() {
            return new WebAclArgs(defaultAction, loggingConfiguration, metricName, name, rules, tags);
        }
    }
}
