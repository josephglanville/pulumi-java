// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestOSNICCustomizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GuestOSNICCustomizationResponse Empty = new GuestOSNICCustomizationResponse();

    @InputImport(name="allocation")
    private final @Nullable String allocation;

    public Optional<String> getAllocation() {
        return this.allocation == null ? Optional.empty() : Optional.ofNullable(this.allocation);
    }

    @InputImport(name="dnsServers")
    private final @Nullable List<String> dnsServers;

    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    @InputImport(name="gateway")
    private final @Nullable List<String> gateway;

    public List<String> getGateway() {
        return this.gateway == null ? List.of() : this.gateway;
    }

    @InputImport(name="ipAddress")
    private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    @InputImport(name="mask")
    private final @Nullable String mask;

    public Optional<String> getMask() {
        return this.mask == null ? Optional.empty() : Optional.ofNullable(this.mask);
    }

    @InputImport(name="primaryWinsServer")
    private final @Nullable String primaryWinsServer;

    public Optional<String> getPrimaryWinsServer() {
        return this.primaryWinsServer == null ? Optional.empty() : Optional.ofNullable(this.primaryWinsServer);
    }

    @InputImport(name="secondaryWinsServer")
    private final @Nullable String secondaryWinsServer;

    public Optional<String> getSecondaryWinsServer() {
        return this.secondaryWinsServer == null ? Optional.empty() : Optional.ofNullable(this.secondaryWinsServer);
    }

    public GuestOSNICCustomizationResponse(
        @Nullable String allocation,
        @Nullable List<String> dnsServers,
        @Nullable List<String> gateway,
        @Nullable String ipAddress,
        @Nullable String mask,
        @Nullable String primaryWinsServer,
        @Nullable String secondaryWinsServer) {
        this.allocation = allocation;
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.mask = mask;
        this.primaryWinsServer = primaryWinsServer;
        this.secondaryWinsServer = secondaryWinsServer;
    }

    private GuestOSNICCustomizationResponse() {
        this.allocation = null;
        this.dnsServers = List.of();
        this.gateway = List.of();
        this.ipAddress = null;
        this.mask = null;
        this.primaryWinsServer = null;
        this.secondaryWinsServer = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOSNICCustomizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allocation;
        private @Nullable List<String> dnsServers;
        private @Nullable List<String> gateway;
        private @Nullable String ipAddress;
        private @Nullable String mask;
        private @Nullable String primaryWinsServer;
        private @Nullable String secondaryWinsServer;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOSNICCustomizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocation = defaults.allocation;
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.mask = defaults.mask;
    	      this.primaryWinsServer = defaults.primaryWinsServer;
    	      this.secondaryWinsServer = defaults.secondaryWinsServer;
        }

        public Builder setAllocation(@Nullable String allocation) {
            this.allocation = allocation;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setGateway(@Nullable List<String> gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setMask(@Nullable String mask) {
            this.mask = mask;
            return this;
        }

        public Builder setPrimaryWinsServer(@Nullable String primaryWinsServer) {
            this.primaryWinsServer = primaryWinsServer;
            return this;
        }

        public Builder setSecondaryWinsServer(@Nullable String secondaryWinsServer) {
            this.secondaryWinsServer = secondaryWinsServer;
            return this;
        }

        public GuestOSNICCustomizationResponse build() {
            return new GuestOSNICCustomizationResponse(allocation, dnsServers, gateway, ipAddress, mask, primaryWinsServer, secondaryWinsServer);
        }
    }
}
