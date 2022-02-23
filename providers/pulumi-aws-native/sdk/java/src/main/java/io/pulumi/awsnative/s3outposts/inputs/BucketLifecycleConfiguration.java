// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import io.pulumi.awsnative.s3outposts.inputs.BucketRule;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class BucketLifecycleConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketLifecycleConfiguration Empty = new BucketLifecycleConfiguration();

    /**
     * A list of lifecycle rules for individual objects in an Amazon S3Outposts bucket.
     * 
     */
    @InputImport(name="rules", required=true)
      private final List<BucketRule> rules;

    public List<BucketRule> getRules() {
        return this.rules;
    }

    public BucketLifecycleConfiguration(List<BucketRule> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketLifecycleConfiguration() {
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(List<BucketRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public BucketLifecycleConfiguration build() {
            return new BucketLifecycleConfiguration(rules);
        }
    }
}
