// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationArgs Empty = new NotificationArgs();

    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription.
     * 
     */
    @Import(name="customAttributes")
      private final @Nullable Output<Map<String,String>> customAttributes;

    public Output<Map<String,String>> getCustomAttributes() {
        return this.customAttributes == null ? Output.empty() : this.customAttributes;
    }

    /**
     * HTTP 1.1 Entity tag for this subscription notification.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * If present, only send notifications about listed event types. If empty, sent notifications for all event types.
     * 
     */
    @Import(name="eventTypes")
      private final @Nullable Output<List<String>> eventTypes;

    public Output<List<String>> getEventTypes() {
        return this.eventTypes == null ? Output.empty() : this.eventTypes;
    }

    /**
     * The ID of the notification.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The kind of item this is. For notifications, this is always storage#notification.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * If present, only apply this notification configuration to object names that begin with this prefix.
     * 
     */
    @Import(name="objectNamePrefix")
      private final @Nullable Output<String> objectNamePrefix;

    public Output<String> getObjectNamePrefix() {
        return this.objectNamePrefix == null ? Output.empty() : this.objectNamePrefix;
    }

    /**
     * The desired content of the Payload.
     * 
     */
    @Import(name="payloadFormat")
      private final @Nullable Output<String> payloadFormat;

    public Output<String> getPayloadFormat() {
        return this.payloadFormat == null ? Output.empty() : this.payloadFormat;
    }

    @Import(name="provisionalUserProject")
      private final @Nullable Output<String> provisionalUserProject;

    public Output<String> getProvisionalUserProject() {
        return this.provisionalUserProject == null ? Output.empty() : this.provisionalUserProject;
    }

    /**
     * The canonical URL of this notification.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * The Cloud PubSub topic to which this subscription publishes. Formatted as: '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}'
     * 
     */
    @Import(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> getTopic() {
        return this.topic == null ? Output.empty() : this.topic;
    }

    @Import(name="userProject")
      private final @Nullable Output<String> userProject;

    public Output<String> getUserProject() {
        return this.userProject == null ? Output.empty() : this.userProject;
    }

    public NotificationArgs(
        Output<String> bucket,
        @Nullable Output<Map<String,String>> customAttributes,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> eventTypes,
        @Nullable Output<String> id,
        @Nullable Output<String> kind,
        @Nullable Output<String> objectNamePrefix,
        @Nullable Output<String> payloadFormat,
        @Nullable Output<String> provisionalUserProject,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> topic,
        @Nullable Output<String> userProject) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.customAttributes = customAttributes;
        this.etag = etag;
        this.eventTypes = eventTypes;
        this.id = id;
        this.kind = kind;
        this.objectNamePrefix = objectNamePrefix;
        this.payloadFormat = payloadFormat;
        this.provisionalUserProject = provisionalUserProject;
        this.selfLink = selfLink;
        this.topic = topic;
        this.userProject = userProject;
    }

    private NotificationArgs() {
        this.bucket = Output.empty();
        this.customAttributes = Output.empty();
        this.etag = Output.empty();
        this.eventTypes = Output.empty();
        this.id = Output.empty();
        this.kind = Output.empty();
        this.objectNamePrefix = Output.empty();
        this.payloadFormat = Output.empty();
        this.provisionalUserProject = Output.empty();
        this.selfLink = Output.empty();
        this.topic = Output.empty();
        this.userProject = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<Map<String,String>> customAttributes;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> eventTypes;
        private @Nullable Output<String> id;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> objectNamePrefix;
        private @Nullable Output<String> payloadFormat;
        private @Nullable Output<String> provisionalUserProject;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> topic;
        private @Nullable Output<String> userProject;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.customAttributes = defaults.customAttributes;
    	      this.etag = defaults.etag;
    	      this.eventTypes = defaults.eventTypes;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.objectNamePrefix = defaults.objectNamePrefix;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.provisionalUserProject = defaults.provisionalUserProject;
    	      this.selfLink = defaults.selfLink;
    	      this.topic = defaults.topic;
    	      this.userProject = defaults.userProject;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder customAttributes(@Nullable Output<Map<String,String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public Builder customAttributes(@Nullable Map<String,String> customAttributes) {
            this.customAttributes = Output.ofNullable(customAttributes);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder eventTypes(@Nullable Output<List<String>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public Builder eventTypes(@Nullable List<String> eventTypes) {
            this.eventTypes = Output.ofNullable(eventTypes);
            return this;
        }
        public Builder eventTypes(String... eventTypes) {
            return eventTypes(List.of(eventTypes));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder objectNamePrefix(@Nullable Output<String> objectNamePrefix) {
            this.objectNamePrefix = objectNamePrefix;
            return this;
        }
        public Builder objectNamePrefix(@Nullable String objectNamePrefix) {
            this.objectNamePrefix = Output.ofNullable(objectNamePrefix);
            return this;
        }
        public Builder payloadFormat(@Nullable Output<String> payloadFormat) {
            this.payloadFormat = payloadFormat;
            return this;
        }
        public Builder payloadFormat(@Nullable String payloadFormat) {
            this.payloadFormat = Output.ofNullable(payloadFormat);
            return this;
        }
        public Builder provisionalUserProject(@Nullable Output<String> provisionalUserProject) {
            this.provisionalUserProject = provisionalUserProject;
            return this;
        }
        public Builder provisionalUserProject(@Nullable String provisionalUserProject) {
            this.provisionalUserProject = Output.ofNullable(provisionalUserProject);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }
        public Builder topic(@Nullable String topic) {
            this.topic = Output.ofNullable(topic);
            return this;
        }
        public Builder userProject(@Nullable Output<String> userProject) {
            this.userProject = userProject;
            return this;
        }
        public Builder userProject(@Nullable String userProject) {
            this.userProject = Output.ofNullable(userProject);
            return this;
        }        public NotificationArgs build() {
            return new NotificationArgs(bucket, customAttributes, etag, eventTypes, id, kind, objectNamePrefix, payloadFormat, provisionalUserProject, selfLink, topic, userProject);
        }
    }
}
