// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobQueryDefaultDatasetGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryDestinationEncryptionConfigurationGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryDestinationTableGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryScriptOptionsGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryUserDefinedFunctionResourceGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryGetArgs Empty = new JobQueryGetArgs();

    /**
     * If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance.
     * Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed.
     * However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
     */
    @InputImport(name="allowLargeResults")
      private final @Nullable Output<Boolean> allowLargeResults;

    public Output<Boolean> getAllowLargeResults() {
        return this.allowLargeResults == null ? Output.empty() : this.allowLargeResults;
    }

    /**
     * Specifies whether the job is allowed to create new tables. The following values are supported:
     * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
     * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result.
     * Creation, truncation and append actions occur as one atomic update upon job completion
     * Default value is `CREATE_IF_NEEDED`.
     * Possible values are `CREATE_IF_NEEDED` and `CREATE_NEVER`.
     * 
     */
    @InputImport(name="createDisposition")
      private final @Nullable Output<String> createDisposition;

    public Output<String> getCreateDisposition() {
        return this.createDisposition == null ? Output.empty() : this.createDisposition;
    }

    /**
     * Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultDataset")
      private final @Nullable Output<JobQueryDefaultDatasetGetArgs> defaultDataset;

    public Output<JobQueryDefaultDatasetGetArgs> getDefaultDataset() {
        return this.defaultDataset == null ? Output.empty() : this.defaultDataset;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * 
     */
    @InputImport(name="destinationEncryptionConfiguration")
      private final @Nullable Output<JobQueryDestinationEncryptionConfigurationGetArgs> destinationEncryptionConfiguration;

    public Output<JobQueryDestinationEncryptionConfigurationGetArgs> getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration == null ? Output.empty() : this.destinationEncryptionConfiguration;
    }

    /**
     * The destination table.
     * Structure is documented below.
     * 
     */
    @InputImport(name="destinationTable")
      private final @Nullable Output<JobQueryDestinationTableGetArgs> destinationTable;

    public Output<JobQueryDestinationTableGetArgs> getDestinationTable() {
        return this.destinationTable == null ? Output.empty() : this.destinationTable;
    }

    /**
     * If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results.
     * allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
     */
    @InputImport(name="flattenResults")
      private final @Nullable Output<Boolean> flattenResults;

    public Output<Boolean> getFlattenResults() {
        return this.flattenResults == null ? Output.empty() : this.flattenResults;
    }

    /**
     * Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    @InputImport(name="maximumBillingTier")
      private final @Nullable Output<Integer> maximumBillingTier;

    public Output<Integer> getMaximumBillingTier() {
        return this.maximumBillingTier == null ? Output.empty() : this.maximumBillingTier;
    }

    /**
     * Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    @InputImport(name="maximumBytesBilled")
      private final @Nullable Output<String> maximumBytesBilled;

    public Output<String> getMaximumBytesBilled() {
        return this.maximumBytesBilled == null ? Output.empty() : this.maximumBytesBilled;
    }

    /**
     * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
     */
    @InputImport(name="parameterMode")
      private final @Nullable Output<String> parameterMode;

    public Output<String> getParameterMode() {
        return this.parameterMode == null ? Output.empty() : this.parameterMode;
    }

    /**
     * Specifies a priority for the query.
     * Default value is `INTERACTIVE`.
     * Possible values are `INTERACTIVE` and `BATCH`.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Output<String> priority;

    public Output<String> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * Configures a query job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="query", required=true)
      private final Output<String> query;

    public Output<String> getQuery() {
        return this.query;
    }

    /**
     * Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or
     * supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND;
     * when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators.
     * For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified:
     * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
     * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    @InputImport(name="schemaUpdateOptions")
      private final @Nullable Output<List<String>> schemaUpdateOptions;

    public Output<List<String>> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions == null ? Output.empty() : this.schemaUpdateOptions;
    }

    /**
     * Options controlling the execution of scripts.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scriptOptions")
      private final @Nullable Output<JobQueryScriptOptionsGetArgs> scriptOptions;

    public Output<JobQueryScriptOptionsGetArgs> getScriptOptions() {
        return this.scriptOptions == null ? Output.empty() : this.scriptOptions;
    }

    /**
     * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true.
     * If set to false, the query will use BigQuery's standard SQL.
     * 
     */
    @InputImport(name="useLegacySql")
      private final @Nullable Output<Boolean> useLegacySql;

    public Output<Boolean> getUseLegacySql() {
        return this.useLegacySql == null ? Output.empty() : this.useLegacySql;
    }

    /**
     * Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever
     * tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified.
     * The default value is true.
     * 
     */
    @InputImport(name="useQueryCache")
      private final @Nullable Output<Boolean> useQueryCache;

    public Output<Boolean> getUseQueryCache() {
        return this.useQueryCache == null ? Output.empty() : this.useQueryCache;
    }

    /**
     * Describes user-defined function resources used in the query.
     * Structure is documented below.
     * 
     */
    @InputImport(name="userDefinedFunctionResources")
      private final @Nullable Output<List<JobQueryUserDefinedFunctionResourceGetArgs>> userDefinedFunctionResources;

    public Output<List<JobQueryUserDefinedFunctionResourceGetArgs>> getUserDefinedFunctionResources() {
        return this.userDefinedFunctionResources == null ? Output.empty() : this.userDefinedFunctionResources;
    }

    /**
     * Specifies the action that occurs if the destination table already exists. The following values are supported:
     * WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
     * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
     * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result.
     * Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
     * Creation, truncation and append actions occur as one atomic update upon job completion.
     * Default value is `WRITE_EMPTY`.
     * Possible values are `WRITE_TRUNCATE`, `WRITE_APPEND`, and `WRITE_EMPTY`.
     * 
     */
    @InputImport(name="writeDisposition")
      private final @Nullable Output<String> writeDisposition;

    public Output<String> getWriteDisposition() {
        return this.writeDisposition == null ? Output.empty() : this.writeDisposition;
    }

    public JobQueryGetArgs(
        @Nullable Output<Boolean> allowLargeResults,
        @Nullable Output<String> createDisposition,
        @Nullable Output<JobQueryDefaultDatasetGetArgs> defaultDataset,
        @Nullable Output<JobQueryDestinationEncryptionConfigurationGetArgs> destinationEncryptionConfiguration,
        @Nullable Output<JobQueryDestinationTableGetArgs> destinationTable,
        @Nullable Output<Boolean> flattenResults,
        @Nullable Output<Integer> maximumBillingTier,
        @Nullable Output<String> maximumBytesBilled,
        @Nullable Output<String> parameterMode,
        @Nullable Output<String> priority,
        Output<String> query,
        @Nullable Output<List<String>> schemaUpdateOptions,
        @Nullable Output<JobQueryScriptOptionsGetArgs> scriptOptions,
        @Nullable Output<Boolean> useLegacySql,
        @Nullable Output<Boolean> useQueryCache,
        @Nullable Output<List<JobQueryUserDefinedFunctionResourceGetArgs>> userDefinedFunctionResources,
        @Nullable Output<String> writeDisposition) {
        this.allowLargeResults = allowLargeResults;
        this.createDisposition = createDisposition;
        this.defaultDataset = defaultDataset;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.flattenResults = flattenResults;
        this.maximumBillingTier = maximumBillingTier;
        this.maximumBytesBilled = maximumBytesBilled;
        this.parameterMode = parameterMode;
        this.priority = priority;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.schemaUpdateOptions = schemaUpdateOptions;
        this.scriptOptions = scriptOptions;
        this.useLegacySql = useLegacySql;
        this.useQueryCache = useQueryCache;
        this.userDefinedFunctionResources = userDefinedFunctionResources;
        this.writeDisposition = writeDisposition;
    }

    private JobQueryGetArgs() {
        this.allowLargeResults = Output.empty();
        this.createDisposition = Output.empty();
        this.defaultDataset = Output.empty();
        this.destinationEncryptionConfiguration = Output.empty();
        this.destinationTable = Output.empty();
        this.flattenResults = Output.empty();
        this.maximumBillingTier = Output.empty();
        this.maximumBytesBilled = Output.empty();
        this.parameterMode = Output.empty();
        this.priority = Output.empty();
        this.query = Output.empty();
        this.schemaUpdateOptions = Output.empty();
        this.scriptOptions = Output.empty();
        this.useLegacySql = Output.empty();
        this.useQueryCache = Output.empty();
        this.userDefinedFunctionResources = Output.empty();
        this.writeDisposition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowLargeResults;
        private @Nullable Output<String> createDisposition;
        private @Nullable Output<JobQueryDefaultDatasetGetArgs> defaultDataset;
        private @Nullable Output<JobQueryDestinationEncryptionConfigurationGetArgs> destinationEncryptionConfiguration;
        private @Nullable Output<JobQueryDestinationTableGetArgs> destinationTable;
        private @Nullable Output<Boolean> flattenResults;
        private @Nullable Output<Integer> maximumBillingTier;
        private @Nullable Output<String> maximumBytesBilled;
        private @Nullable Output<String> parameterMode;
        private @Nullable Output<String> priority;
        private Output<String> query;
        private @Nullable Output<List<String>> schemaUpdateOptions;
        private @Nullable Output<JobQueryScriptOptionsGetArgs> scriptOptions;
        private @Nullable Output<Boolean> useLegacySql;
        private @Nullable Output<Boolean> useQueryCache;
        private @Nullable Output<List<JobQueryUserDefinedFunctionResourceGetArgs>> userDefinedFunctionResources;
        private @Nullable Output<String> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLargeResults = defaults.allowLargeResults;
    	      this.createDisposition = defaults.createDisposition;
    	      this.defaultDataset = defaults.defaultDataset;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.flattenResults = defaults.flattenResults;
    	      this.maximumBillingTier = defaults.maximumBillingTier;
    	      this.maximumBytesBilled = defaults.maximumBytesBilled;
    	      this.parameterMode = defaults.parameterMode;
    	      this.priority = defaults.priority;
    	      this.query = defaults.query;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.scriptOptions = defaults.scriptOptions;
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

        public Builder createDisposition(@Nullable Output<String> createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }

        public Builder createDisposition(@Nullable String createDisposition) {
            this.createDisposition = Output.ofNullable(createDisposition);
            return this;
        }

        public Builder defaultDataset(@Nullable Output<JobQueryDefaultDatasetGetArgs> defaultDataset) {
            this.defaultDataset = defaultDataset;
            return this;
        }

        public Builder defaultDataset(@Nullable JobQueryDefaultDatasetGetArgs defaultDataset) {
            this.defaultDataset = Output.ofNullable(defaultDataset);
            return this;
        }

        public Builder destinationEncryptionConfiguration(@Nullable Output<JobQueryDestinationEncryptionConfigurationGetArgs> destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        public Builder destinationEncryptionConfiguration(@Nullable JobQueryDestinationEncryptionConfigurationGetArgs destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Output.ofNullable(destinationEncryptionConfiguration);
            return this;
        }

        public Builder destinationTable(@Nullable Output<JobQueryDestinationTableGetArgs> destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }

        public Builder destinationTable(@Nullable JobQueryDestinationTableGetArgs destinationTable) {
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

        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
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

        public Builder scriptOptions(@Nullable Output<JobQueryScriptOptionsGetArgs> scriptOptions) {
            this.scriptOptions = scriptOptions;
            return this;
        }

        public Builder scriptOptions(@Nullable JobQueryScriptOptionsGetArgs scriptOptions) {
            this.scriptOptions = Output.ofNullable(scriptOptions);
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

        public Builder userDefinedFunctionResources(@Nullable Output<List<JobQueryUserDefinedFunctionResourceGetArgs>> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }

        public Builder userDefinedFunctionResources(@Nullable List<JobQueryUserDefinedFunctionResourceGetArgs> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Output.ofNullable(userDefinedFunctionResources);
            return this;
        }

        public Builder writeDisposition(@Nullable Output<String> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder writeDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = Output.ofNullable(writeDisposition);
            return this;
        }
        public JobQueryGetArgs build() {
            return new JobQueryGetArgs(allowLargeResults, createDisposition, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, priority, query, schemaUpdateOptions, scriptOptions, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
        }
    }
}
