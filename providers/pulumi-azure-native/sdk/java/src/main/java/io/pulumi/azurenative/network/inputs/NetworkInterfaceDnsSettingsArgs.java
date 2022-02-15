// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceDnsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceDnsSettingsArgs Empty = new NetworkInterfaceDnsSettingsArgs();

    @InputImport(name="dnsServers")
    private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    @InputImport(name="internalDnsNameLabel")
    private final @Nullable Input<String> internalDnsNameLabel;

    public Input<String> getInternalDnsNameLabel() {
        return this.internalDnsNameLabel == null ? Input.empty() : this.internalDnsNameLabel;
    }

    public NetworkInterfaceDnsSettingsArgs(
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<String> internalDnsNameLabel) {
        this.dnsServers = dnsServers;
        this.internalDnsNameLabel = internalDnsNameLabel;
    }

    private NetworkInterfaceDnsSettingsArgs() {
        this.dnsServers = Input.empty();
        this.internalDnsNameLabel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceDnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<String> internalDnsNameLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceDnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.internalDnsNameLabel = defaults.internalDnsNameLabel;
        }

        public Builder setDnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder setInternalDnsNameLabel(@Nullable Input<String> internalDnsNameLabel) {
            this.internalDnsNameLabel = internalDnsNameLabel;
            return this;
        }

        public Builder setInternalDnsNameLabel(@Nullable String internalDnsNameLabel) {
            this.internalDnsNameLabel = Input.ofNullable(internalDnsNameLabel);
            return this;
        }

        public NetworkInterfaceDnsSettingsArgs build() {
            return new NetworkInterfaceDnsSettingsArgs(dnsServers, internalDnsNameLabel);
        }
    }
}