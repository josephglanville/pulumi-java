// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerConnectionPoolGrpc;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerConnectionPoolHttp2;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerConnectionPoolHttp;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerConnectionPool {
    /**
     * Connection pool information for gRPC listeners.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerConnectionPoolGrpc grpc;
    /**
     * Connection pool information for HTTP listeners.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerConnectionPoolHttp http;
    /**
     * Connection pool information for HTTP2 listeners.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerConnectionPoolHttp2 http2;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerConnectionPool(
        @CustomType.Parameter("grpc") @Nullable VirtualGatewaySpecListenerConnectionPoolGrpc grpc,
        @CustomType.Parameter("http") @Nullable VirtualGatewaySpecListenerConnectionPoolHttp http,
        @CustomType.Parameter("http2") @Nullable VirtualGatewaySpecListenerConnectionPoolHttp2 http2) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
    }

    /**
     * Connection pool information for gRPC listeners.
     * 
    */
    public Optional<VirtualGatewaySpecListenerConnectionPoolGrpc> getGrpc() {
        return Optional.ofNullable(this.grpc);
    }
    /**
     * Connection pool information for HTTP listeners.
     * 
    */
    public Optional<VirtualGatewaySpecListenerConnectionPoolHttp> getHttp() {
        return Optional.ofNullable(this.http);
    }
    /**
     * Connection pool information for HTTP2 listeners.
     * 
    */
    public Optional<VirtualGatewaySpecListenerConnectionPoolHttp2> getHttp2() {
        return Optional.ofNullable(this.http2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerConnectionPoolGrpc grpc;
        private @Nullable VirtualGatewaySpecListenerConnectionPoolHttp http;
        private @Nullable VirtualGatewaySpecListenerConnectionPoolHttp2 http2;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
        }

        public Builder grpc(@Nullable VirtualGatewaySpecListenerConnectionPoolGrpc grpc) {
            this.grpc = grpc;
            return this;
        }
        public Builder http(@Nullable VirtualGatewaySpecListenerConnectionPoolHttp http) {
            this.http = http;
            return this;
        }
        public Builder http2(@Nullable VirtualGatewaySpecListenerConnectionPoolHttp2 http2) {
            this.http2 = http2;
            return this;
        }        public VirtualGatewaySpecListenerConnectionPool build() {
            return new VirtualGatewaySpecListenerConnectionPool(grpc, http, http2);
        }
    }
}
