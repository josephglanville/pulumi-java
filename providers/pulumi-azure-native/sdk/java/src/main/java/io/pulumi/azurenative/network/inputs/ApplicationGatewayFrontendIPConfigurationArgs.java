// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.IPAllocationMethod;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Frontend IP configuration of an application gateway.
 * 
 */
public final class ApplicationGatewayFrontendIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFrontendIPConfigurationArgs Empty = new ApplicationGatewayFrontendIPConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Name of the frontend IP configuration that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * PrivateIPAddress of the network interface IP Configuration.
     * 
     */
    @Import(name="privateIPAddress")
      private final @Nullable Output<String> privateIPAddress;

    public Output<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Codegen.empty() : this.privateIPAddress;
    }

    /**
     * The private IP address allocation method.
     * 
     */
    @Import(name="privateIPAllocationMethod")
      private final @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod;

    public Output<Either<String,IPAllocationMethod>> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod == null ? Codegen.empty() : this.privateIPAllocationMethod;
    }

    /**
     * Reference to the application gateway private link configuration.
     * 
     */
    @Import(name="privateLinkConfiguration")
      private final @Nullable Output<SubResourceArgs> privateLinkConfiguration;

    public Output<SubResourceArgs> getPrivateLinkConfiguration() {
        return this.privateLinkConfiguration == null ? Codegen.empty() : this.privateLinkConfiguration;
    }

    /**
     * Reference to the PublicIP resource.
     * 
     */
    @Import(name="publicIPAddress")
      private final @Nullable Output<SubResourceArgs> publicIPAddress;

    public Output<SubResourceArgs> getPublicIPAddress() {
        return this.publicIPAddress == null ? Codegen.empty() : this.publicIPAddress;
    }

    /**
     * Reference to the subnet resource.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<SubResourceArgs> subnet;

    public Output<SubResourceArgs> getSubnet() {
        return this.subnet == null ? Codegen.empty() : this.subnet;
    }

    public ApplicationGatewayFrontendIPConfigurationArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> privateIPAddress,
        @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod,
        @Nullable Output<SubResourceArgs> privateLinkConfiguration,
        @Nullable Output<SubResourceArgs> publicIPAddress,
        @Nullable Output<SubResourceArgs> subnet) {
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.privateLinkConfiguration = privateLinkConfiguration;
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
    }

    private ApplicationGatewayFrontendIPConfigurationArgs() {
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.privateIPAddress = Codegen.empty();
        this.privateIPAllocationMethod = Codegen.empty();
        this.privateLinkConfiguration = Codegen.empty();
        this.publicIPAddress = Codegen.empty();
        this.subnet = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFrontendIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> privateIPAddress;
        private @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod;
        private @Nullable Output<SubResourceArgs> privateLinkConfiguration;
        private @Nullable Output<SubResourceArgs> publicIPAddress;
        private @Nullable Output<SubResourceArgs> subnet;

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

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }
        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Codegen.ofNullable(privateIPAddress);
            return this;
        }
        public Builder privateIPAllocationMethod(@Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }
        public Builder privateIPAllocationMethod(@Nullable Either<String,IPAllocationMethod> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = Codegen.ofNullable(privateIPAllocationMethod);
            return this;
        }
        public Builder privateLinkConfiguration(@Nullable Output<SubResourceArgs> privateLinkConfiguration) {
            this.privateLinkConfiguration = privateLinkConfiguration;
            return this;
        }
        public Builder privateLinkConfiguration(@Nullable SubResourceArgs privateLinkConfiguration) {
            this.privateLinkConfiguration = Codegen.ofNullable(privateLinkConfiguration);
            return this;
        }
        public Builder publicIPAddress(@Nullable Output<SubResourceArgs> publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }
        public Builder publicIPAddress(@Nullable SubResourceArgs publicIPAddress) {
            this.publicIPAddress = Codegen.ofNullable(publicIPAddress);
            return this;
        }
        public Builder subnet(@Nullable Output<SubResourceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable SubResourceArgs subnet) {
            this.subnet = Codegen.ofNullable(subnet);
            return this;
        }        public ApplicationGatewayFrontendIPConfigurationArgs build() {
            return new ApplicationGatewayFrontendIPConfigurationArgs(id, name, privateIPAddress, privateIPAllocationMethod, privateLinkConfiguration, publicIPAddress, subnet);
        }
    }
}
