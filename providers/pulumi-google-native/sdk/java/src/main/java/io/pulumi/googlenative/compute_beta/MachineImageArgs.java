// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_beta.inputs.SavedDiskArgs;
import io.pulumi.googlenative.compute_beta.inputs.SourceDiskEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageArgs Empty = new MachineImageArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @Import(name="guestFlush")
      private final @Nullable Output<Boolean> guestFlush;

    public Output<Boolean> getGuestFlush() {
        return this.guestFlush == null ? Codegen.empty() : this.guestFlush;
    }

    /**
     * Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    @Import(name="machineImageEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> machineImageEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> getMachineImageEncryptionKey() {
        return this.machineImageEncryptionKey == null ? Codegen.empty() : this.machineImageEncryptionKey;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    @Import(name="savedDisks")
      private final @Nullable Output<List<SavedDiskArgs>> savedDisks;

    public Output<List<SavedDiskArgs>> getSavedDisks() {
        return this.savedDisks == null ? Codegen.empty() : this.savedDisks;
    }

    /**
     * [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @Import(name="sourceDiskEncryptionKeys")
      private final @Nullable Output<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys;

    public Output<List<SourceDiskEncryptionKeyArgs>> getSourceDiskEncryptionKeys() {
        return this.sourceDiskEncryptionKeys == null ? Codegen.empty() : this.sourceDiskEncryptionKeys;
    }

    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @Import(name="sourceInstance", required=true)
      private final Output<String> sourceInstance;

    public Output<String> getSourceInstance() {
        return this.sourceInstance;
    }

    /**
     * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    @Import(name="storageLocations")
      private final @Nullable Output<List<String>> storageLocations;

    public Output<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Codegen.empty() : this.storageLocations;
    }

    public MachineImageArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> guestFlush,
        @Nullable Output<CustomerEncryptionKeyArgs> machineImageEncryptionKey,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<List<SavedDiskArgs>> savedDisks,
        @Nullable Output<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys,
        Output<String> sourceInstance,
        @Nullable Output<List<String>> storageLocations) {
        this.description = description;
        this.guestFlush = guestFlush;
        this.machineImageEncryptionKey = machineImageEncryptionKey;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.savedDisks = savedDisks;
        this.sourceDiskEncryptionKeys = sourceDiskEncryptionKeys;
        this.sourceInstance = Objects.requireNonNull(sourceInstance, "expected parameter 'sourceInstance' to be non-null");
        this.storageLocations = storageLocations;
    }

    private MachineImageArgs() {
        this.description = Codegen.empty();
        this.guestFlush = Codegen.empty();
        this.machineImageEncryptionKey = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.savedDisks = Codegen.empty();
        this.sourceDiskEncryptionKeys = Codegen.empty();
        this.sourceInstance = Codegen.empty();
        this.storageLocations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> guestFlush;
        private @Nullable Output<CustomerEncryptionKeyArgs> machineImageEncryptionKey;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<SavedDiskArgs>> savedDisks;
        private @Nullable Output<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys;
        private Output<String> sourceInstance;
        private @Nullable Output<List<String>> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.guestFlush = defaults.guestFlush;
    	      this.machineImageEncryptionKey = defaults.machineImageEncryptionKey;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.savedDisks = defaults.savedDisks;
    	      this.sourceDiskEncryptionKeys = defaults.sourceDiskEncryptionKeys;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder guestFlush(@Nullable Output<Boolean> guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }
        public Builder guestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = Codegen.ofNullable(guestFlush);
            return this;
        }
        public Builder machineImageEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> machineImageEncryptionKey) {
            this.machineImageEncryptionKey = machineImageEncryptionKey;
            return this;
        }
        public Builder machineImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs machineImageEncryptionKey) {
            this.machineImageEncryptionKey = Codegen.ofNullable(machineImageEncryptionKey);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder savedDisks(@Nullable Output<List<SavedDiskArgs>> savedDisks) {
            this.savedDisks = savedDisks;
            return this;
        }
        public Builder savedDisks(@Nullable List<SavedDiskArgs> savedDisks) {
            this.savedDisks = Codegen.ofNullable(savedDisks);
            return this;
        }
        public Builder savedDisks(SavedDiskArgs... savedDisks) {
            return savedDisks(List.of(savedDisks));
        }
        public Builder sourceDiskEncryptionKeys(@Nullable Output<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys) {
            this.sourceDiskEncryptionKeys = sourceDiskEncryptionKeys;
            return this;
        }
        public Builder sourceDiskEncryptionKeys(@Nullable List<SourceDiskEncryptionKeyArgs> sourceDiskEncryptionKeys) {
            this.sourceDiskEncryptionKeys = Codegen.ofNullable(sourceDiskEncryptionKeys);
            return this;
        }
        public Builder sourceDiskEncryptionKeys(SourceDiskEncryptionKeyArgs... sourceDiskEncryptionKeys) {
            return sourceDiskEncryptionKeys(List.of(sourceDiskEncryptionKeys));
        }
        public Builder sourceInstance(Output<String> sourceInstance) {
            this.sourceInstance = Objects.requireNonNull(sourceInstance);
            return this;
        }
        public Builder sourceInstance(String sourceInstance) {
            this.sourceInstance = Output.of(Objects.requireNonNull(sourceInstance));
            return this;
        }
        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }
        public Builder storageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Codegen.ofNullable(storageLocations);
            return this;
        }
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }        public MachineImageArgs build() {
            return new MachineImageArgs(description, guestFlush, machineImageEncryptionKey, name, project, requestId, savedDisks, sourceDiskEncryptionKeys, sourceInstance, storageLocations);
        }
    }
}
