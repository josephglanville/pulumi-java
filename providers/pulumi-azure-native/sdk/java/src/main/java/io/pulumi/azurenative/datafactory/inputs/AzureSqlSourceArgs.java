// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SqlPartitionSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure SQL source.
 * 
 */
public final class AzureSqlSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlSourceArgs Empty = new AzureSqlSourceArgs();

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
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     */
    @Import(name="partitionOption")
      private final @Nullable Output<Object> partitionOption;

    public Output<Object> getPartitionOption() {
        return this.partitionOption == null ? Output.empty() : this.partitionOption;
    }

    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    @Import(name="partitionSettings")
      private final @Nullable Output<SqlPartitionSettingsArgs> partitionSettings;

    public Output<SqlPartitionSettingsArgs> getPartitionSettings() {
        return this.partitionSettings == null ? Output.empty() : this.partitionSettings;
    }

    /**
     * Which additional types to produce.
     * 
     */
    @Import(name="produceAdditionalTypes")
      private final @Nullable Output<Object> produceAdditionalTypes;

    public Output<Object> getProduceAdditionalTypes() {
        return this.produceAdditionalTypes == null ? Output.empty() : this.produceAdditionalTypes;
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
     * SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderQuery")
      private final @Nullable Output<Object> sqlReaderQuery;

    public Output<Object> getSqlReaderQuery() {
        return this.sqlReaderQuery == null ? Output.empty() : this.sqlReaderQuery;
    }

    /**
     * Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderStoredProcedureName")
      private final @Nullable Output<Object> sqlReaderStoredProcedureName;

    public Output<Object> getSqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName == null ? Output.empty() : this.sqlReaderStoredProcedureName;
    }

    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     * 
     */
    @Import(name="storedProcedureParameters")
      private final @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    public Output<Map<String,StoredProcedureParameterArgs>> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Output.empty() : this.storedProcedureParameters;
    }

    /**
     * Copy source type.
     * Expected value is 'AzureSqlSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AzureSqlSourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> partitionOption,
        @Nullable Output<SqlPartitionSettingsArgs> partitionSettings,
        @Nullable Output<Object> produceAdditionalTypes,
        @Nullable Output<Object> queryTimeout,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        @Nullable Output<Object> sqlReaderQuery,
        @Nullable Output<Object> sqlReaderStoredProcedureName,
        @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.produceAdditionalTypes = produceAdditionalTypes;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.sqlReaderQuery = sqlReaderQuery;
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        this.storedProcedureParameters = storedProcedureParameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureSqlSourceArgs() {
        this.additionalColumns = Output.empty();
        this.disableMetricsCollection = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.partitionOption = Output.empty();
        this.partitionSettings = Output.empty();
        this.produceAdditionalTypes = Output.empty();
        this.queryTimeout = Output.empty();
        this.sourceRetryCount = Output.empty();
        this.sourceRetryWait = Output.empty();
        this.sqlReaderQuery = Output.empty();
        this.sqlReaderStoredProcedureName = Output.empty();
        this.storedProcedureParameters = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> partitionOption;
        private @Nullable Output<SqlPartitionSettingsArgs> partitionSettings;
        private @Nullable Output<Object> produceAdditionalTypes;
        private @Nullable Output<Object> queryTimeout;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private @Nullable Output<Object> sqlReaderQuery;
        private @Nullable Output<Object> sqlReaderStoredProcedureName;
        private @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.produceAdditionalTypes = defaults.produceAdditionalTypes;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.sqlReaderQuery = defaults.sqlReaderQuery;
    	      this.sqlReaderStoredProcedureName = defaults.sqlReaderStoredProcedureName;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
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
        public Builder partitionSettings(@Nullable Output<SqlPartitionSettingsArgs> partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }
        public Builder partitionSettings(@Nullable SqlPartitionSettingsArgs partitionSettings) {
            this.partitionSettings = Output.ofNullable(partitionSettings);
            return this;
        }
        public Builder produceAdditionalTypes(@Nullable Output<Object> produceAdditionalTypes) {
            this.produceAdditionalTypes = produceAdditionalTypes;
            return this;
        }
        public Builder produceAdditionalTypes(@Nullable Object produceAdditionalTypes) {
            this.produceAdditionalTypes = Output.ofNullable(produceAdditionalTypes);
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
        public Builder sqlReaderQuery(@Nullable Output<Object> sqlReaderQuery) {
            this.sqlReaderQuery = sqlReaderQuery;
            return this;
        }
        public Builder sqlReaderQuery(@Nullable Object sqlReaderQuery) {
            this.sqlReaderQuery = Output.ofNullable(sqlReaderQuery);
            return this;
        }
        public Builder sqlReaderStoredProcedureName(@Nullable Output<Object> sqlReaderStoredProcedureName) {
            this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }
        public Builder sqlReaderStoredProcedureName(@Nullable Object sqlReaderStoredProcedureName) {
            this.sqlReaderStoredProcedureName = Output.ofNullable(sqlReaderStoredProcedureName);
            return this;
        }
        public Builder storedProcedureParameters(@Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }
        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            this.storedProcedureParameters = Output.ofNullable(storedProcedureParameters);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureSqlSourceArgs build() {
            return new AzureSqlSourceArgs(additionalColumns, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, produceAdditionalTypes, queryTimeout, sourceRetryCount, sourceRetryWait, sqlReaderQuery, sqlReaderStoredProcedureName, storedProcedureParameters, type);
        }
    }
}
