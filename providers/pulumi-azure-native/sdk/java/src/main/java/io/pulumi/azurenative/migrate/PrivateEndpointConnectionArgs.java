// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.PrivateEndpointConnectionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * For optimistic concurrency control.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Output.empty() : this.eTag;
    }

    /**
     * Unique name of a private endpoint connection within a project.
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Output.empty() : this.privateEndpointConnectionName;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
      private final Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName;
    }

    /**
     * Properties of the private endpoint endpoint connection.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<PrivateEndpointConnectionPropertiesArgs> properties;

    public Output<PrivateEndpointConnectionPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Output<String> eTag,
        @Nullable Output<String> privateEndpointConnectionName,
        Output<String> projectName,
        Output<PrivateEndpointConnectionPropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.eTag = eTag;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.eTag = Output.empty();
        this.privateEndpointConnectionName = Output.empty();
        this.projectName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private @Nullable Output<String> privateEndpointConnectionName;
        private Output<String> projectName;
        private Output<PrivateEndpointConnectionPropertiesArgs> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.projectName = defaults.projectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Output.ofNullable(eTag);
            return this;
        }
        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }
        public Builder privateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Output.ofNullable(privateEndpointConnectionName);
            return this;
        }
        public Builder projectName(Output<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }
        public Builder projectName(String projectName) {
            this.projectName = Output.of(Objects.requireNonNull(projectName));
            return this;
        }
        public Builder properties(Output<PrivateEndpointConnectionPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(PrivateEndpointConnectionPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(eTag, privateEndpointConnectionName, projectName, properties, resourceGroupName);
        }
    }
}
