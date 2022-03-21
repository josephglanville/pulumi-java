// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZonePeeringConfigTargetNetworkResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedZonePeeringConfigResponse {
    private final String kind;
    /**
     * The network with which to peer.
     * 
     */
    private final ManagedZonePeeringConfigTargetNetworkResponse targetNetwork;

    @CustomType.Constructor
    private ManagedZonePeeringConfigResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("targetNetwork") ManagedZonePeeringConfigTargetNetworkResponse targetNetwork) {
        this.kind = kind;
        this.targetNetwork = targetNetwork;
    }

    public String getKind() {
        return this.kind;
    }
    /**
     * The network with which to peer.
     * 
    */
    public ManagedZonePeeringConfigTargetNetworkResponse getTargetNetwork() {
        return this.targetNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private ManagedZonePeeringConfigTargetNetworkResponse targetNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNetwork = defaults.targetNetwork;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder targetNetwork(ManagedZonePeeringConfigTargetNetworkResponse targetNetwork) {
            this.targetNetwork = Objects.requireNonNull(targetNetwork);
            return this;
        }        public ManagedZonePeeringConfigResponse build() {
            return new ManagedZonePeeringConfigResponse(kind, targetNetwork);
        }
    }
}
