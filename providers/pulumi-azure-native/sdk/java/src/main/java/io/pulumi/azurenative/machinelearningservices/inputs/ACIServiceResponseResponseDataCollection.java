// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the data collection options specified.
 * 
 */
public final class ACIServiceResponseResponseDataCollection extends io.pulumi.resources.InvokeArgs {

    public static final ACIServiceResponseResponseDataCollection Empty = new ACIServiceResponseResponseDataCollection();

    /**
     * Option for enabling/disabling Event Hub.
     * 
     */
    @InputImport(name="eventHubEnabled")
      private final @Nullable Boolean eventHubEnabled;

    public Optional<Boolean> getEventHubEnabled() {
        return this.eventHubEnabled == null ? Optional.empty() : Optional.ofNullable(this.eventHubEnabled);
    }

    /**
     * Option for enabling/disabling storage.
     * 
     */
    @InputImport(name="storageEnabled")
      private final @Nullable Boolean storageEnabled;

    public Optional<Boolean> getStorageEnabled() {
        return this.storageEnabled == null ? Optional.empty() : Optional.ofNullable(this.storageEnabled);
    }

    public ACIServiceResponseResponseDataCollection(
        @Nullable Boolean eventHubEnabled,
        @Nullable Boolean storageEnabled) {
        this.eventHubEnabled = eventHubEnabled;
        this.storageEnabled = storageEnabled;
    }

    private ACIServiceResponseResponseDataCollection() {
        this.eventHubEnabled = null;
        this.storageEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceResponseResponseDataCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean eventHubEnabled;
        private @Nullable Boolean storageEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceResponseResponseDataCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubEnabled = defaults.eventHubEnabled;
    	      this.storageEnabled = defaults.storageEnabled;
        }

        public Builder setEventHubEnabled(@Nullable Boolean eventHubEnabled) {
            this.eventHubEnabled = eventHubEnabled;
            return this;
        }

        public Builder setStorageEnabled(@Nullable Boolean storageEnabled) {
            this.storageEnabled = storageEnabled;
            return this;
        }
        public ACIServiceResponseResponseDataCollection build() {
            return new ACIServiceResponseResponseDataCollection(eventHubEnabled, storageEnabled);
        }
    }
}
