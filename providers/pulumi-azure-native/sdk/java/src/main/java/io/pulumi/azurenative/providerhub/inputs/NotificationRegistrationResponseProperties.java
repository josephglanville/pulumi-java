// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.NotificationEndpointResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRegistrationResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final NotificationRegistrationResponseProperties Empty = new NotificationRegistrationResponseProperties();

    @InputImport(name="includedEvents")
    private final @Nullable List<String> includedEvents;

    public List<String> getIncludedEvents() {
        return this.includedEvents == null ? List.of() : this.includedEvents;
    }

    @InputImport(name="messageScope")
    private final @Nullable String messageScope;

    public Optional<String> getMessageScope() {
        return this.messageScope == null ? Optional.empty() : Optional.ofNullable(this.messageScope);
    }

    @InputImport(name="notificationEndpoints")
    private final @Nullable List<NotificationEndpointResponse> notificationEndpoints;

    public List<NotificationEndpointResponse> getNotificationEndpoints() {
        return this.notificationEndpoints == null ? List.of() : this.notificationEndpoints;
    }

    @InputImport(name="notificationMode")
    private final @Nullable String notificationMode;

    public Optional<String> getNotificationMode() {
        return this.notificationMode == null ? Optional.empty() : Optional.ofNullable(this.notificationMode);
    }

    @InputImport(name="provisioningState")
    private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    public NotificationRegistrationResponseProperties(
        @Nullable List<String> includedEvents,
        @Nullable String messageScope,
        @Nullable List<NotificationEndpointResponse> notificationEndpoints,
        @Nullable String notificationMode,
        @Nullable String provisioningState) {
        this.includedEvents = includedEvents;
        this.messageScope = messageScope;
        this.notificationEndpoints = notificationEndpoints;
        this.notificationMode = notificationMode;
        this.provisioningState = provisioningState;
    }

    private NotificationRegistrationResponseProperties() {
        this.includedEvents = List.of();
        this.messageScope = null;
        this.notificationEndpoints = List.of();
        this.notificationMode = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRegistrationResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> includedEvents;
        private @Nullable String messageScope;
        private @Nullable List<NotificationEndpointResponse> notificationEndpoints;
        private @Nullable String notificationMode;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRegistrationResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedEvents = defaults.includedEvents;
    	      this.messageScope = defaults.messageScope;
    	      this.notificationEndpoints = defaults.notificationEndpoints;
    	      this.notificationMode = defaults.notificationMode;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setIncludedEvents(@Nullable List<String> includedEvents) {
            this.includedEvents = includedEvents;
            return this;
        }

        public Builder setMessageScope(@Nullable String messageScope) {
            this.messageScope = messageScope;
            return this;
        }

        public Builder setNotificationEndpoints(@Nullable List<NotificationEndpointResponse> notificationEndpoints) {
            this.notificationEndpoints = notificationEndpoints;
            return this;
        }

        public Builder setNotificationMode(@Nullable String notificationMode) {
            this.notificationMode = notificationMode;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public NotificationRegistrationResponseProperties build() {
            return new NotificationRegistrationResponseProperties(includedEvents, messageScope, notificationEndpoints, notificationMode, provisioningState);
        }
    }
}
