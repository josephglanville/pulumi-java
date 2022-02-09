// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.BackendAddressPoolArgs;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.FrontendIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.InboundNatPoolArgs;
import io.pulumi.azurenative.network.inputs.InboundNatRuleArgs;
import io.pulumi.azurenative.network.inputs.LoadBalancerSkuArgs;
import io.pulumi.azurenative.network.inputs.LoadBalancingRuleArgs;
import io.pulumi.azurenative.network.inputs.OutboundRuleArgs;
import io.pulumi.azurenative.network.inputs.ProbeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    @InputImport(name="backendAddressPools")
    private final @Nullable Input<List<BackendAddressPoolArgs>> backendAddressPools;

    public Input<List<BackendAddressPoolArgs>> getBackendAddressPools() {
        return this.backendAddressPools == null ? Input.empty() : this.backendAddressPools;
    }

    @InputImport(name="extendedLocation")
    private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    @InputImport(name="frontendIPConfigurations")
    private final @Nullable Input<List<FrontendIPConfigurationArgs>> frontendIPConfigurations;

    public Input<List<FrontendIPConfigurationArgs>> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? Input.empty() : this.frontendIPConfigurations;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="inboundNatPools")
    private final @Nullable Input<List<InboundNatPoolArgs>> inboundNatPools;

    public Input<List<InboundNatPoolArgs>> getInboundNatPools() {
        return this.inboundNatPools == null ? Input.empty() : this.inboundNatPools;
    }

    @InputImport(name="inboundNatRules")
    private final @Nullable Input<List<InboundNatRuleArgs>> inboundNatRules;

    public Input<List<InboundNatRuleArgs>> getInboundNatRules() {
        return this.inboundNatRules == null ? Input.empty() : this.inboundNatRules;
    }

    @InputImport(name="loadBalancerName")
    private final @Nullable Input<String> loadBalancerName;

    public Input<String> getLoadBalancerName() {
        return this.loadBalancerName == null ? Input.empty() : this.loadBalancerName;
    }

    @InputImport(name="loadBalancingRules")
    private final @Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules;

    public Input<List<LoadBalancingRuleArgs>> getLoadBalancingRules() {
        return this.loadBalancingRules == null ? Input.empty() : this.loadBalancingRules;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="outboundRules")
    private final @Nullable Input<List<OutboundRuleArgs>> outboundRules;

    public Input<List<OutboundRuleArgs>> getOutboundRules() {
        return this.outboundRules == null ? Input.empty() : this.outboundRules;
    }

    @InputImport(name="probes")
    private final @Nullable Input<List<ProbeArgs>> probes;

    public Input<List<ProbeArgs>> getProbes() {
        return this.probes == null ? Input.empty() : this.probes;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<LoadBalancerSkuArgs> sku;

    public Input<LoadBalancerSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LoadBalancerArgs(
        @Nullable Input<List<BackendAddressPoolArgs>> backendAddressPools,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<List<FrontendIPConfigurationArgs>> frontendIPConfigurations,
        @Nullable Input<String> id,
        @Nullable Input<List<InboundNatPoolArgs>> inboundNatPools,
        @Nullable Input<List<InboundNatRuleArgs>> inboundNatRules,
        @Nullable Input<String> loadBalancerName,
        @Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules,
        @Nullable Input<String> location,
        @Nullable Input<List<OutboundRuleArgs>> outboundRules,
        @Nullable Input<List<ProbeArgs>> probes,
        Input<String> resourceGroupName,
        @Nullable Input<LoadBalancerSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.backendAddressPools = backendAddressPools;
        this.extendedLocation = extendedLocation;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.id = id;
        this.inboundNatPools = inboundNatPools;
        this.inboundNatRules = inboundNatRules;
        this.loadBalancerName = loadBalancerName;
        this.loadBalancingRules = loadBalancingRules;
        this.location = location;
        this.outboundRules = outboundRules;
        this.probes = probes;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private LoadBalancerArgs() {
        this.backendAddressPools = Input.empty();
        this.extendedLocation = Input.empty();
        this.frontendIPConfigurations = Input.empty();
        this.id = Input.empty();
        this.inboundNatPools = Input.empty();
        this.inboundNatRules = Input.empty();
        this.loadBalancerName = Input.empty();
        this.loadBalancingRules = Input.empty();
        this.location = Input.empty();
        this.outboundRules = Input.empty();
        this.probes = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BackendAddressPoolArgs>> backendAddressPools;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<List<FrontendIPConfigurationArgs>> frontendIPConfigurations;
        private @Nullable Input<String> id;
        private @Nullable Input<List<InboundNatPoolArgs>> inboundNatPools;
        private @Nullable Input<List<InboundNatRuleArgs>> inboundNatRules;
        private @Nullable Input<String> loadBalancerName;
        private @Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules;
        private @Nullable Input<String> location;
        private @Nullable Input<List<OutboundRuleArgs>> outboundRules;
        private @Nullable Input<List<ProbeArgs>> probes;
        private Input<String> resourceGroupName;
        private @Nullable Input<LoadBalancerSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.id = defaults.id;
    	      this.inboundNatPools = defaults.inboundNatPools;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.location = defaults.location;
    	      this.outboundRules = defaults.outboundRules;
    	      this.probes = defaults.probes;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setBackendAddressPools(@Nullable Input<List<BackendAddressPoolArgs>> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder setBackendAddressPools(@Nullable List<BackendAddressPoolArgs> backendAddressPools) {
            this.backendAddressPools = Input.ofNullable(backendAddressPools);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder setFrontendIPConfigurations(@Nullable Input<List<FrontendIPConfigurationArgs>> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder setFrontendIPConfigurations(@Nullable List<FrontendIPConfigurationArgs> frontendIPConfigurations) {
            this.frontendIPConfigurations = Input.ofNullable(frontendIPConfigurations);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setInboundNatPools(@Nullable Input<List<InboundNatPoolArgs>> inboundNatPools) {
            this.inboundNatPools = inboundNatPools;
            return this;
        }

        public Builder setInboundNatPools(@Nullable List<InboundNatPoolArgs> inboundNatPools) {
            this.inboundNatPools = Input.ofNullable(inboundNatPools);
            return this;
        }

        public Builder setInboundNatRules(@Nullable Input<List<InboundNatRuleArgs>> inboundNatRules) {
            this.inboundNatRules = inboundNatRules;
            return this;
        }

        public Builder setInboundNatRules(@Nullable List<InboundNatRuleArgs> inboundNatRules) {
            this.inboundNatRules = Input.ofNullable(inboundNatRules);
            return this;
        }

        public Builder setLoadBalancerName(@Nullable Input<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder setLoadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Input.ofNullable(loadBalancerName);
            return this;
        }

        public Builder setLoadBalancingRules(@Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules) {
            this.loadBalancingRules = loadBalancingRules;
            return this;
        }

        public Builder setLoadBalancingRules(@Nullable List<LoadBalancingRuleArgs> loadBalancingRules) {
            this.loadBalancingRules = Input.ofNullable(loadBalancingRules);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setOutboundRules(@Nullable Input<List<OutboundRuleArgs>> outboundRules) {
            this.outboundRules = outboundRules;
            return this;
        }

        public Builder setOutboundRules(@Nullable List<OutboundRuleArgs> outboundRules) {
            this.outboundRules = Input.ofNullable(outboundRules);
            return this;
        }

        public Builder setProbes(@Nullable Input<List<ProbeArgs>> probes) {
            this.probes = probes;
            return this;
        }

        public Builder setProbes(@Nullable List<ProbeArgs> probes) {
            this.probes = Input.ofNullable(probes);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<LoadBalancerSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable LoadBalancerSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public LoadBalancerArgs build() {
            return new LoadBalancerArgs(backendAddressPools, extendedLocation, frontendIPConfigurations, id, inboundNatPools, inboundNatRules, loadBalancerName, loadBalancingRules, location, outboundRules, probes, resourceGroupName, sku, tags);
        }
    }
}
