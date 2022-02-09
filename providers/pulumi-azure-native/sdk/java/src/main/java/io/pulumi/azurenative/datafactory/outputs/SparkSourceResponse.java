// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SparkSourceResponse {
    private final @Nullable Object additionalColumns;
    private final @Nullable Object disableMetricsCollection;
    private final @Nullable Object maxConcurrentConnections;
    private final @Nullable Object query;
    private final @Nullable Object queryTimeout;
    private final @Nullable Object sourceRetryCount;
    private final @Nullable Object sourceRetryWait;
    private final String type;

    @OutputCustomType.Constructor({"additionalColumns","disableMetricsCollection","maxConcurrentConnections","query","queryTimeout","sourceRetryCount","sourceRetryWait","type"})
    private SparkSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object query,
        @Nullable Object queryTimeout,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.query = query;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getAdditionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    public Optional<Object> getQuery() {
        return Optional.ofNullable(this.query);
    }
    public Optional<Object> getQueryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    public Optional<Object> getSourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    public Optional<Object> getSourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object query;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.query = defaults.query;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
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

        public Builder setQuery(@Nullable Object query) {
            this.query = query;
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

        public SparkSourceResponse build() {
            return new SparkSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, query, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
