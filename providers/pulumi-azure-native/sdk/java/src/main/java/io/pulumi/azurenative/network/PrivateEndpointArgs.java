// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.CustomDnsConfigPropertiesFormatArgs;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionArgs;
import io.pulumi.azurenative.network.inputs.SubnetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * An array of custom dns configurations.
     * 
     */
    @Import(name="customDnsConfigs")
      private final @Nullable Output<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs;

    public Output<List<CustomDnsConfigPropertiesFormatArgs>> getCustomDnsConfigs() {
        return this.customDnsConfigs == null ? Output.empty() : this.customDnsConfigs;
    }

    /**
     * The extended location of the load balancer.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Output.empty() : this.extendedLocation;
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
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
     */
    @Import(name="manualPrivateLinkServiceConnections")
      private final @Nullable Output<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections;

    public Output<List<PrivateLinkServiceConnectionArgs>> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? Output.empty() : this.manualPrivateLinkServiceConnections;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName")
      private final @Nullable Output<String> privateEndpointName;

    public Output<String> getPrivateEndpointName() {
        return this.privateEndpointName == null ? Output.empty() : this.privateEndpointName;
    }

    /**
     * A grouping of information about the connection to the remote resource.
     * 
     */
    @Import(name="privateLinkServiceConnections")
      private final @Nullable Output<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections;

    public Output<List<PrivateLinkServiceConnectionArgs>> getPrivateLinkServiceConnections() {
        return this.privateLinkServiceConnections == null ? Output.empty() : this.privateLinkServiceConnections;
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
     * The ID of the subnet from which the private IP will be allocated.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<SubnetArgs> subnet;

    public Output<SubnetArgs> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
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

    public PrivateEndpointArgs(
        @Nullable Output<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections,
        @Nullable Output<String> privateEndpointName,
        @Nullable Output<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections,
        Output<String> resourceGroupName,
        @Nullable Output<SubnetArgs> subnet,
        @Nullable Output<Map<String,String>> tags) {
        this.customDnsConfigs = customDnsConfigs;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.location = location;
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        this.privateEndpointName = privateEndpointName;
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnet = subnet;
        this.tags = tags;
    }

    private PrivateEndpointArgs() {
        this.customDnsConfigs = Output.empty();
        this.extendedLocation = Output.empty();
        this.id = Output.empty();
        this.location = Output.empty();
        this.manualPrivateLinkServiceConnections = Output.empty();
        this.privateEndpointName = Output.empty();
        this.privateLinkServiceConnections = Output.empty();
        this.resourceGroupName = Output.empty();
        this.subnet = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections;
        private @Nullable Output<String> privateEndpointName;
        private @Nullable Output<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections;
        private Output<String> resourceGroupName;
        private @Nullable Output<SubnetArgs> subnet;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsConfigs = defaults.customDnsConfigs;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.privateLinkServiceConnections = defaults.privateLinkServiceConnections;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
        }

        public Builder customDnsConfigs(@Nullable Output<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs) {
            this.customDnsConfigs = customDnsConfigs;
            return this;
        }
        public Builder customDnsConfigs(@Nullable List<CustomDnsConfigPropertiesFormatArgs> customDnsConfigs) {
            this.customDnsConfigs = Output.ofNullable(customDnsConfigs);
            return this;
        }
        public Builder customDnsConfigs(CustomDnsConfigPropertiesFormatArgs... customDnsConfigs) {
            return customDnsConfigs(List.of(customDnsConfigs));
        }
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Output.ofNullable(extendedLocation);
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
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(@Nullable Output<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionArgs> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = Output.ofNullable(manualPrivateLinkServiceConnections);
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(PrivateLinkServiceConnectionArgs... manualPrivateLinkServiceConnections) {
            return manualPrivateLinkServiceConnections(List.of(manualPrivateLinkServiceConnections));
        }
        public Builder privateEndpointName(@Nullable Output<String> privateEndpointName) {
            this.privateEndpointName = privateEndpointName;
            return this;
        }
        public Builder privateEndpointName(@Nullable String privateEndpointName) {
            this.privateEndpointName = Output.ofNullable(privateEndpointName);
            return this;
        }
        public Builder privateLinkServiceConnections(@Nullable Output<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = privateLinkServiceConnections;
            return this;
        }
        public Builder privateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionArgs> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = Output.ofNullable(privateLinkServiceConnections);
            return this;
        }
        public Builder privateLinkServiceConnections(PrivateLinkServiceConnectionArgs... privateLinkServiceConnections) {
            return privateLinkServiceConnections(List.of(privateLinkServiceConnections));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder subnet(@Nullable Output<SubnetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable SubnetArgs subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public PrivateEndpointArgs build() {
            return new PrivateEndpointArgs(customDnsConfigs, extendedLocation, id, location, manualPrivateLinkServiceConnections, privateEndpointName, privateLinkServiceConnections, resourceGroupName, subnet, tags);
        }
    }
}
