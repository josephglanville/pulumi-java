// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.enums.IPAddressAllocationMethod;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the network interface ip settings.
 * 
 */
public final class NicIPSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NicIPSettingsArgs Empty = new NicIPSettingsArgs();

    /**
     * Gets or sets the nic allocation method.
     * 
     */
    @InputImport(name="allocationMethod")
      private final @Nullable Input<Either<String,IPAddressAllocationMethod>> allocationMethod;

    public Input<Either<String,IPAddressAllocationMethod>> getAllocationMethod() {
        return this.allocationMethod == null ? Input.empty() : this.allocationMethod;
    }

    /**
     * Gets or sets the dns servers.
     * 
     */
    @InputImport(name="dnsServers")
      private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    /**
     * Gets or sets the gateway.
     * 
     */
    @InputImport(name="gateway")
      private final @Nullable Input<List<String>> gateway;

    public Input<List<String>> getGateway() {
        return this.gateway == null ? Input.empty() : this.gateway;
    }

    /**
     * Gets or sets the ip address for the nic.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * Gets or sets the mask.
     * 
     */
    @InputImport(name="subnetMask")
      private final @Nullable Input<String> subnetMask;

    public Input<String> getSubnetMask() {
        return this.subnetMask == null ? Input.empty() : this.subnetMask;
    }

    public NicIPSettingsArgs(
        @Nullable Input<Either<String,IPAddressAllocationMethod>> allocationMethod,
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<List<String>> gateway,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> subnetMask) {
        this.allocationMethod = allocationMethod;
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
    }

    private NicIPSettingsArgs() {
        this.allocationMethod = Input.empty();
        this.dnsServers = Input.empty();
        this.gateway = Input.empty();
        this.ipAddress = Input.empty();
        this.subnetMask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NicIPSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,IPAddressAllocationMethod>> allocationMethod;
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<List<String>> gateway;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> subnetMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NicIPSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationMethod = defaults.allocationMethod;
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetMask = defaults.subnetMask;
        }

        public Builder setAllocationMethod(@Nullable Input<Either<String,IPAddressAllocationMethod>> allocationMethod) {
            this.allocationMethod = allocationMethod;
            return this;
        }

        public Builder setAllocationMethod(@Nullable Either<String,IPAddressAllocationMethod> allocationMethod) {
            this.allocationMethod = Input.ofNullable(allocationMethod);
            return this;
        }

        public Builder setDnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder setGateway(@Nullable Input<List<String>> gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder setGateway(@Nullable List<String> gateway) {
            this.gateway = Input.ofNullable(gateway);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setSubnetMask(@Nullable Input<String> subnetMask) {
            this.subnetMask = subnetMask;
            return this;
        }

        public Builder setSubnetMask(@Nullable String subnetMask) {
            this.subnetMask = Input.ofNullable(subnetMask);
            return this;
        }
        public NicIPSettingsArgs build() {
            return new NicIPSettingsArgs(allocationMethod, dnsServers, gateway, ipAddress, subnetMask);
        }
    }
}
