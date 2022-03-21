// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.VirtualNetworkTapResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Tap configuration in a Network Interface.
 * 
 */
public final class NetworkInterfaceTapConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceTapConfigurationResponse Empty = new NetworkInterfaceTapConfigurationResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the network interface tap configuration resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Sub Resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The reference to the Virtual Network Tap resource.
     * 
     */
    @Import(name="virtualNetworkTap")
      private final @Nullable VirtualNetworkTapResponse virtualNetworkTap;

    public Optional<VirtualNetworkTapResponse> getVirtualNetworkTap() {
        return this.virtualNetworkTap == null ? Optional.empty() : Optional.ofNullable(this.virtualNetworkTap);
    }

    public NetworkInterfaceTapConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type,
        @Nullable VirtualNetworkTapResponse virtualNetworkTap) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.virtualNetworkTap = virtualNetworkTap;
    }

    private NetworkInterfaceTapConfigurationResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.type = null;
        this.virtualNetworkTap = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceTapConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;
        private @Nullable VirtualNetworkTapResponse virtualNetworkTap;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceTapConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
    	      this.virtualNetworkTap = defaults.virtualNetworkTap;
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualNetworkTap(@Nullable VirtualNetworkTapResponse virtualNetworkTap) {
            this.virtualNetworkTap = virtualNetworkTap;
            return this;
        }        public NetworkInterfaceTapConfigurationResponse build() {
            return new NetworkInterfaceTapConfigurationResponse(etag, id, name, provisioningState, type, virtualNetworkTap);
        }
    }
}
