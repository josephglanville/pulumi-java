// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EipState extends io.pulumi.resources.ResourceArgs {

    public static final EipState Empty = new EipState();

    /**
     * IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> getAddress() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
     * 
     */
    @Import(name="allocationId")
      private final @Nullable Output<String> allocationId;

    public Output<String> getAllocationId() {
        return this.allocationId == null ? Codegen.empty() : this.allocationId;
    }

    /**
     * User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * 
     */
    @Import(name="associateWithPrivateIp")
      private final @Nullable Output<String> associateWithPrivateIp;

    public Output<String> getAssociateWithPrivateIp() {
        return this.associateWithPrivateIp == null ? Codegen.empty() : this.associateWithPrivateIp;
    }

    /**
     * ID representing the association of the address with an instance in a VPC.
     * 
     */
    @Import(name="associationId")
      private final @Nullable Output<String> associationId;

    public Output<String> getAssociationId() {
        return this.associationId == null ? Codegen.empty() : this.associationId;
    }

    /**
     * Carrier IP address.
     * 
     */
    @Import(name="carrierIp")
      private final @Nullable Output<String> carrierIp;

    public Output<String> getCarrierIp() {
        return this.carrierIp == null ? Codegen.empty() : this.carrierIp;
    }

    /**
     * Customer owned IP.
     * 
     */
    @Import(name="customerOwnedIp")
      private final @Nullable Output<String> customerOwnedIp;

    public Output<String> getCustomerOwnedIp() {
        return this.customerOwnedIp == null ? Codegen.empty() : this.customerOwnedIp;
    }

    /**
     * ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
     * 
     */
    @Import(name="customerOwnedIpv4Pool")
      private final @Nullable Output<String> customerOwnedIpv4Pool;

    public Output<String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool == null ? Codegen.empty() : this.customerOwnedIpv4Pool;
    }

    /**
     * Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * EC2 instance ID.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    /**
     * Location from which the IP address is advertised. Use this parameter to limit the address to this location.
     * 
     */
    @Import(name="networkBorderGroup")
      private final @Nullable Output<String> networkBorderGroup;

    public Output<String> getNetworkBorderGroup() {
        return this.networkBorderGroup == null ? Codegen.empty() : this.networkBorderGroup;
    }

    /**
     * Network interface ID to associate with.
     * 
     */
    @Import(name="networkInterface")
      private final @Nullable Output<String> networkInterface;

    public Output<String> getNetworkInterface() {
        return this.networkInterface == null ? Codegen.empty() : this.networkInterface;
    }

    /**
     * The Private DNS associated with the Elastic IP address (if in VPC).
     * 
     */
    @Import(name="privateDns")
      private final @Nullable Output<String> privateDns;

    public Output<String> getPrivateDns() {
        return this.privateDns == null ? Codegen.empty() : this.privateDns;
    }

    /**
     * Contains the private IP address (if in VPC).
     * 
     */
    @Import(name="privateIp")
      private final @Nullable Output<String> privateIp;

    public Output<String> getPrivateIp() {
        return this.privateIp == null ? Codegen.empty() : this.privateIp;
    }

    /**
     * Public DNS associated with the Elastic IP address.
     * 
     */
    @Import(name="publicDns")
      private final @Nullable Output<String> publicDns;

    public Output<String> getPublicDns() {
        return this.publicDns == null ? Codegen.empty() : this.publicDns;
    }

    /**
     * Contains the public IP address.
     * 
     */
    @Import(name="publicIp")
      private final @Nullable Output<String> publicIp;

    public Output<String> getPublicIp() {
        return this.publicIp == null ? Codegen.empty() : this.publicIp;
    }

    /**
     * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
     * 
     */
    @Import(name="publicIpv4Pool")
      private final @Nullable Output<String> publicIpv4Pool;

    public Output<String> getPublicIpv4Pool() {
        return this.publicIpv4Pool == null ? Codegen.empty() : this.publicIpv4Pool;
    }

    /**
     * Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Boolean if the EIP is in a VPC or not.
     * 
     */
    @Import(name="vpc")
      private final @Nullable Output<Boolean> vpc;

    public Output<Boolean> getVpc() {
        return this.vpc == null ? Codegen.empty() : this.vpc;
    }

    public EipState(
        @Nullable Output<String> address,
        @Nullable Output<String> allocationId,
        @Nullable Output<String> associateWithPrivateIp,
        @Nullable Output<String> associationId,
        @Nullable Output<String> carrierIp,
        @Nullable Output<String> customerOwnedIp,
        @Nullable Output<String> customerOwnedIpv4Pool,
        @Nullable Output<String> domain,
        @Nullable Output<String> instance,
        @Nullable Output<String> networkBorderGroup,
        @Nullable Output<String> networkInterface,
        @Nullable Output<String> privateDns,
        @Nullable Output<String> privateIp,
        @Nullable Output<String> publicDns,
        @Nullable Output<String> publicIp,
        @Nullable Output<String> publicIpv4Pool,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Boolean> vpc) {
        this.address = address;
        this.allocationId = allocationId;
        this.associateWithPrivateIp = associateWithPrivateIp;
        this.associationId = associationId;
        this.carrierIp = carrierIp;
        this.customerOwnedIp = customerOwnedIp;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.domain = domain;
        this.instance = instance;
        this.networkBorderGroup = networkBorderGroup;
        this.networkInterface = networkInterface;
        this.privateDns = privateDns;
        this.privateIp = privateIp;
        this.publicDns = publicDns;
        this.publicIp = publicIp;
        this.publicIpv4Pool = publicIpv4Pool;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpc = vpc;
    }

    private EipState() {
        this.address = Codegen.empty();
        this.allocationId = Codegen.empty();
        this.associateWithPrivateIp = Codegen.empty();
        this.associationId = Codegen.empty();
        this.carrierIp = Codegen.empty();
        this.customerOwnedIp = Codegen.empty();
        this.customerOwnedIpv4Pool = Codegen.empty();
        this.domain = Codegen.empty();
        this.instance = Codegen.empty();
        this.networkBorderGroup = Codegen.empty();
        this.networkInterface = Codegen.empty();
        this.privateDns = Codegen.empty();
        this.privateIp = Codegen.empty();
        this.publicDns = Codegen.empty();
        this.publicIp = Codegen.empty();
        this.publicIpv4Pool = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpc = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<String> allocationId;
        private @Nullable Output<String> associateWithPrivateIp;
        private @Nullable Output<String> associationId;
        private @Nullable Output<String> carrierIp;
        private @Nullable Output<String> customerOwnedIp;
        private @Nullable Output<String> customerOwnedIpv4Pool;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> networkBorderGroup;
        private @Nullable Output<String> networkInterface;
        private @Nullable Output<String> privateDns;
        private @Nullable Output<String> privateIp;
        private @Nullable Output<String> publicDns;
        private @Nullable Output<String> publicIp;
        private @Nullable Output<String> publicIpv4Pool;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Boolean> vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(EipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.allocationId = defaults.allocationId;
    	      this.associateWithPrivateIp = defaults.associateWithPrivateIp;
    	      this.associationId = defaults.associationId;
    	      this.carrierIp = defaults.carrierIp;
    	      this.customerOwnedIp = defaults.customerOwnedIp;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.domain = defaults.domain;
    	      this.instance = defaults.instance;
    	      this.networkBorderGroup = defaults.networkBorderGroup;
    	      this.networkInterface = defaults.networkInterface;
    	      this.privateDns = defaults.privateDns;
    	      this.privateIp = defaults.privateIp;
    	      this.publicDns = defaults.publicDns;
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpv4Pool = defaults.publicIpv4Pool;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpc = defaults.vpc;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder allocationId(@Nullable Output<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public Builder allocationId(@Nullable String allocationId) {
            this.allocationId = Codegen.ofNullable(allocationId);
            return this;
        }
        public Builder associateWithPrivateIp(@Nullable Output<String> associateWithPrivateIp) {
            this.associateWithPrivateIp = associateWithPrivateIp;
            return this;
        }
        public Builder associateWithPrivateIp(@Nullable String associateWithPrivateIp) {
            this.associateWithPrivateIp = Codegen.ofNullable(associateWithPrivateIp);
            return this;
        }
        public Builder associationId(@Nullable Output<String> associationId) {
            this.associationId = associationId;
            return this;
        }
        public Builder associationId(@Nullable String associationId) {
            this.associationId = Codegen.ofNullable(associationId);
            return this;
        }
        public Builder carrierIp(@Nullable Output<String> carrierIp) {
            this.carrierIp = carrierIp;
            return this;
        }
        public Builder carrierIp(@Nullable String carrierIp) {
            this.carrierIp = Codegen.ofNullable(carrierIp);
            return this;
        }
        public Builder customerOwnedIp(@Nullable Output<String> customerOwnedIp) {
            this.customerOwnedIp = customerOwnedIp;
            return this;
        }
        public Builder customerOwnedIp(@Nullable String customerOwnedIp) {
            this.customerOwnedIp = Codegen.ofNullable(customerOwnedIp);
            return this;
        }
        public Builder customerOwnedIpv4Pool(@Nullable Output<String> customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }
        public Builder customerOwnedIpv4Pool(@Nullable String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Codegen.ofNullable(customerOwnedIpv4Pool);
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
            return this;
        }
        public Builder networkBorderGroup(@Nullable Output<String> networkBorderGroup) {
            this.networkBorderGroup = networkBorderGroup;
            return this;
        }
        public Builder networkBorderGroup(@Nullable String networkBorderGroup) {
            this.networkBorderGroup = Codegen.ofNullable(networkBorderGroup);
            return this;
        }
        public Builder networkInterface(@Nullable Output<String> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public Builder networkInterface(@Nullable String networkInterface) {
            this.networkInterface = Codegen.ofNullable(networkInterface);
            return this;
        }
        public Builder privateDns(@Nullable Output<String> privateDns) {
            this.privateDns = privateDns;
            return this;
        }
        public Builder privateDns(@Nullable String privateDns) {
            this.privateDns = Codegen.ofNullable(privateDns);
            return this;
        }
        public Builder privateIp(@Nullable Output<String> privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public Builder privateIp(@Nullable String privateIp) {
            this.privateIp = Codegen.ofNullable(privateIp);
            return this;
        }
        public Builder publicDns(@Nullable Output<String> publicDns) {
            this.publicDns = publicDns;
            return this;
        }
        public Builder publicDns(@Nullable String publicDns) {
            this.publicDns = Codegen.ofNullable(publicDns);
            return this;
        }
        public Builder publicIp(@Nullable Output<String> publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public Builder publicIp(@Nullable String publicIp) {
            this.publicIp = Codegen.ofNullable(publicIp);
            return this;
        }
        public Builder publicIpv4Pool(@Nullable Output<String> publicIpv4Pool) {
            this.publicIpv4Pool = publicIpv4Pool;
            return this;
        }
        public Builder publicIpv4Pool(@Nullable String publicIpv4Pool) {
            this.publicIpv4Pool = Codegen.ofNullable(publicIpv4Pool);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpc(@Nullable Output<Boolean> vpc) {
            this.vpc = vpc;
            return this;
        }
        public Builder vpc(@Nullable Boolean vpc) {
            this.vpc = Codegen.ofNullable(vpc);
            return this;
        }        public EipState build() {
            return new EipState(address, allocationId, associateWithPrivateIp, associationId, carrierIp, customerOwnedIp, customerOwnedIpv4Pool, domain, instance, networkBorderGroup, networkInterface, privateDns, privateIp, publicDns, publicIp, publicIpv4Pool, tags, tagsAll, vpc);
        }
    }
}
