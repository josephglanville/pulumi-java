// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.EncryptionPreferencesArgs;
import io.pulumi.azurenative.databox.inputs.TransportPreferencesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
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
    @Import(name="encryptionPreferences")
      private final @Nullable Output<EncryptionPreferencesArgs> encryptionPreferences;

    public Output<EncryptionPreferencesArgs> getEncryptionPreferences() {
        return this.encryptionPreferences == null ? Output.empty() : this.encryptionPreferences;
    }

    /**
     * Preferred data center region.
     * 
     */
    @Import(name="preferredDataCenterRegion")
      private final @Nullable Output<List<String>> preferredDataCenterRegion;

    public Output<List<String>> getPreferredDataCenterRegion() {
        return this.preferredDataCenterRegion == null ? Output.empty() : this.preferredDataCenterRegion;
    }

    /**
     * Preferences related to the shipment logistics of the sku.
     * 
     */
    @Import(name="transportPreferences")
      private final @Nullable Output<TransportPreferencesArgs> transportPreferences;

    public Output<TransportPreferencesArgs> getTransportPreferences() {
        return this.transportPreferences == null ? Output.empty() : this.transportPreferences;
    }

    public PreferencesArgs(
        @Nullable Output<EncryptionPreferencesArgs> encryptionPreferences,
        @Nullable Output<List<String>> preferredDataCenterRegion,
        @Nullable Output<TransportPreferencesArgs> transportPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        this.preferredDataCenterRegion = preferredDataCenterRegion;
        this.transportPreferences = transportPreferences;
    }

    private PreferencesArgs() {
        this.encryptionPreferences = Output.empty();
        this.preferredDataCenterRegion = Output.empty();
        this.transportPreferences = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EncryptionPreferencesArgs> encryptionPreferences;
        private @Nullable Output<List<String>> preferredDataCenterRegion;
        private @Nullable Output<TransportPreferencesArgs> transportPreferences;

        public Builder() {
    	      // Empty
        }

        public Builder(PreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionPreferences = defaults.encryptionPreferences;
    	      this.preferredDataCenterRegion = defaults.preferredDataCenterRegion;
    	      this.transportPreferences = defaults.transportPreferences;
        }

        public Builder encryptionPreferences(@Nullable Output<EncryptionPreferencesArgs> encryptionPreferences) {
            this.encryptionPreferences = encryptionPreferences;
            return this;
        }
        public Builder encryptionPreferences(@Nullable EncryptionPreferencesArgs encryptionPreferences) {
            this.encryptionPreferences = Output.ofNullable(encryptionPreferences);
            return this;
        }
        public Builder preferredDataCenterRegion(@Nullable Output<List<String>> preferredDataCenterRegion) {
            this.preferredDataCenterRegion = preferredDataCenterRegion;
            return this;
        }
        public Builder preferredDataCenterRegion(@Nullable List<String> preferredDataCenterRegion) {
            this.preferredDataCenterRegion = Output.ofNullable(preferredDataCenterRegion);
            return this;
        }
        public Builder preferredDataCenterRegion(String... preferredDataCenterRegion) {
            return preferredDataCenterRegion(List.of(preferredDataCenterRegion));
        }
        public Builder transportPreferences(@Nullable Output<TransportPreferencesArgs> transportPreferences) {
            this.transportPreferences = transportPreferences;
            return this;
        }
        public Builder transportPreferences(@Nullable TransportPreferencesArgs transportPreferences) {
            this.transportPreferences = Output.ofNullable(transportPreferences);
            return this;
        }        public PreferencesArgs build() {
            return new PreferencesArgs(encryptionPreferences, preferredDataCenterRegion, transportPreferences);
        }
    }
}
