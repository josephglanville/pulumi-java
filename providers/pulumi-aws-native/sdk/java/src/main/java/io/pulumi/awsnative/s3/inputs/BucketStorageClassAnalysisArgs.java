// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketDataExportArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies data related to access patterns to be collected and made available to analyze the tradeoffs between different storage classes for an Amazon S3 bucket.
 * 
 */
public final class BucketStorageClassAnalysisArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketStorageClassAnalysisArgs Empty = new BucketStorageClassAnalysisArgs();

    @Import(name="dataExport")
      private final @Nullable Output<BucketDataExportArgs> dataExport;

    public Output<BucketDataExportArgs> getDataExport() {
        return this.dataExport == null ? Output.empty() : this.dataExport;
    }

    public BucketStorageClassAnalysisArgs(@Nullable Output<BucketDataExportArgs> dataExport) {
        this.dataExport = dataExport;
    }

    private BucketStorageClassAnalysisArgs() {
        this.dataExport = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketStorageClassAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketDataExportArgs> dataExport;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketStorageClassAnalysisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataExport = defaults.dataExport;
        }

        public Builder dataExport(@Nullable Output<BucketDataExportArgs> dataExport) {
            this.dataExport = dataExport;
            return this;
        }
        public Builder dataExport(@Nullable BucketDataExportArgs dataExport) {
            this.dataExport = Output.ofNullable(dataExport);
            return this;
        }        public BucketStorageClassAnalysisArgs build() {
            return new BucketStorageClassAnalysisArgs(dataExport);
        }
    }
}
