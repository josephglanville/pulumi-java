// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AudioOverlayResponse;
import io.pulumi.azurenative.media.outputs.DeinterlaceResponse;
import io.pulumi.azurenative.media.outputs.RectangleResponse;
import io.pulumi.azurenative.media.outputs.VideoOverlayResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FiltersResponse {
    private final @Nullable RectangleResponse crop;
    private final @Nullable DeinterlaceResponse deinterlace;
    private final @Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays;
    private final @Nullable String rotation;

    @OutputCustomType.Constructor({"crop","deinterlace","overlays","rotation"})
    private FiltersResponse(
        @Nullable RectangleResponse crop,
        @Nullable DeinterlaceResponse deinterlace,
        @Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays,
        @Nullable String rotation) {
        this.crop = crop;
        this.deinterlace = deinterlace;
        this.overlays = overlays;
        this.rotation = rotation;
    }

    public Optional<RectangleResponse> getCrop() {
        return Optional.ofNullable(this.crop);
    }
    public Optional<DeinterlaceResponse> getDeinterlace() {
        return Optional.ofNullable(this.deinterlace);
    }
    public List<Either<AudioOverlayResponse,VideoOverlayResponse>> getOverlays() {
        return this.overlays == null ? List.of() : this.overlays;
    }
    public Optional<String> getRotation() {
        return Optional.ofNullable(this.rotation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FiltersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RectangleResponse crop;
        private @Nullable DeinterlaceResponse deinterlace;
        private @Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays;
        private @Nullable String rotation;

        public Builder() {
    	      // Empty
        }

        public Builder(FiltersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crop = defaults.crop;
    	      this.deinterlace = defaults.deinterlace;
    	      this.overlays = defaults.overlays;
    	      this.rotation = defaults.rotation;
        }

        public Builder setCrop(@Nullable RectangleResponse crop) {
            this.crop = crop;
            return this;
        }

        public Builder setDeinterlace(@Nullable DeinterlaceResponse deinterlace) {
            this.deinterlace = deinterlace;
            return this;
        }

        public Builder setOverlays(@Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays) {
            this.overlays = overlays;
            return this;
        }

        public Builder setRotation(@Nullable String rotation) {
            this.rotation = rotation;
            return this;
        }

        public FiltersResponse build() {
            return new FiltersResponse(crop, deinterlace, overlays, rotation);
        }
    }
}
