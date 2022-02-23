// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetPublicIPAddressConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile's IP configuration.
 * 
 */
public final class VirtualMachineScaleSetIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetIPConfigurationResponse Empty = new VirtualMachineScaleSetIPConfigurationResponse();

    /**
     * Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
     * 
     */
    @InputImport(name="applicationGatewayBackendAddressPools")
      private final @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;

    public List<SubResourceResponse> getApplicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? List.of() : this.applicationGatewayBackendAddressPools;
    }

    /**
     * Specifies an array of references to application security group.
     * 
     */
    @InputImport(name="applicationSecurityGroups")
      private final @Nullable List<SubResourceResponse> applicationSecurityGroups;

    public List<SubResourceResponse> getApplicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }

    /**
     * Resource Id
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    @InputImport(name="loadBalancerBackendAddressPools")
      private final @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;

    public List<SubResourceResponse> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? List.of() : this.loadBalancerBackendAddressPools;
    }

    /**
     * Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    @InputImport(name="loadBalancerInboundNatPools")
      private final @Nullable List<SubResourceResponse> loadBalancerInboundNatPools;

    public List<SubResourceResponse> getLoadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools == null ? List.of() : this.loadBalancerInboundNatPools;
    }

    /**
     * The IP configuration name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @InputImport(name="primary")
      private final @Nullable Boolean primary;

    public Optional<Boolean> getPrimary() {
        return this.primary == null ? Optional.empty() : Optional.ofNullable(this.primary);
    }

    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    @InputImport(name="privateIPAddressVersion")
      private final @Nullable String privateIPAddressVersion;

    public Optional<String> getPrivateIPAddressVersion() {
        return this.privateIPAddressVersion == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddressVersion);
    }

    /**
     * The publicIPAddressConfiguration.
     * 
     */
    @InputImport(name="publicIPAddressConfiguration")
      private final @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration;

    public Optional<VirtualMachineScaleSetPublicIPAddressConfigurationResponse> getPublicIPAddressConfiguration() {
        return this.publicIPAddressConfiguration == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddressConfiguration);
    }

    /**
     * Specifies the identifier of the subnet.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable ApiEntityReferenceResponse subnet;

    public Optional<ApiEntityReferenceResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public VirtualMachineScaleSetIPConfigurationResponse(
        @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools,
        @Nullable List<SubResourceResponse> applicationSecurityGroups,
        @Nullable String id,
        @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools,
        @Nullable List<SubResourceResponse> loadBalancerInboundNatPools,
        String name,
        @Nullable Boolean primary,
        @Nullable String privateIPAddressVersion,
        @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration,
        @Nullable ApiEntityReferenceResponse subnet) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.id = id;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.primary = primary;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnet = subnet;
    }

    private VirtualMachineScaleSetIPConfigurationResponse() {
        this.applicationGatewayBackendAddressPools = List.of();
        this.applicationSecurityGroups = List.of();
        this.id = null;
        this.loadBalancerBackendAddressPools = List.of();
        this.loadBalancerInboundNatPools = List.of();
        this.name = null;
        this.primary = null;
        this.privateIPAddressVersion = null;
        this.publicIPAddressConfiguration = null;
        this.subnet = null;
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

        public Builder setApplicationGatewayBackendAddressPools(@Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }

        public Builder setApplicationSecurityGroups(@Nullable List<SubResourceResponse> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLoadBalancerBackendAddressPools(@Nullable List<SubResourceResponse> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }

        public Builder setLoadBalancerInboundNatPools(@Nullable List<SubResourceResponse> loadBalancerInboundNatPools) {
            this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAddressConfiguration(@Nullable VirtualMachineScaleSetPublicIPAddressConfigurationResponse publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }

        public Builder setSubnet(@Nullable ApiEntityReferenceResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public VirtualMachineScaleSetIPConfigurationResponse build() {
            return new VirtualMachineScaleSetIPConfigurationResponse(applicationGatewayBackendAddressPools, applicationSecurityGroups, id, loadBalancerBackendAddressPools, loadBalancerInboundNatPools, name, primary, privateIPAddressVersion, publicIPAddressConfiguration, subnet);
        }
    }
}
