// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamPoolCidrAllocationState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolCidrAllocationState Empty = new VpcIpamPoolCidrAllocationState();

    /**
     * The CIDR you want to assign to the pool.
     * 
     */
    @Import(name="cidr")
      private final @Nullable Output<String> cidr;

    public Output<String> getCidr() {
        return this.cidr == null ? Output.empty() : this.cidr;
    }

    /**
     * The description for the allocation.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    @Import(name="disallowedCidrs")
      private final @Nullable Output<List<String>> disallowedCidrs;

    public Output<List<String>> getDisallowedCidrs() {
        return this.disallowedCidrs == null ? Output.empty() : this.disallowedCidrs;
    }

    @Import(name="ipamPoolAllocationId")
      private final @Nullable Output<String> ipamPoolAllocationId;

    public Output<String> getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId == null ? Output.empty() : this.ipamPoolAllocationId;
    }

    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @Import(name="ipamPoolId")
      private final @Nullable Output<String> ipamPoolId;

    public Output<String> getIpamPoolId() {
        return this.ipamPoolId == null ? Output.empty() : this.ipamPoolId;
    }

    /**
     * The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
     * 
     */
    @Import(name="netmaskLength")
      private final @Nullable Output<Integer> netmaskLength;

    public Output<Integer> getNetmaskLength() {
        return this.netmaskLength == null ? Output.empty() : this.netmaskLength;
    }

    /**
     * The ID of the resource.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * The owner of the resource.
     * 
     */
    @Import(name="resourceOwner")
      private final @Nullable Output<String> resourceOwner;

    public Output<String> getResourceOwner() {
        return this.resourceOwner == null ? Output.empty() : this.resourceOwner;
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType == null ? Output.empty() : this.resourceType;
    }

    public VpcIpamPoolCidrAllocationState(
        @Nullable Output<String> cidr,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> disallowedCidrs,
        @Nullable Output<String> ipamPoolAllocationId,
        @Nullable Output<String> ipamPoolId,
        @Nullable Output<Integer> netmaskLength,
        @Nullable Output<String> resourceId,
        @Nullable Output<String> resourceOwner,
        @Nullable Output<String> resourceType) {
        this.cidr = cidr;
        this.description = description;
        this.disallowedCidrs = disallowedCidrs;
        this.ipamPoolAllocationId = ipamPoolAllocationId;
        this.ipamPoolId = ipamPoolId;
        this.netmaskLength = netmaskLength;
        this.resourceId = resourceId;
        this.resourceOwner = resourceOwner;
        this.resourceType = resourceType;
    }

    private VpcIpamPoolCidrAllocationState() {
        this.cidr = Output.empty();
        this.description = Output.empty();
        this.disallowedCidrs = Output.empty();
        this.ipamPoolAllocationId = Output.empty();
        this.ipamPoolId = Output.empty();
        this.netmaskLength = Output.empty();
        this.resourceId = Output.empty();
        this.resourceOwner = Output.empty();
        this.resourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamPoolCidrAllocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidr;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> disallowedCidrs;
        private @Nullable Output<String> ipamPoolAllocationId;
        private @Nullable Output<String> ipamPoolId;
        private @Nullable Output<Integer> netmaskLength;
        private @Nullable Output<String> resourceId;
        private @Nullable Output<String> resourceOwner;
        private @Nullable Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamPoolCidrAllocationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
    	      this.disallowedCidrs = defaults.disallowedCidrs;
    	      this.ipamPoolAllocationId = defaults.ipamPoolAllocationId;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.netmaskLength = defaults.netmaskLength;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder cidr(@Nullable Output<String> cidr) {
            this.cidr = cidr;
            return this;
        }
        public Builder cidr(@Nullable String cidr) {
            this.cidr = Output.ofNullable(cidr);
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
        public Builder disallowedCidrs(@Nullable Output<List<String>> disallowedCidrs) {
            this.disallowedCidrs = disallowedCidrs;
            return this;
        }
        public Builder disallowedCidrs(@Nullable List<String> disallowedCidrs) {
            this.disallowedCidrs = Output.ofNullable(disallowedCidrs);
            return this;
        }
        public Builder disallowedCidrs(String... disallowedCidrs) {
            return disallowedCidrs(List.of(disallowedCidrs));
        }
        public Builder ipamPoolAllocationId(@Nullable Output<String> ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }
        public Builder ipamPoolAllocationId(@Nullable String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = Output.ofNullable(ipamPoolAllocationId);
            return this;
        }
        public Builder ipamPoolId(@Nullable Output<String> ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }
        public Builder ipamPoolId(@Nullable String ipamPoolId) {
            this.ipamPoolId = Output.ofNullable(ipamPoolId);
            return this;
        }
        public Builder netmaskLength(@Nullable Output<Integer> netmaskLength) {
            this.netmaskLength = netmaskLength;
            return this;
        }
        public Builder netmaskLength(@Nullable Integer netmaskLength) {
            this.netmaskLength = Output.ofNullable(netmaskLength);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public Builder resourceOwner(@Nullable Output<String> resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public Builder resourceOwner(@Nullable String resourceOwner) {
            this.resourceOwner = Output.ofNullable(resourceOwner);
            return this;
        }
        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Output.ofNullable(resourceType);
            return this;
        }        public VpcIpamPoolCidrAllocationState build() {
            return new VpcIpamPoolCidrAllocationState(cidr, description, disallowedCidrs, ipamPoolAllocationId, ipamPoolId, netmaskLength, resourceId, resourceOwner, resourceType);
        }
    }
}
