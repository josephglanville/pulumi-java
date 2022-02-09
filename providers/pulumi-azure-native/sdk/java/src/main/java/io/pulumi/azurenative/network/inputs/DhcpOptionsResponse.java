// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DhcpOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DhcpOptionsResponse Empty = new DhcpOptionsResponse();

    @InputImport(name="dnsServers")
    private final @Nullable List<String> dnsServers;

    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    public DhcpOptionsResponse(@Nullable List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    private DhcpOptionsResponse() {
        this.dnsServers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DhcpOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;

        public Builder() {
    	      // Empty
        }

        public Builder(DhcpOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public DhcpOptionsResponse build() {
            return new DhcpOptionsResponse(dnsServers);
        }
    }
}
