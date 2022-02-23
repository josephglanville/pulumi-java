// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub GcmCredential.
 * 
 */
public final class GcmCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final GcmCredentialResponse Empty = new GcmCredentialResponse();

    /**
     * The FCM legacy endpoint. Default value is 'https://fcm.googleapis.com/fcm/send'
     * 
     */
    @InputImport(name="gcmEndpoint")
      private final @Nullable String gcmEndpoint;

    public Optional<String> getGcmEndpoint() {
        return this.gcmEndpoint == null ? Optional.empty() : Optional.ofNullable(this.gcmEndpoint);
    }

    /**
     * The Google API key.
     * 
     */
    @InputImport(name="googleApiKey")
      private final @Nullable String googleApiKey;

    public Optional<String> getGoogleApiKey() {
        return this.googleApiKey == null ? Optional.empty() : Optional.ofNullable(this.googleApiKey);
    }

    public GcmCredentialResponse(
        @Nullable String gcmEndpoint,
        @Nullable String googleApiKey) {
        this.gcmEndpoint = gcmEndpoint;
        this.googleApiKey = googleApiKey;
    }

    private GcmCredentialResponse() {
        this.gcmEndpoint = null;
        this.googleApiKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcmCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gcmEndpoint;
        private @Nullable String googleApiKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GcmCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcmEndpoint = defaults.gcmEndpoint;
    	      this.googleApiKey = defaults.googleApiKey;
        }

        public Builder setGcmEndpoint(@Nullable String gcmEndpoint) {
            this.gcmEndpoint = gcmEndpoint;
            return this;
        }

        public Builder setGoogleApiKey(@Nullable String googleApiKey) {
            this.googleApiKey = googleApiKey;
            return this;
        }
        public GcmCredentialResponse build() {
            return new GcmCredentialResponse(gcmEndpoint, googleApiKey);
        }
    }
}
