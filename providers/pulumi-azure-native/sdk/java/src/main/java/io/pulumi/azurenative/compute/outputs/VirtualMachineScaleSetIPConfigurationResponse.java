// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetPublicIPAddressConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetIPConfigurationResponse {
    /**
     * Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
     * 
     */
    private final @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
    /**
     * Specifies an array of references to application security group.
     * 
     */
    private final @Nullable List<SubResourceResponse> applicationSecurityGroups;
    /**
     * Resource Id
     * 
     */
    private final @Nullable String id;
    /**
     * Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    private final @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
    /**
     * Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    private final @Nullable List<SubResourceResponse> loadBalancerInboundNatPools;
    /**
     * The IP configuration name.
     * 
     */
    private final String name;
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    private final @Nullable Boolean primary;
    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    private final @Nullable String privateIPAddressVersion;
    /**
     * The publicIPAddressConfiguration.
     * 
     */
    private final @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration;
    /**
     * Specifies the identifier of the subnet.
     * 
     */
    private final @Nullable ApiEntityReferenceResponse subnet;

    @CustomType.Constructor
    private VirtualMachineScaleSetIPConfigurationResponse(
        @CustomType.Parameter("applicationGatewayBackendAddressPools") @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools,
        @CustomType.Parameter("applicationSecurityGroups") @Nullable List<SubResourceResponse> applicationSecurityGroups,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("loadBalancerBackendAddressPools") @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools,
        @CustomType.Parameter("loadBalancerInboundNatPools") @Nullable List<SubResourceResponse> loadBalancerInboundNatPools,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primary") @Nullable Boolean primary,
        @CustomType.Parameter("privateIPAddressVersion") @Nullable String privateIPAddressVersion,
        @CustomType.Parameter("publicIPAddressConfiguration") @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration,
        @CustomType.Parameter("subnet") @Nullable ApiEntityReferenceResponse subnet) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.id = id;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        this.name = name;
        this.primary = primary;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnet = subnet;
    }

    /**
     * Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
     * 
    */
    public List<SubResourceResponse> getApplicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? List.of() : this.applicationGatewayBackendAddressPools;
    }
    /**
     * Specifies an array of references to application security group.
     * 
    */
    public List<SubResourceResponse> getApplicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }
    /**
     * Resource Id
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
    */
    public List<SubResourceResponse> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? List.of() : this.loadBalancerBackendAddressPools;
    }
    /**
     * Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
    */
    public List<SubResourceResponse> getLoadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools == null ? List.of() : this.loadBalancerInboundNatPools;
    }
    /**
     * The IP configuration name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
    */
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'.
     * 
    */
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    /**
     * The publicIPAddressConfiguration.
     * 
    */
    public Optional<VirtualMachineScaleSetPublicIPAddressConfigurationResponse> getPublicIPAddressConfiguration() {
        return Optional.ofNullable(this.publicIPAddressConfiguration);
    }
    /**
     * Specifies the identifier of the subnet.
     * 
    */
    public Optional<ApiEntityReferenceResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
        private @Nullable List<SubResourceResponse> applicationSecurityGroups;
        private @Nullable String id;
        private @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
        private @Nullable List<SubResourceResponse> loadBalancerInboundNatPools;
        private String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddressVersion;
        private @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration;
        private @Nullable ApiEntityReferenceResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayBackendAddressPools = defaults.applicationGatewayBackendAddressPools;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.id = defaults.id;
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.loadBalancerInboundNatPools = defaults.loadBalancerInboundNatPools;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnet = defaults.subnet;
        }

        public Builder applicationGatewayBackendAddressPools(@Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }
        public Builder applicationGatewayBackendAddressPools(SubResourceResponse... applicationGatewayBackendAddressPools) {
            return applicationGatewayBackendAddressPools(List.of(applicationGatewayBackendAddressPools));
        }
        public Builder applicationSecurityGroups(@Nullable List<SubResourceResponse> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }
        public Builder applicationSecurityGroups(SubResourceResponse... applicationSecurityGroups) {
            return applicationSecurityGroups(List.of(applicationSecurityGroups));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder loadBalancerBackendAddressPools(@Nullable List<SubResourceResponse> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }
        public Builder loadBalancerBackendAddressPools(SubResourceResponse... loadBalancerBackendAddressPools) {
            return loadBalancerBackendAddressPools(List.of(loadBalancerBackendAddressPools));
        }
        public Builder loadBalancerInboundNatPools(@Nullable List<SubResourceResponse> loadBalancerInboundNatPools) {
            this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
            return this;
        }
        public Builder loadBalancerInboundNatPools(SubResourceResponse... loadBalancerInboundNatPools) {
            return loadBalancerInboundNatPools(List.of(loadBalancerInboundNatPools));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Builder privateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }
        public Builder publicIPAddressConfiguration(@Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }
        public Builder subnet(@Nullable ApiEntityReferenceResponse subnet) {
            this.subnet = subnet;
            return this;
        }        public VirtualMachineScaleSetIPConfigurationResponse build() {
            return new VirtualMachineScaleSetIPConfigurationResponse(applicationGatewayBackendAddressPools, applicationSecurityGroups, id, loadBalancerBackendAddressPools, loadBalancerInboundNatPools, name, primary, privateIPAddressVersion, publicIPAddressConfiguration, subnet);
        }
    }
}
