// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceFabricArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceFabricArgs Empty = new ServiceFabricArgs();

    /**
     * The resource id of the environment under which the service fabric resource is present
     * 
     */
    @InputImport(name="environmentId")
      private final @Nullable Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId == null ? Input.empty() : this.environmentId;
    }

    /**
     * The backing service fabric resource's id
     * 
     */
    @InputImport(name="externalServiceFabricId")
      private final @Nullable Input<String> externalServiceFabricId;

    public Input<String> getExternalServiceFabricId() {
        return this.externalServiceFabricId == null ? Input.empty() : this.externalServiceFabricId;
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
      private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the service fabric.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the user profile.
     * 
     */
    @InputImport(name="userName", required=true)
      private final Input<String> userName;

    public Input<String> getUserName() {
        return this.userName;
    }

    public ServiceFabricArgs(
        @Nullable Input<String> environmentId,
        @Nullable Input<String> externalServiceFabricId,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> userName) {
        this.environmentId = environmentId;
        this.externalServiceFabricId = externalServiceFabricId;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ServiceFabricArgs() {
        this.environmentId = Input.empty();
        this.externalServiceFabricId = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceFabricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> environmentId;
        private @Nullable Input<String> externalServiceFabricId;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceFabricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.externalServiceFabricId = defaults.externalServiceFabricId;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder setEnvironmentId(@Nullable Input<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = Input.ofNullable(environmentId);
            return this;
        }

        public Builder setExternalServiceFabricId(@Nullable Input<String> externalServiceFabricId) {
            this.externalServiceFabricId = externalServiceFabricId;
            return this;
        }

        public Builder setExternalServiceFabricId(@Nullable String externalServiceFabricId) {
            this.externalServiceFabricId = Input.ofNullable(externalServiceFabricId);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
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

        public Builder setUserName(Input<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }
        public ServiceFabricArgs build() {
            return new ServiceFabricArgs(environmentId, externalServiceFabricId, labName, location, name, resourceGroupName, tags, userName);
        }
    }
}
