// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class S3LocationS3ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final S3LocationS3ConfigArgs Empty = new S3LocationS3ConfigArgs();

    /**
     * Amazon Resource Names (ARN) of the IAM Role used to connect to the S3 Bucket.
     * 
     */
    @Import(name="bucketAccessRoleArn", required=true)
      private final Output<String> bucketAccessRoleArn;

    public Output<String> getBucketAccessRoleArn() {
        return this.bucketAccessRoleArn;
    }

    public S3LocationS3ConfigArgs(Output<String> bucketAccessRoleArn) {
        this.bucketAccessRoleArn = Objects.requireNonNull(bucketAccessRoleArn, "expected parameter 'bucketAccessRoleArn' to be non-null");
    }

    private S3LocationS3ConfigArgs() {
        this.bucketAccessRoleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(S3LocationS3ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketAccessRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(S3LocationS3ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketAccessRoleArn = defaults.bucketAccessRoleArn;
        }

        public Builder bucketAccessRoleArn(Output<String> bucketAccessRoleArn) {
            this.bucketAccessRoleArn = Objects.requireNonNull(bucketAccessRoleArn);
            return this;
        }
        public Builder bucketAccessRoleArn(String bucketAccessRoleArn) {
            this.bucketAccessRoleArn = Output.of(Objects.requireNonNull(bucketAccessRoleArn));
            return this;
        }        public S3LocationS3ConfigArgs build() {
            return new S3LocationS3ConfigArgs(bucketAccessRoleArn);
        }
    }
}
