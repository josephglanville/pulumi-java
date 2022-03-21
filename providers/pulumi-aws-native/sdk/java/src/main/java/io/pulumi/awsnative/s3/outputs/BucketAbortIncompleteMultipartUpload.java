// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class BucketAbortIncompleteMultipartUpload {
    /**
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    private final Integer daysAfterInitiation;

    @CustomType.Constructor
    private BucketAbortIncompleteMultipartUpload(@CustomType.Parameter("daysAfterInitiation") Integer daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    /**
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
    */
    public Integer getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAbortIncompleteMultipartUpload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer daysAfterInitiation;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAbortIncompleteMultipartUpload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterInitiation = defaults.daysAfterInitiation;
        }

        public Builder daysAfterInitiation(Integer daysAfterInitiation) {
            this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation);
            return this;
        }        public BucketAbortIncompleteMultipartUpload build() {
            return new BucketAbortIncompleteMultipartUpload(daysAfterInitiation);
        }
    }
}
