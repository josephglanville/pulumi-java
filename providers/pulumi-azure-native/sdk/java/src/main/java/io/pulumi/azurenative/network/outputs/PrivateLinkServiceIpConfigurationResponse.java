// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceIpConfigurationResponse {
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable Boolean primary;
    private final @Nullable String privateIPAddress;
    private final @Nullable String privateIPAddressVersion;
    private final @Nullable String privateIPAllocationMethod;
    private final String provisioningState;
    private final @Nullable SubnetResponse subnet;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","primary","privateIPAddress","privateIPAddressVersion","privateIPAllocationMethod","provisioningState","subnet","type"})
    private PrivateLinkServiceIpConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Boolean primary,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAddressVersion,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable SubnetResponse subnet,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.primary = primary;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type);
    }

    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    public Optional<String> getPrivateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceIpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAddressVersion;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable SubnetResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceIpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.provisioningState = defaults.provisioningState;
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

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSubnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public PrivateLinkServiceIpConfigurationResponse build() {
            return new PrivateLinkServiceIpConfigurationResponse(etag, id, name, primary, privateIPAddress, privateIPAddressVersion, privateIPAllocationMethod, provisioningState, subnet, type);
        }
    }
}
