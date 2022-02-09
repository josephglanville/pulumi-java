// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInterfaceDnsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceDnsSettingsResponse Empty = new NetworkInterfaceDnsSettingsResponse();

    @InputImport(name="appliedDnsServers", required=true)
    private final List<String> appliedDnsServers;

    public List<String> getAppliedDnsServers() {
        return this.appliedDnsServers;
    }

    @InputImport(name="dnsServers")
    private final @Nullable List<String> dnsServers;

    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    @InputImport(name="internalDnsNameLabel")
    private final @Nullable String internalDnsNameLabel;

    public Optional<String> getInternalDnsNameLabel() {
        return this.internalDnsNameLabel == null ? Optional.empty() : Optional.ofNullable(this.internalDnsNameLabel);
    }

    @InputImport(name="internalDomainNameSuffix", required=true)
    private final String internalDomainNameSuffix;

    public String getInternalDomainNameSuffix() {
        return this.internalDomainNameSuffix;
    }

    @InputImport(name="internalFqdn", required=true)
    private final String internalFqdn;

    public String getInternalFqdn() {
        return this.internalFqdn;
    }

    public NetworkInterfaceDnsSettingsResponse(
        List<String> appliedDnsServers,
        @Nullable List<String> dnsServers,
        @Nullable String internalDnsNameLabel,
        String internalDomainNameSuffix,
        String internalFqdn) {
        this.appliedDnsServers = Objects.requireNonNull(appliedDnsServers, "expected parameter 'appliedDnsServers' to be non-null");
        this.dnsServers = dnsServers;
        this.internalDnsNameLabel = internalDnsNameLabel;
        this.internalDomainNameSuffix = Objects.requireNonNull(internalDomainNameSuffix, "expected parameter 'internalDomainNameSuffix' to be non-null");
        this.internalFqdn = Objects.requireNonNull(internalFqdn, "expected parameter 'internalFqdn' to be non-null");
    }

    private NetworkInterfaceDnsSettingsResponse() {
        this.appliedDnsServers = List.of();
        this.dnsServers = List.of();
        this.internalDnsNameLabel = null;
        this.internalDomainNameSuffix = null;
        this.internalFqdn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceDnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> appliedDnsServers;
        private @Nullable List<String> dnsServers;
        private @Nullable String internalDnsNameLabel;
        private String internalDomainNameSuffix;
        private String internalFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceDnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedDnsServers = defaults.appliedDnsServers;
    	      this.dnsServers = defaults.dnsServers;
    	      this.internalDnsNameLabel = defaults.internalDnsNameLabel;
    	      this.internalDomainNameSuffix = defaults.internalDomainNameSuffix;
    	      this.internalFqdn = defaults.internalFqdn;
        }

        public Builder setAppliedDnsServers(List<String> appliedDnsServers) {
            this.appliedDnsServers = Objects.requireNonNull(appliedDnsServers);
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setInternalDnsNameLabel(@Nullable String internalDnsNameLabel) {
            this.internalDnsNameLabel = internalDnsNameLabel;
            return this;
        }

        public Builder setInternalDomainNameSuffix(String internalDomainNameSuffix) {
            this.internalDomainNameSuffix = Objects.requireNonNull(internalDomainNameSuffix);
            return this;
        }

        public Builder setInternalFqdn(String internalFqdn) {
            this.internalFqdn = Objects.requireNonNull(internalFqdn);
            return this;
        }

        public NetworkInterfaceDnsSettingsResponse build() {
            return new NetworkInterfaceDnsSettingsResponse(appliedDnsServers, dnsServers, internalDnsNameLabel, internalDomainNameSuffix, internalFqdn);
        }
    }
}
