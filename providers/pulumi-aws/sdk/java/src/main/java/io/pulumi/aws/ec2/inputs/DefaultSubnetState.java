// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSubnetState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSubnetState Empty = new DefaultSubnetState();

    /**
     * ARN for the subnet.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    @Import(name="assignIpv6AddressOnCreation")
      private final @Nullable Output<Boolean> assignIpv6AddressOnCreation;

    public Output<Boolean> getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation == null ? Output.empty() : this.assignIpv6AddressOnCreation;
    }

    /**
     * AZ for the subnet.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    @Import(name="availabilityZoneId")
      private final @Nullable Output<String> availabilityZoneId;

    public Output<String> getAvailabilityZoneId() {
        return this.availabilityZoneId == null ? Output.empty() : this.availabilityZoneId;
    }

    /**
     * CIDR block for the subnet.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> getCidrBlock() {
        return this.cidrBlock == null ? Output.empty() : this.cidrBlock;
    }

    @Import(name="customerOwnedIpv4Pool")
      private final @Nullable Output<String> customerOwnedIpv4Pool;

    public Output<String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool == null ? Output.empty() : this.customerOwnedIpv4Pool;
    }

    @Import(name="enableDns64")
      private final @Nullable Output<Boolean> enableDns64;

    public Output<Boolean> getEnableDns64() {
        return this.enableDns64 == null ? Output.empty() : this.enableDns64;
    }

    @Import(name="enableResourceNameDnsARecordOnLaunch")
      private final @Nullable Output<Boolean> enableResourceNameDnsARecordOnLaunch;

    public Output<Boolean> getEnableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch == null ? Output.empty() : this.enableResourceNameDnsARecordOnLaunch;
    }

    @Import(name="enableResourceNameDnsAaaaRecordOnLaunch")
      private final @Nullable Output<Boolean> enableResourceNameDnsAaaaRecordOnLaunch;

    public Output<Boolean> getEnableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch == null ? Output.empty() : this.enableResourceNameDnsAaaaRecordOnLaunch;
    }

    /**
     * IPv6 CIDR block.
     * 
     */
    @Import(name="ipv6CidrBlock")
      private final @Nullable Output<String> ipv6CidrBlock;

    public Output<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Output.empty() : this.ipv6CidrBlock;
    }

    @Import(name="ipv6CidrBlockAssociationId")
      private final @Nullable Output<String> ipv6CidrBlockAssociationId;

    public Output<String> getIpv6CidrBlockAssociationId() {
        return this.ipv6CidrBlockAssociationId == null ? Output.empty() : this.ipv6CidrBlockAssociationId;
    }

    @Import(name="ipv6Native")
      private final @Nullable Output<Boolean> ipv6Native;

    public Output<Boolean> getIpv6Native() {
        return this.ipv6Native == null ? Output.empty() : this.ipv6Native;
    }

    @Import(name="mapCustomerOwnedIpOnLaunch")
      private final @Nullable Output<Boolean> mapCustomerOwnedIpOnLaunch;

    public Output<Boolean> getMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch == null ? Output.empty() : this.mapCustomerOwnedIpOnLaunch;
    }

    /**
     * Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    @Import(name="mapPublicIpOnLaunch")
      private final @Nullable Output<Boolean> mapPublicIpOnLaunch;

    public Output<Boolean> getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch == null ? Output.empty() : this.mapPublicIpOnLaunch;
    }

    @Import(name="outpostArn")
      private final @Nullable Output<String> outpostArn;

    public Output<String> getOutpostArn() {
        return this.outpostArn == null ? Output.empty() : this.outpostArn;
    }

    /**
     * ID of the AWS account that owns the subnet.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    @Import(name="privateDnsHostnameTypeOnLaunch")
      private final @Nullable Output<String> privateDnsHostnameTypeOnLaunch;

    public Output<String> getPrivateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch == null ? Output.empty() : this.privateDnsHostnameTypeOnLaunch;
    }

    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * VPC ID.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public DefaultSubnetState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> assignIpv6AddressOnCreation,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> availabilityZoneId,
        @Nullable Output<String> cidrBlock,
        @Nullable Output<String> customerOwnedIpv4Pool,
        @Nullable Output<Boolean> enableDns64,
        @Nullable Output<Boolean> enableResourceNameDnsARecordOnLaunch,
        @Nullable Output<Boolean> enableResourceNameDnsAaaaRecordOnLaunch,
        @Nullable Output<String> ipv6CidrBlock,
        @Nullable Output<String> ipv6CidrBlockAssociationId,
        @Nullable Output<Boolean> ipv6Native,
        @Nullable Output<Boolean> mapCustomerOwnedIpOnLaunch,
        @Nullable Output<Boolean> mapPublicIpOnLaunch,
        @Nullable Output<String> outpostArn,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> privateDnsHostnameTypeOnLaunch,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpcId) {
        this.arn = arn;
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        this.availabilityZone = availabilityZone;
        this.availabilityZoneId = availabilityZoneId;
        this.cidrBlock = cidrBlock;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.enableDns64 = enableDns64;
        this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
        this.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId;
        this.ipv6Native = ipv6Native;
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        this.outpostArn = outpostArn;
        this.ownerId = ownerId;
        this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private DefaultSubnetState() {
        this.arn = Output.empty();
        this.assignIpv6AddressOnCreation = Output.empty();
        this.availabilityZone = Output.empty();
        this.availabilityZoneId = Output.empty();
        this.cidrBlock = Output.empty();
        this.customerOwnedIpv4Pool = Output.empty();
        this.enableDns64 = Output.empty();
        this.enableResourceNameDnsARecordOnLaunch = Output.empty();
        this.enableResourceNameDnsAaaaRecordOnLaunch = Output.empty();
        this.ipv6CidrBlock = Output.empty();
        this.ipv6CidrBlockAssociationId = Output.empty();
        this.ipv6Native = Output.empty();
        this.mapCustomerOwnedIpOnLaunch = Output.empty();
        this.mapPublicIpOnLaunch = Output.empty();
        this.outpostArn = Output.empty();
        this.ownerId = Output.empty();
        this.privateDnsHostnameTypeOnLaunch = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSubnetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> assignIpv6AddressOnCreation;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> availabilityZoneId;
        private @Nullable Output<String> cidrBlock;
        private @Nullable Output<String> customerOwnedIpv4Pool;
        private @Nullable Output<Boolean> enableDns64;
        private @Nullable Output<Boolean> enableResourceNameDnsARecordOnLaunch;
        private @Nullable Output<Boolean> enableResourceNameDnsAaaaRecordOnLaunch;
        private @Nullable Output<String> ipv6CidrBlock;
        private @Nullable Output<String> ipv6CidrBlockAssociationId;
        private @Nullable Output<Boolean> ipv6Native;
        private @Nullable Output<Boolean> mapCustomerOwnedIpOnLaunch;
        private @Nullable Output<Boolean> mapPublicIpOnLaunch;
        private @Nullable Output<String> outpostArn;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> privateDnsHostnameTypeOnLaunch;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSubnetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assignIpv6AddressOnCreation = defaults.assignIpv6AddressOnCreation;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.enableDns64 = defaults.enableDns64;
    	      this.enableResourceNameDnsARecordOnLaunch = defaults.enableResourceNameDnsARecordOnLaunch;
    	      this.enableResourceNameDnsAaaaRecordOnLaunch = defaults.enableResourceNameDnsAaaaRecordOnLaunch;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6CidrBlockAssociationId = defaults.ipv6CidrBlockAssociationId;
    	      this.ipv6Native = defaults.ipv6Native;
    	      this.mapCustomerOwnedIpOnLaunch = defaults.mapCustomerOwnedIpOnLaunch;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.privateDnsHostnameTypeOnLaunch = defaults.privateDnsHostnameTypeOnLaunch;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder assignIpv6AddressOnCreation(@Nullable Output<Boolean> assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
            return this;
        }
        public Builder assignIpv6AddressOnCreation(@Nullable Boolean assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = Output.ofNullable(assignIpv6AddressOnCreation);
            return this;
        }
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
            return this;
        }
        public Builder availabilityZoneId(@Nullable Output<String> availabilityZoneId) {
            this.availabilityZoneId = availabilityZoneId;
            return this;
        }
        public Builder availabilityZoneId(@Nullable String availabilityZoneId) {
            this.availabilityZoneId = Output.ofNullable(availabilityZoneId);
            return this;
        }
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Output.ofNullable(cidrBlock);
            return this;
        }
        public Builder customerOwnedIpv4Pool(@Nullable Output<String> customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }
        public Builder customerOwnedIpv4Pool(@Nullable String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Output.ofNullable(customerOwnedIpv4Pool);
            return this;
        }
        public Builder enableDns64(@Nullable Output<Boolean> enableDns64) {
            this.enableDns64 = enableDns64;
            return this;
        }
        public Builder enableDns64(@Nullable Boolean enableDns64) {
            this.enableDns64 = Output.ofNullable(enableDns64);
            return this;
        }
        public Builder enableResourceNameDnsARecordOnLaunch(@Nullable Output<Boolean> enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
            return this;
        }
        public Builder enableResourceNameDnsARecordOnLaunch(@Nullable Boolean enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = Output.ofNullable(enableResourceNameDnsARecordOnLaunch);
            return this;
        }
        public Builder enableResourceNameDnsAaaaRecordOnLaunch(@Nullable Output<Boolean> enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
            return this;
        }
        public Builder enableResourceNameDnsAaaaRecordOnLaunch(@Nullable Boolean enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = Output.ofNullable(enableResourceNameDnsAaaaRecordOnLaunch);
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Output.ofNullable(ipv6CidrBlock);
            return this;
        }
        public Builder ipv6CidrBlockAssociationId(@Nullable Output<String> ipv6CidrBlockAssociationId) {
            this.ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId;
            return this;
        }
        public Builder ipv6CidrBlockAssociationId(@Nullable String ipv6CidrBlockAssociationId) {
            this.ipv6CidrBlockAssociationId = Output.ofNullable(ipv6CidrBlockAssociationId);
            return this;
        }
        public Builder ipv6Native(@Nullable Output<Boolean> ipv6Native) {
            this.ipv6Native = ipv6Native;
            return this;
        }
        public Builder ipv6Native(@Nullable Boolean ipv6Native) {
            this.ipv6Native = Output.ofNullable(ipv6Native);
            return this;
        }
        public Builder mapCustomerOwnedIpOnLaunch(@Nullable Output<Boolean> mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
            return this;
        }
        public Builder mapCustomerOwnedIpOnLaunch(@Nullable Boolean mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = Output.ofNullable(mapCustomerOwnedIpOnLaunch);
            return this;
        }
        public Builder mapPublicIpOnLaunch(@Nullable Output<Boolean> mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
            return this;
        }
        public Builder mapPublicIpOnLaunch(@Nullable Boolean mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = Output.ofNullable(mapPublicIpOnLaunch);
            return this;
        }
        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }
        public Builder outpostArn(@Nullable String outpostArn) {
            this.outpostArn = Output.ofNullable(outpostArn);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }
        public Builder privateDnsHostnameTypeOnLaunch(@Nullable Output<String> privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
            return this;
        }
        public Builder privateDnsHostnameTypeOnLaunch(@Nullable String privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = Output.ofNullable(privateDnsHostnameTypeOnLaunch);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }        public DefaultSubnetState build() {
            return new DefaultSubnetState(arn, assignIpv6AddressOnCreation, availabilityZone, availabilityZoneId, cidrBlock, customerOwnedIpv4Pool, enableDns64, enableResourceNameDnsARecordOnLaunch, enableResourceNameDnsAaaaRecordOnLaunch, ipv6CidrBlock, ipv6CidrBlockAssociationId, ipv6Native, mapCustomerOwnedIpOnLaunch, mapPublicIpOnLaunch, outpostArn, ownerId, privateDnsHostnameTypeOnLaunch, tags, tagsAll, vpcId);
        }
    }
}