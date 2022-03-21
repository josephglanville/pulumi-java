// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.aws.ecs.outputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionVolumeEfsVolumeConfiguration {
    /**
     * Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * 
     */
    private final @Nullable TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig authorizationConfig;
    /**
     * The Amazon FSx for Windows File Server file system ID to use.
     * 
     */
    private final String fileSystemId;
    /**
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the host.
     * 
     */
    private final @Nullable String rootDirectory;
    /**
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
     * 
     */
    private final @Nullable String transitEncryption;
    /**
     * Port to use for transit encryption. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
     * 
     */
    private final @Nullable Integer transitEncryptionPort;

    @CustomType.Constructor
    private TaskDefinitionVolumeEfsVolumeConfiguration(
        @CustomType.Parameter("authorizationConfig") @Nullable TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig authorizationConfig,
        @CustomType.Parameter("fileSystemId") String fileSystemId,
        @CustomType.Parameter("rootDirectory") @Nullable String rootDirectory,
        @CustomType.Parameter("transitEncryption") @Nullable String transitEncryption,
        @CustomType.Parameter("transitEncryptionPort") @Nullable Integer transitEncryptionPort) {
        this.authorizationConfig = authorizationConfig;
        this.fileSystemId = fileSystemId;
        this.rootDirectory = rootDirectory;
        this.transitEncryption = transitEncryption;
        this.transitEncryptionPort = transitEncryptionPort;
    }

    /**
     * Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * 
    */
    public Optional<TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig> getAuthorizationConfig() {
        return Optional.ofNullable(this.authorizationConfig);
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
    public Optional<String> getRootDirectory() {
        return Optional.ofNullable(this.rootDirectory);
    }
    /**
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
     * 
    */
    public Optional<String> getTransitEncryption() {
        return Optional.ofNullable(this.transitEncryption);
    }
    /**
     * Port to use for transit encryption. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
     * 
    */
    public Optional<Integer> getTransitEncryptionPort() {
        return Optional.ofNullable(this.transitEncryptionPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeEfsVolumeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig authorizationConfig;
        private String fileSystemId;
        private @Nullable String rootDirectory;
        private @Nullable String transitEncryption;
        private @Nullable Integer transitEncryptionPort;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeEfsVolumeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationConfig = defaults.authorizationConfig;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.rootDirectory = defaults.rootDirectory;
    	      this.transitEncryption = defaults.transitEncryption;
    	      this.transitEncryptionPort = defaults.transitEncryptionPort;
        }

        public Builder authorizationConfig(@Nullable TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig authorizationConfig) {
            this.authorizationConfig = authorizationConfig;
            return this;
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public Builder rootDirectory(@Nullable String rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }
        public Builder transitEncryption(@Nullable String transitEncryption) {
            this.transitEncryption = transitEncryption;
            return this;
        }
        public Builder transitEncryptionPort(@Nullable Integer transitEncryptionPort) {
            this.transitEncryptionPort = transitEncryptionPort;
            return this;
        }        public TaskDefinitionVolumeEfsVolumeConfiguration build() {
            return new TaskDefinitionVolumeEfsVolumeConfiguration(authorizationConfig, fileSystemId, rootDirectory, transitEncryption, transitEncryptionPort);
        }
    }
}
