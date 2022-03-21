// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ReportGroupExportConfigS3DestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportGroupExportConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportGroupExportConfigArgs Empty = new ReportGroupExportConfigArgs();

    /**
     * contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
     * 
     */
    @Import(name="s3Destination")
      private final @Nullable Output<ReportGroupExportConfigS3DestinationArgs> s3Destination;

    public Output<ReportGroupExportConfigS3DestinationArgs> getS3Destination() {
        return this.s3Destination == null ? Output.empty() : this.s3Destination;
    }

    /**
     * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ReportGroupExportConfigArgs(
        @Nullable Output<ReportGroupExportConfigS3DestinationArgs> s3Destination,
        Output<String> type) {
        this.s3Destination = s3Destination;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ReportGroupExportConfigArgs() {
        this.s3Destination = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupExportConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ReportGroupExportConfigS3DestinationArgs> s3Destination;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupExportConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Destination = defaults.s3Destination;
    	      this.type = defaults.type;
        }

        public Builder s3Destination(@Nullable Output<ReportGroupExportConfigS3DestinationArgs> s3Destination) {
            this.s3Destination = s3Destination;
            return this;
        }
        public Builder s3Destination(@Nullable ReportGroupExportConfigS3DestinationArgs s3Destination) {
            this.s3Destination = Output.ofNullable(s3Destination);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ReportGroupExportConfigArgs build() {
            return new ReportGroupExportConfigArgs(s3Destination, type);
        }
    }
}
