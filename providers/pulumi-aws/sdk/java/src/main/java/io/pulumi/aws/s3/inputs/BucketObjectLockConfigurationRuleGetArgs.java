// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleDefaultRetentionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketObjectLockConfigurationRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockConfigurationRuleGetArgs Empty = new BucketObjectLockConfigurationRuleGetArgs();

    /**
     * The default retention period that you want to apply to new objects placed in this bucket.
     * 
     */
    @Import(name="defaultRetention", required=true)
      private final Output<BucketObjectLockConfigurationRuleDefaultRetentionGetArgs> defaultRetention;

    public Output<BucketObjectLockConfigurationRuleDefaultRetentionGetArgs> getDefaultRetention() {
        return this.defaultRetention;
    }

    public BucketObjectLockConfigurationRuleGetArgs(Output<BucketObjectLockConfigurationRuleDefaultRetentionGetArgs> defaultRetention) {
        this.defaultRetention = Objects.requireNonNull(defaultRetention, "expected parameter 'defaultRetention' to be non-null");
    }

    private BucketObjectLockConfigurationRuleGetArgs() {
        this.defaultRetention = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockConfigurationRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BucketObjectLockConfigurationRuleDefaultRetentionGetArgs> defaultRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockConfigurationRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRetention = defaults.defaultRetention;
        }

        public Builder defaultRetention(Output<BucketObjectLockConfigurationRuleDefaultRetentionGetArgs> defaultRetention) {
            this.defaultRetention = Objects.requireNonNull(defaultRetention);
            return this;
        }
        public Builder defaultRetention(BucketObjectLockConfigurationRuleDefaultRetentionGetArgs defaultRetention) {
            this.defaultRetention = Output.of(Objects.requireNonNull(defaultRetention));
            return this;
        }        public BucketObjectLockConfigurationRuleGetArgs build() {
            return new BucketObjectLockConfigurationRuleGetArgs(defaultRetention);
        }
    }
}
