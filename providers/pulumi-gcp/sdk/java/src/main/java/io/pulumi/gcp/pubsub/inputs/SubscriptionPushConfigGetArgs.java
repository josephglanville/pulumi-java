// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionPushConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionPushConfigGetArgs Empty = new SubscriptionPushConfigGetArgs();

    /**
     * Endpoint configuration attributes.
     * Every endpoint has a set of API supported attributes that can
     * be used to control different aspects of the message delivery.
     * The currently supported attribute is x-goog-version, which you
     * can use to change the format of the pushed message. This
     * attribute indicates the version of the data expected by
     * the endpoint. This controls the shape of the pushed message
     * (i.e., its fields and metadata). The endpoint version is
     * based on the version of the Pub/Sub API.
     * If not present during the subscriptions.create call,
     * it will default to the version of the API used to make
     * such call. If not present during a subscriptions.modifyPushConfig
     * call, its value will not be changed. subscriptions.get
     * calls will always return a valid version, even if the
     * subscription was created without this attribute.
     * The possible values for this attribute are:
     * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
     * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
     * 
     */
    @InputImport(name="attributes")
      private final @Nullable Input<Map<String,String>> attributes;

    public Input<Map<String,String>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    @InputImport(name="oidcToken")
      private final @Nullable Input<SubscriptionPushConfigOidcTokenGetArgs> oidcToken;

    public Input<SubscriptionPushConfigOidcTokenGetArgs> getOidcToken() {
        return this.oidcToken == null ? Input.empty() : this.oidcToken;
    }

    /**
     * A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * "https://example.com/push".
     * 
     */
    @InputImport(name="pushEndpoint", required=true)
      private final Input<String> pushEndpoint;

    public Input<String> getPushEndpoint() {
        return this.pushEndpoint;
    }

    public SubscriptionPushConfigGetArgs(
        @Nullable Input<Map<String,String>> attributes,
        @Nullable Input<SubscriptionPushConfigOidcTokenGetArgs> oidcToken,
        Input<String> pushEndpoint) {
        this.attributes = attributes;
        this.oidcToken = oidcToken;
        this.pushEndpoint = Objects.requireNonNull(pushEndpoint, "expected parameter 'pushEndpoint' to be non-null");
    }

    private SubscriptionPushConfigGetArgs() {
        this.attributes = Input.empty();
        this.oidcToken = Input.empty();
        this.pushEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPushConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributes;
        private @Nullable Input<SubscriptionPushConfigOidcTokenGetArgs> oidcToken;
        private Input<String> pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionPushConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder setAttributes(@Nullable Input<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setOidcToken(@Nullable Input<SubscriptionPushConfigOidcTokenGetArgs> oidcToken) {
            this.oidcToken = oidcToken;
            return this;
        }

        public Builder setOidcToken(@Nullable SubscriptionPushConfigOidcTokenGetArgs oidcToken) {
            this.oidcToken = Input.ofNullable(oidcToken);
            return this;
        }

        public Builder setPushEndpoint(Input<String> pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }

        public Builder setPushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Input.of(Objects.requireNonNull(pushEndpoint));
            return this;
        }
        public SubscriptionPushConfigGetArgs build() {
            return new SubscriptionPushConfigGetArgs(attributes, oidcToken, pushEndpoint);
        }
    }
}
