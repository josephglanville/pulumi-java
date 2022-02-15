// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CacheNetworkSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheNetworkSettingsArgs Empty = new CacheNetworkSettingsArgs();

    @InputImport(name="dnsSearchDomain")
    private final @Nullable Input<String> dnsSearchDomain;

    public Input<String> getDnsSearchDomain() {
        return this.dnsSearchDomain == null ? Input.empty() : this.dnsSearchDomain;
    }

    @InputImport(name="dnsServers")
    private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    @InputImport(name="mtu")
    private final @Nullable Input<Integer> mtu;

    public Input<Integer> getMtu() {
        return this.mtu == null ? Input.empty() : this.mtu;
    }

    @InputImport(name="ntpServer")
    private final @Nullable Input<String> ntpServer;

    public Input<String> getNtpServer() {
        return this.ntpServer == null ? Input.empty() : this.ntpServer;
    }

    public CacheNetworkSettingsArgs(
        @Nullable Input<String> dnsSearchDomain,
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<Integer> mtu,
        @Nullable Input<String> ntpServer) {
        this.dnsSearchDomain = dnsSearchDomain;
        this.dnsServers = dnsServers;
        this.mtu = mtu == null ? Input.ofNullable(1500) : mtu;
        this.ntpServer = ntpServer == null ? Input.ofNullable("time.windows.com") : ntpServer;
    }

    private CacheNetworkSettingsArgs() {
        this.dnsSearchDomain = Input.empty();
        this.dnsServers = Input.empty();
        this.mtu = Input.empty();
        this.ntpServer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheNetworkSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dnsSearchDomain;
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<Integer> mtu;
        private @Nullable Input<String> ntpServer;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheNetworkSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSearchDomain = defaults.dnsSearchDomain;
    	      this.dnsServers = defaults.dnsServers;
    	      this.mtu = defaults.mtu;
    	      this.ntpServer = defaults.ntpServer;
        }

        public Builder setDnsSearchDomain(@Nullable Input<String> dnsSearchDomain) {
            this.dnsSearchDomain = dnsSearchDomain;
            return this;
        }

        public Builder setDnsSearchDomain(@Nullable String dnsSearchDomain) {
            this.dnsSearchDomain = Input.ofNullable(dnsSearchDomain);
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

        public Builder setMtu(@Nullable Input<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }

        public Builder setMtu(@Nullable Integer mtu) {
            this.mtu = Input.ofNullable(mtu);
            return this;
        }

        public Builder setNtpServer(@Nullable Input<String> ntpServer) {
            this.ntpServer = ntpServer;
            return this;
        }

        public Builder setNtpServer(@Nullable String ntpServer) {
            this.ntpServer = Input.ofNullable(ntpServer);
            return this;
        }

        public CacheNetworkSettingsArgs build() {
            return new CacheNetworkSettingsArgs(dnsSearchDomain, dnsServers, mtu, ntpServer);
        }
    }
}