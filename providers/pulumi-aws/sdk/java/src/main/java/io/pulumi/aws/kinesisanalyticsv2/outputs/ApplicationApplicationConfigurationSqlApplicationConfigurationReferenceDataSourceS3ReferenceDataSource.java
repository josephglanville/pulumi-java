// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource {
    /**
     * The ARN for the S3 bucket containing the application code.
     * 
     */
    private final String bucketArn;
    /**
     * The file key for the object containing the application code.
     * 
     */
    private final String fileKey;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource(
        @CustomType.Parameter("bucketArn") String bucketArn,
        @CustomType.Parameter("fileKey") String fileKey) {
        this.bucketArn = bucketArn;
        this.fileKey = fileKey;
    }

    /**
     * The ARN for the S3 bucket containing the application code.
     * 
    */
    public String getBucketArn() {
        return this.bucketArn;
    }
    /**
     * The file key for the object containing the application code.
     * 
    */
    public String getFileKey() {
        return this.fileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketArn;
        private String fileKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
        }

        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder fileKey(String fileKey) {
            this.fileKey = Objects.requireNonNull(fileKey);
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource(bucketArn, fileKey);
        }
    }
}