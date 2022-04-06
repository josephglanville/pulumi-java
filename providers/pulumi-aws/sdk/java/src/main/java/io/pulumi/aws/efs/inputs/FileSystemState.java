// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyGetArgs;
import io.pulumi.aws.efs.inputs.FileSystemSizeInByteGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemState extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemState Empty = new FileSystemState();

    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The identifier of the Availability Zone in which the file system's One Zone storage classes exist.
     * 
     */
    @Import(name="availabilityZoneId")
      private final @Nullable Output<String> availabilityZoneId;

    public Output<String> getAvailabilityZoneId() {
        return this.availabilityZoneId == null ? Output.empty() : this.availabilityZoneId;
    }

    /**
     * the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) for more information.
     * 
     */
    @Import(name="availabilityZoneName")
      private final @Nullable Output<String> availabilityZoneName;

    public Output<String> getAvailabilityZoneName() {
        return this.availabilityZoneName == null ? Output.empty() : this.availabilityZoneName;
    }

    /**
     * A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * (http://docs.aws.amazon.com/efs/latest/ug/) user guide for more information.
     * 
     */
    @Import(name="creationToken")
      private final @Nullable Output<String> creationToken;

    public Output<String> getCreationToken() {
        return this.creationToken == null ? Output.empty() : this.creationToken;
    }

    /**
     * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    @Import(name="dnsName")
      private final @Nullable Output<String> dnsName;

    public Output<String> getDnsName() {
        return this.dnsName == null ? Output.empty() : this.dnsName;
    }

    /**
     * If true, the disk will be encrypted.
     * 
     */
    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object (documented below).
     * 
     */
    @Import(name="lifecyclePolicy")
      private final @Nullable Output<FileSystemLifecyclePolicyGetArgs> lifecyclePolicy;

    public Output<FileSystemLifecyclePolicyGetArgs> getLifecyclePolicy() {
        return this.lifecyclePolicy == null ? Output.empty() : this.lifecyclePolicy;
    }

    /**
     * The current number of mount targets that the file system has.
     * 
     */
    @Import(name="numberOfMountTargets")
      private final @Nullable Output<Integer> numberOfMountTargets;

    public Output<Integer> getNumberOfMountTargets() {
        return this.numberOfMountTargets == null ? Output.empty() : this.numberOfMountTargets;
    }

    /**
     * The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
     * 
     */
    @Import(name="performanceMode")
      private final @Nullable Output<String> performanceMode;

    public Output<String> getPerformanceMode() {
        return this.performanceMode == null ? Output.empty() : this.performanceMode;
    }

    /**
     * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
     * 
     */
    @Import(name="provisionedThroughputInMibps")
      private final @Nullable Output<Double> provisionedThroughputInMibps;

    public Output<Double> getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps == null ? Output.empty() : this.provisionedThroughputInMibps;
    }

    /**
     * The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * 
     */
    @Import(name="sizeInBytes")
      private final @Nullable Output<List<FileSystemSizeInByteGetArgs>> sizeInBytes;

    public Output<List<FileSystemSizeInByteGetArgs>> getSizeInBytes() {
        return this.sizeInBytes == null ? Output.empty() : this.sizeInBytes;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
     * 
     */
    @Import(name="throughputMode")
      private final @Nullable Output<String> throughputMode;

    public Output<String> getThroughputMode() {
        return this.throughputMode == null ? Output.empty() : this.throughputMode;
    }

    public FileSystemState(
        @Nullable Output<String> arn,
        @Nullable Output<String> availabilityZoneId,
        @Nullable Output<String> availabilityZoneName,
        @Nullable Output<String> creationToken,
        @Nullable Output<String> dnsName,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<FileSystemLifecyclePolicyGetArgs> lifecyclePolicy,
        @Nullable Output<Integer> numberOfMountTargets,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> performanceMode,
        @Nullable Output<Double> provisionedThroughputInMibps,
        @Nullable Output<List<FileSystemSizeInByteGetArgs>> sizeInBytes,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> throughputMode) {
        this.arn = arn;
        this.availabilityZoneId = availabilityZoneId;
        this.availabilityZoneName = availabilityZoneName;
        this.creationToken = creationToken;
        this.dnsName = dnsName;
        this.encrypted = encrypted;
        this.kmsKeyId = kmsKeyId;
        this.lifecyclePolicy = lifecyclePolicy;
        this.numberOfMountTargets = numberOfMountTargets;
        this.ownerId = ownerId;
        this.performanceMode = performanceMode;
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        this.sizeInBytes = sizeInBytes;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.throughputMode = throughputMode;
    }

    private FileSystemState() {
        this.arn = Output.empty();
        this.availabilityZoneId = Output.empty();
        this.availabilityZoneName = Output.empty();
        this.creationToken = Output.empty();
        this.dnsName = Output.empty();
        this.encrypted = Output.empty();
        this.kmsKeyId = Output.empty();
        this.lifecyclePolicy = Output.empty();
        this.numberOfMountTargets = Output.empty();
        this.ownerId = Output.empty();
        this.performanceMode = Output.empty();
        this.provisionedThroughputInMibps = Output.empty();
        this.sizeInBytes = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.throughputMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> availabilityZoneId;
        private @Nullable Output<String> availabilityZoneName;
        private @Nullable Output<String> creationToken;
        private @Nullable Output<String> dnsName;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<FileSystemLifecyclePolicyGetArgs> lifecyclePolicy;
        private @Nullable Output<Integer> numberOfMountTargets;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> performanceMode;
        private @Nullable Output<Double> provisionedThroughputInMibps;
        private @Nullable Output<List<FileSystemSizeInByteGetArgs>> sizeInBytes;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> throughputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.availabilityZoneName = defaults.availabilityZoneName;
    	      this.creationToken = defaults.creationToken;
    	      this.dnsName = defaults.dnsName;
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.lifecyclePolicy = defaults.lifecyclePolicy;
    	      this.numberOfMountTargets = defaults.numberOfMountTargets;
    	      this.ownerId = defaults.ownerId;
    	      this.performanceMode = defaults.performanceMode;
    	      this.provisionedThroughputInMibps = defaults.provisionedThroughputInMibps;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.throughputMode = defaults.throughputMode;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder availabilityZoneId(@Nullable Output<String> availabilityZoneId) {
            this.availabilityZoneId = availabilityZoneId;
            return this;
        }
        public Builder availabilityZoneId(@Nullable String availabilityZoneId) {
            this.availabilityZoneId = Output.ofNullable(availabilityZoneId);
            return this;
        }
        public Builder availabilityZoneName(@Nullable Output<String> availabilityZoneName) {
            this.availabilityZoneName = availabilityZoneName;
            return this;
        }
        public Builder availabilityZoneName(@Nullable String availabilityZoneName) {
            this.availabilityZoneName = Output.ofNullable(availabilityZoneName);
            return this;
        }
        public Builder creationToken(@Nullable Output<String> creationToken) {
            this.creationToken = creationToken;
            return this;
        }
        public Builder creationToken(@Nullable String creationToken) {
            this.creationToken = Output.ofNullable(creationToken);
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
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Output.ofNullable(encrypted);
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
        public Builder lifecyclePolicy(@Nullable Output<FileSystemLifecyclePolicyGetArgs> lifecyclePolicy) {
            this.lifecyclePolicy = lifecyclePolicy;
            return this;
        }
        public Builder lifecyclePolicy(@Nullable FileSystemLifecyclePolicyGetArgs lifecyclePolicy) {
            this.lifecyclePolicy = Output.ofNullable(lifecyclePolicy);
            return this;
        }
        public Builder numberOfMountTargets(@Nullable Output<Integer> numberOfMountTargets) {
            this.numberOfMountTargets = numberOfMountTargets;
            return this;
        }
        public Builder numberOfMountTargets(@Nullable Integer numberOfMountTargets) {
            this.numberOfMountTargets = Output.ofNullable(numberOfMountTargets);
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
        public Builder sizeInBytes(@Nullable Output<List<FileSystemSizeInByteGetArgs>> sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }
        public Builder sizeInBytes(@Nullable List<FileSystemSizeInByteGetArgs> sizeInBytes) {
            this.sizeInBytes = Output.ofNullable(sizeInBytes);
            return this;
        }
        public Builder sizeInBytes(FileSystemSizeInByteGetArgs... sizeInBytes) {
            return sizeInBytes(List.of(sizeInBytes));
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
        public Builder throughputMode(@Nullable Output<String> throughputMode) {
            this.throughputMode = throughputMode;
            return this;
        }
        public Builder throughputMode(@Nullable String throughputMode) {
            this.throughputMode = Output.ofNullable(throughputMode);
            return this;
        }        public FileSystemState build() {
            return new FileSystemState(arn, availabilityZoneId, availabilityZoneName, creationToken, dnsName, encrypted, kmsKeyId, lifecyclePolicy, numberOfMountTargets, ownerId, performanceMode, provisionedThroughputInMibps, sizeInBytes, tags, tagsAll, throughputMode);
        }
    }
}