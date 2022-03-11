// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.SalesforceSinkWriteBehavior;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Salesforce sink.
 * 
 */
public final class SalesforceSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SalesforceSinkArgs Empty = new SalesforceSinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Output.empty() : this.disableMetricsCollection;
    }

    /**
     * The name of the external ID field for upsert operation. Default value is 'Id' column. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="externalIdFieldName")
      private final @Nullable Output<Object> externalIdFieldName;

    public Output<Object> getExternalIdFieldName() {
        return this.externalIdFieldName == null ? Output.empty() : this.externalIdFieldName;
    }

    /**
     * The flag indicating whether or not to ignore null values from input dataset (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="ignoreNullValues")
      private final @Nullable Output<Object> ignoreNullValues;

    public Output<Object> getIgnoreNullValues() {
        return this.ignoreNullValues == null ? Output.empty() : this.ignoreNullValues;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Output.empty() : this.maxConcurrentConnections;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Output.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Output.empty() : this.sinkRetryWait;
    }

    /**
     * Copy sink type.
     * Expected value is 'SalesforceSink'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Output.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Output.empty() : this.writeBatchTimeout;
    }

    /**
     * The write behavior for the operation. Default is Insert.
     * 
     */
    @InputImport(name="writeBehavior")
      private final @Nullable Output<Either<String,SalesforceSinkWriteBehavior>> writeBehavior;

    public Output<Either<String,SalesforceSinkWriteBehavior>> getWriteBehavior() {
        return this.writeBehavior == null ? Output.empty() : this.writeBehavior;
    }

    public SalesforceSinkArgs(
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> externalIdFieldName,
        @Nullable Output<Object> ignoreNullValues,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        Output<String> type,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout,
        @Nullable Output<Either<String,SalesforceSinkWriteBehavior>> writeBehavior) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.externalIdFieldName = externalIdFieldName;
        this.ignoreNullValues = ignoreNullValues;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    private SalesforceSinkArgs() {
        this.disableMetricsCollection = Output.empty();
        this.externalIdFieldName = Output.empty();
        this.ignoreNullValues = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.sinkRetryCount = Output.empty();
        this.sinkRetryWait = Output.empty();
        this.type = Output.empty();
        this.writeBatchSize = Output.empty();
        this.writeBatchTimeout = Output.empty();
        this.writeBehavior = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SalesforceSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> externalIdFieldName;
        private @Nullable Output<Object> ignoreNullValues;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private Output<String> type;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;
        private @Nullable Output<Either<String,SalesforceSinkWriteBehavior>> writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(SalesforceSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.externalIdFieldName = defaults.externalIdFieldName;
    	      this.ignoreNullValues = defaults.ignoreNullValues;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder externalIdFieldName(@Nullable Output<Object> externalIdFieldName) {
            this.externalIdFieldName = externalIdFieldName;
            return this;
        }

        public Builder externalIdFieldName(@Nullable Object externalIdFieldName) {
            this.externalIdFieldName = Output.ofNullable(externalIdFieldName);
            return this;
        }

        public Builder ignoreNullValues(@Nullable Output<Object> ignoreNullValues) {
            this.ignoreNullValues = ignoreNullValues;
            return this;
        }

        public Builder ignoreNullValues(@Nullable Object ignoreNullValues) {
            this.ignoreNullValues = Output.ofNullable(ignoreNullValues);
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

        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Output.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Output.ofNullable(sinkRetryWait);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Output.ofNullable(writeBatchSize);
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Output.ofNullable(writeBatchTimeout);
            return this;
        }

        public Builder writeBehavior(@Nullable Output<Either<String,SalesforceSinkWriteBehavior>> writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }

        public Builder writeBehavior(@Nullable Either<String,SalesforceSinkWriteBehavior> writeBehavior) {
            this.writeBehavior = Output.ofNullable(writeBehavior);
            return this;
        }
        public SalesforceSinkArgs build() {
            return new SalesforceSinkArgs(disableMetricsCollection, externalIdFieldName, ignoreNullValues, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
