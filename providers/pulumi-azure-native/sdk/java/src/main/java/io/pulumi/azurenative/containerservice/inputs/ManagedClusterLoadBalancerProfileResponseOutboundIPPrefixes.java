// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Desired outbound IP Prefix resources for the cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes Empty = new ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes();

    /**
     * A list of public IP prefix resources.
     * 
     */
    @InputImport(name="publicIPPrefixes")
      private final @Nullable List<ResourceReferenceResponse> publicIPPrefixes;

    public List<ResourceReferenceResponse> getPublicIPPrefixes() {
        return this.publicIPPrefixes == null ? List.of() : this.publicIPPrefixes;
    }

    public ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes(@Nullable List<ResourceReferenceResponse> publicIPPrefixes) {
        this.publicIPPrefixes = publicIPPrefixes;
    }

    private ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes() {
        this.publicIPPrefixes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceReferenceResponse> publicIPPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPPrefixes = defaults.publicIPPrefixes;
        }

        public Builder setPublicIPPrefixes(@Nullable List<ResourceReferenceResponse> publicIPPrefixes) {
            this.publicIPPrefixes = publicIPPrefixes;
            return this;
        }
        public ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes build() {
            return new ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes(publicIPPrefixes);
        }
    }
}
