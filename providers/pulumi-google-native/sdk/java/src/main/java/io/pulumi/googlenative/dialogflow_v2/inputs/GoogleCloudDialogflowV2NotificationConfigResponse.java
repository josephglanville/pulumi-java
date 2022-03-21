// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines notification behavior.
 * 
 */
public final class GoogleCloudDialogflowV2NotificationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2NotificationConfigResponse Empty = new GoogleCloudDialogflowV2NotificationConfigResponse();

    /**
     * Format of message.
     * 
     */
    @Import(name="messageFormat", required=true)
      private final String messageFormat;

    public String getMessageFormat() {
        return this.messageFormat;
    }

    /**
     * Name of the Pub/Sub topic to publish conversation events like CONVERSATION_STARTED as serialized ConversationEvent protos. Notification works for phone calls, if this topic either is in the same project as the conversation or you grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service Agent` role in the topic project. Format: `projects//locations//topics/`.
     * 
     */
    @Import(name="topic", required=true)
      private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public GoogleCloudDialogflowV2NotificationConfigResponse(
        String messageFormat,
        String topic) {
        this.messageFormat = Objects.requireNonNull(messageFormat, "expected parameter 'messageFormat' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private GoogleCloudDialogflowV2NotificationConfigResponse() {
        this.messageFormat = null;
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFormat;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.topic = defaults.topic;
        }

        public Builder messageFormat(String messageFormat) {
            this.messageFormat = Objects.requireNonNull(messageFormat);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public GoogleCloudDialogflowV2NotificationConfigResponse build() {
            return new GoogleCloudDialogflowV2NotificationConfigResponse(messageFormat, topic);
        }
    }
}
