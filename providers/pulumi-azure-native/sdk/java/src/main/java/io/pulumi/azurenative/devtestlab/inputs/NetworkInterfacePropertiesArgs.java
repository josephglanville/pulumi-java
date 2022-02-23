// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.SharedPublicIpAddressConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a network interface.
 * 
 */
public final class NetworkInterfacePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfacePropertiesArgs Empty = new NetworkInterfacePropertiesArgs();

    /**
     * The DNS name.
     * 
     */
    @InputImport(name="dnsName")
      private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    /**
     * The private IP address.
     * 
     */
    @InputImport(name="privateIpAddress")
      private final @Nullable Input<String> privateIpAddress;

    public Input<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Input.empty() : this.privateIpAddress;
    }

    /**
     * The public IP address.
     * 
     */
    @InputImport(name="publicIpAddress")
      private final @Nullable Input<String> publicIpAddress;

    public Input<String> getPublicIpAddress() {
        return this.publicIpAddress == null ? Input.empty() : this.publicIpAddress;
    }

    /**
     * The resource ID of the public IP address.
     * 
     */
    @InputImport(name="publicIpAddressId")
      private final @Nullable Input<String> publicIpAddressId;

    public Input<String> getPublicIpAddressId() {
        return this.publicIpAddressId == null ? Input.empty() : this.publicIpAddressId;
    }

    /**
     * The RdpAuthority property is a server DNS host name or IP address followed by the service port number for RDP (Remote Desktop Protocol).
     * 
     */
    @InputImport(name="rdpAuthority")
      private final @Nullable Input<String> rdpAuthority;

    public Input<String> getRdpAuthority() {
        return this.rdpAuthority == null ? Input.empty() : this.rdpAuthority;
    }

    /**
     * The configuration for sharing a public IP address across multiple virtual machines.
     * 
     */
    @InputImport(name="sharedPublicIpAddressConfiguration")
      private final @Nullable Input<SharedPublicIpAddressConfigurationArgs> sharedPublicIpAddressConfiguration;

    public Input<SharedPublicIpAddressConfigurationArgs> getSharedPublicIpAddressConfiguration() {
        return this.sharedPublicIpAddressConfiguration == null ? Input.empty() : this.sharedPublicIpAddressConfiguration;
    }

    /**
     * The SshAuthority property is a server DNS host name or IP address followed by the service port number for SSH.
     * 
     */
    @InputImport(name="sshAuthority")
      private final @Nullable Input<String> sshAuthority;

    public Input<String> getSshAuthority() {
        return this.sshAuthority == null ? Input.empty() : this.sshAuthority;
    }

    /**
     * The resource ID of the sub net.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * The resource ID of the virtual network.
     * 
     */
    @InputImport(name="virtualNetworkId")
      private final @Nullable Input<String> virtualNetworkId;

    public Input<String> getVirtualNetworkId() {
        return this.virtualNetworkId == null ? Input.empty() : this.virtualNetworkId;
    }

    public NetworkInterfacePropertiesArgs(
        @Nullable Input<String> dnsName,
        @Nullable Input<String> privateIpAddress,
        @Nullable Input<String> publicIpAddress,
        @Nullable Input<String> publicIpAddressId,
        @Nullable Input<String> rdpAuthority,
        @Nullable Input<SharedPublicIpAddressConfigurationArgs> sharedPublicIpAddressConfiguration,
        @Nullable Input<String> sshAuthority,
        @Nullable Input<String> subnetId,
        @Nullable Input<String> virtualNetworkId) {
        this.dnsName = dnsName;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
        this.publicIpAddressId = publicIpAddressId;
        this.rdpAuthority = rdpAuthority;
        this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
        this.sshAuthority = sshAuthority;
        this.subnetId = subnetId;
        this.virtualNetworkId = virtualNetworkId;
    }

    private NetworkInterfacePropertiesArgs() {
        this.dnsName = Input.empty();
        this.privateIpAddress = Input.empty();
        this.publicIpAddress = Input.empty();
        this.publicIpAddressId = Input.empty();
        this.rdpAuthority = Input.empty();
        this.sharedPublicIpAddressConfiguration = Input.empty();
        this.sshAuthority = Input.empty();
        this.subnetId = Input.empty();
        this.virtualNetworkId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfacePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dnsName;
        private @Nullable Input<String> privateIpAddress;
        private @Nullable Input<String> publicIpAddress;
        private @Nullable Input<String> publicIpAddressId;
        private @Nullable Input<String> rdpAuthority;
        private @Nullable Input<SharedPublicIpAddressConfigurationArgs> sharedPublicIpAddressConfiguration;
        private @Nullable Input<String> sshAuthority;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<String> virtualNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfacePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sharedPublicIpAddressConfiguration = defaults.sharedPublicIpAddressConfiguration;
    	      this.sshAuthority = defaults.sshAuthority;
    	      this.subnetId = defaults.subnetId;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
        }

        public Builder setDnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable Input<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Input.ofNullable(privateIpAddress);
            return this;
        }

        public Builder setPublicIpAddress(@Nullable Input<String> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        public Builder setPublicIpAddress(@Nullable String publicIpAddress) {
            this.publicIpAddress = Input.ofNullable(publicIpAddress);
            return this;
        }

        public Builder setPublicIpAddressId(@Nullable Input<String> publicIpAddressId) {
            this.publicIpAddressId = publicIpAddressId;
            return this;
        }

        public Builder setPublicIpAddressId(@Nullable String publicIpAddressId) {
            this.publicIpAddressId = Input.ofNullable(publicIpAddressId);
            return this;
        }

        public Builder setRdpAuthority(@Nullable Input<String> rdpAuthority) {
            this.rdpAuthority = rdpAuthority;
            return this;
        }

        public Builder setRdpAuthority(@Nullable String rdpAuthority) {
            this.rdpAuthority = Input.ofNullable(rdpAuthority);
            return this;
        }

        public Builder setSharedPublicIpAddressConfiguration(@Nullable Input<SharedPublicIpAddressConfigurationArgs> sharedPublicIpAddressConfiguration) {
            this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
            return this;
        }

        public Builder setSharedPublicIpAddressConfiguration(@Nullable SharedPublicIpAddressConfigurationArgs sharedPublicIpAddressConfiguration) {
            this.sharedPublicIpAddressConfiguration = Input.ofNullable(sharedPublicIpAddressConfiguration);
            return this;
        }

        public Builder setSshAuthority(@Nullable Input<String> sshAuthority) {
            this.sshAuthority = sshAuthority;
            return this;
        }

        public Builder setSshAuthority(@Nullable String sshAuthority) {
            this.sshAuthority = Input.ofNullable(sshAuthority);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder setVirtualNetworkId(@Nullable Input<String> virtualNetworkId) {
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }

        public Builder setVirtualNetworkId(@Nullable String virtualNetworkId) {
            this.virtualNetworkId = Input.ofNullable(virtualNetworkId);
            return this;
        }
        public NetworkInterfacePropertiesArgs build() {
            return new NetworkInterfacePropertiesArgs(dnsName, privateIpAddress, publicIpAddress, publicIpAddressId, rdpAuthority, sharedPublicIpAddressConfiguration, sshAuthority, subnetId, virtualNetworkId);
        }
    }
}
