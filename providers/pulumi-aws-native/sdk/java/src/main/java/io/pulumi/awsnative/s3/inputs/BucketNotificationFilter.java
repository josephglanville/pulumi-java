// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketS3KeyFilter;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Specifies object key name filtering rules.
 * 
 */
public final class BucketNotificationFilter extends io.pulumi.resources.InvokeArgs {

    public static final BucketNotificationFilter Empty = new BucketNotificationFilter();

    @Import(name="s3Key", required=true)
      private final BucketS3KeyFilter s3Key;

    public BucketS3KeyFilter getS3Key() {
        return this.s3Key;
    }

    public BucketNotificationFilter(BucketS3KeyFilter s3Key) {
        this.s3Key = Objects.requireNonNull(s3Key, "expected parameter 's3Key' to be non-null");
    }

    private BucketNotificationFilter() {
        this.s3Key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketS3KeyFilter s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Key = defaults.s3Key;
        }

        public Builder s3Key(BucketS3KeyFilter s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }        public BucketNotificationFilter build() {
            return new BucketNotificationFilter(s3Key);
        }
    }
}
