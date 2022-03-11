// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.WindowsFileSystemAuditLogConfigurationGetArgs;
import io.pulumi.aws.fsx.inputs.WindowsFileSystemSelfManagedActiveDirectoryGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsFileSystemState extends io.pulumi.resources.ResourceArgs {

    public static final WindowsFileSystemState Empty = new WindowsFileSystemState();

    /**
     * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `self_managed_active_directory`.
     * 
     */
    @InputImport(name="activeDirectoryId")
      private final @Nullable Output<String> activeDirectoryId;

    public Output<String> getActiveDirectoryId() {
        return this.activeDirectoryId == null ? Output.empty() : this.activeDirectoryId;
    }

    /**
     * An array DNS alias names that you want to associate with the Amazon FSx file system.  For more information, see [Working with DNS Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html)
     * 
     */
    @InputImport(name="aliases")
      private final @Nullable Output<List<String>> aliases;

    public Output<List<String>> getAliases() {
        return this.aliases == null ? Output.empty() : this.aliases;
    }

    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file system. See below.
     * 
     */
    @InputImport(name="auditLogConfiguration")
      private final @Nullable Output<WindowsFileSystemAuditLogConfigurationGetArgs> auditLogConfiguration;

    public Output<WindowsFileSystemAuditLogConfigurationGetArgs> getAuditLogConfiguration() {
        return this.auditLogConfiguration == null ? Output.empty() : this.auditLogConfiguration;
    }

    /**
     * The number of days to retain automatic backups. Minimum of `0` and maximum of `90`. Defaults to `7`. Set to `0` to disable.
     * 
     */
    @InputImport(name="automaticBackupRetentionDays")
      private final @Nullable Output<Integer> automaticBackupRetentionDays;

    public Output<Integer> getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays == null ? Output.empty() : this.automaticBackupRetentionDays;
    }

    /**
     * The ID of the source backup to create the filesystem from.
     * 
     */
    @InputImport(name="backupId")
      private final @Nullable Output<String> backupId;

    public Output<String> getBackupId() {
        return this.backupId == null ? Output.empty() : this.backupId;
    }

    /**
     * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
     * 
     */
    @InputImport(name="copyTagsToBackups")
      private final @Nullable Output<Boolean> copyTagsToBackups;

    public Output<Boolean> getCopyTagsToBackups() {
        return this.copyTagsToBackups == null ? Output.empty() : this.copyTagsToBackups;
    }

    /**
     * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
     * 
     */
    @InputImport(name="dailyAutomaticBackupStartTime")
      private final @Nullable Output<String> dailyAutomaticBackupStartTime;

    public Output<String> getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime == null ? Output.empty() : this.dailyAutomaticBackupStartTime;
    }

    /**
     * Specifies the file system deployment type, valid values are `MULTI_AZ_1`, `SINGLE_AZ_1` and `SINGLE_AZ_2`. Default value is `SINGLE_AZ_1`.
     * 
     */
    @InputImport(name="deploymentType")
      private final @Nullable Output<String> deploymentType;

    public Output<String> getDeploymentType() {
        return this.deploymentType == null ? Output.empty() : this.deploymentType;
    }

    /**
     * DNS name for the file system, e.g., `fs-12345678.corp.example.com` (domain name matching the Active Directory domain name)
     * 
     */
    @InputImport(name="dnsName")
      private final @Nullable Output<String> dnsName;

    public Output<String> getDnsName() {
        return this.dnsName == null ? Output.empty() : this.dnsName;
    }

    /**
     * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible.
     * 
     */
    @InputImport(name="networkInterfaceIds")
      private final @Nullable Output<List<String>> networkInterfaceIds;

    public Output<List<String>> getNetworkInterfaceIds() {
        return this.networkInterfaceIds == null ? Output.empty() : this.networkInterfaceIds;
    }

    /**
     * AWS account identifier that created the file system.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * The IP address of the primary, or preferred, file server.
     * 
     */
    @InputImport(name="preferredFileServerIp")
      private final @Nullable Output<String> preferredFileServerIp;

    public Output<String> getPreferredFileServerIp() {
        return this.preferredFileServerIp == null ? Output.empty() : this.preferredFileServerIp;
    }

    /**
     * Specifies the subnet in which you want the preferred file server to be located. Required for when deployment type is `MULTI_AZ_1`.
     * 
     */
    @InputImport(name="preferredSubnetId")
      private final @Nullable Output<String> preferredSubnetId;

    public Output<String> getPreferredSubnetId() {
        return this.preferredSubnetId == null ? Output.empty() : this.preferredSubnetId;
    }

    /**
     * For `MULTI_AZ_1` deployment types, use this endpoint when performing administrative tasks on the file system using Amazon FSx Remote PowerShell. For `SINGLE_AZ_1` deployment types, this is the DNS name of the file system.
     * 
     */
    @InputImport(name="remoteAdministrationEndpoint")
      private final @Nullable Output<String> remoteAdministrationEndpoint;

    public Output<String> getRemoteAdministrationEndpoint() {
        return this.remoteAdministrationEndpoint == null ? Output.empty() : this.remoteAdministrationEndpoint;
    }

    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `active_directory_id`. Detailed below.
     * 
     */
    @InputImport(name="selfManagedActiveDirectory")
      private final @Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryGetArgs> selfManagedActiveDirectory;

    public Output<WindowsFileSystemSelfManagedActiveDirectoryGetArgs> getSelfManagedActiveDirectory() {
        return this.selfManagedActiveDirectory == null ? Output.empty() : this.selfManagedActiveDirectory;
    }

    /**
     * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
     * 
     */
    @InputImport(name="skipFinalBackup")
      private final @Nullable Output<Boolean> skipFinalBackup;

    public Output<Boolean> getSkipFinalBackup() {
        return this.skipFinalBackup == null ? Output.empty() : this.skipFinalBackup;
    }

    /**
     * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536. If the storage type is set to `HDD` the minimum value is 2000. Required when not creating filesystem for a backup.
     * 
     */
    @InputImport(name="storageCapacity")
      private final @Nullable Output<Integer> storageCapacity;

    public Output<Integer> getStorageCapacity() {
        return this.storageCapacity == null ? Output.empty() : this.storageCapacity;
    }

    /**
     * Specifies the storage type, Valid values are `SSD` and `HDD`. `HDD` is supported on `SINGLE_AZ_2` and `MULTI_AZ_1` Windows file system deployment types. Default value is `SSD`.
     * 
     */
    @InputImport(name="storageType")
      private final @Nullable Output<String> storageType;

    public Output<String> getStorageType() {
        return this.storageType == null ? Output.empty() : this.storageType;
    }

    /**
     * A list of IDs for the subnets that the file system will be accessible from. To specify more than a single subnet set `deployment_type` to `MULTI_AZ_1`.
     * 
     */
    @InputImport(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Output.empty() : this.subnetIds;
    }

    /**
     * A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
     * 
     */
    @InputImport(name="throughputCapacity")
      private final @Nullable Output<Integer> throughputCapacity;

    public Output<Integer> getThroughputCapacity() {
        return this.throughputCapacity == null ? Output.empty() : this.throughputCapacity;
    }

    /**
     * Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @InputImport(name="weeklyMaintenanceStartTime")
      private final @Nullable Output<String> weeklyMaintenanceStartTime;

    public Output<String> getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime == null ? Output.empty() : this.weeklyMaintenanceStartTime;
    }

    public WindowsFileSystemState(
        @Nullable Output<String> activeDirectoryId,
        @Nullable Output<List<String>> aliases,
        @Nullable Output<String> arn,
        @Nullable Output<WindowsFileSystemAuditLogConfigurationGetArgs> auditLogConfiguration,
        @Nullable Output<Integer> automaticBackupRetentionDays,
        @Nullable Output<String> backupId,
        @Nullable Output<Boolean> copyTagsToBackups,
        @Nullable Output<String> dailyAutomaticBackupStartTime,
        @Nullable Output<String> deploymentType,
        @Nullable Output<String> dnsName,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<List<String>> networkInterfaceIds,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> preferredFileServerIp,
        @Nullable Output<String> preferredSubnetId,
        @Nullable Output<String> remoteAdministrationEndpoint,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryGetArgs> selfManagedActiveDirectory,
        @Nullable Output<Boolean> skipFinalBackup,
        @Nullable Output<Integer> storageCapacity,
        @Nullable Output<String> storageType,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Integer> throughputCapacity,
        @Nullable Output<String> vpcId,
        @Nullable Output<String> weeklyMaintenanceStartTime) {
        this.activeDirectoryId = activeDirectoryId;
        this.aliases = aliases;
        this.arn = arn;
        this.auditLogConfiguration = auditLogConfiguration;
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        this.backupId = backupId;
        this.copyTagsToBackups = copyTagsToBackups;
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        this.deploymentType = deploymentType;
        this.dnsName = dnsName;
        this.kmsKeyId = kmsKeyId;
        this.networkInterfaceIds = networkInterfaceIds;
        this.ownerId = ownerId;
        this.preferredFileServerIp = preferredFileServerIp;
        this.preferredSubnetId = preferredSubnetId;
        this.remoteAdministrationEndpoint = remoteAdministrationEndpoint;
        this.securityGroupIds = securityGroupIds;
        this.selfManagedActiveDirectory = selfManagedActiveDirectory;
        this.skipFinalBackup = skipFinalBackup;
        this.storageCapacity = storageCapacity;
        this.storageType = storageType;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.throughputCapacity = throughputCapacity;
        this.vpcId = vpcId;
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    private WindowsFileSystemState() {
        this.activeDirectoryId = Output.empty();
        this.aliases = Output.empty();
        this.arn = Output.empty();
        this.auditLogConfiguration = Output.empty();
        this.automaticBackupRetentionDays = Output.empty();
        this.backupId = Output.empty();
        this.copyTagsToBackups = Output.empty();
        this.dailyAutomaticBackupStartTime = Output.empty();
        this.deploymentType = Output.empty();
        this.dnsName = Output.empty();
        this.kmsKeyId = Output.empty();
        this.networkInterfaceIds = Output.empty();
        this.ownerId = Output.empty();
        this.preferredFileServerIp = Output.empty();
        this.preferredSubnetId = Output.empty();
        this.remoteAdministrationEndpoint = Output.empty();
        this.securityGroupIds = Output.empty();
        this.selfManagedActiveDirectory = Output.empty();
        this.skipFinalBackup = Output.empty();
        this.storageCapacity = Output.empty();
        this.storageType = Output.empty();
        this.subnetIds = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.throughputCapacity = Output.empty();
        this.vpcId = Output.empty();
        this.weeklyMaintenanceStartTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFileSystemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDirectoryId;
        private @Nullable Output<List<String>> aliases;
        private @Nullable Output<String> arn;
        private @Nullable Output<WindowsFileSystemAuditLogConfigurationGetArgs> auditLogConfiguration;
        private @Nullable Output<Integer> automaticBackupRetentionDays;
        private @Nullable Output<String> backupId;
        private @Nullable Output<Boolean> copyTagsToBackups;
        private @Nullable Output<String> dailyAutomaticBackupStartTime;
        private @Nullable Output<String> deploymentType;
        private @Nullable Output<String> dnsName;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<List<String>> networkInterfaceIds;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> preferredFileServerIp;
        private @Nullable Output<String> preferredSubnetId;
        private @Nullable Output<String> remoteAdministrationEndpoint;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryGetArgs> selfManagedActiveDirectory;
        private @Nullable Output<Boolean> skipFinalBackup;
        private @Nullable Output<Integer> storageCapacity;
        private @Nullable Output<String> storageType;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Integer> throughputCapacity;
        private @Nullable Output<String> vpcId;
        private @Nullable Output<String> weeklyMaintenanceStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsFileSystemState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryId = defaults.activeDirectoryId;
    	      this.aliases = defaults.aliases;
    	      this.arn = defaults.arn;
    	      this.auditLogConfiguration = defaults.auditLogConfiguration;
    	      this.automaticBackupRetentionDays = defaults.automaticBackupRetentionDays;
    	      this.backupId = defaults.backupId;
    	      this.copyTagsToBackups = defaults.copyTagsToBackups;
    	      this.dailyAutomaticBackupStartTime = defaults.dailyAutomaticBackupStartTime;
    	      this.deploymentType = defaults.deploymentType;
    	      this.dnsName = defaults.dnsName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.networkInterfaceIds = defaults.networkInterfaceIds;
    	      this.ownerId = defaults.ownerId;
    	      this.preferredFileServerIp = defaults.preferredFileServerIp;
    	      this.preferredSubnetId = defaults.preferredSubnetId;
    	      this.remoteAdministrationEndpoint = defaults.remoteAdministrationEndpoint;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.selfManagedActiveDirectory = defaults.selfManagedActiveDirectory;
    	      this.skipFinalBackup = defaults.skipFinalBackup;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.storageType = defaults.storageType;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.throughputCapacity = defaults.throughputCapacity;
    	      this.vpcId = defaults.vpcId;
    	      this.weeklyMaintenanceStartTime = defaults.weeklyMaintenanceStartTime;
        }

        public Builder activeDirectoryId(@Nullable Output<String> activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }

        public Builder activeDirectoryId(@Nullable String activeDirectoryId) {
            this.activeDirectoryId = Output.ofNullable(activeDirectoryId);
            return this;
        }

        public Builder aliases(@Nullable Output<List<String>> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder aliases(@Nullable List<String> aliases) {
            this.aliases = Output.ofNullable(aliases);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder auditLogConfiguration(@Nullable Output<WindowsFileSystemAuditLogConfigurationGetArgs> auditLogConfiguration) {
            this.auditLogConfiguration = auditLogConfiguration;
            return this;
        }

        public Builder auditLogConfiguration(@Nullable WindowsFileSystemAuditLogConfigurationGetArgs auditLogConfiguration) {
            this.auditLogConfiguration = Output.ofNullable(auditLogConfiguration);
            return this;
        }

        public Builder automaticBackupRetentionDays(@Nullable Output<Integer> automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        public Builder automaticBackupRetentionDays(@Nullable Integer automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = Output.ofNullable(automaticBackupRetentionDays);
            return this;
        }

        public Builder backupId(@Nullable Output<String> backupId) {
            this.backupId = backupId;
            return this;
        }

        public Builder backupId(@Nullable String backupId) {
            this.backupId = Output.ofNullable(backupId);
            return this;
        }

        public Builder copyTagsToBackups(@Nullable Output<Boolean> copyTagsToBackups) {
            this.copyTagsToBackups = copyTagsToBackups;
            return this;
        }

        public Builder copyTagsToBackups(@Nullable Boolean copyTagsToBackups) {
            this.copyTagsToBackups = Output.ofNullable(copyTagsToBackups);
            return this;
        }

        public Builder dailyAutomaticBackupStartTime(@Nullable Output<String> dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            return this;
        }

        public Builder dailyAutomaticBackupStartTime(@Nullable String dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = Output.ofNullable(dailyAutomaticBackupStartTime);
            return this;
        }

        public Builder deploymentType(@Nullable Output<String> deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = Output.ofNullable(deploymentType);
            return this;
        }

        public Builder dnsName(@Nullable Output<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Output.ofNullable(dnsName);
            return this;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }

        public Builder networkInterfaceIds(@Nullable Output<List<String>> networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        public Builder networkInterfaceIds(@Nullable List<String> networkInterfaceIds) {
            this.networkInterfaceIds = Output.ofNullable(networkInterfaceIds);
            return this;
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }

        public Builder preferredFileServerIp(@Nullable Output<String> preferredFileServerIp) {
            this.preferredFileServerIp = preferredFileServerIp;
            return this;
        }

        public Builder preferredFileServerIp(@Nullable String preferredFileServerIp) {
            this.preferredFileServerIp = Output.ofNullable(preferredFileServerIp);
            return this;
        }

        public Builder preferredSubnetId(@Nullable Output<String> preferredSubnetId) {
            this.preferredSubnetId = preferredSubnetId;
            return this;
        }

        public Builder preferredSubnetId(@Nullable String preferredSubnetId) {
            this.preferredSubnetId = Output.ofNullable(preferredSubnetId);
            return this;
        }

        public Builder remoteAdministrationEndpoint(@Nullable Output<String> remoteAdministrationEndpoint) {
            this.remoteAdministrationEndpoint = remoteAdministrationEndpoint;
            return this;
        }

        public Builder remoteAdministrationEndpoint(@Nullable String remoteAdministrationEndpoint) {
            this.remoteAdministrationEndpoint = Output.ofNullable(remoteAdministrationEndpoint);
            return this;
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Output.ofNullable(securityGroupIds);
            return this;
        }

        public Builder selfManagedActiveDirectory(@Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryGetArgs> selfManagedActiveDirectory) {
            this.selfManagedActiveDirectory = selfManagedActiveDirectory;
            return this;
        }

        public Builder selfManagedActiveDirectory(@Nullable WindowsFileSystemSelfManagedActiveDirectoryGetArgs selfManagedActiveDirectory) {
            this.selfManagedActiveDirectory = Output.ofNullable(selfManagedActiveDirectory);
            return this;
        }

        public Builder skipFinalBackup(@Nullable Output<Boolean> skipFinalBackup) {
            this.skipFinalBackup = skipFinalBackup;
            return this;
        }

        public Builder skipFinalBackup(@Nullable Boolean skipFinalBackup) {
            this.skipFinalBackup = Output.ofNullable(skipFinalBackup);
            return this;
        }

        public Builder storageCapacity(@Nullable Output<Integer> storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Builder storageCapacity(@Nullable Integer storageCapacity) {
            this.storageCapacity = Output.ofNullable(storageCapacity);
            return this;
        }

        public Builder storageType(@Nullable Output<String> storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder storageType(@Nullable String storageType) {
            this.storageType = Output.ofNullable(storageType);
            return this;
        }

        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Output.ofNullable(subnetIds);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder throughputCapacity(@Nullable Output<Integer> throughputCapacity) {
            this.throughputCapacity = throughputCapacity;
            return this;
        }

        public Builder throughputCapacity(@Nullable Integer throughputCapacity) {
            this.throughputCapacity = Output.ofNullable(throughputCapacity);
            return this;
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }

        public Builder weeklyMaintenanceStartTime(@Nullable Output<String> weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            return this;
        }

        public Builder weeklyMaintenanceStartTime(@Nullable String weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = Output.ofNullable(weeklyMaintenanceStartTime);
            return this;
        }
        public WindowsFileSystemState build() {
            return new WindowsFileSystemState(activeDirectoryId, aliases, arn, auditLogConfiguration, automaticBackupRetentionDays, backupId, copyTagsToBackups, dailyAutomaticBackupStartTime, deploymentType, dnsName, kmsKeyId, networkInterfaceIds, ownerId, preferredFileServerIp, preferredSubnetId, remoteAdministrationEndpoint, securityGroupIds, selfManagedActiveDirectory, skipFinalBackup, storageCapacity, storageType, subnetIds, tags, tagsAll, throughputCapacity, vpcId, weeklyMaintenanceStartTime);
        }
    }
}
