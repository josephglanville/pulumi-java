// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SapHanaPartitionSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SapHanaSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapHanaSourceArgs Empty = new SapHanaSourceArgs();

    @InputImport(name="additionalColumns")
    private final @Nullable Input<Object> additionalColumns;

    public Input<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Input.empty() : this.additionalColumns;
    }

    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    @InputImport(name="packetSize")
    private final @Nullable Input<Object> packetSize;

    public Input<Object> getPacketSize() {
        return this.packetSize == null ? Input.empty() : this.packetSize;
    }

    @InputImport(name="partitionOption")
    private final @Nullable Input<Object> partitionOption;

    public Input<Object> getPartitionOption() {
        return this.partitionOption == null ? Input.empty() : this.partitionOption;
    }

    @InputImport(name="partitionSettings")
    private final @Nullable Input<SapHanaPartitionSettingsArgs> partitionSettings;

    public Input<SapHanaPartitionSettingsArgs> getPartitionSettings() {
        return this.partitionSettings == null ? Input.empty() : this.partitionSettings;
    }

    @InputImport(name="query")
    private final @Nullable Input<Object> query;

    public Input<Object> getQuery() {
        return this.query == null ? Input.empty() : this.query;
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

    public SapHanaSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> packetSize,
        @Nullable Input<Object> partitionOption,
        @Nullable Input<SapHanaPartitionSettingsArgs> partitionSettings,
        @Nullable Input<Object> query,
        @Nullable Input<Object> queryTimeout,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.packetSize = packetSize;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.query = query;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapHanaSourceArgs() {
        this.additionalColumns = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.packetSize = Input.empty();
        this.partitionOption = Input.empty();
        this.partitionSettings = Input.empty();
        this.query = Input.empty();
        this.queryTimeout = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapHanaSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> packetSize;
        private @Nullable Input<Object> partitionOption;
        private @Nullable Input<SapHanaPartitionSettingsArgs> partitionSettings;
        private @Nullable Input<Object> query;
        private @Nullable Input<Object> queryTimeout;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapHanaSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.packetSize = defaults.packetSize;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.query = defaults.query;
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

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
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

        public Builder setPacketSize(@Nullable Input<Object> packetSize) {
            this.packetSize = packetSize;
            return this;
        }

        public Builder setPacketSize(@Nullable Object packetSize) {
            this.packetSize = Input.ofNullable(packetSize);
            return this;
        }

        public Builder setPartitionOption(@Nullable Input<Object> partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder setPartitionOption(@Nullable Object partitionOption) {
            this.partitionOption = Input.ofNullable(partitionOption);
            return this;
        }

        public Builder setPartitionSettings(@Nullable Input<SapHanaPartitionSettingsArgs> partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder setPartitionSettings(@Nullable SapHanaPartitionSettingsArgs partitionSettings) {
            this.partitionSettings = Input.ofNullable(partitionSettings);
            return this;
        }

        public Builder setQuery(@Nullable Input<Object> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable Object query) {
            this.query = Input.ofNullable(query);
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

        public SapHanaSourceArgs build() {
            return new SapHanaSourceArgs(additionalColumns, disableMetricsCollection, maxConcurrentConnections, packetSize, partitionOption, partitionSettings, query, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
