// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Metadata from Dialogflow relating to the current transcript segment.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse();

    /**
     * Whether the transcript segment was covered under the configured smart reply allowlist in Agent Assist.
     * 
     */
    @Import(name="smartReplyAllowlistCovered", required=true)
      private final Boolean smartReplyAllowlistCovered;

    public Boolean getSmartReplyAllowlistCovered() {
        return this.smartReplyAllowlistCovered;
    }

    public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse(Boolean smartReplyAllowlistCovered) {
        this.smartReplyAllowlistCovered = Objects.requireNonNull(smartReplyAllowlistCovered, "expected parameter 'smartReplyAllowlistCovered' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse() {
        this.smartReplyAllowlistCovered = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean smartReplyAllowlistCovered;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.smartReplyAllowlistCovered = defaults.smartReplyAllowlistCovered;
        }

        public Builder smartReplyAllowlistCovered(Boolean smartReplyAllowlistCovered) {
            this.smartReplyAllowlistCovered = Objects.requireNonNull(smartReplyAllowlistCovered);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentDialogflowSegmentMetadataResponse(smartReplyAllowlistCovered);
        }
    }
}
