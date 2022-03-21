// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.ClusteringArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ConnectionPropertyArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.DatasetReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.QueryParameterArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.RangePartitioningArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TimePartitioningArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.UserDefinedFunctionResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobConfigurationQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobConfigurationQueryArgs Empty = new JobConfigurationQueryArgs();

    /**
     * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
     */
    @Import(name="allowLargeResults")
      private final @Nullable Output<Boolean> allowLargeResults;

    public Output<Boolean> getAllowLargeResults() {
        return this.allowLargeResults == null ? Output.empty() : this.allowLargeResults;
    }

    /**
     * [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    @Import(name="clustering")
      private final @Nullable Output<ClusteringArgs> clustering;

    public Output<ClusteringArgs> getClustering() {
        return this.clustering == null ? Output.empty() : this.clustering;
    }

    /**
     * Connection properties.
     * 
     */
    @Import(name="connectionProperties")
      private final @Nullable Output<List<ConnectionPropertyArgs>> connectionProperties;

    public Output<List<ConnectionPropertyArgs>> getConnectionProperties() {
        return this.connectionProperties == null ? Output.empty() : this.connectionProperties;
    }

    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="createDisposition")
      private final @Nullable Output<String> createDisposition;

    public Output<String> getCreateDisposition() {
        return this.createDisposition == null ? Output.empty() : this.createDisposition;
    }

    /**
     * If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs query in non-session mode.
     * 
     */
    @Import(name="createSession")
      private final @Nullable Output<Boolean> createSession;

    public Output<Boolean> getCreateSession() {
        return this.createSession == null ? Output.empty() : this.createSession;
    }

    /**
     * [Optional] Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * 
     */
    @Import(name="defaultDataset")
      private final @Nullable Output<DatasetReferenceArgs> defaultDataset;

    public Output<DatasetReferenceArgs> getDefaultDataset() {
        return this.defaultDataset == null ? Output.empty() : this.defaultDataset;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @Import(name="destinationEncryptionConfiguration")
      private final @Nullable Output<EncryptionConfigurationArgs> destinationEncryptionConfiguration;

    public Output<EncryptionConfigurationArgs> getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration == null ? Output.empty() : this.destinationEncryptionConfiguration;
    }

    /**
     * [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This property must be set for large results that exceed the maximum response size.
     * 
     */
    @Import(name="destinationTable")
      private final @Nullable Output<TableReferenceArgs> destinationTable;

    public Output<TableReferenceArgs> getDestinationTable() {
        return this.destinationTable == null ? Output.empty() : this.destinationTable;
    }

    /**
     * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
     */
    @Import(name="flattenResults")
      private final @Nullable Output<Boolean> flattenResults;

    public Output<Boolean> getFlattenResults() {
        return this.flattenResults == null ? Output.empty() : this.flattenResults;
    }

    /**
     * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
     */
    @Import(name="maximumBillingTier")
      private final @Nullable Output<Integer> maximumBillingTier;

    public Output<Integer> getMaximumBillingTier() {
        return this.maximumBillingTier == null ? Output.empty() : this.maximumBillingTier;
    }

    /**
     * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
     */
    @Import(name="maximumBytesBilled")
      private final @Nullable Output<String> maximumBytesBilled;

    public Output<String> getMaximumBytesBilled() {
        return this.maximumBytesBilled == null ? Output.empty() : this.maximumBytesBilled;
    }

    /**
     * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
     */
    @Import(name="parameterMode")
      private final @Nullable Output<String> parameterMode;

    public Output<String> getParameterMode() {
        return this.parameterMode == null ? Output.empty() : this.parameterMode;
    }

    /**
     * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<String> priority;

    public Output<String> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    /**
     * Query parameters for standard SQL queries.
     * 
     */
    @Import(name="queryParameters")
      private final @Nullable Output<List<QueryParameterArgs>> queryParameters;

    public Output<List<QueryParameterArgs>> getQueryParameters() {
        return this.queryParameters == null ? Output.empty() : this.queryParameters;
    }

    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Import(name="rangePartitioning")
      private final @Nullable Output<RangePartitioningArgs> rangePartitioning;

    public Output<RangePartitioningArgs> getRangePartitioning() {
        return this.rangePartitioning == null ? Output.empty() : this.rangePartitioning;
    }

    /**
     * Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    @Import(name="schemaUpdateOptions")
      private final @Nullable Output<List<String>> schemaUpdateOptions;

    public Output<List<String>> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions == null ? Output.empty() : this.schemaUpdateOptions;
    }

    /**
     * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    @Import(name="tableDefinitions")
      private final @Nullable Output<Map<String,String>> tableDefinitions;

    public Output<Map<String,String>> getTableDefinitions() {
        return this.tableDefinitions == null ? Output.empty() : this.tableDefinitions;
    }

    /**
     * Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Import(name="timePartitioning")
      private final @Nullable Output<TimePartitioningArgs> timePartitioning;

    public Output<TimePartitioningArgs> getTimePartitioning() {
        return this.timePartitioning == null ? Output.empty() : this.timePartitioning;
    }

    /**
     * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
     * 
     */
    @Import(name="useLegacySql")
      private final @Nullable Output<Boolean> useLegacySql;

    public Output<Boolean> getUseLegacySql() {
        return this.useLegacySql == null ? Output.empty() : this.useLegacySql;
    }

    /**
     * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
     * 
     */
    @Import(name="useQueryCache")
      private final @Nullable Output<Boolean> useQueryCache;

    public Output<Boolean> getUseQueryCache() {
        return this.useQueryCache == null ? Output.empty() : this.useQueryCache;
    }

    /**
     * Describes user-defined function resources used in the query.
     * 
     */
    @Import(name="userDefinedFunctionResources")
      private final @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

    public Output<List<UserDefinedFunctionResourceArgs>> getUserDefinedFunctionResources() {
        return this.userDefinedFunctionResources == null ? Output.empty() : this.userDefinedFunctionResources;
    }

    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="writeDisposition")
      private final @Nullable Output<String> writeDisposition;

    public Output<String> getWriteDisposition() {
        return this.writeDisposition == null ? Output.empty() : this.writeDisposition;
    }

    public JobConfigurationQueryArgs(
        @Nullable Output<Boolean> allowLargeResults,
        @Nullable Output<ClusteringArgs> clustering,
        @Nullable Output<List<ConnectionPropertyArgs>> connectionProperties,
        @Nullable Output<String> createDisposition,
        @Nullable Output<Boolean> createSession,
        @Nullable Output<DatasetReferenceArgs> defaultDataset,
        @Nullable Output<EncryptionConfigurationArgs> destinationEncryptionConfiguration,
        @Nullable Output<TableReferenceArgs> destinationTable,
        @Nullable Output<Boolean> flattenResults,
        @Nullable Output<Integer> maximumBillingTier,
        @Nullable Output<String> maximumBytesBilled,
        @Nullable Output<String> parameterMode,
        @Nullable Output<String> priority,
        @Nullable Output<String> query,
        @Nullable Output<List<QueryParameterArgs>> queryParameters,
        @Nullable Output<RangePartitioningArgs> rangePartitioning,
        @Nullable Output<List<String>> schemaUpdateOptions,
        @Nullable Output<Map<String,String>> tableDefinitions,
        @Nullable Output<TimePartitioningArgs> timePartitioning,
        @Nullable Output<Boolean> useLegacySql,
        @Nullable Output<Boolean> useQueryCache,
        @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources,
        @Nullable Output<String> writeDisposition) {
        this.allowLargeResults = allowLargeResults;
        this.clustering = clustering;
        this.connectionProperties = connectionProperties;
        this.createDisposition = createDisposition;
        this.createSession = createSession;
        this.defaultDataset = defaultDataset;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.flattenResults = flattenResults;
        this.maximumBillingTier = maximumBillingTier;
        this.maximumBytesBilled = maximumBytesBilled;
        this.parameterMode = parameterMode;
        this.priority = priority;
        this.query = query;
        this.queryParameters = queryParameters;
        this.rangePartitioning = rangePartitioning;
        this.schemaUpdateOptions = schemaUpdateOptions;
        this.tableDefinitions = tableDefinitions;
        this.timePartitioning = timePartitioning;
        this.useLegacySql = useLegacySql;
        this.useQueryCache = useQueryCache;
        this.userDefinedFunctionResources = userDefinedFunctionResources;
        this.writeDisposition = writeDisposition;
    }

    private JobConfigurationQueryArgs() {
        this.allowLargeResults = Output.empty();
        this.clustering = Output.empty();
        this.connectionProperties = Output.empty();
        this.createDisposition = Output.empty();
        this.createSession = Output.empty();
        this.defaultDataset = Output.empty();
        this.destinationEncryptionConfiguration = Output.empty();
        this.destinationTable = Output.empty();
        this.flattenResults = Output.empty();
        this.maximumBillingTier = Output.empty();
        this.maximumBytesBilled = Output.empty();
        this.parameterMode = Output.empty();
        this.priority = Output.empty();
        this.query = Output.empty();
        this.queryParameters = Output.empty();
        this.rangePartitioning = Output.empty();
        this.schemaUpdateOptions = Output.empty();
        this.tableDefinitions = Output.empty();
        this.timePartitioning = Output.empty();
        this.useLegacySql = Output.empty();
        this.useQueryCache = Output.empty();
        this.userDefinedFunctionResources = Output.empty();
        this.writeDisposition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowLargeResults;
        private @Nullable Output<ClusteringArgs> clustering;
        private @Nullable Output<List<ConnectionPropertyArgs>> connectionProperties;
        private @Nullable Output<String> createDisposition;
        private @Nullable Output<Boolean> createSession;
        private @Nullable Output<DatasetReferenceArgs> defaultDataset;
        private @Nullable Output<EncryptionConfigurationArgs> destinationEncryptionConfiguration;
        private @Nullable Output<TableReferenceArgs> destinationTable;
        private @Nullable Output<Boolean> flattenResults;
        private @Nullable Output<Integer> maximumBillingTier;
        private @Nullable Output<String> maximumBytesBilled;
        private @Nullable Output<String> parameterMode;
        private @Nullable Output<String> priority;
        private @Nullable Output<String> query;
        private @Nullable Output<List<QueryParameterArgs>> queryParameters;
        private @Nullable Output<RangePartitioningArgs> rangePartitioning;
        private @Nullable Output<List<String>> schemaUpdateOptions;
        private @Nullable Output<Map<String,String>> tableDefinitions;
        private @Nullable Output<TimePartitioningArgs> timePartitioning;
        private @Nullable Output<Boolean> useLegacySql;
        private @Nullable Output<Boolean> useQueryCache;
        private @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources;
        private @Nullable Output<String> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLargeResults = defaults.allowLargeResults;
    	      this.clustering = defaults.clustering;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.createDisposition = defaults.createDisposition;
    	      this.createSession = defaults.createSession;
    	      this.defaultDataset = defaults.defaultDataset;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.flattenResults = defaults.flattenResults;
    	      this.maximumBillingTier = defaults.maximumBillingTier;
    	      this.maximumBytesBilled = defaults.maximumBytesBilled;
    	      this.parameterMode = defaults.parameterMode;
    	      this.priority = defaults.priority;
    	      this.query = defaults.query;
    	      this.queryParameters = defaults.queryParameters;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.tableDefinitions = defaults.tableDefinitions;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.useLegacySql = defaults.useLegacySql;
    	      this.useQueryCache = defaults.useQueryCache;
    	      this.userDefinedFunctionResources = defaults.userDefinedFunctionResources;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder allowLargeResults(@Nullable Output<Boolean> allowLargeResults) {
            this.allowLargeResults = allowLargeResults;
            return this;
        }
        public Builder allowLargeResults(@Nullable Boolean allowLargeResults) {
            this.allowLargeResults = Output.ofNullable(allowLargeResults);
            return this;
        }
        public Builder clustering(@Nullable Output<ClusteringArgs> clustering) {
            this.clustering = clustering;
            return this;
        }
        public Builder clustering(@Nullable ClusteringArgs clustering) {
            this.clustering = Output.ofNullable(clustering);
            return this;
        }
        public Builder connectionProperties(@Nullable Output<List<ConnectionPropertyArgs>> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Builder connectionProperties(@Nullable List<ConnectionPropertyArgs> connectionProperties) {
            this.connectionProperties = Output.ofNullable(connectionProperties);
            return this;
        }
        public Builder connectionProperties(ConnectionPropertyArgs... connectionProperties) {
            return connectionProperties(List.of(connectionProperties));
        }
        public Builder createDisposition(@Nullable Output<String> createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }
        public Builder createDisposition(@Nullable String createDisposition) {
            this.createDisposition = Output.ofNullable(createDisposition);
            return this;
        }
        public Builder createSession(@Nullable Output<Boolean> createSession) {
            this.createSession = createSession;
            return this;
        }
        public Builder createSession(@Nullable Boolean createSession) {
            this.createSession = Output.ofNullable(createSession);
            return this;
        }
        public Builder defaultDataset(@Nullable Output<DatasetReferenceArgs> defaultDataset) {
            this.defaultDataset = defaultDataset;
            return this;
        }
        public Builder defaultDataset(@Nullable DatasetReferenceArgs defaultDataset) {
            this.defaultDataset = Output.ofNullable(defaultDataset);
            return this;
        }
        public Builder destinationEncryptionConfiguration(@Nullable Output<EncryptionConfigurationArgs> destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }
        public Builder destinationEncryptionConfiguration(@Nullable EncryptionConfigurationArgs destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Output.ofNullable(destinationEncryptionConfiguration);
            return this;
        }
        public Builder destinationTable(@Nullable Output<TableReferenceArgs> destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }
        public Builder destinationTable(@Nullable TableReferenceArgs destinationTable) {
            this.destinationTable = Output.ofNullable(destinationTable);
            return this;
        }
        public Builder flattenResults(@Nullable Output<Boolean> flattenResults) {
            this.flattenResults = flattenResults;
            return this;
        }
        public Builder flattenResults(@Nullable Boolean flattenResults) {
            this.flattenResults = Output.ofNullable(flattenResults);
            return this;
        }
        public Builder maximumBillingTier(@Nullable Output<Integer> maximumBillingTier) {
            this.maximumBillingTier = maximumBillingTier;
            return this;
        }
        public Builder maximumBillingTier(@Nullable Integer maximumBillingTier) {
            this.maximumBillingTier = Output.ofNullable(maximumBillingTier);
            return this;
        }
        public Builder maximumBytesBilled(@Nullable Output<String> maximumBytesBilled) {
            this.maximumBytesBilled = maximumBytesBilled;
            return this;
        }
        public Builder maximumBytesBilled(@Nullable String maximumBytesBilled) {
            this.maximumBytesBilled = Output.ofNullable(maximumBytesBilled);
            return this;
        }
        public Builder parameterMode(@Nullable Output<String> parameterMode) {
            this.parameterMode = parameterMode;
            return this;
        }
        public Builder parameterMode(@Nullable String parameterMode) {
            this.parameterMode = Output.ofNullable(parameterMode);
            return this;
        }
        public Builder priority(@Nullable Output<String> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable String priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }
        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Output.ofNullable(query);
            return this;
        }
        public Builder queryParameters(@Nullable Output<List<QueryParameterArgs>> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }
        public Builder queryParameters(@Nullable List<QueryParameterArgs> queryParameters) {
            this.queryParameters = Output.ofNullable(queryParameters);
            return this;
        }
        public Builder queryParameters(QueryParameterArgs... queryParameters) {
            return queryParameters(List.of(queryParameters));
        }
        public Builder rangePartitioning(@Nullable Output<RangePartitioningArgs> rangePartitioning) {
            this.rangePartitioning = rangePartitioning;
            return this;
        }
        public Builder rangePartitioning(@Nullable RangePartitioningArgs rangePartitioning) {
            this.rangePartitioning = Output.ofNullable(rangePartitioning);
            return this;
        }
        public Builder schemaUpdateOptions(@Nullable Output<List<String>> schemaUpdateOptions) {
            this.schemaUpdateOptions = schemaUpdateOptions;
            return this;
        }
        public Builder schemaUpdateOptions(@Nullable List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Output.ofNullable(schemaUpdateOptions);
            return this;
        }
        public Builder schemaUpdateOptions(String... schemaUpdateOptions) {
            return schemaUpdateOptions(List.of(schemaUpdateOptions));
        }
        public Builder tableDefinitions(@Nullable Output<Map<String,String>> tableDefinitions) {
            this.tableDefinitions = tableDefinitions;
            return this;
        }
        public Builder tableDefinitions(@Nullable Map<String,String> tableDefinitions) {
            this.tableDefinitions = Output.ofNullable(tableDefinitions);
            return this;
        }
        public Builder timePartitioning(@Nullable Output<TimePartitioningArgs> timePartitioning) {
            this.timePartitioning = timePartitioning;
            return this;
        }
        public Builder timePartitioning(@Nullable TimePartitioningArgs timePartitioning) {
            this.timePartitioning = Output.ofNullable(timePartitioning);
            return this;
        }
        public Builder useLegacySql(@Nullable Output<Boolean> useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }
        public Builder useLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = Output.ofNullable(useLegacySql);
            return this;
        }
        public Builder useQueryCache(@Nullable Output<Boolean> useQueryCache) {
            this.useQueryCache = useQueryCache;
            return this;
        }
        public Builder useQueryCache(@Nullable Boolean useQueryCache) {
            this.useQueryCache = Output.ofNullable(useQueryCache);
            return this;
        }
        public Builder userDefinedFunctionResources(@Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }
        public Builder userDefinedFunctionResources(@Nullable List<UserDefinedFunctionResourceArgs> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Output.ofNullable(userDefinedFunctionResources);
            return this;
        }
        public Builder userDefinedFunctionResources(UserDefinedFunctionResourceArgs... userDefinedFunctionResources) {
            return userDefinedFunctionResources(List.of(userDefinedFunctionResources));
        }
        public Builder writeDisposition(@Nullable Output<String> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }
        public Builder writeDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = Output.ofNullable(writeDisposition);
            return this;
        }        public JobConfigurationQueryArgs build() {
            return new JobConfigurationQueryArgs(allowLargeResults, clustering, connectionProperties, createDisposition, createSession, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, priority, query, queryParameters, rangePartitioning, schemaUpdateOptions, tableDefinitions, timePartitioning, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
        }
    }
}
