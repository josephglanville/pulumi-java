// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cur.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetReportDefinitionResult {
    /**
     * A list of additional artifacts.
     * 
     */
    private final List<String> additionalArtifacts;
    /**
     * A list of schema elements.
     * 
     */
    private final List<String> additionalSchemaElements;
    /**
     * Preferred format for report.
     * 
     */
    private final String compression;
    /**
     * Preferred compression format for report.
     * 
     */
    private final String format;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * If true reports are updated after they have been finalized.
     * 
     */
    private final Boolean refreshClosedReports;
    private final String reportName;
    /**
     * Overwrite the previous version of each report or to deliver the report in addition to the previous versions.
     * 
     */
    private final String reportVersioning;
    /**
     * Name of customer S3 bucket.
     * 
     */
    private final String s3Bucket;
    /**
     * Preferred report path prefix.
     * 
     */
    private final String s3Prefix;
    /**
     * Region of customer S3 bucket.
     * 
     */
    private final String s3Region;
    /**
     * The frequency on which report data are measured and displayed.
     * 
     */
    private final String timeUnit;

    @OutputCustomType.Constructor
    private GetReportDefinitionResult(
        @OutputCustomType.Parameter("additionalArtifacts") List<String> additionalArtifacts,
        @OutputCustomType.Parameter("additionalSchemaElements") List<String> additionalSchemaElements,
        @OutputCustomType.Parameter("compression") String compression,
        @OutputCustomType.Parameter("format") String format,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("refreshClosedReports") Boolean refreshClosedReports,
        @OutputCustomType.Parameter("reportName") String reportName,
        @OutputCustomType.Parameter("reportVersioning") String reportVersioning,
        @OutputCustomType.Parameter("s3Bucket") String s3Bucket,
        @OutputCustomType.Parameter("s3Prefix") String s3Prefix,
        @OutputCustomType.Parameter("s3Region") String s3Region,
        @OutputCustomType.Parameter("timeUnit") String timeUnit) {
        this.additionalArtifacts = additionalArtifacts;
        this.additionalSchemaElements = additionalSchemaElements;
        this.compression = compression;
        this.format = format;
        this.id = id;
        this.refreshClosedReports = refreshClosedReports;
        this.reportName = reportName;
        this.reportVersioning = reportVersioning;
        this.s3Bucket = s3Bucket;
        this.s3Prefix = s3Prefix;
        this.s3Region = s3Region;
        this.timeUnit = timeUnit;
    }

    /**
     * A list of additional artifacts.
     * 
    */
    public List<String> getAdditionalArtifacts() {
        return this.additionalArtifacts;
    }
    /**
     * A list of schema elements.
     * 
    */
    public List<String> getAdditionalSchemaElements() {
        return this.additionalSchemaElements;
    }
    /**
     * Preferred format for report.
     * 
    */
    public String getCompression() {
        return this.compression;
    }
    /**
     * Preferred compression format for report.
     * 
    */
    public String getFormat() {
        return this.format;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * If true reports are updated after they have been finalized.
     * 
    */
    public Boolean getRefreshClosedReports() {
        return this.refreshClosedReports;
    }
    public String getReportName() {
        return this.reportName;
    }
    /**
     * Overwrite the previous version of each report or to deliver the report in addition to the previous versions.
     * 
    */
    public String getReportVersioning() {
        return this.reportVersioning;
    }
    /**
     * Name of customer S3 bucket.
     * 
    */
    public String getS3Bucket() {
        return this.s3Bucket;
    }
    /**
     * Preferred report path prefix.
     * 
    */
    public String getS3Prefix() {
        return this.s3Prefix;
    }
    /**
     * Region of customer S3 bucket.
     * 
    */
    public String getS3Region() {
        return this.s3Region;
    }
    /**
     * The frequency on which report data are measured and displayed.
     * 
    */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalArtifacts;
        private List<String> additionalSchemaElements;
        private String compression;
        private String format;
        private String id;
        private Boolean refreshClosedReports;
        private String reportName;
        private String reportVersioning;
        private String s3Bucket;
        private String s3Prefix;
        private String s3Region;
        private String timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalArtifacts = defaults.additionalArtifacts;
    	      this.additionalSchemaElements = defaults.additionalSchemaElements;
    	      this.compression = defaults.compression;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.refreshClosedReports = defaults.refreshClosedReports;
    	      this.reportName = defaults.reportName;
    	      this.reportVersioning = defaults.reportVersioning;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Prefix = defaults.s3Prefix;
    	      this.s3Region = defaults.s3Region;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder setAdditionalArtifacts(List<String> additionalArtifacts) {
            this.additionalArtifacts = Objects.requireNonNull(additionalArtifacts);
            return this;
        }

        public Builder setAdditionalSchemaElements(List<String> additionalSchemaElements) {
            this.additionalSchemaElements = Objects.requireNonNull(additionalSchemaElements);
            return this;
        }

        public Builder setCompression(String compression) {
            this.compression = Objects.requireNonNull(compression);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRefreshClosedReports(Boolean refreshClosedReports) {
            this.refreshClosedReports = Objects.requireNonNull(refreshClosedReports);
            return this;
        }

        public Builder setReportName(String reportName) {
            this.reportName = Objects.requireNonNull(reportName);
            return this;
        }

        public Builder setReportVersioning(String reportVersioning) {
            this.reportVersioning = Objects.requireNonNull(reportVersioning);
            return this;
        }

        public Builder setS3Bucket(String s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }

        public Builder setS3Prefix(String s3Prefix) {
            this.s3Prefix = Objects.requireNonNull(s3Prefix);
            return this;
        }

        public Builder setS3Region(String s3Region) {
            this.s3Region = Objects.requireNonNull(s3Region);
            return this;
        }

        public Builder setTimeUnit(String timeUnit) {
            this.timeUnit = Objects.requireNonNull(timeUnit);
            return this;
        }
        public GetReportDefinitionResult build() {
            return new GetReportDefinitionResult(additionalArtifacts, additionalSchemaElements, compression, format, id, refreshClosedReports, reportName, reportVersioning, s3Bucket, s3Prefix, s3Region, timeUnit);
        }
    }
}
