// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFirewallIPConfigurationResponse {
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
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The Firewall Internal Load Balancer IP to be used as the next hop in User Defined Routes.
     * 
     */
    private final String privateIPAddress;
    /**
     * The provisioning state of the Azure firewall IP configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * Reference to the PublicIP resource. This field is a mandatory input if subnet is not null.
     * 
     */
    private final @Nullable SubResourceResponse publicIPAddress;
    /**
     * Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or 'AzureFirewallManagementSubnet'.
     * 
     */
    private final @Nullable SubResourceResponse subnet;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureFirewallIPConfigurationResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("privateIPAddress") String privateIPAddress,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIPAddress") @Nullable SubResourceResponse publicIPAddress,
        @CustomType.Parameter("subnet") @Nullable SubResourceResponse subnet,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.provisioningState = provisioningState;
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
        this.type = type;
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
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The Firewall Internal Load Balancer IP to be used as the next hop in User Defined Routes.
     * 
    */
    public String getPrivateIPAddress() {
        return this.privateIPAddress;
    }
    /**
     * The provisioning state of the Azure firewall IP configuration resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Reference to the PublicIP resource. This field is a mandatory input if subnet is not null.
     * 
    */
    public Optional<SubResourceResponse> getPublicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }
    /**
     * Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or 'AzureFirewallManagementSubnet'.
     * 
    */
    public Optional<SubResourceResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String privateIPAddress;
        private String provisioningState;
        private @Nullable SubResourceResponse publicIPAddress;
        private @Nullable SubResourceResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder privateIPAddress(String privateIPAddress) {
            this.privateIPAddress = Objects.requireNonNull(privateIPAddress);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicIPAddress(@Nullable SubResourceResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }
        public Builder subnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureFirewallIPConfigurationResponse build() {
            return new AzureFirewallIPConfigurationResponse(etag, id, name, privateIPAddress, provisioningState, publicIPAddress, subnet, type);
        }
    }
}
