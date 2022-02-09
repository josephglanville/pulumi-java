// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.IPVersions;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachinePublicIPAddressConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineNetworkInterfaceIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineNetworkInterfaceIPConfigurationArgs Empty = new VirtualMachineNetworkInterfaceIPConfigurationArgs();

    @InputImport(name="applicationGatewayBackendAddressPools")
    private final @Nullable Input<List<SubResourceArgs>> applicationGatewayBackendAddressPools;

    public Input<List<SubResourceArgs>> getApplicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? Input.empty() : this.applicationGatewayBackendAddressPools;
    }

    @InputImport(name="applicationSecurityGroups")
    private final @Nullable Input<List<SubResourceArgs>> applicationSecurityGroups;

    public Input<List<SubResourceArgs>> getApplicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? Input.empty() : this.applicationSecurityGroups;
    }

    @InputImport(name="loadBalancerBackendAddressPools")
    private final @Nullable Input<List<SubResourceArgs>> loadBalancerBackendAddressPools;

    public Input<List<SubResourceArgs>> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? Input.empty() : this.loadBalancerBackendAddressPools;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="primary")
    private final @Nullable Input<Boolean> primary;

    public Input<Boolean> getPrimary() {
        return this.primary == null ? Input.empty() : this.primary;
    }

    @InputImport(name="privateIPAddressVersion")
    private final @Nullable Input<Either<String,IPVersions>> privateIPAddressVersion;

    public Input<Either<String,IPVersions>> getPrivateIPAddressVersion() {
        return this.privateIPAddressVersion == null ? Input.empty() : this.privateIPAddressVersion;
    }

    @InputImport(name="publicIPAddressConfiguration")
    private final @Nullable Input<VirtualMachinePublicIPAddressConfigurationArgs> publicIPAddressConfiguration;

    public Input<VirtualMachinePublicIPAddressConfigurationArgs> getPublicIPAddressConfiguration() {
        return this.publicIPAddressConfiguration == null ? Input.empty() : this.publicIPAddressConfiguration;
    }

    @InputImport(name="subnet")
    private final @Nullable Input<SubResourceArgs> subnet;

    public Input<SubResourceArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public VirtualMachineNetworkInterfaceIPConfigurationArgs(
        @Nullable Input<List<SubResourceArgs>> applicationGatewayBackendAddressPools,
        @Nullable Input<List<SubResourceArgs>> applicationSecurityGroups,
        @Nullable Input<List<SubResourceArgs>> loadBalancerBackendAddressPools,
        Input<String> name,
        @Nullable Input<Boolean> primary,
        @Nullable Input<Either<String,IPVersions>> privateIPAddressVersion,
        @Nullable Input<VirtualMachinePublicIPAddressConfigurationArgs> publicIPAddressConfiguration,
        @Nullable Input<SubResourceArgs> subnet) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.primary = primary;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnet = subnet;
    }

    private VirtualMachineNetworkInterfaceIPConfigurationArgs() {
        this.applicationGatewayBackendAddressPools = Input.empty();
        this.applicationSecurityGroups = Input.empty();
        this.loadBalancerBackendAddressPools = Input.empty();
        this.name = Input.empty();
        this.primary = Input.empty();
        this.privateIPAddressVersion = Input.empty();
        this.publicIPAddressConfiguration = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineNetworkInterfaceIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SubResourceArgs>> applicationGatewayBackendAddressPools;
        private @Nullable Input<List<SubResourceArgs>> applicationSecurityGroups;
        private @Nullable Input<List<SubResourceArgs>> loadBalancerBackendAddressPools;
        private Input<String> name;
        private @Nullable Input<Boolean> primary;
        private @Nullable Input<Either<String,IPVersions>> privateIPAddressVersion;
        private @Nullable Input<VirtualMachinePublicIPAddressConfigurationArgs> publicIPAddressConfiguration;
        private @Nullable Input<SubResourceArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineNetworkInterfaceIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayBackendAddressPools = defaults.applicationGatewayBackendAddressPools;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnet = defaults.subnet;
        }

        public Builder setApplicationGatewayBackendAddressPools(@Nullable Input<List<SubResourceArgs>> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }

        public Builder setApplicationGatewayBackendAddressPools(@Nullable List<SubResourceArgs> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = Input.ofNullable(applicationGatewayBackendAddressPools);
            return this;
        }

        public Builder setApplicationSecurityGroups(@Nullable Input<List<SubResourceArgs>> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }

        public Builder setApplicationSecurityGroups(@Nullable List<SubResourceArgs> applicationSecurityGroups) {
            this.applicationSecurityGroups = Input.ofNullable(applicationSecurityGroups);
            return this;
        }

        public Builder setLoadBalancerBackendAddressPools(@Nullable Input<List<SubResourceArgs>> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }

        public Builder setLoadBalancerBackendAddressPools(@Nullable List<SubResourceArgs> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = Input.ofNullable(loadBalancerBackendAddressPools);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPrimary(@Nullable Input<Boolean> primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = Input.ofNullable(primary);
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable Input<Either<String,IPVersions>> privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable Either<String,IPVersions> privateIPAddressVersion) {
            this.privateIPAddressVersion = Input.ofNullable(privateIPAddressVersion);
            return this;
        }

        public Builder setPublicIPAddressConfiguration(@Nullable Input<VirtualMachinePublicIPAddressConfigurationArgs> publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }

        public Builder setPublicIPAddressConfiguration(@Nullable VirtualMachinePublicIPAddressConfigurationArgs publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = Input.ofNullable(publicIPAddressConfiguration);
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

        public VirtualMachineNetworkInterfaceIPConfigurationArgs build() {
            return new VirtualMachineNetworkInterfaceIPConfigurationArgs(applicationGatewayBackendAddressPools, applicationSecurityGroups, loadBalancerBackendAddressPools, name, primary, privateIPAddressVersion, publicIPAddressConfiguration, subnet);
        }
    }
}
