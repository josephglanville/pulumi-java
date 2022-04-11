// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;


public final class ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs Empty = new ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs();

    /**
     * Playback duration
     * 
     */
    @Import(name="playbackDurationSeconds", required=true)
      private final Output<Double> playbackDurationSeconds;

    public Output<Double> getPlaybackDurationSeconds() {
        return this.playbackDurationSeconds;
    }

    /**
     * Storage duration
     * 
     */
    @Import(name="storageDurationSeconds", required=true)
      private final Output<Double> storageDurationSeconds;

    public Output<Double> getStorageDurationSeconds() {
        return this.storageDurationSeconds;
    }

    public ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs(
        Output<Double> playbackDurationSeconds,
        Output<Double> storageDurationSeconds) {
        this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds, "expected parameter 'playbackDurationSeconds' to be non-null");
        this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds, "expected parameter 'storageDurationSeconds' to be non-null");
    }

    private ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs() {
        this.playbackDurationSeconds = Codegen.empty();
        this.storageDurationSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Double> playbackDurationSeconds;
        private Output<Double> storageDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.playbackDurationSeconds = defaults.playbackDurationSeconds;
    	      this.storageDurationSeconds = defaults.storageDurationSeconds;
        }

        public Builder playbackDurationSeconds(Output<Double> playbackDurationSeconds) {
            this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds);
            return this;
        }
        public Builder playbackDurationSeconds(Double playbackDurationSeconds) {
            this.playbackDurationSeconds = Output.of(Objects.requireNonNull(playbackDurationSeconds));
            return this;
        }
        public Builder storageDurationSeconds(Output<Double> storageDurationSeconds) {
            this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds);
            return this;
        }
        public Builder storageDurationSeconds(Double storageDurationSeconds) {
            this.storageDurationSeconds = Output.of(Objects.requireNonNull(storageDurationSeconds));
            return this;
        }        public ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs build() {
            return new ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs(playbackDurationSeconds, storageDurationSeconds);
        }
    }
}
