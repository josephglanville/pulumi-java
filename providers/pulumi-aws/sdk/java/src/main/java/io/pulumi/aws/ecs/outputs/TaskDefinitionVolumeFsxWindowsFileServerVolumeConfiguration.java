// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.aws.ecs.outputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration {
    /**
     * Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * 
     */
    private final TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfig authorizationConfig;
    /**
     * The Amazon FSx for Windows File Server file system ID to use.
     * 
     */
    private final String fileSystemId;
    /**
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the host.
     * 
     */
    private final String rootDirectory;

    @OutputCustomType.Constructor
    private TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration(
        @OutputCustomType.Parameter("authorizationConfig") TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfig authorizationConfig,
        @OutputCustomType.Parameter("fileSystemId") String fileSystemId,
        @OutputCustomType.Parameter("rootDirectory") String rootDirectory) {
        this.authorizationConfig = authorizationConfig;
        this.fileSystemId = fileSystemId;
        this.rootDirectory = rootDirectory;
    }

    /**
     * Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * 
    */
    public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfig getAuthorizationConfig() {
        return this.authorizationConfig;
    }
    /**
     * The Amazon FSx for Windows File Server file system ID to use.
     * 
    */
    public String getFileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the host.
     * 
    */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfig authorizationConfig;
        private String fileSystemId;
        private String rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationConfig = defaults.authorizationConfig;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder setAuthorizationConfig(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfig authorizationConfig) {
            this.authorizationConfig = Objects.requireNonNull(authorizationConfig);
            return this;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder setRootDirectory(String rootDirectory) {
            this.rootDirectory = Objects.requireNonNull(rootDirectory);
            return this;
        }
        public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration build() {
            return new TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration(authorizationConfig, fileSystemId, rootDirectory);
        }
    }
}
