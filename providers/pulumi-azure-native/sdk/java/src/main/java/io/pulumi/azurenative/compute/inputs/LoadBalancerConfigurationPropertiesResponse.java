// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LoadBalancerFrontendIPConfigurationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class LoadBalancerConfigurationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerConfigurationPropertiesResponse Empty = new LoadBalancerConfigurationPropertiesResponse();

    @InputImport(name="frontendIPConfigurations", required=true)
    private final List<LoadBalancerFrontendIPConfigurationResponse> frontendIPConfigurations;

    public List<LoadBalancerFrontendIPConfigurationResponse> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    public LoadBalancerConfigurationPropertiesResponse(List<LoadBalancerFrontendIPConfigurationResponse> frontendIPConfigurations) {
        this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations, "expected parameter 'frontendIPConfigurations' to be non-null");
    }

    private LoadBalancerConfigurationPropertiesResponse() {
        this.frontendIPConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LoadBalancerFrontendIPConfigurationResponse> frontendIPConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
        }

        public Builder setFrontendIPConfigurations(List<LoadBalancerFrontendIPConfigurationResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations);
            return this;
        }

        public LoadBalancerConfigurationPropertiesResponse build() {
            return new LoadBalancerConfigurationPropertiesResponse(frontendIPConfigurations);
        }
    }
}
