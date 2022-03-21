// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileOutboundIPsArgs;
import io.pulumi.azurenative.containerservice.inputs.ResourceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Profile of the managed cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterLoadBalancerProfileArgs Empty = new ManagedClusterLoadBalancerProfileArgs();

    /**
     * Desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     * 
     */
    @Import(name="allocatedOutboundPorts")
      private final @Nullable Output<Integer> allocatedOutboundPorts;

    public Output<Integer> getAllocatedOutboundPorts() {
        return this.allocatedOutboundPorts == null ? Output.empty() : this.allocatedOutboundPorts;
    }

    /**
     * The effective outbound IP resources of the cluster load balancer.
     * 
     */
    @Import(name="effectiveOutboundIPs")
      private final @Nullable Output<List<ResourceReferenceArgs>> effectiveOutboundIPs;

    public Output<List<ResourceReferenceArgs>> getEffectiveOutboundIPs() {
        return this.effectiveOutboundIPs == null ? Output.empty() : this.effectiveOutboundIPs;
    }

    /**
     * Desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Output<Integer> idleTimeoutInMinutes;

    public Output<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Output.empty() : this.idleTimeoutInMinutes;
    }

    /**
     * Desired managed outbound IPs for the cluster load balancer.
     * 
     */
    @Import(name="managedOutboundIPs")
      private final @Nullable Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs> managedOutboundIPs;

    public Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs> getManagedOutboundIPs() {
        return this.managedOutboundIPs == null ? Output.empty() : this.managedOutboundIPs;
    }

    /**
     * Desired outbound IP Prefix resources for the cluster load balancer.
     * 
     */
    @Import(name="outboundIPPrefixes")
      private final @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs> outboundIPPrefixes;

    public Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs> getOutboundIPPrefixes() {
        return this.outboundIPPrefixes == null ? Output.empty() : this.outboundIPPrefixes;
    }

    /**
     * Desired outbound IP resources for the cluster load balancer.
     * 
     */
    @Import(name="outboundIPs")
      private final @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs> outboundIPs;

    public Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs> getOutboundIPs() {
        return this.outboundIPs == null ? Output.empty() : this.outboundIPs;
    }

    public ManagedClusterLoadBalancerProfileArgs(
        @Nullable Output<Integer> allocatedOutboundPorts,
        @Nullable Output<List<ResourceReferenceArgs>> effectiveOutboundIPs,
        @Nullable Output<Integer> idleTimeoutInMinutes,
        @Nullable Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs> managedOutboundIPs,
        @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs> outboundIPPrefixes,
        @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs> outboundIPs) {
        this.allocatedOutboundPorts = allocatedOutboundPorts == null ? Output.ofNullable(0) : allocatedOutboundPorts;
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes == null ? Output.ofNullable(30) : idleTimeoutInMinutes;
        this.managedOutboundIPs = managedOutboundIPs;
        this.outboundIPPrefixes = outboundIPPrefixes;
        this.outboundIPs = outboundIPs;
    }

    private ManagedClusterLoadBalancerProfileArgs() {
        this.allocatedOutboundPorts = Output.empty();
        this.effectiveOutboundIPs = Output.empty();
        this.idleTimeoutInMinutes = Output.empty();
        this.managedOutboundIPs = Output.empty();
        this.outboundIPPrefixes = Output.empty();
        this.outboundIPs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> allocatedOutboundPorts;
        private @Nullable Output<List<ResourceReferenceArgs>> effectiveOutboundIPs;
        private @Nullable Output<Integer> idleTimeoutInMinutes;
        private @Nullable Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs> managedOutboundIPs;
        private @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs> outboundIPPrefixes;
        private @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs> outboundIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedOutboundPorts = defaults.allocatedOutboundPorts;
    	      this.effectiveOutboundIPs = defaults.effectiveOutboundIPs;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.managedOutboundIPs = defaults.managedOutboundIPs;
    	      this.outboundIPPrefixes = defaults.outboundIPPrefixes;
    	      this.outboundIPs = defaults.outboundIPs;
        }

        public Builder allocatedOutboundPorts(@Nullable Output<Integer> allocatedOutboundPorts) {
            this.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }
        public Builder allocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            this.allocatedOutboundPorts = Output.ofNullable(allocatedOutboundPorts);
            return this;
        }
        public Builder effectiveOutboundIPs(@Nullable Output<List<ResourceReferenceArgs>> effectiveOutboundIPs) {
            this.effectiveOutboundIPs = effectiveOutboundIPs;
            return this;
        }
        public Builder effectiveOutboundIPs(@Nullable List<ResourceReferenceArgs> effectiveOutboundIPs) {
            this.effectiveOutboundIPs = Output.ofNullable(effectiveOutboundIPs);
            return this;
        }
        public Builder effectiveOutboundIPs(ResourceReferenceArgs... effectiveOutboundIPs) {
            return effectiveOutboundIPs(List.of(effectiveOutboundIPs));
        }
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Output.ofNullable(idleTimeoutInMinutes);
            return this;
        }
        public Builder managedOutboundIPs(@Nullable Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs> managedOutboundIPs) {
            this.managedOutboundIPs = managedOutboundIPs;
            return this;
        }
        public Builder managedOutboundIPs(@Nullable ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs managedOutboundIPs) {
            this.managedOutboundIPs = Output.ofNullable(managedOutboundIPs);
            return this;
        }
        public Builder outboundIPPrefixes(@Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs> outboundIPPrefixes) {
            this.outboundIPPrefixes = outboundIPPrefixes;
            return this;
        }
        public Builder outboundIPPrefixes(@Nullable ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs outboundIPPrefixes) {
            this.outboundIPPrefixes = Output.ofNullable(outboundIPPrefixes);
            return this;
        }
        public Builder outboundIPs(@Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs> outboundIPs) {
            this.outboundIPs = outboundIPs;
            return this;
        }
        public Builder outboundIPs(@Nullable ManagedClusterLoadBalancerProfileOutboundIPsArgs outboundIPs) {
            this.outboundIPs = Output.ofNullable(outboundIPs);
            return this;
        }        public ManagedClusterLoadBalancerProfileArgs build() {
            return new ManagedClusterLoadBalancerProfileArgs(allocatedOutboundPorts, effectiveOutboundIPs, idleTimeoutInMinutes, managedOutboundIPs, outboundIPPrefixes, outboundIPs);
        }
    }
}
