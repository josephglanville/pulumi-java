// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.RateBasedRulePredicateGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RateBasedRuleState extends io.pulumi.resources.ResourceArgs {

    public static final RateBasedRuleState Empty = new RateBasedRuleState();

    /**
     * The ARN of the WAF Regional Rate Based Rule.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Import(name="metricName")
      private final @Nullable Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName == null ? Output.empty() : this.metricName;
    }

    /**
     * The name or description of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @Import(name="predicates")
      private final @Nullable Output<List<RateBasedRulePredicateGetArgs>> predicates;

    public Output<List<RateBasedRulePredicateGetArgs>> getPredicates() {
        return this.predicates == null ? Output.empty() : this.predicates;
    }

    /**
     * Valid value is IP.
     * 
     */
    @Import(name="rateKey")
      private final @Nullable Output<String> rateKey;

    public Output<String> getRateKey() {
        return this.rateKey == null ? Output.empty() : this.rateKey;
    }

    /**
     * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
     * 
     */
    @Import(name="rateLimit")
      private final @Nullable Output<Integer> rateLimit;

    public Output<Integer> getRateLimit() {
        return this.rateLimit == null ? Output.empty() : this.rateLimit;
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

    public RateBasedRuleState(
        @Nullable Output<String> arn,
        @Nullable Output<String> metricName,
        @Nullable Output<String> name,
        @Nullable Output<List<RateBasedRulePredicateGetArgs>> predicates,
        @Nullable Output<String> rateKey,
        @Nullable Output<Integer> rateLimit,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.metricName = metricName;
        this.name = name;
        this.predicates = predicates;
        this.rateKey = rateKey;
        this.rateLimit = rateLimit;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private RateBasedRuleState() {
        this.arn = Output.empty();
        this.metricName = Output.empty();
        this.name = Output.empty();
        this.predicates = Output.empty();
        this.rateKey = Output.empty();
        this.rateLimit = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateBasedRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> metricName;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RateBasedRulePredicateGetArgs>> predicates;
        private @Nullable Output<String> rateKey;
        private @Nullable Output<Integer> rateLimit;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(RateBasedRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.predicates = defaults.predicates;
    	      this.rateKey = defaults.rateKey;
    	      this.rateLimit = defaults.rateLimit;
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
        public Builder predicates(@Nullable Output<List<RateBasedRulePredicateGetArgs>> predicates) {
            this.predicates = predicates;
            return this;
        }
        public Builder predicates(@Nullable List<RateBasedRulePredicateGetArgs> predicates) {
            this.predicates = Output.ofNullable(predicates);
            return this;
        }
        public Builder predicates(RateBasedRulePredicateGetArgs... predicates) {
            return predicates(List.of(predicates));
        }
        public Builder rateKey(@Nullable Output<String> rateKey) {
            this.rateKey = rateKey;
            return this;
        }
        public Builder rateKey(@Nullable String rateKey) {
            this.rateKey = Output.ofNullable(rateKey);
            return this;
        }
        public Builder rateLimit(@Nullable Output<Integer> rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public Builder rateLimit(@Nullable Integer rateLimit) {
            this.rateLimit = Output.ofNullable(rateLimit);
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
        }        public RateBasedRuleState build() {
            return new RateBasedRuleState(arn, metricName, name, predicates, rateKey, rateLimit, tags, tagsAll);
        }
    }
}
