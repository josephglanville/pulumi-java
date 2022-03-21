// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.DiskDiskEncryptionKeyGetArgs;
import io.pulumi.gcp.compute.inputs.DiskSourceImageEncryptionKeyGetArgs;
import io.pulumi.gcp.compute.inputs.DiskSourceSnapshotEncryptionKeyGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskState extends io.pulumi.resources.ResourceArgs {

    public static final DiskState Empty = new DiskState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    @Import(name="diskEncryptionKey")
      private final @Nullable Output<DiskDiskEncryptionKeyGetArgs> diskEncryptionKey;

    public Output<DiskDiskEncryptionKeyGetArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Output.empty() : this.diskEncryptionKey;
    }

    /**
     * The image from which to initialize this disk. This can be
     * one of: the image's `self_link`, `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
     * images names must include the family name. If they don't, use the
     * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
     * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
     * These images can be referred by family name here.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     * @Deprecated
     * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
     * 
     */
    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    @Import(name="interface")
      private final @Nullable Output<String> $interface;

    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    public Output<String> get$interface() {
        return this.$interface == null ? Output.empty() : this.$interface;
    }

    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Import(name="labelFingerprint")
      private final @Nullable Output<String> labelFingerprint;

    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint == null ? Output.empty() : this.labelFingerprint;
    }

    /**
     * Labels to apply to this disk.  A list of key->value pairs.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Last attach timestamp in RFC3339 text format.
     * 
     */
    @Import(name="lastAttachTimestamp")
      private final @Nullable Output<String> lastAttachTimestamp;

    public Output<String> getLastAttachTimestamp() {
        return this.lastAttachTimestamp == null ? Output.empty() : this.lastAttachTimestamp;
    }

    /**
     * Last detach timestamp in RFC3339 text format.
     * 
     */
    @Import(name="lastDetachTimestamp")
      private final @Nullable Output<String> lastDetachTimestamp;

    public Output<String> getLastDetachTimestamp() {
        return this.lastDetachTimestamp == null ? Output.empty() : this.lastDetachTimestamp;
    }

    /**
     * Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
     */
    @Import(name="multiWriter")
      private final @Nullable Output<Boolean> multiWriter;

    public Output<Boolean> getMultiWriter() {
        return this.multiWriter == null ? Output.empty() : this.multiWriter;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller's project.
     * 
     */
    @Import(name="physicalBlockSizeBytes")
      private final @Nullable Output<Integer> physicalBlockSizeBytes;

    public Output<Integer> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes == null ? Output.empty() : this.physicalBlockSizeBytes;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Indicates how many IOPS must be provisioned for the disk.
     * 
     */
    @Import(name="provisionedIops")
      private final @Nullable Output<Integer> provisionedIops;

    public Output<Integer> getProvisionedIops() {
        return this.provisionedIops == null ? Output.empty() : this.provisionedIops;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations.
     * ~>**NOTE** This value does not support updating the
     * resource policy, as resource policies can not be updated more than
     * one at a time. Use
     * `gcp.compute.DiskResourcePolicyAttachment`
     * to allow for updating the resource policy attached to the disk.
     * 
     */
    @Import(name="resourcePolicies")
      private final @Nullable Output<List<String>> resourcePolicies;

    public Output<List<String>> getResourcePolicies() {
        return this.resourcePolicies == null ? Output.empty() : this.resourcePolicies;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the `image` or
     * `snapshot` parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with `image` or `snapshot`,
     * the value must not be less than the size of the image
     * or the size of the snapshot.
     * ~>**NOTE** If you change the size, the provider updates the disk size
     * if upsizing is detected but recreates the disk if downsizing is requested.
     * You can add `lifecycle.prevent_destroy` in the config to prevent destroying
     * and recreating.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    /**
     * The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. If the snapshot is in another
     * project than this disk, you must supply a full URL. For example, the
     * following are valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    @Import(name="snapshot")
      private final @Nullable Output<String> snapshot;

    public Output<String> getSnapshot() {
        return this.snapshot == null ? Output.empty() : this.snapshot;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceImageEncryptionKey")
      private final @Nullable Output<DiskSourceImageEncryptionKeyGetArgs> sourceImageEncryptionKey;

    public Output<DiskSourceImageEncryptionKeyGetArgs> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey == null ? Output.empty() : this.sourceImageEncryptionKey;
    }

    /**
     * The ID value of the image used to create this disk. This value identifies the exact image that was used to create this
     * persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated
     * under the same name, the source image ID would identify the exact version of the image that was used.
     * 
     */
    @Import(name="sourceImageId")
      private final @Nullable Output<String> sourceImageId;

    public Output<String> getSourceImageId() {
        return this.sourceImageId == null ? Output.empty() : this.sourceImageId;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceSnapshotEncryptionKey")
      private final @Nullable Output<DiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey;

    public Output<DiskSourceSnapshotEncryptionKeyGetArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Output.empty() : this.sourceSnapshotEncryptionKey;
    }

    /**
     * The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
     * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
     * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    @Import(name="sourceSnapshotId")
      private final @Nullable Output<String> sourceSnapshotId;

    public Output<String> getSourceSnapshotId() {
        return this.sourceSnapshotId == null ? Output.empty() : this.sourceSnapshotId;
    }

    /**
     * URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
     * 
     */
    @Import(name="users")
      private final @Nullable Output<List<String>> users;

    public Output<List<String>> getUsers() {
        return this.users == null ? Output.empty() : this.users;
    }

    /**
     * A reference to the zone where the disk resides.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public DiskState(
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<DiskDiskEncryptionKeyGetArgs> diskEncryptionKey,
        @Nullable Output<String> image,
        @Nullable Output<String> $interface,
        @Nullable Output<String> labelFingerprint,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> lastAttachTimestamp,
        @Nullable Output<String> lastDetachTimestamp,
        @Nullable Output<Boolean> multiWriter,
        @Nullable Output<String> name,
        @Nullable Output<Integer> physicalBlockSizeBytes,
        @Nullable Output<String> project,
        @Nullable Output<Integer> provisionedIops,
        @Nullable Output<List<String>> resourcePolicies,
        @Nullable Output<String> selfLink,
        @Nullable Output<Integer> size,
        @Nullable Output<String> snapshot,
        @Nullable Output<DiskSourceImageEncryptionKeyGetArgs> sourceImageEncryptionKey,
        @Nullable Output<String> sourceImageId,
        @Nullable Output<DiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey,
        @Nullable Output<String> sourceSnapshotId,
        @Nullable Output<String> type,
        @Nullable Output<List<String>> users,
        @Nullable Output<String> zone) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.diskEncryptionKey = diskEncryptionKey;
        this.image = image;
        this.$interface = $interface;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.lastAttachTimestamp = lastAttachTimestamp;
        this.lastDetachTimestamp = lastDetachTimestamp;
        this.multiWriter = multiWriter;
        this.name = name;
        this.physicalBlockSizeBytes = physicalBlockSizeBytes;
        this.project = project;
        this.provisionedIops = provisionedIops;
        this.resourcePolicies = resourcePolicies;
        this.selfLink = selfLink;
        this.size = size;
        this.snapshot = snapshot;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceImageId = sourceImageId;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.sourceSnapshotId = sourceSnapshotId;
        this.type = type;
        this.users = users;
        this.zone = zone;
    }

    private DiskState() {
        this.creationTimestamp = Output.empty();
        this.description = Output.empty();
        this.diskEncryptionKey = Output.empty();
        this.image = Output.empty();
        this.$interface = Output.empty();
        this.labelFingerprint = Output.empty();
        this.labels = Output.empty();
        this.lastAttachTimestamp = Output.empty();
        this.lastDetachTimestamp = Output.empty();
        this.multiWriter = Output.empty();
        this.name = Output.empty();
        this.physicalBlockSizeBytes = Output.empty();
        this.project = Output.empty();
        this.provisionedIops = Output.empty();
        this.resourcePolicies = Output.empty();
        this.selfLink = Output.empty();
        this.size = Output.empty();
        this.snapshot = Output.empty();
        this.sourceImageEncryptionKey = Output.empty();
        this.sourceImageId = Output.empty();
        this.sourceSnapshotEncryptionKey = Output.empty();
        this.sourceSnapshotId = Output.empty();
        this.type = Output.empty();
        this.users = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<DiskDiskEncryptionKeyGetArgs> diskEncryptionKey;
        private @Nullable Output<String> image;
        private @Nullable Output<String> $interface;
        private @Nullable Output<String> labelFingerprint;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> lastAttachTimestamp;
        private @Nullable Output<String> lastDetachTimestamp;
        private @Nullable Output<Boolean> multiWriter;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> physicalBlockSizeBytes;
        private @Nullable Output<String> project;
        private @Nullable Output<Integer> provisionedIops;
        private @Nullable Output<List<String>> resourcePolicies;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<Integer> size;
        private @Nullable Output<String> snapshot;
        private @Nullable Output<DiskSourceImageEncryptionKeyGetArgs> sourceImageEncryptionKey;
        private @Nullable Output<String> sourceImageId;
        private @Nullable Output<DiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey;
        private @Nullable Output<String> sourceSnapshotId;
        private @Nullable Output<String> type;
        private @Nullable Output<List<String>> users;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.image = defaults.image;
    	      this.$interface = defaults.$interface;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.lastAttachTimestamp = defaults.lastAttachTimestamp;
    	      this.lastDetachTimestamp = defaults.lastDetachTimestamp;
    	      this.multiWriter = defaults.multiWriter;
    	      this.name = defaults.name;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.project = defaults.project;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.snapshot = defaults.snapshot;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceImageId = defaults.sourceImageId;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.type = defaults.type;
    	      this.users = defaults.users;
    	      this.zone = defaults.zone;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
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
        public Builder diskEncryptionKey(@Nullable Output<DiskDiskEncryptionKeyGetArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }
        public Builder diskEncryptionKey(@Nullable DiskDiskEncryptionKeyGetArgs diskEncryptionKey) {
            this.diskEncryptionKey = Output.ofNullable(diskEncryptionKey);
            return this;
        }
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Output.ofNullable(image);
            return this;
        }
        public Builder $interface(@Nullable Output<String> $interface) {
            this.$interface = $interface;
            return this;
        }
        public Builder $interface(@Nullable String $interface) {
            this.$interface = Output.ofNullable($interface);
            return this;
        }
        public Builder labelFingerprint(@Nullable Output<String> labelFingerprint) {
            this.labelFingerprint = labelFingerprint;
            return this;
        }
        public Builder labelFingerprint(@Nullable String labelFingerprint) {
            this.labelFingerprint = Output.ofNullable(labelFingerprint);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder lastAttachTimestamp(@Nullable Output<String> lastAttachTimestamp) {
            this.lastAttachTimestamp = lastAttachTimestamp;
            return this;
        }
        public Builder lastAttachTimestamp(@Nullable String lastAttachTimestamp) {
            this.lastAttachTimestamp = Output.ofNullable(lastAttachTimestamp);
            return this;
        }
        public Builder lastDetachTimestamp(@Nullable Output<String> lastDetachTimestamp) {
            this.lastDetachTimestamp = lastDetachTimestamp;
            return this;
        }
        public Builder lastDetachTimestamp(@Nullable String lastDetachTimestamp) {
            this.lastDetachTimestamp = Output.ofNullable(lastDetachTimestamp);
            return this;
        }
        public Builder multiWriter(@Nullable Output<Boolean> multiWriter) {
            this.multiWriter = multiWriter;
            return this;
        }
        public Builder multiWriter(@Nullable Boolean multiWriter) {
            this.multiWriter = Output.ofNullable(multiWriter);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder physicalBlockSizeBytes(@Nullable Output<Integer> physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }
        public Builder physicalBlockSizeBytes(@Nullable Integer physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Output.ofNullable(physicalBlockSizeBytes);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder provisionedIops(@Nullable Output<Integer> provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Builder provisionedIops(@Nullable Integer provisionedIops) {
            this.provisionedIops = Output.ofNullable(provisionedIops);
            return this;
        }
        public Builder resourcePolicies(@Nullable Output<List<String>> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }
        public Builder resourcePolicies(@Nullable List<String> resourcePolicies) {
            this.resourcePolicies = Output.ofNullable(resourcePolicies);
            return this;
        }
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public Builder size(@Nullable Output<Integer> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable Integer size) {
            this.size = Output.ofNullable(size);
            return this;
        }
        public Builder snapshot(@Nullable Output<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder snapshot(@Nullable String snapshot) {
            this.snapshot = Output.ofNullable(snapshot);
            return this;
        }
        public Builder sourceImageEncryptionKey(@Nullable Output<DiskSourceImageEncryptionKeyGetArgs> sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = sourceImageEncryptionKey;
            return this;
        }
        public Builder sourceImageEncryptionKey(@Nullable DiskSourceImageEncryptionKeyGetArgs sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Output.ofNullable(sourceImageEncryptionKey);
            return this;
        }
        public Builder sourceImageId(@Nullable Output<String> sourceImageId) {
            this.sourceImageId = sourceImageId;
            return this;
        }
        public Builder sourceImageId(@Nullable String sourceImageId) {
            this.sourceImageId = Output.ofNullable(sourceImageId);
            return this;
        }
        public Builder sourceSnapshotEncryptionKey(@Nullable Output<DiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }
        public Builder sourceSnapshotEncryptionKey(@Nullable DiskSourceSnapshotEncryptionKeyGetArgs sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Output.ofNullable(sourceSnapshotEncryptionKey);
            return this;
        }
        public Builder sourceSnapshotId(@Nullable Output<String> sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public Builder sourceSnapshotId(@Nullable String sourceSnapshotId) {
            this.sourceSnapshotId = Output.ofNullable(sourceSnapshotId);
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
        public Builder users(@Nullable Output<List<String>> users) {
            this.users = users;
            return this;
        }
        public Builder users(@Nullable List<String> users) {
            this.users = Output.ofNullable(users);
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }        public DiskState build() {
            return new DiskState(creationTimestamp, description, diskEncryptionKey, image, $interface, labelFingerprint, labels, lastAttachTimestamp, lastDetachTimestamp, multiWriter, name, physicalBlockSizeBytes, project, provisionedIops, resourcePolicies, selfLink, size, snapshot, sourceImageEncryptionKey, sourceImageId, sourceSnapshotEncryptionKey, sourceSnapshotId, type, users, zone);
        }
    }
}
