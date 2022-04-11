// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExternalVpnGatewayInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalVpnGatewayInterfaceArgs Empty = new ExternalVpnGatewayInterfaceArgs();

    /**
     * The numeric ID for this interface. Allowed values are based on the redundancy type
     * of this external VPN gateway
     * * `0 - SINGLE_IP_INTERNALLY_REDUNDANT`
     * * `0, 1 - TWO_IPS_REDUNDANCY`
     * * `0, 1, 2, 3 - FOUR_IPS_REDUNDANCY`
     * 
     */
    @Import(name="id")
      private final @Nullable Output<Integer> id;

    public Output<Integer> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * IP address of the interface in the external VPN gateway.
     * Only IPv4 is supported. This IP address can be either from
     * your on-premise gateway or another Cloud provider's VPN gateway,
     * it cannot be an IP address from Google Compute Engine.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    public ExternalVpnGatewayInterfaceArgs(
        @Nullable Output<Integer> id,
        @Nullable Output<String> ipAddress) {
        this.id = id;
        this.ipAddress = ipAddress;
    }

    private ExternalVpnGatewayInterfaceArgs() {
        this.id = Codegen.empty();
        this.ipAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> id;
        private @Nullable Output<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder id(@Nullable Output<Integer> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable Integer id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }        public ExternalVpnGatewayInterfaceArgs build() {
            return new ExternalVpnGatewayInterfaceArgs(id, ipAddress);
        }
    }
}
