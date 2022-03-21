// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VirtualGatewaySpecListenerConnectionPoolHttp2 {
    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    private final Integer maxRequests;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerConnectionPoolHttp2(@CustomType.Parameter("maxRequests") Integer maxRequests) {
        this.maxRequests = maxRequests;
    }

    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
    */
    public Integer getMaxRequests() {
        return this.maxRequests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolHttp2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolHttp2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRequests = defaults.maxRequests;
        }

        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }        public VirtualGatewaySpecListenerConnectionPoolHttp2 build() {
            return new VirtualGatewaySpecListenerConnectionPoolHttp2(maxRequests);
        }
    }
}
