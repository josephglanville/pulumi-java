// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTaskRunArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTaskRunArgs Empty = new GetTaskRunArgs();

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
     * The name of the task run.
     * 
     */
    @InputImport(name="taskRunName", required=true)
      private final String taskRunName;

    public String getTaskRunName() {
        return this.taskRunName;
    }

    public GetTaskRunArgs(
        String registryName,
        String resourceGroupName,
        String taskRunName) {
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.taskRunName = Objects.requireNonNull(taskRunName, "expected parameter 'taskRunName' to be non-null");
    }

    private GetTaskRunArgs() {
        this.registryName = null;
        this.resourceGroupName = null;
        this.taskRunName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registryName;
        private String resourceGroupName;
        private String taskRunName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.taskRunName = defaults.taskRunName;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTaskRunName(String taskRunName) {
            this.taskRunName = Objects.requireNonNull(taskRunName);
            return this;
        }
        public GetTaskRunArgs build() {
            return new GetTaskRunArgs(registryName, resourceGroupName, taskRunName);
        }
    }
}
