// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkBgpCommunitiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualNetworkPeeringResult {
    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    private final @Nullable Boolean allowForwardedTraffic;
    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    private final @Nullable Boolean allowGatewayTransit;
    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    private final @Nullable Boolean allowVirtualNetworkAccess;
    /**
     * If we need to verify the provisioning state of the remote gateway.
     * 
     */
    private final @Nullable Boolean doNotVerifyRemoteGateways;
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The status of the virtual network peering.
     * 
     */
    private final @Nullable String peeringState;
    /**
     * The provisioning state of the virtual network peering resource.
     * 
     */
    private final String provisioningState;
    /**
     * The reference to the remote virtual network address space.
     * 
     */
    private final @Nullable AddressSpaceResponse remoteAddressSpace;
    /**
     * The reference to the remote virtual network's Bgp Communities.
     * 
     */
    private final @Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities;
    /**
     * The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     * 
     */
    private final @Nullable SubResourceResponse remoteVirtualNetwork;
    /**
     * The resourceGuid property of the Virtual Network peering resource.
     * 
     */
    private final String resourceGuid;
    /**
     * Resource type.
     * 
     */
    private final @Nullable String type;
    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    private final @Nullable Boolean useRemoteGateways;

    @CustomType.Constructor
    private GetVirtualNetworkPeeringResult(
        @CustomType.Parameter("allowForwardedTraffic") @Nullable Boolean allowForwardedTraffic,
        @CustomType.Parameter("allowGatewayTransit") @Nullable Boolean allowGatewayTransit,
        @CustomType.Parameter("allowVirtualNetworkAccess") @Nullable Boolean allowVirtualNetworkAccess,
        @CustomType.Parameter("doNotVerifyRemoteGateways") @Nullable Boolean doNotVerifyRemoteGateways,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("peeringState") @Nullable String peeringState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("remoteAddressSpace") @Nullable AddressSpaceResponse remoteAddressSpace,
        @CustomType.Parameter("remoteBgpCommunities") @Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities,
        @CustomType.Parameter("remoteVirtualNetwork") @Nullable SubResourceResponse remoteVirtualNetwork,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("useRemoteGateways") @Nullable Boolean useRemoteGateways) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        this.allowGatewayTransit = allowGatewayTransit;
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        this.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.peeringState = peeringState;
        this.provisioningState = provisioningState;
        this.remoteAddressSpace = remoteAddressSpace;
        this.remoteBgpCommunities = remoteBgpCommunities;
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        this.resourceGuid = resourceGuid;
        this.type = type;
        this.useRemoteGateways = useRemoteGateways;
    }

    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
    */
    public Optional<Boolean> getAllowForwardedTraffic() {
        return Optional.ofNullable(this.allowForwardedTraffic);
    }
    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
    */
    public Optional<Boolean> getAllowGatewayTransit() {
        return Optional.ofNullable(this.allowGatewayTransit);
    }
    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
    */
    public Optional<Boolean> getAllowVirtualNetworkAccess() {
        return Optional.ofNullable(this.allowVirtualNetworkAccess);
    }
    /**
     * If we need to verify the provisioning state of the remote gateway.
     * 
    */
    public Optional<Boolean> getDoNotVerifyRemoteGateways() {
        return Optional.ofNullable(this.doNotVerifyRemoteGateways);
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The status of the virtual network peering.
     * 
    */
    public Optional<String> getPeeringState() {
        return Optional.ofNullable(this.peeringState);
    }
    /**
     * The provisioning state of the virtual network peering resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the remote virtual network address space.
     * 
    */
    public Optional<AddressSpaceResponse> getRemoteAddressSpace() {
        return Optional.ofNullable(this.remoteAddressSpace);
    }
    /**
     * The reference to the remote virtual network's Bgp Communities.
     * 
    */
    public Optional<VirtualNetworkBgpCommunitiesResponse> getRemoteBgpCommunities() {
        return Optional.ofNullable(this.remoteBgpCommunities);
    }
    /**
     * The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     * 
    */
    public Optional<SubResourceResponse> getRemoteVirtualNetwork() {
        return Optional.ofNullable(this.remoteVirtualNetwork);
    }
    /**
     * The resourceGuid property of the Virtual Network peering resource.
     * 
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
    */
    public Optional<Boolean> getUseRemoteGateways() {
        return Optional.ofNullable(this.useRemoteGateways);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowForwardedTraffic;
        private @Nullable Boolean allowGatewayTransit;
        private @Nullable Boolean allowVirtualNetworkAccess;
        private @Nullable Boolean doNotVerifyRemoteGateways;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String peeringState;
        private String provisioningState;
        private @Nullable AddressSpaceResponse remoteAddressSpace;
        private @Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities;
        private @Nullable SubResourceResponse remoteVirtualNetwork;
        private String resourceGuid;
        private @Nullable String type;
        private @Nullable Boolean useRemoteGateways;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowForwardedTraffic = defaults.allowForwardedTraffic;
    	      this.allowGatewayTransit = defaults.allowGatewayTransit;
    	      this.allowVirtualNetworkAccess = defaults.allowVirtualNetworkAccess;
    	      this.doNotVerifyRemoteGateways = defaults.doNotVerifyRemoteGateways;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peeringState = defaults.peeringState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.remoteAddressSpace = defaults.remoteAddressSpace;
    	      this.remoteBgpCommunities = defaults.remoteBgpCommunities;
    	      this.remoteVirtualNetwork = defaults.remoteVirtualNetwork;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.type = defaults.type;
    	      this.useRemoteGateways = defaults.useRemoteGateways;
        }

        public Builder allowForwardedTraffic(@Nullable Boolean allowForwardedTraffic) {
            this.allowForwardedTraffic = allowForwardedTraffic;
            return this;
        }
        public Builder allowGatewayTransit(@Nullable Boolean allowGatewayTransit) {
            this.allowGatewayTransit = allowGatewayTransit;
            return this;
        }
        public Builder allowVirtualNetworkAccess(@Nullable Boolean allowVirtualNetworkAccess) {
            this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
            return this;
        }
        public Builder doNotVerifyRemoteGateways(@Nullable Boolean doNotVerifyRemoteGateways) {
            this.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
            return this;
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
        public Builder peeringState(@Nullable String peeringState) {
            this.peeringState = peeringState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder remoteAddressSpace(@Nullable AddressSpaceResponse remoteAddressSpace) {
            this.remoteAddressSpace = remoteAddressSpace;
            return this;
        }
        public Builder remoteBgpCommunities(@Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities) {
            this.remoteBgpCommunities = remoteBgpCommunities;
            return this;
        }
        public Builder remoteVirtualNetwork(@Nullable SubResourceResponse remoteVirtualNetwork) {
            this.remoteVirtualNetwork = remoteVirtualNetwork;
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder useRemoteGateways(@Nullable Boolean useRemoteGateways) {
            this.useRemoteGateways = useRemoteGateways;
            return this;
        }        public GetVirtualNetworkPeeringResult build() {
            return new GetVirtualNetworkPeeringResult(allowForwardedTraffic, allowGatewayTransit, allowVirtualNetworkAccess, doNotVerifyRemoteGateways, etag, id, name, peeringState, provisioningState, remoteAddressSpace, remoteBgpCommunities, remoteVirtualNetwork, resourceGuid, type, useRemoteGateways);
        }
    }
}
