// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SalesforceServiceCloudSinkResponse {
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The name of the external ID field for upsert operation. Default value is 'Id' column. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object externalIdFieldName;
    /**
     * The flag indicating whether or not to ignore null values from input dataset (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object ignoreNullValues;
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sinkRetryCount;
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sinkRetryWait;
    /**
     * Copy sink type.
     * Expected value is 'SalesforceServiceCloudSink'.
     * 
     */
    private final String type;
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object writeBatchSize;
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object writeBatchTimeout;
    /**
     * The write behavior for the operation. Default is Insert.
     * 
     */
    private final @Nullable String writeBehavior;

    @CustomType.Constructor
    private SalesforceServiceCloudSinkResponse(
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("externalIdFieldName") @Nullable Object externalIdFieldName,
        @CustomType.Parameter("ignoreNullValues") @Nullable Object ignoreNullValues,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("sinkRetryCount") @Nullable Object sinkRetryCount,
        @CustomType.Parameter("sinkRetryWait") @Nullable Object sinkRetryWait,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("writeBatchSize") @Nullable Object writeBatchSize,
        @CustomType.Parameter("writeBatchTimeout") @Nullable Object writeBatchTimeout,
        @CustomType.Parameter("writeBehavior") @Nullable String writeBehavior) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.externalIdFieldName = externalIdFieldName;
        this.ignoreNullValues = ignoreNullValues;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = type;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The name of the external ID field for upsert operation. Default value is 'Id' column. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getExternalIdFieldName() {
        return Optional.ofNullable(this.externalIdFieldName);
    }
    /**
     * The flag indicating whether or not to ignore null values from input dataset (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getIgnoreNullValues() {
        return Optional.ofNullable(this.ignoreNullValues);
    }
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    /**
     * Copy sink type.
     * Expected value is 'SalesforceServiceCloudSink'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }
    /**
     * The write behavior for the operation. Default is Insert.
     * 
    */
    public Optional<String> getWriteBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SalesforceServiceCloudSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object externalIdFieldName;
        private @Nullable Object ignoreNullValues;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private @Nullable String writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(SalesforceServiceCloudSinkResponse defaults) {
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

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder externalIdFieldName(@Nullable Object externalIdFieldName) {
            this.externalIdFieldName = externalIdFieldName;
            return this;
        }
        public Builder ignoreNullValues(@Nullable Object ignoreNullValues) {
            this.ignoreNullValues = ignoreNullValues;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBehavior(@Nullable String writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }        public SalesforceServiceCloudSinkResponse build() {
            return new SalesforceServiceCloudSinkResponse(disableMetricsCollection, externalIdFieldName, ignoreNullValues, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
