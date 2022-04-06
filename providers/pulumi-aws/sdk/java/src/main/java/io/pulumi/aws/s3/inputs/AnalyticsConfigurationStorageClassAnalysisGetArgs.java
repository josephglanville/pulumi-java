// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class AnalyticsConfigurationStorageClassAnalysisGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationStorageClassAnalysisGetArgs Empty = new AnalyticsConfigurationStorageClassAnalysisGetArgs();

    /**
     * Data export configuration (documented below).
     * 
     */
    @Import(name="dataExport", required=true)
      private final Output<AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs> dataExport;

    public Output<AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs> getDataExport() {
        return this.dataExport;
    }

    public AnalyticsConfigurationStorageClassAnalysisGetArgs(Output<AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs> dataExport) {
        this.dataExport = Objects.requireNonNull(dataExport, "expected parameter 'dataExport' to be non-null");
    }

    private AnalyticsConfigurationStorageClassAnalysisGetArgs() {
        this.dataExport = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs> dataExport;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataExport = defaults.dataExport;
        }

        public Builder dataExport(Output<AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs> dataExport) {
            this.dataExport = Objects.requireNonNull(dataExport);
            return this;
        }
        public Builder dataExport(AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs dataExport) {
            this.dataExport = Output.of(Objects.requireNonNull(dataExport));
            return this;
        }        public AnalyticsConfigurationStorageClassAnalysisGetArgs build() {
            return new AnalyticsConfigurationStorageClassAnalysisGetArgs(dataExport);
        }
    }
}