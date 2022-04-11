// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersS3ManifestFileLocationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersS3ManifestFileLocationGetArgs Empty = new DataSourceParametersS3ManifestFileLocationGetArgs();

    /**
     * The name of the bucket that contains the manifest file.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * The key of the manifest file within the bucket.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    public DataSourceParametersS3ManifestFileLocationGetArgs(
        Output<String> bucket,
        Output<String> key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private DataSourceParametersS3ManifestFileLocationGetArgs() {
        this.bucket = Codegen.empty();
        this.key = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersS3ManifestFileLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private Output<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersS3ManifestFileLocationGetArgs defaults) {
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
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }        public DataSourceParametersS3ManifestFileLocationGetArgs build() {
            return new DataSourceParametersS3ManifestFileLocationGetArgs(bucket, key);
        }
    }
}
