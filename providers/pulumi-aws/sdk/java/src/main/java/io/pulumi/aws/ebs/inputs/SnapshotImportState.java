// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.aws.ebs.inputs.SnapshotImportClientDataGetArgs;
import io.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotImportState extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotImportState Empty = new SnapshotImportState();

    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The client-specific data. Detailed below.
     * 
     */
    @Import(name="clientData")
      private final @Nullable Output<SnapshotImportClientDataGetArgs> clientData;

    public Output<SnapshotImportClientDataGetArgs> getClientData() {
        return this.clientData == null ? Output.empty() : this.clientData;
    }

    /**
     * The data encryption key identifier for the snapshot.
     * 
     */
    @Import(name="dataEncryptionKeyId")
      private final @Nullable Output<String> dataEncryptionKeyId;

    public Output<String> getDataEncryptionKeyId() {
        return this.dataEncryptionKeyId == null ? Output.empty() : this.dataEncryptionKeyId;
    }

    /**
     * The description of the disk image being imported.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Information about the disk container. Detailed below.
     * 
     */
    @Import(name="diskContainer")
      private final @Nullable Output<SnapshotImportDiskContainerGetArgs> diskContainer;

    public Output<SnapshotImportDiskContainerGetArgs> getDiskContainer() {
        return this.diskContainer == null ? Output.empty() : this.diskContainer;
    }

    /**
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default KMS key for EBS is used unless you specify a non-default KMS key using KmsKeyId.
     * 
     */
    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * An identifier for the symmetric KMS key to use when creating the encrypted snapshot. This parameter is only required if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is used. If a KmsKeyId is specified, the Encrypted flag must also be set.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    @Import(name="outpostArn")
      private final @Nullable Output<String> outpostArn;

    public Output<String> getOutpostArn() {
        return this.outpostArn == null ? Output.empty() : this.outpostArn;
    }

    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    @Import(name="ownerAlias")
      private final @Nullable Output<String> ownerAlias;

    public Output<String> getOwnerAlias() {
        return this.ownerAlias == null ? Output.empty() : this.ownerAlias;
    }

    /**
     * The AWS account ID of the EBS snapshot owner.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @Import(name="permanentRestore")
      private final @Nullable Output<Boolean> permanentRestore;

    public Output<Boolean> getPermanentRestore() {
        return this.permanentRestore == null ? Output.empty() : this.permanentRestore;
    }

    /**
     * The name of the IAM Role the VM Import/Export service will assume. This role needs certain permissions. See https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-role. Default: `vmimport`
     * 
     */
    @Import(name="roleName")
      private final @Nullable Output<String> roleName;

    public Output<String> getRoleName() {
        return this.roleName == null ? Output.empty() : this.roleName;
    }

    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @Import(name="storageTier")
      private final @Nullable Output<String> storageTier;

    public Output<String> getStorageTier() {
        return this.storageTier == null ? Output.empty() : this.storageTier;
    }

    /**
     * A map of tags to assign to the snapshot.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @Import(name="temporaryRestoreDays")
      private final @Nullable Output<Integer> temporaryRestoreDays;

    public Output<Integer> getTemporaryRestoreDays() {
        return this.temporaryRestoreDays == null ? Output.empty() : this.temporaryRestoreDays;
    }

    @Import(name="volumeId")
      private final @Nullable Output<String> volumeId;

    public Output<String> getVolumeId() {
        return this.volumeId == null ? Output.empty() : this.volumeId;
    }

    /**
     * The size of the drive in GiBs.
     * 
     */
    @Import(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> getVolumeSize() {
        return this.volumeSize == null ? Output.empty() : this.volumeSize;
    }

    public SnapshotImportState(
        @Nullable Output<String> arn,
        @Nullable Output<SnapshotImportClientDataGetArgs> clientData,
        @Nullable Output<String> dataEncryptionKeyId,
        @Nullable Output<String> description,
        @Nullable Output<SnapshotImportDiskContainerGetArgs> diskContainer,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> outpostArn,
        @Nullable Output<String> ownerAlias,
        @Nullable Output<String> ownerId,
        @Nullable Output<Boolean> permanentRestore,
        @Nullable Output<String> roleName,
        @Nullable Output<String> storageTier,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Integer> temporaryRestoreDays,
        @Nullable Output<String> volumeId,
        @Nullable Output<Integer> volumeSize) {
        this.arn = arn;
        this.clientData = clientData;
        this.dataEncryptionKeyId = dataEncryptionKeyId;
        this.description = description;
        this.diskContainer = diskContainer;
        this.encrypted = encrypted;
        this.kmsKeyId = kmsKeyId;
        this.outpostArn = outpostArn;
        this.ownerAlias = ownerAlias;
        this.ownerId = ownerId;
        this.permanentRestore = permanentRestore;
        this.roleName = roleName;
        this.storageTier = storageTier;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.temporaryRestoreDays = temporaryRestoreDays;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
    }

    private SnapshotImportState() {
        this.arn = Output.empty();
        this.clientData = Output.empty();
        this.dataEncryptionKeyId = Output.empty();
        this.description = Output.empty();
        this.diskContainer = Output.empty();
        this.encrypted = Output.empty();
        this.kmsKeyId = Output.empty();
        this.outpostArn = Output.empty();
        this.ownerAlias = Output.empty();
        this.ownerId = Output.empty();
        this.permanentRestore = Output.empty();
        this.roleName = Output.empty();
        this.storageTier = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.temporaryRestoreDays = Output.empty();
        this.volumeId = Output.empty();
        this.volumeSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotImportState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<SnapshotImportClientDataGetArgs> clientData;
        private @Nullable Output<String> dataEncryptionKeyId;
        private @Nullable Output<String> description;
        private @Nullable Output<SnapshotImportDiskContainerGetArgs> diskContainer;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> outpostArn;
        private @Nullable Output<String> ownerAlias;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<Boolean> permanentRestore;
        private @Nullable Output<String> roleName;
        private @Nullable Output<String> storageTier;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Integer> temporaryRestoreDays;
        private @Nullable Output<String> volumeId;
        private @Nullable Output<Integer> volumeSize;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotImportState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clientData = defaults.clientData;
    	      this.dataEncryptionKeyId = defaults.dataEncryptionKeyId;
    	      this.description = defaults.description;
    	      this.diskContainer = defaults.diskContainer;
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerAlias = defaults.ownerAlias;
    	      this.ownerId = defaults.ownerId;
    	      this.permanentRestore = defaults.permanentRestore;
    	      this.roleName = defaults.roleName;
    	      this.storageTier = defaults.storageTier;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.temporaryRestoreDays = defaults.temporaryRestoreDays;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder clientData(@Nullable Output<SnapshotImportClientDataGetArgs> clientData) {
            this.clientData = clientData;
            return this;
        }
        public Builder clientData(@Nullable SnapshotImportClientDataGetArgs clientData) {
            this.clientData = Output.ofNullable(clientData);
            return this;
        }
        public Builder dataEncryptionKeyId(@Nullable Output<String> dataEncryptionKeyId) {
            this.dataEncryptionKeyId = dataEncryptionKeyId;
            return this;
        }
        public Builder dataEncryptionKeyId(@Nullable String dataEncryptionKeyId) {
            this.dataEncryptionKeyId = Output.ofNullable(dataEncryptionKeyId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder diskContainer(@Nullable Output<SnapshotImportDiskContainerGetArgs> diskContainer) {
            this.diskContainer = diskContainer;
            return this;
        }
        public Builder diskContainer(@Nullable SnapshotImportDiskContainerGetArgs diskContainer) {
            this.diskContainer = Output.ofNullable(diskContainer);
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
        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }
        public Builder outpostArn(@Nullable String outpostArn) {
            this.outpostArn = Output.ofNullable(outpostArn);
            return this;
        }
        public Builder ownerAlias(@Nullable Output<String> ownerAlias) {
            this.ownerAlias = ownerAlias;
            return this;
        }
        public Builder ownerAlias(@Nullable String ownerAlias) {
            this.ownerAlias = Output.ofNullable(ownerAlias);
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
        public Builder permanentRestore(@Nullable Output<Boolean> permanentRestore) {
            this.permanentRestore = permanentRestore;
            return this;
        }
        public Builder permanentRestore(@Nullable Boolean permanentRestore) {
            this.permanentRestore = Output.ofNullable(permanentRestore);
            return this;
        }
        public Builder roleName(@Nullable Output<String> roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder roleName(@Nullable String roleName) {
            this.roleName = Output.ofNullable(roleName);
            return this;
        }
        public Builder storageTier(@Nullable Output<String> storageTier) {
            this.storageTier = storageTier;
            return this;
        }
        public Builder storageTier(@Nullable String storageTier) {
            this.storageTier = Output.ofNullable(storageTier);
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
        public Builder temporaryRestoreDays(@Nullable Output<Integer> temporaryRestoreDays) {
            this.temporaryRestoreDays = temporaryRestoreDays;
            return this;
        }
        public Builder temporaryRestoreDays(@Nullable Integer temporaryRestoreDays) {
            this.temporaryRestoreDays = Output.ofNullable(temporaryRestoreDays);
            return this;
        }
        public Builder volumeId(@Nullable Output<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Output.ofNullable(volumeId);
            return this;
        }
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Output.ofNullable(volumeSize);
            return this;
        }        public SnapshotImportState build() {
            return new SnapshotImportState(arn, clientData, dataEncryptionKeyId, description, diskContainer, encrypted, kmsKeyId, outpostArn, ownerAlias, ownerId, permanentRestore, roleName, storageTier, tags, tagsAll, temporaryRestoreDays, volumeId, volumeSize);
        }
    }
}