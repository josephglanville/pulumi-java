// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.ClusteringResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ConnectionPropertyResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.DatasetReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.EncryptionConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.QueryParameterResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RangePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TimePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.UserDefinedFunctionResourceResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class JobConfigurationQueryResponse {
    /**
     * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
     */
    private final Boolean allowLargeResults;
    /**
     * [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    private final ClusteringResponse clustering;
    /**
     * Connection properties.
     * 
     */
    private final List<ConnectionPropertyResponse> connectionProperties;
    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    private final String createDisposition;
    /**
     * If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs query in non-session mode.
     * 
     */
    private final Boolean createSession;
    /**
     * [Optional] Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * 
     */
    private final DatasetReferenceResponse defaultDataset;
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    private final EncryptionConfigurationResponse destinationEncryptionConfiguration;
    /**
     * [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This property must be set for large results that exceed the maximum response size.
     * 
     */
    private final TableReferenceResponse destinationTable;
    /**
     * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
     */
    private final Boolean flattenResults;
    /**
     * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
     */
    private final Integer maximumBillingTier;
    /**
     * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
     */
    private final String maximumBytesBilled;
    /**
     * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
     */
    private final String parameterMode;
    /**
     * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE.
     * 
     */
    private final String priority;
    /**
     * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL.
     * 
     */
    private final String query;
    /**
     * Query parameters for standard SQL queries.
     * 
     */
    private final List<QueryParameterResponse> queryParameters;
    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    private final RangePartitioningResponse rangePartitioning;
    /**
     * Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    private final List<String> schemaUpdateOptions;
    /**
     * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    private final Map<String,String> tableDefinitions;
    /**
     * Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    private final TimePartitioningResponse timePartitioning;
    /**
     * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
     * 
     */
    private final Boolean useLegacySql;
    /**
     * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
     * 
     */
    private final Boolean useQueryCache;
    /**
     * Describes user-defined function resources used in the query.
     * 
     */
    private final List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources;
    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    private final String writeDisposition;

    @CustomType.Constructor
    private JobConfigurationQueryResponse(
        @CustomType.Parameter("allowLargeResults") Boolean allowLargeResults,
        @CustomType.Parameter("clustering") ClusteringResponse clustering,
        @CustomType.Parameter("connectionProperties") List<ConnectionPropertyResponse> connectionProperties,
        @CustomType.Parameter("createDisposition") String createDisposition,
        @CustomType.Parameter("createSession") Boolean createSession,
        @CustomType.Parameter("defaultDataset") DatasetReferenceResponse defaultDataset,
        @CustomType.Parameter("destinationEncryptionConfiguration") EncryptionConfigurationResponse destinationEncryptionConfiguration,
        @CustomType.Parameter("destinationTable") TableReferenceResponse destinationTable,
        @CustomType.Parameter("flattenResults") Boolean flattenResults,
        @CustomType.Parameter("maximumBillingTier") Integer maximumBillingTier,
        @CustomType.Parameter("maximumBytesBilled") String maximumBytesBilled,
        @CustomType.Parameter("parameterMode") String parameterMode,
        @CustomType.Parameter("priority") String priority,
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("queryParameters") List<QueryParameterResponse> queryParameters,
        @CustomType.Parameter("rangePartitioning") RangePartitioningResponse rangePartitioning,
        @CustomType.Parameter("schemaUpdateOptions") List<String> schemaUpdateOptions,
        @CustomType.Parameter("tableDefinitions") Map<String,String> tableDefinitions,
        @CustomType.Parameter("timePartitioning") TimePartitioningResponse timePartitioning,
        @CustomType.Parameter("useLegacySql") Boolean useLegacySql,
        @CustomType.Parameter("useQueryCache") Boolean useQueryCache,
        @CustomType.Parameter("userDefinedFunctionResources") List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources,
        @CustomType.Parameter("writeDisposition") String writeDisposition) {
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

    /**
     * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
    */
    public Boolean getAllowLargeResults() {
        return this.allowLargeResults;
    }
    /**
     * [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
    */
    public ClusteringResponse getClustering() {
        return this.clustering;
    }
    /**
     * Connection properties.
     * 
    */
    public List<ConnectionPropertyResponse> getConnectionProperties() {
        return this.connectionProperties;
    }
    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
    */
    public String getCreateDisposition() {
        return this.createDisposition;
    }
    /**
     * If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs query in non-session mode.
     * 
    */
    public Boolean getCreateSession() {
        return this.createSession;
    }
    /**
     * [Optional] Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * 
    */
    public DatasetReferenceResponse getDefaultDataset() {
        return this.defaultDataset;
    }
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
    */
    public EncryptionConfigurationResponse getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration;
    }
    /**
     * [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This property must be set for large results that exceed the maximum response size.
     * 
    */
    public TableReferenceResponse getDestinationTable() {
        return this.destinationTable;
    }
    /**
     * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
    */
    public Boolean getFlattenResults() {
        return this.flattenResults;
    }
    /**
     * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
    */
    public Integer getMaximumBillingTier() {
        return this.maximumBillingTier;
    }
    /**
     * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
    */
    public String getMaximumBytesBilled() {
        return this.maximumBytesBilled;
    }
    /**
     * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
    */
    public String getParameterMode() {
        return this.parameterMode;
    }
    /**
     * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE.
     * 
    */
    public String getPriority() {
        return this.priority;
    }
    /**
     * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * Query parameters for standard SQL queries.
     * 
    */
    public List<QueryParameterResponse> getQueryParameters() {
        return this.queryParameters;
    }
    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
    */
    public RangePartitioningResponse getRangePartitioning() {
        return this.rangePartitioning;
    }
    /**
     * Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
    */
    public List<String> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions;
    }
    /**
     * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
    */
    public Map<String,String> getTableDefinitions() {
        return this.tableDefinitions;
    }
    /**
     * Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
    */
    public TimePartitioningResponse getTimePartitioning() {
        return this.timePartitioning;
    }
    /**
     * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
     * 
    */
    public Boolean getUseLegacySql() {
        return this.useLegacySql;
    }
    /**
     * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
     * 
    */
    public Boolean getUseQueryCache() {
        return this.useQueryCache;
    }
    /**
     * Describes user-defined function resources used in the query.
     * 
    */
    public List<UserDefinedFunctionResourceResponse> getUserDefinedFunctionResources() {
        return this.userDefinedFunctionResources;
    }
    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
    */
    public String getWriteDisposition() {
        return this.writeDisposition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowLargeResults;
        private ClusteringResponse clustering;
        private List<ConnectionPropertyResponse> connectionProperties;
        private String createDisposition;
        private Boolean createSession;
        private DatasetReferenceResponse defaultDataset;
        private EncryptionConfigurationResponse destinationEncryptionConfiguration;
        private TableReferenceResponse destinationTable;
        private Boolean flattenResults;
        private Integer maximumBillingTier;
        private String maximumBytesBilled;
        private String parameterMode;
        private String priority;
        private String query;
        private List<QueryParameterResponse> queryParameters;
        private RangePartitioningResponse rangePartitioning;
        private List<String> schemaUpdateOptions;
        private Map<String,String> tableDefinitions;
        private TimePartitioningResponse timePartitioning;
        private Boolean useLegacySql;
        private Boolean useQueryCache;
        private List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationQueryResponse defaults) {
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

        public Builder allowLargeResults(Boolean allowLargeResults) {
            this.allowLargeResults = Objects.requireNonNull(allowLargeResults);
            return this;
        }
        public Builder clustering(ClusteringResponse clustering) {
            this.clustering = Objects.requireNonNull(clustering);
            return this;
        }
        public Builder connectionProperties(List<ConnectionPropertyResponse> connectionProperties) {
            this.connectionProperties = Objects.requireNonNull(connectionProperties);
            return this;
        }
        public Builder connectionProperties(ConnectionPropertyResponse... connectionProperties) {
            return connectionProperties(List.of(connectionProperties));
        }
        public Builder createDisposition(String createDisposition) {
            this.createDisposition = Objects.requireNonNull(createDisposition);
            return this;
        }
        public Builder createSession(Boolean createSession) {
            this.createSession = Objects.requireNonNull(createSession);
            return this;
        }
        public Builder defaultDataset(DatasetReferenceResponse defaultDataset) {
            this.defaultDataset = Objects.requireNonNull(defaultDataset);
            return this;
        }
        public Builder destinationEncryptionConfiguration(EncryptionConfigurationResponse destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration);
            return this;
        }
        public Builder destinationTable(TableReferenceResponse destinationTable) {
            this.destinationTable = Objects.requireNonNull(destinationTable);
            return this;
        }
        public Builder flattenResults(Boolean flattenResults) {
            this.flattenResults = Objects.requireNonNull(flattenResults);
            return this;
        }
        public Builder maximumBillingTier(Integer maximumBillingTier) {
            this.maximumBillingTier = Objects.requireNonNull(maximumBillingTier);
            return this;
        }
        public Builder maximumBytesBilled(String maximumBytesBilled) {
            this.maximumBytesBilled = Objects.requireNonNull(maximumBytesBilled);
            return this;
        }
        public Builder parameterMode(String parameterMode) {
            this.parameterMode = Objects.requireNonNull(parameterMode);
            return this;
        }
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder queryParameters(List<QueryParameterResponse> queryParameters) {
            this.queryParameters = Objects.requireNonNull(queryParameters);
            return this;
        }
        public Builder queryParameters(QueryParameterResponse... queryParameters) {
            return queryParameters(List.of(queryParameters));
        }
        public Builder rangePartitioning(RangePartitioningResponse rangePartitioning) {
            this.rangePartitioning = Objects.requireNonNull(rangePartitioning);
            return this;
        }
        public Builder schemaUpdateOptions(List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Objects.requireNonNull(schemaUpdateOptions);
            return this;
        }
        public Builder schemaUpdateOptions(String... schemaUpdateOptions) {
            return schemaUpdateOptions(List.of(schemaUpdateOptions));
        }
        public Builder tableDefinitions(Map<String,String> tableDefinitions) {
            this.tableDefinitions = Objects.requireNonNull(tableDefinitions);
            return this;
        }
        public Builder timePartitioning(TimePartitioningResponse timePartitioning) {
            this.timePartitioning = Objects.requireNonNull(timePartitioning);
            return this;
        }
        public Builder useLegacySql(Boolean useLegacySql) {
            this.useLegacySql = Objects.requireNonNull(useLegacySql);
            return this;
        }
        public Builder useQueryCache(Boolean useQueryCache) {
            this.useQueryCache = Objects.requireNonNull(useQueryCache);
            return this;
        }
        public Builder userDefinedFunctionResources(List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Objects.requireNonNull(userDefinedFunctionResources);
            return this;
        }
        public Builder userDefinedFunctionResources(UserDefinedFunctionResourceResponse... userDefinedFunctionResources) {
            return userDefinedFunctionResources(List.of(userDefinedFunctionResources));
        }
        public Builder writeDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }        public JobConfigurationQueryResponse build() {
            return new JobConfigurationQueryResponse(allowLargeResults, clustering, connectionProperties, createDisposition, createSession, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, priority, query, queryParameters, rangePartitioning, schemaUpdateOptions, tableDefinitions, timePartitioning, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
        }
    }
}
