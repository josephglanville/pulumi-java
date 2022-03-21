// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationState Empty = new BucketLifecycleConfigurationState();

    /**
     * Amazon Resource Name (ARN) of the bucket.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * Configuration block(s) containing lifecycle rules for the bucket.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<BucketLifecycleConfigurationRuleGetArgs>> rules;

    public Output<List<BucketLifecycleConfigurationRuleGetArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    public BucketLifecycleConfigurationState(
        @Nullable Output<String> bucket,
        @Nullable Output<List<BucketLifecycleConfigurationRuleGetArgs>> rules) {
        this.bucket = bucket;
        this.rules = rules;
    }

    private BucketLifecycleConfigurationState() {
        this.bucket = Output.empty();
        this.rules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<List<BucketLifecycleConfigurationRuleGetArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.rules = defaults.rules;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }
        public Builder rules(@Nullable Output<List<BucketLifecycleConfigurationRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<BucketLifecycleConfigurationRuleGetArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(BucketLifecycleConfigurationRuleGetArgs... rules) {
            return rules(List.of(rules));
        }        public BucketLifecycleConfigurationState build() {
            return new BucketLifecycleConfigurationState(bucket, rules);
        }
    }
}
