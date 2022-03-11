// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.awsnative.efs.inputs.FileSystemBackupPolicyArgs;
import io.pulumi.awsnative.efs.inputs.FileSystemElasticFileSystemTagArgs;
import io.pulumi.awsnative.efs.inputs.FileSystemLifecyclePolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemArgs Empty = new FileSystemArgs();

    @InputImport(name="availabilityZoneName")
      private final @Nullable Output<String> availabilityZoneName;

    public Output<String> getAvailabilityZoneName() {
        return this.availabilityZoneName == null ? Output.empty() : this.availabilityZoneName;
    }

    @InputImport(name="backupPolicy")
      private final @Nullable Output<FileSystemBackupPolicyArgs> backupPolicy;

    public Output<FileSystemBackupPolicyArgs> getBackupPolicy() {
        return this.backupPolicy == null ? Output.empty() : this.backupPolicy;
    }

    /**
     * Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
     * 
     */
    @InputImport(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;

    public Output<Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Output.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    @InputImport(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    @InputImport(name="fileSystemPolicy")
      private final @Nullable Output<Object> fileSystemPolicy;

    public Output<Object> getFileSystemPolicy() {
        return this.fileSystemPolicy == null ? Output.empty() : this.fileSystemPolicy;
    }

    @InputImport(name="fileSystemTags")
      private final @Nullable Output<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags;

    public Output<List<FileSystemElasticFileSystemTagArgs>> getFileSystemTags() {
        return this.fileSystemTags == null ? Output.empty() : this.fileSystemTags;
    }

    @InputImport(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    @InputImport(name="lifecyclePolicies")
      private final @Nullable Output<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies;

    public Output<List<FileSystemLifecyclePolicyArgs>> getLifecyclePolicies() {
        return this.lifecyclePolicies == null ? Output.empty() : this.lifecyclePolicies;
    }

    @InputImport(name="performanceMode")
      private final @Nullable Output<String> performanceMode;

    public Output<String> getPerformanceMode() {
        return this.performanceMode == null ? Output.empty() : this.performanceMode;
    }

    @InputImport(name="provisionedThroughputInMibps")
      private final @Nullable Output<Double> provisionedThroughputInMibps;

    public Output<Double> getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps == null ? Output.empty() : this.provisionedThroughputInMibps;
    }

    @InputImport(name="throughputMode")
      private final @Nullable Output<String> throughputMode;

    public Output<String> getThroughputMode() {
        return this.throughputMode == null ? Output.empty() : this.throughputMode;
    }

    public FileSystemArgs(
        @Nullable Output<String> availabilityZoneName,
        @Nullable Output<FileSystemBackupPolicyArgs> backupPolicy,
        @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Object> fileSystemPolicy,
        @Nullable Output<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies,
        @Nullable Output<String> performanceMode,
        @Nullable Output<Double> provisionedThroughputInMibps,
        @Nullable Output<String> throughputMode) {
        this.availabilityZoneName = availabilityZoneName;
        this.backupPolicy = backupPolicy;
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.encrypted = encrypted;
        this.fileSystemPolicy = fileSystemPolicy;
        this.fileSystemTags = fileSystemTags;
        this.kmsKeyId = kmsKeyId;
        this.lifecyclePolicies = lifecyclePolicies;
        this.performanceMode = performanceMode;
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        this.throughputMode = throughputMode;
    }

    private FileSystemArgs() {
        this.availabilityZoneName = Output.empty();
        this.backupPolicy = Output.empty();
        this.bypassPolicyLockoutSafetyCheck = Output.empty();
        this.encrypted = Output.empty();
        this.fileSystemPolicy = Output.empty();
        this.fileSystemTags = Output.empty();
        this.kmsKeyId = Output.empty();
        this.lifecyclePolicies = Output.empty();
        this.performanceMode = Output.empty();
        this.provisionedThroughputInMibps = Output.empty();
        this.throughputMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZoneName;
        private @Nullable Output<FileSystemBackupPolicyArgs> backupPolicy;
        private @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Object> fileSystemPolicy;
        private @Nullable Output<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies;
        private @Nullable Output<String> performanceMode;
        private @Nullable Output<Double> provisionedThroughputInMibps;
        private @Nullable Output<String> throughputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneName = defaults.availabilityZoneName;
    	      this.backupPolicy = defaults.backupPolicy;
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.encrypted = defaults.encrypted;
    	      this.fileSystemPolicy = defaults.fileSystemPolicy;
    	      this.fileSystemTags = defaults.fileSystemTags;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.lifecyclePolicies = defaults.lifecyclePolicies;
    	      this.performanceMode = defaults.performanceMode;
    	      this.provisionedThroughputInMibps = defaults.provisionedThroughputInMibps;
    	      this.throughputMode = defaults.throughputMode;
        }

        public Builder availabilityZoneName(@Nullable Output<String> availabilityZoneName) {
            this.availabilityZoneName = availabilityZoneName;
            return this;
        }

        public Builder availabilityZoneName(@Nullable String availabilityZoneName) {
            this.availabilityZoneName = Output.ofNullable(availabilityZoneName);
            return this;
        }

        public Builder backupPolicy(@Nullable Output<FileSystemBackupPolicyArgs> backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }

        public Builder backupPolicy(@Nullable FileSystemBackupPolicyArgs backupPolicy) {
            this.backupPolicy = Output.ofNullable(backupPolicy);
            return this;
        }

        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }

        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Output.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Output.ofNullable(encrypted);
            return this;
        }

        public Builder fileSystemPolicy(@Nullable Output<Object> fileSystemPolicy) {
            this.fileSystemPolicy = fileSystemPolicy;
            return this;
        }

        public Builder fileSystemPolicy(@Nullable Object fileSystemPolicy) {
            this.fileSystemPolicy = Output.ofNullable(fileSystemPolicy);
            return this;
        }

        public Builder fileSystemTags(@Nullable Output<List<FileSystemElasticFileSystemTagArgs>> fileSystemTags) {
            this.fileSystemTags = fileSystemTags;
            return this;
        }

        public Builder fileSystemTags(@Nullable List<FileSystemElasticFileSystemTagArgs> fileSystemTags) {
            this.fileSystemTags = Output.ofNullable(fileSystemTags);
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

        public Builder lifecyclePolicies(@Nullable Output<List<FileSystemLifecyclePolicyArgs>> lifecyclePolicies) {
            this.lifecyclePolicies = lifecyclePolicies;
            return this;
        }

        public Builder lifecyclePolicies(@Nullable List<FileSystemLifecyclePolicyArgs> lifecyclePolicies) {
            this.lifecyclePolicies = Output.ofNullable(lifecyclePolicies);
            return this;
        }

        public Builder performanceMode(@Nullable Output<String> performanceMode) {
            this.performanceMode = performanceMode;
            return this;
        }

        public Builder performanceMode(@Nullable String performanceMode) {
            this.performanceMode = Output.ofNullable(performanceMode);
            return this;
        }

        public Builder provisionedThroughputInMibps(@Nullable Output<Double> provisionedThroughputInMibps) {
            this.provisionedThroughputInMibps = provisionedThroughputInMibps;
            return this;
        }

        public Builder provisionedThroughputInMibps(@Nullable Double provisionedThroughputInMibps) {
            this.provisionedThroughputInMibps = Output.ofNullable(provisionedThroughputInMibps);
            return this;
        }

        public Builder throughputMode(@Nullable Output<String> throughputMode) {
            this.throughputMode = throughputMode;
            return this;
        }

        public Builder throughputMode(@Nullable String throughputMode) {
            this.throughputMode = Output.ofNullable(throughputMode);
            return this;
        }
        public FileSystemArgs build() {
            return new FileSystemArgs(availabilityZoneName, backupPolicy, bypassPolicyLockoutSafetyCheck, encrypted, fileSystemPolicy, fileSystemTags, kmsKeyId, lifecyclePolicies, performanceMode, provisionedThroughputInMibps, throughputMode);
        }
    }
}
