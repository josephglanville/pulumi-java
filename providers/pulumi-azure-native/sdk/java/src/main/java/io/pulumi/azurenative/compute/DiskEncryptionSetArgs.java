// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.enums.DiskEncryptionSetType;
import io.pulumi.azurenative.compute.inputs.EncryptionSetIdentityArgs;
import io.pulumi.azurenative.compute.inputs.KeyForDiskEncryptionSetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskEncryptionSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionSetArgs Empty = new DiskEncryptionSetArgs();

    /**
     * The key vault key which is currently used by this disk encryption set.
     * 
     */
    @Import(name="activeKey")
      private final @Nullable Output<KeyForDiskEncryptionSetArgs> activeKey;

    public Output<KeyForDiskEncryptionSetArgs> getActiveKey() {
        return this.activeKey == null ? Codegen.empty() : this.activeKey;
    }

    /**
     * The name of the disk encryption set that is being created. The name can't be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @Import(name="diskEncryptionSetName")
      private final @Nullable Output<String> diskEncryptionSetName;

    public Output<String> getDiskEncryptionSetName() {
        return this.diskEncryptionSetName == null ? Codegen.empty() : this.diskEncryptionSetName;
    }

    /**
     * The type of key used to encrypt the data of the disk.
     * 
     */
    @Import(name="encryptionType")
      private final @Nullable Output<Either<String,DiskEncryptionSetType>> encryptionType;

    public Output<Either<String,DiskEncryptionSetType>> getEncryptionType() {
        return this.encryptionType == null ? Codegen.empty() : this.encryptionType;
    }

    /**
     * The managed identity for the disk encryption set. It should be given permission on the key vault before it can be used to encrypt disks.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<EncryptionSetIdentityArgs> identity;

    public Output<EncryptionSetIdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set this flag to true to enable auto-updating of this disk encryption set to the latest key version.
     * 
     */
    @Import(name="rotationToLatestKeyVersionEnabled")
      private final @Nullable Output<Boolean> rotationToLatestKeyVersionEnabled;

    public Output<Boolean> getRotationToLatestKeyVersionEnabled() {
        return this.rotationToLatestKeyVersionEnabled == null ? Codegen.empty() : this.rotationToLatestKeyVersionEnabled;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DiskEncryptionSetArgs(
        @Nullable Output<KeyForDiskEncryptionSetArgs> activeKey,
        @Nullable Output<String> diskEncryptionSetName,
        @Nullable Output<Either<String,DiskEncryptionSetType>> encryptionType,
        @Nullable Output<EncryptionSetIdentityArgs> identity,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Boolean> rotationToLatestKeyVersionEnabled,
        @Nullable Output<Map<String,String>> tags) {
        this.activeKey = activeKey;
        this.diskEncryptionSetName = diskEncryptionSetName;
        this.encryptionType = encryptionType;
        this.identity = identity;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rotationToLatestKeyVersionEnabled = rotationToLatestKeyVersionEnabled;
        this.tags = tags;
    }

    private DiskEncryptionSetArgs() {
        this.activeKey = Codegen.empty();
        this.diskEncryptionSetName = Codegen.empty();
        this.encryptionType = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.rotationToLatestKeyVersionEnabled = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<KeyForDiskEncryptionSetArgs> activeKey;
        private @Nullable Output<String> diskEncryptionSetName;
        private @Nullable Output<Either<String,DiskEncryptionSetType>> encryptionType;
        private @Nullable Output<EncryptionSetIdentityArgs> identity;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Boolean> rotationToLatestKeyVersionEnabled;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeKey = defaults.activeKey;
    	      this.diskEncryptionSetName = defaults.diskEncryptionSetName;
    	      this.encryptionType = defaults.encryptionType;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rotationToLatestKeyVersionEnabled = defaults.rotationToLatestKeyVersionEnabled;
    	      this.tags = defaults.tags;
        }

        public Builder activeKey(@Nullable Output<KeyForDiskEncryptionSetArgs> activeKey) {
            this.activeKey = activeKey;
            return this;
        }
        public Builder activeKey(@Nullable KeyForDiskEncryptionSetArgs activeKey) {
            this.activeKey = Codegen.ofNullable(activeKey);
            return this;
        }
        public Builder diskEncryptionSetName(@Nullable Output<String> diskEncryptionSetName) {
            this.diskEncryptionSetName = diskEncryptionSetName;
            return this;
        }
        public Builder diskEncryptionSetName(@Nullable String diskEncryptionSetName) {
            this.diskEncryptionSetName = Codegen.ofNullable(diskEncryptionSetName);
            return this;
        }
        public Builder encryptionType(@Nullable Output<Either<String,DiskEncryptionSetType>> encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public Builder encryptionType(@Nullable Either<String,DiskEncryptionSetType> encryptionType) {
            this.encryptionType = Codegen.ofNullable(encryptionType);
            return this;
        }
        public Builder identity(@Nullable Output<EncryptionSetIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable EncryptionSetIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder rotationToLatestKeyVersionEnabled(@Nullable Output<Boolean> rotationToLatestKeyVersionEnabled) {
            this.rotationToLatestKeyVersionEnabled = rotationToLatestKeyVersionEnabled;
            return this;
        }
        public Builder rotationToLatestKeyVersionEnabled(@Nullable Boolean rotationToLatestKeyVersionEnabled) {
            this.rotationToLatestKeyVersionEnabled = Codegen.ofNullable(rotationToLatestKeyVersionEnabled);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DiskEncryptionSetArgs build() {
            return new DiskEncryptionSetArgs(activeKey, diskEncryptionSetName, encryptionType, identity, location, resourceGroupName, rotationToLatestKeyVersionEnabled, tags);
        }
    }
}
