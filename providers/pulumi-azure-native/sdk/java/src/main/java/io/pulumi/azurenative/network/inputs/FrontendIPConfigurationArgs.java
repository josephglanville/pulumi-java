// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.IPAllocationMethod;
import io.pulumi.azurenative.network.enums.IPVersion;
import io.pulumi.azurenative.network.inputs.PublicIPAddressArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.SubnetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Frontend IP address of the load balancer.
 * 
 */
public final class FrontendIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontendIPConfigurationArgs Empty = new FrontendIPConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIPAddress")
      private final @Nullable Output<String> privateIPAddress;

    public Output<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Output.empty() : this.privateIPAddress;
    }

    /**
     * Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * 
     */
    @Import(name="privateIPAddressVersion")
      private final @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion;

    public Output<Either<String,IPVersion>> getPrivateIPAddressVersion() {
        return this.privateIPAddressVersion == null ? Output.empty() : this.privateIPAddressVersion;
    }

    /**
     * The Private IP allocation method.
     * 
     */
    @Import(name="privateIPAllocationMethod")
      private final @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod;

    public Output<Either<String,IPAllocationMethod>> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod == null ? Output.empty() : this.privateIPAllocationMethod;
    }

    /**
     * The reference to the Public IP resource.
     * 
     */
    @Import(name="publicIPAddress")
      private final @Nullable Output<PublicIPAddressArgs> publicIPAddress;

    public Output<PublicIPAddressArgs> getPublicIPAddress() {
        return this.publicIPAddress == null ? Output.empty() : this.publicIPAddress;
    }

    /**
     * The reference to the Public IP Prefix resource.
     * 
     */
    @Import(name="publicIPPrefix")
      private final @Nullable Output<SubResourceArgs> publicIPPrefix;

    public Output<SubResourceArgs> getPublicIPPrefix() {
        return this.publicIPPrefix == null ? Output.empty() : this.publicIPPrefix;
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<SubnetArgs> subnet;

    public Output<SubnetArgs> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public FrontendIPConfigurationArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> privateIPAddress,
        @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion,
        @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod,
        @Nullable Output<PublicIPAddressArgs> publicIPAddress,
        @Nullable Output<SubResourceArgs> publicIPPrefix,
        @Nullable Output<SubnetArgs> subnet,
        @Nullable Output<List<String>> zones) {
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.publicIPAddress = publicIPAddress;
        this.publicIPPrefix = publicIPPrefix;
        this.subnet = subnet;
        this.zones = zones;
    }

    private FrontendIPConfigurationArgs() {
        this.id = Output.empty();
        this.name = Output.empty();
        this.privateIPAddress = Output.empty();
        this.privateIPAddressVersion = Output.empty();
        this.privateIPAllocationMethod = Output.empty();
        this.publicIPAddress = Output.empty();
        this.publicIPPrefix = Output.empty();
        this.subnet = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontendIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> privateIPAddress;
        private @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion;
        private @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod;
        private @Nullable Output<PublicIPAddressArgs> publicIPAddress;
        private @Nullable Output<SubResourceArgs> publicIPPrefix;
        private @Nullable Output<SubnetArgs> subnet;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontendIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.subnet = defaults.subnet;
    	      this.zones = defaults.zones;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }
        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Output.ofNullable(privateIPAddress);
            return this;
        }
        public Builder privateIPAddressVersion(@Nullable Output<Either<String,IPVersion>> privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }
        public Builder privateIPAddressVersion(@Nullable Either<String,IPVersion> privateIPAddressVersion) {
            this.privateIPAddressVersion = Output.ofNullable(privateIPAddressVersion);
            return this;
        }
        public Builder privateIPAllocationMethod(@Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }
        public Builder privateIPAllocationMethod(@Nullable Either<String,IPAllocationMethod> privateIPAllocationMethod) {
            this.privateIPAllocationMethod = Output.ofNullable(privateIPAllocationMethod);
            return this;
        }
        public Builder publicIPAddress(@Nullable Output<PublicIPAddressArgs> publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }
        public Builder publicIPAddress(@Nullable PublicIPAddressArgs publicIPAddress) {
            this.publicIPAddress = Output.ofNullable(publicIPAddress);
            return this;
        }
        public Builder publicIPPrefix(@Nullable Output<SubResourceArgs> publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }
        public Builder publicIPPrefix(@Nullable SubResourceArgs publicIPPrefix) {
            this.publicIPPrefix = Output.ofNullable(publicIPPrefix);
            return this;
        }
        public Builder subnet(@Nullable Output<SubnetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable SubnetArgs subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public FrontendIPConfigurationArgs build() {
            return new FrontendIPConfigurationArgs(id, name, privateIPAddress, privateIPAddressVersion, privateIPAllocationMethod, publicIPAddress, publicIPPrefix, subnet, zones);
        }
    }
}
