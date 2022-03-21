// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayBackendAddressPoolResponse;
import io.pulumi.azurenative.network.outputs.ApplicationSecurityGroupResponse;
import io.pulumi.azurenative.network.outputs.BackendAddressPoolResponse;
import io.pulumi.azurenative.network.outputs.InboundNatRuleResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse;
import io.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkTapResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInterfaceIPConfigurationResponse {
    /**
     * The reference to ApplicationGatewayBackendAddressPool resource.
     * 
     */
    private final @Nullable List<ApplicationGatewayBackendAddressPoolResponse> applicationGatewayBackendAddressPools;
    /**
     * Application security groups in which the IP configuration is included.
     * 
     */
    private final @Nullable List<ApplicationSecurityGroupResponse> applicationSecurityGroups;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The reference to LoadBalancerBackendAddressPool resource.
     * 
     */
    private final @Nullable List<BackendAddressPoolResponse> loadBalancerBackendAddressPools;
    /**
     * A list of references of LoadBalancerInboundNatRules.
     * 
     */
    private final @Nullable List<InboundNatRuleResponse> loadBalancerInboundNatRules;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * Whether this is a primary customer address on the network interface.
     * 
     */
    private final @Nullable Boolean primary;
    /**
     * Private IP address of the IP configuration.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
     */
    private final @Nullable String privateIPAddressVersion;
    /**
     * The private IP address allocation method.
     * 
     */
    private final @Nullable String privateIPAllocationMethod;
    /**
     * PrivateLinkConnection properties for the network interface.
     * 
     */
    private final NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse privateLinkConnectionProperties;
    /**
     * The provisioning state of the network interface IP configuration.
     * 
     */
    private final String provisioningState;
    /**
     * Public IP address bound to the IP configuration.
     * 
     */
    private final @Nullable PublicIPAddressResponse publicIPAddress;
    /**
     * Subnet bound to the IP configuration.
     * 
     */
    private final @Nullable SubnetResponse subnet;
    /**
     * Resource type.
     * 
     */
    private final @Nullable String type;
    /**
     * The reference to Virtual Network Taps.
     * 
     */
    private final @Nullable List<VirtualNetworkTapResponse> virtualNetworkTaps;

    @CustomType.Constructor
    private NetworkInterfaceIPConfigurationResponse(
        @CustomType.Parameter("applicationGatewayBackendAddressPools") @Nullable List<ApplicationGatewayBackendAddressPoolResponse> applicationGatewayBackendAddressPools,
        @CustomType.Parameter("applicationSecurityGroups") @Nullable List<ApplicationSecurityGroupResponse> applicationSecurityGroups,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("loadBalancerBackendAddressPools") @Nullable List<BackendAddressPoolResponse> loadBalancerBackendAddressPools,
        @CustomType.Parameter("loadBalancerInboundNatRules") @Nullable List<InboundNatRuleResponse> loadBalancerInboundNatRules,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("primary") @Nullable Boolean primary,
        @CustomType.Parameter("privateIPAddress") @Nullable String privateIPAddress,
        @CustomType.Parameter("privateIPAddressVersion") @Nullable String privateIPAddressVersion,
        @CustomType.Parameter("privateIPAllocationMethod") @Nullable String privateIPAllocationMethod,
        @CustomType.Parameter("privateLinkConnectionProperties") NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse privateLinkConnectionProperties,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIPAddress") @Nullable PublicIPAddressResponse publicIPAddress,
        @CustomType.Parameter("subnet") @Nullable SubnetResponse subnet,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("virtualNetworkTaps") @Nullable List<VirtualNetworkTapResponse> virtualNetworkTaps) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.etag = etag;
        this.id = id;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.loadBalancerInboundNatRules = loadBalancerInboundNatRules;
        this.name = name;
        this.primary = primary;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.privateLinkConnectionProperties = privateLinkConnectionProperties;
        this.provisioningState = provisioningState;
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
        this.type = type;
        this.virtualNetworkTaps = virtualNetworkTaps;
    }

    /**
     * The reference to ApplicationGatewayBackendAddressPool resource.
     * 
    */
    public List<ApplicationGatewayBackendAddressPoolResponse> getApplicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? List.of() : this.applicationGatewayBackendAddressPools;
    }
    /**
     * Application security groups in which the IP configuration is included.
     * 
    */
    public List<ApplicationSecurityGroupResponse> getApplicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The reference to LoadBalancerBackendAddressPool resource.
     * 
    */
    public List<BackendAddressPoolResponse> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? List.of() : this.loadBalancerBackendAddressPools;
    }
    /**
     * A list of references of LoadBalancerInboundNatRules.
     * 
    */
    public List<InboundNatRuleResponse> getLoadBalancerInboundNatRules() {
        return this.loadBalancerInboundNatRules == null ? List.of() : this.loadBalancerInboundNatRules;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Whether this is a primary customer address on the network interface.
     * 
    */
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * Private IP address of the IP configuration.
     * 
    */
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
    */
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    /**
     * The private IP address allocation method.
     * 
    */
    public Optional<String> getPrivateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    /**
     * PrivateLinkConnection properties for the network interface.
     * 
    */
    public NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse getPrivateLinkConnectionProperties() {
        return this.privateLinkConnectionProperties;
    }
    /**
     * The provisioning state of the network interface IP configuration.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Public IP address bound to the IP configuration.
     * 
    */
    public Optional<PublicIPAddressResponse> getPublicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }
    /**
     * Subnet bound to the IP configuration.
     * 
    */
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Resource type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The reference to Virtual Network Taps.
     * 
    */
    public List<VirtualNetworkTapResponse> getVirtualNetworkTaps() {
        return this.virtualNetworkTaps == null ? List.of() : this.virtualNetworkTaps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayBackendAddressPoolResponse> applicationGatewayBackendAddressPools;
        private @Nullable List<ApplicationSecurityGroupResponse> applicationSecurityGroups;
        private String etag;
        private @Nullable String id;
        private @Nullable List<BackendAddressPoolResponse> loadBalancerBackendAddressPools;
        private @Nullable List<InboundNatRuleResponse> loadBalancerInboundNatRules;
        private @Nullable String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAddressVersion;
        private @Nullable String privateIPAllocationMethod;
        private NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse privateLinkConnectionProperties;
        private String provisioningState;
        private @Nullable PublicIPAddressResponse publicIPAddress;
        private @Nullable SubnetResponse subnet;
        private @Nullable String type;
        private @Nullable List<VirtualNetworkTapResponse> virtualNetworkTaps;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayBackendAddressPools = defaults.applicationGatewayBackendAddressPools;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.loadBalancerInboundNatRules = defaults.loadBalancerInboundNatRules;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.privateLinkConnectionProperties = defaults.privateLinkConnectionProperties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
    	      this.virtualNetworkTaps = defaults.virtualNetworkTaps;
        }

        public Builder applicationGatewayBackendAddressPools(@Nullable List<ApplicationGatewayBackendAddressPoolResponse> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }
        public Builder applicationGatewayBackendAddressPools(ApplicationGatewayBackendAddressPoolResponse... applicationGatewayBackendAddressPools) {
            return applicationGatewayBackendAddressPools(List.of(applicationGatewayBackendAddressPools));
        }
        public Builder applicationSecurityGroups(@Nullable List<ApplicationSecurityGroupResponse> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }
        public Builder applicationSecurityGroups(ApplicationSecurityGroupResponse... applicationSecurityGroups) {
            return applicationSecurityGroups(List.of(applicationSecurityGroups));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder loadBalancerBackendAddressPools(@Nullable List<BackendAddressPoolResponse> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }
        public Builder loadBalancerBackendAddressPools(BackendAddressPoolResponse... loadBalancerBackendAddressPools) {
            return loadBalancerBackendAddressPools(List.of(loadBalancerBackendAddressPools));
        }
        public Builder loadBalancerInboundNatRules(@Nullable List<InboundNatRuleResponse> loadBalancerInboundNatRules) {
            this.loadBalancerInboundNatRules = loadBalancerInboundNatRules;
            return this;
        }
        public Builder loadBalancerInboundNatRules(InboundNatRuleResponse... loadBalancerInboundNatRules) {
            return loadBalancerInboundNatRules(List.of(loadBalancerInboundNatRules));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }
        public Builder privateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }
        public Builder privateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }
        public Builder privateLinkConnectionProperties(NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse privateLinkConnectionProperties) {
            this.privateLinkConnectionProperties = Objects.requireNonNull(privateLinkConnectionProperties);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicIPAddress(@Nullable PublicIPAddressResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }
        public Builder subnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder virtualNetworkTaps(@Nullable List<VirtualNetworkTapResponse> virtualNetworkTaps) {
            this.virtualNetworkTaps = virtualNetworkTaps;
            return this;
        }
        public Builder virtualNetworkTaps(VirtualNetworkTapResponse... virtualNetworkTaps) {
            return virtualNetworkTaps(List.of(virtualNetworkTaps));
        }        public NetworkInterfaceIPConfigurationResponse build() {
            return new NetworkInterfaceIPConfigurationResponse(applicationGatewayBackendAddressPools, applicationSecurityGroups, etag, id, loadBalancerBackendAddressPools, loadBalancerInboundNatRules, name, primary, privateIPAddress, privateIPAddressVersion, privateIPAllocationMethod, privateLinkConnectionProperties, provisioningState, publicIPAddress, subnet, type, virtualNetworkTaps);
        }
    }
}
