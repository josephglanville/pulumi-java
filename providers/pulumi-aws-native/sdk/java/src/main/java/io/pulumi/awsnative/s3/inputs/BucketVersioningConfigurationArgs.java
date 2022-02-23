// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketVersioningConfigurationStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Describes the versioning state of an Amazon S3 bucket.
 * 
 */
public final class BucketVersioningConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketVersioningConfigurationArgs Empty = new BucketVersioningConfigurationArgs();

    /**
     * The versioning state of the bucket.
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<BucketVersioningConfigurationStatus> status;

    public Input<BucketVersioningConfigurationStatus> getStatus() {
        return this.status;
    }

    public BucketVersioningConfigurationArgs(Input<BucketVersioningConfigurationStatus> status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketVersioningConfigurationArgs() {
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketVersioningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketVersioningConfigurationStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketVersioningConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(Input<BucketVersioningConfigurationStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(BucketVersioningConfigurationStatus status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public BucketVersioningConfigurationArgs build() {
            return new BucketVersioningConfigurationArgs(status);
        }
    }
}
