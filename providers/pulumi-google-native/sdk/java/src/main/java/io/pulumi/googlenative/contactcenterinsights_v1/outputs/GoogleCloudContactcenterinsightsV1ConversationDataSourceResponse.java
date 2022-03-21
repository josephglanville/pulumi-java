// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1DialogflowSourceResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1GcsSourceResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse {
    /**
     * The source when the conversation comes from Dialogflow.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource;
    /**
     * A Cloud Storage location specification for the audio and transcript.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse(
        @CustomType.Parameter("dialogflowSource") GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource,
        @CustomType.Parameter("gcsSource") GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource) {
        this.dialogflowSource = dialogflowSource;
        this.gcsSource = gcsSource;
    }

    /**
     * The source when the conversation comes from Dialogflow.
     * 
    */
    public GoogleCloudContactcenterinsightsV1DialogflowSourceResponse getDialogflowSource() {
        return this.dialogflowSource;
    }
    /**
     * A Cloud Storage location specification for the audio and transcript.
     * 
    */
    public GoogleCloudContactcenterinsightsV1GcsSourceResponse getGcsSource() {
        return this.gcsSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource;
        private GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dialogflowSource = defaults.dialogflowSource;
    	      this.gcsSource = defaults.gcsSource;
        }

        public Builder dialogflowSource(GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource) {
            this.dialogflowSource = Objects.requireNonNull(dialogflowSource);
            return this;
        }
        public Builder gcsSource(GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource) {
            this.gcsSource = Objects.requireNonNull(gcsSource);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse(dialogflowSource, gcsSource);
        }
    }
}
