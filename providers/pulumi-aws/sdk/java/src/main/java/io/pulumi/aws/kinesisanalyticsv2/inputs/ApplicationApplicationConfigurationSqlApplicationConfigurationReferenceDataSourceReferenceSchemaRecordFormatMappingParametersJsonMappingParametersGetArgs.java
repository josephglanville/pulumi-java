// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs();

    /**
     * The path to the top-level parent that contains the records.
     * 
     */
    @Import(name="recordRowPath", required=true)
      private final Output<String> recordRowPath;

    public Output<String> getRecordRowPath() {
        return this.recordRowPath;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs(Output<String> recordRowPath) {
        this.recordRowPath = Objects.requireNonNull(recordRowPath, "expected parameter 'recordRowPath' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs() {
        this.recordRowPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> recordRowPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordRowPath = defaults.recordRowPath;
        }

        public Builder recordRowPath(Output<String> recordRowPath) {
            this.recordRowPath = Objects.requireNonNull(recordRowPath);
            return this;
        }
        public Builder recordRowPath(String recordRowPath) {
            this.recordRowPath = Output.of(Objects.requireNonNull(recordRowPath));
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs(recordRowPath);
        }
    }
}