// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of IPConfigurationBgpPeeringAddress.
 * 
 */
public final class IPConfigurationBgpPeeringAddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final IPConfigurationBgpPeeringAddressResponse Empty = new IPConfigurationBgpPeeringAddressResponse();

    /**
     * The list of custom BGP peering addresses which belong to IP configuration.
     * 
     */
    @Import(name="customBgpIpAddresses")
      private final @Nullable List<String> customBgpIpAddresses;

    public List<String> getCustomBgpIpAddresses() {
        return this.customBgpIpAddresses == null ? List.of() : this.customBgpIpAddresses;
    }

    /**
     * The list of default BGP peering addresses which belong to IP configuration.
     * 
     */
    @Import(name="defaultBgpIpAddresses", required=true)
      private final List<String> defaultBgpIpAddresses;

    public List<String> getDefaultBgpIpAddresses() {
        return this.defaultBgpIpAddresses;
    }

    /**
     * The ID of IP configuration which belongs to gateway.
     * 
     */
    @Import(name="ipconfigurationId")
      private final @Nullable String ipconfigurationId;

    public Optional<String> getIpconfigurationId() {
        return this.ipconfigurationId == null ? Optional.empty() : Optional.ofNullable(this.ipconfigurationId);
    }

    /**
     * The list of tunnel public IP addresses which belong to IP configuration.
     * 
     */
    @Import(name="tunnelIpAddresses", required=true)
      private final List<String> tunnelIpAddresses;

    public List<String> getTunnelIpAddresses() {
        return this.tunnelIpAddresses;
    }

    public IPConfigurationBgpPeeringAddressResponse(
        @Nullable List<String> customBgpIpAddresses,
        List<String> defaultBgpIpAddresses,
        @Nullable String ipconfigurationId,
        List<String> tunnelIpAddresses) {
        this.customBgpIpAddresses = customBgpIpAddresses;
        this.defaultBgpIpAddresses = Objects.requireNonNull(defaultBgpIpAddresses, "expected parameter 'defaultBgpIpAddresses' to be non-null");
        this.ipconfigurationId = ipconfigurationId;
        this.tunnelIpAddresses = Objects.requireNonNull(tunnelIpAddresses, "expected parameter 'tunnelIpAddresses' to be non-null");
    }

    private IPConfigurationBgpPeeringAddressResponse() {
        this.customBgpIpAddresses = List.of();
        this.defaultBgpIpAddresses = List.of();
        this.ipconfigurationId = null;
        this.tunnelIpAddresses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPConfigurationBgpPeeringAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customBgpIpAddresses;
        private List<String> defaultBgpIpAddresses;
        private @Nullable String ipconfigurationId;
        private List<String> tunnelIpAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(IPConfigurationBgpPeeringAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customBgpIpAddresses = defaults.customBgpIpAddresses;
    	      this.defaultBgpIpAddresses = defaults.defaultBgpIpAddresses;
    	      this.ipconfigurationId = defaults.ipconfigurationId;
    	      this.tunnelIpAddresses = defaults.tunnelIpAddresses;
        }

        public Builder customBgpIpAddresses(@Nullable List<String> customBgpIpAddresses) {
            this.customBgpIpAddresses = customBgpIpAddresses;
            return this;
        }
        public Builder customBgpIpAddresses(String... customBgpIpAddresses) {
            return customBgpIpAddresses(List.of(customBgpIpAddresses));
        }
        public Builder defaultBgpIpAddresses(List<String> defaultBgpIpAddresses) {
            this.defaultBgpIpAddresses = Objects.requireNonNull(defaultBgpIpAddresses);
            return this;
        }
        public Builder defaultBgpIpAddresses(String... defaultBgpIpAddresses) {
            return defaultBgpIpAddresses(List.of(defaultBgpIpAddresses));
        }
        public Builder ipconfigurationId(@Nullable String ipconfigurationId) {
            this.ipconfigurationId = ipconfigurationId;
            return this;
        }
        public Builder tunnelIpAddresses(List<String> tunnelIpAddresses) {
            this.tunnelIpAddresses = Objects.requireNonNull(tunnelIpAddresses);
            return this;
        }
        public Builder tunnelIpAddresses(String... tunnelIpAddresses) {
            return tunnelIpAddresses(List.of(tunnelIpAddresses));
        }        public IPConfigurationBgpPeeringAddressResponse build() {
            return new IPConfigurationBgpPeeringAddressResponse(customBgpIpAddresses, defaultBgpIpAddresses, ipconfigurationId, tunnelIpAddresses);
        }
    }
}
