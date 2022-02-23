// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.EncryptionPreferencesArgs;
import io.pulumi.azurenative.edgeorder.inputs.ManagementResourcePreferencesArgs;
import io.pulumi.azurenative.edgeorder.inputs.NotificationPreferenceArgs;
import io.pulumi.azurenative.edgeorder.inputs.TransportPreferencesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Preferences related to the order
 * 
 */
public final class PreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreferencesArgs Empty = new PreferencesArgs();

    /**
     * Preferences related to the Encryption.
     * 
     */
    @InputImport(name="encryptionPreferences")
      private final @Nullable Input<EncryptionPreferencesArgs> encryptionPreferences;

    public Input<EncryptionPreferencesArgs> getEncryptionPreferences() {
        return this.encryptionPreferences == null ? Input.empty() : this.encryptionPreferences;
    }

    /**
     * Preferences related to the Management resource.
     * 
     */
    @InputImport(name="managementResourcePreferences")
      private final @Nullable Input<ManagementResourcePreferencesArgs> managementResourcePreferences;

    public Input<ManagementResourcePreferencesArgs> getManagementResourcePreferences() {
        return this.managementResourcePreferences == null ? Input.empty() : this.managementResourcePreferences;
    }

    /**
     * Notification preferences.
     * 
     */
    @InputImport(name="notificationPreferences")
      private final @Nullable Input<List<NotificationPreferenceArgs>> notificationPreferences;

    public Input<List<NotificationPreferenceArgs>> getNotificationPreferences() {
        return this.notificationPreferences == null ? Input.empty() : this.notificationPreferences;
    }

    /**
     * Preferences related to the shipment logistics of the order.
     * 
     */
    @InputImport(name="transportPreferences")
      private final @Nullable Input<TransportPreferencesArgs> transportPreferences;

    public Input<TransportPreferencesArgs> getTransportPreferences() {
        return this.transportPreferences == null ? Input.empty() : this.transportPreferences;
    }

    public PreferencesArgs(
        @Nullable Input<EncryptionPreferencesArgs> encryptionPreferences,
        @Nullable Input<ManagementResourcePreferencesArgs> managementResourcePreferences,
        @Nullable Input<List<NotificationPreferenceArgs>> notificationPreferences,
        @Nullable Input<TransportPreferencesArgs> transportPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        this.managementResourcePreferences = managementResourcePreferences;
        this.notificationPreferences = notificationPreferences;
        this.transportPreferences = transportPreferences;
    }

    private PreferencesArgs() {
        this.encryptionPreferences = Input.empty();
        this.managementResourcePreferences = Input.empty();
        this.notificationPreferences = Input.empty();
        this.transportPreferences = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EncryptionPreferencesArgs> encryptionPreferences;
        private @Nullable Input<ManagementResourcePreferencesArgs> managementResourcePreferences;
        private @Nullable Input<List<NotificationPreferenceArgs>> notificationPreferences;
        private @Nullable Input<TransportPreferencesArgs> transportPreferences;

        public Builder() {
    	      // Empty
        }

        public Builder(PreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionPreferences = defaults.encryptionPreferences;
    	      this.managementResourcePreferences = defaults.managementResourcePreferences;
    	      this.notificationPreferences = defaults.notificationPreferences;
    	      this.transportPreferences = defaults.transportPreferences;
        }

        public Builder setEncryptionPreferences(@Nullable Input<EncryptionPreferencesArgs> encryptionPreferences) {
            this.encryptionPreferences = encryptionPreferences;
            return this;
        }

        public Builder setEncryptionPreferences(@Nullable EncryptionPreferencesArgs encryptionPreferences) {
            this.encryptionPreferences = Input.ofNullable(encryptionPreferences);
            return this;
        }

        public Builder setManagementResourcePreferences(@Nullable Input<ManagementResourcePreferencesArgs> managementResourcePreferences) {
            this.managementResourcePreferences = managementResourcePreferences;
            return this;
        }

        public Builder setManagementResourcePreferences(@Nullable ManagementResourcePreferencesArgs managementResourcePreferences) {
            this.managementResourcePreferences = Input.ofNullable(managementResourcePreferences);
            return this;
        }

        public Builder setNotificationPreferences(@Nullable Input<List<NotificationPreferenceArgs>> notificationPreferences) {
            this.notificationPreferences = notificationPreferences;
            return this;
        }

        public Builder setNotificationPreferences(@Nullable List<NotificationPreferenceArgs> notificationPreferences) {
            this.notificationPreferences = Input.ofNullable(notificationPreferences);
            return this;
        }

        public Builder setTransportPreferences(@Nullable Input<TransportPreferencesArgs> transportPreferences) {
            this.transportPreferences = transportPreferences;
            return this;
        }

        public Builder setTransportPreferences(@Nullable TransportPreferencesArgs transportPreferences) {
            this.transportPreferences = Input.ofNullable(transportPreferences);
            return this;
        }
        public PreferencesArgs build() {
            return new PreferencesArgs(encryptionPreferences, managementResourcePreferences, notificationPreferences, transportPreferences);
        }
    }
}
