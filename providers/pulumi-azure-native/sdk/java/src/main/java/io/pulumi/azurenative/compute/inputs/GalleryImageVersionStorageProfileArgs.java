// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceArgs;
import io.pulumi.azurenative.compute.inputs.GalleryDataDiskImageArgs;
import io.pulumi.azurenative.compute.inputs.GalleryOSDiskImageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GalleryImageVersionStorageProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryImageVersionStorageProfileArgs Empty = new GalleryImageVersionStorageProfileArgs();

    @InputImport(name="dataDiskImages")
    private final @Nullable Input<List<GalleryDataDiskImageArgs>> dataDiskImages;

    public Input<List<GalleryDataDiskImageArgs>> getDataDiskImages() {
        return this.dataDiskImages == null ? Input.empty() : this.dataDiskImages;
    }

    @InputImport(name="osDiskImage")
    private final @Nullable Input<GalleryOSDiskImageArgs> osDiskImage;

    public Input<GalleryOSDiskImageArgs> getOsDiskImage() {
        return this.osDiskImage == null ? Input.empty() : this.osDiskImage;
    }

    @InputImport(name="source")
    private final @Nullable Input<GalleryArtifactVersionSourceArgs> source;

    public Input<GalleryArtifactVersionSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public GalleryImageVersionStorageProfileArgs(
        @Nullable Input<List<GalleryDataDiskImageArgs>> dataDiskImages,
        @Nullable Input<GalleryOSDiskImageArgs> osDiskImage,
        @Nullable Input<GalleryArtifactVersionSourceArgs> source) {
        this.dataDiskImages = dataDiskImages;
        this.osDiskImage = osDiskImage;
        this.source = source;
    }

    private GalleryImageVersionStorageProfileArgs() {
        this.dataDiskImages = Input.empty();
        this.osDiskImage = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageVersionStorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GalleryDataDiskImageArgs>> dataDiskImages;
        private @Nullable Input<GalleryOSDiskImageArgs> osDiskImage;
        private @Nullable Input<GalleryArtifactVersionSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageVersionStorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskImages = defaults.dataDiskImages;
    	      this.osDiskImage = defaults.osDiskImage;
    	      this.source = defaults.source;
        }

        public Builder setDataDiskImages(@Nullable Input<List<GalleryDataDiskImageArgs>> dataDiskImages) {
            this.dataDiskImages = dataDiskImages;
            return this;
        }

        public Builder setDataDiskImages(@Nullable List<GalleryDataDiskImageArgs> dataDiskImages) {
            this.dataDiskImages = Input.ofNullable(dataDiskImages);
            return this;
        }

        public Builder setOsDiskImage(@Nullable Input<GalleryOSDiskImageArgs> osDiskImage) {
            this.osDiskImage = osDiskImage;
            return this;
        }

        public Builder setOsDiskImage(@Nullable GalleryOSDiskImageArgs osDiskImage) {
            this.osDiskImage = Input.ofNullable(osDiskImage);
            return this;
        }

        public Builder setSource(@Nullable Input<GalleryArtifactVersionSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable GalleryArtifactVersionSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public GalleryImageVersionStorageProfileArgs build() {
            return new GalleryImageVersionStorageProfileArgs(dataDiskImages, osDiskImage, source);
        }
    }
}
