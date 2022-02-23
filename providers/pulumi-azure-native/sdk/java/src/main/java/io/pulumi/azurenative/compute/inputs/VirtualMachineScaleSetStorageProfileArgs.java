// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ImageReferenceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetDataDiskArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetOSDiskArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set storage profile.
 * 
 */
public final class VirtualMachineScaleSetStorageProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetStorageProfileArgs Empty = new VirtualMachineScaleSetStorageProfileArgs();

    /**
     * Specifies the parameters that are used to add data disks to the virtual machines in the scale set. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    @InputImport(name="dataDisks")
      private final @Nullable Input<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks;

    public Input<List<VirtualMachineScaleSetDataDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Input.empty() : this.dataDisks;
    }

    /**
     * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     */
    @InputImport(name="imageReference")
      private final @Nullable Input<ImageReferenceArgs> imageReference;

    public Input<ImageReferenceArgs> getImageReference() {
        return this.imageReference == null ? Input.empty() : this.imageReference;
    }

    /**
     * Specifies information about the operating system disk used by the virtual machines in the scale set. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    @InputImport(name="osDisk")
      private final @Nullable Input<VirtualMachineScaleSetOSDiskArgs> osDisk;

    public Input<VirtualMachineScaleSetOSDiskArgs> getOsDisk() {
        return this.osDisk == null ? Input.empty() : this.osDisk;
    }

    public VirtualMachineScaleSetStorageProfileArgs(
        @Nullable Input<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks,
        @Nullable Input<ImageReferenceArgs> imageReference,
        @Nullable Input<VirtualMachineScaleSetOSDiskArgs> osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    private VirtualMachineScaleSetStorageProfileArgs() {
        this.dataDisks = Input.empty();
        this.imageReference = Input.empty();
        this.osDisk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetStorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks;
        private @Nullable Input<ImageReferenceArgs> imageReference;
        private @Nullable Input<VirtualMachineScaleSetOSDiskArgs> osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetStorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder setDataDisks(@Nullable Input<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setDataDisks(@Nullable List<VirtualMachineScaleSetDataDiskArgs> dataDisks) {
            this.dataDisks = Input.ofNullable(dataDisks);
            return this;
        }

        public Builder setImageReference(@Nullable Input<ImageReferenceArgs> imageReference) {
            this.imageReference = imageReference;
            return this;
        }

        public Builder setImageReference(@Nullable ImageReferenceArgs imageReference) {
            this.imageReference = Input.ofNullable(imageReference);
            return this;
        }

        public Builder setOsDisk(@Nullable Input<VirtualMachineScaleSetOSDiskArgs> osDisk) {
            this.osDisk = osDisk;
            return this;
        }

        public Builder setOsDisk(@Nullable VirtualMachineScaleSetOSDiskArgs osDisk) {
            this.osDisk = Input.ofNullable(osDisk);
            return this;
        }
        public VirtualMachineScaleSetStorageProfileArgs build() {
            return new VirtualMachineScaleSetStorageProfileArgs(dataDisks, imageReference, osDisk);
        }
    }
}
