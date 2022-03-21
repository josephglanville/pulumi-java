// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cur;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportDefinitionArgs Empty = new ReportDefinitionArgs();

    /**
     * A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and report_versioning must be `OVERWRITE_REPORT`.
     * 
     */
    @Import(name="additionalArtifacts")
      private final @Nullable Output<List<String>> additionalArtifacts;

    public Output<List<String>> getAdditionalArtifacts() {
        return this.additionalArtifacts == null ? Output.empty() : this.additionalArtifacts;
    }

    /**
     * A list of schema elements. Valid values are: `RESOURCES`.
     * 
     */
    @Import(name="additionalSchemaElements", required=true)
      private final Output<List<String>> additionalSchemaElements;

    public Output<List<String>> getAdditionalSchemaElements() {
        return this.additionalSchemaElements;
    }

    /**
     * Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
     * 
     */
    @Import(name="compression", required=true)
      private final Output<String> compression;

    public Output<String> getCompression() {
        return this.compression;
    }

    /**
     * Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
     * 
     */
    @Import(name="format", required=true)
      private final Output<String> format;

    public Output<String> getFormat() {
        return this.format;
    }

    /**
     * Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
     * 
     */
    @Import(name="refreshClosedReports")
      private final @Nullable Output<Boolean> refreshClosedReports;

    public Output<Boolean> getRefreshClosedReports() {
        return this.refreshClosedReports == null ? Output.empty() : this.refreshClosedReports;
    }

    /**
     * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
     * 
     */
    @Import(name="reportName", required=true)
      private final Output<String> reportName;

    public Output<String> getReportName() {
        return this.reportName;
    }

    /**
     * Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
     * 
     */
    @Import(name="reportVersioning")
      private final @Nullable Output<String> reportVersioning;

    public Output<String> getReportVersioning() {
        return this.reportVersioning == null ? Output.empty() : this.reportVersioning;
    }

    /**
     * Name of the existing S3 bucket to hold generated reports.
     * 
     */
    @Import(name="s3Bucket", required=true)
      private final Output<String> s3Bucket;

    public Output<String> getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * Report path prefix. Limited to 256 characters.
     * 
     */
    @Import(name="s3Prefix")
      private final @Nullable Output<String> s3Prefix;

    public Output<String> getS3Prefix() {
        return this.s3Prefix == null ? Output.empty() : this.s3Prefix;
    }

    /**
     * Region of the existing S3 bucket to hold generated reports.
     * 
     */
    @Import(name="s3Region", required=true)
      private final Output<String> s3Region;

    public Output<String> getS3Region() {
        return this.s3Region;
    }

    /**
     * The frequency on which report data are measured and displayed.  Valid values are: `HOURLY`, `DAILY`.
     * 
     */
    @Import(name="timeUnit", required=true)
      private final Output<String> timeUnit;

    public Output<String> getTimeUnit() {
        return this.timeUnit;
    }

    public ReportDefinitionArgs(
        @Nullable Output<List<String>> additionalArtifacts,
        Output<List<String>> additionalSchemaElements,
        Output<String> compression,
        Output<String> format,
        @Nullable Output<Boolean> refreshClosedReports,
        Output<String> reportName,
        @Nullable Output<String> reportVersioning,
        Output<String> s3Bucket,
        @Nullable Output<String> s3Prefix,
        Output<String> s3Region,
        Output<String> timeUnit) {
        this.additionalArtifacts = additionalArtifacts;
        this.additionalSchemaElements = Objects.requireNonNull(additionalSchemaElements, "expected parameter 'additionalSchemaElements' to be non-null");
        this.compression = Objects.requireNonNull(compression, "expected parameter 'compression' to be non-null");
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.refreshClosedReports = refreshClosedReports;
        this.reportName = Objects.requireNonNull(reportName, "expected parameter 'reportName' to be non-null");
        this.reportVersioning = reportVersioning;
        this.s3Bucket = Objects.requireNonNull(s3Bucket, "expected parameter 's3Bucket' to be non-null");
        this.s3Prefix = s3Prefix;
        this.s3Region = Objects.requireNonNull(s3Region, "expected parameter 's3Region' to be non-null");
        this.timeUnit = Objects.requireNonNull(timeUnit, "expected parameter 'timeUnit' to be non-null");
    }

    private ReportDefinitionArgs() {
        this.additionalArtifacts = Output.empty();
        this.additionalSchemaElements = Output.empty();
        this.compression = Output.empty();
        this.format = Output.empty();
        this.refreshClosedReports = Output.empty();
        this.reportName = Output.empty();
        this.reportVersioning = Output.empty();
        this.s3Bucket = Output.empty();
        this.s3Prefix = Output.empty();
        this.s3Region = Output.empty();
        this.timeUnit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> additionalArtifacts;
        private Output<List<String>> additionalSchemaElements;
        private Output<String> compression;
        private Output<String> format;
        private @Nullable Output<Boolean> refreshClosedReports;
        private Output<String> reportName;
        private @Nullable Output<String> reportVersioning;
        private Output<String> s3Bucket;
        private @Nullable Output<String> s3Prefix;
        private Output<String> s3Region;
        private Output<String> timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalArtifacts = defaults.additionalArtifacts;
    	      this.additionalSchemaElements = defaults.additionalSchemaElements;
    	      this.compression = defaults.compression;
    	      this.format = defaults.format;
    	      this.refreshClosedReports = defaults.refreshClosedReports;
    	      this.reportName = defaults.reportName;
    	      this.reportVersioning = defaults.reportVersioning;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Prefix = defaults.s3Prefix;
    	      this.s3Region = defaults.s3Region;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder additionalArtifacts(@Nullable Output<List<String>> additionalArtifacts) {
            this.additionalArtifacts = additionalArtifacts;
            return this;
        }
        public Builder additionalArtifacts(@Nullable List<String> additionalArtifacts) {
            this.additionalArtifacts = Output.ofNullable(additionalArtifacts);
            return this;
        }
        public Builder additionalArtifacts(String... additionalArtifacts) {
            return additionalArtifacts(List.of(additionalArtifacts));
        }
        public Builder additionalSchemaElements(Output<List<String>> additionalSchemaElements) {
            this.additionalSchemaElements = Objects.requireNonNull(additionalSchemaElements);
            return this;
        }
        public Builder additionalSchemaElements(List<String> additionalSchemaElements) {
            this.additionalSchemaElements = Output.of(Objects.requireNonNull(additionalSchemaElements));
            return this;
        }
        public Builder additionalSchemaElements(String... additionalSchemaElements) {
            return additionalSchemaElements(List.of(additionalSchemaElements));
        }
        public Builder compression(Output<String> compression) {
            this.compression = Objects.requireNonNull(compression);
            return this;
        }
        public Builder compression(String compression) {
            this.compression = Output.of(Objects.requireNonNull(compression));
            return this;
        }
        public Builder format(Output<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder format(String format) {
            this.format = Output.of(Objects.requireNonNull(format));
            return this;
        }
        public Builder refreshClosedReports(@Nullable Output<Boolean> refreshClosedReports) {
            this.refreshClosedReports = refreshClosedReports;
            return this;
        }
        public Builder refreshClosedReports(@Nullable Boolean refreshClosedReports) {
            this.refreshClosedReports = Output.ofNullable(refreshClosedReports);
            return this;
        }
        public Builder reportName(Output<String> reportName) {
            this.reportName = Objects.requireNonNull(reportName);
            return this;
        }
        public Builder reportName(String reportName) {
            this.reportName = Output.of(Objects.requireNonNull(reportName));
            return this;
        }
        public Builder reportVersioning(@Nullable Output<String> reportVersioning) {
            this.reportVersioning = reportVersioning;
            return this;
        }
        public Builder reportVersioning(@Nullable String reportVersioning) {
            this.reportVersioning = Output.ofNullable(reportVersioning);
            return this;
        }
        public Builder s3Bucket(Output<String> s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }
        public Builder s3Bucket(String s3Bucket) {
            this.s3Bucket = Output.of(Objects.requireNonNull(s3Bucket));
            return this;
        }
        public Builder s3Prefix(@Nullable Output<String> s3Prefix) {
            this.s3Prefix = s3Prefix;
            return this;
        }
        public Builder s3Prefix(@Nullable String s3Prefix) {
            this.s3Prefix = Output.ofNullable(s3Prefix);
            return this;
        }
        public Builder s3Region(Output<String> s3Region) {
            this.s3Region = Objects.requireNonNull(s3Region);
            return this;
        }
        public Builder s3Region(String s3Region) {
            this.s3Region = Output.of(Objects.requireNonNull(s3Region));
            return this;
        }
        public Builder timeUnit(Output<String> timeUnit) {
            this.timeUnit = Objects.requireNonNull(timeUnit);
            return this;
        }
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = Output.of(Objects.requireNonNull(timeUnit));
            return this;
        }        public ReportDefinitionArgs build() {
            return new ReportDefinitionArgs(additionalArtifacts, additionalSchemaElements, compression, format, refreshClosedReports, reportName, reportVersioning, s3Bucket, s3Prefix, s3Region, timeUnit);
        }
    }
}
