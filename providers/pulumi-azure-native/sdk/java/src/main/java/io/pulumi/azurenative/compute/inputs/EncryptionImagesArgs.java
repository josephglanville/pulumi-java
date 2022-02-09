// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DataDiskImageEncryptionArgs;
import io.pulumi.azurenative.compute.inputs.OSDiskImageEncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionImagesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionImagesArgs Empty = new EncryptionImagesArgs();

    @InputImport(name="dataDiskImages")
    private final @Nullable Input<List<DataDiskImageEncryptionArgs>> dataDiskImages;

    public Input<List<DataDiskImageEncryptionArgs>> getDataDiskImages() {
        return this.dataDiskImages == null ? Input.empty() : this.dataDiskImages;
    }

    @InputImport(name="osDiskImage")
    private final @Nullable Input<OSDiskImageEncryptionArgs> osDiskImage;

    public Input<OSDiskImageEncryptionArgs> getOsDiskImage() {
        return this.osDiskImage == null ? Input.empty() : this.osDiskImage;
    }

    public EncryptionImagesArgs(
        @Nullable Input<List<DataDiskImageEncryptionArgs>> dataDiskImages,
        @Nullable Input<OSDiskImageEncryptionArgs> osDiskImage) {
        this.dataDiskImages = dataDiskImages;
        this.osDiskImage = osDiskImage;
    }

    private EncryptionImagesArgs() {
        this.dataDiskImages = Input.empty();
        this.osDiskImage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionImagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataDiskImageEncryptionArgs>> dataDiskImages;
        private @Nullable Input<OSDiskImageEncryptionArgs> osDiskImage;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionImagesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskImages = defaults.dataDiskImages;
    	      this.osDiskImage = defaults.osDiskImage;
        }

        public Builder setDataDiskImages(@Nullable Input<List<DataDiskImageEncryptionArgs>> dataDiskImages) {
            this.dataDiskImages = dataDiskImages;
            return this;
        }

        public Builder setDataDiskImages(@Nullable List<DataDiskImageEncryptionArgs> dataDiskImages) {
            this.dataDiskImages = Input.ofNullable(dataDiskImages);
            return this;
        }

        public Builder setOsDiskImage(@Nullable Input<OSDiskImageEncryptionArgs> osDiskImage) {
            this.osDiskImage = osDiskImage;
            return this;
        }

        public Builder setOsDiskImage(@Nullable OSDiskImageEncryptionArgs osDiskImage) {
            this.osDiskImage = Input.ofNullable(osDiskImage);
            return this;
        }

        public EncryptionImagesArgs build() {
            return new EncryptionImagesArgs(dataDiskImages, osDiskImage);
        }
    }
}
