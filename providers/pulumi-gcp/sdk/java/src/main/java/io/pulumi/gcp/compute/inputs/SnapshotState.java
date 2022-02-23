// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyGetArgs;
import io.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotState extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
      private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Size of the snapshot, specified in GB.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Input<Integer> diskSizeGb;

    public Input<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @InputImport(name="labelFingerprint")
      private final @Nullable Input<String> labelFingerprint;

    public Input<String> getLabelFingerprint() {
        return this.labelFingerprint == null ? Input.empty() : this.labelFingerprint;
    }

    /**
     * Labels to apply to this Snapshot.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
     * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
     * encryption key.
     * 
     */
    @InputImport(name="licenses")
      private final @Nullable Input<List<String>> licenses;

    public Input<List<String>> getLicenses() {
        return this.licenses == null ? Input.empty() : this.licenses;
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="snapshotEncryptionKey")
      private final @Nullable Input<SnapshotSnapshotEncryptionKeyGetArgs> snapshotEncryptionKey;

    public Input<SnapshotSnapshotEncryptionKeyGetArgs> getSnapshotEncryptionKey() {
        return this.snapshotEncryptionKey == null ? Input.empty() : this.snapshotEncryptionKey;
    }

    /**
     * The unique identifier for the resource.
     * 
     */
    @InputImport(name="snapshotId")
      private final @Nullable Input<Integer> snapshotId;

    public Input<Integer> getSnapshotId() {
        return this.snapshotId == null ? Input.empty() : this.snapshotId;
    }

    /**
     * A reference to the disk used to create this snapshot.
     * 
     */
    @InputImport(name="sourceDisk")
      private final @Nullable Input<String> sourceDisk;

    public Input<String> getSourceDisk() {
        return this.sourceDisk == null ? Input.empty() : this.sourceDisk;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sourceDiskEncryptionKey")
      private final @Nullable Input<SnapshotSourceDiskEncryptionKeyGetArgs> sourceDiskEncryptionKey;

    public Input<SnapshotSourceDiskEncryptionKeyGetArgs> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey == null ? Input.empty() : this.sourceDiskEncryptionKey;
    }

    /**
     * A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
     * creation/deletion.
     * 
     */
    @InputImport(name="storageBytes")
      private final @Nullable Input<Integer> storageBytes;

    public Input<Integer> getStorageBytes() {
        return this.storageBytes == null ? Input.empty() : this.storageBytes;
    }

    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @InputImport(name="storageLocations")
      private final @Nullable Input<List<String>> storageLocations;

    public Input<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Input.empty() : this.storageLocations;
    }

    /**
     * A reference to the zone where the disk is hosted.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public SnapshotState(
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<Integer> diskSizeGb,
        @Nullable Input<String> labelFingerprint,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> licenses,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<SnapshotSnapshotEncryptionKeyGetArgs> snapshotEncryptionKey,
        @Nullable Input<Integer> snapshotId,
        @Nullable Input<String> sourceDisk,
        @Nullable Input<SnapshotSourceDiskEncryptionKeyGetArgs> sourceDiskEncryptionKey,
        @Nullable Input<Integer> storageBytes,
        @Nullable Input<List<String>> storageLocations,
        @Nullable Input<String> zone) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.diskSizeGb = diskSizeGb;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.licenses = licenses;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.snapshotEncryptionKey = snapshotEncryptionKey;
        this.snapshotId = snapshotId;
        this.sourceDisk = sourceDisk;
        this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
        this.storageBytes = storageBytes;
        this.storageLocations = storageLocations;
        this.zone = zone;
    }

    private SnapshotState() {
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.diskSizeGb = Input.empty();
        this.labelFingerprint = Input.empty();
        this.labels = Input.empty();
        this.licenses = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.snapshotEncryptionKey = Input.empty();
        this.snapshotId = Input.empty();
        this.sourceDisk = Input.empty();
        this.sourceDiskEncryptionKey = Input.empty();
        this.storageBytes = Input.empty();
        this.storageLocations = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> diskSizeGb;
        private @Nullable Input<String> labelFingerprint;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> licenses;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<SnapshotSnapshotEncryptionKeyGetArgs> snapshotEncryptionKey;
        private @Nullable Input<Integer> snapshotId;
        private @Nullable Input<String> sourceDisk;
        private @Nullable Input<SnapshotSourceDiskEncryptionKeyGetArgs> sourceDiskEncryptionKey;
        private @Nullable Input<Integer> storageBytes;
        private @Nullable Input<List<String>> storageLocations;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.licenses = defaults.licenses;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.snapshotEncryptionKey = defaults.snapshotEncryptionKey;
    	      this.snapshotId = defaults.snapshotId;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKey = defaults.sourceDiskEncryptionKey;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageLocations = defaults.storageLocations;
    	      this.zone = defaults.zone;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Input<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setLabelFingerprint(@Nullable Input<String> labelFingerprint) {
            this.labelFingerprint = labelFingerprint;
            return this;
        }

        public Builder setLabelFingerprint(@Nullable String labelFingerprint) {
            this.labelFingerprint = Input.ofNullable(labelFingerprint);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLicenses(@Nullable Input<List<String>> licenses) {
            this.licenses = licenses;
            return this;
        }

        public Builder setLicenses(@Nullable List<String> licenses) {
            this.licenses = Input.ofNullable(licenses);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSnapshotEncryptionKey(@Nullable Input<SnapshotSnapshotEncryptionKeyGetArgs> snapshotEncryptionKey) {
            this.snapshotEncryptionKey = snapshotEncryptionKey;
            return this;
        }

        public Builder setSnapshotEncryptionKey(@Nullable SnapshotSnapshotEncryptionKeyGetArgs snapshotEncryptionKey) {
            this.snapshotEncryptionKey = Input.ofNullable(snapshotEncryptionKey);
            return this;
        }

        public Builder setSnapshotId(@Nullable Input<Integer> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setSnapshotId(@Nullable Integer snapshotId) {
            this.snapshotId = Input.ofNullable(snapshotId);
            return this;
        }

        public Builder setSourceDisk(@Nullable Input<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }

        public Builder setSourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Input.ofNullable(sourceDisk);
            return this;
        }

        public Builder setSourceDiskEncryptionKey(@Nullable Input<SnapshotSourceDiskEncryptionKeyGetArgs> sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        public Builder setSourceDiskEncryptionKey(@Nullable SnapshotSourceDiskEncryptionKeyGetArgs sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = Input.ofNullable(sourceDiskEncryptionKey);
            return this;
        }

        public Builder setStorageBytes(@Nullable Input<Integer> storageBytes) {
            this.storageBytes = storageBytes;
            return this;
        }

        public Builder setStorageBytes(@Nullable Integer storageBytes) {
            this.storageBytes = Input.ofNullable(storageBytes);
            return this;
        }

        public Builder setStorageLocations(@Nullable Input<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder setStorageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Input.ofNullable(storageLocations);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public SnapshotState build() {
            return new SnapshotState(creationTimestamp, description, diskSizeGb, labelFingerprint, labels, licenses, name, project, selfLink, snapshotEncryptionKey, snapshotId, sourceDisk, sourceDiskEncryptionKey, storageBytes, storageLocations, zone);
        }
    }
}
