// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrationReportResultResponse {
    private final String id;
    private final String reportUrl;

    @OutputCustomType.Constructor({"id","reportUrl"})
    private MigrationReportResultResponse(
        String id,
        String reportUrl) {
        this.id = Objects.requireNonNull(id);
        this.reportUrl = Objects.requireNonNull(reportUrl);
    }

    public String getId() {
        return this.id;
    }
    public String getReportUrl() {
        return this.reportUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationReportResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String reportUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationReportResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.reportUrl = defaults.reportUrl;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setReportUrl(String reportUrl) {
            this.reportUrl = Objects.requireNonNull(reportUrl);
            return this;
        }

        public MigrationReportResultResponse build() {
            return new MigrationReportResultResponse(id, reportUrl);
        }
    }
}
