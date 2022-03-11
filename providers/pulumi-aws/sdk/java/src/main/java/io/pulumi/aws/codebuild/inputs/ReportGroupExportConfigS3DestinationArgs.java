// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportGroupExportConfigS3DestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportGroupExportConfigS3DestinationArgs Empty = new ReportGroupExportConfigS3DestinationArgs();

    /**
     * The name of the S3 bucket where the raw data of a report are exported.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * A boolean value that specifies if the results of a report are encrypted.
     * **Note: the API does not currently allow setting encryption as disabled**
     * 
     */
    @InputImport(name="encryptionDisabled")
      private final @Nullable Output<Boolean> encryptionDisabled;

    public Output<Boolean> getEncryptionDisabled() {
        return this.encryptionDisabled == null ? Output.empty() : this.encryptionDisabled;
    }

    /**
     * The encryption key for the report's encrypted raw data. The KMS key ARN.
     * 
     */
    @InputImport(name="encryptionKey", required=true)
      private final Output<String> encryptionKey;

    public Output<String> getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
     * 
     */
    @InputImport(name="packaging")
      private final @Nullable Output<String> packaging;

    public Output<String> getPackaging() {
        return this.packaging == null ? Output.empty() : this.packaging;
    }

    /**
     * The path to the exported report's raw data results.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    public ReportGroupExportConfigS3DestinationArgs(
        Output<String> bucket,
        @Nullable Output<Boolean> encryptionDisabled,
        Output<String> encryptionKey,
        @Nullable Output<String> packaging,
        @Nullable Output<String> path) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.encryptionDisabled = encryptionDisabled;
        this.encryptionKey = Objects.requireNonNull(encryptionKey, "expected parameter 'encryptionKey' to be non-null");
        this.packaging = packaging;
        this.path = path;
    }

    private ReportGroupExportConfigS3DestinationArgs() {
        this.bucket = Output.empty();
        this.encryptionDisabled = Output.empty();
        this.encryptionKey = Output.empty();
        this.packaging = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupExportConfigS3DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<Boolean> encryptionDisabled;
        private Output<String> encryptionKey;
        private @Nullable Output<String> packaging;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupExportConfigS3DestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.encryptionDisabled = defaults.encryptionDisabled;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.packaging = defaults.packaging;
    	      this.path = defaults.path;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder encryptionDisabled(@Nullable Output<Boolean> encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }

        public Builder encryptionDisabled(@Nullable Boolean encryptionDisabled) {
            this.encryptionDisabled = Output.ofNullable(encryptionDisabled);
            return this;
        }

        public Builder encryptionKey(Output<String> encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }

        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Output.of(Objects.requireNonNull(encryptionKey));
            return this;
        }

        public Builder packaging(@Nullable Output<String> packaging) {
            this.packaging = packaging;
            return this;
        }

        public Builder packaging(@Nullable String packaging) {
            this.packaging = Output.ofNullable(packaging);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public ReportGroupExportConfigS3DestinationArgs build() {
            return new ReportGroupExportConfigS3DestinationArgs(bucket, encryptionDisabled, encryptionKey, packaging, path);
        }
    }
}
