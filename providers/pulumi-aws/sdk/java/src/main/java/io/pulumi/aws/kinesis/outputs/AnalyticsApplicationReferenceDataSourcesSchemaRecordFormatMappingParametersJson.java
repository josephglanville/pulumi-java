// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson {
    /**
     * Path to the top-level parent that contains the records.
     * 
     */
    private final String recordRowPath;

    @OutputCustomType.Constructor
    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson(@OutputCustomType.Parameter("recordRowPath") String recordRowPath) {
        this.recordRowPath = recordRowPath;
    }

    /**
     * Path to the top-level parent that contains the records.
     * 
    */
    public String getRecordRowPath() {
        return this.recordRowPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordRowPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordRowPath = defaults.recordRowPath;
        }

        public Builder setRecordRowPath(String recordRowPath) {
            this.recordRowPath = Objects.requireNonNull(recordRowPath);
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson(recordRowPath);
        }
    }
}
