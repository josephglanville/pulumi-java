// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse Empty = new ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse();

    /**
     * Playback duration
     * 
     */
    @InputImport(name="playbackDurationSeconds", required=true)
      private final Double playbackDurationSeconds;

    public Double getPlaybackDurationSeconds() {
        return this.playbackDurationSeconds;
    }

    /**
     * Storage duration
     * 
     */
    @InputImport(name="storageDurationSeconds", required=true)
      private final Double storageDurationSeconds;

    public Double getStorageDurationSeconds() {
        return this.storageDurationSeconds;
    }

    public ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse(
        Double playbackDurationSeconds,
        Double storageDurationSeconds) {
        this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds, "expected parameter 'playbackDurationSeconds' to be non-null");
        this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds, "expected parameter 'storageDurationSeconds' to be non-null");
    }

    private ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse() {
        this.playbackDurationSeconds = null;
        this.storageDurationSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double playbackDurationSeconds;
        private Double storageDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.playbackDurationSeconds = defaults.playbackDurationSeconds;
    	      this.storageDurationSeconds = defaults.storageDurationSeconds;
        }

        public Builder setPlaybackDurationSeconds(Double playbackDurationSeconds) {
            this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds);
            return this;
        }

        public Builder setStorageDurationSeconds(Double storageDurationSeconds) {
            this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds);
            return this;
        }
        public ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse build() {
            return new ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse(playbackDurationSeconds, storageDurationSeconds);
        }
    }
}
