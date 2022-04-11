// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs Empty = new BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs();

    /**
     * Number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    @Import(name="daysAfterInitiation", required=true)
      private final Output<Integer> daysAfterInitiation;

    public Output<Integer> getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    public BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs(Output<Integer> daysAfterInitiation) {
        this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation, "expected parameter 'daysAfterInitiation' to be non-null");
    }

    private BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs() {
        this.daysAfterInitiation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> daysAfterInitiation;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterInitiation = defaults.daysAfterInitiation;
        }

        public Builder daysAfterInitiation(Output<Integer> daysAfterInitiation) {
            this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation);
            return this;
        }
        public Builder daysAfterInitiation(Integer daysAfterInitiation) {
            this.daysAfterInitiation = Output.of(Objects.requireNonNull(daysAfterInitiation));
            return this;
        }        public BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs build() {
            return new BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs(daysAfterInitiation);
        }
    }
}
