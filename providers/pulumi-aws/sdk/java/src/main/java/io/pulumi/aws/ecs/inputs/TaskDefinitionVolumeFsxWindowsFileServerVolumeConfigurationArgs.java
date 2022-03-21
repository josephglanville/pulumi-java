// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs Empty = new TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs();

    /**
     * Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * 
     */
    @Import(name="authorizationConfig", required=true)
      private final Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs> authorizationConfig;

    public Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs> getAuthorizationConfig() {
        return this.authorizationConfig;
    }

    /**
     * The Amazon FSx for Windows File Server file system ID to use.
     * 
     */
    @Import(name="fileSystemId", required=true)
      private final Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the host.
     * 
     */
    @Import(name="rootDirectory", required=true)
      private final Output<String> rootDirectory;

    public Output<String> getRootDirectory() {
        return this.rootDirectory;
    }

    public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs(
        Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs> authorizationConfig,
        Output<String> fileSystemId,
        Output<String> rootDirectory) {
        this.authorizationConfig = Objects.requireNonNull(authorizationConfig, "expected parameter 'authorizationConfig' to be non-null");
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.rootDirectory = Objects.requireNonNull(rootDirectory, "expected parameter 'rootDirectory' to be non-null");
    }

    private TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs() {
        this.authorizationConfig = Output.empty();
        this.fileSystemId = Output.empty();
        this.rootDirectory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs> authorizationConfig;
        private Output<String> fileSystemId;
        private Output<String> rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationConfig = defaults.authorizationConfig;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder authorizationConfig(Output<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs> authorizationConfig) {
            this.authorizationConfig = Objects.requireNonNull(authorizationConfig);
            return this;
        }
        public Builder authorizationConfig(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs authorizationConfig) {
            this.authorizationConfig = Output.of(Objects.requireNonNull(authorizationConfig));
            return this;
        }
        public Builder fileSystemId(Output<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Output.of(Objects.requireNonNull(fileSystemId));
            return this;
        }
        public Builder rootDirectory(Output<String> rootDirectory) {
            this.rootDirectory = Objects.requireNonNull(rootDirectory);
            return this;
        }
        public Builder rootDirectory(String rootDirectory) {
            this.rootDirectory = Output.of(Objects.requireNonNull(rootDirectory));
            return this;
        }        public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs build() {
            return new TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs(authorizationConfig, fileSystemId, rootDirectory);
        }
    }
}
