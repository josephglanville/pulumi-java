// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class SigningJobSourceS3GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobSourceS3GetArgs Empty = new SigningJobSourceS3GetArgs();

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
     * Key name of the bucket object that contains your unsigned code.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Version of your source image in your version enabled S3 bucket.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public SigningJobSourceS3GetArgs(
        Output<String> bucket,
        Output<String> key,
        Output<String> version) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private SigningJobSourceS3GetArgs() {
        this.bucket = Codegen.empty();
        this.key = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSourceS3GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private Output<String> key;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSourceS3GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
    	      this.version = defaults.version;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public SigningJobSourceS3GetArgs build() {
            return new SigningJobSourceS3GetArgs(bucket, key, version);
        }
    }
}
