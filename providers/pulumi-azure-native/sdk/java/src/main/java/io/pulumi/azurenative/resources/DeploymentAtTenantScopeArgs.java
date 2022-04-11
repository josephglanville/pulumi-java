// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.inputs.DeploymentPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentAtTenantScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentAtTenantScopeArgs Empty = new DeploymentAtTenantScopeArgs();

    /**
     * The name of the deployment.
     * 
     */
    @Import(name="deploymentName")
      private final @Nullable Output<String> deploymentName;

    public Output<String> getDeploymentName() {
        return this.deploymentName == null ? Codegen.empty() : this.deploymentName;
    }

    /**
     * The location to store the deployment data.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The deployment properties.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<DeploymentPropertiesArgs> properties;

    public Output<DeploymentPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * Deployment tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DeploymentAtTenantScopeArgs(
        @Nullable Output<String> deploymentName,
        @Nullable Output<String> location,
        Output<DeploymentPropertiesArgs> properties,
        @Nullable Output<Map<String,String>> tags) {
        this.deploymentName = deploymentName;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.tags = tags;
    }

    private DeploymentAtTenantScopeArgs() {
        this.deploymentName = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentAtTenantScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deploymentName;
        private @Nullable Output<String> location;
        private Output<DeploymentPropertiesArgs> properties;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentAtTenantScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public Builder deploymentName(@Nullable String deploymentName) {
            this.deploymentName = Codegen.ofNullable(deploymentName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(Output<DeploymentPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(DeploymentPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DeploymentAtTenantScopeArgs build() {
            return new DeploymentAtTenantScopeArgs(deploymentName, location, properties, tags);
        }
    }
}
