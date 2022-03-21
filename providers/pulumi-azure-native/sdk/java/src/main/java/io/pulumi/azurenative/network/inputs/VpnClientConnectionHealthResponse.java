// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VpnClientConnectionHealth properties.
 * 
 */
public final class VpnClientConnectionHealthResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnClientConnectionHealthResponse Empty = new VpnClientConnectionHealthResponse();

    /**
     * List of allocated ip addresses to the connected p2s vpn clients.
     * 
     */
    @Import(name="allocatedIpAddresses")
      private final @Nullable List<String> allocatedIpAddresses;

    public List<String> getAllocatedIpAddresses() {
        return this.allocatedIpAddresses == null ? List.of() : this.allocatedIpAddresses;
    }

    /**
     * Total of the Egress Bytes Transferred in this connection.
     * 
     */
    @Import(name="totalEgressBytesTransferred", required=true)
      private final Double totalEgressBytesTransferred;

    public Double getTotalEgressBytesTransferred() {
        return this.totalEgressBytesTransferred;
    }

    /**
     * Total of the Ingress Bytes Transferred in this P2S Vpn connection.
     * 
     */
    @Import(name="totalIngressBytesTransferred", required=true)
      private final Double totalIngressBytesTransferred;

    public Double getTotalIngressBytesTransferred() {
        return this.totalIngressBytesTransferred;
    }

    /**
     * The total of p2s vpn clients connected at this time to this P2SVpnGateway.
     * 
     */
    @Import(name="vpnClientConnectionsCount")
      private final @Nullable Integer vpnClientConnectionsCount;

    public Optional<Integer> getVpnClientConnectionsCount() {
        return this.vpnClientConnectionsCount == null ? Optional.empty() : Optional.ofNullable(this.vpnClientConnectionsCount);
    }

    public VpnClientConnectionHealthResponse(
        @Nullable List<String> allocatedIpAddresses,
        Double totalEgressBytesTransferred,
        Double totalIngressBytesTransferred,
        @Nullable Integer vpnClientConnectionsCount) {
        this.allocatedIpAddresses = allocatedIpAddresses;
        this.totalEgressBytesTransferred = Objects.requireNonNull(totalEgressBytesTransferred, "expected parameter 'totalEgressBytesTransferred' to be non-null");
        this.totalIngressBytesTransferred = Objects.requireNonNull(totalIngressBytesTransferred, "expected parameter 'totalIngressBytesTransferred' to be non-null");
        this.vpnClientConnectionsCount = vpnClientConnectionsCount;
    }

    private VpnClientConnectionHealthResponse() {
        this.allocatedIpAddresses = List.of();
        this.totalEgressBytesTransferred = null;
        this.totalIngressBytesTransferred = null;
        this.vpnClientConnectionsCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConnectionHealthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allocatedIpAddresses;
        private Double totalEgressBytesTransferred;
        private Double totalIngressBytesTransferred;
        private @Nullable Integer vpnClientConnectionsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConnectionHealthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpAddresses = defaults.allocatedIpAddresses;
    	      this.totalEgressBytesTransferred = defaults.totalEgressBytesTransferred;
    	      this.totalIngressBytesTransferred = defaults.totalIngressBytesTransferred;
    	      this.vpnClientConnectionsCount = defaults.vpnClientConnectionsCount;
        }

        public Builder allocatedIpAddresses(@Nullable List<String> allocatedIpAddresses) {
            this.allocatedIpAddresses = allocatedIpAddresses;
            return this;
        }
        public Builder allocatedIpAddresses(String... allocatedIpAddresses) {
            return allocatedIpAddresses(List.of(allocatedIpAddresses));
        }
        public Builder totalEgressBytesTransferred(Double totalEgressBytesTransferred) {
            this.totalEgressBytesTransferred = Objects.requireNonNull(totalEgressBytesTransferred);
            return this;
        }
        public Builder totalIngressBytesTransferred(Double totalIngressBytesTransferred) {
            this.totalIngressBytesTransferred = Objects.requireNonNull(totalIngressBytesTransferred);
            return this;
        }
        public Builder vpnClientConnectionsCount(@Nullable Integer vpnClientConnectionsCount) {
            this.vpnClientConnectionsCount = vpnClientConnectionsCount;
            return this;
        }        public VpnClientConnectionHealthResponse build() {
            return new VpnClientConnectionHealthResponse(allocatedIpAddresses, totalEgressBytesTransferred, totalIngressBytesTransferred, vpnClientConnectionsCount);
        }
    }
}
