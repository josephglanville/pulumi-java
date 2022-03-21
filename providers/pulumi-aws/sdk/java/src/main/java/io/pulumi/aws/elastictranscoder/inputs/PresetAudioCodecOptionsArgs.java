// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PresetAudioCodecOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PresetAudioCodecOptionsArgs Empty = new PresetAudioCodecOptionsArgs();

    /**
     * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
     * 
     */
    @Import(name="bitDepth")
      private final @Nullable Output<String> bitDepth;

    public Output<String> getBitDepth() {
        return this.bitDepth == null ? Output.empty() : this.bitDepth;
    }

    /**
     * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
     * 
     */
    @Import(name="bitOrder")
      private final @Nullable Output<String> bitOrder;

    public Output<String> getBitOrder() {
        return this.bitOrder == null ? Output.empty() : this.bitOrder;
    }

    /**
     * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
     * 
     */
    @Import(name="profile")
      private final @Nullable Output<String> profile;

    public Output<String> getProfile() {
        return this.profile == null ? Output.empty() : this.profile;
    }

    /**
     * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
     * 
     */
    @Import(name="signed")
      private final @Nullable Output<String> signed;

    public Output<String> getSigned() {
        return this.signed == null ? Output.empty() : this.signed;
    }

    public PresetAudioCodecOptionsArgs(
        @Nullable Output<String> bitDepth,
        @Nullable Output<String> bitOrder,
        @Nullable Output<String> profile,
        @Nullable Output<String> signed) {
        this.bitDepth = bitDepth;
        this.bitOrder = bitOrder;
        this.profile = profile;
        this.signed = signed;
    }

    private PresetAudioCodecOptionsArgs() {
        this.bitDepth = Output.empty();
        this.bitOrder = Output.empty();
        this.profile = Output.empty();
        this.signed = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetAudioCodecOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bitDepth;
        private @Nullable Output<String> bitOrder;
        private @Nullable Output<String> profile;
        private @Nullable Output<String> signed;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetAudioCodecOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitDepth = defaults.bitDepth;
    	      this.bitOrder = defaults.bitOrder;
    	      this.profile = defaults.profile;
    	      this.signed = defaults.signed;
        }

        public Builder bitDepth(@Nullable Output<String> bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }
        public Builder bitDepth(@Nullable String bitDepth) {
            this.bitDepth = Output.ofNullable(bitDepth);
            return this;
        }
        public Builder bitOrder(@Nullable Output<String> bitOrder) {
            this.bitOrder = bitOrder;
            return this;
        }
        public Builder bitOrder(@Nullable String bitOrder) {
            this.bitOrder = Output.ofNullable(bitOrder);
            return this;
        }
        public Builder profile(@Nullable Output<String> profile) {
            this.profile = profile;
            return this;
        }
        public Builder profile(@Nullable String profile) {
            this.profile = Output.ofNullable(profile);
            return this;
        }
        public Builder signed(@Nullable Output<String> signed) {
            this.signed = signed;
            return this;
        }
        public Builder signed(@Nullable String signed) {
            this.signed = Output.ofNullable(signed);
            return this;
        }        public PresetAudioCodecOptionsArgs build() {
            return new PresetAudioCodecOptionsArgs(bitDepth, bitOrder, profile, signed);
        }
    }
}
