// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * S3 Output location
 * 
 */
public final class JobS3Location extends io.pulumi.resources.InvokeArgs {

    public static final JobS3Location Empty = new JobS3Location();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @Import(name="bucketOwner")
      private final @Nullable String bucketOwner;

    public Optional<String> getBucketOwner() {
        return this.bucketOwner == null ? Optional.empty() : Optional.ofNullable(this.bucketOwner);
    }

    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    public JobS3Location(
        String bucket,
        @Nullable String bucketOwner,
        @Nullable String key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketOwner = bucketOwner;
        this.key = key;
    }

    private JobS3Location() {
        this.bucket = null;
        this.bucketOwner = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobS3Location defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String bucketOwner;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(JobS3Location defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketOwner = defaults.bucketOwner;
    	      this.key = defaults.key;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucketOwner(@Nullable String bucketOwner) {
            this.bucketOwner = bucketOwner;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }        public JobS3Location build() {
            return new JobS3Location(bucket, bucketOwner, key);
        }
    }
}
