// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
    /**
     * The account ID that owns the destination bucket.
     * 
     */
    private final @Nullable String bucketAccountId;
    /**
     * The ARN of the destination bucket.
     * 
     */
    private final String bucketArn;
    /**
     * The output format of exported analytics data. Allowed values: `CSV`. Default value: `CSV`.
     * 
     */
    private final @Nullable String format;
    /**
     * Object prefix for filtering.
     * 
     */
    private final @Nullable String prefix;

    @CustomType.Constructor
    private AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination(
        @CustomType.Parameter("bucketAccountId") @Nullable String bucketAccountId,
        @CustomType.Parameter("bucketArn") String bucketArn,
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("prefix") @Nullable String prefix) {
        this.bucketAccountId = bucketAccountId;
        this.bucketArn = bucketArn;
        this.format = format;
        this.prefix = prefix;
    }

    /**
     * The account ID that owns the destination bucket.
     * 
    */
    public Optional<String> getBucketAccountId() {
        return Optional.ofNullable(this.bucketAccountId);
    }
    /**
     * The ARN of the destination bucket.
     * 
    */
    public String getBucketArn() {
        return this.bucketArn;
    }
    /**
     * The output format of exported analytics data. Allowed values: `CSV`. Default value: `CSV`.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Object prefix for filtering.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketAccountId;
        private String bucketArn;
        private @Nullable String format;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketAccountId = defaults.bucketAccountId;
    	      this.bucketArn = defaults.bucketArn;
    	      this.format = defaults.format;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucketAccountId(@Nullable String bucketAccountId) {
            this.bucketAccountId = bucketAccountId;
            return this;
        }
        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }        public AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination build() {
            return new AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination(bucketAccountId, bucketArn, format, prefix);
        }
    }
}
