// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.ExpressRoutePortsEncapsulation;
import io.pulumi.azurenative.network.inputs.ExpressRouteLinkArgs;
import io.pulumi.azurenative.network.inputs.ManagedServiceIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRoutePortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRoutePortArgs Empty = new ExpressRoutePortArgs();

    /**
     * Bandwidth of procured ports in Gbps.
     * 
     */
    @Import(name="bandwidthInGbps")
      private final @Nullable Output<Integer> bandwidthInGbps;

    public Output<Integer> getBandwidthInGbps() {
        return this.bandwidthInGbps == null ? Output.empty() : this.bandwidthInGbps;
    }

    /**
     * Encapsulation method on physical ports.
     * 
     */
    @Import(name="encapsulation")
      private final @Nullable Output<Either<String,ExpressRoutePortsEncapsulation>> encapsulation;

    public Output<Either<String,ExpressRoutePortsEncapsulation>> getEncapsulation() {
        return this.encapsulation == null ? Output.empty() : this.encapsulation;
    }

    /**
     * The name of the ExpressRoutePort resource.
     * 
     */
    @Import(name="expressRoutePortName")
      private final @Nullable Output<String> expressRoutePortName;

    public Output<String> getExpressRoutePortName() {
        return this.expressRoutePortName == null ? Output.empty() : this.expressRoutePortName;
    }

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
     * The identity of ExpressRoutePort, if configured.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * The set of physical links of the ExpressRoutePort resource.
     * 
     */
    @Import(name="links")
      private final @Nullable Output<List<ExpressRouteLinkArgs>> links;

    public Output<List<ExpressRouteLinkArgs>> getLinks() {
        return this.links == null ? Output.empty() : this.links;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the peering location that the ExpressRoutePort is mapped to physically.
     * 
     */
    @Import(name="peeringLocation")
      private final @Nullable Output<String> peeringLocation;

    public Output<String> getPeeringLocation() {
        return this.peeringLocation == null ? Output.empty() : this.peeringLocation;
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ExpressRoutePortArgs(
        @Nullable Output<Integer> bandwidthInGbps,
        @Nullable Output<Either<String,ExpressRoutePortsEncapsulation>> encapsulation,
        @Nullable Output<String> expressRoutePortName,
        @Nullable Output<String> id,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<List<ExpressRouteLinkArgs>> links,
        @Nullable Output<String> location,
        @Nullable Output<String> peeringLocation,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.bandwidthInGbps = bandwidthInGbps;
        this.encapsulation = encapsulation;
        this.expressRoutePortName = expressRoutePortName;
        this.id = id;
        this.identity = identity;
        this.links = links;
        this.location = location;
        this.peeringLocation = peeringLocation;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ExpressRoutePortArgs() {
        this.bandwidthInGbps = Output.empty();
        this.encapsulation = Output.empty();
        this.expressRoutePortName = Output.empty();
        this.id = Output.empty();
        this.identity = Output.empty();
        this.links = Output.empty();
        this.location = Output.empty();
        this.peeringLocation = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRoutePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bandwidthInGbps;
        private @Nullable Output<Either<String,ExpressRoutePortsEncapsulation>> encapsulation;
        private @Nullable Output<String> expressRoutePortName;
        private @Nullable Output<String> id;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<List<ExpressRouteLinkArgs>> links;
        private @Nullable Output<String> location;
        private @Nullable Output<String> peeringLocation;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRoutePortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInGbps = defaults.bandwidthInGbps;
    	      this.encapsulation = defaults.encapsulation;
    	      this.expressRoutePortName = defaults.expressRoutePortName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.links = defaults.links;
    	      this.location = defaults.location;
    	      this.peeringLocation = defaults.peeringLocation;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder bandwidthInGbps(@Nullable Output<Integer> bandwidthInGbps) {
            this.bandwidthInGbps = bandwidthInGbps;
            return this;
        }
        public Builder bandwidthInGbps(@Nullable Integer bandwidthInGbps) {
            this.bandwidthInGbps = Output.ofNullable(bandwidthInGbps);
            return this;
        }
        public Builder encapsulation(@Nullable Output<Either<String,ExpressRoutePortsEncapsulation>> encapsulation) {
            this.encapsulation = encapsulation;
            return this;
        }
        public Builder encapsulation(@Nullable Either<String,ExpressRoutePortsEncapsulation> encapsulation) {
            this.encapsulation = Output.ofNullable(encapsulation);
            return this;
        }
        public Builder expressRoutePortName(@Nullable Output<String> expressRoutePortName) {
            this.expressRoutePortName = expressRoutePortName;
            return this;
        }
        public Builder expressRoutePortName(@Nullable String expressRoutePortName) {
            this.expressRoutePortName = Output.ofNullable(expressRoutePortName);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }
        public Builder links(@Nullable Output<List<ExpressRouteLinkArgs>> links) {
            this.links = links;
            return this;
        }
        public Builder links(@Nullable List<ExpressRouteLinkArgs> links) {
            this.links = Output.ofNullable(links);
            return this;
        }
        public Builder links(ExpressRouteLinkArgs... links) {
            return links(List.of(links));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder peeringLocation(@Nullable Output<String> peeringLocation) {
            this.peeringLocation = peeringLocation;
            return this;
        }
        public Builder peeringLocation(@Nullable String peeringLocation) {
            this.peeringLocation = Output.ofNullable(peeringLocation);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ExpressRoutePortArgs build() {
            return new ExpressRoutePortArgs(bandwidthInGbps, encapsulation, expressRoutePortName, id, identity, links, location, peeringLocation, resourceGroupName, tags);
        }
    }
}
