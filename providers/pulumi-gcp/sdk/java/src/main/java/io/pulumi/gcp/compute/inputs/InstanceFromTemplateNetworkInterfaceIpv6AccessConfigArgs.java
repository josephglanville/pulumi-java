// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs Empty = new InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs();

    @InputImport(name="externalIpv6")
      private final @Nullable Input<String> externalIpv6;

    public Input<String> getExternalIpv6() {
        return this.externalIpv6 == null ? Input.empty() : this.externalIpv6;
    }

    @InputImport(name="externalIpv6PrefixLength")
      private final @Nullable Input<String> externalIpv6PrefixLength;

    public Input<String> getExternalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength == null ? Input.empty() : this.externalIpv6PrefixLength;
    }

    @InputImport(name="networkTier", required=true)
      private final Input<String> networkTier;

    public Input<String> getNetworkTier() {
        return this.networkTier;
    }

    @InputImport(name="publicPtrDomainName")
      private final @Nullable Input<String> publicPtrDomainName;

    public Input<String> getPublicPtrDomainName() {
        return this.publicPtrDomainName == null ? Input.empty() : this.publicPtrDomainName;
    }

    public InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs(
        @Nullable Input<String> externalIpv6,
        @Nullable Input<String> externalIpv6PrefixLength,
        Input<String> networkTier,
        @Nullable Input<String> publicPtrDomainName) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.publicPtrDomainName = publicPtrDomainName;
    }

    private InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs() {
        this.externalIpv6 = Input.empty();
        this.externalIpv6PrefixLength = Input.empty();
        this.networkTier = Input.empty();
        this.publicPtrDomainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> externalIpv6;
        private @Nullable Input<String> externalIpv6PrefixLength;
        private Input<String> networkTier;
        private @Nullable Input<String> publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder setExternalIpv6(@Nullable Input<String> externalIpv6) {
            this.externalIpv6 = externalIpv6;
            return this;
        }

        public Builder setExternalIpv6(@Nullable String externalIpv6) {
            this.externalIpv6 = Input.ofNullable(externalIpv6);
            return this;
        }

        public Builder setExternalIpv6PrefixLength(@Nullable Input<String> externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }

        public Builder setExternalIpv6PrefixLength(@Nullable String externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Input.ofNullable(externalIpv6PrefixLength);
            return this;
        }

        public Builder setNetworkTier(Input<String> networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Input.of(Objects.requireNonNull(networkTier));
            return this;
        }

        public Builder setPublicPtrDomainName(@Nullable Input<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder setPublicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Input.ofNullable(publicPtrDomainName);
            return this;
        }
        public InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs build() {
            return new InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs(externalIpv6, externalIpv6PrefixLength, networkTier, publicPtrDomainName);
        }
    }
}
