// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationGetArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationGetArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeGetArgs Empty = new TaskDefinitionVolumeGetArgs();

    /**
     * Configuration block to configure a docker volume. Detailed below.
     * 
     */
    @InputImport(name="dockerVolumeConfiguration")
      private final @Nullable Output<TaskDefinitionVolumeDockerVolumeConfigurationGetArgs> dockerVolumeConfiguration;

    public Output<TaskDefinitionVolumeDockerVolumeConfigurationGetArgs> getDockerVolumeConfiguration() {
        return this.dockerVolumeConfiguration == null ? Output.empty() : this.dockerVolumeConfiguration;
    }

    /**
     * Configuration block for an EFS volume. Detailed below.
     * 
     */
    @InputImport(name="efsVolumeConfiguration")
      private final @Nullable Output<TaskDefinitionVolumeEfsVolumeConfigurationGetArgs> efsVolumeConfiguration;

    public Output<TaskDefinitionVolumeEfsVolumeConfigurationGetArgs> getEfsVolumeConfiguration() {
        return this.efsVolumeConfiguration == null ? Output.empty() : this.efsVolumeConfiguration;
    }

    /**
     * Configuration block for an FSX Windows File Server volume. Detailed below.
     * 
     */
    @InputImport(name="fsxWindowsFileServerVolumeConfiguration")
      private final @Nullable Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationGetArgs> fsxWindowsFileServerVolumeConfiguration;

    public Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationGetArgs> getFsxWindowsFileServerVolumeConfiguration() {
        return this.fsxWindowsFileServerVolumeConfiguration == null ? Output.empty() : this.fsxWindowsFileServerVolumeConfiguration;
    }

    /**
     * Path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
     * 
     */
    @InputImport(name="hostPath")
      private final @Nullable Output<String> hostPath;

    public Output<String> getHostPath() {
        return this.hostPath == null ? Output.empty() : this.hostPath;
    }

    /**
     * Name of the volume. This name is referenced in the `sourceVolume`
     * parameter of container definition in the `mountPoints` section.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public TaskDefinitionVolumeGetArgs(
        @Nullable Output<TaskDefinitionVolumeDockerVolumeConfigurationGetArgs> dockerVolumeConfiguration,
        @Nullable Output<TaskDefinitionVolumeEfsVolumeConfigurationGetArgs> efsVolumeConfiguration,
        @Nullable Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationGetArgs> fsxWindowsFileServerVolumeConfiguration,
        @Nullable Output<String> hostPath,
        Output<String> name) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        this.efsVolumeConfiguration = efsVolumeConfiguration;
        this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
        this.hostPath = hostPath;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private TaskDefinitionVolumeGetArgs() {
        this.dockerVolumeConfiguration = Output.empty();
        this.efsVolumeConfiguration = Output.empty();
        this.fsxWindowsFileServerVolumeConfiguration = Output.empty();
        this.hostPath = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TaskDefinitionVolumeDockerVolumeConfigurationGetArgs> dockerVolumeConfiguration;
        private @Nullable Output<TaskDefinitionVolumeEfsVolumeConfigurationGetArgs> efsVolumeConfiguration;
        private @Nullable Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationGetArgs> fsxWindowsFileServerVolumeConfiguration;
        private @Nullable Output<String> hostPath;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockerVolumeConfiguration = defaults.dockerVolumeConfiguration;
    	      this.efsVolumeConfiguration = defaults.efsVolumeConfiguration;
    	      this.fsxWindowsFileServerVolumeConfiguration = defaults.fsxWindowsFileServerVolumeConfiguration;
    	      this.hostPath = defaults.hostPath;
    	      this.name = defaults.name;
        }

        public Builder dockerVolumeConfiguration(@Nullable Output<TaskDefinitionVolumeDockerVolumeConfigurationGetArgs> dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = dockerVolumeConfiguration;
            return this;
        }

        public Builder dockerVolumeConfiguration(@Nullable TaskDefinitionVolumeDockerVolumeConfigurationGetArgs dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = Output.ofNullable(dockerVolumeConfiguration);
            return this;
        }

        public Builder efsVolumeConfiguration(@Nullable Output<TaskDefinitionVolumeEfsVolumeConfigurationGetArgs> efsVolumeConfiguration) {
            this.efsVolumeConfiguration = efsVolumeConfiguration;
            return this;
        }

        public Builder efsVolumeConfiguration(@Nullable TaskDefinitionVolumeEfsVolumeConfigurationGetArgs efsVolumeConfiguration) {
            this.efsVolumeConfiguration = Output.ofNullable(efsVolumeConfiguration);
            return this;
        }

        public Builder fsxWindowsFileServerVolumeConfiguration(@Nullable Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationGetArgs> fsxWindowsFileServerVolumeConfiguration) {
            this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
            return this;
        }

        public Builder fsxWindowsFileServerVolumeConfiguration(@Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationGetArgs fsxWindowsFileServerVolumeConfiguration) {
            this.fsxWindowsFileServerVolumeConfiguration = Output.ofNullable(fsxWindowsFileServerVolumeConfiguration);
            return this;
        }

        public Builder hostPath(@Nullable Output<String> hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        public Builder hostPath(@Nullable String hostPath) {
            this.hostPath = Output.ofNullable(hostPath);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public TaskDefinitionVolumeGetArgs build() {
            return new TaskDefinitionVolumeGetArgs(dockerVolumeConfiguration, efsVolumeConfiguration, fsxWindowsFileServerVolumeConfiguration, hostPath, name);
        }
    }
}
