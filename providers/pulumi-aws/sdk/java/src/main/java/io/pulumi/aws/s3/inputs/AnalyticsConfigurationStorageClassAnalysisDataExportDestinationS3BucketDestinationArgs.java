// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs Empty = new AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs();

    /**
     * The account ID that owns the destination bucket.
     * 
     */
    @Import(name="bucketAccountId")
      private final @Nullable Output<String> bucketAccountId;

    public Output<String> getBucketAccountId() {
        return this.bucketAccountId == null ? Codegen.empty() : this.bucketAccountId;
    }

    /**
     * The ARN of the destination bucket.
     * 
     */
    @Import(name="bucketArn", required=true)
      private final Output<String> bucketArn;

    public Output<String> getBucketArn() {
        return this.bucketArn;
    }

    /**
     * The output format of exported analytics data. Allowed values: `CSV`. Default value: `CSV`.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<String> format;

    public Output<String> getFormat() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * Object prefix for filtering.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    public AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs(
        @Nullable Output<String> bucketAccountId,
        Output<String> bucketArn,
        @Nullable Output<String> format,
        @Nullable Output<String> prefix) {
        this.bucketAccountId = bucketAccountId;
        this.bucketArn = Objects.requireNonNull(bucketArn, "expected parameter 'bucketArn' to be non-null");
        this.format = format;
        this.prefix = prefix;
    }

    private AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs() {
        this.bucketAccountId = Codegen.empty();
        this.bucketArn = Codegen.empty();
        this.format = Codegen.empty();
        this.prefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketAccountId;
        private Output<String> bucketArn;
        private @Nullable Output<String> format;
        private @Nullable Output<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketAccountId = defaults.bucketAccountId;
    	      this.bucketArn = defaults.bucketArn;
    	      this.format = defaults.format;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucketAccountId(@Nullable Output<String> bucketAccountId) {
            this.bucketAccountId = bucketAccountId;
            return this;
        }
        public Builder bucketAccountId(@Nullable String bucketAccountId) {
            this.bucketAccountId = Codegen.ofNullable(bucketAccountId);
            return this;
        }
        public Builder bucketArn(Output<String> bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Output.of(Objects.requireNonNull(bucketArn));
            return this;
        }
        public Builder format(@Nullable Output<String> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }        public AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs build() {
            return new AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs(bucketAccountId, bucketArn, format, prefix);
        }
    }
}
