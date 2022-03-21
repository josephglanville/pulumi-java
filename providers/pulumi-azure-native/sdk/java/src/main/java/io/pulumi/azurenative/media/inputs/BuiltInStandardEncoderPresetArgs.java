// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.EncoderNamedPreset;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a built-in preset for encoding the input video with the Standard Encoder.
 * 
 */
public final class BuiltInStandardEncoderPresetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuiltInStandardEncoderPresetArgs Empty = new BuiltInStandardEncoderPresetArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.BuiltInStandardEncoderPreset'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The built-in preset to be used for encoding videos.
     * 
     */
    @Import(name="presetName", required=true)
      private final Output<Either<String,EncoderNamedPreset>> presetName;

    public Output<Either<String,EncoderNamedPreset>> getPresetName() {
        return this.presetName;
    }

    public BuiltInStandardEncoderPresetArgs(
        Output<String> odataType,
        Output<Either<String,EncoderNamedPreset>> presetName) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.presetName = Objects.requireNonNull(presetName, "expected parameter 'presetName' to be non-null");
    }

    private BuiltInStandardEncoderPresetArgs() {
        this.odataType = Output.empty();
        this.presetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuiltInStandardEncoderPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private Output<Either<String,EncoderNamedPreset>> presetName;

        public Builder() {
    	      // Empty
        }

        public Builder(BuiltInStandardEncoderPresetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.presetName = defaults.presetName;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder presetName(Output<Either<String,EncoderNamedPreset>> presetName) {
            this.presetName = Objects.requireNonNull(presetName);
            return this;
        }
        public Builder presetName(Either<String,EncoderNamedPreset> presetName) {
            this.presetName = Output.of(Objects.requireNonNull(presetName));
            return this;
        }        public BuiltInStandardEncoderPresetArgs build() {
            return new BuiltInStandardEncoderPresetArgs(odataType, presetName);
        }
    }
}
