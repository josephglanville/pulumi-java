// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DhcpOptionsOption {
    /**
     * @return (Updatable) If you set `serverType` to `CustomDnsServer`, specify the IP address of at least one DNS server of your choice (three maximum).
     * 
     */
    private final @Nullable List<String> customDnsServers;
    /**
     * @return (Updatable) A single search domain name according to [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC 1123](https://tools.ietf.org/html/rfc1123). During a DNS query, the OS will append this search domain name to the value being queried.
     * 
     */
    private final @Nullable List<String> searchDomainNames;
    /**
     * @return (Updatable)
     * * **VcnLocal:** Reserved for future use.
     * * **VcnLocalPlusInternet:** Also referred to as &#34;Internet and VCN Resolver&#34;. Instances can resolve internet hostnames (no internet gateway is required), and can resolve hostnames of instances in the VCN. This is the default value in the default set of DHCP options in the VCN. For the Internet and VCN Resolver to work across the VCN, there must also be a DNS label set for the VCN, a DNS label set for each subnet, and a hostname for each instance. The Internet and VCN Resolver also enables reverse DNS lookup, which lets you determine the hostname corresponding to the private IP address. For more information, see [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * * **CustomDnsServer:** Instances use a DNS server of your choice (three maximum).
     * 
     */
    private final @Nullable String serverType;
    /**
     * @return (Updatable) The specific DHCP option. Either `DomainNameServer` (for [DhcpDnsOption](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/DhcpDnsOption/)) or `SearchDomain` (for [DhcpSearchDomainOption](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/DhcpSearchDomainOption/)).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DhcpOptionsOption(
        @CustomType.Parameter("customDnsServers") @Nullable List<String> customDnsServers,
        @CustomType.Parameter("searchDomainNames") @Nullable List<String> searchDomainNames,
        @CustomType.Parameter("serverType") @Nullable String serverType,
        @CustomType.Parameter("type") String type) {
        this.customDnsServers = customDnsServers;
        this.searchDomainNames = searchDomainNames;
        this.serverType = serverType;
        this.type = type;
    }

    /**
     * @return (Updatable) If you set `serverType` to `CustomDnsServer`, specify the IP address of at least one DNS server of your choice (three maximum).
     * 
     */
    public List<String> customDnsServers() {
        return this.customDnsServers == null ? List.of() : this.customDnsServers;
    }
    /**
     * @return (Updatable) A single search domain name according to [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC 1123](https://tools.ietf.org/html/rfc1123). During a DNS query, the OS will append this search domain name to the value being queried.
     * 
     */
    public List<String> searchDomainNames() {
        return this.searchDomainNames == null ? List.of() : this.searchDomainNames;
    }
    /**
     * @return (Updatable)
     * * **VcnLocal:** Reserved for future use.
     * * **VcnLocalPlusInternet:** Also referred to as &#34;Internet and VCN Resolver&#34;. Instances can resolve internet hostnames (no internet gateway is required), and can resolve hostnames of instances in the VCN. This is the default value in the default set of DHCP options in the VCN. For the Internet and VCN Resolver to work across the VCN, there must also be a DNS label set for the VCN, a DNS label set for each subnet, and a hostname for each instance. The Internet and VCN Resolver also enables reverse DNS lookup, which lets you determine the hostname corresponding to the private IP address. For more information, see [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * * **CustomDnsServer:** Instances use a DNS server of your choice (three maximum).
     * 
     */
    public Optional<String> serverType() {
        return Optional.ofNullable(this.serverType);
    }
    /**
     * @return (Updatable) The specific DHCP option. Either `DomainNameServer` (for [DhcpDnsOption](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/DhcpDnsOption/)) or `SearchDomain` (for [DhcpSearchDomainOption](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/DhcpSearchDomainOption/)).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DhcpOptionsOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customDnsServers;
        private @Nullable List<String> searchDomainNames;
        private @Nullable String serverType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DhcpOptionsOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsServers = defaults.customDnsServers;
    	      this.searchDomainNames = defaults.searchDomainNames;
    	      this.serverType = defaults.serverType;
    	      this.type = defaults.type;
        }

        public Builder customDnsServers(@Nullable List<String> customDnsServers) {
            this.customDnsServers = customDnsServers;
            return this;
        }
        public Builder customDnsServers(String... customDnsServers) {
            return customDnsServers(List.of(customDnsServers));
        }
        public Builder searchDomainNames(@Nullable List<String> searchDomainNames) {
            this.searchDomainNames = searchDomainNames;
            return this;
        }
        public Builder searchDomainNames(String... searchDomainNames) {
            return searchDomainNames(List.of(searchDomainNames));
        }
        public Builder serverType(@Nullable String serverType) {
            this.serverType = serverType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DhcpOptionsOption build() {
            return new DhcpOptionsOption(customDnsServers, searchDomainNames, serverType, type);
        }
    }
}
