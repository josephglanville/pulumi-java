// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestSinkArgs Empty = new RestSinkArgs();

    @InputImport(name="additionalHeaders")
    private final @Nullable Input<Object> additionalHeaders;

    public Input<Object> getAdditionalHeaders() {
        return this.additionalHeaders == null ? Input.empty() : this.additionalHeaders;
    }

    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    @InputImport(name="httpCompressionType")
    private final @Nullable Input<Object> httpCompressionType;

    public Input<Object> getHttpCompressionType() {
        return this.httpCompressionType == null ? Input.empty() : this.httpCompressionType;
    }

    @InputImport(name="httpRequestTimeout")
    private final @Nullable Input<Object> httpRequestTimeout;

    public Input<Object> getHttpRequestTimeout() {
        return this.httpRequestTimeout == null ? Input.empty() : this.httpRequestTimeout;
    }

    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    @InputImport(name="requestInterval")
    private final @Nullable Input<Object> requestInterval;

    public Input<Object> getRequestInterval() {
        return this.requestInterval == null ? Input.empty() : this.requestInterval;
    }

    @InputImport(name="requestMethod")
    private final @Nullable Input<Object> requestMethod;

    public Input<Object> getRequestMethod() {
        return this.requestMethod == null ? Input.empty() : this.requestMethod;
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

    public RestSinkArgs(
        @Nullable Input<Object> additionalHeaders,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> httpCompressionType,
        @Nullable Input<Object> httpRequestTimeout,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> requestInterval,
        @Nullable Input<Object> requestMethod,
        @Nullable Input<Object> sinkRetryCount,
        @Nullable Input<Object> sinkRetryWait,
        Input<String> type,
        @Nullable Input<Object> writeBatchSize,
        @Nullable Input<Object> writeBatchTimeout) {
        this.additionalHeaders = additionalHeaders;
        this.disableMetricsCollection = disableMetricsCollection;
        this.httpCompressionType = httpCompressionType;
        this.httpRequestTimeout = httpRequestTimeout;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.requestInterval = requestInterval;
        this.requestMethod = requestMethod;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private RestSinkArgs() {
        this.additionalHeaders = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.httpCompressionType = Input.empty();
        this.httpRequestTimeout = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.requestInterval = Input.empty();
        this.requestMethod = Input.empty();
        this.sinkRetryCount = Input.empty();
        this.sinkRetryWait = Input.empty();
        this.type = Input.empty();
        this.writeBatchSize = Input.empty();
        this.writeBatchTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalHeaders;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> httpCompressionType;
        private @Nullable Input<Object> httpRequestTimeout;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> requestInterval;
        private @Nullable Input<Object> requestMethod;
        private @Nullable Input<Object> sinkRetryCount;
        private @Nullable Input<Object> sinkRetryWait;
        private Input<String> type;
        private @Nullable Input<Object> writeBatchSize;
        private @Nullable Input<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RestSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.httpCompressionType = defaults.httpCompressionType;
    	      this.httpRequestTimeout = defaults.httpRequestTimeout;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.requestInterval = defaults.requestInterval;
    	      this.requestMethod = defaults.requestMethod;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder setAdditionalHeaders(@Nullable Input<Object> additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder setAdditionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = Input.ofNullable(additionalHeaders);
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

        public Builder setHttpCompressionType(@Nullable Input<Object> httpCompressionType) {
            this.httpCompressionType = httpCompressionType;
            return this;
        }

        public Builder setHttpCompressionType(@Nullable Object httpCompressionType) {
            this.httpCompressionType = Input.ofNullable(httpCompressionType);
            return this;
        }

        public Builder setHttpRequestTimeout(@Nullable Input<Object> httpRequestTimeout) {
            this.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        public Builder setHttpRequestTimeout(@Nullable Object httpRequestTimeout) {
            this.httpRequestTimeout = Input.ofNullable(httpRequestTimeout);
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

        public Builder setRequestInterval(@Nullable Input<Object> requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder setRequestInterval(@Nullable Object requestInterval) {
            this.requestInterval = Input.ofNullable(requestInterval);
            return this;
        }

        public Builder setRequestMethod(@Nullable Input<Object> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setRequestMethod(@Nullable Object requestMethod) {
            this.requestMethod = Input.ofNullable(requestMethod);
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

        public RestSinkArgs build() {
            return new RestSinkArgs(additionalHeaders, disableMetricsCollection, httpCompressionType, httpRequestTimeout, maxConcurrentConnections, requestInterval, requestMethod, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
