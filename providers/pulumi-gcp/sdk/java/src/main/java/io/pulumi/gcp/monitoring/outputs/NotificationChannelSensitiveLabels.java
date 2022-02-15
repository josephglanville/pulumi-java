// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationChannelSensitiveLabels {
    private final @Nullable String authToken;
    private final @Nullable String password;
    private final @Nullable String serviceKey;

    @OutputCustomType.Constructor({"authToken","password","serviceKey"})
    private NotificationChannelSensitiveLabels(
        @Nullable String authToken,
        @Nullable String password,
        @Nullable String serviceKey) {
        this.authToken = authToken;
        this.password = password;
        this.serviceKey = serviceKey;
    }

    public Optional<String> getAuthToken() {
        return Optional.ofNullable(this.authToken);
    }
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> getServiceKey() {
        return Optional.ofNullable(this.serviceKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelSensitiveLabels defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authToken;
        private @Nullable String password;
        private @Nullable String serviceKey;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelSensitiveLabels defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authToken = defaults.authToken;
    	      this.password = defaults.password;
    	      this.serviceKey = defaults.serviceKey;
        }

        public Builder setAuthToken(@Nullable String authToken) {
            this.authToken = authToken;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setServiceKey(@Nullable String serviceKey) {
            this.serviceKey = serviceKey;
            return this;
        }

        public NotificationChannelSensitiveLabels build() {
            return new NotificationChannelSensitiveLabels(authToken, password, serviceKey);
        }
    }
}