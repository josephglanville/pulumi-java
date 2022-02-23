// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkSecurityPerimeterArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkSecurityPerimeterArgs Empty = new NetworkSecurityPerimeterArgs();

    /**
     * A description of the network security perimeter.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A friendly name for the network security perimeter.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

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
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the network security perimeter.
     * 
     */
    @InputImport(name="networkSecurityPerimeterName")
      private final @Nullable Input<String> networkSecurityPerimeterName;

    public Input<String> getNetworkSecurityPerimeterName() {
        return this.networkSecurityPerimeterName == null ? Input.empty() : this.networkSecurityPerimeterName;
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
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public NetworkSecurityPerimeterArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> networkSecurityPerimeterName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.networkSecurityPerimeterName = networkSecurityPerimeterName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private NetworkSecurityPerimeterArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.networkSecurityPerimeterName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityPerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> networkSecurityPerimeterName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityPerimeterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkSecurityPerimeterName = defaults.networkSecurityPerimeterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkSecurityPerimeterName(@Nullable Input<String> networkSecurityPerimeterName) {
            this.networkSecurityPerimeterName = networkSecurityPerimeterName;
            return this;
        }

        public Builder setNetworkSecurityPerimeterName(@Nullable String networkSecurityPerimeterName) {
            this.networkSecurityPerimeterName = Input.ofNullable(networkSecurityPerimeterName);
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
        public NetworkSecurityPerimeterArgs build() {
            return new NetworkSecurityPerimeterArgs(description, displayName, id, location, name, networkSecurityPerimeterName, resourceGroupName, tags);
        }
    }
}
