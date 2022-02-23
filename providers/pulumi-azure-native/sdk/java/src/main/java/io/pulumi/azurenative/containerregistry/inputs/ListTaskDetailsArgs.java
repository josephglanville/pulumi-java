// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListTaskDetailsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListTaskDetailsArgs Empty = new ListTaskDetailsArgs();

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
      private final String registryName;

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the container registry task.
     * 
     */
    @InputImport(name="taskName", required=true)
      private final String taskName;

    public String getTaskName() {
        return this.taskName;
    }

    public ListTaskDetailsArgs(
        String registryName,
        String resourceGroupName,
        String taskName) {
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.taskName = Objects.requireNonNull(taskName, "expected parameter 'taskName' to be non-null");
    }

    private ListTaskDetailsArgs() {
        this.registryName = null;
        this.resourceGroupName = null;
        this.taskName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTaskDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registryName;
        private String resourceGroupName;
        private String taskName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTaskDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.taskName = defaults.taskName;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTaskName(String taskName) {
            this.taskName = Objects.requireNonNull(taskName);
            return this;
        }
        public ListTaskDetailsArgs build() {
            return new ListTaskDetailsArgs(registryName, resourceGroupName, taskName);
        }
    }
}
