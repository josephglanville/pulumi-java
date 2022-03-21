// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse {
    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    private final Boolean allowPlaybackInterruption;
    /**
     * URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    private final String audioUri;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse(
        @CustomType.Parameter("allowPlaybackInterruption") Boolean allowPlaybackInterruption,
        @CustomType.Parameter("audioUri") String audioUri) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.audioUri = audioUri;
    }

    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
    */
    public Boolean getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }
    /**
     * URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
    */
    public String getAudioUri() {
        return this.audioUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private String audioUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.audioUri = defaults.audioUri;
        }

        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }
        public Builder audioUri(String audioUri) {
            this.audioUri = Objects.requireNonNull(audioUri);
            return this;
        }        public GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse(allowPlaybackInterruption, audioUri);
        }
    }
}
