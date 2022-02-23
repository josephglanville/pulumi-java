// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AacAudioArgs;
import io.pulumi.azurenative.media.inputs.AudioArgs;
import io.pulumi.azurenative.media.inputs.CopyAudioArgs;
import io.pulumi.azurenative.media.inputs.CopyVideoArgs;
import io.pulumi.azurenative.media.inputs.FiltersArgs;
import io.pulumi.azurenative.media.inputs.H264VideoArgs;
import io.pulumi.azurenative.media.inputs.H265VideoArgs;
import io.pulumi.azurenative.media.inputs.ImageArgs;
import io.pulumi.azurenative.media.inputs.ImageFormatArgs;
import io.pulumi.azurenative.media.inputs.JpgFormatArgs;
import io.pulumi.azurenative.media.inputs.JpgImageArgs;
import io.pulumi.azurenative.media.inputs.Mp4FormatArgs;
import io.pulumi.azurenative.media.inputs.MultiBitrateFormatArgs;
import io.pulumi.azurenative.media.inputs.PngFormatArgs;
import io.pulumi.azurenative.media.inputs.PngImageArgs;
import io.pulumi.azurenative.media.inputs.TransportStreamFormatArgs;
import io.pulumi.azurenative.media.inputs.VideoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes all the settings to be used when encoding the input video with the Standard Encoder.
 * 
 */
public final class StandardEncoderPresetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardEncoderPresetArgs Empty = new StandardEncoderPresetArgs();

    /**
     * The list of codecs to be used when encoding the input video.
     * 
     */
    @InputImport(name="codecs", required=true)
      private final Input<List<Object>> codecs;

    public Input<List<Object>> getCodecs() {
        return this.codecs;
    }

    /**
     * One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable Input<FiltersArgs> filters;

    public Input<FiltersArgs> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    /**
     * The list of outputs to be produced by the encoder.
     * 
     */
    @InputImport(name="formats", required=true)
      private final Input<List<Object>> formats;

    public Input<List<Object>> getFormats() {
        return this.formats;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.StandardEncoderPreset'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public StandardEncoderPresetArgs(
        Input<List<Object>> codecs,
        @Nullable Input<FiltersArgs> filters,
        Input<List<Object>> formats,
        Input<String> odataType) {
        this.codecs = Objects.requireNonNull(codecs, "expected parameter 'codecs' to be non-null");
        this.filters = filters;
        this.formats = Objects.requireNonNull(formats, "expected parameter 'formats' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private StandardEncoderPresetArgs() {
        this.codecs = Input.empty();
        this.filters = Input.empty();
        this.formats = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardEncoderPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Object>> codecs;
        private @Nullable Input<FiltersArgs> filters;
        private Input<List<Object>> formats;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardEncoderPresetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codecs = defaults.codecs;
    	      this.filters = defaults.filters;
    	      this.formats = defaults.formats;
    	      this.odataType = defaults.odataType;
        }

        public Builder setCodecs(Input<List<Object>> codecs) {
            this.codecs = Objects.requireNonNull(codecs);
            return this;
        }

        public Builder setCodecs(List<Object> codecs) {
            this.codecs = Input.of(Objects.requireNonNull(codecs));
            return this;
        }

        public Builder setFilters(@Nullable Input<FiltersArgs> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFilters(@Nullable FiltersArgs filters) {
            this.filters = Input.ofNullable(filters);
            return this;
        }

        public Builder setFormats(Input<List<Object>> formats) {
            this.formats = Objects.requireNonNull(formats);
            return this;
        }

        public Builder setFormats(List<Object> formats) {
            this.formats = Input.of(Objects.requireNonNull(formats));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public StandardEncoderPresetArgs build() {
            return new StandardEncoderPresetArgs(codecs, filters, formats, odataType);
        }
    }
}
