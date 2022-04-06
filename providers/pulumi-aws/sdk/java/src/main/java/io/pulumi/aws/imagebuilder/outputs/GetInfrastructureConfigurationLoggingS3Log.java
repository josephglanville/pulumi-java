// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInfrastructureConfigurationLoggingS3Log {
    /**
     * Name of the S3 Bucket for logging.
     * 
     */
    private final String s3BucketName;
    /**
     * Key prefix for S3 Bucket logging.
     * 
     */
    private final String s3KeyPrefix;

    @CustomType.Constructor
    private GetInfrastructureConfigurationLoggingS3Log(
        @CustomType.Parameter("s3BucketName") String s3BucketName,
        @CustomType.Parameter("s3KeyPrefix") String s3KeyPrefix) {
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * Name of the S3 Bucket for logging.
     * 
    */
    public String getS3BucketName() {
        return this.s3BucketName;
    }
    /**
     * Key prefix for S3 Bucket logging.
     * 
    */
    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationLoggingS3Log defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String s3BucketName;
        private String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationLoggingS3Log defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }
        public Builder s3KeyPrefix(String s3KeyPrefix) {
            this.s3KeyPrefix = Objects.requireNonNull(s3KeyPrefix);
            return this;
        }        public GetInfrastructureConfigurationLoggingS3Log build() {
            return new GetInfrastructureConfigurationLoggingS3Log(s3BucketName, s3KeyPrefix);
        }
    }
}