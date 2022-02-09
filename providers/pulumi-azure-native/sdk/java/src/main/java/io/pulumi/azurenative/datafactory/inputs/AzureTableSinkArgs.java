// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureTableSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureTableSinkArgs Empty = new AzureTableSinkArgs();

    @InputImport(name="azureTableDefaultPartitionKeyValue")
    private final @Nullable Input<Object> azureTableDefaultPartitionKeyValue;

    public Input<Object> getAzureTableDefaultPartitionKeyValue() {
        return this.azureTableDefaultPartitionKeyValue == null ? Input.empty() : this.azureTableDefaultPartitionKeyValue;
    }

    @InputImport(name="azureTableInsertType")
    private final @Nullable Input<Object> azureTableInsertType;

    public Input<Object> getAzureTableInsertType() {
        return this.azureTableInsertType == null ? Input.empty() : this.azureTableInsertType;
    }

    @InputImport(name="azureTablePartitionKeyName")
    private final @Nullable Input<Object> azureTablePartitionKeyName;

    public Input<Object> getAzureTablePartitionKeyName() {
        return this.azureTablePartitionKeyName == null ? Input.empty() : this.azureTablePartitionKeyName;
    }

    @InputImport(name="azureTableRowKeyName")
    private final @Nullable Input<Object> azureTableRowKeyName;

    public Input<Object> getAzureTableRowKeyName() {
        return this.azureTableRowKeyName == null ? Input.empty() : this.azureTableRowKeyName;
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

    @InputImport(name="sinkRetryCount")
    private final @Nullable Input<Object> sinkRetryCount;

    public Input<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Input.empty() : this.sinkRetryCount;
    }

    @InputImport(name="sinkRetryWait")
    private final @Nullable Input<Object> sinkRetryWait;

    public Input<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Input.empty() : this.sinkRetryWait;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="writeBatchSize")
    private final @Nullable Input<Object> writeBatchSize;

    public Input<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Input.empty() : this.writeBatchSize;
    }

    @InputImport(name="writeBatchTimeout")
    private final @Nullable Input<Object> writeBatchTimeout;

    public Input<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Input.empty() : this.writeBatchTimeout;
    }

    public AzureTableSinkArgs(
        @Nullable Input<Object> azureTableDefaultPartitionKeyValue,
        @Nullable Input<Object> azureTableInsertType,
        @Nullable Input<Object> azureTablePartitionKeyName,
        @Nullable Input<Object> azureTableRowKeyName,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> sinkRetryCount,
        @Nullable Input<Object> sinkRetryWait,
        Input<String> type,
        @Nullable Input<Object> writeBatchSize,
        @Nullable Input<Object> writeBatchTimeout) {
        this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
        this.azureTableInsertType = azureTableInsertType;
        this.azureTablePartitionKeyName = azureTablePartitionKeyName;
        this.azureTableRowKeyName = azureTableRowKeyName;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private AzureTableSinkArgs() {
        this.azureTableDefaultPartitionKeyValue = Input.empty();
        this.azureTableInsertType = Input.empty();
        this.azureTablePartitionKeyName = Input.empty();
        this.azureTableRowKeyName = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.sinkRetryCount = Input.empty();
        this.sinkRetryWait = Input.empty();
        this.type = Input.empty();
        this.writeBatchSize = Input.empty();
        this.writeBatchTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureTableSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> azureTableDefaultPartitionKeyValue;
        private @Nullable Input<Object> azureTableInsertType;
        private @Nullable Input<Object> azureTablePartitionKeyName;
        private @Nullable Input<Object> azureTableRowKeyName;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> sinkRetryCount;
        private @Nullable Input<Object> sinkRetryWait;
        private Input<String> type;
        private @Nullable Input<Object> writeBatchSize;
        private @Nullable Input<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureTableSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureTableDefaultPartitionKeyValue = defaults.azureTableDefaultPartitionKeyValue;
    	      this.azureTableInsertType = defaults.azureTableInsertType;
    	      this.azureTablePartitionKeyName = defaults.azureTablePartitionKeyName;
    	      this.azureTableRowKeyName = defaults.azureTableRowKeyName;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder setAzureTableDefaultPartitionKeyValue(@Nullable Input<Object> azureTableDefaultPartitionKeyValue) {
            this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
            return this;
        }

        public Builder setAzureTableDefaultPartitionKeyValue(@Nullable Object azureTableDefaultPartitionKeyValue) {
            this.azureTableDefaultPartitionKeyValue = Input.ofNullable(azureTableDefaultPartitionKeyValue);
            return this;
        }

        public Builder setAzureTableInsertType(@Nullable Input<Object> azureTableInsertType) {
            this.azureTableInsertType = azureTableInsertType;
            return this;
        }

        public Builder setAzureTableInsertType(@Nullable Object azureTableInsertType) {
            this.azureTableInsertType = Input.ofNullable(azureTableInsertType);
            return this;
        }

        public Builder setAzureTablePartitionKeyName(@Nullable Input<Object> azureTablePartitionKeyName) {
            this.azureTablePartitionKeyName = azureTablePartitionKeyName;
            return this;
        }

        public Builder setAzureTablePartitionKeyName(@Nullable Object azureTablePartitionKeyName) {
            this.azureTablePartitionKeyName = Input.ofNullable(azureTablePartitionKeyName);
            return this;
        }

        public Builder setAzureTableRowKeyName(@Nullable Input<Object> azureTableRowKeyName) {
            this.azureTableRowKeyName = azureTableRowKeyName;
            return this;
        }

        public Builder setAzureTableRowKeyName(@Nullable Object azureTableRowKeyName) {
            this.azureTableRowKeyName = Input.ofNullable(azureTableRowKeyName);
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

        public Builder setSinkRetryCount(@Nullable Input<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Input.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Input<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Input.ofNullable(sinkRetryWait);
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

        public Builder setWriteBatchSize(@Nullable Input<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Input.ofNullable(writeBatchSize);
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Input<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Input.ofNullable(writeBatchTimeout);
            return this;
        }

        public AzureTableSinkArgs build() {
            return new AzureTableSinkArgs(azureTableDefaultPartitionKeyValue, azureTableInsertType, azureTablePartitionKeyName, azureTableRowKeyName, disableMetricsCollection, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
