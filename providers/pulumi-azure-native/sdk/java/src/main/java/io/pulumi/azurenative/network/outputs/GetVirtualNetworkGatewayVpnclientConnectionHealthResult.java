// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.VpnClientConnectionHealthDetailResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualNetworkGatewayVpnclientConnectionHealthResult {
    private final @Nullable List<VpnClientConnectionHealthDetailResponse> value;

    @OutputCustomType.Constructor({"value"})
    private GetVirtualNetworkGatewayVpnclientConnectionHealthResult(@Nullable List<VpnClientConnectionHealthDetailResponse> value) {
        this.value = value;
    }

    public List<VpnClientConnectionHealthDetailResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayVpnclientConnectionHealthResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VpnClientConnectionHealthDetailResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayVpnclientConnectionHealthResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable List<VpnClientConnectionHealthDetailResponse> value) {
            this.value = value;
            return this;
        }

        public GetVirtualNetworkGatewayVpnclientConnectionHealthResult build() {
            return new GetVirtualNetworkGatewayVpnclientConnectionHealthResult(value);
        }
    }
}