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


public final class DeploymentAtScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentAtScopeArgs Empty = new DeploymentAtScopeArgs();

    @InputImport(name="deploymentName")
    private final @Nullable Input<String> deploymentName;

    public Input<String> getDeploymentName() {
        return this.deploymentName == null ? Input.empty() : this.deploymentName;
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

    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DeploymentAtScopeArgs(
        @Nullable Input<String> deploymentName,
        @Nullable Input<String> location,
        Input<DeploymentPropertiesArgs> properties,
        Input<String> scope,
        @Nullable Input<Map<String,String>> tags) {
        this.deploymentName = deploymentName;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
    }

    private DeploymentAtScopeArgs() {
        this.deploymentName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.scope = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentAtScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deploymentName;
        private @Nullable Input<String> location;
        private Input<DeploymentPropertiesArgs> properties;
        private Input<String> scope;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentAtScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.scope = defaults.scope;
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

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
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

        public DeploymentAtScopeArgs build() {
            return new DeploymentAtScopeArgs(deploymentName, location, properties, scope, tags);
        }
    }
}
