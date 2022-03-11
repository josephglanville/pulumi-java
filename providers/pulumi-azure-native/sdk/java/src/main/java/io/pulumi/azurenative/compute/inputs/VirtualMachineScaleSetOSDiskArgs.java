// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CachingTypes;
import io.pulumi.azurenative.compute.enums.DiskCreateOptionTypes;
import io.pulumi.azurenative.compute.enums.OperatingSystemTypes;
import io.pulumi.azurenative.compute.inputs.DiffDiskSettingsArgs;
import io.pulumi.azurenative.compute.inputs.VirtualHardDiskArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetManagedDiskParametersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set operating system disk.
 * 
 */
public final class VirtualMachineScaleSetOSDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetOSDiskArgs Empty = new VirtualMachineScaleSetOSDiskArgs();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @InputImport(name="caching")
      private final @Nullable Output<CachingTypes> caching;

    public Output<CachingTypes> getCaching() {
        return this.caching == null ? Output.empty() : this.caching;
    }

    /**
     * Specifies how the virtual machines in the scale set should be created.<br><br> The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    @InputImport(name="createOption", required=true)
      private final Output<Either<String,DiskCreateOptionTypes>> createOption;

    public Output<Either<String,DiskCreateOptionTypes>> getCreateOption() {
        return this.createOption;
    }

    /**
     * Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     * 
     */
    @InputImport(name="diffDiskSettings")
      private final @Nullable Output<DiffDiskSettingsArgs> diffDiskSettings;

    public Output<DiffDiskSettingsArgs> getDiffDiskSettings() {
        return this.diffDiskSettings == null ? Output.empty() : this.diffDiskSettings;
    }

    /**
     * Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Output<Integer> diskSizeGB;

    public Output<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Output.empty() : this.diskSizeGB;
    }

    /**
     * Specifies information about the unmanaged user image to base the scale set on.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Output<VirtualHardDiskArgs> image;

    public Output<VirtualHardDiskArgs> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * The managed disk parameters.
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk;

    public Output<VirtualMachineScaleSetManagedDiskParametersArgs> getManagedDisk() {
        return this.managedDisk == null ? Output.empty() : this.managedDisk;
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @InputImport(name="osType")
      private final @Nullable Output<OperatingSystemTypes> osType;

    public Output<OperatingSystemTypes> getOsType() {
        return this.osType == null ? Output.empty() : this.osType;
    }

    /**
     * Specifies the container urls that are used to store operating system disks for the scale set.
     * 
     */
    @InputImport(name="vhdContainers")
      private final @Nullable Output<List<String>> vhdContainers;

    public Output<List<String>> getVhdContainers() {
        return this.vhdContainers == null ? Output.empty() : this.vhdContainers;
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @InputImport(name="writeAcceleratorEnabled")
      private final @Nullable Output<Boolean> writeAcceleratorEnabled;

    public Output<Boolean> getWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Output.empty() : this.writeAcceleratorEnabled;
    }

    public VirtualMachineScaleSetOSDiskArgs(
        @Nullable Output<CachingTypes> caching,
        Output<Either<String,DiskCreateOptionTypes>> createOption,
        @Nullable Output<DiffDiskSettingsArgs> diffDiskSettings,
        @Nullable Output<Integer> diskSizeGB,
        @Nullable Output<VirtualHardDiskArgs> image,
        @Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk,
        @Nullable Output<String> name,
        @Nullable Output<OperatingSystemTypes> osType,
        @Nullable Output<List<String>> vhdContainers,
        @Nullable Output<Boolean> writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.diffDiskSettings = diffDiskSettings;
        this.diskSizeGB = diskSizeGB;
        this.image = image;
        this.managedDisk = managedDisk;
        this.name = name;
        this.osType = osType;
        this.vhdContainers = vhdContainers;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private VirtualMachineScaleSetOSDiskArgs() {
        this.caching = Output.empty();
        this.createOption = Output.empty();
        this.diffDiskSettings = Output.empty();
        this.diskSizeGB = Output.empty();
        this.image = Output.empty();
        this.managedDisk = Output.empty();
        this.name = Output.empty();
        this.osType = Output.empty();
        this.vhdContainers = Output.empty();
        this.writeAcceleratorEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetOSDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CachingTypes> caching;
        private Output<Either<String,DiskCreateOptionTypes>> createOption;
        private @Nullable Output<DiffDiskSettingsArgs> diffDiskSettings;
        private @Nullable Output<Integer> diskSizeGB;
        private @Nullable Output<VirtualHardDiskArgs> image;
        private @Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk;
        private @Nullable Output<String> name;
        private @Nullable Output<OperatingSystemTypes> osType;
        private @Nullable Output<List<String>> vhdContainers;
        private @Nullable Output<Boolean> writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetOSDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diffDiskSettings = defaults.diffDiskSettings;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.image = defaults.image;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.vhdContainers = defaults.vhdContainers;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(@Nullable Output<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }

        public Builder caching(@Nullable CachingTypes caching) {
            this.caching = Output.ofNullable(caching);
            return this;
        }

        public Builder createOption(Output<Either<String,DiskCreateOptionTypes>> createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder createOption(Either<String,DiskCreateOptionTypes> createOption) {
            this.createOption = Output.of(Objects.requireNonNull(createOption));
            return this;
        }

        public Builder diffDiskSettings(@Nullable Output<DiffDiskSettingsArgs> diffDiskSettings) {
            this.diffDiskSettings = diffDiskSettings;
            return this;
        }

        public Builder diffDiskSettings(@Nullable DiffDiskSettingsArgs diffDiskSettings) {
            this.diffDiskSettings = Output.ofNullable(diffDiskSettings);
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

        public Builder image(@Nullable Output<VirtualHardDiskArgs> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable VirtualHardDiskArgs image) {
            this.image = Output.ofNullable(image);
            return this;
        }

        public Builder managedDisk(@Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder managedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersArgs managedDisk) {
            this.managedDisk = Output.ofNullable(managedDisk);
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

        public Builder osType(@Nullable Output<OperatingSystemTypes> osType) {
            this.osType = osType;
            return this;
        }

        public Builder osType(@Nullable OperatingSystemTypes osType) {
            this.osType = Output.ofNullable(osType);
            return this;
        }

        public Builder vhdContainers(@Nullable Output<List<String>> vhdContainers) {
            this.vhdContainers = vhdContainers;
            return this;
        }

        public Builder vhdContainers(@Nullable List<String> vhdContainers) {
            this.vhdContainers = Output.ofNullable(vhdContainers);
            return this;
        }

        public Builder writeAcceleratorEnabled(@Nullable Output<Boolean> writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = Output.ofNullable(writeAcceleratorEnabled);
            return this;
        }
        public VirtualMachineScaleSetOSDiskArgs build() {
            return new VirtualMachineScaleSetOSDiskArgs(caching, createOption, diffDiskSettings, diskSizeGB, image, managedDisk, name, osType, vhdContainers, writeAcceleratorEnabled);
        }
    }
}
