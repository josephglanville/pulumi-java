// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse {
    /**
     * Predefined client side actions that user can choose
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action;
    /**
     * Predefined replies for user to select instead of typing
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse(
        @CustomType.Parameter("action") GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action,
        @CustomType.Parameter("reply") GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply) {
        this.action = action;
        this.reply = reply;
    }

    /**
     * Predefined client side actions that user can choose
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse getAction() {
        return this.action;
    }
    /**
     * Predefined replies for user to select instead of typing
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse getReply() {
        return this.reply;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.reply = defaults.reply;
        }

        public Builder action(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder reply(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply) {
            this.reply = Objects.requireNonNull(reply);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse(action, reply);
        }
    }
}
