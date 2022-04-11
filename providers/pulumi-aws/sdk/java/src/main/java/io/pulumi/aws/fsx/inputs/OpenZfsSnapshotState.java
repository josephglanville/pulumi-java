// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenZfsSnapshotState extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsSnapshotState Empty = new OpenZfsSnapshotState();

    /**
     * Amazon Resource Name of the snapshot.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    @Import(name="creationTime")
      private final @Nullable Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime == null ? Codegen.empty() : this.creationTime;
    }

    /**
     * The name of the Snapshot. You can use a maximum of 203 alphanumeric characters plus either _ or -  or : or . for the name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The ID of the volume to snapshot. This can be the root volume or a child volume.
     * 
     */
    @Import(name="volumeId")
      private final @Nullable Output<String> volumeId;

    public Output<String> getVolumeId() {
        return this.volumeId == null ? Codegen.empty() : this.volumeId;
    }

    public OpenZfsSnapshotState(
        @Nullable Output<String> arn,
        @Nullable Output<String> creationTime,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> volumeId) {
        this.arn = arn;
        this.creationTime = creationTime;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.volumeId = volumeId;
    }

    private OpenZfsSnapshotState() {
        this.arn = Codegen.empty();
        this.creationTime = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.volumeId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsSnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> creationTime;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsSnapshotState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationTime = defaults.creationTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder creationTime(@Nullable Output<String> creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = Codegen.ofNullable(creationTime);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder volumeId(@Nullable Output<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Codegen.ofNullable(volumeId);
            return this;
        }        public OpenZfsSnapshotState build() {
            return new OpenZfsSnapshotState(arn, creationTime, name, tags, tagsAll, volumeId);
        }
    }
}
