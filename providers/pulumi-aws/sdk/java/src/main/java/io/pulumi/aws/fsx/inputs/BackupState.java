// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupState extends io.pulumi.resources.ResourceArgs {

    public static final BackupState Empty = new BackupState();

    /**
     * Amazon Resource Name of the backup.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     * 
     */
    @Import(name="fileSystemId")
      private final @Nullable Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId == null ? Output.empty() : this.fileSystemId;
    }

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the backup of the Amazon FSx file system's data at rest.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * AWS account identifier that created the file system.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
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
     * The type of the file system backup.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The ID of the volume to back up. Required if backing up a ONTAP Volume.
     * 
     */
    @Import(name="volumeId")
      private final @Nullable Output<String> volumeId;

    public Output<String> getVolumeId() {
        return this.volumeId == null ? Output.empty() : this.volumeId;
    }

    public BackupState(
        @Nullable Output<String> arn,
        @Nullable Output<String> fileSystemId,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> ownerId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type,
        @Nullable Output<String> volumeId) {
        this.arn = arn;
        this.fileSystemId = fileSystemId;
        this.kmsKeyId = kmsKeyId;
        this.ownerId = ownerId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
        this.volumeId = volumeId;
    }

    private BackupState() {
        this.arn = Output.empty();
        this.fileSystemId = Output.empty();
        this.kmsKeyId = Output.empty();
        this.ownerId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.type = Output.empty();
        this.volumeId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> fileSystemId;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;
        private @Nullable Output<String> volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder fileSystemId(@Nullable Output<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public Builder fileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = Output.ofNullable(fileSystemId);
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
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
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
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public Builder volumeId(@Nullable Output<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Output.ofNullable(volumeId);
            return this;
        }        public BackupState build() {
            return new BackupState(arn, fileSystemId, kmsKeyId, ownerId, tags, tagsAll, type, volumeId);
        }
    }
}