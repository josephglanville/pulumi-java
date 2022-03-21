// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CachingTypes;
import io.pulumi.azurenative.compute.enums.StorageAccountTypes;
import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a data disk.
 * 
 */
public final class ImageDataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageDataDiskArgs Empty = new ImageDataDiskArgs();

    /**
     * The Virtual Hard Disk.
     * 
     */
    @Import(name="blobUri")
      private final @Nullable Output<String> blobUri;

    public Output<String> getBlobUri() {
        return this.blobUri == null ? Output.empty() : this.blobUri;
    }

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @Import(name="caching")
      private final @Nullable Output<CachingTypes> caching;

    public Output<CachingTypes> getCaching() {
        return this.caching == null ? Output.empty() : this.caching;
    }

    /**
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    @Import(name="diskEncryptionSet")
      private final @Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Output<DiskEncryptionSetParametersArgs> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Output.empty() : this.diskEncryptionSet;
    }

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @Import(name="diskSizeGB")
      private final @Nullable Output<Integer> diskSizeGB;

    public Output<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Output.empty() : this.diskSizeGB;
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @Import(name="lun", required=true)
      private final Output<Integer> lun;

    public Output<Integer> getLun() {
        return this.lun;
    }

    /**
     * The managedDisk.
     * 
     */
    @Import(name="managedDisk")
      private final @Nullable Output<SubResourceArgs> managedDisk;

    public Output<SubResourceArgs> getManagedDisk() {
        return this.managedDisk == null ? Output.empty() : this.managedDisk;
    }

    /**
     * The snapshot.
     * 
     */
    @Import(name="snapshot")
      private final @Nullable Output<SubResourceArgs> snapshot;

    public Output<SubResourceArgs> getSnapshot() {
        return this.snapshot == null ? Output.empty() : this.snapshot;
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @Import(name="storageAccountType")
      private final @Nullable Output<Either<String,StorageAccountTypes>> storageAccountType;

    public Output<Either<String,StorageAccountTypes>> getStorageAccountType() {
        return this.storageAccountType == null ? Output.empty() : this.storageAccountType;
    }

    public ImageDataDiskArgs(
        @Nullable Output<String> blobUri,
        @Nullable Output<CachingTypes> caching,
        @Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet,
        @Nullable Output<Integer> diskSizeGB,
        Output<Integer> lun,
        @Nullable Output<SubResourceArgs> managedDisk,
        @Nullable Output<SubResourceArgs> snapshot,
        @Nullable Output<Either<String,StorageAccountTypes>> storageAccountType) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.diskEncryptionSet = diskEncryptionSet;
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.snapshot = snapshot;
        this.storageAccountType = storageAccountType;
    }

    private ImageDataDiskArgs() {
        this.blobUri = Output.empty();
        this.caching = Output.empty();
        this.diskEncryptionSet = Output.empty();
        this.diskSizeGB = Output.empty();
        this.lun = Output.empty();
        this.managedDisk = Output.empty();
        this.snapshot = Output.empty();
        this.storageAccountType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> blobUri;
        private @Nullable Output<CachingTypes> caching;
        private @Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet;
        private @Nullable Output<Integer> diskSizeGB;
        private Output<Integer> lun;
        private @Nullable Output<SubResourceArgs> managedDisk;
        private @Nullable Output<SubResourceArgs> snapshot;
        private @Nullable Output<Either<String,StorageAccountTypes>> storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageDataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.snapshot = defaults.snapshot;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder blobUri(@Nullable Output<String> blobUri) {
            this.blobUri = blobUri;
            return this;
        }
        public Builder blobUri(@Nullable String blobUri) {
            this.blobUri = Output.ofNullable(blobUri);
            return this;
        }
        public Builder caching(@Nullable Output<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }
        public Builder caching(@Nullable CachingTypes caching) {
            this.caching = Output.ofNullable(caching);
            return this;
        }
        public Builder diskEncryptionSet(@Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }
        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersArgs diskEncryptionSet) {
            this.diskEncryptionSet = Output.ofNullable(diskEncryptionSet);
            return this;
        }
        public Builder diskSizeGB(@Nullable Output<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Output.ofNullable(diskSizeGB);
            return this;
        }
        public Builder lun(Output<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        public Builder lun(Integer lun) {
            this.lun = Output.of(Objects.requireNonNull(lun));
            return this;
        }
        public Builder managedDisk(@Nullable Output<SubResourceArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder managedDisk(@Nullable SubResourceArgs managedDisk) {
            this.managedDisk = Output.ofNullable(managedDisk);
            return this;
        }
        public Builder snapshot(@Nullable Output<SubResourceArgs> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder snapshot(@Nullable SubResourceArgs snapshot) {
            this.snapshot = Output.ofNullable(snapshot);
            return this;
        }
        public Builder storageAccountType(@Nullable Output<Either<String,StorageAccountTypes>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public Builder storageAccountType(@Nullable Either<String,StorageAccountTypes> storageAccountType) {
            this.storageAccountType = Output.ofNullable(storageAccountType);
            return this;
        }        public ImageDataDiskArgs build() {
            return new ImageDataDiskArgs(blobUri, caching, diskEncryptionSet, diskSizeGB, lun, managedDisk, snapshot, storageAccountType);
        }
    }
}
