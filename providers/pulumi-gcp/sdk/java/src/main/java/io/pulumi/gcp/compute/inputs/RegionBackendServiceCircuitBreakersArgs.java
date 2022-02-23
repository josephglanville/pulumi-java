// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersConnectTimeoutArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceCircuitBreakersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceCircuitBreakersArgs Empty = new RegionBackendServiceCircuitBreakersArgs();

    /**
     * The timeout for new network connections to hosts.
     * Structure is documented below.
     * 
     */
    @InputImport(name="connectTimeout")
      private final @Nullable Input<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout;

    public Input<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> getConnectTimeout() {
        return this.connectTimeout == null ? Input.empty() : this.connectTimeout;
    }

    /**
     * The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @InputImport(name="maxConnections")
      private final @Nullable Input<Integer> maxConnections;

    public Input<Integer> getMaxConnections() {
        return this.maxConnections == null ? Input.empty() : this.maxConnections;
    }

    /**
     * The maximum number of pending requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @InputImport(name="maxPendingRequests")
      private final @Nullable Input<Integer> maxPendingRequests;

    public Input<Integer> getMaxPendingRequests() {
        return this.maxPendingRequests == null ? Input.empty() : this.maxPendingRequests;
    }

    /**
     * The maximum number of parallel requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @InputImport(name="maxRequests")
      private final @Nullable Input<Integer> maxRequests;

    public Input<Integer> getMaxRequests() {
        return this.maxRequests == null ? Input.empty() : this.maxRequests;
    }

    /**
     * Maximum requests for a single backend connection. This parameter
     * is respected by both the HTTP/1.1 and HTTP/2 implementations. If
     * not specified, there is no limit. Setting this parameter to 1
     * will effectively disable keep alive.
     * 
     */
    @InputImport(name="maxRequestsPerConnection")
      private final @Nullable Input<Integer> maxRequestsPerConnection;

    public Input<Integer> getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection == null ? Input.empty() : this.maxRequestsPerConnection;
    }

    /**
     * The maximum number of parallel retries to the backend cluster.
     * Defaults to 3.
     * 
     */
    @InputImport(name="maxRetries")
      private final @Nullable Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries == null ? Input.empty() : this.maxRetries;
    }

    public RegionBackendServiceCircuitBreakersArgs(
        @Nullable Input<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout,
        @Nullable Input<Integer> maxConnections,
        @Nullable Input<Integer> maxPendingRequests,
        @Nullable Input<Integer> maxRequests,
        @Nullable Input<Integer> maxRequestsPerConnection,
        @Nullable Input<Integer> maxRetries) {
        this.connectTimeout = connectTimeout;
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
        this.maxRequests = maxRequests;
        this.maxRequestsPerConnection = maxRequestsPerConnection;
        this.maxRetries = maxRetries;
    }

    private RegionBackendServiceCircuitBreakersArgs() {
        this.connectTimeout = Input.empty();
        this.maxConnections = Input.empty();
        this.maxPendingRequests = Input.empty();
        this.maxRequests = Input.empty();
        this.maxRequestsPerConnection = Input.empty();
        this.maxRetries = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceCircuitBreakersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout;
        private @Nullable Input<Integer> maxConnections;
        private @Nullable Input<Integer> maxPendingRequests;
        private @Nullable Input<Integer> maxRequests;
        private @Nullable Input<Integer> maxRequestsPerConnection;
        private @Nullable Input<Integer> maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceCircuitBreakersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder setConnectTimeout(@Nullable Input<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public Builder setConnectTimeout(@Nullable RegionBackendServiceCircuitBreakersConnectTimeoutArgs connectTimeout) {
            this.connectTimeout = Input.ofNullable(connectTimeout);
            return this;
        }

        public Builder setMaxConnections(@Nullable Input<Integer> maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder setMaxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = Input.ofNullable(maxConnections);
            return this;
        }

        public Builder setMaxPendingRequests(@Nullable Input<Integer> maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }

        public Builder setMaxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = Input.ofNullable(maxPendingRequests);
            return this;
        }

        public Builder setMaxRequests(@Nullable Input<Integer> maxRequests) {
            this.maxRequests = maxRequests;
            return this;
        }

        public Builder setMaxRequests(@Nullable Integer maxRequests) {
            this.maxRequests = Input.ofNullable(maxRequests);
            return this;
        }

        public Builder setMaxRequestsPerConnection(@Nullable Input<Integer> maxRequestsPerConnection) {
            this.maxRequestsPerConnection = maxRequestsPerConnection;
            return this;
        }

        public Builder setMaxRequestsPerConnection(@Nullable Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Input.ofNullable(maxRequestsPerConnection);
            return this;
        }

        public Builder setMaxRetries(@Nullable Input<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder setMaxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Input.ofNullable(maxRetries);
            return this;
        }
        public RegionBackendServiceCircuitBreakersArgs build() {
            return new RegionBackendServiceCircuitBreakersArgs(connectTimeout, maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
