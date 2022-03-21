// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.ContainerWorkingDirectory;
import io.pulumi.azurenative.batch.inputs.ContainerRegistryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskContainerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskContainerSettingsArgs Empty = new TaskContainerSettingsArgs();

    /**
     * These additional options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch Service.
     * 
     */
    @Import(name="containerRunOptions")
      private final @Nullable Output<String> containerRunOptions;

    public Output<String> getContainerRunOptions() {
        return this.containerRunOptions == null ? Output.empty() : this.containerRunOptions;
    }

    /**
     * This is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the image name, the tag ":latest" is used as a default.
     * 
     */
    @Import(name="imageName", required=true)
      private final Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName;
    }

    /**
     * This setting can be omitted if was already provided at pool creation.
     * 
     */
    @Import(name="registry")
      private final @Nullable Output<ContainerRegistryArgs> registry;

    public Output<ContainerRegistryArgs> getRegistry() {
        return this.registry == null ? Output.empty() : this.registry;
    }

    @Import(name="workingDirectory")
      private final @Nullable Output<ContainerWorkingDirectory> workingDirectory;

    public Output<ContainerWorkingDirectory> getWorkingDirectory() {
        return this.workingDirectory == null ? Output.empty() : this.workingDirectory;
    }

    public TaskContainerSettingsArgs(
        @Nullable Output<String> containerRunOptions,
        Output<String> imageName,
        @Nullable Output<ContainerRegistryArgs> registry,
        @Nullable Output<ContainerWorkingDirectory> workingDirectory) {
        this.containerRunOptions = containerRunOptions;
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
        this.registry = registry;
        this.workingDirectory = workingDirectory;
    }

    private TaskContainerSettingsArgs() {
        this.containerRunOptions = Output.empty();
        this.imageName = Output.empty();
        this.registry = Output.empty();
        this.workingDirectory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskContainerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerRunOptions;
        private Output<String> imageName;
        private @Nullable Output<ContainerRegistryArgs> registry;
        private @Nullable Output<ContainerWorkingDirectory> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskContainerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerRunOptions = defaults.containerRunOptions;
    	      this.imageName = defaults.imageName;
    	      this.registry = defaults.registry;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder containerRunOptions(@Nullable Output<String> containerRunOptions) {
            this.containerRunOptions = containerRunOptions;
            return this;
        }
        public Builder containerRunOptions(@Nullable String containerRunOptions) {
            this.containerRunOptions = Output.ofNullable(containerRunOptions);
            return this;
        }
        public Builder imageName(Output<String> imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder imageName(String imageName) {
            this.imageName = Output.of(Objects.requireNonNull(imageName));
            return this;
        }
        public Builder registry(@Nullable Output<ContainerRegistryArgs> registry) {
            this.registry = registry;
            return this;
        }
        public Builder registry(@Nullable ContainerRegistryArgs registry) {
            this.registry = Output.ofNullable(registry);
            return this;
        }
        public Builder workingDirectory(@Nullable Output<ContainerWorkingDirectory> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }
        public Builder workingDirectory(@Nullable ContainerWorkingDirectory workingDirectory) {
            this.workingDirectory = Output.ofNullable(workingDirectory);
            return this;
        }        public TaskContainerSettingsArgs build() {
            return new TaskContainerSettingsArgs(containerRunOptions, imageName, registry, workingDirectory);
        }
    }
}
