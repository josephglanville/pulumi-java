// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Cloud Storage source of conversation data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1GcsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudContactcenterinsightsV1GcsSourceArgs Empty = new GoogleCloudContactcenterinsightsV1GcsSourceArgs();

    /**
     * Cloud Storage URI that points to a file that contains the conversation audio.
     * 
     */
    @Import(name="audioUri")
      private final @Nullable Output<String> audioUri;

    public Output<String> getAudioUri() {
        return this.audioUri == null ? Codegen.empty() : this.audioUri;
    }

    /**
     * Immutable. Cloud Storage URI that points to a file that contains the conversation transcript.
     * 
     */
    @Import(name="transcriptUri")
      private final @Nullable Output<String> transcriptUri;

    public Output<String> getTranscriptUri() {
        return this.transcriptUri == null ? Codegen.empty() : this.transcriptUri;
    }

    public GoogleCloudContactcenterinsightsV1GcsSourceArgs(
        @Nullable Output<String> audioUri,
        @Nullable Output<String> transcriptUri) {
        this.audioUri = audioUri;
        this.transcriptUri = transcriptUri;
    }

    private GoogleCloudContactcenterinsightsV1GcsSourceArgs() {
        this.audioUri = Codegen.empty();
        this.transcriptUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1GcsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> audioUri;
        private @Nullable Output<String> transcriptUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1GcsSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioUri = defaults.audioUri;
    	      this.transcriptUri = defaults.transcriptUri;
        }

        public Builder audioUri(@Nullable Output<String> audioUri) {
            this.audioUri = audioUri;
            return this;
        }
        public Builder audioUri(@Nullable String audioUri) {
            this.audioUri = Codegen.ofNullable(audioUri);
            return this;
        }
        public Builder transcriptUri(@Nullable Output<String> transcriptUri) {
            this.transcriptUri = transcriptUri;
            return this;
        }
        public Builder transcriptUri(@Nullable String transcriptUri) {
            this.transcriptUri = Codegen.ofNullable(transcriptUri);
            return this;
        }        public GoogleCloudContactcenterinsightsV1GcsSourceArgs build() {
            return new GoogleCloudContactcenterinsightsV1GcsSourceArgs(audioUri, transcriptUri);
        }
    }
}
