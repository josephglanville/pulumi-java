// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkIpamConfig {
    /**
     * @return Auxiliary IPv4 or IPv6 addresses used by Network driver
     * 
     */
    private final @Nullable Map<String,Object> auxAddress;
    /**
     * @return The IP address of the gateway
     * 
     */
    private final @Nullable String gateway;
    /**
     * @return The ip range in CIDR form
     * 
     */
    private final @Nullable String ipRange;
    /**
     * @return The subnet in CIDR form
     * 
     */
    private final @Nullable String subnet;

    @CustomType.Constructor
    private NetworkIpamConfig(
        @CustomType.Parameter("auxAddress") @Nullable Map<String,Object> auxAddress,
        @CustomType.Parameter("gateway") @Nullable String gateway,
        @CustomType.Parameter("ipRange") @Nullable String ipRange,
        @CustomType.Parameter("subnet") @Nullable String subnet) {
        this.auxAddress = auxAddress;
        this.gateway = gateway;
        this.ipRange = ipRange;
        this.subnet = subnet;
    }

    /**
     * @return Auxiliary IPv4 or IPv6 addresses used by Network driver
     * 
     */
    public Map<String,Object> auxAddress() {
        return this.auxAddress == null ? Map.of() : this.auxAddress;
    }
    /**
     * @return The IP address of the gateway
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * @return The ip range in CIDR form
     * 
     */
    public Optional<String> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }
    /**
     * @return The subnet in CIDR form
     * 
     */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkIpamConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> auxAddress;
        private @Nullable String gateway;
        private @Nullable String ipRange;
        private @Nullable String subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkIpamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxAddress = defaults.auxAddress;
    	      this.gateway = defaults.gateway;
    	      this.ipRange = defaults.ipRange;
    	      this.subnet = defaults.subnet;
        }

        public Builder auxAddress(@Nullable Map<String,Object> auxAddress) {
            this.auxAddress = auxAddress;
            return this;
        }
        public Builder gateway(@Nullable String gateway) {
            this.gateway = gateway;
            return this;
        }
        public Builder ipRange(@Nullable String ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }        public NetworkIpamConfig build() {
            return new NetworkIpamConfig(auxAddress, gateway, ipRange, subnet);
        }
    }
}
