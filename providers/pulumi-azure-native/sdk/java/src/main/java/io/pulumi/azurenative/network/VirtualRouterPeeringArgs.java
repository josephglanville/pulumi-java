// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualRouterPeeringArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualRouterPeeringArgs Empty = new VirtualRouterPeeringArgs();

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
     * Name of the virtual router peering that is unique within a virtual router.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Peer ASN.
     * 
     */
    @Import(name="peerAsn")
      private final @Nullable Output<Double> peerAsn;

    public Output<Double> getPeerAsn() {
        return this.peerAsn == null ? Output.empty() : this.peerAsn;
    }

    /**
     * Peer IP.
     * 
     */
    @Import(name="peerIp")
      private final @Nullable Output<String> peerIp;

    public Output<String> getPeerIp() {
        return this.peerIp == null ? Output.empty() : this.peerIp;
    }

    /**
     * The name of the Virtual Router Peering.
     * 
     */
    @Import(name="peeringName")
      private final @Nullable Output<String> peeringName;

    public Output<String> getPeeringName() {
        return this.peeringName == null ? Output.empty() : this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Virtual Router.
     * 
     */
    @Import(name="virtualRouterName", required=true)
      private final Output<String> virtualRouterName;

    public Output<String> getVirtualRouterName() {
        return this.virtualRouterName;
    }

    public VirtualRouterPeeringArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<Double> peerAsn,
        @Nullable Output<String> peerIp,
        @Nullable Output<String> peeringName,
        Output<String> resourceGroupName,
        Output<String> virtualRouterName) {
        this.id = id;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIp = peerIp;
        this.peeringName = peeringName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualRouterName = Objects.requireNonNull(virtualRouterName, "expected parameter 'virtualRouterName' to be non-null");
    }

    private VirtualRouterPeeringArgs() {
        this.id = Output.empty();
        this.name = Output.empty();
        this.peerAsn = Output.empty();
        this.peerIp = Output.empty();
        this.peeringName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.virtualRouterName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualRouterPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<Double> peerAsn;
        private @Nullable Output<String> peerIp;
        private @Nullable Output<String> peeringName;
        private Output<String> resourceGroupName;
        private Output<String> virtualRouterName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualRouterPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIp = defaults.peerIp;
    	      this.peeringName = defaults.peeringName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualRouterName = defaults.virtualRouterName;
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
        public Builder peerAsn(@Nullable Output<Double> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Builder peerAsn(@Nullable Double peerAsn) {
            this.peerAsn = Output.ofNullable(peerAsn);
            return this;
        }
        public Builder peerIp(@Nullable Output<String> peerIp) {
            this.peerIp = peerIp;
            return this;
        }
        public Builder peerIp(@Nullable String peerIp) {
            this.peerIp = Output.ofNullable(peerIp);
            return this;
        }
        public Builder peeringName(@Nullable Output<String> peeringName) {
            this.peeringName = peeringName;
            return this;
        }
        public Builder peeringName(@Nullable String peeringName) {
            this.peeringName = Output.ofNullable(peeringName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder virtualRouterName(Output<String> virtualRouterName) {
            this.virtualRouterName = Objects.requireNonNull(virtualRouterName);
            return this;
        }
        public Builder virtualRouterName(String virtualRouterName) {
            this.virtualRouterName = Output.of(Objects.requireNonNull(virtualRouterName));
            return this;
        }        public VirtualRouterPeeringArgs build() {
            return new VirtualRouterPeeringArgs(id, name, peerAsn, peerIp, peeringName, resourceGroupName, virtualRouterName);
        }
    }
}
