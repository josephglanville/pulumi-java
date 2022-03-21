// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpamPreviewNextCidrArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIpamPreviewNextCidrArgs Empty = new GetIpamPreviewNextCidrArgs();

    /**
     * Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    @Import(name="disallowedCidrs")
      private final @Nullable List<String> disallowedCidrs;

    public List<String> getDisallowedCidrs() {
        return this.disallowedCidrs == null ? List.of() : this.disallowedCidrs;
    }

    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @Import(name="ipamPoolId", required=true)
      private final String ipamPoolId;

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * The netmask length of the CIDR you would like to preview from the IPAM pool.
     * 
     */
    @Import(name="netmaskLength")
      private final @Nullable Integer netmaskLength;

    public Optional<Integer> getNetmaskLength() {
        return this.netmaskLength == null ? Optional.empty() : Optional.ofNullable(this.netmaskLength);
    }

    public GetIpamPreviewNextCidrArgs(
        @Nullable List<String> disallowedCidrs,
        String ipamPoolId,
        @Nullable Integer netmaskLength) {
        this.disallowedCidrs = disallowedCidrs;
        this.ipamPoolId = Objects.requireNonNull(ipamPoolId, "expected parameter 'ipamPoolId' to be non-null");
        this.netmaskLength = netmaskLength;
    }

    private GetIpamPreviewNextCidrArgs() {
        this.disallowedCidrs = List.of();
        this.ipamPoolId = null;
        this.netmaskLength = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpamPreviewNextCidrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> disallowedCidrs;
        private String ipamPoolId;
        private @Nullable Integer netmaskLength;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpamPreviewNextCidrArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disallowedCidrs = defaults.disallowedCidrs;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.netmaskLength = defaults.netmaskLength;
        }

        public Builder disallowedCidrs(@Nullable List<String> disallowedCidrs) {
            this.disallowedCidrs = disallowedCidrs;
            return this;
        }
        public Builder disallowedCidrs(String... disallowedCidrs) {
            return disallowedCidrs(List.of(disallowedCidrs));
        }
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = Objects.requireNonNull(ipamPoolId);
            return this;
        }
        public Builder netmaskLength(@Nullable Integer netmaskLength) {
            this.netmaskLength = netmaskLength;
            return this;
        }        public GetIpamPreviewNextCidrArgs build() {
            return new GetIpamPreviewNextCidrArgs(disallowedCidrs, ipamPoolId, netmaskLength);
        }
    }
}
