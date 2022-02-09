// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterLoadBalancerProfileResponseOutboundIPs;
import io.pulumi.azurenative.containerservice.outputs.ResourceReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterLoadBalancerProfileResponse {
    private final @Nullable Integer allocatedOutboundPorts;
    private final @Nullable List<ResourceReferenceResponse> effectiveOutboundIPs;
    private final @Nullable Integer idleTimeoutInMinutes;
    private final @Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs;
    private final @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes;
    private final @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs;

    @OutputCustomType.Constructor({"allocatedOutboundPorts","effectiveOutboundIPs","idleTimeoutInMinutes","managedOutboundIPs","outboundIPPrefixes","outboundIPs"})
    private ManagedClusterLoadBalancerProfileResponse(
        @Nullable Integer allocatedOutboundPorts,
        @Nullable List<ResourceReferenceResponse> effectiveOutboundIPs,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs,
        @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes,
        @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.managedOutboundIPs = managedOutboundIPs;
        this.outboundIPPrefixes = outboundIPPrefixes;
        this.outboundIPs = outboundIPs;
    }

    public Optional<Integer> getAllocatedOutboundPorts() {
        return Optional.ofNullable(this.allocatedOutboundPorts);
    }
    public List<ResourceReferenceResponse> getEffectiveOutboundIPs() {
        return this.effectiveOutboundIPs == null ? List.of() : this.effectiveOutboundIPs;
    }
    public Optional<Integer> getIdleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    public Optional<ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs> getManagedOutboundIPs() {
        return Optional.ofNullable(this.managedOutboundIPs);
    }
    public Optional<ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes> getOutboundIPPrefixes() {
        return Optional.ofNullable(this.outboundIPPrefixes);
    }
    public Optional<ManagedClusterLoadBalancerProfileResponseOutboundIPs> getOutboundIPs() {
        return Optional.ofNullable(this.outboundIPs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocatedOutboundPorts;
        private @Nullable List<ResourceReferenceResponse> effectiveOutboundIPs;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs;
        private @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes;
        private @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedOutboundPorts = defaults.allocatedOutboundPorts;
    	      this.effectiveOutboundIPs = defaults.effectiveOutboundIPs;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.managedOutboundIPs = defaults.managedOutboundIPs;
    	      this.outboundIPPrefixes = defaults.outboundIPPrefixes;
    	      this.outboundIPs = defaults.outboundIPs;
        }

        public Builder setAllocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            this.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        public Builder setEffectiveOutboundIPs(@Nullable List<ResourceReferenceResponse> effectiveOutboundIPs) {
            this.effectiveOutboundIPs = effectiveOutboundIPs;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setManagedOutboundIPs(@Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs) {
            this.managedOutboundIPs = managedOutboundIPs;
            return this;
        }

        public Builder setOutboundIPPrefixes(@Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes) {
            this.outboundIPPrefixes = outboundIPPrefixes;
            return this;
        }

        public Builder setOutboundIPs(@Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs) {
            this.outboundIPs = outboundIPs;
            return this;
        }

        public ManagedClusterLoadBalancerProfileResponse build() {
            return new ManagedClusterLoadBalancerProfileResponse(allocatedOutboundPorts, effectiveOutboundIPs, idleTimeoutInMinutes, managedOutboundIPs, outboundIPPrefixes, outboundIPs);
        }
    }
}
