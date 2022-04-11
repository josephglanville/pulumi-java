// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.StreamingPolicyPlayReadyConfigurationArgs;
import io.pulumi.azurenative.media.inputs.StreamingPolicyWidevineConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to specify DRM configurations of CommonEncryptionCenc scheme in Streaming Policy
 * 
 */
public final class CencDrmConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CencDrmConfigurationArgs Empty = new CencDrmConfigurationArgs();

    /**
     * PlayReady configurations
     * 
     */
    @Import(name="playReady")
      private final @Nullable Output<StreamingPolicyPlayReadyConfigurationArgs> playReady;

    public Output<StreamingPolicyPlayReadyConfigurationArgs> getPlayReady() {
        return this.playReady == null ? Codegen.empty() : this.playReady;
    }

    /**
     * Widevine configurations
     * 
     */
    @Import(name="widevine")
      private final @Nullable Output<StreamingPolicyWidevineConfigurationArgs> widevine;

    public Output<StreamingPolicyWidevineConfigurationArgs> getWidevine() {
        return this.widevine == null ? Codegen.empty() : this.widevine;
    }

    public CencDrmConfigurationArgs(
        @Nullable Output<StreamingPolicyPlayReadyConfigurationArgs> playReady,
        @Nullable Output<StreamingPolicyWidevineConfigurationArgs> widevine) {
        this.playReady = playReady;
        this.widevine = widevine;
    }

    private CencDrmConfigurationArgs() {
        this.playReady = Codegen.empty();
        this.widevine = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CencDrmConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StreamingPolicyPlayReadyConfigurationArgs> playReady;
        private @Nullable Output<StreamingPolicyWidevineConfigurationArgs> widevine;

        public Builder() {
    	      // Empty
        }

        public Builder(CencDrmConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.playReady = defaults.playReady;
    	      this.widevine = defaults.widevine;
        }

        public Builder playReady(@Nullable Output<StreamingPolicyPlayReadyConfigurationArgs> playReady) {
            this.playReady = playReady;
            return this;
        }
        public Builder playReady(@Nullable StreamingPolicyPlayReadyConfigurationArgs playReady) {
            this.playReady = Codegen.ofNullable(playReady);
            return this;
        }
        public Builder widevine(@Nullable Output<StreamingPolicyWidevineConfigurationArgs> widevine) {
            this.widevine = widevine;
            return this;
        }
        public Builder widevine(@Nullable StreamingPolicyWidevineConfigurationArgs widevine) {
            this.widevine = Codegen.ofNullable(widevine);
            return this;
        }        public CencDrmConfigurationArgs build() {
            return new CencDrmConfigurationArgs(playReady, widevine);
        }
    }
}
