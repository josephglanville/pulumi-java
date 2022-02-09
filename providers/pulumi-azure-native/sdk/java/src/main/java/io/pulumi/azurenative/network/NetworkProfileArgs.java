// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ContainerNetworkInterfaceConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    @InputImport(name="containerNetworkInterfaceConfigurations")
    private final @Nullable Input<List<ContainerNetworkInterfaceConfigurationArgs>> containerNetworkInterfaceConfigurations;

    public Input<List<ContainerNetworkInterfaceConfigurationArgs>> getContainerNetworkInterfaceConfigurations() {
        return this.containerNetworkInterfaceConfigurations == null ? Input.empty() : this.containerNetworkInterfaceConfigurations;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="networkProfileName")
    private final @Nullable Input<String> networkProfileName;

    public Input<String> getNetworkProfileName() {
        return this.networkProfileName == null ? Input.empty() : this.networkProfileName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public NetworkProfileArgs(
        @Nullable Input<List<ContainerNetworkInterfaceConfigurationArgs>> containerNetworkInterfaceConfigurations,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<String> networkProfileName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
        this.id = id;
        this.location = location;
        this.networkProfileName = networkProfileName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private NetworkProfileArgs() {
        this.containerNetworkInterfaceConfigurations = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.networkProfileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ContainerNetworkInterfaceConfigurationArgs>> containerNetworkInterfaceConfigurations;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<String> networkProfileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerNetworkInterfaceConfigurations = defaults.containerNetworkInterfaceConfigurations;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.networkProfileName = defaults.networkProfileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setContainerNetworkInterfaceConfigurations(@Nullable Input<List<ContainerNetworkInterfaceConfigurationArgs>> containerNetworkInterfaceConfigurations) {
            this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
            return this;
        }

        public Builder setContainerNetworkInterfaceConfigurations(@Nullable List<ContainerNetworkInterfaceConfigurationArgs> containerNetworkInterfaceConfigurations) {
            this.containerNetworkInterfaceConfigurations = Input.ofNullable(containerNetworkInterfaceConfigurations);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setNetworkProfileName(@Nullable Input<String> networkProfileName) {
            this.networkProfileName = networkProfileName;
            return this;
        }

        public Builder setNetworkProfileName(@Nullable String networkProfileName) {
            this.networkProfileName = Input.ofNullable(networkProfileName);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(containerNetworkInterfaceConfigurations, id, location, networkProfileName, resourceGroupName, tags);
        }
    }
}
