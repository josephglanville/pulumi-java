// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.CollectorPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HyperVCollectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final HyperVCollectorArgs Empty = new HyperVCollectorArgs();

    @InputImport(name="eTag")
      private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Unique name of a Hyper-V collector within a project.
     * 
     */
    @InputImport(name="hyperVCollectorName")
      private final @Nullable Input<String> hyperVCollectorName;

    public Input<String> getHyperVCollectorName() {
        return this.hyperVCollectorName == null ? Input.empty() : this.hyperVCollectorName;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @InputImport(name="projectName", required=true)
      private final Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName;
    }

    @InputImport(name="properties")
      private final @Nullable Input<CollectorPropertiesArgs> properties;

    public Input<CollectorPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public HyperVCollectorArgs(
        @Nullable Input<String> eTag,
        @Nullable Input<String> hyperVCollectorName,
        Input<String> projectName,
        @Nullable Input<CollectorPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.eTag = eTag;
        this.hyperVCollectorName = hyperVCollectorName;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private HyperVCollectorArgs() {
        this.eTag = Input.empty();
        this.hyperVCollectorName = Input.empty();
        this.projectName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eTag;
        private @Nullable Input<String> hyperVCollectorName;
        private Input<String> projectName;
        private @Nullable Input<CollectorPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.hyperVCollectorName = defaults.hyperVCollectorName;
    	      this.projectName = defaults.projectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setHyperVCollectorName(@Nullable Input<String> hyperVCollectorName) {
            this.hyperVCollectorName = hyperVCollectorName;
            return this;
        }

        public Builder setHyperVCollectorName(@Nullable String hyperVCollectorName) {
            this.hyperVCollectorName = Input.ofNullable(hyperVCollectorName);
            return this;
        }

        public Builder setProjectName(Input<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Input.of(Objects.requireNonNull(projectName));
            return this;
        }

        public Builder setProperties(@Nullable Input<CollectorPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable CollectorPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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
        public HyperVCollectorArgs build() {
            return new HyperVCollectorArgs(eTag, hyperVCollectorName, projectName, properties, resourceGroupName);
        }
    }
}
