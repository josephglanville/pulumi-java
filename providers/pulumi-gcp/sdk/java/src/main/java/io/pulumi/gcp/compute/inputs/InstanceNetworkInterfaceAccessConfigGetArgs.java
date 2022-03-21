// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceAccessConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceAccessConfigGetArgs Empty = new InstanceNetworkInterfaceAccessConfigGetArgs();

    /**
     * The IP address that will be 1:1 mapped to the instance's
     * network ip. If not given, one will be generated.
     * 
     */
    @Import(name="natIp")
      private final @Nullable Output<String> natIp;

    public Output<String> getNatIp() {
        return this.natIp == null ? Output.empty() : this.natIp;
    }

    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    @Import(name="networkTier")
      private final @Nullable Output<String> networkTier;

    public Output<String> getNetworkTier() {
        return this.networkTier == null ? Output.empty() : this.networkTier;
    }

    /**
     * The domain name to be used when creating DNSv6
     * records for the external IPv6 ranges..
     * 
     */
    @Import(name="publicPtrDomainName")
      private final @Nullable Output<String> publicPtrDomainName;

    public Output<String> getPublicPtrDomainName() {
        return this.publicPtrDomainName == null ? Output.empty() : this.publicPtrDomainName;
    }

    public InstanceNetworkInterfaceAccessConfigGetArgs(
        @Nullable Output<String> natIp,
        @Nullable Output<String> networkTier,
        @Nullable Output<String> publicPtrDomainName) {
        this.natIp = natIp;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
    }

    private InstanceNetworkInterfaceAccessConfigGetArgs() {
        this.natIp = Output.empty();
        this.networkTier = Output.empty();
        this.publicPtrDomainName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceAccessConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> natIp;
        private @Nullable Output<String> networkTier;
        private @Nullable Output<String> publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceAccessConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder natIp(@Nullable Output<String> natIp) {
            this.natIp = natIp;
            return this;
        }
        public Builder natIp(@Nullable String natIp) {
            this.natIp = Output.ofNullable(natIp);
            return this;
        }
        public Builder networkTier(@Nullable Output<String> networkTier) {
            this.networkTier = networkTier;
            return this;
        }
        public Builder networkTier(@Nullable String networkTier) {
            this.networkTier = Output.ofNullable(networkTier);
            return this;
        }
        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }
        public Builder publicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Output.ofNullable(publicPtrDomainName);
            return this;
        }        public InstanceNetworkInterfaceAccessConfigGetArgs build() {
            return new InstanceNetworkInterfaceAccessConfigGetArgs(natIp, networkTier, publicPtrDomainName);
        }
    }
}
