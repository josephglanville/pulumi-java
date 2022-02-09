// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.StreamingPolicyPlayReadyConfigurationArgs;
import io.pulumi.azurenative.media.inputs.StreamingPolicyWidevineConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CencDrmConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CencDrmConfigurationArgs Empty = new CencDrmConfigurationArgs();

    @InputImport(name="playReady")
    private final @Nullable Input<StreamingPolicyPlayReadyConfigurationArgs> playReady;

    public Input<StreamingPolicyPlayReadyConfigurationArgs> getPlayReady() {
        return this.playReady == null ? Input.empty() : this.playReady;
    }

    @InputImport(name="widevine")
    private final @Nullable Input<StreamingPolicyWidevineConfigurationArgs> widevine;

    public Input<StreamingPolicyWidevineConfigurationArgs> getWidevine() {
        return this.widevine == null ? Input.empty() : this.widevine;
    }

    public CencDrmConfigurationArgs(
        @Nullable Input<StreamingPolicyPlayReadyConfigurationArgs> playReady,
        @Nullable Input<StreamingPolicyWidevineConfigurationArgs> widevine) {
        this.playReady = playReady;
        this.widevine = widevine;
    }

    private CencDrmConfigurationArgs() {
        this.playReady = Input.empty();
        this.widevine = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CencDrmConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StreamingPolicyPlayReadyConfigurationArgs> playReady;
        private @Nullable Input<StreamingPolicyWidevineConfigurationArgs> widevine;

        public Builder() {
    	      // Empty
        }

        public Builder(CencDrmConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.playReady = defaults.playReady;
    	      this.widevine = defaults.widevine;
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

        public CencDrmConfigurationArgs build() {
            return new CencDrmConfigurationArgs(playReady, widevine);
        }
    }
}
