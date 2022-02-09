// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerFrontendIPConfigurationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerFrontendIPConfigurationPropertiesResponse Empty = new LoadBalancerFrontendIPConfigurationPropertiesResponse();

    @InputImport(name="privateIPAddress")
    private final @Nullable String privateIPAddress;

    public Optional<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddress);
    }

    @InputImport(name="publicIPAddress")
    private final @Nullable SubResourceResponse publicIPAddress;

    public Optional<SubResourceResponse> getPublicIPAddress() {
        return this.publicIPAddress == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddress);
    }

    @InputImport(name="subnet")
    private final @Nullable SubResourceResponse subnet;

    public Optional<SubResourceResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public LoadBalancerFrontendIPConfigurationPropertiesResponse(
        @Nullable String privateIPAddress,
        @Nullable SubResourceResponse publicIPAddress,
        @Nullable SubResourceResponse subnet) {
        this.privateIPAddress = privateIPAddress;
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
    }

    private LoadBalancerFrontendIPConfigurationPropertiesResponse() {
        this.privateIPAddress = null;
        this.publicIPAddress = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerFrontendIPConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String privateIPAddress;
        private @Nullable SubResourceResponse publicIPAddress;
        private @Nullable SubResourceResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerFrontendIPConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPublicIPAddress(@Nullable SubResourceResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setSubnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public LoadBalancerFrontendIPConfigurationPropertiesResponse build() {
            return new LoadBalancerFrontendIPConfigurationPropertiesResponse(privateIPAddress, publicIPAddress, subnet);
        }
    }
}
