// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sourcerepo.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRepositoryPubsubConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetRepositoryPubsubConfig Empty = new GetRepositoryPubsubConfig();

    @Import(name="messageFormat", required=true)
      private final String messageFormat;

    public String getMessageFormat() {
        return this.messageFormat;
    }

    @Import(name="serviceAccountEmail", required=true)
      private final String serviceAccountEmail;

    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    @Import(name="topic", required=true)
      private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public GetRepositoryPubsubConfig(
        String messageFormat,
        String serviceAccountEmail,
        String topic) {
        this.messageFormat = Objects.requireNonNull(messageFormat, "expected parameter 'messageFormat' to be non-null");
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private GetRepositoryPubsubConfig() {
        this.messageFormat = null;
        this.serviceAccountEmail = null;
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryPubsubConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFormat;
        private String serviceAccountEmail;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryPubsubConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.topic = defaults.topic;
        }

        public Builder messageFormat(String messageFormat) {
            this.messageFormat = Objects.requireNonNull(messageFormat);
            return this;
        }
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public GetRepositoryPubsubConfig build() {
            return new GetRepositoryPubsubConfig(messageFormat, serviceAccountEmail, topic);
        }
    }
}
