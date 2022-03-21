// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.enums.IPAllocationMethod;
import io.pulumi.azurenative.hybridnetwork.enums.IPVersion;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network interface IP configuration properties.
 * 
 */
public final class NetworkInterfaceIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceIPConfigurationArgs Empty = new NetworkInterfaceIPConfigurationArgs();

    /**
     * The list of DNS servers IP addresses.
     * 
     */
    @Import(name="dnsServers")
      private final @Nullable Output<List<String>> dnsServers;

    public Output<List<String>> getDnsServers() {
        return this.dnsServers == null ? Output.empty() : this.dnsServers;
    }

    /**
     * The value of the gateway.
     * 
     */
    @Import(name="gateway")
      private final @Nullable Output<String> gateway;

    public Output<String> getGateway() {
        return this.gateway == null ? Output.empty() : this.gateway;
    }

    /**
     * The value of the IP address.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * IP address allocation method.
     * 
     */
    @Import(name="ipAllocationMethod")
      private final @Nullable Output<Either<String,IPAllocationMethod>> ipAllocationMethod;

    public Output<Either<String,IPAllocationMethod>> getIpAllocationMethod() {
        return this.ipAllocationMethod == null ? Output.empty() : this.ipAllocationMethod;
    }

    /**
     * IP address version.
     * 
     */
    @Import(name="ipVersion")
      private final @Nullable Output<Either<String,IPVersion>> ipVersion;

    public Output<Either<String,IPVersion>> getIpVersion() {
        return this.ipVersion == null ? Output.empty() : this.ipVersion;
    }

    /**
     * The value of the subnet.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    public NetworkInterfaceIPConfigurationArgs(
        @Nullable Output<List<String>> dnsServers,
        @Nullable Output<String> gateway,
        @Nullable Output<String> ipAddress,
        @Nullable Output<Either<String,IPAllocationMethod>> ipAllocationMethod,
        @Nullable Output<Either<String,IPVersion>> ipVersion,
        @Nullable Output<String> subnet) {
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.ipAllocationMethod = ipAllocationMethod;
        this.ipVersion = ipVersion;
        this.subnet = subnet;
    }

    private NetworkInterfaceIPConfigurationArgs() {
        this.dnsServers = Output.empty();
        this.gateway = Output.empty();
        this.ipAddress = Output.empty();
        this.ipAllocationMethod = Output.empty();
        this.ipVersion = Output.empty();
        this.subnet = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> dnsServers;
        private @Nullable Output<String> gateway;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<Either<String,IPAllocationMethod>> ipAllocationMethod;
        private @Nullable Output<Either<String,IPVersion>> ipVersion;
        private @Nullable Output<String> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAllocationMethod = defaults.ipAllocationMethod;
    	      this.ipVersion = defaults.ipVersion;
    	      this.subnet = defaults.subnet;
        }

        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Output.ofNullable(dnsServers);
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public Builder gateway(@Nullable Output<String> gateway) {
            this.gateway = gateway;
            return this;
        }
        public Builder gateway(@Nullable String gateway) {
            this.gateway = Output.ofNullable(gateway);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }
        public Builder ipAllocationMethod(@Nullable Output<Either<String,IPAllocationMethod>> ipAllocationMethod) {
            this.ipAllocationMethod = ipAllocationMethod;
            return this;
        }
        public Builder ipAllocationMethod(@Nullable Either<String,IPAllocationMethod> ipAllocationMethod) {
            this.ipAllocationMethod = Output.ofNullable(ipAllocationMethod);
            return this;
        }
        public Builder ipVersion(@Nullable Output<Either<String,IPVersion>> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Builder ipVersion(@Nullable Either<String,IPVersion> ipVersion) {
            this.ipVersion = Output.ofNullable(ipVersion);
            return this;
        }
        public Builder subnet(@Nullable Output<String> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }        public NetworkInterfaceIPConfigurationArgs build() {
            return new NetworkInterfaceIPConfigurationArgs(dnsServers, gateway, ipAddress, ipAllocationMethod, ipVersion, subnet);
        }
    }
}
