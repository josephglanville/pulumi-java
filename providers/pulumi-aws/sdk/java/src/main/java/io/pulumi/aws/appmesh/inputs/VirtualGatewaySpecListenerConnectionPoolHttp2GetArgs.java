// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs Empty = new VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs();

    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxRequests", required=true)
      private final Output<Integer> maxRequests;

    public Output<Integer> getMaxRequests() {
        return this.maxRequests;
    }

    public VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs(Output<Integer> maxRequests) {
        this.maxRequests = Objects.requireNonNull(maxRequests, "expected parameter 'maxRequests' to be non-null");
    }

    private VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs() {
        this.maxRequests = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRequests = defaults.maxRequests;
        }

        public Builder maxRequests(Output<Integer> maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }
        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Output.of(Objects.requireNonNull(maxRequests));
            return this;
        }        public VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs build() {
            return new VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs(maxRequests);
        }
    }
}
