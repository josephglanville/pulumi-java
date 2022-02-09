// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.MongoDbCursorMethodsPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CosmosDbMongoDbApiSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CosmosDbMongoDbApiSourceArgs Empty = new CosmosDbMongoDbApiSourceArgs();

    @InputImport(name="additionalColumns")
    private final @Nullable Input<Object> additionalColumns;

    public Input<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Input.empty() : this.additionalColumns;
    }

    @InputImport(name="batchSize")
    private final @Nullable Input<Object> batchSize;

    public Input<Object> getBatchSize() {
        return this.batchSize == null ? Input.empty() : this.batchSize;
    }

    @InputImport(name="cursorMethods")
    private final @Nullable Input<MongoDbCursorMethodsPropertiesArgs> cursorMethods;

    public Input<MongoDbCursorMethodsPropertiesArgs> getCursorMethods() {
        return this.cursorMethods == null ? Input.empty() : this.cursorMethods;
    }

    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    @InputImport(name="filter")
    private final @Nullable Input<Object> filter;

    public Input<Object> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    @InputImport(name="queryTimeout")
    private final @Nullable Input<Object> queryTimeout;

    public Input<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Input.empty() : this.queryTimeout;
    }

    @InputImport(name="sourceRetryCount")
    private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    @InputImport(name="sourceRetryWait")
    private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CosmosDbMongoDbApiSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> batchSize,
        @Nullable Input<MongoDbCursorMethodsPropertiesArgs> cursorMethods,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> filter,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> queryTimeout,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.cursorMethods = cursorMethods;
        this.disableMetricsCollection = disableMetricsCollection;
        this.filter = filter;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CosmosDbMongoDbApiSourceArgs() {
        this.additionalColumns = Input.empty();
        this.batchSize = Input.empty();
        this.cursorMethods = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.filter = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.queryTimeout = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbMongoDbApiSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> batchSize;
        private @Nullable Input<MongoDbCursorMethodsPropertiesArgs> cursorMethods;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> filter;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> queryTimeout;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbMongoDbApiSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.cursorMethods = defaults.cursorMethods;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.filter = defaults.filter;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Input<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Input.ofNullable(additionalColumns);
            return this;
        }

        public Builder setBatchSize(@Nullable Input<Object> batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setBatchSize(@Nullable Object batchSize) {
            this.batchSize = Input.ofNullable(batchSize);
            return this;
        }

        public Builder setCursorMethods(@Nullable Input<MongoDbCursorMethodsPropertiesArgs> cursorMethods) {
            this.cursorMethods = cursorMethods;
            return this;
        }

        public Builder setCursorMethods(@Nullable MongoDbCursorMethodsPropertiesArgs cursorMethods) {
            this.cursorMethods = Input.ofNullable(cursorMethods);
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setFilter(@Nullable Input<Object> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable Object filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setQueryTimeout(@Nullable Input<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Input.ofNullable(queryTimeout);
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public CosmosDbMongoDbApiSourceArgs build() {
            return new CosmosDbMongoDbApiSourceArgs(additionalColumns, batchSize, cursorMethods, disableMetricsCollection, filter, maxConcurrentConnections, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
