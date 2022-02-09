// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureTableSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureTableSourceResponse Empty = new AzureTableSourceResponse();

    @InputImport(name="additionalColumns")
    private final @Nullable Object additionalColumns;

    public Optional<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    @InputImport(name="azureTableSourceIgnoreTableNotFound")
    private final @Nullable Object azureTableSourceIgnoreTableNotFound;

    public Optional<Object> getAzureTableSourceIgnoreTableNotFound() {
        return this.azureTableSourceIgnoreTableNotFound == null ? Optional.empty() : Optional.ofNullable(this.azureTableSourceIgnoreTableNotFound);
    }

    @InputImport(name="azureTableSourceQuery")
    private final @Nullable Object azureTableSourceQuery;

    public Optional<Object> getAzureTableSourceQuery() {
        return this.azureTableSourceQuery == null ? Optional.empty() : Optional.ofNullable(this.azureTableSourceQuery);
    }

    @InputImport(name="disableMetricsCollection")
    private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    @InputImport(name="queryTimeout")
    private final @Nullable Object queryTimeout;

    public Optional<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Optional.empty() : Optional.ofNullable(this.queryTimeout);
    }

    @InputImport(name="sourceRetryCount")
    private final @Nullable Object sourceRetryCount;

    public Optional<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    @InputImport(name="sourceRetryWait")
    private final @Nullable Object sourceRetryWait;

    public Optional<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AzureTableSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object azureTableSourceIgnoreTableNotFound,
        @Nullable Object azureTableSourceQuery,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object queryTimeout,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.azureTableSourceIgnoreTableNotFound = azureTableSourceIgnoreTableNotFound;
        this.azureTableSourceQuery = azureTableSourceQuery;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureTableSourceResponse() {
        this.additionalColumns = null;
        this.azureTableSourceIgnoreTableNotFound = null;
        this.azureTableSourceQuery = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.queryTimeout = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureTableSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object azureTableSourceIgnoreTableNotFound;
        private @Nullable Object azureTableSourceQuery;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureTableSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.azureTableSourceIgnoreTableNotFound = defaults.azureTableSourceIgnoreTableNotFound;
    	      this.azureTableSourceQuery = defaults.azureTableSourceQuery;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setAzureTableSourceIgnoreTableNotFound(@Nullable Object azureTableSourceIgnoreTableNotFound) {
            this.azureTableSourceIgnoreTableNotFound = azureTableSourceIgnoreTableNotFound;
            return this;
        }

        public Builder setAzureTableSourceQuery(@Nullable Object azureTableSourceQuery) {
            this.azureTableSourceQuery = azureTableSourceQuery;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureTableSourceResponse build() {
            return new AzureTableSourceResponse(additionalColumns, azureTableSourceIgnoreTableNotFound, azureTableSourceQuery, disableMetricsCollection, maxConcurrentConnections, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
