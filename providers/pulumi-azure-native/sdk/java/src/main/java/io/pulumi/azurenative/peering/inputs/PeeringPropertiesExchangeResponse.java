// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.inputs.ExchangeConnectionResponse;
import io.pulumi.azurenative.peering.inputs.SubResourceResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that define an exchange peering.
 * 
 */
public final class PeeringPropertiesExchangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final PeeringPropertiesExchangeResponse Empty = new PeeringPropertiesExchangeResponse();

    /**
     * The set of connections that constitute an exchange peering.
     * 
     */
    @Import(name="connections")
      private final @Nullable List<ExchangeConnectionResponse> connections;

    public List<ExchangeConnectionResponse> getConnections() {
        return this.connections == null ? List.of() : this.connections;
    }

    /**
     * The reference of the peer ASN.
     * 
     */
    @Import(name="peerAsn")
      private final @Nullable SubResourceResponse peerAsn;

    public Optional<SubResourceResponse> getPeerAsn() {
        return this.peerAsn == null ? Optional.empty() : Optional.ofNullable(this.peerAsn);
    }

    public PeeringPropertiesExchangeResponse(
        @Nullable List<ExchangeConnectionResponse> connections,
        @Nullable SubResourceResponse peerAsn) {
        this.connections = connections;
        this.peerAsn = peerAsn;
    }

    private PeeringPropertiesExchangeResponse() {
        this.connections = List.of();
        this.peerAsn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringPropertiesExchangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ExchangeConnectionResponse> connections;
        private @Nullable SubResourceResponse peerAsn;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringPropertiesExchangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
    	      this.peerAsn = defaults.peerAsn;
        }

        public Builder connections(@Nullable List<ExchangeConnectionResponse> connections) {
            this.connections = connections;
            return this;
        }
        public Builder connections(ExchangeConnectionResponse... connections) {
            return connections(List.of(connections));
        }
        public Builder peerAsn(@Nullable SubResourceResponse peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }        public PeeringPropertiesExchangeResponse build() {
            return new PeeringPropertiesExchangeResponse(connections, peerAsn);
        }
    }
}
