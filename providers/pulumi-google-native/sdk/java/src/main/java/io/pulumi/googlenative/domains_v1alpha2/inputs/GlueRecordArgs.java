// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1alpha2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a host on your domain that is a DNS name server for your domain and/or other domains. Glue records are a way of making the IP address of a name server known, even when it serves DNS queries for its parent domain. For example, when `ns.example.com` is a name server for `example.com`, the host `ns.example.com` must have a glue record to break the circular DNS reference.
 * 
 */
public final class GlueRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlueRecordArgs Empty = new GlueRecordArgs();

    /**
     * Domain name of the host in Punycode format.
     * 
     */
    @InputImport(name="hostName", required=true)
      private final Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName;
    }

    /**
     * List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    @InputImport(name="ipv4Addresses")
      private final @Nullable Output<List<String>> ipv4Addresses;

    public Output<List<String>> getIpv4Addresses() {
        return this.ipv4Addresses == null ? Output.empty() : this.ipv4Addresses;
    }

    /**
     * List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    @InputImport(name="ipv6Addresses")
      private final @Nullable Output<List<String>> ipv6Addresses;

    public Output<List<String>> getIpv6Addresses() {
        return this.ipv6Addresses == null ? Output.empty() : this.ipv6Addresses;
    }

    public GlueRecordArgs(
        Output<String> hostName,
        @Nullable Output<List<String>> ipv4Addresses,
        @Nullable Output<List<String>> ipv6Addresses) {
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.ipv4Addresses = ipv4Addresses;
        this.ipv6Addresses = ipv6Addresses;
    }

    private GlueRecordArgs() {
        this.hostName = Output.empty();
        this.ipv4Addresses = Output.empty();
        this.ipv6Addresses = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlueRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> hostName;
        private @Nullable Output<List<String>> ipv4Addresses;
        private @Nullable Output<List<String>> ipv6Addresses;

        public Builder() {
    	      // Empty
        }

        public Builder(GlueRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.ipv4Addresses = defaults.ipv4Addresses;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
        }

        public Builder hostName(Output<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = Output.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder ipv4Addresses(@Nullable Output<List<String>> ipv4Addresses) {
            this.ipv4Addresses = ipv4Addresses;
            return this;
        }

        public Builder ipv4Addresses(@Nullable List<String> ipv4Addresses) {
            this.ipv4Addresses = Output.ofNullable(ipv4Addresses);
            return this;
        }

        public Builder ipv6Addresses(@Nullable Output<List<String>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder ipv6Addresses(@Nullable List<String> ipv6Addresses) {
            this.ipv6Addresses = Output.ofNullable(ipv6Addresses);
            return this;
        }
        public GlueRecordArgs build() {
            return new GlueRecordArgs(hostName, ipv4Addresses, ipv6Addresses);
        }
    }
}
