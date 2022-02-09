// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayFrontendIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayFrontendIPConfigurationResponse Empty = new ApplicationGatewayFrontendIPConfigurationResponse();

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="privateIPAddress")
    private final @Nullable String privateIPAddress;

    public Optional<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddress);
    }

    @InputImport(name="privateIPAllocationMethod")
    private final @Nullable String privateIPAllocationMethod;

    public Optional<String> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod == null ? Optional.empty() : Optional.ofNullable(this.privateIPAllocationMethod);
    }

    @InputImport(name="privateLinkConfiguration")
    private final @Nullable SubResourceResponse privateLinkConfiguration;

    public Optional<SubResourceResponse> getPrivateLinkConfiguration() {
        return this.privateLinkConfiguration == null ? Optional.empty() : Optional.ofNullable(this.privateLinkConfiguration);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
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

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicationGatewayFrontendIPConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAllocationMethod,
        @Nullable SubResourceResponse privateLinkConfiguration,
        String provisioningState,
        @Nullable SubResourceResponse publicIPAddress,
        @Nullable SubResourceResponse subnet,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.privateLinkConfiguration = privateLinkConfiguration;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewayFrontendIPConfigurationResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.privateIPAddress = null;
        this.privateIPAllocationMethod = null;
        this.privateLinkConfiguration = null;
        this.provisioningState = null;
        this.publicIPAddress = null;
        this.subnet = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAllocationMethod;
        private @Nullable SubResourceResponse privateLinkConfiguration;
        private String provisioningState;
        private @Nullable SubResourceResponse publicIPAddress;
        private @Nullable SubResourceResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFrontendIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.privateLinkConfiguration = defaults.privateLinkConfiguration;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setPrivateLinkConfiguration(@Nullable SubResourceResponse privateLinkConfiguration) {
            this.privateLinkConfiguration = privateLinkConfiguration;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ApplicationGatewayFrontendIPConfigurationResponse build() {
            return new ApplicationGatewayFrontendIPConfigurationResponse(etag, id, name, privateIPAddress, privateIPAllocationMethod, privateLinkConfiguration, provisioningState, publicIPAddress, subnet, type);
        }
    }
}
