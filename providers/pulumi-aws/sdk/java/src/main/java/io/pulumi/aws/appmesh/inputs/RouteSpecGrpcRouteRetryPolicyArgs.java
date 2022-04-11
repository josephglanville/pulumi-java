// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteRetryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteRetryPolicyArgs Empty = new RouteSpecGrpcRouteRetryPolicyArgs();

    /**
     * List of gRPC retry events.
     * Valid values: `cancelled`, `deadline-exceeded`, `internal`, `resource-exhausted`, `unavailable`.
     * 
     */
    @Import(name="grpcRetryEvents")
      private final @Nullable Output<List<String>> grpcRetryEvents;

    public Output<List<String>> getGrpcRetryEvents() {
        return this.grpcRetryEvents == null ? Codegen.empty() : this.grpcRetryEvents;
    }

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    @Import(name="httpRetryEvents")
      private final @Nullable Output<List<String>> httpRetryEvents;

    public Output<List<String>> getHttpRetryEvents() {
        return this.httpRetryEvents == null ? Codegen.empty() : this.httpRetryEvents;
    }

    /**
     * The maximum number of retries.
     * 
     */
    @Import(name="maxRetries", required=true)
      private final Output<Integer> maxRetries;

    public Output<Integer> getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * The per-retry timeout.
     * 
     */
    @Import(name="perRetryTimeout", required=true)
      private final Output<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout;

    public Output<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> getPerRetryTimeout() {
        return this.perRetryTimeout;
    }

    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    @Import(name="tcpRetryEvents")
      private final @Nullable Output<List<String>> tcpRetryEvents;

    public Output<List<String>> getTcpRetryEvents() {
        return this.tcpRetryEvents == null ? Codegen.empty() : this.tcpRetryEvents;
    }

    public RouteSpecGrpcRouteRetryPolicyArgs(
        @Nullable Output<List<String>> grpcRetryEvents,
        @Nullable Output<List<String>> httpRetryEvents,
        Output<Integer> maxRetries,
        Output<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout,
        @Nullable Output<List<String>> tcpRetryEvents) {
        this.grpcRetryEvents = grpcRetryEvents;
        this.httpRetryEvents = httpRetryEvents;
        this.maxRetries = Objects.requireNonNull(maxRetries, "expected parameter 'maxRetries' to be non-null");
        this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout, "expected parameter 'perRetryTimeout' to be non-null");
        this.tcpRetryEvents = tcpRetryEvents;
    }

    private RouteSpecGrpcRouteRetryPolicyArgs() {
        this.grpcRetryEvents = Codegen.empty();
        this.httpRetryEvents = Codegen.empty();
        this.maxRetries = Codegen.empty();
        this.perRetryTimeout = Codegen.empty();
        this.tcpRetryEvents = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> grpcRetryEvents;
        private @Nullable Output<List<String>> httpRetryEvents;
        private Output<Integer> maxRetries;
        private Output<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout;
        private @Nullable Output<List<String>> tcpRetryEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteRetryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcRetryEvents = defaults.grpcRetryEvents;
    	      this.httpRetryEvents = defaults.httpRetryEvents;
    	      this.maxRetries = defaults.maxRetries;
    	      this.perRetryTimeout = defaults.perRetryTimeout;
    	      this.tcpRetryEvents = defaults.tcpRetryEvents;
        }

        public Builder grpcRetryEvents(@Nullable Output<List<String>> grpcRetryEvents) {
            this.grpcRetryEvents = grpcRetryEvents;
            return this;
        }
        public Builder grpcRetryEvents(@Nullable List<String> grpcRetryEvents) {
            this.grpcRetryEvents = Codegen.ofNullable(grpcRetryEvents);
            return this;
        }
        public Builder grpcRetryEvents(String... grpcRetryEvents) {
            return grpcRetryEvents(List.of(grpcRetryEvents));
        }
        public Builder httpRetryEvents(@Nullable Output<List<String>> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }
        public Builder httpRetryEvents(@Nullable List<String> httpRetryEvents) {
            this.httpRetryEvents = Codegen.ofNullable(httpRetryEvents);
            return this;
        }
        public Builder httpRetryEvents(String... httpRetryEvents) {
            return httpRetryEvents(List.of(httpRetryEvents));
        }
        public Builder maxRetries(Output<Integer> maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Output.of(Objects.requireNonNull(maxRetries));
            return this;
        }
        public Builder perRetryTimeout(Output<RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout) {
            this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout);
            return this;
        }
        public Builder perRetryTimeout(RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutArgs perRetryTimeout) {
            this.perRetryTimeout = Output.of(Objects.requireNonNull(perRetryTimeout));
            return this;
        }
        public Builder tcpRetryEvents(@Nullable Output<List<String>> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }
        public Builder tcpRetryEvents(@Nullable List<String> tcpRetryEvents) {
            this.tcpRetryEvents = Codegen.ofNullable(tcpRetryEvents);
            return this;
        }
        public Builder tcpRetryEvents(String... tcpRetryEvents) {
            return tcpRetryEvents(List.of(tcpRetryEvents));
        }        public RouteSpecGrpcRouteRetryPolicyArgs build() {
            return new RouteSpecGrpcRouteRetryPolicyArgs(grpcRetryEvents, httpRetryEvents, maxRetries, perRetryTimeout, tcpRetryEvents);
        }
    }
}
