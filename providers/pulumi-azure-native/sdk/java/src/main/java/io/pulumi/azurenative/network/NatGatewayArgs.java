// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.NatGatewaySkuArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NatGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatGatewayArgs Empty = new NatGatewayArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The idle timeout of the nat gateway.
     * 
     */
    @InputImport(name="idleTimeoutInMinutes")
      private final @Nullable Input<Integer> idleTimeoutInMinutes;

    public Input<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Input.empty() : this.idleTimeoutInMinutes;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the nat gateway.
     * 
     */
    @InputImport(name="natGatewayName")
      private final @Nullable Input<String> natGatewayName;

    public Input<String> getNatGatewayName() {
        return this.natGatewayName == null ? Input.empty() : this.natGatewayName;
    }

    /**
     * An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    @InputImport(name="publicIpAddresses")
      private final @Nullable Input<List<SubResourceArgs>> publicIpAddresses;

    public Input<List<SubResourceArgs>> getPublicIpAddresses() {
        return this.publicIpAddresses == null ? Input.empty() : this.publicIpAddresses;
    }

    /**
     * An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    @InputImport(name="publicIpPrefixes")
      private final @Nullable Input<List<SubResourceArgs>> publicIpPrefixes;

    public Input<List<SubResourceArgs>> getPublicIpPrefixes() {
        return this.publicIpPrefixes == null ? Input.empty() : this.publicIpPrefixes;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The nat gateway SKU.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<NatGatewaySkuArgs> sku;

    public Input<NatGatewaySkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public NatGatewayArgs(
        @Nullable Input<String> id,
        @Nullable Input<Integer> idleTimeoutInMinutes,
        @Nullable Input<String> location,
        @Nullable Input<String> natGatewayName,
        @Nullable Input<List<SubResourceArgs>> publicIpAddresses,
        @Nullable Input<List<SubResourceArgs>> publicIpPrefixes,
        Input<String> resourceGroupName,
        @Nullable Input<NatGatewaySkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> zones) {
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.location = location;
        this.natGatewayName = natGatewayName;
        this.publicIpAddresses = publicIpAddresses;
        this.publicIpPrefixes = publicIpPrefixes;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.zones = zones;
    }

    private NatGatewayArgs() {
        this.id = Input.empty();
        this.idleTimeoutInMinutes = Input.empty();
        this.location = Input.empty();
        this.natGatewayName = Input.empty();
        this.publicIpAddresses = Input.empty();
        this.publicIpPrefixes = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> idleTimeoutInMinutes;
        private @Nullable Input<String> location;
        private @Nullable Input<String> natGatewayName;
        private @Nullable Input<List<SubResourceArgs>> publicIpAddresses;
        private @Nullable Input<List<SubResourceArgs>> publicIpPrefixes;
        private Input<String> resourceGroupName;
        private @Nullable Input<NatGatewaySkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.location = defaults.location;
    	      this.natGatewayName = defaults.natGatewayName;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.publicIpPrefixes = defaults.publicIpPrefixes;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Input<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Input.ofNullable(idleTimeoutInMinutes);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNatGatewayName(@Nullable Input<String> natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }

        public Builder setNatGatewayName(@Nullable String natGatewayName) {
            this.natGatewayName = Input.ofNullable(natGatewayName);
            return this;
        }

        public Builder setPublicIpAddresses(@Nullable Input<List<SubResourceArgs>> publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }

        public Builder setPublicIpAddresses(@Nullable List<SubResourceArgs> publicIpAddresses) {
            this.publicIpAddresses = Input.ofNullable(publicIpAddresses);
            return this;
        }

        public Builder setPublicIpPrefixes(@Nullable Input<List<SubResourceArgs>> publicIpPrefixes) {
            this.publicIpPrefixes = publicIpPrefixes;
            return this;
        }

        public Builder setPublicIpPrefixes(@Nullable List<SubResourceArgs> publicIpPrefixes) {
            this.publicIpPrefixes = Input.ofNullable(publicIpPrefixes);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<NatGatewaySkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable NatGatewaySkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public NatGatewayArgs build() {
            return new NatGatewayArgs(id, idleTimeoutInMinutes, location, natGatewayName, publicIpAddresses, publicIpPrefixes, resourceGroupName, sku, tags, zones);
        }
    }
}
