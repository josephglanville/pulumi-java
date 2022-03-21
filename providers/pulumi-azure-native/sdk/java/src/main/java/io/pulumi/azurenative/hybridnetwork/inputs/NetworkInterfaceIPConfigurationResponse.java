// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network interface IP configuration properties.
 * 
 */
public final class NetworkInterfaceIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceIPConfigurationResponse Empty = new NetworkInterfaceIPConfigurationResponse();

    /**
     * The list of DNS servers IP addresses.
     * 
     */
    @Import(name="dnsServers")
      private final @Nullable List<String> dnsServers;

    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    /**
     * The value of the gateway.
     * 
     */
    @Import(name="gateway")
      private final @Nullable String gateway;

    public Optional<String> getGateway() {
        return this.gateway == null ? Optional.empty() : Optional.ofNullable(this.gateway);
    }

    /**
     * The value of the IP address.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * IP address allocation method.
     * 
     */
    @Import(name="ipAllocationMethod")
      private final @Nullable String ipAllocationMethod;

    public Optional<String> getIpAllocationMethod() {
        return this.ipAllocationMethod == null ? Optional.empty() : Optional.ofNullable(this.ipAllocationMethod);
    }

    /**
     * IP address version.
     * 
     */
    @Import(name="ipVersion")
      private final @Nullable String ipVersion;

    public Optional<String> getIpVersion() {
        return this.ipVersion == null ? Optional.empty() : Optional.ofNullable(this.ipVersion);
    }

    /**
     * The value of the subnet.
     * 
     */
    @Import(name="subnet")
      private final @Nullable String subnet;

    public Optional<String> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public NetworkInterfaceIPConfigurationResponse(
        @Nullable List<String> dnsServers,
        @Nullable String gateway,
        @Nullable String ipAddress,
        @Nullable String ipAllocationMethod,
        @Nullable String ipVersion,
        @Nullable String subnet) {
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.ipAllocationMethod = ipAllocationMethod;
        this.ipVersion = ipVersion;
        this.subnet = subnet;
    }

    private NetworkInterfaceIPConfigurationResponse() {
        this.dnsServers = List.of();
        this.gateway = null;
        this.ipAddress = null;
        this.ipAllocationMethod = null;
        this.ipVersion = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;
        private @Nullable String gateway;
        private @Nullable String ipAddress;
        private @Nullable String ipAllocationMethod;
        private @Nullable String ipVersion;
        private @Nullable String subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAllocationMethod = defaults.ipAllocationMethod;
    	      this.ipVersion = defaults.ipVersion;
    	      this.subnet = defaults.subnet;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public Builder gateway(@Nullable String gateway) {
            this.gateway = gateway;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAllocationMethod(@Nullable String ipAllocationMethod) {
            this.ipAllocationMethod = ipAllocationMethod;
            return this;
        }
        public Builder ipVersion(@Nullable String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }        public NetworkInterfaceIPConfigurationResponse build() {
            return new NetworkInterfaceIPConfigurationResponse(dnsServers, gateway, ipAddress, ipAllocationMethod, ipVersion, subnet);
        }
    }
}
