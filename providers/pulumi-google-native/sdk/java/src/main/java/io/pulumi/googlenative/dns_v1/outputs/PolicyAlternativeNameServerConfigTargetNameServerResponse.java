// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicyAlternativeNameServerConfigTargetNameServerResponse {
    /**
     * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    private final String forwardingPath;
    /**
     * IPv4 address to forward to.
     * 
     */
    private final String ipv4Address;
    private final String kind;

    @CustomType.Constructor
    private PolicyAlternativeNameServerConfigTargetNameServerResponse(
        @CustomType.Parameter("forwardingPath") String forwardingPath,
        @CustomType.Parameter("ipv4Address") String ipv4Address,
        @CustomType.Parameter("kind") String kind) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = ipv4Address;
        this.kind = kind;
    }

    /**
     * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
    */
    public String getForwardingPath() {
        return this.forwardingPath;
    }
    /**
     * IPv4 address to forward to.
     * 
    */
    public String getIpv4Address() {
        return this.ipv4Address;
    }
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigTargetNameServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String forwardingPath;
        private String ipv4Address;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigTargetNameServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.kind = defaults.kind;
        }

        public Builder forwardingPath(String forwardingPath) {
            this.forwardingPath = Objects.requireNonNull(forwardingPath);
            return this;
        }
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public PolicyAlternativeNameServerConfigTargetNameServerResponse build() {
            return new PolicyAlternativeNameServerConfigTargetNameServerResponse(forwardingPath, ipv4Address, kind);
        }
    }
}
