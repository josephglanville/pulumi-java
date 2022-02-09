// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.IPAllocationMethod;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationGatewayFrontendIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFrontendIPConfigurationArgs Empty = new ApplicationGatewayFrontendIPConfigurationArgs();

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="privateIPAddress")
    private final @Nullable Input<String> privateIPAddress;

    public Input<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Input.empty() : this.privateIPAddress;
    }

    @InputImport(name="privateIPAllocationMethod")
    private final @Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod;

    public Input<Either<String,IPAllocationMethod>> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod == null ? Input.empty() : this.privateIPAllocationMethod;
    }

    @InputImport(name="privateLinkConfiguration")
    private final @Nullable Input<SubResourceArgs> privateLinkConfiguration;

    public Input<SubResourceArgs> getPrivateLinkConfiguration() {
        return this.privateLinkConfiguration == null ? Input.empty() : this.privateLinkConfiguration;
    }

    @InputImport(name="publicIPAddress")
    private final @Nullable Input<SubResourceArgs> publicIPAddress;

    public Input<SubResourceArgs> getPublicIPAddress() {
        return this.publicIPAddress == null ? Input.empty() : this.publicIPAddress;
    }

    @InputImport(name="subnet")
    private final @Nullable Input<SubResourceArgs> subnet;

    public Input<SubResourceArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public ApplicationGatewayFrontendIPConfigurationArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<String> privateIPAddress,
        @Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod,
        @Nullable Input<SubResourceArgs> privateLinkConfiguration,
        @Nullable Input<SubResourceArgs> publicIPAddress,
        @Nullable Input<SubResourceArgs> subnet) {
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.privateLinkConfiguration = privateLinkConfiguration;
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
    }

    private ApplicationGatewayFrontendIPConfigurationArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.privateIPAddress = Input.empty();
        this.privateIPAllocationMethod = Input.empty();
        this.privateLinkConfiguration = Input.empty();
        this.publicIPAddress = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFrontendIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<String> privateIPAddress;
        private @Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod;
        private @Nullable Input<SubResourceArgs> privateLinkConfiguration;
        private @Nullable Input<SubResourceArgs> publicIPAddress;
        private @Nullable Input<SubResourceArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFrontendIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.privateLinkConfiguration = defaults.privateLinkConfiguration;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable Input<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Input.ofNullable(privateIPAddress);
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable Input<Either<String,IPAllocationMethod>> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable Either<String,IPAllocationMethod> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = Input.ofNullable(privateIPAllocationMethod);
            return this;
        }

        public Builder setPrivateLinkConfiguration(@Nullable Input<SubResourceArgs> privateLinkConfiguration) {
            this.privateLinkConfiguration = privateLinkConfiguration;
            return this;
        }

        public Builder setPrivateLinkConfiguration(@Nullable SubResourceArgs privateLinkConfiguration) {
            this.privateLinkConfiguration = Input.ofNullable(privateLinkConfiguration);
            return this;
        }

        public Builder setPublicIPAddress(@Nullable Input<SubResourceArgs> publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setPublicIPAddress(@Nullable SubResourceArgs publicIPAddress) {
            this.publicIPAddress = Input.ofNullable(publicIPAddress);
            return this;
        }

        public Builder setSubnet(@Nullable Input<SubResourceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable SubResourceArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public ApplicationGatewayFrontendIPConfigurationArgs build() {
            return new ApplicationGatewayFrontendIPConfigurationArgs(id, name, privateIPAddress, privateIPAllocationMethod, privateLinkConfiguration, publicIPAddress, subnet);
        }
    }
}
