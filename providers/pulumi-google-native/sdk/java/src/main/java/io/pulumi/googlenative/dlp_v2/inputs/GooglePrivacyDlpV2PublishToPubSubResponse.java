// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GooglePrivacyDlpV2PublishToPubSubResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2PublishToPubSubResponse Empty = new GooglePrivacyDlpV2PublishToPubSubResponse();

    @InputImport(name="topic", required=true)
    private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public GooglePrivacyDlpV2PublishToPubSubResponse(String topic) {
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private GooglePrivacyDlpV2PublishToPubSubResponse() {
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PublishToPubSubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PublishToPubSubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public GooglePrivacyDlpV2PublishToPubSubResponse build() {
            return new GooglePrivacyDlpV2PublishToPubSubResponse(topic);
        }
    }
}