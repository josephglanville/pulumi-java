// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamPoolCidrAllocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolCidrAllocationArgs Empty = new VpcIpamPoolCidrAllocationArgs();

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

    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @Import(name="ipamPoolId", required=true)
      private final Output<String> ipamPoolId;

    public Output<String> getIpamPoolId() {
        return this.ipamPoolId;
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

    public VpcIpamPoolCidrAllocationArgs(
        @Nullable Output<String> cidr,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> disallowedCidrs,
        Output<String> ipamPoolId,
        @Nullable Output<Integer> netmaskLength) {
        this.cidr = cidr;
        this.description = description;
        this.disallowedCidrs = disallowedCidrs;
        this.ipamPoolId = Objects.requireNonNull(ipamPoolId, "expected parameter 'ipamPoolId' to be non-null");
        this.netmaskLength = netmaskLength;
    }

    private VpcIpamPoolCidrAllocationArgs() {
        this.cidr = Output.empty();
        this.description = Output.empty();
        this.disallowedCidrs = Output.empty();
        this.ipamPoolId = Output.empty();
        this.netmaskLength = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamPoolCidrAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidr;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> disallowedCidrs;
        private Output<String> ipamPoolId;
        private @Nullable Output<Integer> netmaskLength;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamPoolCidrAllocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
    	      this.disallowedCidrs = defaults.disallowedCidrs;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.netmaskLength = defaults.netmaskLength;
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
        public Builder ipamPoolId(Output<String> ipamPoolId) {
            this.ipamPoolId = Objects.requireNonNull(ipamPoolId);
            return this;
        }
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = Output.of(Objects.requireNonNull(ipamPoolId));
            return this;
        }
        public Builder netmaskLength(@Nullable Output<Integer> netmaskLength) {
            this.netmaskLength = netmaskLength;
            return this;
        }
        public Builder netmaskLength(@Nullable Integer netmaskLength) {
            this.netmaskLength = Output.ofNullable(netmaskLength);
            return this;
        }        public VpcIpamPoolCidrAllocationArgs build() {
            return new VpcIpamPoolCidrAllocationArgs(cidr, description, disallowedCidrs, ipamPoolId, netmaskLength);
        }
    }
}