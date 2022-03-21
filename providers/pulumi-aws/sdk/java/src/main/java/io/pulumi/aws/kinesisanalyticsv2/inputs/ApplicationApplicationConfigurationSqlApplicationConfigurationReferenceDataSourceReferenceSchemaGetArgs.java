// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs();

    /**
     * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
     */
    @Import(name="recordColumns", required=true)
      private final Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs>> recordColumns;

    public Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs>> getRecordColumns() {
        return this.recordColumns;
    }

    /**
     * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
     */
    @Import(name="recordEncoding")
      private final @Nullable Output<String> recordEncoding;

    public Output<String> getRecordEncoding() {
        return this.recordEncoding == null ? Output.empty() : this.recordEncoding;
    }

    /**
     * Specifies the format of the records on the streaming source.
     * 
     */
    @Import(name="recordFormat", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs> recordFormat;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs> getRecordFormat() {
        return this.recordFormat;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs(
        Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs>> recordColumns,
        @Nullable Output<String> recordEncoding,
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs> recordFormat) {
        this.recordColumns = Objects.requireNonNull(recordColumns, "expected parameter 'recordColumns' to be non-null");
        this.recordEncoding = recordEncoding;
        this.recordFormat = Objects.requireNonNull(recordFormat, "expected parameter 'recordFormat' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs() {
        this.recordColumns = Output.empty();
        this.recordEncoding = Output.empty();
        this.recordFormat = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs>> recordColumns;
        private @Nullable Output<String> recordEncoding;
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs> recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder recordColumns(Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs>> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }
        public Builder recordColumns(List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs> recordColumns) {
            this.recordColumns = Output.of(Objects.requireNonNull(recordColumns));
            return this;
        }
        public Builder recordColumns(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnGetArgs... recordColumns) {
            return recordColumns(List.of(recordColumns));
        }
        public Builder recordEncoding(@Nullable Output<String> recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }
        public Builder recordEncoding(@Nullable String recordEncoding) {
            this.recordEncoding = Output.ofNullable(recordEncoding);
            return this;
        }
        public Builder recordFormat(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs> recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }
        public Builder recordFormat(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatGetArgs recordFormat) {
            this.recordFormat = Output.of(Objects.requireNonNull(recordFormat));
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs(recordColumns, recordEncoding, recordFormat);
        }
    }
}
