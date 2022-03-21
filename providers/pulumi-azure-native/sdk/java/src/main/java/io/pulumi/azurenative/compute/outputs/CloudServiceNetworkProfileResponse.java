// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LoadBalancerConfigurationResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudServiceNetworkProfileResponse {
    /**
     * List of Load balancer configurations. Cloud service can have up to two load balancer configurations, corresponding to a Public Load Balancer and an Internal Load Balancer.
     * 
     */
    private final @Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations;
    /**
     * The id reference of the cloud service containing the target IP with which the subject cloud service can perform a swap. This property cannot be updated once it is set. The swappable cloud service referred by this id must be present otherwise an error will be thrown.
     * 
     */
    private final @Nullable SubResourceResponse swappableCloudService;

    @CustomType.Constructor
    private CloudServiceNetworkProfileResponse(
        @CustomType.Parameter("loadBalancerConfigurations") @Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations,
        @CustomType.Parameter("swappableCloudService") @Nullable SubResourceResponse swappableCloudService) {
        this.loadBalancerConfigurations = loadBalancerConfigurations;
        this.swappableCloudService = swappableCloudService;
    }

    /**
     * List of Load balancer configurations. Cloud service can have up to two load balancer configurations, corresponding to a Public Load Balancer and an Internal Load Balancer.
     * 
    */
    public List<LoadBalancerConfigurationResponse> getLoadBalancerConfigurations() {
        return this.loadBalancerConfigurations == null ? List.of() : this.loadBalancerConfigurations;
    }
    /**
     * The id reference of the cloud service containing the target IP with which the subject cloud service can perform a swap. This property cannot be updated once it is set. The swappable cloud service referred by this id must be present otherwise an error will be thrown.
     * 
    */
    public Optional<SubResourceResponse> getSwappableCloudService() {
        return Optional.ofNullable(this.swappableCloudService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations;
        private @Nullable SubResourceResponse swappableCloudService;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerConfigurations = defaults.loadBalancerConfigurations;
    	      this.swappableCloudService = defaults.swappableCloudService;
        }

        public Builder loadBalancerConfigurations(@Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations) {
            this.loadBalancerConfigurations = loadBalancerConfigurations;
            return this;
        }
        public Builder loadBalancerConfigurations(LoadBalancerConfigurationResponse... loadBalancerConfigurations) {
            return loadBalancerConfigurations(List.of(loadBalancerConfigurations));
        }
        public Builder swappableCloudService(@Nullable SubResourceResponse swappableCloudService) {
            this.swappableCloudService = swappableCloudService;
            return this;
        }        public CloudServiceNetworkProfileResponse build() {
            return new CloudServiceNetworkProfileResponse(loadBalancerConfigurations, swappableCloudService);
        }
    }
}
