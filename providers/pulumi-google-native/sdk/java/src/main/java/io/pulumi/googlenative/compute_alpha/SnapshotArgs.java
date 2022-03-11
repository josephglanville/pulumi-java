// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SnapshotSnapshotType;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
     */
    @InputImport(name="chainName")
      private final @Nullable Output<String> chainName;

    public Output<String> getChainName() {
        return this.chainName == null ? Output.empty() : this.chainName;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * [Input Only] Whether to attempt an application consistent snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @InputImport(name="guestFlush")
      private final @Nullable Output<Boolean> guestFlush;

    public Output<Boolean> getGuestFlush() {
        return this.guestFlush == null ? Output.empty() : this.guestFlush;
    }

    /**
     * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @InputImport(name="locationHint")
      private final @Nullable Output<String> locationHint;

    public Output<String> getLocationHint() {
        return this.locationHint == null ? Output.empty() : this.locationHint;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
     */
    @InputImport(name="snapshotEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> snapshotEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> getSnapshotEncryptionKey() {
        return this.snapshotEncryptionKey == null ? Output.empty() : this.snapshotEncryptionKey;
    }

    /**
     * Indicates the type of the snapshot.
     * 
     */
    @InputImport(name="snapshotType")
      private final @Nullable Output<SnapshotSnapshotType> snapshotType;

    public Output<SnapshotSnapshotType> getSnapshotType() {
        return this.snapshotType == null ? Output.empty() : this.snapshotType;
    }

    /**
     * The source disk used to create this snapshot.
     * 
     */
    @InputImport(name="sourceDisk")
      private final @Nullable Output<String> sourceDisk;

    public Output<String> getSourceDisk() {
        return this.sourceDisk == null ? Output.empty() : this.sourceDisk;
    }

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceDiskEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey == null ? Output.empty() : this.sourceDiskEncryptionKey;
    }

    /**
     * The source instant snapshot used to create this snapshot. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instantSnapshots/instantSnapshot - projects/project/zones/zone/instantSnapshots/instantSnapshot - zones/zone/instantSnapshots/instantSnapshot
     * 
     */
    @InputImport(name="sourceInstantSnapshot")
      private final @Nullable Output<String> sourceInstantSnapshot;

    public Output<String> getSourceInstantSnapshot() {
        return this.sourceInstantSnapshot == null ? Output.empty() : this.sourceInstantSnapshot;
    }

    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @InputImport(name="storageLocations")
      private final @Nullable Output<List<String>> storageLocations;

    public Output<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Output.empty() : this.storageLocations;
    }

    public SnapshotArgs(
        @Nullable Output<String> chainName,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> guestFlush,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> locationHint,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<CustomerEncryptionKeyArgs> snapshotEncryptionKey,
        @Nullable Output<SnapshotSnapshotType> snapshotType,
        @Nullable Output<String> sourceDisk,
        @Nullable Output<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey,
        @Nullable Output<String> sourceInstantSnapshot,
        @Nullable Output<List<String>> storageLocations) {
        this.chainName = chainName;
        this.description = description;
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.locationHint = locationHint;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.snapshotEncryptionKey = snapshotEncryptionKey;
        this.snapshotType = snapshotType;
        this.sourceDisk = sourceDisk;
        this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
        this.sourceInstantSnapshot = sourceInstantSnapshot;
        this.storageLocations = storageLocations;
    }

    private SnapshotArgs() {
        this.chainName = Output.empty();
        this.description = Output.empty();
        this.guestFlush = Output.empty();
        this.labels = Output.empty();
        this.locationHint = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.snapshotEncryptionKey = Output.empty();
        this.snapshotType = Output.empty();
        this.sourceDisk = Output.empty();
        this.sourceDiskEncryptionKey = Output.empty();
        this.sourceInstantSnapshot = Output.empty();
        this.storageLocations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> chainName;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> guestFlush;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> locationHint;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<CustomerEncryptionKeyArgs> snapshotEncryptionKey;
        private @Nullable Output<SnapshotSnapshotType> snapshotType;
        private @Nullable Output<String> sourceDisk;
        private @Nullable Output<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey;
        private @Nullable Output<String> sourceInstantSnapshot;
        private @Nullable Output<List<String>> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainName = defaults.chainName;
    	      this.description = defaults.description;
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.locationHint = defaults.locationHint;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.snapshotEncryptionKey = defaults.snapshotEncryptionKey;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKey = defaults.sourceDiskEncryptionKey;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder chainName(@Nullable Output<String> chainName) {
            this.chainName = chainName;
            return this;
        }

        public Builder chainName(@Nullable String chainName) {
            this.chainName = Output.ofNullable(chainName);
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

        public Builder guestFlush(@Nullable Output<Boolean> guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }

        public Builder guestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = Output.ofNullable(guestFlush);
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

        public Builder locationHint(@Nullable Output<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder locationHint(@Nullable String locationHint) {
            this.locationHint = Output.ofNullable(locationHint);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder snapshotEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> snapshotEncryptionKey) {
            this.snapshotEncryptionKey = snapshotEncryptionKey;
            return this;
        }

        public Builder snapshotEncryptionKey(@Nullable CustomerEncryptionKeyArgs snapshotEncryptionKey) {
            this.snapshotEncryptionKey = Output.ofNullable(snapshotEncryptionKey);
            return this;
        }

        public Builder snapshotType(@Nullable Output<SnapshotSnapshotType> snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        public Builder snapshotType(@Nullable SnapshotSnapshotType snapshotType) {
            this.snapshotType = Output.ofNullable(snapshotType);
            return this;
        }

        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }

        public Builder sourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Output.ofNullable(sourceDisk);
            return this;
        }

        public Builder sourceDiskEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        public Builder sourceDiskEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = Output.ofNullable(sourceDiskEncryptionKey);
            return this;
        }

        public Builder sourceInstantSnapshot(@Nullable Output<String> sourceInstantSnapshot) {
            this.sourceInstantSnapshot = sourceInstantSnapshot;
            return this;
        }

        public Builder sourceInstantSnapshot(@Nullable String sourceInstantSnapshot) {
            this.sourceInstantSnapshot = Output.ofNullable(sourceInstantSnapshot);
            return this;
        }

        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder storageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Output.ofNullable(storageLocations);
            return this;
        }
        public SnapshotArgs build() {
            return new SnapshotArgs(chainName, description, guestFlush, labels, locationHint, name, project, requestId, snapshotEncryptionKey, snapshotType, sourceDisk, sourceDiskEncryptionKey, sourceInstantSnapshot, storageLocations);
        }
    }
}
