// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.StreamingPolicyFairPlayConfigurationArgs;
import io.pulumi.azurenative.media.inputs.StreamingPolicyPlayReadyConfigurationArgs;
import io.pulumi.azurenative.media.inputs.StreamingPolicyWidevineConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to specify DRM configurations of CommonEncryptionCbcs scheme in Streaming Policy
 * 
 */
public final class CbcsDrmConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CbcsDrmConfigurationArgs Empty = new CbcsDrmConfigurationArgs();

    /**
     * FairPlay configurations
     * 
     */
    @InputImport(name="fairPlay")
      private final @Nullable Input<StreamingPolicyFairPlayConfigurationArgs> fairPlay;

    public Input<StreamingPolicyFairPlayConfigurationArgs> getFairPlay() {
        return this.fairPlay == null ? Input.empty() : this.fairPlay;
    }

    /**
     * PlayReady configurations
     * 
     */
    @InputImport(name="playReady")
      private final @Nullable Input<StreamingPolicyPlayReadyConfigurationArgs> playReady;

    public Input<StreamingPolicyPlayReadyConfigurationArgs> getPlayReady() {
        return this.playReady == null ? Input.empty() : this.playReady;
    }

    /**
     * Widevine configurations
     * 
     */
    @InputImport(name="widevine")
      private final @Nullable Input<StreamingPolicyWidevineConfigurationArgs> widevine;

    public Input<StreamingPolicyWidevineConfigurationArgs> getWidevine() {
        return this.widevine == null ? Input.empty() : this.widevine;
    }

    public CbcsDrmConfigurationArgs(
        @Nullable Input<StreamingPolicyFairPlayConfigurationArgs> fairPlay,
        @Nullable Input<StreamingPolicyPlayReadyConfigurationArgs> playReady,
        @Nullable Input<StreamingPolicyWidevineConfigurationArgs> widevine) {
        this.fairPlay = fairPlay;
        this.playReady = playReady;
        this.widevine = widevine;
    }

    private CbcsDrmConfigurationArgs() {
        this.fairPlay = Input.empty();
        this.playReady = Input.empty();
        this.widevine = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CbcsDrmConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StreamingPolicyFairPlayConfigurationArgs> fairPlay;
        private @Nullable Input<StreamingPolicyPlayReadyConfigurationArgs> playReady;
        private @Nullable Input<StreamingPolicyWidevineConfigurationArgs> widevine;

        public Builder() {
    	      // Empty
        }

        public Builder(CbcsDrmConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fairPlay = defaults.fairPlay;
    	      this.playReady = defaults.playReady;
    	      this.widevine = defaults.widevine;
        }

        public Builder setFairPlay(@Nullable Input<StreamingPolicyFairPlayConfigurationArgs> fairPlay) {
            this.fairPlay = fairPlay;
            return this;
        }

        public Builder setFairPlay(@Nullable StreamingPolicyFairPlayConfigurationArgs fairPlay) {
            this.fairPlay = Input.ofNullable(fairPlay);
            return this;
        }

        public Builder setPlayReady(@Nullable Input<StreamingPolicyPlayReadyConfigurationArgs> playReady) {
            this.playReady = playReady;
            return this;
        }

        public Builder setPlayReady(@Nullable StreamingPolicyPlayReadyConfigurationArgs playReady) {
            this.playReady = Input.ofNullable(playReady);
            return this;
        }

        public Builder setWidevine(@Nullable Input<StreamingPolicyWidevineConfigurationArgs> widevine) {
            this.widevine = widevine;
            return this;
        }

        public Builder setWidevine(@Nullable StreamingPolicyWidevineConfigurationArgs widevine) {
            this.widevine = Input.ofNullable(widevine);
            return this;
        }
        public CbcsDrmConfigurationArgs build() {
            return new CbcsDrmConfigurationArgs(fairPlay, playReady, widevine);
        }
    }
}
