// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ImageReferenceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetDataDiskArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetOSDiskArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="dataDisks")
      private final @Nullable Output<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks;

    public Output<List<VirtualMachineScaleSetDataDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Codegen.empty() : this.dataDisks;
    }

    /**
     * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     */
    @Import(name="imageReference")
      private final @Nullable Output<ImageReferenceArgs> imageReference;

    public Output<ImageReferenceArgs> getImageReference() {
        return this.imageReference == null ? Codegen.empty() : this.imageReference;
    }

    /**
     * Specifies information about the operating system disk used by the virtual machines in the scale set. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    @Import(name="osDisk")
      private final @Nullable Output<VirtualMachineScaleSetOSDiskArgs> osDisk;

    public Output<VirtualMachineScaleSetOSDiskArgs> getOsDisk() {
        return this.osDisk == null ? Codegen.empty() : this.osDisk;
    }

    public VirtualMachineScaleSetStorageProfileArgs(
        @Nullable Output<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks,
        @Nullable Output<ImageReferenceArgs> imageReference,
        @Nullable Output<VirtualMachineScaleSetOSDiskArgs> osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    private VirtualMachineScaleSetStorageProfileArgs() {
        this.dataDisks = Codegen.empty();
        this.imageReference = Codegen.empty();
        this.osDisk = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetStorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks;
        private @Nullable Output<ImageReferenceArgs> imageReference;
        private @Nullable Output<VirtualMachineScaleSetOSDiskArgs> osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetStorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder dataDisks(@Nullable Output<List<VirtualMachineScaleSetDataDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(@Nullable List<VirtualMachineScaleSetDataDiskArgs> dataDisks) {
            this.dataDisks = Codegen.ofNullable(dataDisks);
            return this;
        }
        public Builder dataDisks(VirtualMachineScaleSetDataDiskArgs... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder imageReference(@Nullable Output<ImageReferenceArgs> imageReference) {
            this.imageReference = imageReference;
            return this;
        }
        public Builder imageReference(@Nullable ImageReferenceArgs imageReference) {
            this.imageReference = Codegen.ofNullable(imageReference);
            return this;
        }
        public Builder osDisk(@Nullable Output<VirtualMachineScaleSetOSDiskArgs> osDisk) {
            this.osDisk = osDisk;
            return this;
        }
        public Builder osDisk(@Nullable VirtualMachineScaleSetOSDiskArgs osDisk) {
            this.osDisk = Codegen.ofNullable(osDisk);
            return this;
        }        public VirtualMachineScaleSetStorageProfileArgs build() {
            return new VirtualMachineScaleSetStorageProfileArgs(dataDisks, imageReference, osDisk);
        }
    }
}
