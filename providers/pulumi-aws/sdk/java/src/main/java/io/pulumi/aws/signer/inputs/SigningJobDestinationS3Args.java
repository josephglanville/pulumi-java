// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningJobDestinationS3Args extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobDestinationS3Args Empty = new SigningJobDestinationS3Args();

    /**
     * Name of the S3 bucket.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    public SigningJobDestinationS3Args(
        Output<String> bucket,
        @Nullable Output<String> prefix) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.prefix = prefix;
    }

    private SigningJobDestinationS3Args() {
        this.bucket = Output.empty();
        this.prefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobDestinationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobDestinationS3Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }        public SigningJobDestinationS3Args build() {
            return new SigningJobDestinationS3Args(bucket, prefix);
        }
    }
}
