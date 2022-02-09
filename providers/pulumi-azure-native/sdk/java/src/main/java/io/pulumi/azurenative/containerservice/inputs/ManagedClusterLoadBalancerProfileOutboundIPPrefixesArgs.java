// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ResourceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs Empty = new ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs();

    @InputImport(name="publicIPPrefixes")
    private final @Nullable Input<List<ResourceReferenceArgs>> publicIPPrefixes;

    public Input<List<ResourceReferenceArgs>> getPublicIPPrefixes() {
        return this.publicIPPrefixes == null ? Input.empty() : this.publicIPPrefixes;
    }

    public ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs(@Nullable Input<List<ResourceReferenceArgs>> publicIPPrefixes) {
        this.publicIPPrefixes = publicIPPrefixes;
    }

    private ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs() {
        this.publicIPPrefixes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ResourceReferenceArgs>> publicIPPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPPrefixes = defaults.publicIPPrefixes;
        }

        public Builder setPublicIPPrefixes(@Nullable Input<List<ResourceReferenceArgs>> publicIPPrefixes) {
            this.publicIPPrefixes = publicIPPrefixes;
            return this;
        }

        public Builder setPublicIPPrefixes(@Nullable List<ResourceReferenceArgs> publicIPPrefixes) {
            this.publicIPPrefixes = Input.ofNullable(publicIPPrefixes);
            return this;
        }

        public ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs build() {
            return new ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs(publicIPPrefixes);
        }
    }
}
