// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the settings to produce a JPEG image from the input video.
 * 
 */
public final class JpgLayerArgs extends io.pulumi.resources.ResourceArgs {

    public static final JpgLayerArgs Empty = new JpgLayerArgs();

    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    @Import(name="height")
      private final @Nullable Output<String> height;

    public Output<String> getHeight() {
        return this.height == null ? Output.empty() : this.height;
    }

    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Output.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JpgLayer'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     * 
     */
    @Import(name="quality")
      private final @Nullable Output<Integer> quality;

    public Output<Integer> getQuality() {
        return this.quality == null ? Output.empty() : this.quality;
    }

    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    @Import(name="width")
      private final @Nullable Output<String> width;

    public Output<String> getWidth() {
        return this.width == null ? Output.empty() : this.width;
    }

    public JpgLayerArgs(
        @Nullable Output<String> height,
        @Nullable Output<String> label,
        Output<String> odataType,
        @Nullable Output<Integer> quality,
        @Nullable Output<String> width) {
        this.height = height;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.quality = quality;
        this.width = width;
    }

    private JpgLayerArgs() {
        this.height = Output.empty();
        this.label = Output.empty();
        this.odataType = Output.empty();
        this.quality = Output.empty();
        this.width = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JpgLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> height;
        private @Nullable Output<String> label;
        private Output<String> odataType;
        private @Nullable Output<Integer> quality;
        private @Nullable Output<String> width;

        public Builder() {
    	      // Empty
        }

        public Builder(JpgLayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.quality = defaults.quality;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable Output<String> height) {
            this.height = height;
            return this;
        }
        public Builder height(@Nullable String height) {
            this.height = Output.ofNullable(height);
            return this;
        }
        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Output.ofNullable(label);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder quality(@Nullable Output<Integer> quality) {
            this.quality = quality;
            return this;
        }
        public Builder quality(@Nullable Integer quality) {
            this.quality = Output.ofNullable(quality);
            return this;
        }
        public Builder width(@Nullable Output<String> width) {
            this.width = width;
            return this;
        }
        public Builder width(@Nullable String width) {
            this.width = Output.ofNullable(width);
            return this;
        }        public JpgLayerArgs build() {
            return new JpgLayerArgs(height, label, odataType, quality, width);
        }
    }
}
