// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleFilterArgs Empty = new BucketReplicationConfigurationRuleFilterArgs();

    /**
     * Object keyname prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * A map of tags that identifies subset of objects to which the rule applies.
     * The rule applies only to objects having all the tags in its tagset.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public BucketReplicationConfigurationRuleFilterArgs(
        @Nullable Output<String> prefix,
        @Nullable Output<Map<String,String>> tags) {
        this.prefix = prefix;
        this.tags = tags;
    }

    private BucketReplicationConfigurationRuleFilterArgs() {
        this.prefix = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> prefix;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public BucketReplicationConfigurationRuleFilterArgs build() {
            return new BucketReplicationConfigurationRuleFilterArgs(prefix, tags);
        }
    }
}
