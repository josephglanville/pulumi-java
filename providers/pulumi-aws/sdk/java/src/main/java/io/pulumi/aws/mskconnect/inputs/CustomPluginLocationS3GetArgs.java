// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomPluginLocationS3GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomPluginLocationS3GetArgs Empty = new CustomPluginLocationS3GetArgs();

    /**
     * The Amazon Resource Name (ARN) of an S3 bucket.
     * 
     */
    @Import(name="bucketArn", required=true)
      private final Output<String> bucketArn;

    public Output<String> getBucketArn() {
        return this.bucketArn;
    }

    /**
     * The file key for an object in an S3 bucket.
     * 
     */
    @Import(name="fileKey", required=true)
      private final Output<String> fileKey;

    public Output<String> getFileKey() {
        return this.fileKey;
    }

    /**
     * The version of an object in an S3 bucket.
     * 
     */
    @Import(name="objectVersion")
      private final @Nullable Output<String> objectVersion;

    public Output<String> getObjectVersion() {
        return this.objectVersion == null ? Output.empty() : this.objectVersion;
    }

    public CustomPluginLocationS3GetArgs(
        Output<String> bucketArn,
        Output<String> fileKey,
        @Nullable Output<String> objectVersion) {
        this.bucketArn = Objects.requireNonNull(bucketArn, "expected parameter 'bucketArn' to be non-null");
        this.fileKey = Objects.requireNonNull(fileKey, "expected parameter 'fileKey' to be non-null");
        this.objectVersion = objectVersion;
    }

    private CustomPluginLocationS3GetArgs() {
        this.bucketArn = Output.empty();
        this.fileKey = Output.empty();
        this.objectVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomPluginLocationS3GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketArn;
        private Output<String> fileKey;
        private @Nullable Output<String> objectVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomPluginLocationS3GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
    	      this.objectVersion = defaults.objectVersion;
        }

        public Builder bucketArn(Output<String> bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Output.of(Objects.requireNonNull(bucketArn));
            return this;
        }
        public Builder fileKey(Output<String> fileKey) {
            this.fileKey = Objects.requireNonNull(fileKey);
            return this;
        }
        public Builder fileKey(String fileKey) {
            this.fileKey = Output.of(Objects.requireNonNull(fileKey));
            return this;
        }
        public Builder objectVersion(@Nullable Output<String> objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public Builder objectVersion(@Nullable String objectVersion) {
            this.objectVersion = Output.ofNullable(objectVersion);
            return this;
        }        public CustomPluginLocationS3GetArgs build() {
            return new CustomPluginLocationS3GetArgs(bucketArn, fileKey, objectVersion);
        }
    }
}
