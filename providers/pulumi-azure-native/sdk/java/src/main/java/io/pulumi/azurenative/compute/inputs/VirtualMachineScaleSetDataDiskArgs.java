// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CachingTypes;
import io.pulumi.azurenative.compute.enums.DiskCreateOptionTypes;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetManagedDiskParametersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set data disk.
 * 
 */
public final class VirtualMachineScaleSetDataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetDataDiskArgs Empty = new VirtualMachineScaleSetDataDiskArgs();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @InputImport(name="caching")
      private final @Nullable Input<CachingTypes> caching;

    public Input<CachingTypes> getCaching() {
        return this.caching == null ? Input.empty() : this.caching;
    }

    /**
     * The create option.
     * 
     */
    @InputImport(name="createOption", required=true)
      private final Input<Either<String,DiskCreateOptionTypes>> createOption;

    public Input<Either<String,DiskCreateOptionTypes>> getCreateOption() {
        return this.createOption;
    }

    /**
     * Specifies the Read-Write IOPS for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    @InputImport(name="diskIOPSReadWrite")
      private final @Nullable Input<Double> diskIOPSReadWrite;

    public Input<Double> getDiskIOPSReadWrite() {
        return this.diskIOPSReadWrite == null ? Input.empty() : this.diskIOPSReadWrite;
    }

    /**
     * Specifies the bandwidth in MB per second for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    @InputImport(name="diskMBpsReadWrite")
      private final @Nullable Input<Double> diskMBpsReadWrite;

    public Input<Double> getDiskMBpsReadWrite() {
        return this.diskMBpsReadWrite == null ? Input.empty() : this.diskMBpsReadWrite;
    }

    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @InputImport(name="lun", required=true)
      private final Input<Integer> lun;

    public Input<Integer> getLun() {
        return this.lun;
    }

    /**
     * The managed disk parameters.
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable Input<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk;

    public Input<VirtualMachineScaleSetManagedDiskParametersArgs> getManagedDisk() {
        return this.managedDisk == null ? Input.empty() : this.managedDisk;
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @InputImport(name="writeAcceleratorEnabled")
      private final @Nullable Input<Boolean> writeAcceleratorEnabled;

    public Input<Boolean> getWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Input.empty() : this.writeAcceleratorEnabled;
    }

    public VirtualMachineScaleSetDataDiskArgs(
        @Nullable Input<CachingTypes> caching,
        Input<Either<String,DiskCreateOptionTypes>> createOption,
        @Nullable Input<Double> diskIOPSReadWrite,
        @Nullable Input<Double> diskMBpsReadWrite,
        @Nullable Input<Integer> diskSizeGB,
        Input<Integer> lun,
        @Nullable Input<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.name = name;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private VirtualMachineScaleSetDataDiskArgs() {
        this.caching = Input.empty();
        this.createOption = Input.empty();
        this.diskIOPSReadWrite = Input.empty();
        this.diskMBpsReadWrite = Input.empty();
        this.diskSizeGB = Input.empty();
        this.lun = Input.empty();
        this.managedDisk = Input.empty();
        this.name = Input.empty();
        this.writeAcceleratorEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CachingTypes> caching;
        private Input<Either<String,DiskCreateOptionTypes>> createOption;
        private @Nullable Input<Double> diskIOPSReadWrite;
        private @Nullable Input<Double> diskMBpsReadWrite;
        private @Nullable Input<Integer> diskSizeGB;
        private Input<Integer> lun;
        private @Nullable Input<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetDataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diskIOPSReadWrite = defaults.diskIOPSReadWrite;
    	      this.diskMBpsReadWrite = defaults.diskMBpsReadWrite;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder setCaching(@Nullable Input<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }

        public Builder setCaching(@Nullable CachingTypes caching) {
            this.caching = Input.ofNullable(caching);
            return this;
        }

        public Builder setCreateOption(Input<Either<String,DiskCreateOptionTypes>> createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder setCreateOption(Either<String,DiskCreateOptionTypes> createOption) {
            this.createOption = Input.of(Objects.requireNonNull(createOption));
            return this;
        }

        public Builder setDiskIOPSReadWrite(@Nullable Input<Double> diskIOPSReadWrite) {
            this.diskIOPSReadWrite = diskIOPSReadWrite;
            return this;
        }

        public Builder setDiskIOPSReadWrite(@Nullable Double diskIOPSReadWrite) {
            this.diskIOPSReadWrite = Input.ofNullable(diskIOPSReadWrite);
            return this;
        }

        public Builder setDiskMBpsReadWrite(@Nullable Input<Double> diskMBpsReadWrite) {
            this.diskMBpsReadWrite = diskMBpsReadWrite;
            return this;
        }

        public Builder setDiskMBpsReadWrite(@Nullable Double diskMBpsReadWrite) {
            this.diskMBpsReadWrite = Input.ofNullable(diskMBpsReadWrite);
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Input<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Input.ofNullable(diskSizeGB);
            return this;
        }

        public Builder setLun(Input<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Input.of(Objects.requireNonNull(lun));
            return this;
        }

        public Builder setManagedDisk(@Nullable Input<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder setManagedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersArgs managedDisk) {
            this.managedDisk = Input.ofNullable(managedDisk);
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

        public Builder setWriteAcceleratorEnabled(@Nullable Input<Boolean> writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        public Builder setWriteAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = Input.ofNullable(writeAcceleratorEnabled);
            return this;
        }
        public VirtualMachineScaleSetDataDiskArgs build() {
            return new VirtualMachineScaleSetDataDiskArgs(caching, createOption, diskIOPSReadWrite, diskMBpsReadWrite, diskSizeGB, lun, managedDisk, name, writeAcceleratorEnabled);
        }
    }
}
