// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.DataDiskArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.ImageReferenceArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.OsDiskArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the storage settings for the virtual machine disks.
 * 
 */
public final class StorageProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Specifies the parameters that are used to add a data disk to a virtual machine.
     * 
     */
    @Import(name="dataDisks")
      private final @Nullable Output<List<DataDiskArgs>> dataDisks;

    public Output<List<DataDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Output.empty() : this.dataDisks;
    }

    /**
     * The image reference properties.
     * 
     */
    @Import(name="imageReference")
      private final @Nullable Output<ImageReferenceArgs> imageReference;

    public Output<ImageReferenceArgs> getImageReference() {
        return this.imageReference == null ? Output.empty() : this.imageReference;
    }

    /**
     * Specifies information about the operating system disk used by the virtual machine.
     * 
     */
    @Import(name="osDisk")
      private final @Nullable Output<OsDiskArgs> osDisk;

    public Output<OsDiskArgs> getOsDisk() {
        return this.osDisk == null ? Output.empty() : this.osDisk;
    }

    public StorageProfileArgs(
        @Nullable Output<List<DataDiskArgs>> dataDisks,
        @Nullable Output<ImageReferenceArgs> imageReference,
        @Nullable Output<OsDiskArgs> osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    private StorageProfileArgs() {
        this.dataDisks = Output.empty();
        this.imageReference = Output.empty();
        this.osDisk = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DataDiskArgs>> dataDisks;
        private @Nullable Output<ImageReferenceArgs> imageReference;
        private @Nullable Output<OsDiskArgs> osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder dataDisks(@Nullable Output<List<DataDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(@Nullable List<DataDiskArgs> dataDisks) {
            this.dataDisks = Output.ofNullable(dataDisks);
            return this;
        }
        public Builder dataDisks(DataDiskArgs... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder imageReference(@Nullable Output<ImageReferenceArgs> imageReference) {
            this.imageReference = imageReference;
            return this;
        }
        public Builder imageReference(@Nullable ImageReferenceArgs imageReference) {
            this.imageReference = Output.ofNullable(imageReference);
            return this;
        }
        public Builder osDisk(@Nullable Output<OsDiskArgs> osDisk) {
            this.osDisk = osDisk;
            return this;
        }
        public Builder osDisk(@Nullable OsDiskArgs osDisk) {
            this.osDisk = Output.ofNullable(osDisk);
            return this;
        }        public StorageProfileArgs build() {
            return new StorageProfileArgs(dataDisks, imageReference, osDisk);
        }
    }
}
