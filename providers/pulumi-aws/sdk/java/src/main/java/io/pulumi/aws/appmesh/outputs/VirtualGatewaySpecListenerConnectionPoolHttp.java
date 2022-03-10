// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualGatewaySpecListenerConnectionPoolHttp {
    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    private final Integer maxConnections;
    /**
     * Number of overflowing requests after `max_connections` Envoy will queue to upstream cluster. Minimum value of `1`.
     * 
     */
    private final @Nullable Integer maxPendingRequests;

    @OutputCustomType.Constructor
    private VirtualGatewaySpecListenerConnectionPoolHttp(
        @OutputCustomType.Parameter("maxConnections") Integer maxConnections,
        @OutputCustomType.Parameter("maxPendingRequests") @Nullable Integer maxPendingRequests) {
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
    }

    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
    */
    public Integer getMaxConnections() {
        return this.maxConnections;
    }
    /**
     * Number of overflowing requests after `max_connections` Envoy will queue to upstream cluster. Minimum value of `1`.
     * 
    */
    public Optional<Integer> getMaxPendingRequests() {
        return Optional.ofNullable(this.maxPendingRequests);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolHttp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxConnections;
        private @Nullable Integer maxPendingRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
        }

        public Builder setMaxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder setMaxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }
        public VirtualGatewaySpecListenerConnectionPoolHttp build() {
            return new VirtualGatewaySpecListenerConnectionPoolHttp(maxConnections, maxPendingRequests);
        }
    }
}
