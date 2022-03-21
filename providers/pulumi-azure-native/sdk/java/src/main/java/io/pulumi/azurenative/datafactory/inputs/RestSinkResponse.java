// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Rest service Sink.
 * 
 */
public final class RestSinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestSinkResponse Empty = new RestSinkResponse();

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="additionalHeaders")
      private final @Nullable Object additionalHeaders;

    public Optional<Object> getAdditionalHeaders() {
        return this.additionalHeaders == null ? Optional.empty() : Optional.ofNullable(this.additionalHeaders);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Http Compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
     * 
     */
    @Import(name="httpCompressionType")
      private final @Nullable Object httpCompressionType;

    public Optional<Object> getHttpCompressionType() {
        return this.httpCompressionType == null ? Optional.empty() : Optional.ofNullable(this.httpCompressionType);
    }

    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="httpRequestTimeout")
      private final @Nullable Object httpRequestTimeout;

    public Optional<Object> getHttpRequestTimeout() {
        return this.httpRequestTimeout == null ? Optional.empty() : Optional.ofNullable(this.httpRequestTimeout);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The time to await before sending next request, in milliseconds
     * 
     */
    @Import(name="requestInterval")
      private final @Nullable Object requestInterval;

    public Optional<Object> getRequestInterval() {
        return this.requestInterval == null ? Optional.empty() : Optional.ofNullable(this.requestInterval);
    }

    /**
     * The HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestMethod")
      private final @Nullable Object requestMethod;

    public Optional<Object> getRequestMethod() {
        return this.requestMethod == null ? Optional.empty() : Optional.ofNullable(this.requestMethod);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Object sinkRetryCount;

    public Optional<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Object sinkRetryWait;

    public Optional<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is 'RestSink'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Object writeBatchSize;

    public Optional<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Optional.empty() : Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Object writeBatchTimeout;

    public Optional<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Optional.empty() : Optional.ofNullable(this.writeBatchTimeout);
    }

    public RestSinkResponse(
        @Nullable Object additionalHeaders,
        @Nullable Object disableMetricsCollection,
        @Nullable Object httpCompressionType,
        @Nullable Object httpRequestTimeout,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object requestInterval,
        @Nullable Object requestMethod,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout) {
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

    private RestSinkResponse() {
        this.additionalHeaders = null;
        this.disableMetricsCollection = null;
        this.httpCompressionType = null;
        this.httpRequestTimeout = null;
        this.maxConcurrentConnections = null;
        this.requestInterval = null;
        this.requestMethod = null;
        this.sinkRetryCount = null;
        this.sinkRetryWait = null;
        this.type = null;
        this.writeBatchSize = null;
        this.writeBatchTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalHeaders;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object httpCompressionType;
        private @Nullable Object httpRequestTimeout;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object requestInterval;
        private @Nullable Object requestMethod;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RestSinkResponse defaults) {
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

        public Builder additionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder httpCompressionType(@Nullable Object httpCompressionType) {
            this.httpCompressionType = httpCompressionType;
            return this;
        }
        public Builder httpRequestTimeout(@Nullable Object httpRequestTimeout) {
            this.httpRequestTimeout = httpRequestTimeout;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder requestInterval(@Nullable Object requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }
        public Builder requestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
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
        }        public RestSinkResponse build() {
            return new RestSinkResponse(additionalHeaders, disableMetricsCollection, httpCompressionType, httpRequestTimeout, maxConcurrentConnections, requestInterval, requestMethod, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
