// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiffDiskSettingsResponse;
import io.pulumi.azurenative.compute.inputs.DiskEncryptionSettingsResponse;
import io.pulumi.azurenative.compute.inputs.ManagedDiskParametersResponse;
import io.pulumi.azurenative.compute.inputs.VirtualHardDiskResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies information about the operating system disk used by the virtual machine. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
 * 
 */
public final class OSDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSDiskResponse Empty = new OSDiskResponse();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None** for Standard storage. **ReadOnly** for Premium storage.
     * 
     */
    @InputImport(name="caching")
      private final @Nullable String caching;

    public Optional<String> getCaching() {
        return this.caching == null ? Optional.empty() : Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the virtual machine should be created.<br><br> Possible values are:<br><br> **Attach** \u2013 This value is used when you are using a specialized disk to create the virtual machine.<br><br> **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    @InputImport(name="createOption", required=true)
      private final String createOption;

    public String getCreateOption() {
        return this.createOption;
    }

    /**
     * Specifies whether OS Disk should be deleted or detached upon VM deletion. <br><br> Possible values: <br><br> **Delete** If this value is used, the OS disk is deleted when VM is deleted.<br><br> **Detach** If this value is used, the os disk is retained after VM is deleted. <br><br> The default value is set to **detach**. For an ephemeral OS Disk, the default value is set to **Delete**. User cannot change the delete option for ephemeral OS Disk.
     * 
     */
    @InputImport(name="deleteOption")
      private final @Nullable String deleteOption;

    public Optional<String> getDeleteOption() {
        return this.deleteOption == null ? Optional.empty() : Optional.ofNullable(this.deleteOption);
    }

    /**
     * Specifies the ephemeral Disk Settings for the operating system disk used by the virtual machine.
     * 
     */
    @InputImport(name="diffDiskSettings")
      private final @Nullable DiffDiskSettingsResponse diffDiskSettings;

    public Optional<DiffDiskSettingsResponse> getDiffDiskSettings() {
        return this.diffDiskSettings == null ? Optional.empty() : Optional.ofNullable(this.diffDiskSettings);
    }

    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Integer diskSizeGB;

    public Optional<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Specifies the encryption settings for the OS Disk. <br><br> Minimum api-version: 2015-06-15
     * 
     */
    @InputImport(name="encryptionSettings")
      private final @Nullable DiskEncryptionSettingsResponse encryptionSettings;

    public Optional<DiskEncryptionSettingsResponse> getEncryptionSettings() {
        return this.encryptionSettings == null ? Optional.empty() : Optional.ofNullable(this.encryptionSettings);
    }

    /**
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * 
     */
    @InputImport(name="image")
      private final @Nullable VirtualHardDiskResponse image;

    public Optional<VirtualHardDiskResponse> getImage() {
        return this.image == null ? Optional.empty() : Optional.ofNullable(this.image);
    }

    /**
     * The managed disk parameters.
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable ManagedDiskParametersResponse managedDisk;

    public Optional<ManagedDiskParametersResponse> getManagedDisk() {
        return this.managedDisk == null ? Optional.empty() : Optional.ofNullable(this.managedDisk);
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @InputImport(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * The virtual hard disk.
     * 
     */
    @InputImport(name="vhd")
      private final @Nullable VirtualHardDiskResponse vhd;

    public Optional<VirtualHardDiskResponse> getVhd() {
        return this.vhd == null ? Optional.empty() : Optional.ofNullable(this.vhd);
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @InputImport(name="writeAcceleratorEnabled")
      private final @Nullable Boolean writeAcceleratorEnabled;

    public Optional<Boolean> getWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Optional.empty() : Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public OSDiskResponse(
        @Nullable String caching,
        String createOption,
        @Nullable String deleteOption,
        @Nullable DiffDiskSettingsResponse diffDiskSettings,
        @Nullable Integer diskSizeGB,
        @Nullable DiskEncryptionSettingsResponse encryptionSettings,
        @Nullable VirtualHardDiskResponse image,
        @Nullable ManagedDiskParametersResponse managedDisk,
        @Nullable String name,
        @Nullable String osType,
        @Nullable VirtualHardDiskResponse vhd,
        @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.deleteOption = deleteOption;
        this.diffDiskSettings = diffDiskSettings;
        this.diskSizeGB = diskSizeGB;
        this.encryptionSettings = encryptionSettings;
        this.image = image;
        this.managedDisk = managedDisk;
        this.name = name;
        this.osType = osType;
        this.vhd = vhd;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private OSDiskResponse() {
        this.caching = null;
        this.createOption = null;
        this.deleteOption = null;
        this.diffDiskSettings = null;
        this.diskSizeGB = null;
        this.encryptionSettings = null;
        this.image = null;
        this.managedDisk = null;
        this.name = null;
        this.osType = null;
        this.vhd = null;
        this.writeAcceleratorEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable String deleteOption;
        private @Nullable DiffDiskSettingsResponse diffDiskSettings;
        private @Nullable Integer diskSizeGB;
        private @Nullable DiskEncryptionSettingsResponse encryptionSettings;
        private @Nullable VirtualHardDiskResponse image;
        private @Nullable ManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable String osType;
        private @Nullable VirtualHardDiskResponse vhd;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(OSDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.deleteOption = defaults.deleteOption;
    	      this.diffDiskSettings = defaults.diffDiskSettings;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.image = defaults.image;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.vhd = defaults.vhd;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder setCaching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder setCreateOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder setDeleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder setDiffDiskSettings(@Nullable DiffDiskSettingsResponse diffDiskSettings) {
            this.diffDiskSettings = diffDiskSettings;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setEncryptionSettings(@Nullable DiskEncryptionSettingsResponse encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }

        public Builder setImage(@Nullable VirtualHardDiskResponse image) {
            this.image = image;
            return this;
        }

        public Builder setManagedDisk(@Nullable ManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setVhd(@Nullable VirtualHardDiskResponse vhd) {
            this.vhd = vhd;
            return this;
        }

        public Builder setWriteAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }
        public OSDiskResponse build() {
            return new OSDiskResponse(caching, createOption, deleteOption, diffDiskSettings, diskSizeGB, encryptionSettings, image, managedDisk, name, osType, vhd, writeAcceleratorEnabled);
        }
    }
}
