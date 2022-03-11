// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input location
 * 
 */
public final class DatasetS3LocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetS3LocationArgs Empty = new DatasetS3LocationArgs();

    @InputImport(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    @InputImport(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    public DatasetS3LocationArgs(
        Output<String> bucket,
        @Nullable Output<String> key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = key;
    }

    private DatasetS3LocationArgs() {
        this.bucket = Output.empty();
        this.key = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetS3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetS3LocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public DatasetS3LocationArgs build() {
            return new DatasetS3LocationArgs(bucket, key);
        }
    }
}
