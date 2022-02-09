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
public final class DynamicsSinkResponse {
    private final @Nullable Object alternateKeyName;
    private final @Nullable Object disableMetricsCollection;
    private final @Nullable Object ignoreNullValues;
    private final @Nullable Object maxConcurrentConnections;
    private final @Nullable Object sinkRetryCount;
    private final @Nullable Object sinkRetryWait;
    private final String type;
    private final @Nullable Object writeBatchSize;
    private final @Nullable Object writeBatchTimeout;
    private final String writeBehavior;

    @OutputCustomType.Constructor({"alternateKeyName","disableMetricsCollection","ignoreNullValues","maxConcurrentConnections","sinkRetryCount","sinkRetryWait","type","writeBatchSize","writeBatchTimeout","writeBehavior"})
    private DynamicsSinkResponse(
        @Nullable Object alternateKeyName,
        @Nullable Object disableMetricsCollection,
        @Nullable Object ignoreNullValues,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout,
        String writeBehavior) {
        this.alternateKeyName = alternateKeyName;
        this.disableMetricsCollection = disableMetricsCollection;
        this.ignoreNullValues = ignoreNullValues;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type);
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = Objects.requireNonNull(writeBehavior);
    }

    public Optional<Object> getAlternateKeyName() {
        return Optional.ofNullable(this.alternateKeyName);
    }
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    public Optional<Object> getIgnoreNullValues() {
        return Optional.ofNullable(this.ignoreNullValues);
    }
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }
    public String getWriteBehavior() {
        return this.writeBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicsSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object alternateKeyName;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object ignoreNullValues;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private String writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicsSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateKeyName = defaults.alternateKeyName;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.ignoreNullValues = defaults.ignoreNullValues;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder setAlternateKeyName(@Nullable Object alternateKeyName) {
            this.alternateKeyName = alternateKeyName;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setIgnoreNullValues(@Nullable Object ignoreNullValues) {
            this.ignoreNullValues = ignoreNullValues;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBehavior(String writeBehavior) {
            this.writeBehavior = Objects.requireNonNull(writeBehavior);
            return this;
        }

        public DynamicsSinkResponse build() {
            return new DynamicsSinkResponse(alternateKeyName, disableMetricsCollection, ignoreNullValues, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
