// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.CbcsDrmConfigurationArgs;
import io.pulumi.azurenative.media.inputs.EnabledProtocolsArgs;
import io.pulumi.azurenative.media.inputs.StreamingPolicyContentKeysArgs;
import io.pulumi.azurenative.media.inputs.TrackSelectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CommonEncryptionCbcsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommonEncryptionCbcsArgs Empty = new CommonEncryptionCbcsArgs();

    @InputImport(name="clearTracks")
    private final @Nullable Input<List<TrackSelectionArgs>> clearTracks;

    public Input<List<TrackSelectionArgs>> getClearTracks() {
        return this.clearTracks == null ? Input.empty() : this.clearTracks;
    }

    @InputImport(name="contentKeys")
    private final @Nullable Input<StreamingPolicyContentKeysArgs> contentKeys;

    public Input<StreamingPolicyContentKeysArgs> getContentKeys() {
        return this.contentKeys == null ? Input.empty() : this.contentKeys;
    }

    @InputImport(name="drm")
    private final @Nullable Input<CbcsDrmConfigurationArgs> drm;

    public Input<CbcsDrmConfigurationArgs> getDrm() {
        return this.drm == null ? Input.empty() : this.drm;
    }

    @InputImport(name="enabledProtocols")
    private final @Nullable Input<EnabledProtocolsArgs> enabledProtocols;

    public Input<EnabledProtocolsArgs> getEnabledProtocols() {
        return this.enabledProtocols == null ? Input.empty() : this.enabledProtocols;
    }

    public CommonEncryptionCbcsArgs(
        @Nullable Input<List<TrackSelectionArgs>> clearTracks,
        @Nullable Input<StreamingPolicyContentKeysArgs> contentKeys,
        @Nullable Input<CbcsDrmConfigurationArgs> drm,
        @Nullable Input<EnabledProtocolsArgs> enabledProtocols) {
        this.clearTracks = clearTracks;
        this.contentKeys = contentKeys;
        this.drm = drm;
        this.enabledProtocols = enabledProtocols;
    }

    private CommonEncryptionCbcsArgs() {
        this.clearTracks = Input.empty();
        this.contentKeys = Input.empty();
        this.drm = Input.empty();
        this.enabledProtocols = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonEncryptionCbcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TrackSelectionArgs>> clearTracks;
        private @Nullable Input<StreamingPolicyContentKeysArgs> contentKeys;
        private @Nullable Input<CbcsDrmConfigurationArgs> drm;
        private @Nullable Input<EnabledProtocolsArgs> enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonEncryptionCbcsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clearTracks = defaults.clearTracks;
    	      this.contentKeys = defaults.contentKeys;
    	      this.drm = defaults.drm;
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        public Builder setClearTracks(@Nullable Input<List<TrackSelectionArgs>> clearTracks) {
            this.clearTracks = clearTracks;
            return this;
        }

        public Builder setClearTracks(@Nullable List<TrackSelectionArgs> clearTracks) {
            this.clearTracks = Input.ofNullable(clearTracks);
            return this;
        }

        public Builder setContentKeys(@Nullable Input<StreamingPolicyContentKeysArgs> contentKeys) {
            this.contentKeys = contentKeys;
            return this;
        }

        public Builder setContentKeys(@Nullable StreamingPolicyContentKeysArgs contentKeys) {
            this.contentKeys = Input.ofNullable(contentKeys);
            return this;
        }

        public Builder setDrm(@Nullable Input<CbcsDrmConfigurationArgs> drm) {
            this.drm = drm;
            return this;
        }

        public Builder setDrm(@Nullable CbcsDrmConfigurationArgs drm) {
            this.drm = Input.ofNullable(drm);
            return this;
        }

        public Builder setEnabledProtocols(@Nullable Input<EnabledProtocolsArgs> enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }

        public Builder setEnabledProtocols(@Nullable EnabledProtocolsArgs enabledProtocols) {
            this.enabledProtocols = Input.ofNullable(enabledProtocols);
            return this;
        }

        public CommonEncryptionCbcsArgs build() {
            return new CommonEncryptionCbcsArgs(clearTracks, contentKeys, drm, enabledProtocols);
        }
    }
}
