// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse;
import java.util.List;
import java.util.Objects;


/**
 * Represents an audio message that is composed of both segments synthesized from the Dialogflow agent prompts and ones hosted externally at the specified URIs. The external URIs are specified via play_audio. This message is generated by Dialogflow only and not supposed to be defined by the user.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse();

    /**
     * Segments this audio response is composed of.
     * 
     */
    @Import(name="segments", required=true)
      private final List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments;

    public List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> getSegments() {
        return this.segments;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse(List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments) {
        this.segments = Objects.requireNonNull(segments, "expected parameter 'segments' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse() {
        this.segments = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        public Builder segments(List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }
        public Builder segments(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse... segments) {
            return segments(List.of(segments));
        }        public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse(segments);
        }
    }
}
