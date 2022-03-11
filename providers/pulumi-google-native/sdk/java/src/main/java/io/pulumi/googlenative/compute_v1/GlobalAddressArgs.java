// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressAddressType;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressIpVersion;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressNetworkTier;
import io.pulumi.googlenative.compute_v1.enums.GlobalAddressPurpose;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalAddressArgs Empty = new GlobalAddressArgs();

    /**
     * The static IP address represented by this resource.
     * 
     */
    @InputImport(name="address")
      private final @Nullable Output<String> address;

    public Output<String> getAddress() {
        return this.address == null ? Output.empty() : this.address;
    }

    /**
     * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
     */
    @InputImport(name="addressType")
      private final @Nullable Output<GlobalAddressAddressType> addressType;

    public Output<GlobalAddressAddressType> getAddressType() {
        return this.addressType == null ? Output.empty() : this.addressType;
    }

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
     * 
     */
    @InputImport(name="ipVersion")
      private final @Nullable Output<GlobalAddressIpVersion> ipVersion;

    public Output<GlobalAddressIpVersion> getIpVersion() {
        return this.ipVersion == null ? Output.empty() : this.ipVersion;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    @InputImport(name="networkTier")
      private final @Nullable Output<GlobalAddressNetworkTier> networkTier;

    public Output<GlobalAddressNetworkTier> getNetworkTier() {
        return this.networkTier == null ? Output.empty() : this.networkTier;
    }

    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    @InputImport(name="prefixLength")
      private final @Nullable Output<Integer> prefixLength;

    public Output<Integer> getPrefixLength() {
        return this.prefixLength == null ? Output.empty() : this.prefixLength;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
     */
    @InputImport(name="purpose")
      private final @Nullable Output<GlobalAddressPurpose> purpose;

    public Output<GlobalAddressPurpose> getPurpose() {
        return this.purpose == null ? Output.empty() : this.purpose;
    }

    @InputImport(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    public GlobalAddressArgs(
        @Nullable Output<String> address,
        @Nullable Output<GlobalAddressAddressType> addressType,
        @Nullable Output<String> description,
        @Nullable Output<GlobalAddressIpVersion> ipVersion,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<GlobalAddressNetworkTier> networkTier,
        @Nullable Output<Integer> prefixLength,
        @Nullable Output<String> project,
        @Nullable Output<GlobalAddressPurpose> purpose,
        @Nullable Output<String> requestId,
        @Nullable Output<String> subnetwork) {
        this.address = address;
        this.addressType = addressType;
        this.description = description;
        this.ipVersion = ipVersion;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.prefixLength = prefixLength;
        this.project = project;
        this.purpose = purpose;
        this.requestId = requestId;
        this.subnetwork = subnetwork;
    }

    private GlobalAddressArgs() {
        this.address = Output.empty();
        this.addressType = Output.empty();
        this.description = Output.empty();
        this.ipVersion = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.networkTier = Output.empty();
        this.prefixLength = Output.empty();
        this.project = Output.empty();
        this.purpose = Output.empty();
        this.requestId = Output.empty();
        this.subnetwork = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<GlobalAddressAddressType> addressType;
        private @Nullable Output<String> description;
        private @Nullable Output<GlobalAddressIpVersion> ipVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<GlobalAddressNetworkTier> networkTier;
        private @Nullable Output<Integer> prefixLength;
        private @Nullable Output<String> project;
        private @Nullable Output<GlobalAddressPurpose> purpose;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressType = defaults.addressType;
    	      this.description = defaults.description;
    	      this.ipVersion = defaults.ipVersion;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.prefixLength = defaults.prefixLength;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.requestId = defaults.requestId;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }

        public Builder address(@Nullable String address) {
            this.address = Output.ofNullable(address);
            return this;
        }

        public Builder addressType(@Nullable Output<GlobalAddressAddressType> addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder addressType(@Nullable GlobalAddressAddressType addressType) {
            this.addressType = Output.ofNullable(addressType);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder ipVersion(@Nullable Output<GlobalAddressIpVersion> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        public Builder ipVersion(@Nullable GlobalAddressIpVersion ipVersion) {
            this.ipVersion = Output.ofNullable(ipVersion);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder networkTier(@Nullable Output<GlobalAddressNetworkTier> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(@Nullable GlobalAddressNetworkTier networkTier) {
            this.networkTier = Output.ofNullable(networkTier);
            return this;
        }

        public Builder prefixLength(@Nullable Output<Integer> prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder prefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = Output.ofNullable(prefixLength);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder purpose(@Nullable Output<GlobalAddressPurpose> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder purpose(@Nullable GlobalAddressPurpose purpose) {
            this.purpose = Output.ofNullable(purpose);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Output.ofNullable(subnetwork);
            return this;
        }
        public GlobalAddressArgs build() {
            return new GlobalAddressArgs(address, addressType, description, ipVersion, name, network, networkTier, prefixLength, project, purpose, requestId, subnetwork);
        }
    }
}
