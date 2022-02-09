// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.IpAddressResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowEndpointsResponse {
    private final @Nullable List<IpAddressResponse> accessEndpointIpAddresses;
    private final @Nullable List<IpAddressResponse> outgoingIpAddresses;

    @OutputCustomType.Constructor({"accessEndpointIpAddresses","outgoingIpAddresses"})
    private FlowEndpointsResponse(
        @Nullable List<IpAddressResponse> accessEndpointIpAddresses,
        @Nullable List<IpAddressResponse> outgoingIpAddresses) {
        this.accessEndpointIpAddresses = accessEndpointIpAddresses;
        this.outgoingIpAddresses = outgoingIpAddresses;
    }

    public List<IpAddressResponse> getAccessEndpointIpAddresses() {
        return this.accessEndpointIpAddresses == null ? List.of() : this.accessEndpointIpAddresses;
    }
    public List<IpAddressResponse> getOutgoingIpAddresses() {
        return this.outgoingIpAddresses == null ? List.of() : this.outgoingIpAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpAddressResponse> accessEndpointIpAddresses;
        private @Nullable List<IpAddressResponse> outgoingIpAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpointIpAddresses = defaults.accessEndpointIpAddresses;
    	      this.outgoingIpAddresses = defaults.outgoingIpAddresses;
        }

        public Builder setAccessEndpointIpAddresses(@Nullable List<IpAddressResponse> accessEndpointIpAddresses) {
            this.accessEndpointIpAddresses = accessEndpointIpAddresses;
            return this;
        }

        public Builder setOutgoingIpAddresses(@Nullable List<IpAddressResponse> outgoingIpAddresses) {
            this.outgoingIpAddresses = outgoingIpAddresses;
            return this;
        }

        public FlowEndpointsResponse build() {
            return new FlowEndpointsResponse(accessEndpointIpAddresses, outgoingIpAddresses);
        }
    }
}
