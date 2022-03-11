// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.StorageLensCloudWatchMetricsArgs;
import io.pulumi.awsnative.s3.inputs.StorageLensS3BucketDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how Amazon S3 Storage Lens metrics should be exported.
 * 
 */
public final class StorageLensDataExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensDataExportArgs Empty = new StorageLensDataExportArgs();

    @InputImport(name="cloudWatchMetrics")
      private final @Nullable Output<StorageLensCloudWatchMetricsArgs> cloudWatchMetrics;

    public Output<StorageLensCloudWatchMetricsArgs> getCloudWatchMetrics() {
        return this.cloudWatchMetrics == null ? Output.empty() : this.cloudWatchMetrics;
    }

    @InputImport(name="s3BucketDestination")
      private final @Nullable Output<StorageLensS3BucketDestinationArgs> s3BucketDestination;

    public Output<StorageLensS3BucketDestinationArgs> getS3BucketDestination() {
        return this.s3BucketDestination == null ? Output.empty() : this.s3BucketDestination;
    }

    public StorageLensDataExportArgs(
        @Nullable Output<StorageLensCloudWatchMetricsArgs> cloudWatchMetrics,
        @Nullable Output<StorageLensS3BucketDestinationArgs> s3BucketDestination) {
        this.cloudWatchMetrics = cloudWatchMetrics;
        this.s3BucketDestination = s3BucketDestination;
    }

    private StorageLensDataExportArgs() {
        this.cloudWatchMetrics = Output.empty();
        this.s3BucketDestination = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensDataExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StorageLensCloudWatchMetricsArgs> cloudWatchMetrics;
        private @Nullable Output<StorageLensS3BucketDestinationArgs> s3BucketDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensDataExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchMetrics = defaults.cloudWatchMetrics;
    	      this.s3BucketDestination = defaults.s3BucketDestination;
        }

        public Builder cloudWatchMetrics(@Nullable Output<StorageLensCloudWatchMetricsArgs> cloudWatchMetrics) {
            this.cloudWatchMetrics = cloudWatchMetrics;
            return this;
        }

        public Builder cloudWatchMetrics(@Nullable StorageLensCloudWatchMetricsArgs cloudWatchMetrics) {
            this.cloudWatchMetrics = Output.ofNullable(cloudWatchMetrics);
            return this;
        }

        public Builder s3BucketDestination(@Nullable Output<StorageLensS3BucketDestinationArgs> s3BucketDestination) {
            this.s3BucketDestination = s3BucketDestination;
            return this;
        }

        public Builder s3BucketDestination(@Nullable StorageLensS3BucketDestinationArgs s3BucketDestination) {
            this.s3BucketDestination = Output.ofNullable(s3BucketDestination);
            return this;
        }
        public StorageLensDataExportArgs build() {
            return new StorageLensDataExportArgs(cloudWatchMetrics, s3BucketDestination);
        }
    }
}
