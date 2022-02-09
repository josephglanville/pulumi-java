// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNetworkBgpCommunitiesResponse {
    private final String regionalCommunity;
    private final String virtualNetworkCommunity;

    @OutputCustomType.Constructor({"regionalCommunity","virtualNetworkCommunity"})
    private VirtualNetworkBgpCommunitiesResponse(
        String regionalCommunity,
        String virtualNetworkCommunity) {
        this.regionalCommunity = Objects.requireNonNull(regionalCommunity);
        this.virtualNetworkCommunity = Objects.requireNonNull(virtualNetworkCommunity);
    }

    public String getRegionalCommunity() {
        return this.regionalCommunity;
    }
    public String getVirtualNetworkCommunity() {
        return this.virtualNetworkCommunity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkBgpCommunitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regionalCommunity;
        private String virtualNetworkCommunity;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkBgpCommunitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionalCommunity = defaults.regionalCommunity;
    	      this.virtualNetworkCommunity = defaults.virtualNetworkCommunity;
        }

        public Builder setRegionalCommunity(String regionalCommunity) {
            this.regionalCommunity = Objects.requireNonNull(regionalCommunity);
            return this;
        }

        public Builder setVirtualNetworkCommunity(String virtualNetworkCommunity) {
            this.virtualNetworkCommunity = Objects.requireNonNull(virtualNetworkCommunity);
            return this;
        }

        public VirtualNetworkBgpCommunitiesResponse build() {
            return new VirtualNetworkBgpCommunitiesResponse(regionalCommunity, virtualNetworkCommunity);
        }
    }
}
