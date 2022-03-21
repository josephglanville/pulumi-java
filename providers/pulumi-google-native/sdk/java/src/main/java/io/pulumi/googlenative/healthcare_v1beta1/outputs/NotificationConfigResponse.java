// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationConfigResponse {
    /**
     * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. PubsubMessage.Data contains the resource name. PubsubMessage.MessageId is the ID of this message. It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message was published. Notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud Healthcare API service account must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can't be published to Pub/Sub, errors are logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). If the number of errors exceeds a certain rate, some aren't submitted. Note that not all operations trigger notifications, see [Configuring Pub/Sub notifications](https://cloud.google.com/healthcare/docs/how-tos/pubsub) for specific details.
     * 
     */
    private final String pubsubTopic;
    /**
     * Indicates whether or not to send Pub/Sub notifications on bulk import. Only supported for DICOM imports.
     * 
     */
    private final Boolean sendForBulkImport;

    @CustomType.Constructor
    private NotificationConfigResponse(
        @CustomType.Parameter("pubsubTopic") String pubsubTopic,
        @CustomType.Parameter("sendForBulkImport") Boolean sendForBulkImport) {
        this.pubsubTopic = pubsubTopic;
        this.sendForBulkImport = sendForBulkImport;
    }

    /**
     * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. PubsubMessage.Data contains the resource name. PubsubMessage.MessageId is the ID of this message. It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message was published. Notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud Healthcare API service account must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can't be published to Pub/Sub, errors are logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). If the number of errors exceeds a certain rate, some aren't submitted. Note that not all operations trigger notifications, see [Configuring Pub/Sub notifications](https://cloud.google.com/healthcare/docs/how-tos/pubsub) for specific details.
     * 
    */
    public String getPubsubTopic() {
        return this.pubsubTopic;
    }
    /**
     * Indicates whether or not to send Pub/Sub notifications on bulk import. Only supported for DICOM imports.
     * 
    */
    public Boolean getSendForBulkImport() {
        return this.sendForBulkImport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pubsubTopic;
        private Boolean sendForBulkImport;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.sendForBulkImport = defaults.sendForBulkImport;
        }

        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public Builder sendForBulkImport(Boolean sendForBulkImport) {
            this.sendForBulkImport = Objects.requireNonNull(sendForBulkImport);
            return this;
        }        public NotificationConfigResponse build() {
            return new NotificationConfigResponse(pubsubTopic, sendForBulkImport);
        }
    }
}
