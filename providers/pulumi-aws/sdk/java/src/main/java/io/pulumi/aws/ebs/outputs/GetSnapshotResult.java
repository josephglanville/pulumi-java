// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.outputs;

import io.pulumi.aws.ebs.outputs.GetSnapshotFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSnapshotResult {
    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    private final String arn;
    /**
     * The data encryption key identifier for the snapshot.
     * 
     */
    private final String dataEncryptionKeyId;
    /**
     * A description for the snapshot
     * 
     */
    private final String description;
    /**
     * Whether the snapshot is encrypted.
     * 
     */
    private final Boolean encrypted;
    private final @Nullable List<GetSnapshotFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    private final String kmsKeyId;
    private final @Nullable Boolean mostRecent;
    /**
     * The ARN of the Outpost on which the snapshot is stored.
     * 
     */
    private final String outpostArn;
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    private final String ownerAlias;
    /**
     * The AWS account ID of the EBS snapshot owner.
     * 
     */
    private final String ownerId;
    private final @Nullable List<String> owners;
    private final @Nullable List<String> restorableByUserIds;
    /**
     * The snapshot ID (e.g., snap-59fcb34e).
     * 
     */
    private final String snapshotId;
    private final @Nullable List<String> snapshotIds;
    /**
     * The snapshot state.
     * 
     */
    private final String state;
    /**
     * The storage tier in which the snapshot is stored.
     * 
     */
    private final String storageTier;
    /**
     * A map of tags for the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The volume ID (e.g., vol-59fcb34e).
     * 
     */
    private final String volumeId;
    /**
     * The size of the drive in GiBs.
     * 
     */
    private final Integer volumeSize;

    @OutputCustomType.Constructor
    private GetSnapshotResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("dataEncryptionKeyId") String dataEncryptionKeyId,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("encrypted") Boolean encrypted,
        @OutputCustomType.Parameter("filters") @Nullable List<GetSnapshotFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kmsKeyId") String kmsKeyId,
        @OutputCustomType.Parameter("mostRecent") @Nullable Boolean mostRecent,
        @OutputCustomType.Parameter("outpostArn") String outpostArn,
        @OutputCustomType.Parameter("ownerAlias") String ownerAlias,
        @OutputCustomType.Parameter("ownerId") String ownerId,
        @OutputCustomType.Parameter("owners") @Nullable List<String> owners,
        @OutputCustomType.Parameter("restorableByUserIds") @Nullable List<String> restorableByUserIds,
        @OutputCustomType.Parameter("snapshotId") String snapshotId,
        @OutputCustomType.Parameter("snapshotIds") @Nullable List<String> snapshotIds,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("storageTier") String storageTier,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("volumeId") String volumeId,
        @OutputCustomType.Parameter("volumeSize") Integer volumeSize) {
        this.arn = arn;
        this.dataEncryptionKeyId = dataEncryptionKeyId;
        this.description = description;
        this.encrypted = encrypted;
        this.filters = filters;
        this.id = id;
        this.kmsKeyId = kmsKeyId;
        this.mostRecent = mostRecent;
        this.outpostArn = outpostArn;
        this.ownerAlias = ownerAlias;
        this.ownerId = ownerId;
        this.owners = owners;
        this.restorableByUserIds = restorableByUserIds;
        this.snapshotId = snapshotId;
        this.snapshotIds = snapshotIds;
        this.state = state;
        this.storageTier = storageTier;
        this.tags = tags;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
    }

    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The data encryption key identifier for the snapshot.
     * 
    */
    public String getDataEncryptionKeyId() {
        return this.dataEncryptionKeyId;
    }
    /**
     * A description for the snapshot
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Whether the snapshot is encrypted.
     * 
    */
    public Boolean getEncrypted() {
        return this.encrypted;
    }
    public List<GetSnapshotFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
    */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }
    public Optional<Boolean> getMostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * The ARN of the Outpost on which the snapshot is stored.
     * 
    */
    public String getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
    */
    public String getOwnerAlias() {
        return this.ownerAlias;
    }
    /**
     * The AWS account ID of the EBS snapshot owner.
     * 
    */
    public String getOwnerId() {
        return this.ownerId;
    }
    public List<String> getOwners() {
        return this.owners == null ? List.of() : this.owners;
    }
    public List<String> getRestorableByUserIds() {
        return this.restorableByUserIds == null ? List.of() : this.restorableByUserIds;
    }
    /**
     * The snapshot ID (e.g., snap-59fcb34e).
     * 
    */
    public String getSnapshotId() {
        return this.snapshotId;
    }
    public List<String> getSnapshotIds() {
        return this.snapshotIds == null ? List.of() : this.snapshotIds;
    }
    /**
     * The snapshot state.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The storage tier in which the snapshot is stored.
     * 
    */
    public String getStorageTier() {
        return this.storageTier;
    }
    /**
     * A map of tags for the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The volume ID (e.g., vol-59fcb34e).
     * 
    */
    public String getVolumeId() {
        return this.volumeId;
    }
    /**
     * The size of the drive in GiBs.
     * 
    */
    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String dataEncryptionKeyId;
        private String description;
        private Boolean encrypted;
        private @Nullable List<GetSnapshotFilter> filters;
        private String id;
        private String kmsKeyId;
        private @Nullable Boolean mostRecent;
        private String outpostArn;
        private String ownerAlias;
        private String ownerId;
        private @Nullable List<String> owners;
        private @Nullable List<String> restorableByUserIds;
        private String snapshotId;
        private @Nullable List<String> snapshotIds;
        private String state;
        private String storageTier;
        private Map<String,String> tags;
        private String volumeId;
        private Integer volumeSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataEncryptionKeyId = defaults.dataEncryptionKeyId;
    	      this.description = defaults.description;
    	      this.encrypted = defaults.encrypted;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mostRecent = defaults.mostRecent;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerAlias = defaults.ownerAlias;
    	      this.ownerId = defaults.ownerId;
    	      this.owners = defaults.owners;
    	      this.restorableByUserIds = defaults.restorableByUserIds;
    	      this.snapshotId = defaults.snapshotId;
    	      this.snapshotIds = defaults.snapshotIds;
    	      this.state = defaults.state;
    	      this.storageTier = defaults.storageTier;
    	      this.tags = defaults.tags;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDataEncryptionKeyId(String dataEncryptionKeyId) {
            this.dataEncryptionKeyId = Objects.requireNonNull(dataEncryptionKeyId);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEncrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder setFilters(@Nullable List<GetSnapshotFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }

        public Builder setMostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder setOutpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }

        public Builder setOwnerAlias(String ownerAlias) {
            this.ownerAlias = Objects.requireNonNull(ownerAlias);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setOwners(@Nullable List<String> owners) {
            this.owners = owners;
            return this;
        }

        public Builder setRestorableByUserIds(@Nullable List<String> restorableByUserIds) {
            this.restorableByUserIds = restorableByUserIds;
            return this;
        }

        public Builder setSnapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }

        public Builder setSnapshotIds(@Nullable List<String> snapshotIds) {
            this.snapshotIds = snapshotIds;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStorageTier(String storageTier) {
            this.storageTier = Objects.requireNonNull(storageTier);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVolumeId(String volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }

        public Builder setVolumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }
        public GetSnapshotResult build() {
            return new GetSnapshotResult(arn, dataEncryptionKeyId, description, encrypted, filters, id, kmsKeyId, mostRecent, outpostArn, ownerAlias, ownerId, owners, restorableByUserIds, snapshotId, snapshotIds, state, storageTier, tags, volumeId, volumeSize);
        }
    }
}
