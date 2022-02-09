// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CosmosDbSqlApiSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final CosmosDbSqlApiSourceResponse Empty = new CosmosDbSqlApiSourceResponse();

    @InputImport(name="additionalColumns")
    private final @Nullable Object additionalColumns;

    public Optional<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    @InputImport(name="detectDatetime")
    private final @Nullable Object detectDatetime;

    public Optional<Object> getDetectDatetime() {
        return this.detectDatetime == null ? Optional.empty() : Optional.ofNullable(this.detectDatetime);
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

    @InputImport(name="pageSize")
    private final @Nullable Object pageSize;

    public Optional<Object> getPageSize() {
        return this.pageSize == null ? Optional.empty() : Optional.ofNullable(this.pageSize);
    }

    @InputImport(name="preferredRegions")
    private final @Nullable Object preferredRegions;

    public Optional<Object> getPreferredRegions() {
        return this.preferredRegions == null ? Optional.empty() : Optional.ofNullable(this.preferredRegions);
    }

    @InputImport(name="query")
    private final @Nullable Object query;

    public Optional<Object> getQuery() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
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

    public CosmosDbSqlApiSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object detectDatetime,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object pageSize,
        @Nullable Object preferredRegions,
        @Nullable Object query,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.detectDatetime = detectDatetime;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.pageSize = pageSize;
        this.preferredRegions = preferredRegions;
        this.query = query;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CosmosDbSqlApiSourceResponse() {
        this.additionalColumns = null;
        this.detectDatetime = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.pageSize = null;
        this.preferredRegions = null;
        this.query = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbSqlApiSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object detectDatetime;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object pageSize;
        private @Nullable Object preferredRegions;
        private @Nullable Object query;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbSqlApiSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.detectDatetime = defaults.detectDatetime;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.pageSize = defaults.pageSize;
    	      this.preferredRegions = defaults.preferredRegions;
    	      this.query = defaults.query;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setDetectDatetime(@Nullable Object detectDatetime) {
            this.detectDatetime = detectDatetime;
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

        public Builder setPageSize(@Nullable Object pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder setPreferredRegions(@Nullable Object preferredRegions) {
            this.preferredRegions = preferredRegions;
            return this;
        }

        public Builder setQuery(@Nullable Object query) {
            this.query = query;
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

        public CosmosDbSqlApiSourceResponse build() {
            return new CosmosDbSqlApiSourceResponse(additionalColumns, detectDatetime, disableMetricsCollection, maxConcurrentConnections, pageSize, preferredRegions, query, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
