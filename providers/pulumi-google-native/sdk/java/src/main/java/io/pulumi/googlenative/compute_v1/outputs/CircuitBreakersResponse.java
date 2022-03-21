// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class CircuitBreakersResponse {
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxConnections;
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxPendingRequests;
    /**
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * 
     */
    private final Integer maxRequests;
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxRequestsPerConnection;
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final Integer maxRetries;

    @CustomType.Constructor
    private CircuitBreakersResponse(
        @CustomType.Parameter("maxConnections") Integer maxConnections,
        @CustomType.Parameter("maxPendingRequests") Integer maxPendingRequests,
        @CustomType.Parameter("maxRequests") Integer maxRequests,
        @CustomType.Parameter("maxRequestsPerConnection") Integer maxRequestsPerConnection,
        @CustomType.Parameter("maxRetries") Integer maxRetries) {
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
        this.maxRequests = maxRequests;
        this.maxRequestsPerConnection = maxRequestsPerConnection;
        this.maxRetries = maxRetries;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxConnections() {
        return this.maxConnections;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxPendingRequests() {
        return this.maxPendingRequests;
    }
    /**
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * 
    */
    public Integer getMaxRequests() {
        return this.maxRequests;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitBreakersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxConnections;
        private Integer maxPendingRequests;
        private Integer maxRequests;
        private Integer maxRequestsPerConnection;
        private Integer maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitBreakersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder maxPendingRequests(Integer maxPendingRequests) {
            this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests);
            return this;
        }
        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }
        public Builder maxRequestsPerConnection(Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection);
            return this;
        }
        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }        public CircuitBreakersResponse build() {
            return new CircuitBreakersResponse(maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
