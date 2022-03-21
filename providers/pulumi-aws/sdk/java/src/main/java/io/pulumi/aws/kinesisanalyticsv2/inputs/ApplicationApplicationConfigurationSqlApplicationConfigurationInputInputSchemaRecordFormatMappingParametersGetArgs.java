// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs();

    /**
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * 
     */
    @Import(name="csvMappingParameters")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> getCsvMappingParameters() {
        return this.csvMappingParameters == null ? Output.empty() : this.csvMappingParameters;
    }

    /**
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * 
     */
    @Import(name="jsonMappingParameters")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> getJsonMappingParameters() {
        return this.jsonMappingParameters == null ? Output.empty() : this.jsonMappingParameters;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs(
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters) {
        this.csvMappingParameters = csvMappingParameters;
        this.jsonMappingParameters = jsonMappingParameters;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs() {
        this.csvMappingParameters = Output.empty();
        this.jsonMappingParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvMappingParameters = defaults.csvMappingParameters;
    	      this.jsonMappingParameters = defaults.jsonMappingParameters;
        }

        public Builder csvMappingParameters(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs> csvMappingParameters) {
            this.csvMappingParameters = csvMappingParameters;
            return this;
        }
        public Builder csvMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs csvMappingParameters) {
            this.csvMappingParameters = Output.ofNullable(csvMappingParameters);
            return this;
        }
        public Builder jsonMappingParameters(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs> jsonMappingParameters) {
            this.jsonMappingParameters = jsonMappingParameters;
            return this;
        }
        public Builder jsonMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersGetArgs jsonMappingParameters) {
            this.jsonMappingParameters = Output.ofNullable(jsonMappingParameters);
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersGetArgs(csvMappingParameters, jsonMappingParameters);
        }
    }
}
