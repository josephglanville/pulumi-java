// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationChannelSensitiveLabelsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationChannelSensitiveLabelsGetArgs Empty = new NotificationChannelSensitiveLabelsGetArgs();

    /**
     * An authorization token for a notification channel. Channel types that support this field include: slack
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="authToken")
      private final @Nullable Output<String> authToken;

    public Output<String> getAuthToken() {
        return this.authToken == null ? Output.empty() : this.authToken;
    }

    /**
     * An password for a notification channel. Channel types that support this field include: webhook_basicauth
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * An servicekey token for a notification channel. Channel types that support this field include: pagerduty
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="serviceKey")
      private final @Nullable Output<String> serviceKey;

    public Output<String> getServiceKey() {
        return this.serviceKey == null ? Output.empty() : this.serviceKey;
    }

    public NotificationChannelSensitiveLabelsGetArgs(
        @Nullable Output<String> authToken,
        @Nullable Output<String> password,
        @Nullable Output<String> serviceKey) {
        this.authToken = authToken;
        this.password = password;
        this.serviceKey = serviceKey;
    }

    private NotificationChannelSensitiveLabelsGetArgs() {
        this.authToken = Output.empty();
        this.password = Output.empty();
        this.serviceKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelSensitiveLabelsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authToken;
        private @Nullable Output<String> password;
        private @Nullable Output<String> serviceKey;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelSensitiveLabelsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authToken = defaults.authToken;
    	      this.password = defaults.password;
    	      this.serviceKey = defaults.serviceKey;
        }

        public Builder authToken(@Nullable Output<String> authToken) {
            this.authToken = authToken;
            return this;
        }
        public Builder authToken(@Nullable String authToken) {
            this.authToken = Output.ofNullable(authToken);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder serviceKey(@Nullable Output<String> serviceKey) {
            this.serviceKey = serviceKey;
            return this;
        }
        public Builder serviceKey(@Nullable String serviceKey) {
            this.serviceKey = Output.ofNullable(serviceKey);
            return this;
        }        public NotificationChannelSensitiveLabelsGetArgs build() {
            return new NotificationChannelSensitiveLabelsGetArgs(authToken, password, serviceKey);
        }
    }
}
