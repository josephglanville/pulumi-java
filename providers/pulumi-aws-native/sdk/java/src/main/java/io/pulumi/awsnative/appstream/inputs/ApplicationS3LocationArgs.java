// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationS3LocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationS3LocationArgs Empty = new ApplicationS3LocationArgs();

    @Import(name="s3Bucket", required=true)
      private final Output<String> s3Bucket;

    public Output<String> getS3Bucket() {
        return this.s3Bucket;
    }

    @Import(name="s3Key", required=true)
      private final Output<String> s3Key;

    public Output<String> getS3Key() {
        return this.s3Key;
    }

    public ApplicationS3LocationArgs(
        Output<String> s3Bucket,
        Output<String> s3Key) {
        this.s3Bucket = Objects.requireNonNull(s3Bucket, "expected parameter 's3Bucket' to be non-null");
        this.s3Key = Objects.requireNonNull(s3Key, "expected parameter 's3Key' to be non-null");
    }

    private ApplicationS3LocationArgs() {
        this.s3Bucket = Output.empty();
        this.s3Key = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationS3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> s3Bucket;
        private Output<String> s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationS3LocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
        }

        public Builder s3Bucket(Output<String> s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }
        public Builder s3Bucket(String s3Bucket) {
            this.s3Bucket = Output.of(Objects.requireNonNull(s3Bucket));
            return this;
        }
        public Builder s3Key(Output<String> s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }
        public Builder s3Key(String s3Key) {
            this.s3Key = Output.of(Objects.requireNonNull(s3Key));
            return this;
        }        public ApplicationS3LocationArgs build() {
            return new ApplicationS3LocationArgs(s3Bucket, s3Key);
        }
    }
}
