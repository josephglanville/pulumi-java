// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs();

    /**
     * The ARN for the S3 bucket containing the application code.
     * 
     */
    @Import(name="bucketArn", required=true)
      private final Output<String> bucketArn;

    public Output<String> getBucketArn() {
        return this.bucketArn;
    }

    /**
     * The file key for the object containing the application code.
     * 
     */
    @Import(name="fileKey", required=true)
      private final Output<String> fileKey;

    public Output<String> getFileKey() {
        return this.fileKey;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs(
        Output<String> bucketArn,
        Output<String> fileKey) {
        this.bucketArn = Objects.requireNonNull(bucketArn, "expected parameter 'bucketArn' to be non-null");
        this.fileKey = Objects.requireNonNull(fileKey, "expected parameter 'fileKey' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs() {
        this.bucketArn = Output.empty();
        this.fileKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketArn;
        private Output<String> fileKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
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
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs(bucketArn, fileKey);
        }
    }
}
