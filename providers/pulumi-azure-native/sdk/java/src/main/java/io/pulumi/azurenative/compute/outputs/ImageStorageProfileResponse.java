// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ImageDataDiskResponse;
import io.pulumi.azurenative.compute.outputs.ImageOSDiskResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageStorageProfileResponse {
    private final @Nullable List<ImageDataDiskResponse> dataDisks;
    private final @Nullable ImageOSDiskResponse osDisk;
    private final @Nullable Boolean zoneResilient;

    @OutputCustomType.Constructor({"dataDisks","osDisk","zoneResilient"})
    private ImageStorageProfileResponse(
        @Nullable List<ImageDataDiskResponse> dataDisks,
        @Nullable ImageOSDiskResponse osDisk,
        @Nullable Boolean zoneResilient) {
        this.dataDisks = dataDisks;
        this.osDisk = osDisk;
        this.zoneResilient = zoneResilient;
    }

    public List<ImageDataDiskResponse> getDataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }
    public Optional<ImageOSDiskResponse> getOsDisk() {
        return Optional.ofNullable(this.osDisk);
    }
    public Optional<Boolean> getZoneResilient() {
        return Optional.ofNullable(this.zoneResilient);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ImageDataDiskResponse> dataDisks;
        private @Nullable ImageOSDiskResponse osDisk;
        private @Nullable Boolean zoneResilient;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageStorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.osDisk = defaults.osDisk;
    	      this.zoneResilient = defaults.zoneResilient;
        }

        public Builder setDataDisks(@Nullable List<ImageDataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setOsDisk(@Nullable ImageOSDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }

        public Builder setZoneResilient(@Nullable Boolean zoneResilient) {
            this.zoneResilient = zoneResilient;
            return this;
        }

        public ImageStorageProfileResponse build() {
            return new ImageStorageProfileResponse(dataDisks, osDisk, zoneResilient);
        }
    }
}
