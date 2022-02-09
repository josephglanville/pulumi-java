// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.inputs.DeploymentPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentAtManagementGroupScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentAtManagementGroupScopeArgs Empty = new DeploymentAtManagementGroupScopeArgs();

    @InputImport(name="deploymentName")
    private final @Nullable Input<String> deploymentName;

    public Input<String> getDeploymentName() {
        return this.deploymentName == null ? Input.empty() : this.deploymentName;
    }

    @InputImport(name="groupId", required=true)
    private final Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties", required=true)
    private final Input<DeploymentPropertiesArgs> properties;

    public Input<DeploymentPropertiesArgs> getProperties() {
        return this.properties;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DeploymentAtManagementGroupScopeArgs(
        @Nullable Input<String> deploymentName,
        Input<String> groupId,
        @Nullable Input<String> location,
        Input<DeploymentPropertiesArgs> properties,
        @Nullable Input<Map<String,String>> tags) {
        this.deploymentName = deploymentName;
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.tags = tags;
    }

    private DeploymentAtManagementGroupScopeArgs() {
        this.deploymentName = Input.empty();
        this.groupId = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentAtManagementGroupScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deploymentName;
        private Input<String> groupId;
        private @Nullable Input<String> location;
        private Input<DeploymentPropertiesArgs> properties;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentAtManagementGroupScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.groupId = defaults.groupId;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder setDeploymentName(@Nullable Input<String> deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        public Builder setDeploymentName(@Nullable String deploymentName) {
            this.deploymentName = Input.ofNullable(deploymentName);
            return this;
        }

        public Builder setGroupId(Input<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder setGroupId(String groupId) {
            this.groupId = Input.of(Objects.requireNonNull(groupId));
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

        public Builder setProperties(Input<DeploymentPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(DeploymentPropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public DeploymentAtManagementGroupScopeArgs build() {
            return new DeploymentAtManagementGroupScopeArgs(deploymentName, groupId, location, properties, tags);
        }
    }
}
