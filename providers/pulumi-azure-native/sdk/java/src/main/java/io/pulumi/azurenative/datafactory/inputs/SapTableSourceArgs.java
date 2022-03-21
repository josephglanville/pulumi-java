// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SapTablePartitionSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP Table source.
 * 
 */
public final class SapTableSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapTableSourceArgs Empty = new SapTableSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Output<Object> additionalColumns;

    public Output<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Output.empty() : this.additionalColumns;
    }

    /**
     * Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="batchSize")
      private final @Nullable Output<Object> batchSize;

    public Output<Object> getBatchSize() {
        return this.batchSize == null ? Output.empty() : this.batchSize;
    }

    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="customRfcReadTableFunctionModule")
      private final @Nullable Output<Object> customRfcReadTableFunctionModule;

    public Output<Object> getCustomRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule == null ? Output.empty() : this.customRfcReadTableFunctionModule;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Output.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Output.empty() : this.maxConcurrentConnections;
    }

    /**
     * The partition mechanism that will be used for SAP table read in parallel. Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth", "PartitionOnCalendarDate", "PartitionOnTime".
     * 
     */
    @Import(name="partitionOption")
      private final @Nullable Output<Object> partitionOption;

    public Output<Object> getPartitionOption() {
        return this.partitionOption == null ? Output.empty() : this.partitionOption;
    }

    /**
     * The settings that will be leveraged for SAP table source partitioning.
     * 
     */
    @Import(name="partitionSettings")
      private final @Nullable Output<SapTablePartitionSettingsArgs> partitionSettings;

    public Output<SapTablePartitionSettingsArgs> getPartitionSettings() {
        return this.partitionSettings == null ? Output.empty() : this.partitionSettings;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
      private final @Nullable Output<Object> queryTimeout;

    public Output<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Output.empty() : this.queryTimeout;
    }

    /**
     * The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="rfcTableFields")
      private final @Nullable Output<Object> rfcTableFields;

    public Output<Object> getRfcTableFields() {
        return this.rfcTableFields == null ? Output.empty() : this.rfcTableFields;
    }

    /**
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="rfcTableOptions")
      private final @Nullable Output<Object> rfcTableOptions;

    public Output<Object> getRfcTableOptions() {
        return this.rfcTableOptions == null ? Output.empty() : this.rfcTableOptions;
    }

    /**
     * The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     * 
     */
    @Import(name="rowCount")
      private final @Nullable Output<Object> rowCount;

    public Output<Object> getRowCount() {
        return this.rowCount == null ? Output.empty() : this.rowCount;
    }

    /**
     * The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="rowSkips")
      private final @Nullable Output<Object> rowSkips;

    public Output<Object> getRowSkips() {
        return this.rowSkips == null ? Output.empty() : this.rowSkips;
    }

    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sapDataColumnDelimiter")
      private final @Nullable Output<Object> sapDataColumnDelimiter;

    public Output<Object> getSapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter == null ? Output.empty() : this.sapDataColumnDelimiter;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Output.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Output.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'SapTableSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SapTableSourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Object> batchSize,
        @Nullable Output<Object> customRfcReadTableFunctionModule,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> partitionOption,
        @Nullable Output<SapTablePartitionSettingsArgs> partitionSettings,
        @Nullable Output<Object> queryTimeout,
        @Nullable Output<Object> rfcTableFields,
        @Nullable Output<Object> rfcTableOptions,
        @Nullable Output<Object> rowCount,
        @Nullable Output<Object> rowSkips,
        @Nullable Output<Object> sapDataColumnDelimiter,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.rfcTableFields = rfcTableFields;
        this.rfcTableOptions = rfcTableOptions;
        this.rowCount = rowCount;
        this.rowSkips = rowSkips;
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapTableSourceArgs() {
        this.additionalColumns = Output.empty();
        this.batchSize = Output.empty();
        this.customRfcReadTableFunctionModule = Output.empty();
        this.disableMetricsCollection = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.partitionOption = Output.empty();
        this.partitionSettings = Output.empty();
        this.queryTimeout = Output.empty();
        this.rfcTableFields = Output.empty();
        this.rfcTableOptions = Output.empty();
        this.rowCount = Output.empty();
        this.rowSkips = Output.empty();
        this.sapDataColumnDelimiter = Output.empty();
        this.sourceRetryCount = Output.empty();
        this.sourceRetryWait = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTableSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Object> batchSize;
        private @Nullable Output<Object> customRfcReadTableFunctionModule;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> partitionOption;
        private @Nullable Output<SapTablePartitionSettingsArgs> partitionSettings;
        private @Nullable Output<Object> queryTimeout;
        private @Nullable Output<Object> rfcTableFields;
        private @Nullable Output<Object> rfcTableOptions;
        private @Nullable Output<Object> rowCount;
        private @Nullable Output<Object> rowSkips;
        private @Nullable Output<Object> sapDataColumnDelimiter;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTableSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.customRfcReadTableFunctionModule = defaults.customRfcReadTableFunctionModule;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.rfcTableFields = defaults.rfcTableFields;
    	      this.rfcTableOptions = defaults.rfcTableOptions;
    	      this.rowCount = defaults.rowCount;
    	      this.rowSkips = defaults.rowSkips;
    	      this.sapDataColumnDelimiter = defaults.sapDataColumnDelimiter;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Output.ofNullable(additionalColumns);
            return this;
        }
        public Builder batchSize(@Nullable Output<Object> batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder batchSize(@Nullable Object batchSize) {
            this.batchSize = Output.ofNullable(batchSize);
            return this;
        }
        public Builder customRfcReadTableFunctionModule(@Nullable Output<Object> customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }
        public Builder customRfcReadTableFunctionModule(@Nullable Object customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = Output.ofNullable(customRfcReadTableFunctionModule);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Output.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder partitionOption(@Nullable Output<Object> partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }
        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = Output.ofNullable(partitionOption);
            return this;
        }
        public Builder partitionSettings(@Nullable Output<SapTablePartitionSettingsArgs> partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }
        public Builder partitionSettings(@Nullable SapTablePartitionSettingsArgs partitionSettings) {
            this.partitionSettings = Output.ofNullable(partitionSettings);
            return this;
        }
        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Output.ofNullable(queryTimeout);
            return this;
        }
        public Builder rfcTableFields(@Nullable Output<Object> rfcTableFields) {
            this.rfcTableFields = rfcTableFields;
            return this;
        }
        public Builder rfcTableFields(@Nullable Object rfcTableFields) {
            this.rfcTableFields = Output.ofNullable(rfcTableFields);
            return this;
        }
        public Builder rfcTableOptions(@Nullable Output<Object> rfcTableOptions) {
            this.rfcTableOptions = rfcTableOptions;
            return this;
        }
        public Builder rfcTableOptions(@Nullable Object rfcTableOptions) {
            this.rfcTableOptions = Output.ofNullable(rfcTableOptions);
            return this;
        }
        public Builder rowCount(@Nullable Output<Object> rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Builder rowCount(@Nullable Object rowCount) {
            this.rowCount = Output.ofNullable(rowCount);
            return this;
        }
        public Builder rowSkips(@Nullable Output<Object> rowSkips) {
            this.rowSkips = rowSkips;
            return this;
        }
        public Builder rowSkips(@Nullable Object rowSkips) {
            this.rowSkips = Output.ofNullable(rowSkips);
            return this;
        }
        public Builder sapDataColumnDelimiter(@Nullable Output<Object> sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }
        public Builder sapDataColumnDelimiter(@Nullable Object sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = Output.ofNullable(sapDataColumnDelimiter);
            return this;
        }
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Output.ofNullable(sourceRetryCount);
            return this;
        }
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Output.ofNullable(sourceRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SapTableSourceArgs build() {
            return new SapTableSourceArgs(additionalColumns, batchSize, customRfcReadTableFunctionModule, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, queryTimeout, rfcTableFields, rfcTableOptions, rowCount, rowSkips, sapDataColumnDelimiter, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
