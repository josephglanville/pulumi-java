// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.providerhub.inputs.NotificationRegistrationPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationRegistrationArgs Empty = new NotificationRegistrationArgs();

    @InputImport(name="notificationRegistrationName")
    private final @Nullable Input<String> notificationRegistrationName;

    public Input<String> getNotificationRegistrationName() {
        return this.notificationRegistrationName == null ? Input.empty() : this.notificationRegistrationName;
    }

    @InputImport(name="properties")
    private final @Nullable Input<NotificationRegistrationPropertiesArgs> properties;

    public Input<NotificationRegistrationPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="providerNamespace", required=true)
    private final Input<String> providerNamespace;

    public Input<String> getProviderNamespace() {
        return this.providerNamespace;
    }

    public NotificationRegistrationArgs(
        @Nullable Input<String> notificationRegistrationName,
        @Nullable Input<NotificationRegistrationPropertiesArgs> properties,
        Input<String> providerNamespace) {
        this.notificationRegistrationName = notificationRegistrationName;
        this.properties = properties;
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
    }

    private NotificationRegistrationArgs() {
        this.notificationRegistrationName = Input.empty();
        this.properties = Input.empty();
        this.providerNamespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> notificationRegistrationName;
        private @Nullable Input<NotificationRegistrationPropertiesArgs> properties;
        private Input<String> providerNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationRegistrationName = defaults.notificationRegistrationName;
    	      this.properties = defaults.properties;
    	      this.providerNamespace = defaults.providerNamespace;
        }

        public Builder setNotificationRegistrationName(@Nullable Input<String> notificationRegistrationName) {
            this.notificationRegistrationName = notificationRegistrationName;
            return this;
        }

        public Builder setNotificationRegistrationName(@Nullable String notificationRegistrationName) {
            this.notificationRegistrationName = Input.ofNullable(notificationRegistrationName);
            return this;
        }

        public Builder setProperties(@Nullable Input<NotificationRegistrationPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable NotificationRegistrationPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setProviderNamespace(Input<String> providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Input.of(Objects.requireNonNull(providerNamespace));
            return this;
        }

        public NotificationRegistrationArgs build() {
            return new NotificationRegistrationArgs(notificationRegistrationName, properties, providerNamespace);
        }
    }
}
